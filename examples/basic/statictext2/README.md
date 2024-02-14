# StaticText

The `net.sf.jasperreports.default.left.indent` defines the default text indent.


## reportElement

`reportElement` is an element used to specify the common properties of an  
object on the report 

Attributes:  

- x
- y 
- width
- height
- key
- stretchType
- positionType
- isPrintRepeatedValues
- mode
- isRemoveLineWhenBlank
- isPrintInFirstWholeBand
- printWhenGroupChanges
- forecolor (black, blue, cyan, darkGray, gray, green, lightGray, magenta,  
    orange, pink, red, yellow, white)
- backcolor
 

## textElement

`textElement` is used to specify the common properties of a text object on the  
report `staticText` or `textField`. 

```xml 
<textElement textAlignment="Left" verticalAlignment="Top" rotation="None" lineSpacing="Single">
    <font fontName="Arial" pdfFontName="Helvetica" size="10" isBold="false" isItalic="false" 
        isUnderline="false" isPdfEmbedded ="false" pdfEncoding ="Cp1252" isStrikeThrough="false" />
</textElement>
```

It is recommended to use styles instead.  
