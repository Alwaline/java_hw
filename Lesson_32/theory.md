# Inject

* Это включение готового бина в необходимую точку связывания
  * Поле (field inject) - пишем `@Autowired` на поле
  * Сеттер (setter inject) - пишем `@Autowired` на сеттер
  * Конструктор (constructor inject) - пишем `@Autowired` на конструктор
* `@Autowired` - позволяет связать бины между собой автоматически на основе их типов
* В случае конструктора эту аннотацию можно опустить

## Для Tomcat

https://gitlab.com/maxima-it-school/pcs_java_21_01/-/blob/master/Projects/30.%20Java%20Web%20Application/conf/tomcat-users.xml