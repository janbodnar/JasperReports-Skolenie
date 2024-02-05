package com.zetcode

@Grab(group='net.sf.jasperreports', module='jasperreports', version='6.20.1')

import net.sf.jasperreports.engine.JREmptyDataSource
import net.sf.jasperreports.engine.JasperCompileManager
import net.sf.jasperreports.engine.JasperExportManager
import net.sf.jasperreports.engine.JasperFillManager
import groovy.transform.Immutable

@Immutable
class Car {
    Long id;
    String name;
    int price;
}

@Immutable
class Country {
    Long id;
    String name;
    int population;
}

def xmlFile = "report.xml"
def jrReport = JasperCompileManager.compileReport(xmlFile)

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

def countries = [
    new Country(1L, "China", 1382050000),
    new Country(2L, "India", 1313210000),
    new Country(3L, "USA", 324666000),
    new Country(4L, "Indonesia", 260581000),
    new Country(5L, "Brazil", 207221000),
    new Country(6L, "Pakistan", 196626000),
    new Country(7L, "Nigeria", 186988000),
    new Country(8L, "Bangladesh", 162099000),
]

def params = [:]
params.put("ds1", cars)
params.put("ds2", countries)

def jrPrint = JasperFillManager.fillReport(jrReport,
        params, new JREmptyDataSource())

JasperExportManager.exportReportToPdfFile(jrPrint, "report.pdf")
