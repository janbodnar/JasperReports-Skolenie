@Grab(group='net.sf.jasperreports', module='jasperreports', version='6.17.0')
@Grab(group='org.postgresql', module='postgresql', version='42.2.23')
@GrabConfig(systemClassLoader=true)

import net.sf.jasperreports.engine.JasperCompileManager
import net.sf.jasperreports.engine.JasperFillManager
import net.sf.jasperreports.engine.JasperExportManager
import groovy.sql.Sql

def url = 'jdbc:postgresql://localhost:5432/northwind'
def user = 'postgres'
def password = ''
def driver = 'org.postgresql.Driver'

def sql = Sql.newInstance(url, user, password, driver)

def xmlFile = 'report.xml'
def jrReport2 = JasperCompileManager.compileReport(xmlFile)

def params = [:]
def jrPrint = JasperFillManager.fillReport(jrReport2, params, sql.connection)

JasperExportManager.exportReportToPdfFile(jrPrint, 'report.pdf')

sql.close()
