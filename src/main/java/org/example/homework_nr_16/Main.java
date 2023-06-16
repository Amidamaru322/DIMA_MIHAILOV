package org.example.homework_nr_16;

public class Main {

    -- homework 16

    create table customer_information(
            customer_id SERIAL primary key,
            name varchar(20),
    surname varchar(20),
    phone_number varchar(9),
    is_active bool
)

    select * from customer_information;

    insert into customer_information (name, surname, phone_number, is_active)
    values
            ('Andrei', 'Ciobanu', '123456789', true),
('Vadim', 'Peev', '234567891', true),
        ('Dima', 'Mihailov', '345678912', true),
        ('Mihail', 'Cioban', '456789123', false),
        ('Var', 'Const', '567891234', true),
        ('Alex', 'Pala', '678912345', false),
        ('Anna', 'Deer', '789123456', true),
        ('John', 'Voxer', '891234567', false),
        ('Eva', 'Elfie', '912345678', false),
        ('Terre', 'Le', '223456789', true);

    drop table customer_information;

-- 5 запрос
    select * from customer_information LIMIT 5;

-- 6 запрос
    select * from customer_information
    where name like 'A%';

-- 7
    select * from customer_information
    where name like 'V%a%r';

-- 8
    select count(*)
    from customer_information
    where is_active = true;

-- 9
    SELECT name, phone_number FROM customer_information;


}
