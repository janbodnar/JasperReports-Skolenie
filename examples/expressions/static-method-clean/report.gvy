package com.zetcode 

@Grab(group='net.sf.jasperreports', module='jasperreports', version='6.21.0')
@Grab(group='com.github.librepdf', module='openpdf', version='1.3.39')

import net.sf.jasperreports.engine.JasperCompileManager
import net.sf.jasperreports.engine.JasperFillManager
import net.sf.jasperreports.engine.JasperExportManager
import net.sf.jasperreports.engine.JREmptyDataSource

def xmlFile = 'report.xml'
def jrReport = JasperCompileManager.compileReport(xmlFile)

def params = [:]
def jrPrint = JasperFillManager.fillReport(jrReport, params, new JREmptyDataSource())

JasperExportManager.exportReportToPdfFile(jrPrint, 'report.pdf')


class CleanData {

    static String cleanText(String data) {
        
        String s1 = data.trim().replaceAll(~'\\s+', ' ')
        
        if (s1.endsWithAny(new CharSequence[]{',', '.', '?', '!', ';'})) {
            s1[0..-2]
        } else {
            s1
        }

        // data.collect { it.replaceAll("/\s*/", " ") }
        // data
    }
}