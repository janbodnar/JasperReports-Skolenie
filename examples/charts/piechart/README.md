# JasperReports pie chart

- {0} item name
- {1} value
- {2} percentage

```xml
<pieChart>

    <chart evaluationTime="Report">
        <reportElement x="0" y="0" width="350" height="300"/>
        <chartTitle position="Top">
            <titleExpression><![CDATA["Fruits"]]></titleExpression>
        </chartTitle>
        <chartSubtitle/>
        <chartLegend/>
    </chart>

    <pieDataset>
        <dataset resetType="Report"/>
        <keyExpression><![CDATA[$F{name}]]></keyExpression>
        <valueExpression><![CDATA[$F{quantity}]]></valueExpression>
    </pieDataset>

    <piePlot labelFormat="{2}">
        <plot/>
        <itemLabel/>
    </piePlot>

</pieChart>
```
