# JasperReports date variable 

A variable is defined with the `variable` tag.  

```xml
<variable name="today">
    <variableExpression><![CDATA[ "Today is ${new Date().format('EEE, d MMM yyyy')}" ]]></variableExpression>
</variable>
```

```xml
<textFieldExpression>
    <![CDATA[$V{today}]]>
</textFieldExpression>
```
We refer to the variable with the `$V{}` syntax.  
