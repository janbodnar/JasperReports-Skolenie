# JasperReports multi-axis chart

The example shows two charts (line and bar charts) created with `multiAxisChart` tag.  
Each of the charts is placed into axis tag. We use `axisFormat` to visually  
separate the two line charts.  

```xml
<multiAxisChart>
    <chart evaluationTime="Report">
        <reportElement x="10" y="20" width="550" height="400"/>
        <chartTitle/>
        <chartSubtitle/>
        <chartLegend/>
    </chart>
    <multiAxisPlot>
        <plot/>
        <axis>
            <lineChart>
                <chart evaluationTime="Report">
                    <reportElement x="0" y="0" width="0" height="0"/>
                    <chartTitle/>
                    <chartSubtitle/>
                    <chartLegend/>
                </chart>
                <categoryDataset>
                    <dataset resetType="Report"/>
                    <categorySeries>
                        <seriesExpression><![CDATA[ "Value 1" ]]></seriesExpression>
                        <categoryExpression><![CDATA[ $F{date} ]]></categoryExpression>
                        <valueExpression><![CDATA[ $F{val1} ]]></valueExpression>
                    </categorySeries>
                </categoryDataset>
                <linePlot>
                    <plot>
                        <seriesColor seriesOrder="0" color="#0000CC"/>
                    </plot>
                    <categoryAxisFormat>
                        <axisFormat/>
                    </categoryAxisFormat>
                    <valueAxisFormat>
                        <axisFormat labelColor="#0000CC" tickLabelColor="#0000CC" tickLabelMask="$#,##0" axisLineColor="#0000CC"/>
                    </valueAxisFormat>
                </linePlot>
            </lineChart>
        </axis>
        <axis position="rightOrBottom">
            <barChart>
                    <chart evaluationTime="Report">
                        <reportElement x="0" y="0" width="0" height="0"/>
                        <chartTitle/>
                        <chartSubtitle/>
                        <chartLegend/>
                    </chart>

                    <categoryDataset>
                        <dataset resetType="Report"/>
                        <categorySeries>
                            <seriesExpression><![CDATA[ "Value 2" ]]></seriesExpression>
                            <categoryExpression><![CDATA[ $F{date} ]]></categoryExpression>
                            <valueExpression><![CDATA[ $F{val2} ]]></valueExpression>
                        </categorySeries>
                    </categoryDataset>
                    <barPlot>
                        <plot>
                            <seriesColor seriesOrder="0" color="#00CC00"/>
                        </plot>
                        <itemLabel color="#00CC00"/>
                        <categoryAxisFormat>
                            <axisFormat/>
                        </categoryAxisFormat>
                        <valueAxisFormat>
                            <axisFormat labelColor="#00CC00" tickLabelColor="#00CC00" axisLineColor="#00CC00"/>
                        </valueAxisFormat>
                    </barPlot>
                </barChart>
        </axis>
    </multiAxisPlot>
</multiAxisChart>
```
