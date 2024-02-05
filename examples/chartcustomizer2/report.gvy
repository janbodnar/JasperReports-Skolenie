package com.zetcode

@Grab(group='net.sf.jasperreports', module='jasperreports', version='6.20.1')

import net.sf.jasperreports.engine.JasperCompileManager
import net.sf.jasperreports.engine.JasperExportManager
import net.sf.jasperreports.engine.JasperFillManager
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource
import groovy.transform.Immutable

import net.sf.jasperreports.engine.JRChart
import net.sf.jasperreports.engine.JRChartCustomizer
import org.jfree.chart.JFreeChart

import java.awt.geom.Ellipse2D
import java.awt.Color

// Report generation

def xmlFile = "report.xml"
def jrReport = JasperCompileManager.compileReport(xmlFile)

@Immutable
class Temp {
    long id;
    String date;
    double val;
}

def data = [
    new Temp(1L, "Jan 1", -7.3),
    new Temp(2L, "Jan 10", -3.4),
    new Temp(3L, "Jan 12", -5.0),
    new Temp(4L, "Jan 20", -0.9),
    new Temp(5L, "Jan 30", -2.2),
    new Temp(6L, "Feb 1", 4.8),
    new Temp(7L, "Feb 2", 5.1),
    new Temp(9L, "Feb 5", -1.9),
    new Temp(10L, "Feb 8", 0),
    new Temp(11L, "Feb 12", 2.6)
]

def ds = new JRBeanCollectionDataSource(data)

def params = [:]
params.put("data", data)

def jPrint = JasperFillManager.fillReport(jrReport, params, ds)

JasperExportManager.exportReportToPdfFile(jPrint, "report.pdf")

// Chart customizer

class ScatterChartCustomizer implements JRChartCustomizer {

    void customize(JFreeChart chart, JRChart jasperChart) {

        def xyPlot = chart.getXYPlot()
        def xyItemRenderer = xyPlot.getRenderer()

        def shape = new Ellipse2D.Double(0, 0, 8, 8)

        xyItemRenderer.setSeriesShape(0, shape)
        xyItemRenderer.setSeriesPaint(0, new Color(0, 124, 156))

        xyPlot.setDomainGridlinesVisible(false)
        xyPlot.setRangeGridlinesVisible(false)
    }
}

