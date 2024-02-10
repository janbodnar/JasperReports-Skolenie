# Sorting with global parameter


`JRParameter.SORT_FIELDS` is a global Jasper parameter which contains fields by which  
the data is sorted.  

In this example, we sort data by two fields.  


```groovy
def fields = []

def sf1 = new JRDesignSortField()
sf1.setName("Name")
sf1.setOrder(SortOrderEnum.ASCENDING)
sf1.setType(SortFieldTypeEnum.FIELD)
fields.add(sf1)

def sf2 = new JRDesignSortField()
sf2.setName("Price")
sf2.setOrder(SortOrderEnum.ASCENDING)
sf2.setType(SortFieldTypeEnum.FIELD)
fields.add(sf2)

params.put(JRParameter.SORT_FIELDS, fields)
```
