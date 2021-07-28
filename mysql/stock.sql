CREATE TABLE `stock` (
  `ID` int NOT NULL,
  `ticker` varchar(45) NOT NULL,
  `price` float NOT NULL,
  `timeStamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ID`,`ticker`)
);

CREATE TABLE `stockportfolio` (
 
  `ticker` varchar(45) NOT NULL,
  `quantity` int NOT NULL,
  `timeStamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ticker`)
);
