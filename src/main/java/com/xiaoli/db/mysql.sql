CREATE database jsdb;

use jsdb;

CREATE TABLE user_info(
  user_id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  user_name VARCHAR(20),
  user_age INT,
  user_password VARCHAR(12)
);

INSERT INTO user_info (user_name, user_age, user_password) VALUES
  ('小明', 12, 'xxxxxx'),
  ('小红', 12, 'xxxxxx');

