# Ввод\вывод в Java

* Stream в терминах IO - это поток данных, который мы можем получать
  * Из файла
  * Из интернета
  * Из устройств

## InputStream

* Абстрактный класс, который описывает логику работы с потоком данных
* У него есть потомок (FileInputStream) который позволяет получить данные из файла.
* Метод `int read()` позволяет считать один байт из входного потока (например, файла)
* Данный байт в случае текстового файла - это Unicode-число для символа
* InputStream читает байты, а не символы. Поэтому он подходит для работы с разными типами файлов (изображения, аудио, видео)
* Почему `read` возвращает `int`, а не `byte`?
  * Потому что разработчикам Java было важно сообщить о конце потока
  * При этом byte имеет диапазон -128 до 127
  * Следовательно, если бы мы использовали тип byte, то положительный байт бы становился отрицательным числом
  * И мы бы не могли понять - -1 это признак конца потока, или байт из файла.
* Также есть еще один метод `int read(byte[] buff)` который считывает байты в массив и возвращает число считанных байтов
* В чем разница между `InputStream` и `FileInputStream` в нашем случае?
  * В класcе `InputStream` есть метод `read()`, который отвечает за чтение данных из потока
  * Важно, что этот метод абстрактный. То есть InputStream не знает о том, как читать данные из потока
  * Потому что он не знает, что это за поток
  * В то же время, в классе `FileInputStream` есть реализация этого метода конкретно для файла.
  * При этом, например для метода `int read(byte[] buff)` в классе `InputStream` есть реализация, но она вызывает нереализованный `read()`
  * Суть - в `InputStream` написано, как считывать байты в массив, но не написан сам процесс считывания
  * При этом в `FileInputStream` не написано, как считывать байты в массив, но написан процесс считывания из файла

## Reader

* Аналогичен `InputStream`, но читает символы в формате Unicode
* Поэтому, если файл текстовый, лучше использовать `Reader`

## BufferedReader

* Обертка над Reader-ом, который буферизирует данные

```
private Reader in; // исходный Reader, например FileReader
 
private char[] cb; // буфер - массив символов
```

* Работает быстро, имеет приятные методы
  