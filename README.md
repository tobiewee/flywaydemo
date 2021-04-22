# Setup
Install mysql on your machine.

```brew install mysql```

```brew services start mysql```

Login to mysql using:

```mysql -uroot```

Update application.yaml to reflect the username and password under database.

Create a test database: 

```create database test;```

Create a test database: 

```create table test(id bigint not null primary key, title varchar(250));```

NOW YOU ARE READY TO START RUNNING THE APP!