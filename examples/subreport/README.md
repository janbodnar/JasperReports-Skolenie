# JasperReports subreport

The example creates a subreport. In the master report, we retrieve all customers. In the  
subreport, we add orders belonging to the customer.  

The subreport must be compiled into `.jasper` file with `JasperCompileManager.compileReportToFile`.  

We refer to the compiled file in the `<subreportExpression>`.  

```xml
<subreportExpression><![CDATA["report_sub.jasper"]]></subreportExpression>
```
