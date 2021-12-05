# JasperReports chart scriptlet 

The example creates a 3D PieChart in a scriptlet.  The chart is generated with the JFreeChart library,  
which is included in the `jasperreports` JAR.  

A *scriptlet* is a Groovy class which provides some additional functionality to JasperReports.   

A scriptlet is referred with the scriptlet tag:  

```xml
<scriptlet name="MyScriptlet" class="com.zetcode.MyScriptlet"/>
```

Scriptlet derives from the `JRDefaultScriptlet` class. 

```groovy
class MyScriptlet extends JRDefaultScriptlet {
```
