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
  `english` INT NOT NULL,
  `physics` INT NOT NULL,
  `chemistry` INT NOT NULL,
  `biology` INT NOT NULL,
  `maths` INT NOT NULL,
  `ID` INT NOT NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `id`
    FOREIGN KEY (`ID`)
    REFERENCES `details`.`student` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


INSERT INTO `details`.`student_marks` (`english`, `physics`, `chemistry`, `biology`, `maths`, `ID`) VALUES ('97', '87', '88', '93', '87', '1');
INSERT INTO `details`.`student_marks` (`english`, `physics`, `chemistry`, `biology`, `maths`, `ID`) VALUES ('98', '68', '95', '89', '78', '2');
INSERT INTO `details`.`student_marks` (`english`, `physics`, `chemistry`, `biology`, `maths`, `ID`) VALUES ('89', '88', '97', '98', '98', '3');
INSERT INTO `details`.`student_marks` (`english`, `physics`, `chemistry`, `biology`, `maths`, `ID`) VALUES ('87', '98', '98', '96', '95', '4');


