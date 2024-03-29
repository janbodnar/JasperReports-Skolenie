# Map data sources

The template fields are mapped to the keys of the maps.

```xml
<field name="id" class="java.lang.Integer">
    <fieldDescription><![CDATA[id]]></fieldDescription>
</field>

<field name="name">
    <fieldDescription><![CDATA[name]]></fieldDescription>
</field>

<field name="occupation">
    <fieldDescription><![CDATA[occupation]]></fieldDescription>
</field>
```

The field names are: `id`, `name`, and `occupation`.


## JRMapCollectionDataSource

```groovy
def users = [
    ['id': 1, 'name': 'John Doe', 'occupation': 'gardener'],
    ['id': 2, 'name': 'Roger Roe', 'occupation': 'driver'],
    ['id': 3, 'name': 'Jane Doe', 'occupation': 'teacher'],
    ['id': 4, 'name': 'Tomas Mudry', 'occupation': 'shopkeeper'],
    ['id': 5, 'name': 'Paul Smith', 'occupation': 'programmer'],
    ['id': 6, 'name': 'Roman Nikolaj', 'occupation': 'programmer'],
    ['id': 7, 'name': 'Lucia Smutna', 'occupation': 'student'],
    ['id': 8, 'name': 'Kevin Smith', 'occupation': 'manager'],
]

def ds = new JRMapCollectionDataSource(users)
```

## JRMapArrayDataSource

```groovy
Map[] users = [
    ['id': 1, 'name': 'John Doe', 'occupation': 'gardener'],
    ['id': 2, 'name': 'Roger Roe', 'occupation': 'driver'],
    ['id': 3, 'name': 'Jane Doe', 'occupation': 'teacher'],
    ['id': 4, 'name': 'Tomas Mudry', 'occupation': 'shopkeeper'],
    ['id': 5, 'name': 'Paul Smith', 'occupation': 'programmer'],
    ['id': 6, 'name': 'Roman Nikolaj', 'occupation': 'programmer'],
    ['id': 7, 'name': 'Lucia Smutna', 'occupation': 'student'],
    ['id': 8, 'name': 'Kevin Smith', 'occupation': 'Manager'],
]

def ds = new JRMapArrayDataSource(users)
```