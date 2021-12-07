# JasperReports chart customizer 

We turn off the plot grid lines & change the shape & colour of the items.  

```groovy
class ScatterChartCustomizer implements JRChartCustomizer {

    void customize(JFreeChart chart, JRChart jasperChart) {

        def xyPlot = chart.getXYPlot()
        def xyItemRenderer = xyPlot.getRenderer()

        def shape = new Ellipse2D.Double(0, 0, 8, 8)

        xyItemRenderer.setSeriesShape(0, shape)
        xyItemRenderer.setSeriesPaint(0, new Color(0, 124, 156))

        xyPlot.setDomainGridlinesVisible(false)
        xyPlot.setRangeGridlinesVisible(false)
    }
}
```

We do the customization in the `customize` method.  

```xml
<chart isShowLegend="true" customizerClass="com.zetcode.ScatterChartCustomizer" >
```

We set the customizer class in the `customizerClass` attribute. 
