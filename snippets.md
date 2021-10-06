# Snippets

## Average variable 

```xml
<variable name="avg" class="java.lang.Integer" calculation="Average">
    <variableExpression><![CDATA[$F{Price}]]></variableExpression>
</variable>
...
<summary>
    <band height="55">
        <staticText>
            <reportElement x="0" y="40" width="120" height="15"/>
            <text><![CDATA[The average price is:]]></text>
        </staticText>
        <textField>
            <reportElement x="125" y="40" width="50" height="15"/>
            <textElement/>
            <textFieldExpression class="java.lang.Integer">
                <![CDATA[$V{avg}]]>
            </textFieldExpression>
        </textField>
    </band>
</summary>
```

## Filter expression

```xml
<field name="Price" class="java.lang.Integer">
    <fieldDescription><![CDATA[price]]></fieldDescription>
</field>

<filterExpression>
    <![CDATA[$F{Price} > 50000]]>
</filterExpression>
```

## Date pattern 

```xml
<summary>
    <band height="47" splitType="Stretch">
        <textField pattern="MMMM d, yyyy">
            <reportElement x="10" y="8" width="100" height="30"/>
            <textFieldExpression><![CDATA[TODAY()]]></textFieldExpression>
        </textField>
    </band>
</summary>
```

## Expressions 

```
IF($F{region} == null, "N/A", $F{region})
```

## Print when expression

For `OR` function we need *jasperreports-functions*  

```xml
<printWhenExpression>
    <![CDATA[ OR($F{Name}.startsWith("B"), $F{Name}.startsWith("A")) ]]>
</printWhenExpression>
```

## Blank when null

```xml
<textField isBlankWhenNull="true">
    <reportElement x="240" y="0" width="100" height="30"/>
    <textElement textAlignment="Right" verticalAlignment="Middle"/>
    <textFieldExpression class="java.lang.Integer">
        <![CDATA[$F{region}]]>
    </textFieldExpression>
</textField>
```

## Break

```xml
<break>
    <reportElement x="0" y="30" width="100" height="1">
        <printWhenExpression><![CDATA[$V{COLUMN_COUNT} == 7]]></printWhenExpression>
    </reportElement>
</break>
```


## Sorting 

```xml
<sortField name="Name" order="Descending"/>
```

## Page numbers 

```xml
<pageFooter>
    <band height="60">
        <textField evaluationTime="Now">
            <reportElement x="0" y="0" width="40" height="30"/>
            <textElement textAlignment="Left"/>
            <textFieldExpression class="java.lang.String">
                <![CDATA["Page " + $V{PAGE_NUMBER}]]></textFieldExpression>
        </textField>

        <textField evaluationTime="Report">
            <reportElement x="45" y="0" width="50" height="30"/>
            <textElement textAlignment="Left"/>
            <textFieldExpression class="java.lang.String"><![CDATA["of " + $V{PAGE_NUMBER}]]></textFieldExpression>
        </textField>

    </band>
</pageFooter>
```


## Conditional style

```xml
<style name="Style1" pattern="">
  <conditionalStyle>
    <conditionExpression><![CDATA[$F{name}.startsWith("I") || $F{name}.startsWith("P") ]]></conditionExpression>
    <style isBold="true"/>
  </conditionalStyle>
</style>
  ```

```xml
<style name="alt">
    <conditionalStyle>
        <conditionExpression>
            <![CDATA[$V{COLUMN_COUNT} % 2 == 0]]>
        </conditionExpression>

        <style isBold="true"/>

    </conditionalStyle>
</style>
```

## Parameter 

```xml 
<parameter name="minPopulation" class="java.lang.Long"/>
...
<filterExpression><![CDATA[$F{population} > $P{minPopulation}]]></filterExpression>
```

## No data

```xml
<jasperReport xmlns="http://jasperreports.sourceforge.net/jasperreports" ... name="countries" pageWidth="595" 
              pageHeight="842" whenNoDataType="NoDataSection" ...>
...
<noData>
  <band height="50">
    <staticText>
      <reportElement x="174" y="15" width="100" height="30"/>
      <text><![CDATA[No data found]]></text>
    </staticText>
  </band>
</noData>
```

## PieChart

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


