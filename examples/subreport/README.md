# JasperReports subreport

The example creates a subreport. In the master report, we retrieve all customers. In the  
subreport, we add orders belonging to the customer.  

The subreport must be compiled into `.jasper` file with `JasperCompileManager.compileReportToFile`.  

```xml
<subreport>
    <reportElement x="0" y="40" width="200" height="40"/>
    <subreportParameter name="customerId">
        <subreportParameterExpression><![CDATA[$F{customer_id}]]></subreportParameterExpression>
    </subreportParameter>
    <connectionExpression><![CDATA[$P{REPORT_CONNECTION}]]></connectionExpression>
    <subreportExpression><![CDATA["report_sub.jasper"]]></subreportExpression>
</subreport>
```
We refer to the compiled file in the `<subreportExpression>`.  

```xml
<parameter name="customerId" class="java.lang.Integer" isForPrompting="false"/>
```
The `customerId` from the master report to the subreport is passed in the `<subreportParameterExpression>`.  
The parameter's `isForPrompting` attribute is set to `false`.
