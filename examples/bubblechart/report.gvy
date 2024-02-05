package com.zetcode

@GrabConfig(systemClassLoader=true)
@Grab(group='net.sf.jasperreports', module='jasperreports', version='6.20.1')
@Grab(group='com.h2database', module='h2', version='1.4.200')

import net.sf.jasperreports.engine.JasperCompileManager
import net.sf.jasperreports.engine.JasperExportManager
import net.sf.jasperreports.engine.JasperFillManager
import groovy.sql.Sql

def xmlFile = "report.xml"
def jrReport = JasperCompileManager.compileReport(xmlFile)

def createTable = '''
CREATE TABLE products(id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(255), price INT, quantity INT, market_share INT);
INSERT INTO products(name, price, quantity, market_share) VALUES('Product A', 642, 50, 23);
INSERT INTO products(name, price, quantity, market_share) VALUES('Product B', 540, 23, 47);
INSERT INTO products(name, price, quantity, market_share) VALUES('Product C', 188, 19, 30);
'''

def url = "jdbc:h2:mem:"
Sql.withInstance(url) { sql ->

    sql.execute(createTable)

    def params = [:]
    def jPrint = JasperFillManager.fillReport(jrReport, params, sql.connection)

    JasperExportManager.exportReportToPdfFile(jPrint, "report.pdf")
}
