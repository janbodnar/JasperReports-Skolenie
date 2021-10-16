# JasperReports CSV data

In this example, we load data from a CSV file. We use the `JRCsvDataSource` as a datasource.  
We show how to load data with and without column headers.  


```groovy
def fileName = "cars.csv"
def ds = new JRCsvDataSource(fileName)
ds.setUseFirstRowAsHeader(true)
```
The column names can be read from the first line of the CSV file.  

```groovy
def columnNames = ["id", "name", "price"] as String[]
ds.setColumnNames(columnNames)
```
Alternatively, column names can be set with `setColumnNames`.
