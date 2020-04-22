CREATE DATABASE employee_db;

CREATE TABLE `employee_db`.`employee` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `date_of_birth` VARCHAR(45) NOT NULL,
  `age` INT NOT NULL,
  `salary` INT NULL,
  `date_of_join` VARCHAR(45) NULL,
  `year_of_experience` INT NULL,
  `reporting_manager` VARCHAR(45) NULL,
  `address` VARCHAR(45) NULL,
  `city` VARCHAR(45) NULL,
  `country` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE);