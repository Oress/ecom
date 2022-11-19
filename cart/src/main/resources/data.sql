insert into cart(ID, user_id, last_modified) values (1,'user1', now());
insert into cart(ID, user_id, last_modified) values (2,'user2', now());
insert into cart(ID, user_id, last_modified) values (3,'user3', now());
insert into cart(ID, user_id, last_modified) values (4,'user4', now());
insert into cart(ID, user_id, last_modified) values (5,'user5', now());

insert into product(ID, NAME, BASE, CURRENCY,DISCOUNT,PRODUCT_ID,QUANTITY, CART_ID) values (1,'usr1 product1', 10, 'USD', 0, 'product1', 2, 1);
insert into product(ID, NAME, BASE, CURRENCY,DISCOUNT,PRODUCT_ID,QUANTITY, CART_ID) values (2,'usr1 product2', 15, 'USD', 0, 'product2', 1, 1);
insert into product(ID, NAME, BASE, CURRENCY,DISCOUNT,PRODUCT_ID,QUANTITY, CART_ID) values (3,'usr1 product3', 3, 'USD', 0, 'product3', 3, 1);
insert into product(ID, NAME, BASE, CURRENCY,DISCOUNT,PRODUCT_ID,QUANTITY, CART_ID) values (4,'usr1 product4', 2, 'USD', 0, 'product4', 4, 1);
