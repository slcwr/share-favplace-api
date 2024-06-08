CREATE TABLE users(
    id bigserial PRIMARY KEY
    ,email varchar(255) NOT NULL
    ,password varchar(72) NOT NULL
    ,created_at timestamp NOT NULL DEFAULT current_timestamp
    ,updated_at timestamp NOT NULL DEFAULT current_timestamp
);