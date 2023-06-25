@Grab(group='net.sf.jasperreports', module='jasperreports', version='6.20.1')

import net.sf.jasperreports.engine.JRParameter
import net.sf.jasperreports.engine.JRSortField
import net.sf.jasperreports.engine.JasperCompileManager
import net.sf.jasperreports.engine.JasperExportManager
import net.sf.jasperreports.engine.JasperFillManager
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource
import net.sf.jasperreports.engine.design.JRDesignSortField
import net.sf.jasperreports.engine.type.SortFieldTypeEnum
import net.sf.jasperreports.engine.type.SortOrderEnum

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
    new Car(4L, 'Volvo X', 29000),
    new Car(5L, 'Bentley', 350000),
    new Car(6L, 'Citroen', 21000),
    new Car(7L, 'Hummer', 41400),
    new Car(8L, 'Volkswagen', 31600),
    new Car(9L, 'Volkswagen', 41600),
    new Car(10L, 'Volkswagen', 21600),
]

def ds = new JRBeanCollectionDataSource(cars)

def fields = []

def sf1 = new JRDesignSortField()
sf1.setName("Name")
sf1.setOrder(SortOrderEnum.ASCENDING)
sf1.setType(SortFieldTypeEnum.FIELD)
fields.add(sf1)

def sf2 = new JRDesignSortField()
sf2.setName("Price")
sf2.setOrder(SortOrderEnum.ASCENDING)
sf2.setType(SortFieldTypeEnum.FIELD)
fields.add(sf2)

params.put(JRParameter.SORT_FIELDS, fields)

def jrPrint = JasperFillManager.fillReport(jrReport, params, ds)
JasperExportManager.exportReportToPdfFile(jrPrint, "report.pdf")

