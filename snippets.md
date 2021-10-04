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
