package com.zetcode

@Grab(group='net.sf.jasperreports', module='jasperreports', version='6.21.0')
@Grab(group='com.github.librepdf', module='openpdf', version='1.3.39')

import net.sf.jasperreports.engine.JasperCompileManager
import net.sf.jasperreports.engine.JasperFillManager
import net.sf.jasperreports.engine.JasperExportManager
import net.sf.jasperreports.engine.JREmptyDataSource

def text = '''
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse id justo 
lacus. Nullam semper sed nulla finibus semper. Sed tristique ipsum et
ullamcorper ullamcorper. In interdum sapien eu scelerisque faucibus. Sed nec ex
at tortor varius aliquet. Donec cursus lorem massa, faucibus auctor neque
dignissim id. Quisque eu ultrices nisl, et commodo ligula. Phasellus neque nunc,
interdum quis lectus a, cursus egestas tellus. Fusce dictum ligula sed porta
scelerisque. 
'''

def xmlFile = 'report.xml'
def jreport = JasperCompileManager.compileReport(xmlFile)

def params = ['text': text]
def jrPrint = JasperFillManager.fillReport(jreport, params,
        new JREmptyDataSource())

JasperExportManager.exportReportToPdfFile(jrPrint, 'report.pdf')
