use hastane_otomasyonu;

CREATE TABLE `hastane_otomasyonu`.`admin8` (
  `register_id` INT NOT NULL AUTO_INCREMENT,
  `register_name` VARCHAR(450) NULL,
  `register_surname` VARCHAR(150) NULL,
  `register_email_address` VARCHAR(100) NULL,
  `register_password` VARCHAR(100) NULL,
  `creation_date` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`register_id`));
