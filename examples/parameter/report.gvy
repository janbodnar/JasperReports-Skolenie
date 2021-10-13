@Grab(group='net.sf.jasperreports', module='jasperreports', version='6.17.0')
@Grab(group='org.postgresql', module='postgresql', version='42.2.23')
@GrabConfig(systemClassLoader=true)

import net.sf.jasperreports.engine.JasperCompileManager
import net.sf.jasperreports.engine.JasperFillManager
import net.sf.jasperreports.engine.JasperExportManager
import net.sf.jasperreports.engine.data.JRCsvDataSource
import groovy.sql.Sql
import javax.swing.JOptionPane

def url = 'jdbc:postgresql://localhost:5432/northwind'
def user = 'postgres'
def password = ''
def driver = 'org.postgresql.Driver'

def country_input = JOptionPane.showInputDialog('Enter country name:')

def sql = Sql.newInstance(url, user, password, driver)

def xmlFile = 'report.xml'
def jrReport = JasperCompileManager.compileReport(xmlFile)

def params = ['country': country_input]

def jrPrint = JasperFillManager.fillReport(jrReport, params, sql.connection)
JasperExportManager.exportReportToPdfFile(jrPrint, 'report.pdf')

sql.close()
