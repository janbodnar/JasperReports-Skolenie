package com.zetcode

@Grab(group='net.sf.jasperreports', module='jasperreports', version='6.17.0')

import net.sf.jasperreports.engine.JRDefaultScriptlet
import net.sf.jasperreports.engine.JasperCompileManager
import net.sf.jasperreports.engine.JasperExportManager
import net.sf.jasperreports.engine.JasperFillManager
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource
import groovy.transform.Immutable

import net.sf.jasperreports.engine.JRChart
import net.sf.jasperreports.engine.JRChartCustomizer
import org.jfree.chart.JFreeChart

import java.awt.Font

// Report generation

def xmlFile = "report.xml"
def jrReport = JasperCompileManager.compileReport(xmlFile)

@Immutable
class Car {
    Long id;
    String name;
    int price;
}

def cars = [
    new Car(1L, 'Audi', 52642),
    new Car(2L, 'Mercedes', 57127),
    new Car(3L, 'Skoda', 9000),
    new Car(4L, 'Volvo', 29000),
    new Car(5L, 'Bentley', 350000),
    new Car(6L, 'Citroen', 21000),
    new Car(7L, 'Hummer', 41400),
    new Car(8L, 'Volkswagen', 21600),
]

def ds = new JRBeanCollectionDataSource(cars)

def params = [:]
params.put("cars", cars)

def jPrint = JasperFillManager.fillReport(jrReport, params, ds)

JasperExportManager.exportReportToPdfFile(jPrint, "report.pdf")

// Chart customizer 

class BarChartCustomizer implements JRChartCustomizer {

    void customize(JFreeChart chart, JRChart jasperChart) {

//        chart.getLegend().setBorder(0.0, 0.0, 0.0, 0.0)
        def categoryPlot = chart.getCategoryPlot()
        def barRenderer = categoryPlot.getRenderer()
        barRenderer.setMaximumBarWidth(0.08)

        //Spaces between bars
        barRenderer.setItemMargin(-3)
        barRenderer.setBaseItemLabelFont(new Font("fontname", Font.PLAIN, 6))

        def categoryAxis = categoryPlot.getDomainAxis()
//        categoryAxis.setTickLabelsVisible(false)
//        categoryAxis.setMinorTickMarksVisible(false)
//        categoryAxis.setAxisLineVisible(false)
        categoryAxis.setTickMarksVisible(false) // turns off small ticks
        categoryAxis.setMaximumCategoryLabelWidthRatio(2f)

        categoryAxis.setLowerMargin(0.1)
        categoryAxis.setUpperMargin(0.1)
//        categoryAxis.setCategoryMargin(0.1)
    }
}

