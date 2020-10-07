CREATE TABLE `details`.`student` (
  `ID` INT NOT NULL,
  `name` VARCHAR(54) NOT NULL,
  `email` VARCHAR(120) NOT NULL,
  `phone` VARCHAR(13) NOT NULL,
  PRIMARY KEY (`ID`));
INSERT INTO `details`.`student` (`ID`, `name`, `email`, `phone`) VALUES ('1', 'ashwin', 'ashwin@gmail.com', '8939386198');
INSERT INTO `details`.`student` (`ID`, `name`, `email`, `phone`) VALUES ('2', 'arjun', 'arjun@gmail.com', '9884991987');
INSERT INTO `details`.`student` (`ID`, `name`, `email`, `phone`) VALUES ('3', 'meenakshi', 'm@gmail.com', '9567101987');
INSERT INTO `details`.`student` (`ID`, `name`, `email`, `phone`) VALUES ('4', 'jayaram', 'j@gmail.com', '9789833077');

CREATE TABLE `details`.`student_marks` (
  `id` INT NOT NULL,
  `English` INT NOT NULL,
  `Maths` INT NOT NULL,
  `Physics` INT NOT NULL,
  `Chemistry` INT NOT NULL,
  `Biology` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `s_id`
    FOREIGN KEY (`id`)
    REFERENCES `details`.`student` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
INSERT INTO `details`.`student_marks` (`id`, `English`, `Maths`, `Physics`, `Chemistry`, `Biology`) VALUES ('1', '100', '98', '89', '96', '87');
INSERT INTO `details`.`student_marks` (`id`, `English`, `Maths`, `Physics`, `Chemistry`, `Biology`) VALUES ('2', '47', '98', '95', '87', '88');
INSERT INTO `details`.`student_marks` (`id`, `English`, `Maths`, `Physics`, `Chemistry`, `Biology`) VALUES ('3', '78', '98', '78', '48', '100');
INSERT INTO `details`.`student_marks` (`id`, `English`, `Maths`, `Physics`, `Chemistry`, `Biology`) VALUES ('4', '87', '98', '98', '52', '100');
