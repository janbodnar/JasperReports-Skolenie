@Grab(group='net.sf.jasperreports', module='jasperreports', version='6.20.1')

import net.sf.jasperreports.engine.JasperCompileManager
import net.sf.jasperreports.engine.JasperExportManager
import net.sf.jasperreports.engine.JasperFillManager
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource

import groovy.transform.Immutable

def xmlFile = "report.xml"
def jrReport = JasperCompileManager.compileReport(xmlFile)

def params = [:]

@Immutable
class Car {
    Long id;
    String name;
    int price;
}

def cars = [
    new Car(1L, 'Audi', 52642),
    new Car(2L, 'Mercedes', 57127),
    new Car(3L, 'Skoda', 9000),
    new Car(4L, 'Volvo', 29000),
    new Car(5L, 'Bentley', 350000),
    new Car(6L, 'Citroen', 21000),
    new Car(7L, 'Hummer', 41400),
    new Car(8L, 'Volkswagen', 23600),
    new Car(9L, 'Volkswagen', 21600),
    new Car(10L, 'Volkswagen', 22600),
]

def res = GQ {
    from c in cars
    orderby c.Name in asc, c.Price in asc
    select c
} as List


def ds = new JRBeanCollectionDataSource(res)

def jrPrint = JasperFillManager.fillReport(jrReport, params, ds)
JasperExportManager.exportReportToPdfFile(jrPrint, "report.pdf")
