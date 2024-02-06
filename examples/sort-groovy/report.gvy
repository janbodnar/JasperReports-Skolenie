@Grab(group='net.sf.jasperreports', module='jasperreports', version='6.21.0')
@Grab(group='com.github.librepdf', module='openpdf', version='1.3.39')

import net.sf.jasperreports.engine.JasperCompileManager
import net.sf.jasperreports.engine.JasperExportManager
import net.sf.jasperreports.engine.JasperFillManager
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource

import groovy.transform.Sortable
import groovy.transform.Immutable

def xmlFile = "report.xml"
def jrReport = JasperCompileManager.compileReport(xmlFile)

def params = [:]

@Sortable(includes = ['price', 'name'])
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

cars.sort { c1, c2 -> c2.name <=> c1.name ?: c1.price <=> c2.price }

def ds = new JRBeanCollectionDataSource(cars)

def jrPrint = JasperFillManager.fillReport(jrReport, params, ds)
JasperExportManager.exportReportToPdfFile(jrPrint, "report.pdf")
