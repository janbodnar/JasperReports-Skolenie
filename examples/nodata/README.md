# JasperReports no data

The `<noData>` section can be used in a report when the datasource is empty.  
When there is no data, JasperReports generates a blank page. To generate the `<noData>` section   
with empty datasource, we define the section in the report and set the `whenNoDataType` attribute  
of the jasperReport tag to `NoDataSection`. (The default is `BlankPage`). 
