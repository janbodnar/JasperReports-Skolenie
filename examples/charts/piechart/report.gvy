package com.zetcode

@Grab(group='net.sf.jasperreports', module='jasperreports', version='6.21.0')
@Grab(group='com.github.librepdf', module='openpdf', version='1.3.39')

import net.sf.jasperreports.engine.JasperCompileManager
import net.sf.jasperreports.engine.JasperExportManager
import net.sf.jasperreports.engine.JasperFillManager
import net.sf.jasperreports.engine.data.JRMapCollectionDataSource

def xmlFile = "report.xml"
def jrReport = JasperCompileManager.compileReport(xmlFile)

def fruits = [ 
    [ "name": "Oranges", "quantity": 38], 
    [ "name": "Pears", "quantity": 45], 
    [ "name": "Plums", "quantity": 24], 
    [ "name": "Cherries", "quantity": 10], 
]

def ds = new JRMapCollectionDataSource(fruits)

def params = [:]
def jrPrint = JasperFillManager.fillReport(jrReport, params, ds)

JasperExportManager.exportReportToPdfFile(jrPrint, "report.pdf")
