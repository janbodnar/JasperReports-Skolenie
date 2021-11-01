# JasperReports frame 

With `frame` tag we can create borders around data without creating a full table.  

```xml
<frame>
    <reportElement x="0" y="0" width="350" height="15"/>
    <box>
        <topPen lineWidth="1.0" lineStyle="Solid"/>
        <leftPen lineWidth="1.0" lineStyle="Solid"/>
        <rightPen lineWidth="1.0" lineStyle="Solid"/>
    </box>
</frame>
```
