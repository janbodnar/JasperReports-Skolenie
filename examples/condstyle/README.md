# JasperReports conditional style

Dynamic styles can be created with conditional expressions.  

```xml
<style name="alt">
    <conditionalStyle>
        <conditionExpression>
            <![CDATA[$V{COLUMN_COUNT} % 2 == 0]]>
        </conditionExpression>

        <style isBold="true"/>
    </conditionalStyle>
</style>
```

The `<conditionalStyle>` and `<conditionExpression>` tags are used to define a conditional style.   
To display text in bold, we need the `jasperreports-fonts` library.  

