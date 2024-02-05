package com.zetcode

@Grab(group='net.sf.jasperreports', module='jasperreports', version='6.20.1')
@Grab(group='org.apache.commons', module='commons-math3', version='3.6.1')

import java.util.List
import net.sf.jasperreports.engine.JRDefaultScriptlet
import net.sf.jasperreports.engine.JREmptyDataSource
import net.sf.jasperreports.engine.JasperCompileManager
import net.sf.jasperreports.engine.JasperExportManager
import net.sf.jasperreports.engine.JasperFillManager
import net.sf.jasperreports.renderers.JCommonDrawableRendererImpl

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics

// Report generation

def xmlFile = "report.xml"
def jrReport = JasperCompileManager.compileReport(xmlFile)

def vals = [1.2, 1.8, -1.2, 0.9, 1.1, 3.5, -2.7]

def params = [:]
params.put("vals", vals)

def jrPrint = JasperFillManager.fillReport(jrReport,
        params, new JREmptyDataSource())

JasperExportManager.exportReportToPdfFile(jrPrint, "report.pdf")

// Scriptlet class

class MyScriptlet extends JRDefaultScriptlet {

    private DescriptiveStatistics stats

    void afterReportInit() {

        def vals = getParameterValue("vals")
        stats = new DescriptiveStatistics()

        vals.forEach((val) -> stats.addValue(val))
    }

    void afterDetailEval() {
        setVariableValue("gmean", stats.getMean())
    }
}

