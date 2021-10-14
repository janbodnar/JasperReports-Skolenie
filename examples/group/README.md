# JasperReports Groups

A group helps to build structure in our data.  It is defined by an expression containing fields  
and variables that define the criteria for inclusion in that group.  

The example divides cars into two groups: automatic and manual transmissions.  
For correct output, the data must be sorted. When we create a new group, a new  
`GROUPNAME_COUNT` variable is created; in our case `am_group_COUNT`.  

## Group attributes

* name - references the group in report expressions by name
* isStartNewColumn - each data group begins on a new column
* isStartNewPage - each data group begins on a new page
* isResetPageNumber - the report page number is reset every time a new group starts
* isReprintHeaderOnEachPage -  the group header will be reprinted on every page
* minHeightToStartNewPage - defines minimum amount of vertical space needed at the bottom of the column in order to place the group header on the current column; the amount is specified in report units.
* footerPosition - renders position of the group footer on the page, as well as its behavior in relation to the report sections that follow it (Normal, StackAtBottom, ForceAtBottom, and CollateAtBottom. Default value is Normal)
* keepTogether - prevents the group from splitting on its first break attempt
