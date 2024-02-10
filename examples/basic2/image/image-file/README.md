# JasperReports image

Images are added with the `<image>` tag.  

We pass the file path to the `<imageExpression>`. 

```xml
<image>
    <reportElement x="0" y="0" width="250" height="200"/>
    <imageExpression>
        <![CDATA["sid.jpg"]]>
    </imageExpression>
</image>
```
