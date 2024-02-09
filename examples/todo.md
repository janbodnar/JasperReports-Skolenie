# TODO


## evaluationTime

The evaluationTime attribute can have one of the following values   

- Now - The text field expression is evaluated when the current band is filled.
- Report - The text field expression is evaluated when the end of the report is reached.
- Page - The text field expression is evaluated when the end of the current page is reached
- Column - The text field expression is evaluated when the end of the current column is reached
- Group - The text field expression is evaluated when the group specified by the evaluationGroup
          attribute (see JREvaluation.getEvaluationGroup()) changes
- Auto - Each variable participating in the text field expression is evaluated at a time
        corresponding to its reset type. Fields are evaluated Now. This evaluation type should be
        used for expressions that combine values evaluated at different times, like the percentage
        out of a total
