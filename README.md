# SpringMVC + Spring + MyBatis

## SpringMVC

- web.xml
    - DispatcherServlet核心控制器
    ```xml
    <servlet>
        <servlet-name>DispatcherServlet</servlet-name>
        <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
        <init-param>
            <param-name>contextConfigLocation</param-name>
            <param-value>classpath:springMVC.xml</param-value>
        </init-param>
        <load-on-startup>1</load-on-startup>
    </servlet>
    <servlet-mapping>
        <servlet-name>DispatcherServlet</servlet-name>
        <url-pattern>/</url-pattern>
    </servlet-mapping>
    ```
    - HiddenHttpMethodFilter实现REST风格请求方式
    ```xml
    <filter>
        <filter-name>HiddenHttpMethodFilter</filter-name>
        <filter-class>org.springframework.web.filter.HiddenHttpMethodFilter</filter-class>
    </filter>
    <filter-mapping>
        <filter-name>HiddenHttpMethodFilter</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
    ```
    - CharacterEncodingFilter字符编码过滤器
    ```xml
    <filter>
        <filter-name>CharacterEncodingFilter</filter-name>
        <filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
        <init-param>
            <param-name>encoding</param-name>
            <param-value>UTF-8</param-value>
        </init-param>
    </filter>
    <filter-mapping>
        <filter-name>CharacterEncodingFilter</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
    ```
- springMVC.xml
    - context:component-scan扫描控制层组件
    ```xml
    <context:component-scan base-package="com.atguigu.controller"/>
    ```
    - InternalResourceViewResolver视图解析器
    ```xml
    <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        <property name="prefix" value="/WEB-INF/view/"/>
        <property name="suffix" value=".jsp"/>
    </bean>
    ```
    - MultipartResolver文件解析器
    - mvc:default-servlet-handler默认Servlet
    ```xml
    <mvc:default-servlet-handler/>
    ```
    - mvc:annotation-driven驱动MVC
    ```xml
    <mvc:annotation-driven/>
    ```
    - mvc:interceptors拦截器
    ```xml
    <mvc:interceptors>
    ```

## Spring

- web.xml
    - ContextLoaderListener监听器
    ```xml
    <listener>
        <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
    </listener>
    ```
    - context-param指定spring.xml配置文件
    ```xml
    <context-param>
        <param-name>contextConfigLocation</param-name>
        <param-value>classpath:spring.xml</param-value>
    </context-param>
    ```
- spring.xml
    - context:component-scan扫描组件(context:exclude-filter排除控制层)
    ```xml
    <context:component-scan base-package="com.atguigu">
        <context:exclude-filter type="annotation" expression="org.springframework.stereotype.Controller"/>
    </context:component-scan>
    ```
    - context:property-placeholder引入外部资源文件(jdbc.properties)
    ```xml
    <context:property-placeholder location="classpath:jdbc.properties"/>
    ```
    - tx:annotation-driven事务驱动
    ```xml
    <tx:annotation-driven/>
    ```
    - DruidDataSource数据库连接池
    ```xml
    <bean id="druidDataSource" class="com.alibaba.druid.pool.DruidDataSource">
        <property name="driverClassName" value="${jdbc.driverClassName}"/>
        <property name="url" value="${jdbc.url}"/>
        <property name="username" value="${jdbc.username}"/>
        <property name="password" value="${jdbc.password}"/>
    </bean>
    ```
    - DataSourceTransactionManager事务管理器
    ```xml
    <bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
        <property name="dataSource" ref="druidDataSource"/>
    </bean>
    ```

## MyBatis

- mybatis-config.xml
    - settings全局设置
    ```xml
    <settings>
        <setting name="cacheEnabled" value="true"/>
        <setting name="lazyLoadingEnabled" value="true"/>
        <setting name="aggressiveLazyLoading" value="false"/>
    </settings>
    ```
- mapper.java
- mapper.xml
    - cache二级缓存
    - sql
    - resultMap
        - 级联
        - association：javaType|select
        - collection：ofType|select
    - parameterMap
    - select|insert|update|delete
- spring.xml
    - PageInterceptor分页插件
    - SqlSessionFactoryBean管理SqlSession
    ```xml
    <bean class="org.mybatis.spring.SqlSessionFactoryBean">
        <property name="configLocation" value="classpath:mybatis-config.xml"/>
        <property name="dataSource" ref="druidDataSource"/>
        <property name="typeAliasesPackage" value="com.atguigu.bean"/>
        <property name="mapperLocations" value="classpath:/mapper/*.xml"/>
        <property name="plugins">
            <array>
                <bean class="com.github.pagehelper.PageInterceptor"/>
            </array>
        </property>
    </bean>
    ```
    - MapperScannerConfigurer自动扫描映射文件
    ```xml
    <bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
        <property name="basePackage" value="com.atguigu.mapper"/>
    </bean>
    ```