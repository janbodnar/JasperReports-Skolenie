# JasperReports styles

Styles are created with `<style>` tags.  

```xml
<style name="header" fontSize="10" hAlign="Center" vAlign="Middle" isBold="true"/>
<style name="hback" mode="Opaque" backcolor="#546e99"/>

<style name="row" hAlign="Center" vAlign="Middle"/>
<style name="rback" mode="Opaque" backcolor="#E5ECF9"/>
```

They are applied on `<reportElement>` with `style` attributes. 

```xml
<reportElement x="0" y="0" width="50" height="15" style="row"/>
 ```
