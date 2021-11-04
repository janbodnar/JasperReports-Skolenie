@Grab(group='net.sf.jasperreports', module='jasperreports', version='6.17.0')
@Grab(group='org.postgresql', module='postgresql', version='42.2.23')
@GrabConfig(systemClassLoader=true)

import net.sf.jasperreports.engine.JasperCompileManager
import net.sf.jasperreports.engine.JasperFillManager
import net.sf.jasperreports.engine.JasperExportManager
import net.sf.jasperreports.engine.JREmptyDataSource
import groovy.sql.Sql

def url = 'jdbc:postgresql://localhost:5432/testdb'
def user = 'postgres'
def password = 'postgres'
def driver = 'org.postgresql.Driver'

def sql = Sql.withInstance(url, user, password, driver) { sql ->

    def xmlFile = 'report.xml'
    def jrReport = JasperCompileManager.compileReport(xmlFile)
    def params = [:]

    def jrPrint = JasperFillManager.fillReport(jrReport, params, 
            sql.connection)
    JasperExportManager.exportReportToPdfFile(jrPrint, 'report.pdf')
}
