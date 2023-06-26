# Image 

We pass the image to the report as an `InputStream`.  

```groovy
def fis = new File("sid.jpg").newInputStream()

def params = ["mychart" : fis]
def jrPrint = JasperFillManager.fillReport(jrReport, params, 
    new JREmptyDataSource())
```


```xml
<parameter name="mychart" class="java.io.InputStream"/>

<summary>
    <band height="255">
        <image>
            <reportElement x="0" y="0" width="300" height="250"/>
            <imageExpression><![CDATA[$P{mychart}]]></imageExpression>
        </image>
    </band>
</summary>
```
