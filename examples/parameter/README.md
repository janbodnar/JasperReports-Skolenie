# JasperReports parameter

The example retrieves a parameter from a user via an input dialog. We  
refer to the parameter in the report template via `<parameter>` and `$P`.  

```xml
<parameter name="country"/>
...
<filterExpression><![CDATA[ $F{country} == $P{country} ]]></filterExpression>
```
