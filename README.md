# 스프링부트 JPA, MySQL, Security 인스타그램

## 의존성

![blog](https://postfiles.pstatic.net/MjAyMDA4MjBfMjYw/MDAxNTk3ODgzMTY5MTcz.yQSBAu7mpathVXgPfmM9QDbIgYwmHwUpbxNIuD3SpXsg.gbPsmSA09ZIi9nEf1pRyOdyxMcvJRaU7Fc_QWN1ntzUg.PNG.haha7037/image.png?type=w966)

## MySQL 세팅

1. MySQL 한글 설정(my.ini)

```ini
[client]
default-character-set=utf8

[mysql]
default-character-set=utf8

[mysqld]
collation-server = utf8_unicode_ci
init-connect='SET NAMES utf8'
init_connect='SET collation_connection = utf8_general_ci'
character-set-server=utf8
```

2. MySQL 데이터베이스 및 사용자 생성

```sql
create user 'insta'@'%' identified by 'bitc5600';
GRANT ALL PRIVILEGES ON 별.별 TO 'insta'@'%';
create database insta;
use insta;
```

## application.yml 설정

```yml
server:
  port: 8080
  servlet:
    context-path: /
    encoding:
      charset: UTF-7
      enabled: true
      force: true

spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/insta?serverTimezone=Asia/Seoul&useSSL=false&allowPublicKeyRetrieval=true
    username: insta
    password: bitc5600

  jpa:
    open-in-view: true
    hibernate:
      ddl-auto: create
      naming:
        physical-strategy: org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
      use-new-id-generator-mappings: false
    show-sql: true

  servlet:
    multipart:
      enabled: true
      max-file-size: 2MB

sunny:
  secret: 1234

  security:
    user:
      name: test
      password: 1234

file:
  path: C:\src\springwork\instagram\src\main\resources\upload
```
