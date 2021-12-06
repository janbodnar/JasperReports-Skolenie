# JasperReports line chart

```xml
<lineChart>
    <chart evaluationTime="Report">
        <reportElement x="10" y="80" width="540" height="350"/>
        <chartTitle/>
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
        <categoryAxisFormat>
            <axisFormat labelColor="#000000" tickLabelColor="#000000" axisLineColor="#000000"/>
        </categoryAxisFormat>
        <valueAxisFormat>
            <axisFormat labelColor="#000000" tickLabelColor="#000000" axisLineColor="#000000"/>
        </valueAxisFormat>
    </linePlot>
</lineChart>
```
