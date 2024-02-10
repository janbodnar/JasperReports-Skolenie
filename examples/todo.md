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
