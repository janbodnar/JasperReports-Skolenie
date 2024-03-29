package com.zetcode

@Grab(group='net.sf.jasperreports', module='jasperreports', version='6.21.0')
@Grab(group='com.github.librepdf', module='openpdf', version='1.3.39')
@Grab(group='net.sf.jasperreports', module='jasperreports-fonts', version='6.21.0')

import net.sf.jasperreports.engine.JasperCompileManager
import net.sf.jasperreports.engine.JasperFillManager
import net.sf.jasperreports.engine.JasperExportManager
import net.sf.jasperreports.engine.data.JRMapCollectionDataSource

def data = [
    ['name': 'pen', 'quantity': 5],
    ['name': 'table', 'quantity': 3],
    ['name': 'book', 'quantity': 20],
    ['name': 'cup', 'quantity': 7]
]

def xmlFile = "report.xml"

def jrReport = JasperCompileManager.compileReport(xmlFile)
def ds = new JRMapCollectionDataSource(data)

def params = [:]
def jrPrint = JasperFillManager.fillReport(jrReport, params, ds)

JasperExportManager.exportReportToPdfFile(jrPrint, "report.pdf")
