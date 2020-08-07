CREATE TABLE `details`.`student` (
  `ID` INT NOT NULL,
  `name` VARCHAR(54) NOT NULL,
  `email` VARCHAR(120) NOT NULL,
  `phone` VARCHAR(13) NOT NULL,
  PRIMARY KEY (`ID`));
INSERT INTO `details`.`student` (`ID`, `name`, `email`, `phone`) VALUES ('1', 'ashwin', 'ashwin@gmail.com', '8939386198');
INSERT INTO `details`.`student` (`ID`, `name`, `email`, `phone`) VALUES ('2', 'arjun', 'arjun@gmail.com', '9884991987');
