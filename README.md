### lambda表达式与匿名内部类的区别与联系

- 联系：
  - lambda表达式创建的对象与匿名内部类生成的对象一样，可以直接调用接口中继承的默认方法。
- 区别：
  - 匿名内部类可以为任意接口创建实例，不管接口中包含多少个抽象方法，只要在匿名内部类中实现所有抽象方法即可。但在lambda表达式中只能为函数式接口创建实例。
  - 匿名内部类可以为抽象类甚至普通类创建实例；但lambda表达式只能为函数式接口创建实例。
  - 匿名内部类实现的抽象方法可以允许调用接口中定义默认方法。但lambda表达式的代码块不允许调用接口中定义默认方法。

