# JasperReports scriptlet geometric mean 

A *scriptlet* is a Groovy class which provides some additional functionality to JasperReports.  
To calculate the median value, we utilize the `commons-math3` library.   

A scriptlet is referred with the scriptlet tag:  

```xml
<scriptlet name="MyScriptlet" class="com.zetcode.MyScriptlet"/>
```

Scriptlet derives from the `JRDefaultScriptlet` class. 

```groovy
class MyScriptlet extends JRDefaultScriptlet {
```

It has lifecycle events:  

* afterColumnInit - called after each column is initialized
* afterDetailEval - called after evaluating each detail
* afterGroupInit - called after a group is initialized
* afterPageInit - called after each page is initialized
* afterReportInit - called after the report is initialized
* beforeColumnInit - called before each column is initialized
* beforeDetailEval - called before evaluating each detail
* beforeGroupInit - called before a group is initialized
* beforePageInit - called before each page is initialized
* beforeReportInit - called before the report is initialized
