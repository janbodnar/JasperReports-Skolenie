package com.zetcode

@GrabConfig(systemClassLoader=true)
@Grab(group='net.sf.jasperreports', module='jasperreports', version='6.17.0')
@Grab(group='com.h2database', module='h2', version='1.4.200')

import net.sf.jasperreports.engine.JasperCompileManager
import net.sf.jasperreports.engine.JasperExportManager
import net.sf.jasperreports.engine.JasperFillManager
import net.sf.jasperreports.engine.JRResultSetDataSource
import groovy.sql.Sql

def xmlFile = "report.xml"
def jrReport = JasperCompileManager.compileReport(xmlFile)

def createTable = '''
CREATE TABLE cars(id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(255), price INT);
INSERT INTO cars(name, price) VALUES('Audi', 52642);
INSERT INTO cars(name, price) VALUES('Mercedes', 57127);
INSERT INTO cars(name, price) VALUES('Skoda', 9000);
INSERT INTO cars(name, price) VALUES('Volvo', 29000);
INSERT INTO cars(name, price) VALUES('Bentley', 350000);
INSERT INTO cars(name, price) VALUES('Citroen', 21000);
INSERT INTO cars(name, price) VALUES('Hummer', 41400);
INSERT INTO cars(name, price) VALUES('Volkswagen', 21600);
'''

def url = "jdbc:h2:mem:"
def sql = Sql.withInstance(url) { sql ->

    sql.execute(createTable)

    def rs = sql.query("SELECT * FROM cars") { rs -> 
    
        def ds = new JRResultSetDataSource(rs)

        def params = [:]
        def jPrint = JasperFillManager.fillReport(jrReport, params, ds)

        JasperExportManager.exportReportToPdfFile(jPrint, "report.pdf")
    }
}
