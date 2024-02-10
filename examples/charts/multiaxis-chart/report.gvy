package com.zetcode

@Grab(group='net.sf.jasperreports', module='jasperreports', version='6.21.0')
@Grab(group='com.github.librepdf', module='openpdf', version='1.3.39')

import net.sf.jasperreports.engine.JRDefaultScriptlet
import net.sf.jasperreports.engine.JasperCompileManager
import net.sf.jasperreports.engine.JasperExportManager
import net.sf.jasperreports.engine.JasperFillManager
import net.sf.jasperreports.engine.JREmptyDataSource
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource
import groovy.transform.Immutable

@Immutable
class Data {
    long id;
    String date;
    double val1;
    double val2;
}

def data = [
    new Data(1L, "Jan 1", -7.3, 12.1),
    new Data(2L, "Jan 10", -3.4, 11.2),
    new Data(3L, "Jan 12", -5.0, 14.2),
    new Data(4L, "Jan 20", -0.9, 22.8),
    new Data(5L, "Jan 30", -2.2, 20.7),
    new Data(6L, "Feb 1", 4.8, 19.8),
    new Data(7L, "Feb 2", 5.1, 18.9),
    new Data(9L, "Feb 5", -1.9, 16.9),
    new Data(10L, "Feb 8", 0, 10.2),
    new Data(11L, "Feb 12", 2.6, 9.9)
]


def xmlFile = "report.xml"
def jrReport = JasperCompileManager.compileReport(xmlFile)

def ds = new JRBeanCollectionDataSource(data)

def params = [:]
def jPrint = JasperFillManager.fillReport(jrReport, params, ds)

JasperExportManager.exportReportToPdfFile(jPrint, "report.pdf")
