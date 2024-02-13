package com.zetcode 

@Grab(group='net.sf.jasperreports', module='jasperreports', version='6.21.0')
@Grab(group='com.github.librepdf', module='openpdf', version='1.3.39')
@Grab('org.jfree:jfreechart:1.5.3')

import net.sf.jasperreports.engine.JasperCompileManager
import net.sf.jasperreports.engine.JasperFillManager
import net.sf.jasperreports.engine.JasperExportManager
import net.sf.jasperreports.engine.JREmptyDataSource

import org.jfree.chart.ChartFactory
import org.jfree.chart.ChartPanel
import org.jfree.chart.JFreeChart
import org.jfree.chart.plot.PlotOrientation
import org.jfree.chart.plot.XYPlot
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer
import org.jfree.data.category.DefaultCategoryDataset
import org.jfree.chart.ChartUtils


// Generate chart

def getChart() {

    def dataset = createDataset()
    return createChart(dataset)
}

def createDataset() {

    def dataset = new DefaultCategoryDataset()

    dataset.addValue(212, "Classes", "JDK 1.0")
    dataset.addValue(504, "Classes", "JDK 1.1")
    dataset.addValue(1520, "Classes", "SDK 1.2")
    dataset.addValue(1842, "Classes", "SDK 1.3")
    dataset.addValue(2991, "Classes", "SDK 1.4")

    return dataset
}

def createChart(dataset){

    def chart = ChartFactory.createLineChart(
        "Java Standard Class Library", // chart title
        "Release", // domain axis label
        "Class Count", // range axis label
        dataset, // data
        PlotOrientation.VERTICAL, // orientation
        false, // include legend
        true, // tooltips
        false // urls
        )
    
    return chart
}

def chart = getChart()
ChartUtils.saveChartAsPNG(new File("mychart.png"), chart, 450, 400)


// Generate report

def xmlFile = 'report.xml'
def jrReport = JasperCompileManager.compileReport(xmlFile)

def params = [:]
def jrPrint = JasperFillManager.fillReport(jrReport, params, 
    new JREmptyDataSource())

JasperExportManager.exportReportToPdfFile(jrPrint, 'report.pdf')
