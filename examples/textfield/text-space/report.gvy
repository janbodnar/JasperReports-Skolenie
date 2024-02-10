package com.zetcode

@Grab(group='net.sf.jasperreports', module='jasperreports', version='6.21.0')
@Grab(group='com.github.librepdf', module='openpdf', version='1.3.39')

import net.sf.jasperreports.engine.JasperCompileManager
import net.sf.jasperreports.engine.JasperFillManager
import net.sf.jasperreports.engine.JasperExportManager
import net.sf.jasperreports.engine.JREmptyDataSource

def (txt1, txt2, txt3) = readFiles()

def xmlFile = 'report.xml'
def jreport = JasperCompileManager.compileReport(xmlFile)

def params = ['text1': txt1, 'text2': txt2, 'text3': txt3]

def jsPrint = JasperFillManager.fillReport(jreport, params,
        new JREmptyDataSource())

JasperExportManager.exportReportToPdfFile(jsPrint, 'report.pdf')

def readFiles() {

    def s1 = new File('lorem1.txt').text
    def s2 = new File('lorem2.txt').text
    def s3 = new File('lorem3.txt').text

    def pt1 = processText(s1)
    def pt2 = processText(s2)
    def pt3 = processText(s3)

    return [pt1.toString(), pt2.toString(), pt3.toString()]
}

def processText(txt) {

    def data = txt.split(/\R+/)

    $/${data[0]}
 ${data[1..-1].join(" ")}/$
}
