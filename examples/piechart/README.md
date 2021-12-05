# JasperReports Pie chart

## Pie chart example

```xml
<summary>
    <band height="260" splitType="Stretch">
        <pieChart>
            <chart evaluationTime="Report">
                <reportElement x="212" y="60" width="200" height="200"/>
                <chartTitle/>
                <chartSubtitle/>
                <chartLegend/>
            </chart>
            <pieDataset>
                <dataset resetType="Report"/>
                <keyExpression><![CDATA[$F{country}]]></keyExpression>
                <valueExpression><![CDATA[$F{count}]]></valueExpression>
            </pieDataset>
            <piePlot>
                <plot/>
                <itemLabel/>
            </piePlot>
        </pieChart>
    </band>
</summary>
```

## Chart title 

```xml
<chartTitle>
    <titleExpression>
       <![CDATA["Employees from countries"]]>
    </titleExpression>
</chartTitle>
```

## Percentages

```xml
<piePlot isShowLabels="true" labelFormat="{2}" legendLabelFormat="{0}">
    <plot/>
    <itemLabel/>
</piePlot>
```
