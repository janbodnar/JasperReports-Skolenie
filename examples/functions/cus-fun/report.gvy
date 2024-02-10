package com.zetcode 

@Grab(group='net.sf.jasperreports', module='jasperreports', version='6.21.0')
@Grab(group='net.sf.jasperreports', module='jasperreports-functions', version='6.21.0')
@Grab(group='com.github.librepdf', module='openpdf', version='1.3.39')

import net.sf.jasperreports.engine.JasperCompileManager
import net.sf.jasperreports.engine.JasperFillManager
import net.sf.jasperreports.engine.JasperExportManager
import net.sf.jasperreports.engine.JREmptyDataSource

import net.sf.jasperreports.functions.annotations.Function
import net.sf.jasperreports.functions.annotations.FunctionCategories
import net.sf.jasperreports.functions.annotations.FunctionCategory


def xmlFile = 'report.xml'
def jrReport = JasperCompileManager.compileReport(xmlFile)

def params = [:]
def jrPrint = JasperFillManager.fillReport(jrReport, params, new JREmptyDataSource())

JasperExportManager.exportReportToPdfFile(jrPrint, 'report.pdf')


@FunctionCategories([MyCategory.class])
class CustomFunctions {

    @Function("HELLO")
    public static String HELLO() {
        return "Hello there!"
    }
}

@FunctionCategory()
class MyCategory {}
