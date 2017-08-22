create table if not exists employee(
    "id" serial PRIMARY KEY NOT NULL,
    "first_name" VARCHAR NOT NULL,
    "last_name" VARCHAR,
    "age" INTEGER,
    "gender" VARCHAR
)