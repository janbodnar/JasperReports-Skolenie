# JasperReports line chart

```xml
<lineChart>
    <chart evaluationTime="Report">
        <reportElement x="20" y="20" width="540" height="400"/>
        <chartTitle position="Top">
            <titleExpression><![CDATA["Line chart"]]></titleExpression>
        </chartTitle>
        <chartSubtitle/>
        <chartLegend/>
    </chart>
    <categoryDataset>
        <dataset resetType="Report"/>
        <categorySeries>
            <seriesExpression><![CDATA["Temperatures"]]></seriesExpression>
            <categoryExpression><![CDATA[ $F{date} ]]></categoryExpression>
            <valueExpression><![CDATA[ $F{val} ]]></valueExpression>
        </categorySeries>
    </categoryDataset>
    <linePlot>
        <plot/>
        <categoryAxisLabelExpression><![CDATA["Date"]]></categoryAxisLabelExpression>
        <categoryAxisFormat>
            <axisFormat/>
        </categoryAxisFormat>
        <valueAxisLabelExpression><![CDATA["Temperature"]]></valueAxisLabelExpression>
        <valueAxisFormat>
            <axisFormat/>
        </valueAxisFormat>
    </linePlot>
</lineChart>
```
