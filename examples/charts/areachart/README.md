# JasperReports area chart

```xml
 <areaChart>
    <chart evaluationTime="Report">
        <reportElement x="0" y="0" width="450" height="400"/>
        <chartTitle/>
        <chartSubtitle/>
        <chartLegend/>
    </chart>
    <categoryDataset>
        <dataset resetType="Report"/>
        <categorySeries>
            <seriesExpression><![CDATA["Oil Consumption"]]></seriesExpression>
            <categoryExpression><![CDATA[ $F{year} ]]></categoryExpression>
            <valueExpression><![CDATA[ $F{consumption} ]]></valueExpression>
        </categorySeries>
    </categoryDataset>
    <areaPlot>
        <plot/>
        <categoryAxisFormat>
            <axisFormat/>
        </categoryAxisFormat>
        <valueAxisFormat>
            <axisFormat/>
        </valueAxisFormat>
        <domainAxisMinValueExpression>0</domainAxisMinValueExpression>
        <domainAxisMaxValueExpression>10</domainAxisMaxValueExpression>
    </areaPlot>
</areaChart>
```
