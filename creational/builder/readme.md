# Builder Design Pattern

When construction gets a little bit too complicated.

One of the most common and frequently used design pattern.

Single objects are simple and can be created in a single constructor call, but if we increase the number of variable inside the class things start to complicate.

What is the motivation behind builder pattern ?

* Large number of variables inside a class.
* There may be a large amount of parameters in a constructor, it is very easy to confuse the order of parameteres.
* If we want to add another optional parameter then we have to add another constructor.

If we use builder pattern we just have to add a single method for every new parameter.

* We construct the object as the lasat step of the process.
* The builder pattern satisfies the inmutable property.
* There can not be any problem of concurrent updates, when dealing with multiple threads.

*When piecewise object construciton is complicated, provide an API for doing it succinctly.*

```
Person p = new Person.Builder().setAge(12).setName("Kevin").build();
```

### Fluent Interface

Note that append() return a builder itself, so this is a fluent API.

Very useful to create chains when construction objects.

```
sb.append("<ul>").append("\n").append("more").append("more");
```

```
// create a Fluent API, we can do chains: addChild(x,x).addChild(y,y).addChild(z,z);
public HtmlBuilder addChild(String childName, String childText) {
    HtmlElement e = new HtmlElement(childName, childText);
    root.elements.add(e);
    return this;
}
```