# 날씨 일기 프로젝트
스프링 부트와 OpenWeatherMap api를 이용한 날씨 일기 프로젝트입니다.

일기를 작성할 날짜와 작성할 내용을 입력하면 OpenWeatherMap api에서 해당 날짜의 날씨 정보를 가져와 DB에 저장합니다.

OpenWeatherMap API : https://openweathermap.org/api


## 주요 기능
- OpenWeatherMap API에서 특정 날짜의 날씨 정보 가져오기
- 날씨 일기 CRUD
- 매일 오전 1시마다 날씨 데이터 DB에 저장
- Swagger를 통한 API 명세

## 기술 스택
- Spring
- Spring Boot version 2.7.14
- Spring JPA
- Java version 11
- MySQL
- Swagger