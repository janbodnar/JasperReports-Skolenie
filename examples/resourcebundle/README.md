# JasperReports resource bundle

We place the translations into properties files.

```groovy
def bundle = ResourceBundle.getBundle("in18/labels",
            new Locale("sk", "SK"));
def params = ["REPORT_RESOURCE_BUNDLE": bundle]
```
