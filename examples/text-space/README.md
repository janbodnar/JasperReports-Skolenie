# JasperReports text & space

The example shows how to eliminate excessive space in text with regular expressions.  

```groovy
def processText(txt) {

    def data = txt.split(/\R+/)

    $/${data[0]}
 ${data[1..-1].join(" ")}/$
}
```

The `processText` function splits the text by one or more newline characters & builds  
a new string where the content is one newline after the title.  
