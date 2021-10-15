@Grab(group='net.sf.jasperreports', module='jasperreports', version='6.17.0')

import net.sf.jasperreports.engine.JasperCompileManager
import net.sf.jasperreports.engine.JasperFillManager
import net.sf.jasperreports.engine.JasperExportManager
import net.sf.jasperreports.engine.JREmptyDataSource

def xmlFile = 'report.xml'
def jrReport = JasperCompileManager.compileReport(xmlFile)

def params = ['text': 'I am Sid, the lazy ground sloth']
def jrPrint = JasperFillManager.fillReport(jrReport, params, 
    new JREmptyDataSource())

JasperExportManager.exportReportToPdfFile(jrPrint, 'report.pdf')

