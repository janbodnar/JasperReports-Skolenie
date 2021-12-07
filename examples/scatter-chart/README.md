# JasperReports scatter chart

```xml
<scatterChart>
    <chart isShowLegend="true">
        <reportElement x="0" y="0" width="450" height="400"/>
        <chartTitle/>
        <chartSubtitle/>
        <chartLegend/>
    </chart>
    <xyDataset>
        <dataset/>
        <xySeries>
            <seriesExpression><![CDATA[ "Temperatures" ]]></seriesExpression>
            <xValueExpression><![CDATA[ $F{id} ]]></xValueExpression>
            <yValueExpression><![CDATA[ $F{val} ]]></yValueExpression>
        </xySeries>
    </xyDataset>
    <scatterPlot isShowLines="false" isShowShapes="true">
        <plot backcolor="#959696" backgroundAlpha="0.1"/>
        <xAxisFormat>
            <axisFormat/>
        </xAxisFormat>
        <yAxisFormat>
            <axisFormat/>
        </yAxisFormat>
    </scatterPlot>
</scatterChart>
```

