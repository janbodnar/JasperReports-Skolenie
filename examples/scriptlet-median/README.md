# JasperReports scriptlet median

Calculate median value with a custom scriptlet.  To calculate the median value, we utilize the 
`commons-math3` library.  

A *scriptlet* is a Groovy class which provides some additional functionality to JasperReports.  

A scriptlet is referred with the scriptlet tag:  

```xml
<scriptlet name="MyScriptlet" class="com.zetcode.MyScriptlet"/>
```

Scriptlet derives from the `JRDefaultScriptlet` class. 

```groovy
class MyScriptlet extends JRDefaultScriptlet {
```
