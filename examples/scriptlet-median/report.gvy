package com.zetcode

@Grab(group='net.sf.jasperreports', module='jasperreports', version='6.21.0')
@Grab(group='com.github.librepdf', module='openpdf', version='1.3.39')
@Grab(group='org.apache.commons', module='commons-math3', version='3.6.1')

import net.sf.jasperreports.engine.JRDefaultScriptlet
import net.sf.jasperreports.engine.JasperCompileManager
import net.sf.jasperreports.engine.JasperExportManager
import net.sf.jasperreports.engine.JasperFillManager
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource
import groovy.transform.Immutable

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics

def xmlFile = "report.xml"
def jasperReport = JasperCompileManager.compileReport(xmlFile)

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

def jasperPrint = JasperFillManager.fillReport(jasperReport, params, ds)

JasperExportManager.exportReportToPdfFile(jasperPrint, "report.pdf")

// Scriptlet class

class MyScriptlet extends JRDefaultScriptlet {

    private DescriptiveStatistics stats

    void afterReportInit() {

        def cars = getParameterValue("cars")
        stats = new DescriptiveStatistics()

        cars.forEach((car) -> {
            stats.addValue(car.getPrice())
        })
    }

    @Override
    void afterDetailEval() {
        setVariableValue("vmean", stats.getMean())
    }
}
