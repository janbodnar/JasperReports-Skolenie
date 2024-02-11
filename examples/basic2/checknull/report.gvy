package com.zetcode

@Grab(group='net.sf.jasperreports', module='jasperreports', version='6.21.0')
@Grab(group='com.github.librepdf', module='openpdf', version='1.3.39')
@Grab(group='net.sf.jasperreports', module='jasperreports-fonts', version='6.21.0')
@Grab(group='com.h2database', module='h2', version='1.4.200')
@GrabConfig(systemClassLoader=true)

import net.sf.jasperreports.engine.JasperCompileManager
import net.sf.jasperreports.engine.JasperFillManager
import net.sf.jasperreports.engine.JasperExportManager
import groovy.sql.Sql

def xmlFile = 'report.xml'
def jrReport = JasperCompileManager.compileReport(xmlFile)

def createTable = '''
CREATE TABLE users(id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(255), occupation VARCHAR(255), salary INT);
INSERT INTO users(name, occupation, salary) VALUES('John Doe', 'gardener', NULL);
INSERT INTO users(name, occupation, salary) VALUES('Roger Roe', 'driver', 940);
INSERT INTO users(name, occupation, salary) VALUES('Roman Novy', 'programmer', 1980);
INSERT INTO users(name, occupation, salary) VALUES('Lucia Biela', NULL, NULL);
INSERT INTO users(name, occupation, salary) VALUES('Tomas Gerber', 'soldier', 1250);
INSERT INTO users(name, occupation, salary) VALUES('Maria Smith', 'teacher', NULL);
INSERT INTO users(name, occupation, salary) VALUES('Oleg Vasil', NULL, 2550);
INSERT INTO users(name, occupation, salary) VALUES('Martin Krajci', 'optician', 2050);
'''

def url = "jdbc:h2:mem:"
Sql.withInstance(url) { sql ->

    sql.execute(createTable)

    def params = [:]
    def jPrint = JasperFillManager.fillReport(jrReport, params, sql.connection)

    JasperExportManager.exportReportToPdfFile(jPrint, "report.pdf")
}

class CleanData {

    static String removeNull(def oldval, def newval = '') {
        if (oldval == null) {
            newval
        } else {
            oldval
        }
    }
}