# Дипломный проект по профессии «Тестировщик»

Автоматизация тестирования комплексного сервиса, взаимодействующего с СУБД и API Банка.

## Начало работы

Чтобы получить локальную копию проекта, необходимо склонировать репозиторий командой 

*git clone git@github.com:EkaterinaEv/Diploma.git*


## Prerequisites

На ПК должны быть установлены и настроены:

- Git
- Браузер Google Chrome
- IntelliJ IDEA
- Docker Desktop

## Установка и запуск

1. Открыть проект Diploma в IntelliJ IDEA

2. В терминале запустить контейнеры Docker командой:
   
*docker-compose up --build*

3. Запустить приложение с БД MySQL из терминала командой:

*java "-Dspring.datasource.url=jdbc:mysql://localhost:3306/app" -jar aqa-shop.jar*

4. Ввести в браузере Сhrome URL http://localhost/8080, чтобы проверить запуск приложения.

5. Запустить тесты с БД MySQL из терминала командой:
   
*./gradlew clean test "-Ddb.url=jdbc:mysql://localhost:3306/app"*

6. Генерация отчетов по тестированию и их просмотр в браузере запускается командой в терминале:

   *./gradlew allureServe*
   
7. Остановить allureServe командой в терминале: *CTRL + C*

8. На запрос "Завершить выполнение пакетного файла [Y(да)/N(нет)]?" ввести в терминале *Y*

9. Запустить приложение с БД PostgresSQL из терминала командой:
   
*java "-Dspring.datasource.url=jdbc:postgresql://localhost:5432/app" -jar aqa-shop.jar*

10. Запустить тесты с БД PostgresSQL из терминала командой:
    
*./gradlew clean test "-Ddb.url=jdbc:postgresql://localhost:5432/app"*

11. Генерация отчетов по тестированию и их просмотр в браузере запускается командой в терминале:

    *./gradlew allureServe*
    
13. Остановить allureServe командой в терминале: *CTRL + C*

14. На запрос "Завершить выполнение пакетного файла [Y(да)/N(нет)]?" ввести в терминале *Y*

15. Остановить приложение из терминала командой: *CTRL + C*
   
16. Остановить контейнеры Docker из терминала командой: *docker-compose down*


* ### [План автоматизации тестирования](https://github.com/EkaterinaEv/Diploma/blob/main/docs/Plan.md#план-автоматизации-тестирования-вэб-сервиса-для-покупки-тура-с-оплатой-дебетовой-или-кредитной-картой)
* ### [Отчёт о проведённом тестировании](https://github.com/EkaterinaEv/Diploma/blob/main/docs/Report.md)
* ### [Отчёт о проведённой автоматизации](https://github.com/EkaterinaEv/Diploma/blob/main/docs/Summary.md)
