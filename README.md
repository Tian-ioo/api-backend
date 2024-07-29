后端技术栈
Java Spring Boot
MySQL 数据库
MyBatis-Plus 及 MyBatis X 自动生成
API 签名认证（Http 调用）
Spring Boot Starter（SDK 开发）
Dubbo 分布式（RPC、Nacos）
Swagger + Knife4j 接口文档生成
Spring Cloud Gateway 微服务网关
Hutool、Apache Common Utils、Gson 等工具库

项目模块
easyapi-common ：公共封装类（如公共实体、公共常量，统一响应实体，统一异常处理）
easyapi-backend ：接口管理平台，主要包括用户、接口相关的功能
easyapi-gateway ：网关服务，涉及到网关限流，统一鉴权，统一日志处理，流量染色，接口统计等等
easyapi-interface：接口服务，提供可供调用的接口
easyapi-client-sdk：提供给开发者的 SDK
