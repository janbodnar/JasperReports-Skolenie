@Grab(group='net.sf.jasperreports', module='jasperreports', version='6.17.0')
@Grab(group='net.sf.jasperreports', module='jasperreports-fonts', version='6.17.0')

import net.sf.jasperreports.engine.JasperCompileManager
import net.sf.jasperreports.engine.JasperFillManager
import net.sf.jasperreports.engine.JasperExportManager
import net.sf.jasperreports.engine.JREmptyDataSource

def xmlFile = "report.xml"

def jrReport = JasperCompileManager.compileReport(xmlFile)

def bundle = ResourceBundle.getBundle("in18/labels",
            new Locale("sk", "SK"));
def params = ["REPORT_RESOURCE_BUNDLE": bundle]

def jrPrint = JasperFillManager.fillReport(jrReport, params, 
    new JREmptyDataSource())

JasperExportManager.exportReportToPdfFile(jrPrint, "report.pdf")
