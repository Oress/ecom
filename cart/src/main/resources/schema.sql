/*
create table cart(
    cart_id serial primary key,
    user_id varchar(20),
    last_modified timestamp
);

create table product(
    product_id serial primary key,
    item_id varchar(20),
    item_name varchar(20),
    base_price decimal,
    discount decimal,
    currency varchar(10) default 'USD',
    quantity int
);*/
