@Grab(group='net.sf.jasperreports', module='jasperreports', version='6.21.0')
@Grab(group='com.github.librepdf', module='openpdf', version='1.3.39')
@Grab(group='org.knowm.xchart', module='xchart', version='3.8.4')

import net.sf.jasperreports.engine.JasperCompileManager
import net.sf.jasperreports.engine.JasperFillManager
import net.sf.jasperreports.engine.JasperExportManager
import net.sf.jasperreports.engine.JREmptyDataSource

import java.text.DateFormat
import java.text.SimpleDateFormat
import org.knowm.xchart.OHLCChartBuilder
import org.knowm.xchart.BitmapEncoder
import org.knowm.xchart.BitmapEncoder.BitmapFormat
import org.knowm.xchart.style.Styler
import org.knowm.xchart.style.Styler.ChartTheme


def getChart() {

    def chart = new OHLCChartBuilder().width(450).height(400)
        .title("My Chart").theme(ChartTheme.GGPlot2).build()

    chart.getStyler().setLegendPosition(Styler.LegendPosition.OutsideS)
    chart.getStyler().setLegendLayout(Styler.LegendLayout.Horizontal)

    DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd")

    def xData = [sdf.parse("2017-01-01"), sdf.parse("2017-01-02"), sdf.parse("2017-01-03"), sdf.parse("2017-01-04"),
        sdf.parse("2017-01-05"), sdf.parse("2017-01-06"), sdf.parse("2017-01-07"), sdf.parse("2017-01-08"), 
        sdf.parse("2017-01-09"), sdf.parse("2017-01-10"), sdf.parse("2017-01-11"), sdf.parse("2017-01-12"), 
        sdf.parse("2017-01-13"), sdf.parse("2017-01-14"), sdf.parse("2017-01-15"), sdf.parse("2017-01-16"),
        sdf.parse("2017-01-17"), sdf.parse("2017-01-18"), sdf.parse("2017-01-19"), sdf.parse("2017-01-20")]
    def openData = [5000.0, 4757.2473929793405, 4937.933153377687, 4850.117798755733, 4680.445170834381, 
        4728.6033945787485, 4639.04671671885, 4530.096339147777, 4315.229765115681, 4388.220975399254,
        4489.697288087602, 4732.2132126939905, 4702.3966247309845, 4791.640117313282, 4901.38575875206, 
        5125.005575124998, 5339.946396170943, 5514.203125103359, 5605.7120913762365, 5658.4641692460655 ]
    def highData = [5011.625115831823, 5015.598840107868, 5004.555292655227, 4946.208284989638, 4800.7266299680105, 
        4733.951285736023, 4682.965749348238, 4593.042839842684, 4477.12221217068, 4503.283591544297, 
        4746.430219157109, 4814.011792774473, 4847.995393440874, 4904.50276031226, 5200.3865578332025, 
        5426.345431443595, 5516.270559972647, 5646.1703261538005, 5732.382218841784, 5694.726095511361]
    def lowData = [4756.08711241483, 4713.0075280141755, 4815.154612252833, 4613.815119457544, 4676.900203675839, 
        4548.156136279956, 4474.001485725063, 4306.370773477324, 4287.219701792791, 4348.675798536698, 
        4413.906124958164, 4657.285803043788, 4624.954232028435, 4787.258755266257, 4852.463837292509, 
        5101.189240790134, 5258.967294465301, 5505.353185225293, 5542.616442576277, 5429.70901528972]
    def closeData = [4757.2473929793405, 4937.933153377687, 4850.117798755733, 4680.445170834381, 4728.6033945787485, 
        4639.04671671885, 4530.096339147777, 4315.229765115681, 4388.220975399254, 4489.697288087602, 
        4732.2132126939905, 4702.3966247309845, 4791.640117313282, 4901.38575875206, 5125.005575124998, 
        5339.946396170943, 5514.203125103359, 5605.7120913762365, 5658.4641692460655, 5468.595045517461]

    chart.addSeries("Values", xData, openData, highData, lowData, closeData)
    return chart
}
  

def chart = getChart()
BitmapEncoder.saveBitmap(chart, "candlestick", BitmapFormat.PNG)

// Generate report

def xmlFile = 'report.xml'
def jrReport = JasperCompileManager.compileReport(xmlFile)

def params = [:]
def jrPrint = JasperFillManager.fillReport(jrReport, params, 
    new JREmptyDataSource())

JasperExportManager.exportReportToPdfFile(jrPrint, 'report.pdf')
