## 开始写第一个设计模式

- 简单的工厂模式

- 代码如下

```
src/main/java/cn/lightfish/design_patterns/creational/simple_factory
├── Administrator.java
├── Employee.java
├── Manager.java
├── UserDAO.java
├── UserFactory.java
└── User.java
src/test/java/cn/lightfish/design_patterns/creational/simple_factory
└── SimpleFactoryTest.java
```

- 进行测试，设置参数`test`为指定测试类

```s
mvn -Dtest=SimpleFactoryTest test
```

- 本例子使用`junit 4.8.1`