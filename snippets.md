# Snippets

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
