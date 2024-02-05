@Grab(group='net.sf.jasperreports', module='jasperreports', version='6.20.1')

import net.sf.jasperreports.engine.JasperCompileManager
import net.sf.jasperreports.engine.JasperFillManager
import net.sf.jasperreports.engine.JasperExportManager
import net.sf.jasperreports.swing.JRViewer
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource
import javax.swing.JFrame
import java.util.ArrayList
import java.awt.EventQueue
import java.awt.Dimension
import groovy.transform.Immutable

@Immutable
class Country {
    String name;
    Long population;
}

def countries = [
    new Country('China', 1_382_050_000),
    new Country('India', 1_313_210_000),
    new Country('USA', 324_666_000),
    new Country('Indonesia', 260_581_000),
    new Country('Brazil', 207_221_000),
    new Country('Pakistan', 196_626_000),
    new Country('Nigeria', 186_988_000)
]

def ds = new JRBeanCollectionDataSource(countries)

def xmlFile = 'report.xml'
def jreport = JasperCompileManager.compileReport(xmlFile)

def params = [:]
def jrPrint = JasperFillManager.fillReport(jreport, params, ds)

EventQueue.invokeLater(() -> {

    def frame = new JFrame('Jasper report');
    def viewer = new JRViewer(jrPrint)

    frame.add(viewer)
    frame.setSize(new Dimension(750, 650))
    frame.setLocationRelativeTo(null)
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
    frame.setVisible(true)
})
