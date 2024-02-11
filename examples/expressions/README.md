# Expressions


Report expressions allow us to display calculated data on a report. Calculated  
data is data that is not a static data and is not specifically passed as a  
report parameter or datasource field. Report expressions are built from  
combining report parameters, fields, and static data. The Java language is used  
for writing report expressions by default. Other scripting languages for report  
expressions such as Groovy, JavaScript, or BeanShell are supported by  
JasperReports compilers.  

In a report template, there are several elements that define expressions as:  

 * &lt;variableExpression&gt;
 * &lt;initialValueExpression&gt;
 * &lt;groupExpression&gt;
 * &lt;printWhenExpression&gt;
 * &lt;imageExpression&gt;
 * &lt;textFieldExpression&gt;

`$F{}` - refers to fields  
`$V{}` - refers to variables  
`$P{}` - refers to parameters  
`$R{}` - refers to resource bundle  
