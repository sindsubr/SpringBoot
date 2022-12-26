CREATE DATABASE `employee_directory`;
USE `employee_directory`;
CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
   `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0;
INSERT INTO `employee_directory`.`employee`(`id`,`first_name`,`last_name`,`email`) VALUES (1,'John','Smith','johnsmith@gmail.com');
INSERT INTO `employee_directory`.`employee`(`id`,`first_name`,`last_name`,`email`) VALUES (2,'Ravi','Kannan','ravi20@gmail.com');
INSERT INTO `employee_directory`.`employee`(`id`,`first_name`,`last_name`,`email`) VALUES (3,'Sneha','Krish','sneha@gmail.com');

