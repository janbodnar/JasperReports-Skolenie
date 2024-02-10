# Column headers

Column headers are created with the `columnHeader` tag.  The headers are created with `staticText`.  

```xml
<columnHeader>
    <band height="18">
        
        <staticText>
            <reportElement x="0" y="0" width="50" height="15"/>
            <textElement/>
            <text><![CDATA[Id]]></text>
        </staticText>

        <staticText>
            <reportElement x="60" y="0" width="80" height="15"/>
            <textElement/>
            <text><![CDATA[Name]]></text>
        </staticText>

        <staticText>
            <reportElement x="150" y="0" width="80" height="15"/>
            <textElement textAlignment="Right" />
            <text><![CDATA[Price]]></text>
        </staticText>

    </band>
</columnHeader>
```
