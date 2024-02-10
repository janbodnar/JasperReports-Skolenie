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

3) The `T` function from the `jasperreports-functions` library.  
```xml
<textFieldExpression class="java.lang.Integer">
    <![CDATA[ T($F{region}) ]]>
</textFieldExpression>
```

We need to include the `@Grab(group='net.sf.jasperreports', module='jasperreports-functions', version='6.17.0')` library.   


In the example, we fetch data from the *northwind* database's `customers` table. The `region` column has plenty of  
`null` values.  
