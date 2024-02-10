# JasperReports Excel dataadapter

```xml
<property name="net.sf.jasperreports.data.adapter" value="adapter-excel.xml"/>
```
In the report template, we specify the location of the adapter.  

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<excelDataAdapter class="net.sf.jasperreports.data.excel.ExcelDataAdapterImpl">
    <name>Excel Data Adapter</name>
    <dataFile xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="repositoryDataLocation">
        <location>cars.xlsx</location>
    </dataFile>
    <useFirstRowAsHeader>true</useFirstRowAsHeader>
    <locale xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xmlns:java="http://java.sun.com" xsi:type="java:java.lang.String">en_US</locale>
    <timeZone xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xmlns:java="http://java.sun.com" xsi:type="java:java.lang.String">Europe/Bratislava</timeZone>
    <queryExecuterMode>false</queryExecuterMode>
    <columnNames>id</columnNames>
    <columnNames>name</columnNames>
    <columnNames>price</columnNames>
    <columnIndexes>0</columnIndexes>
    <columnIndexes>1</columnIndexes>
    <columnIndexes>2</columnIndexes>
    <sheetSelection></sheetSelection>
    <format>xlsx</format>
</excelDataAdapter>
```
The adapter file maps to the data of the Excel file.  
