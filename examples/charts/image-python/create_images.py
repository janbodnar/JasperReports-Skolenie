#!/usr/bin/python

from matplotlib import pyplot as plt
from matplotlib import style

# Bar chart

style.use('ggplot')

x = [0, 1, 2, 3, 4, 5]
y = [46, 38, 29, 22, 13, 11]

fig, ax = plt.subplots()

ax.bar(x, y, align='center')

ax.set_title('Olympic Gold medals in London')
ax.set_ylabel('Gold medals')
ax.set_xlabel('Countries')

ax.set_xticks(x)
ax.set_xticklabels(("USA", "China", "UK", "Russia", 
    "South Korea", "Germany"))

plt.savefig('barchart.png')
plt.close()

# Pie chart
 
labels = ['Oranges', 'Pears', 'Plums', 'Blueberries']
quantity = [38, 45, 24, 10]

colors = ['yellowgreen', 'gold', 'lightskyblue', 'lightcoral']

plt.pie(quantity, labels=labels, colors=colors, autopct='%1.1f%%', 
    shadow=True, startangle=90)

plt.axis('equal')

plt.savefig('piechart.png')

plt.close()

# Horizontal bar chart

x = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
y = [543, 31, 5, 5, 22, 5, 37, 31, 27, 4, 6, 15, 49, 19, 7]

fig, ax = plt.subplots()

oprs = ('Katarakta',
        'PPV /vitrektómia/',
        'Serkláž',
        'Operácia glaukómu',
        'Blefaroplastika',
        'Pterýgium',
        'Chalaseon',
        'Xantelazma',
        'Cysta+tu papil',
        'Entropium, Ektropium',
        'Elektrokoagulácia',
        'Laser sietnice',
        'Jag laser',
        'Iridotómia',
        'Iné',
        )

ax.barh(x, y, align='center', color='b', alpha=0.5)

ax.set_title('Očné operácie v nemocnici Agel Košice-Šaca za r. 2022')
ax.set_xlabel('Počet operácií')

ax.set_yticks(x, labels=oprs)
ax.invert_yaxis()
plt.tight_layout()
plt.savefig("hbar.png", bbox_inches='tight')
