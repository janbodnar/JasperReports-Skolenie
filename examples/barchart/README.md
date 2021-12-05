# JasperReports Bar chart

The example creates a bar chart. It is not ideal; the bars are very thin & they are misplaced. Check the 
chartcustomizer example for a fix.  

```xml
<barChart>
    <chart evaluationTime="Report">
        <reportElement x="0" y="20" width="454" height="330" />
        <chartTitle position="Top">
            <titleExpression><![CDATA["Car prices"]]></titleExpression>
        </chartTitle>
        <chartSubtitle/>
        <chartLegend/>
    </chart>

    <categoryDataset>
        <dataset resetType="Report"/>
        <categorySeries>
            <seriesExpression><![CDATA[$F{name}]]></seriesExpression>
            <categoryExpression><![CDATA[$F{name}]]></categoryExpression>
            <valueExpression><![CDATA[$F{price}]]></valueExpression>
        </categorySeries>
    </categoryDataset>
    <barPlot>
        <plot/>
        <itemLabel/>

        <categoryAxisFormat>
            <axisFormat labelColor="#000000" tickLabelColor="#000000" axisLineColor="#000000">
                <labelFont>
                    <font size="10"/>
                </labelFont>
                <tickLabelFont>
                    <font size="7"/>
                </tickLabelFont>
            </axisFormat>
        </categoryAxisFormat>
        <valueAxisFormat>
            <axisFormat labelColor="#000000" tickLabelColor="#000000" axisLineColor="#000000"/>
        </valueAxisFormat>
    </barPlot>
</barChart>
```

* seriesExpression - items below the chart
* categoryExpression - x values
* valueExpression - y values
* labelExpression - labels inside the chart, not visible by default   
