# JasperReports printWhenExpression

The `<printWhenExpression>` determines whether an element or a band is shown  
in report.  

```xml
<detail>
    <band height="16">

        <printWhenExpression>
            <![CDATA[ $F{price} > 50000 ]]>
        </printWhenExpression>
    ...  
    </band>
</detail>
```

The `<detail>` band is only printed for those cars that match the expression.  
