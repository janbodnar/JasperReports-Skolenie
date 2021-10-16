@Grab(group='net.sf.jasperreports', module='jasperreports', version='6.17.0')

import net.sf.jasperreports.engine.JasperCompileManager
import net.sf.jasperreports.engine.JasperFillManager
import net.sf.jasperreports.engine.JasperExportManager
import net.sf.jasperreports.engine.data.JRCsvDataSource

def xmlFile = "report.xml"
def jrReport = JasperCompileManager.compileReport(xmlFile)

// def columnNames = ["id", "name", "price"] as String[]

def fileName = "cars.csv"
def ds = new JRCsvDataSource(fileName)
ds.setUseFirstRowAsHeader(true)
// ds.setColumnNames(columnNames)

def params = [:]
def jrPrint = JasperFillManager.fillReport(jrReport, params, ds)

JasperExportManager.exportReportToPdfFile(jrPrint, "report.pdf")
