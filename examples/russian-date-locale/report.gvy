@Grab(group='net.sf.jasperreports', module='jasperreports', version='6.20.1')
@Grab(group='net.sf.jasperreports', module='jasperreports-fonts', version='6.20.1')

import net.sf.jasperreports.engine.JasperCompileManager
import net.sf.jasperreports.engine.JasperFillManager
import net.sf.jasperreports.engine.JasperExportManager
import net.sf.jasperreports.engine.JREmptyDataSource

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

def xmlFile = "report.xml"
def jrReport = JasperCompileManager.compileReport(xmlFile)

def now = LocalDateTime.now()

// def pattern = "EEE MMM dd HH:mm:ss"
// def df = DateTimeFormatter.ofPattern(pattern, Locale.US)

def pattern = "EEEE, d MMM yyyy HH:mm:ss"
def df = DateTimeFormatter.ofPattern(pattern, new Locale("ru", "RU"))
def fnow = df.format(now)

def params = ["now": fnow]
def jrPrint = JasperFillManager.fillReport(jrReport, params, 
    new JREmptyDataSource())

JasperExportManager.exportReportToPdfFile(jrPrint, "report.pdf")
