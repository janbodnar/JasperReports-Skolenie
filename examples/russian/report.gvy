@Grab(group='net.sf.jasperreports', module='jasperreports', version='6.20.1')
@Grab(group='net.sf.jasperreports', module='jasperreports-fonts', version='6.20.1')

import net.sf.jasperreports.engine.JasperCompileManager
import net.sf.jasperreports.engine.JasperFillManager
import net.sf.jasperreports.engine.JasperExportManager
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource
import groovy.transform.Immutable

@Immutable
class Car {
    Long id;
    String name;
    int price;
}

def data = [
    new Car(1L, 'Audi', 52642),
    new Car(2L, 'Mercedes', 57127),
    new Car(3L, 'Skoda', 9000),
    new Car(4L, 'Volvo', 29000),
    new Car(5L, 'Bentley', 350000),
    new Car(6L, 'Citroen', 21000),
    new Car(7L, 'Hummer', 41400),
    new Car(8L, 'Volkswagen', 21600),
]

def xmlFile = "report.xml"

def jrReport = JasperCompileManager.compileReport(xmlFile)
def ds = new JRBeanCollectionDataSource(data)

def params = [:]
def jrPrint = JasperFillManager.fillReport(jrReport, params, ds)

JasperExportManager.exportReportToPdfFile(jrPrint, "report.pdf")
