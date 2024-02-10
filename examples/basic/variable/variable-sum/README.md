# JasperReports sum variable 

The `sum` variable is a predefined variable. 

```xml
<field name="price" class="java.lang.Integer"/>

<variable name="sum" class="java.lang.Integer" calculation="Sum">
    <variableExpression><![CDATA[$F{price}]]></variableExpression>
</variable>
```

```xml
<textField>
    <reportElement style="sum" x="0" y="0" width="100" height="20"/>
    <textElement textAlignment="Right"/>
    <textFieldExpression class="java.lang.Long"><![CDATA[$V{sum}]]></textFieldExpression>
</textField>
```
We refer to the variable in `textField` with `$V{}` syntax. 
