# JasperReports conditional style 2

In this example, all cars with price above 50000 have gray background colour.  

```xml
<style name="alt">
    <conditionalStyle>
        <conditionExpression>
            <![CDATA[$F{price} > 50000]]>
        </conditionExpression>

        <style backcolor="#eff0f2"/>
    </conditionalStyle>
</style>
```
