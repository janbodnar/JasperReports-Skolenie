# JasperReports JDBC connection

Simple example with JDBC connection  

```groovy
@Grab(group='net.sf.jasperreports', module='jasperreports', version='6.17.0')
@Grab(group='org.postgresql', module='postgresql', version='42.2.23')
@GrabConfig(systemClassLoader=true)

import net.sf.jasperreports.engine.JasperCompileManager
import net.sf.jasperreports.engine.JasperFillManager
import net.sf.jasperreports.engine.JasperExportManager
import groovy.sql.Sql

def url = 'jdbc:postgresql://localhost:5432/testdb'
def user = 'postgres'
def password = ''
def driver = 'org.postgresql.Driver'

def sql = Sql.newInstance(url, user, password, driver)

def xmlFile = "report.xml"

def jrReport = JasperCompileManager.compileReport(xmlFile)
def params = [:]
def jrPrint = JasperFillManager.fillReport(jrReport, params, sql.connection)

JasperExportManager.exportReportToPdfFile(jrPrint, "report.pdf")

sql.close()
```

Create JDBC connection  and send to report  

```xml
<queryString language="SQL">
    <![CDATA[SELECT id, price, name FROM cars LIMIT 5]]>
</queryString>
```

Execute query in Jasper XML template file  

