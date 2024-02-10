# Groovy expressions

The language is set with the `language` attribute in the `jasperReport` tag.  

```xml
<jasperReport xmlns="http://jasperreports.sourceforge.net/jasperreports"
              xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
              xsi:schemaLocation="http://jasperreports.sourceforge.net/jasperreports
   http://jasperreports.sourceforge.net/xsd/jasperreport.xsd"
              language="groovy"
              name="report" topMargin="20" bottomMargin="20">
```

Groovy expressions are more powerful and shorter.  

```xml
<textFieldExpression><![CDATA[[5, 6, 7, 8, 9].findAll{it % 2}]]></textFieldExpression>
```
