# JasperReports Bubble chart

```xml
<bubbleChart>
    <chart evaluationTime="Report">
        <reportElement x="20" y="20" width="450" height="400"/>
        <chartTitle position="Top">
            <titleExpression><![CDATA["Products"]]></titleExpression>
        </chartTitle>
        <chartSubtitle/>
        <chartLegend/>
    </chart>
    <xyzDataset>
        <dataset/>
        <xyzSeries>
            <seriesExpression><![CDATA[$F{name}]]></seriesExpression>
            <xValueExpression><![CDATA[$F{quantity}]]></xValueExpression>
            <yValueExpression><![CDATA[$F{price}]]></yValueExpression>
            <zValueExpression><![CDATA[$F{market_share} * 5]]></zValueExpression>
        </xyzSeries>
    </xyzDataset>
    <bubblePlot>
        <plot/>
        <xAxisLabelExpression><![CDATA["Quantity"]]></xAxisLabelExpression>
        <xAxisFormat>
            <axisFormat/>
        </xAxisFormat>
        <yAxisLabelExpression><![CDATA["Price"]]></yAxisLabelExpression>
        <yAxisFormat>
            <axisFormat/>
        </yAxisFormat>
        <domainAxisMinValueExpression><![CDATA[0]]></domainAxisMinValueExpression>
        <domainAxisMaxValueExpression><![CDATA[80]]></domainAxisMaxValueExpression>
        <rangeAxisMinValueExpression><![CDATA[0]]></rangeAxisMinValueExpression>
        <rangeAxisMaxValueExpression><![CDATA[1000]]></rangeAxisMaxValueExpression>
    </bubblePlot>
</bubbleChart>
```

Manual scaling by multiplying the z values by 5.  

```xml
<zValueExpression><![CDATA[$F{market_share} * 5]]></zValueExpression>
```

Adjusting scales with these expressions:

```xml
<domainAxisMinValueExpression><![CDATA[0]]></domainAxisMinValueExpression>
<domainAxisMaxValueExpression><![CDATA[80]]></domainAxisMaxValueExpression>
<rangeAxisMinValueExpression><![CDATA[0]]></rangeAxisMinValueExpression>
<rangeAxisMaxValueExpression><![CDATA[1000]]></rangeAxisMaxValueExpression>
```        
