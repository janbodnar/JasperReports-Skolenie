# JasperReports templates

Styles can be externalized in template files. The template files use the `<jasperTemplate>` tag and  
have `.jrtx` file extensions.  

```xml
<jasperTemplate>

    <style name="header" fontSize="10" hAlign="Center" vAlign="Middle" isBold="true"/>
    <style name="hback" mode="Opaque" backcolor="#546e99"/>

    <style name="row" hAlign="Center" vAlign="Middle"/>
    <style name="rback" mode="Opaque" backcolor="#E5ECF9"/>

</jasperTemplate>
```

Templates are included with `<template>` tags.  

```xml
<template><![CDATA["styles.jrtx"]]></template>
```
