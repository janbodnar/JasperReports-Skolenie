# JasperReports isBlankWhenNull

Database fields can contain `null` values. We often want to display empty strings instead  
of `null`. There are several ways to do this:

1) The isBlankWhenNull attribute 
```xml
<textField isBlankWhenNull="true">
```

2) Basic ternary expression
```xml
<textFieldExpression class="java.lang.Integer">
    <![CDATA[ $F{region} == null ? "" : $F{region}  ]]>
</textFieldExpression>
```
