# JasperReports filter 

Filter data with Groovy GINQ.

```groovy
def filCars = GQ { 
    from car in cars 
    where car.price > 50000
    select car
} as List
```
