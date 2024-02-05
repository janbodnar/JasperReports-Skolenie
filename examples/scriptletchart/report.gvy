package com.zetcode

@Grab(group='net.sf.jasperreports', module='jasperreports', version='6.20.1')

import net.sf.jasperreports.engine.JREmptyDataSource
import net.sf.jasperreports.engine.JRException
import net.sf.jasperreports.engine.JasperCompileManager
import net.sf.jasperreports.engine.JasperExportManager
import net.sf.jasperreports.engine.JasperFillManager
import net.sf.jasperreports.engine.JRDefaultScriptlet
import net.sf.jasperreports.renderers.JCommonDrawableRendererImpl

import org.jfree.chart.ChartFactory
import org.jfree.data.general.DefaultPieDataset
import org.jfree.util.Rotation

// Report generation

def xmlFile = "report.xml"
def jrReport = JasperCompileManager.compileReport(xmlFile)

def langs = [ "Python": 30.2, "C#": 10.0, "Java": 17.5, 
    "PHP": 8.5, "Clojure": 1.1]

def params = ["langs": langs]

def jrPrint = JasperFillManager.fillReport(jrReport,
        params, new JREmptyDataSource())

JasperExportManager.exportReportToPdfFile(jrPrint, "report.pdf")

// Scriptlet class

class MyScriptlet extends JRDefaultScriptlet {

    void afterReportInit() {

        def langs = getParameterValue("langs")
        def dataset = new DefaultPieDataset()

        langs.forEach(dataset::setValue)

        def chart = ChartFactory.createPieChart3D(
                "Computer languages",
                dataset,
                true,
                true,
                false
        )

        def plot = chart.getPlot()

        plot.setStartAngle(290)
        plot.setDirection(Rotation.CLOCKWISE)
        plot.setForegroundAlpha(0.5f)
        plot.setNoDataMessage("No data to display")

        this.setVariableValue("Chart", new JCommonDrawableRendererImpl(chart))
    }
}
