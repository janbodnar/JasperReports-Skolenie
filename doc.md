# JasperReports

Sources

https://github.com/TIBCOSoftware/jasperreports

## Definitions

A *report* is a document containing information organized in a narrative,  
graphic, or tabular form, prepared on ad hoc, periodic, recurring, regular,  
or as required basis.  

JasperReports is a open-source reporting library. It loads data from a  
data source and creates a report from it. The report is a file in a  
 PDF, HTML, RTF, XLS, ODT, CSV, or XML format.  

The JasperReports Library is the world's most popular open source  
reporting engine. It is entirely written in Java and it is able to use  
data coming from any kind of data source and produce pixel-perfect  
documents that can be viewed, printed or exported in a variety of document  
formats including HTML, PDF, Excel, OpenOffice and Word.  

On April 28, 2014, TIBCO announced it had acquired Jaspersoft  
for approximately $185 million.  


# JasperReports library

The JasperReports library is a very powerful and flexible  
report-generating tool that delivers rich content to the screen,  
printer, or file in PDF, HTML, RTF, XLS, ODT, CSV, or XML format.  
The library is written entirely in Java and can be used in a variety  
of Java-enabled applications, including J2EE or web applications,  
to generate dynamic content. Its main purpose  
is to help to create page-oriented, ready-to-print documents in a  
simple and flexible manner  

## Java

Java is a high-level, general-purpose, object-oriented programming language. The  
main design goals of the language were robustness, portability, high performance  
and security. Java is a multithreaded and distributed programming language. It  
can be used to create console applications, GUI applications, web applications,  
both on PCs or embedded systems.  

Java is a programming language created by Sun Microsystems in 1991. The first  
publicly available version of Java was released in 1995. Today, the language is  
developed by Oracle corporation.  

### JVM

Java virtual machine (JVM) executes Java bytecode. The JVM is included in the  
JRE and JDK. Java source code is written in files with the .java extension. The  
*javac* Java compiler will compile the Java source code into the Java *bytecode*;  
the compiled files have the *.class* extension. This bytecode is executed by JVM.  
The java tool is a launcher for Java applications. Oracle's JVM is called  
HotSpot. HotSpot is a Java virtual machine for desktops and servers. It has  
advanced techniques such as just-in-time compilation and adaptive optimization  
designed to improve performance.   

### JRE

JRE (Java Runtime Environment) is a set of tools for executing Java  
applications. The JRE does not contain tools and utilities such as compilers or  
debuggers for developing Java applications. 

### JDK

JDK (Java Development Kit) is a superset of the JRE. It contains JRE and  
tools such as the compilers and debuggers necessary for developing Java  
applications. We need to install JDK to build and run our Java programs.  

## XML
 
 
Extensible Markup Language (XML) is a popular human-readable and  
machine-readable markup language. The design goals of XML emphasize simplicity,  
generality, and usability across the Internet. It is a textual data format with  
strong support via Unicode for different human languages. Originally designed  
for large-scale electronic publishing, XML is widely used in the exchange of a  
large variety of data among software components, systems, and enterprices.  

XML is an industry standard developed by World Wide Web Consortium (W3C). It is  
not tied to any programming language or software vendor. XML is extensible,  
platform-independent, and supports internationalization.  


### Well-formed and valid XML

For an application to accept an XML document, it must be both well formed and  
valid. These terms are defined in the XML 1.0 Recommendation, with XML Schema  
extending the meaning of valid.  
  
To be well formed, an XML document must follow these rules:  

 -   The document must have exactly one root element.
 -   Every element is either self closing (like &lt;br /&gt;) or has a closing tag.
 -   Elements are nested properly (i.e., &lt;p&gt;&lt;em&gt;&lt;/p&gt;&lt;/em&gt; is not allowed).
 -   The document has no angle brackets that are not part of tags. Characters &lt;, &gt;, 
     and & outside of tags are replaced by &lt;, &gt;, and &amp;.
  -  Attribute values are quoted.


To be valid, a document must be well formed, it must have an associated DTD or  
schema, and it must comply with that DTD or schema. Ensuring a document is well  
formed is easy. In this article, we focus on ensuring our documents are valid.  

### XML namespace

XML Namespaces provide a method to avoid element name conflicts.  
XML namespaces are used for providing uniquely named elements and attributes  
in an XML document. They are defined in a W3C recommendation.  
An XML instance may contain element or attribute names from more  
than one XML vocabulary. If each vocabulary is given a namespace,  
the ambiguity between identically named elements or attributes can be resolved.  

```xml
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema">

    <xs:element name="books"/>

</xs:schema>
```

## PostgreSQL

PostgreSQL is a powerful, open source object-relational database system. It is a  
multi-user database management system. It runs on multiple platforms including  
Linux, FreeBSD, Solaris, Microsoft Windows, and Mac OS X. PostgreSQL is  
developed by the PostgreSQL Global Development Group.  

```shell
C:\Users\Jano\opt\postgre>bin\pg_ctl.exe -D data start
C:\Users\Jano\opt\postgre>bin\pg_ctl.exe -D data stop
```

## JasperReports classes

JasperViewer - used to display reports. It represents a simple Java Swing  
application that can load and display reports. It is used in almost all of the  
supplied samples to display the generated documents.  

JRViewer - component used in Swing-based applications to view the reports  
generated by JasperReports.  

JasperReport - instances of this class represent compiled report template  
objects.  

JasperPrint - an instance of this class represents a page-oriented document that  
can be viewed, printed or exported to other formats. When filling report designs  
with data, the engine produces instances of this class and these can be  
transferred over the network, stored in a serialized form on disk or exported to  
various other formats like PDF, HTML, XLS, CSV or XML.  

JasperDesign is used for in-memory representation of a report design.  

JasperCompilerManager - facade class for compiling report designs  
into the ready-to-fill form.  

JasperFillManager - facade class for filling compiled report designs  
with data from report data sources, in order to produce page-oriented  
documents, ready-to-print.  

JasperPrintManager - Facade class for printing reports.  

JRResultSetDataSource - This is a default implementation of the JRDataSource  
interface. Since most reports are generated using data from a relational  
database, JasperReports includes by default this implementation that wraps a  
java.sql.ResultSet object.  

JRAntCompileTask -  built-in Ant task for compiling source JRXML report template  
files into *.jasper files. This task works very similar to the built-in Ant  
Javac task. This task scans source folders and looks up for report template  
files (usually having the JRXML file extension) and compiles them into *.jasper  
files which are placed into a destination folder hierarchy.  

## Report Sections
  
JasperReports works with templates that are structured into multiple  
sections, like any traditional reporting tool. A report can contain the  
following sections: background, title, summary, page header, page footer,  
last page footer, column header and column footer.  
  
At report-filling time, the engine iterates through the virtual records  
of the supplied report data source and renders each report section when  
appropriate, depending on each section's defined behavior.  
  
For instance, the detail section is rendered for each record in the data  
source. When page breaks occur, the page header and page footer sections  
are rendered as needed.  
  
Sections are made of one or more bands. Bands are portions of the report  
template that have a specified height and width and can contain report  
elements like lines, rectangles, images, and text fields. These bands  
are filled repeatedly at report-generating time and make  
up the final document.  
  
When declaring the content and layout of a report section, in an  
JRXML report design, use the generic element <band>.  

### Sections

 * background
 * title
 * pageHeader
 * columnHeader
 * detail
 * columnFooter
 * pageFooter
 * lastPageFooter
 * summary
 * noData


### Elements

The basic building block of a report is the element. An element is a graphical  
object, such as a text string or a rectangle. In Jaspersoft Studio, the concept  
of line or paragraph does not exist, as it does in word processing programs.  
Everything is created by means of elements, which can contain text, create  
tables, display images, and so on. This approach follows the model used by the  
majority of report authoring tools.  


Text fields have an associated expression that is evaluated with every iteration  
in the data source to obtain the text content to be displayed.  

A frame is an element that can contain other elements and optionally draw a  
border around them. Since a frame is a container of other elements, in the  
document outline view the frame is represented as a node containing other  
elements.

## Dataset

The dataset element allows you to define many datasets inside the report,  
each one with its own fields and data source. Every dataset is  
independent from the others, so its fields are separated from the ones  
of the main dataset, and also from the ones of the other datasets  

The main report's SQL can only contain one query  

The report can also contain a subdataset but this subdataset can only be  
used in a chart, table, or crosstab of your report. It can not be access  
by the fields in your main report.  


## Subreport

A subreport is in fact a normal report that has been incorporated into another  
report. You can overlap subreports or make a subreport that contains other  
subreports, up to any level of nesting. Subreports are compiled and filled just  
like normal reports. Any report template can be used as a subreport when  
incorporated into another report template, without anything inside it having to  
change.  

A dataset is a concept that lies somewhere between a data source and a  
subreport. Datasets allow the engine to iterate through some virtual records,  
just as data sources do, but they also enable calculations and data grouping  
during this iteration using variables and groups. Because dataset declarations  
contain parameters, fields, variables, and groups, they closely resemble  
subreports, but they completely lack any visual content (that is, they have no  
sections or layout information at the dataset level).  


## Band types

Title

The title band is the first visible band. It is created only once and  
can be printed on a separate page.  

Page header

The page header band allows you to define a page header. It appears on  
all printed pages in the same position defined during the design phase.  
Title and summary bands do not include the page header when printed  
on a separate page.  

Column Header

The column header band is printed at the beginning of each detail column.  
Usually, labels containing the column names of a tabular report are  
inserted in this band.  

Detail

A detail band corresponds to every record that is read by the datasource  
that feeds the report.  

Column Footer

The column footer band appears at the end of every column.  

Page Footer

The page footer band appears on every page where there is a page header.  

Last Page Footer

If you want to make the last page footer different from the other  
footers, it is possible to use the special last page footer band.  

Summary

The summary band allows you to insert fields concerning total calculations,  
means, or whatever you want to insert at the end of the report. In other  
systems, this band is often named report footer.  

Background

Enables to create watermarks and similareffects (such as a frame around  
the whole page). It can have a maximum height equal to the page height.  

## Detail

As I remember it, you can see the details band as the "model" for a row/record  
in the report. All elements you put inside the detail band will be repeated for  
each record provided by the JRDatasource. The purpose of the detail band is to  
provide you with a model where you place and configure report elements. The  
details band is indeed the band where each element of the data source is  
reported. The report engine automatically iterates over the data source and  
inserts data into the template of the detail band with respective element of the  
data source. The details band is not printed if you have nothing in the data  
source. The printing of the other bands depend on the parameters of the report.  

## Report fields

Report fields are elements, which represent mapping of data between datasource  
and report template. Fields can be combined in the report expressions to obtain  
the desired output. A report template can contain zero or more &lt;field&gt;  
elements. When declaring report fields, the data source should supply data  
corresponding to all the fields ddefined in the report template.  

&lt;reportElement&gt; − These are displayable objects like static texts, text  
fields, images, lines, and rectangles that you put in your report template  
sections.  

## Expressions

Report expressions allow us to display calculated data on a report. Calculated  
data is data that is not a static data and is not specifically passed as a  
report parameter or datasource field. Report expressions are built from  
combining report parameters, fields, and static data. The Java language is used  
for writing report expressions by default. Other scripting languages for report  
expressions such as Groovy, JavaScript, or BeanShell are supported by  
JasperReports compilers.  

In a JRXML report template, there are several elements that  
define expressions as:  

 * &lt;variableExpression&gt;
 * &lt;initialValueExpression&gt;
 * &lt;groupExpression&gt;
 * &lt;printWhenExpression&gt;
 * &lt;imageExpression&gt;
 * &lt;textFieldExpression&gt;

$F{} - refers to fields  
$V{} - refers to variables  
$P{} - refers to parameters  
$R{} - refers to resource bundle  


## Fields, parameters, variables

Parameters are simple input to JasperReports. You have to define parameters in  
the JasperReport before using them. You can display the value of the variable,  
you can use it as part of boolean expressions and you can even pass it to  
subreports. This can be an input to SQL query.  

Fields are simple variable definitions. You can think of these as instance  
variables of the datasource object thats passed in to the report or they can be  
key names if the datasource is a Map. If you configure JasperReport to create  
the dataset based on SQL, then Fields are the column names of the ResultSet. You  
will use Fields to display the resultset of an executed SQL query.  

Variables are another kind of variables that live within Jasper Report, they are  
not inputs. They are used to calculate sum or average of certain Field (defined  
above). You can perform many other predefined calculation functions on the  
Fields using Variables.  


## The subDataset

Subdatasets can have parameters, fields, variables and groups just like a report  
can. Each subdataset can have it's own query, and the report can have as many  
subdatasets as you want.  

To use a subdataset, you need to define a *datasetRun*. This can only be done  
inside particular elements: charts, crosstabs, tables and lists. We will use a  
list as it behaves almost exactly like another detail band.  

The *jr:listContents* element is analogous to a detail band element. You can  
place almost any other elements inside.  

The *datasetRun* element is much like a subreport element. It can have a  
dataSourceExpression or connectionExpression inside, which will change where the  
data comes from. If neither of these are present, the report datasource is used.  

The same subDataset can be used by many datasetRuns, so you can easily run a  
query multiple times with different parameters.  

--- 

When $!P{} is used in your report query, JasperReports will not use this
parameter content through standard JDBC driver parameter binding process.
This will provide flexibility to allow user coding dynamic SQL queries
to meet their report design need.

http://www.tothenew.com/blog/passing-optional-parameters-in-jasper-reports/

---

## List component

List needs only two elements in order to become functional: a dataset run and a
list content.  

*jr:datasetRun* - the dataset run used to store information about list  
datasource/connection/subdataset and various useful parameters.  
The jr: namespace prefix may be omitted in the JRXML template.  

*c:listContents* - this element stores the layout information for list entries.
The layout will be repeated for each row in the dataset. Any JR element may be  
part of a list content.  

## Scriptlets

There are situations when a complex functionality cannot be achieved easily  
using report expressions or variables. Examples of this may be complex String  
manipulations, building of Maps, or Lists of objects in memory or manipulations  
of dates using 3rd party Java APIs. For such situations, JasperReports provides  
us with a simple and powerful means of doing this with Scriptlets.  

Scriptlets are sequences of Java code that are executed every time a report  
event occurs. Values of report variables can be affected through scriptlets.  

Scriptlet is a Java class which extends either one of:  

1. net.sf.jasperreports.engine.JRAbstractScriptlet
2. net.sf.jasperreports.engine.JRDefaultScriptlet.

Using Scriptlet we can use user defined functions in jasper reports.  

---
```xml
<parameter name="SubDataSource" class="net.sf.jasperreports.engine.JRDataSource"/>
...
<datasetRun subDataset="..">
  <dataSourceExpression>$P{SubDataSource}</dataSourceExpression>
</datasetRun>
```

//in your Java code
lParameters.put("SubDataSource", mySubDataSource);


## Multiple queries

When you need to run multiple queries you have the following options:

1) Use subreports. This is the oldest (supported since JasperReports 1.x)
and most powerful method since it allows you to do pretty much anything with
the results of your second query. However it is also laborious and when you
have more then one or two subreports it quickly becomes unmanageable.

2) Use datasets. These allow you to run a separate query, the resultset
can be use in a limited set of components.

Use tables. These are pretty new (introduced in JasperReports 3.7) and
allow you to run a separate query to fill a particular table.
My experience is that in most cases you do not need multiple queries.
Most cases can be handled by a single well defined SQL query. If you need
data from multiple tables you might get away by carefully joining them
in a single query.


## Datasource implementation class

JDBC             net.sf.jasperreports.engine.JRResultSetDataSource
JavaBean         net.sf.jasperreports.engine.data.JRBeanCollectionDataSource, net.sf.jasperreports.engine.data.JRBeanArrayDataSource
Map-based        net.sf.jasperreports.engine.data.JRMapArrayDataSource, net.sf.jasperreports.engine.data.JRMapCollectionDataSource
TableModel       net.sf.jasperreports.engine.data.JRTableModelDataSource
XML              net.sf.jasperreports.engine.data.JRXmlDataSource
CSV              net.sf.jasperreports.engine.data.JRCsvDataSource
XLS              net.sf.jasperreports.engine.data.JRXlsDataSource
Empty            net.sf.jasperreports.engine.JREmptyDataSource


## Standard print formats

LETTER 612×792  
NOTE 540×720  
LEGAL 612×1008  
A0 2380×3368  
A1 1684×2380  
A2 1190×1684  
A3 842×1190  
A4 595×842  
A5 421×595  
A6 297×421  
A7 210×297  
A8 148×210  
A9 105×148  
A10 74×105  
B0 2836×4008  
B1 2004×2836  
B2 1418×2004  
B3 1002×1418  
B4 709×1002  
B5 501×709  
ARCH_E 2592×3456  
ARCH_D 1728×2592  
ARCH_C 1296×1728  
ARCH_B 864×1296  
ARCH_A 648×864  
FLSA 612×936  
FLSE 612×936  
HALFLETTER 396×612  
11X17 792×1224  
LEDGER 1224×792  
 

## Dependencies

antlr - (ANother Tool for Language Recognition) is a powerful parser
         generator for reading, processing, executing, or translating
         structured text or binary files.

Adobe XMP - library for he creation, processing and interchange of
            standardized and custom metadata for digital documents
            and data sets.

Jackson - JSON library for Java

Google ZXing -  barcode encoding/decoding library

itext - Java PDF library

Apache commons - various utility libraries

icu4j - International Component for Unicode for Java (ICU4J) is a mature,
    widely used Java library providing Unicode and Globalization support

persistence-api - The Java Persistence API (JPA) is a Java application
    programming interface specification that describes the management of
    relational data in Java EE and Java SE applications.

javax.servlet-api - API for creating Java web applications using servlets.

Jaxen - Java XPath library

Mondrian - Java Online Analytical Processing server (OLAP)

Barcode4J - is a flexible generator for barcodes written in Java.
Barbecue -  is an open-source, Java library that provides the means to
    create barcodes for printing and display in Java applications.

JExcelApi - is a java library which provides the ability to read,
    write, and modify Microsoft Excel spreadsheets.

Ant - is a software tool for automating software build processes

Apache HttpComponents - library for building custom client and server side HTTP
    services with a minimal footprint.

Apache Lucene - full-featured text search engine library written in Java.

Apache POI - Java libraries for reading and writing files in Microsoft
    Office formats, such as Word, PowerPoint and Excel.

Apache Velocity - general purpose template engine.

Batik is a pure-Java library that can be used to render, generate,
    and manipulate SVG graphics.

bsh - BeanShell is a small, free, embeddable Java source interpreter
    with object scripting language features, written in Java.

Castor - Castor is an open source data binding framework for Java.
    It's the shortest path between Java objects, XML documents and
    relational tables.

Apache Groovy - a powerful, dynamic language for the JVM

ecj - Eclipse Java compiler

hibernate-core - the core O/RM functionality as provided by Hibernate

JFreeChart - Java chart library

Rhino - is an open-source implementation of JavaScript written
entirely in Java.

olap4j - Open Java API for OLAP (Online Analytical Processing)

asm-all ASM is an all purpose Java bytecode manipulation
    and analysis framework.

Spring framework - Java framework for building enterprise applications

Xalan - is an XSLT processor for transforming XML documents into HTML,
    text, or other XML document types
