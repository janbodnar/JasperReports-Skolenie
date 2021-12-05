# JasperReports chartcustomizer 

The example fixes some issues with a bar chart using a chartcustomizer.  

```xml
<chart evaluationTime="Report" customizerClass="com.zetcode.BarChartCustomizer">
```
The customizer is set in the `customizerClass` attribute of the `chart` tag.  

```groovy
class BarChartCustomizer implements JRChartCustomizer {
```

The customizer class derives fromt the `JRChartCustomizer`.  
