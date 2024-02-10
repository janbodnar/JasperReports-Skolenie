# Sorting data with Groovy built-in tools

The `@Sortable` class annotation is used to make a class Comparable by   
(potentially) multiple Comparators.  


```groovy
@Sortable(includes = ['price', 'name'])
@Immutable
class Car {
    Long id;
    String name;
    int price;
}

cars.sort { c1, c2 -> c2.name <=> c1.name ?: c1.price <=> c2.price }
```
