package com.zetcode

@Grab(group='net.sf.jasperreports', module='jasperreports', version='6.20.1')

import net.sf.jasperreports.engine.JasperCompileManager
import net.sf.jasperreports.engine.JasperExportManager
import net.sf.jasperreports.engine.JasperFillManager
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource
import groovy.transform.Immutable

@Immutable
class Temp {
    long id;
    String year;
    int consumption;
}

def data = [
    new Temp(1L, "2004", 82502),
    new Temp(2L, "2005", 84026),
    new Temp(3L, "2006", 85007),
    new Temp(4L, "2007", 86216),
    new Temp(5L, "2008", 85559),
    new Temp(6L, "2009", 84491),
    new Temp(7L, "2010", 87672),
    new Temp(9L, "2011", 88575),
    new Temp(10L, "2012", 89837),
    new Temp(11L, "2013", 90701)
]


def xmlFile = "report.xml"
def jrReport = JasperCompileManager.compileReport(xmlFile)

def ds = new JRBeanCollectionDataSource(data)

def params = [:]
def jPrint = JasperFillManager.fillReport(jrReport, params, ds)

JasperExportManager.exportReportToPdfFile(jPrint, "report.pdf")
