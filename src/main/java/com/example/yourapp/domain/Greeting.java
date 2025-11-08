package com.example.yourapp.domain;
//创建json 资源表示类 record   名称+format
public record Greeting<format>(long id, String content  ) {
}
