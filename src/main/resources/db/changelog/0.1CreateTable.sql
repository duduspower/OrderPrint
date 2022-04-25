CREATE TABLE address(
    id uuid PRIMARY Key NOT NULL,
    country VARCHAR(50) NOT NULL,
    state VARCHAR(50) NOT NULL,
    postcode VARCHAR(50) NOT NULL,
    street VARCHAR(50) NOT NULL,
    local_number VARCHAR(50) NOT NULL,
    description VARCHAR(50) NOT NULL
);

CREATE TABLE credit_card(
    id uuid PRIMARY KEY NOT NULL,
    credit_card_number VARCHAR(20) NOT NULL,
    expiration_date VARCHAR(6) NOT NULL,
    ccv_number int NOT NULL
);

CREATE TABLE app_order(
    id uuid PRIMARY KEY NOT NULL
);

CREATE TABLE personal_data(
    id uuid PRIMARY Key NOT NULL,
    name VARCHAR(20) NOT NULL,
    surname VARCHAR(20) NOT NULL,
    username VARCHAR(50) NOT NULL
);

CREATE TABLE product(
    id uuid PRIMARY KEY NOT NULL
);

CREATE TABLE user_contact(
    id uuid PRIMARY KEY NOT NULL,
    email VARCHAR(100) NOT NULL,
    phone_number VARCHAR(20) NOT NULL
);

CREATE TABLE app_user(
    id uuid PRIMARY KEY NOT NULL
);