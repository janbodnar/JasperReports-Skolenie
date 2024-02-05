@Grab(group='net.sf.jasperreports', module='jasperreports', version='6.20.1')

import net.sf.jasperreports.engine.JasperCompileManager
import net.sf.jasperreports.engine.JasperFillManager
import net.sf.jasperreports.engine.JasperExportManager
import net.sf.jasperreports.engine.JREmptyDataSource

import java.net.URL

String url = 'https://lumiere-a.akamaihd.net/v1/images/ct_iceage_sid_21464_10f2d363.jpeg'

def xmlFile = 'report.xml'
def jrReport = JasperCompileManager.compileReport(xmlFile)

def f = new URL(url).openStream()

def params = ["mychart" : f]
def jrPrint = JasperFillManager.fillReport(jrReport, params, new JREmptyDataSource())

JasperExportManager.exportReportToPdfFile(jrPrint, 'report.pdf')
