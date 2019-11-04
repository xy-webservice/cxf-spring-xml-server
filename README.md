# 说明
## 环境：
- jdk8 64bit
- maven3.3.9 64bit
- tomcat8.5 64bit
- sts 3.9.9 

## CXF提供两种服务
### SOAP服务
需要调用者生成客户端代码，服务端使用的是jaxws包
### REST服务
直接返回数据，数据格式可以是xml或者json，服务端使用的是jaxrs包,返回json格式数据需要 jackson-jaxrs-json-provider-2.10.0.jar
