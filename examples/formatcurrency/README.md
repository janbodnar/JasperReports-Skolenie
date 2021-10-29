# JasperReports format currency 


We format the currencty with `NumberFormat`.  We get the selected locale with `$P{REPORT_LOCALE}`.  

```xml
<![CDATA[ NumberFormat.getCurrencyInstance($P{REPORT_LOCALE}).format($F{price}) ]]>
```
## Setting the current locale 

With the `net.sf.jasperreports.default.locale` property in the `jasperreports.properties` file.  

In code setting the `REPORT_LOCALE` parameter.  (Locale.US, new Locale("sk", "SK")  

```groovy
def params = [REPORT_LOCALE: new Locale("sk", "SK")]
def jrPrint = JasperFillManager.fillReport(jrReport, params, ds)
```
