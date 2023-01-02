# Домашнее задание к занятию 7.2: REST: Задача Сервис авторизации
# Домашнее задание к занятию 7.3: Прокси на nginx.
Для выполнения поставленной задачи в секцию servers добавлены следующие диррективы:
(файл nginx.conf добавлен в проект)
~~~
	listen       80;
	#server_name  localhost;

	location / {
		proxy_pass	http://localhost:8080;
	}

	location = /signin {
		root   html;
		try_files  /signin.html $uri = 404;
	}
 ~~~
