### 核心要点:IOC & AOP

#### 控制反转 IOC

> 第一个需求：查询用户（service通过调用dao查询pojo)
- 实现步骤
  
    1. Spring管理Bean的创建工作,从用户管理变成了框架管理,所以叫做控制反转
    2. Spring框架存放Bean的位置就是IoC Container,所以说Spring也是一个容器
    3. Spring配置Bean的方式:Xml配置,Java配置,注解配置等
    4. Spring除了生成Bean之外,还需要管理整个Bean的生命周期
    5. 应用程序从Ioc Container中获取依赖的Bean,注入到应用程序中,这个过程叫做依赖注入(DI),所以说,IOC是通过DI实现的，IOC是设计思想，DI是实现方式
    6. DI有哪些方式,构造器方式,@Autowired, @Resource, @Qualifier
    
#### 面向切面 AOP

> 第二个需求：给Service所有方法调用添加日志（调用方法时)，本质上是解耦问题；

> 前言
> 
> 没有Spring框架，我们需要在每个service的方法中都添加记录日志的方法 
> 
> 有了Spring框架，通过@Aspect注解 定义了切面，这个切面中定义了拦截所有service中的方法，并记录日志
- 实现步骤
    1. **面向切面编程 - Aspect Oriented Programming (AOP)**就是Spring 框架通过定义切面, 通过拦截切点实现了不同业务模块的解耦
    2. Spring框架又是如何实现AOP的呢？ 这就引入代理技术，分静态代理和动态代理，动态代理又包含JDK代理和CGLIB代理
    
