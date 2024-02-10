@Grab(group='net.sf.jasperreports', module='jasperreports', version='6.21.0')
@Grab(group='com.github.librepdf', module='openpdf', version='1.3.39')

import net.sf.jasperreports.engine.JasperCompileManager
import net.sf.jasperreports.engine.JasperFillManager
import net.sf.jasperreports.engine.JasperExportManager
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter
import net.sf.jasperreports.export.SimpleExporterInput
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput
import net.sf.jasperreports.export.SimpleXlsxReportConfiguration
import groovy.transform.Immutable

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
    new Car(8L, 'Volkswagen', 21600),
]

def xmlFile = "report.xml"

def jrReport = JasperCompileManager.compileReport(xmlFile)
def ds = new JRBeanCollectionDataSource(cars)

def params = [:]
def jrPrint = JasperFillManager.fillReport(jrReport, params, ds)

export2Xlsx(jrPrint)

// JasperExportManager.exportReportToPdfFile(jrPrint, "report.pdf")

def export2Xlsx(jrPrint) {

    def file = new File("report.xlsx")
    def exporter = new JRXlsxExporter()
    
    exporter.setExporterInput(new SimpleExporterInput(jrPrint))
    exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(file))

    def conf = new SimpleXlsxReportConfiguration()
    conf.setDetectCellType(true)

    // conf.setIgnoreCellBackground(true)
    // conf.setAutoFitPageHeight(true)
    // conf.setIgnoreCellBorder(true)
    // conf.setShowGridLines(true)
    conf.setCollapseRowSpan(true)

    exporter.setConfiguration(conf)
    exporter.exportReport()
}
