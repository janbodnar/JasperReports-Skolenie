# TODO

## Paper sizes

```xml
<jasperReport xmlns="http://jasperreports.sourceforge.net/jasperreports" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://jasperreports.sourceforge.net/jasperreports http://jasperreports.sourceforge.net/xsd/jasperreport.xsd"
name="Float_UP" pageWidth="595" pageHeight="842" columnWidth="555" leftMargin="20" rightMargin="20" topMargin="20" bottomMargin="20">
```

## evaluationTime

The evaluationTime attribute can have one of the following values   

- Now - The text field expression is evaluated when the current band is filled.
- Report - The text field expression is evaluated when the end of the report is reached.
- Page - The text field expression is evaluated when the end of the current page is reached
- Column - The text field expression is evaluated when the end of the current column is reached
- Group - The text field expression is evaluated when the group specified by the evaluationGroup
          attribute (see JREvaluation.getEvaluationGroup()) changes
- Auto - Each variable participating in the text field expression is evaluated at a time
        corresponding to its reset type. Fields are evaluated Now. This evaluation type should be
        used for expressions that combine values evaluated at different times, like the percentage
        out of a total

## paragraph

```xml
<textElement markup="none">
    <paragraph lineSpacing="Single" firstLineIndent="-10" leftIndent="0" spacingBefore="0"/>
</textElement>
```


## Complex expressions

Complex expressions can be replaced with external code.  

```xml
<jasperReport xmlns="http://jasperreports.sourceforge.net/jasperreports" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://jasperreports.sourceforge.net/jasperreports http://jasperreports.sourceforge.net/xsd/jasperreport.xsd" name="Company Profile by Date Registered" pageWidth="595" pageHeight="842" whenNoDataType="NoDataSection" columnWidth="555" leftMargin="20" rightMargin="20" topMargin="20" bottomMargin="20" isFloatColumnFooter="true">
    <property name="ireport.zoom" value="1.0"/>
    <property name="ireport.x" value="0"/>
    <property name="ireport.y" value="0"/>
    <parameter name="daterangefrom" class="java.lang.String">
        <defaultValueExpression><![CDATA[]]></defaultValueExpression>
    </parameter>
    <parameter name="daterangeto" class="java.lang.String">
        <defaultValueExpression><![CDATA[]]></defaultValueExpression>
    </parameter>
    <parameter name="monthy" class="java.lang.String">
        <defaultValueExpression><![CDATA[]]></defaultValueExpression>
    </parameter>
    <parameter name="yrs" class="java.lang.String">
        <defaultValueExpression><![CDATA[]]></defaultValueExpression>
    </parameter>
    <parameter name="quarter" class="java.lang.String">
        <defaultValueExpression><![CDATA[]]></defaultValueExpression>
    </parameter>
    <parameter name="weeks" class="java.lang.String">
        <defaultValueExpression><![CDATA[]]></defaultValueExpression>
    </parameter>
    <queryString>
        <![CDATA[select a.entered,
a.modified,
a.org_id,
a.name,
a.organization_type,
c.description as companygroup,lead,
a.industry_temp_code,
b.description,
a.equity_structure,a.operation_date from organization a
left join lookup_industry_group b on a.industry_temp_code = b.code
left join lookup_company_group c on c.code = a.company_group
left join ticket d on d.org_id = a.org_id
where
((d.entered BETWEEN $P{daterangefrom} AND $P{daterangeto}) or ($P{daterangefrom} =' ' AND $P{daterangeto} =' '))
AND
((datename(month,d.entered) = $P{monthy}) or ($P{monthy} = ' '))
AND
((datename(year,d.entered) = $P{yrs}) or ($P{yrs} = ' '))
AND
((datepart(qq, d.entered) = $P{quarter}) or ($P{quarter} = ' '))
AND
((DATEPART(day, d.entered - 1) / 7 + 1 = $P{weeks}) or  ($P{weeks} = ' '))]]>
    </queryString>
    <field name="entered" class="java.sql.Timestamp"/>
    <field name="modified" class="java.sql.Timestamp"/>
    <field name="org_id" class="java.lang.Integer"/>
    <field name="name" class="java.lang.String"/>
    <field name="organization_type" class="java.lang.String"/>
    <field name="companygroup" class="java.lang.String"/>
    <field name="lead" class="java.lang.String"/>
    <field name="industry_temp_code" class="java.lang.Integer"/>
    <field name="description" class="java.lang.String"/>
    <field name="equity_structure" class="java.lang.String"/>
    <field name="operation_date" class="java.sql.Timestamp"/>
    <title>
        <band height="79" splitType="Stretch">
            <textField isStretchWithOverflow="true" isBlankWhenNull="true">
                <reportElement x="18" y="14" width="537" height="41" isRemoveLineWhenBlank="true"/>
                <textElement/>
                <textFieldExpression><![CDATA[(($P{daterangefrom} != null) && ($P{daterangeto} != null)) ?  "Date range from " + $P{daterangefrom} + " and " + $P{daterangeto}
: (($P{weeks} != null) && ($P{monthy} != null) && ($P{yrs} != null)) ? "For weekly " +$P{weeks} + $P{monthy} + $P{yrs}
: (($P{monthy} != null) && ($P{yrs} != null)) ? "For monthly " + $P{monthy} + $P{yrs}
: (($P{quarter} != null) &&  ($P{yrs} != null)) ? "For quarter " + $P{quarter} + $P{yrs}
: (($P{yrs} != null)) ? "For yearly " + $P{yrs} : null]]></textFieldExpression>
            </textField>
        </band>
    </title>
</jasperReport>
```