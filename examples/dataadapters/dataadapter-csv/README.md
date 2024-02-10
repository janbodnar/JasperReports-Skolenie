# JasperReports CSV dataadapter 

```xml
 <!-- <property name="com.jaspersoft.studio.data.defaultdataadapter" value="cars-adapter.xml"/> -->
 <property name="net.sf.jasperreports.data.adapter" value="cars-adapter.xml"/>
```

We specify the location of the data adapter.  


```xml
<?xml version="1.0" encoding="UTF-8" ?>

<csvDataAdapter class="net.sf.jasperreports.data.csv.CsvDataAdapterImpl">

    <name>CarsCSVAdapter</name>

    <dataFile xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:type="repositoryDataLocation">
        <location>cars.csv</location>
    </dataFile>

    <recordDelimiter>
</recordDelimiter>
    <fieldDelimiter>,</fieldDelimiter>
    <useFirstRowAsHeader>true</useFirstRowAsHeader>

    <locale xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:java="http://java.sun.com" 
        xsi:type="java:java.lang.String">en_US</locale>
    <timeZone xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:java="http://java.sun.com" 
        xsi:type="java:java.lang.String">Europe/Prague</timeZone>

    <queryExecuterMode>false</queryExecuterMode>
    <columnNames>id</columnNames>
    <columnNames>name</columnNames>
    <columnNames>price</columnNames>

</csvDataAdapter>
```

CSV data adapter
