## Scriptlets

There are situations when a complex functionality cannot be achieved easily  
using report expressions or variables. Examples of this may be complex String  
manipulations, building of Maps, or Lists of objects in memory or manipulations  
of dates using 3rd party Java APIs. For such situations, JasperReports provides  
us with a simple and powerful means of doing this with Scriptlets.  

Scriptlets are sequences of Java code that are executed every time a report  
event occurs. Values of report variables can be affected through scriptlets.  

Scriptlet is a Java class which extends either one of:  

1. net.sf.jasperreports.engine.JRAbstractScriptlet
2. net.sf.jasperreports.engine.JRDefaultScriptlet.

Using Scriptlet we can use user defined functions in jasper reports.  

---
```xml
<parameter name="SubDataSource" class="net.sf.jasperreports.engine.JRDataSource"/>
...
<datasetRun subDataset="..">
  <dataSourceExpression>$P{SubDataSource}</dataSourceExpression>
</datasetRun>
```