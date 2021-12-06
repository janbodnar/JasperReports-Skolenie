# JasperReports multi-axis chart

The example shows two line charts. We use `axisFormat` to visually separate separate the two lines.  

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
                    <reportElement x="0" y="0" width="0" height="0" backcolor="#FFFFFF"/>
                    <chartTitle color="#000000"/>
                    <chartSubtitle color="#000000"/>
                    <chartLegend textColor="#000000" backgroundColor="#FFFFFF"/>
                </chart>
                <categoryDataset>
                    <dataset resetType="Report"/>
                    <categorySeries>
                        <seriesExpression><![CDATA["Value 1"]]></seriesExpression>
                        <categoryExpression><![CDATA[ $F{date} ]]></categoryExpression>
                        <valueExpression><![CDATA[ $F{val1} ]]></valueExpression>
                    </categorySeries>
                </categoryDataset>
                <linePlot>
                    <plot/>
                    <categoryAxisFormat>
                        <axisFormat/>
                    </categoryAxisFormat>
                    <valueAxisFormat>
                        <axisFormat labelColor="#CC0000" tickLabelColor="#CC0000" tickLabelMask="$#,##0" axisLineColor="#CC0000"/>
                    </valueAxisFormat>
                </linePlot>
            </lineChart>
        </axis>
        <axis position="rightOrBottom">
            <lineChart>
                <chart evaluationTime="Report">
                    <reportElement x="0" y="0" width="0" height="0" backcolor="#FFFFFF"/>
                    <chartTitle color="#000000"/>
                    <chartSubtitle color="#000000"/>
                    <chartLegend textColor="#000000" backgroundColor="#FFFFFF"/>
                </chart>
                <categoryDataset>
                    <dataset resetType="Report"/>
                    <categorySeries>
                        <seriesExpression><![CDATA["Value 2"]]></seriesExpression>
                        <categoryExpression><![CDATA[ $F{date} ]]></categoryExpression>
                        <valueExpression><![CDATA[ $F{val2} ]]></valueExpression>
                    </categorySeries>
                </categoryDataset>
                <linePlot>
                    <plot/>
                    <categoryAxisFormat>
                        <axisFormat/>
                    </categoryAxisFormat>
                    <valueAxisFormat>
                        <axisFormat labelColor="#0000CC" tickLabelColor="#0000CC" tickLabelMask="$#,##0" axisLineColor="#0000CC"/>
                    </valueAxisFormat>
                </linePlot>
            </lineChart>
        </axis>
    </multiAxisPlot>
</multiAxisChart>
```

We position the y values with the `position` attribute. 

```xml
<axis position="rightOrBottom">
```
