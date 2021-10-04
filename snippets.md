# Snippets

## Conditional style

```xml
<style name="Style1" pattern="">
  <conditionalStyle>
    <conditionExpression><![CDATA[$F{name}.startsWith("I") || $F{name}.startsWith("P") ]]></conditionExpression>
    <style isBold="true"/>
  </conditionalStyle>
</style>
  ```

```xml
<style name="alt">
    <conditionalStyle>
        <conditionExpression>
            <![CDATA[$V{COLUMN_COUNT} % 2 == 0]]>
        </conditionExpression>

        <style isBold="true"/>

    </conditionalStyle>
</style>
```
