<?xml version = "1.0" encoding="UTF-8"?>
<!DOCTYPE jasperReport PUBLIC "//JasperReports//DTD Report Design//EN"
        "http://jasperreports.sourceforge.net/dtds/jasperreport.dtd">

<jasperReport xmlns="http://jasperreports.sourceforge.net/jasperreports"
              xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
              xsi:schemaLocation="http://jasperreports.sourceforge.net/jasperreports
   http://jasperreports.sourceforge.net/xsd/jasperreport.xsd"
              language="groovy"
              name="report2" topMargin="20" bottomMargin="20">

    <import value="java.time.LocalDateTime"/>
    <import value="java.time.format.DateTimeFormatter"/>

    <style name="title" vAlign="Middle" hAlign="Center" fontName="DejaVu Sans"/>
    <parameter name="date"/>

    <title>
        <band height="15">
            <textField>
                <reportElement x="0" y="0" width="250" height="15" style="title"/>
                <textElement />
                <textFieldExpression class="java.lang.String">
                    <![CDATA["Экспортировано " + DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss", new Locale("ru", "RU")).format(LocalDateTime.now()) ]]>
                </textFieldExpression>
            </textField>
        </band>
    </title>

</jasperReport>
