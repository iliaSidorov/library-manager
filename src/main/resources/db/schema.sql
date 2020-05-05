create table book
(
    id         int auto_increment
        primary key,
    title      varchar(45) not null,
    author     varchar(45) not null,
    type       varchar(45) not null,
    student_id int         null
);

create table student
(
    id      int auto_increment
        primary key,
    name    varchar(45) not null,
    faculty varchar(45) not null,
    year    int         not null
);
