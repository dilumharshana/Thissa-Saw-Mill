-- MySQL dump 10.13  Distrib 5.7.29, for Win64 (x86_64)
--
-- Host: localhost    Database: bookshop
-- ------------------------------------------------------
-- Server version	5.7.29-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `bookshop`
--

/*!40000 DROP DATABASE IF EXISTS `bookshop`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `bookshop` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `bookshop`;

--
-- Table structure for table `activites`
--

DROP TABLE IF EXISTS `activites`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `activites` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `no` varchar(100) DEFAULT NULL,
  `activity` varchar(249) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `time` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=198 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `activites`
--

LOCK TABLES `activites` WRITE;
/*!40000 ALTER TABLE `activites` DISABLE KEYS */;
INSERT INTO `activites` VALUES (72,'14','14 Loged into system ','2021-01-21','04:59:25 PM'),(73,'14','14 Loged into system ','2021-01-21','05:00:04 PM'),(74,'14','Searched Item : 1','2021-01-21','05:00:06 PM'),(75,'14','Entered 100 as the quantitiy of kos 4*3','2021-01-21','05:00:08 PM'),(76,'14','Searched Item : 2','2021-01-21','05:00:09 PM'),(77,'14','Entered 80 as the quantitiy of ginisapu 7','2021-01-21','05:00:14 PM'),(78,'14','Created a bill','2021-01-21','05:00:52 PM'),(79,'14',' Loged into system ','2021-01-23','12:39:54 AM'),(80,'14','Opend EMPLOYEE window','2021-01-23','12:41:44 AM'),(81,'14','Opend ADVANCED window','2021-01-23','12:42:01 AM'),(82,'14','Selected priyantha from Advanced deal table','2021-01-23','12:42:06 AM'),(83,'14','Opend priyantha Advanced items','2021-01-23','12:42:07 AM'),(84,'14','Took priyantha bill to billing pannel from advaced window ','2021-01-23','12:42:12 AM'),(85,'14','Loged out from the system','2021-01-23','12:44:43 AM'),(86,'14',' Loged into system ','2021-01-25','12:14:13 PM'),(87,'14',' Loged into system ','2021-01-26','01:27:34 AM'),(88,'14',' Loged into system ','2021-01-26','01:28:28 AM'),(89,'14',' Opened STOCKS window ','2021-01-26','01:28:34 AM'),(90,'14',' Refreshed all stocks ','2021-01-26','01:28:43 AM'),(91,'14',' Searched for stock out items less than - 250','2021-01-26','01:28:44 AM'),(92,'14','Opend Stocks Add New Item window','2021-01-26','01:28:59 AM'),(93,'14','Aded thekka to stocks','2021-01-26','01:29:15 AM'),(94,'14','Opend Selling Stocks Items Update window','2021-01-26','01:29:42 AM'),(95,'14','Updated Item name by -thekka 7','2021-01-26','01:29:48 AM'),(96,'14','Refresed stock window','2021-01-26','01:30:26 AM'),(97,'14','Loged out from the system','2021-01-26','01:30:31 AM'),(98,'14',' Loged into system ','2021-01-26','01:37:25 AM'),(99,'14',' Opened STOCKS window ','2021-01-26','01:37:29 AM'),(100,'14','Opend Selling Stocks Items Update window','2021-01-26','01:37:32 AM'),(101,'14',' Loged into system ','2021-01-26','01:41:19 AM'),(102,'14',' Opened STOCKS window ','2021-01-26','01:41:23 AM'),(103,'14','Opend Selling Stocks Items Update window','2021-01-26','01:41:26 AM'),(104,'14',' Opened STOCKS window ','2021-01-26','01:41:40 AM'),(105,'14',' Loged into system ','2021-01-26','01:43:23 AM'),(106,'14',' Opened STOCKS window ','2021-01-26','01:43:32 AM'),(107,'14','Opend Selling Stocks Items Update window','2021-01-26','01:43:34 AM'),(108,'14',' Loged into system ','2021-01-26','01:45:09 AM'),(109,'14',' Opened STOCKS window ','2021-01-26','01:45:13 AM'),(110,'14','Opend Selling Stocks Items Update window','2021-01-26','01:45:16 AM'),(111,'14',' Loged into system ','2021-01-26','01:46:34 AM'),(112,'14',' Opened STOCKS window ','2021-01-26','01:47:41 AM'),(113,'14','Opend Selling Stocks Items Update window','2021-01-26','01:47:45 AM'),(114,'14','Opend EMPLOYEE window','2021-01-26','01:47:51 AM'),(115,'14','Selected kasunfrom employees','2021-01-26','01:47:53 AM'),(116,'14','Opend employee data updator window for employee -kasun','2021-01-26','01:47:55 AM'),(117,'14','Selected kasunfrom employees','2021-01-26','01:48:13 AM'),(118,'14','Opend employee data updator window for employee -kasun','2021-01-26','01:48:15 AM'),(119,'14','Selected kasunfrom employees','2021-01-26','01:48:26 AM'),(120,'14',' Opened STOCKS window ','2021-01-26','01:48:43 AM'),(121,'14','Opend Selling Stocks Items Update window','2021-01-26','01:48:46 AM'),(122,'14',' Opened STOCKS window ','2021-01-26','02:05:20 AM'),(123,'14','Opend Selling Stocks Items Update window','2021-01-26','02:05:42 AM'),(124,'14','Opend Selling Stocks Items Update window','2021-01-26','02:05:53 AM'),(125,'14','Opend ADD STOCKS window ','2021-01-26','02:06:02 AM'),(126,'14','Opend ADD STOCKS window ','2021-01-26','02:06:07 AM'),(127,'14','Opend DEBTORS window','2021-01-26','02:06:11 AM'),(128,'14','Opend Debtors pDetails Update window','2021-01-26','02:06:17 AM'),(129,'14','Opend EMPLOYEE window','2021-01-26','02:09:34 AM'),(130,'14','Open new employee account creator window','2021-01-26','02:09:45 AM'),(131,'14','Registerd an employee name -laal','2021-01-26','02:10:16 AM'),(132,'14','Selected laalfrom employees','2021-01-26','02:10:25 AM'),(133,'14','Deleted 2from emplyooes','2021-01-26','02:10:29 AM'),(134,'14','Open new employee account creator window','2021-01-26','02:10:31 AM'),(135,'14','Registerd an employee name -lal','2021-01-26','02:11:00 AM'),(136,'14','Loged out from the system','2021-01-26','02:11:07 AM'),(137,'17',' Loged into system ','2021-02-07','02:09:55 PM'),(138,'17','Searched Item : 1','2021-02-07','02:10:08 PM'),(139,'17','Entered 25 as the quantitiy of kos','2021-02-07','02:10:14 PM'),(140,'17','Aded 250 discount when bill amount was Rs. 11375.00','2021-02-07','02:10:28 PM'),(141,'17','Created a bill','2021-02-07','02:13:08 PM'),(142,'17','Opend DEBTORS window','2021-02-07','02:13:17 PM'),(143,'17','Opend EMPLOYEE window','2021-02-07','02:20:02 PM'),(144,'17','Searched Item : 1','2021-02-07','02:20:31 PM'),(145,'17','Entered 60 as the quantitiy of kos','2021-02-07','02:20:35 PM'),(146,'17','Aded 250 discount when bill amount was Rs. 27300.00','2021-02-07','02:20:49 PM'),(147,'17','Created a bill','2021-02-07','02:22:27 PM'),(148,'17','Searched Item : 2','2021-02-07','02:22:33 PM'),(149,'17','Entered 25 as the quantitiy of burutha','2021-02-07','02:22:40 PM'),(150,'17','Opend DEBTORS window ','2021-02-07','02:22:45 PM'),(151,'17','Opend New Debtor window','2021-02-07','02:22:52 PM'),(152,'17','Aded new debtor name - chamara','2021-02-07','02:23:35 PM'),(153,'17','Aded new Rs. 22500.00 to 147 account','2021-02-07','02:23:46 PM'),(154,'17','Opened Debtor payment window','2021-02-07','02:24:14 PM'),(155,'17',' Enterd 5000 in to debtor payment box and cheked','2021-02-07','02:24:27 PM'),(156,'17','Opend Debtors payment History window','2021-02-07','02:26:40 PM'),(157,'17','Opend Debtors payment History window','2021-02-07','02:26:40 PM'),(158,'17','Opend Debtors payment History window','2021-02-07','02:26:40 PM'),(159,'17','Opend Debtors payment History window','2021-02-07','02:26:41 PM'),(160,'17',' Loged into system ','2021-02-07','02:29:17 PM'),(161,'17','Searched Item : 2','2021-02-07','02:30:08 PM'),(162,'17','Entered 45 as the quantitiy of burutha','2021-02-07','02:30:15 PM'),(163,'17','Removed buruthafrom billing table','2021-02-07','02:30:22 PM'),(164,'17','Opend ADVANCED window','2021-02-07','02:31:00 PM'),(165,'17','Selected nuwara mudalali from Advanced deal table','2021-02-07','02:31:10 PM'),(166,'17','Selected kasun from Advanced deal table','2021-02-07','02:31:13 PM'),(167,'17','Selected anura from Advanced deal table','2021-02-07','02:31:15 PM'),(168,'17','Selected kasun from Advanced deal table','2021-02-07','02:31:43 PM'),(169,'17','Selected kasun from Advanced deal table','2021-02-07','02:31:55 PM'),(170,'17',' New Rs. Rs. 0.00 aded to kasun account','2021-02-07','02:31:57 PM'),(171,'17','Selected nuwara mudalali from Advanced deal table','2021-02-07','02:32:07 PM'),(172,'17','Took nuwara mudalali bill to billing pannel from advaced window ','2021-02-07','02:32:08 PM'),(173,'17','Aded 1000000 payment when bill amount was Rs. 1073450.00','2021-02-07','02:33:27 PM'),(174,'17','Created a bill','2021-02-07','02:34:56 PM'),(175,'17',' Loged into system ','2021-02-08','04:19:53 PM'),(176,'17','Opend DEBTORS window','2021-02-08','04:19:57 PM'),(177,'17','Opend Debtors payment History window','2021-02-08','04:20:01 PM'),(178,'17','Deleted priyan from debtros when due amount was Rs. 53500.00','2021-02-08','04:20:10 PM'),(179,'17','Searched for c','2021-02-08','04:20:29 PM'),(180,'17','Searched for ','2021-02-08','04:20:30 PM'),(181,'17','Opend ADVANCED window','2021-02-08','04:20:33 PM'),(182,'17','Selected kamal from Advanced deal table','2021-02-08','04:20:39 PM'),(183,'17',' Loged into system ','2021-02-08','04:23:45 PM'),(184,'17','Opend ADVANCED window','2021-02-08','04:23:48 PM'),(185,'17','Selected kasun from Advanced deal table','2021-02-08','04:23:50 PM'),(186,'17','Opend DEBTORS window','2021-02-08','04:24:33 PM'),(187,'17','Deleted chamara from debtros when due amount was Rs. 17500.00','2021-02-08','04:24:38 PM'),(188,'17','Loged out from the system','2021-02-08','04:24:46 PM'),(189,'17',' Loged into system ','2021-02-08','04:29:01 PM'),(190,'17','Opend ADVANCED window','2021-02-08','04:29:07 PM'),(191,'17','Selected nuwara mudalali from Advanced deal table','2021-02-08','04:29:08 PM'),(192,'17',' Loged into system ','2021-02-08','04:31:19 PM'),(193,'17','Opend ADVANCED window','2021-02-08','04:31:28 PM'),(194,'17','Selected priyantha from Advanced deal table','2021-02-08','04:31:29 PM'),(195,'17','Deleted priyantha Advanced account','2021-02-08','04:31:33 PM'),(196,'17',' Loged into system ','2021-02-09','01:51:01 PM'),(197,'17',' Loged into system ','2021-02-09','01:58:25 PM');
/*!40000 ALTER TABLE `activites` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `advanced`
--

DROP TABLE IF EXISTS `advanced`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `advanced` (
  `dealno` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL,
  `phone` varchar(10) DEFAULT NULL,
  `nic` varchar(45) DEFAULT NULL,
  `address` varchar(249) DEFAULT NULL,
  `total` decimal(65,2) DEFAULT NULL,
  `discount` decimal(65,2) DEFAULT NULL,
  `advanced` decimal(65,2) DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`dealno`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `advanced`
--

LOCK TABLES `advanced` WRITE;
/*!40000 ALTER TABLE `advanced` DISABLE KEYS */;
INSERT INTO `advanced` VALUES (32,'anura','','','',262450.00,5000.00,25000.00,'2021-01-21'),(37,'kamal','','','',68750.00,250.00,10000.00,'2021-02-08'),(38,'kasun','','','',62500.00,0.00,5000.00,'2021-02-08'),(39,'new','','','',37500.00,0.00,1500.00,'2021-02-08'),(40,'kkk','','','',40000.00,0.00,1000.00,'2021-02-09'),(41,'jayasri','','','',85750.00,0.00,15000.00,'2021-02-09'),(42,'perera uncle','','','',180000.00,0.00,10000.00,'2021-02-09'),(43,'kumara uncle','','','',80000.00,5600.00,15000.00,'2021-02-09');
/*!40000 ALTER TABLE `advanced` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `advanceditems`
--

DROP TABLE IF EXISTS `advanceditems`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `advanceditems` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dealNo` int(11) DEFAULT NULL,
  `itemCode` varchar(45) DEFAULT NULL,
  `itemName` varchar(45) DEFAULT NULL,
  `quantity` varchar(45) DEFAULT NULL,
  `price` decimal(65,2) DEFAULT NULL,
  `total` decimal(65,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=172 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `advanceditems`
--

LOCK TABLES `advanceditems` WRITE;
/*!40000 ALTER TABLE `advanceditems` DISABLE KEYS */;
INSERT INTO `advanceditems` VALUES (48,126,'1','kos','750',200.00,150000.00),(49,126,'1','kos','750',200.00,150000.00),(50,127,'1','kos','750',200.00,150000.00),(51,14,'1','kos','200',200.00,40000.00),(52,14,'1','kos','250',200.00,50000.00),(53,128,'1','kos 4*3','100',400.00,40000.00),(54,128,'2','ginisapu 7','50',100.00,5000.00),(55,129,'1','kos 4*3','100',400.00,40000.00),(56,15,'1','kos 4*3','100',400.00,40000.00),(57,129,'1','kos 4*3','100',400.00,40000.00),(58,16,'1','kos 4*3','100',400.00,40000.00),(59,16,'2','ginisapu 7','35',100.00,3500.00),(62,130,'1','kos 4*3','100',400.00,40000.00),(63,130,'2','ginisapu 7','200',100.00,20000.00),(64,130,'1','kos 4*3','100',400.00,40000.00),(65,131,'1','kos 4*3','1000',400.00,400000.00),(66,131,'1','kos 4*3','100',400.00,40000.00),(67,131,'1','kos 4*3','100',400.00,40000.00),(69,131,'1','kos 4*3','200',400.00,80000.00),(73,130,'1','kos 4*3','200',400.00,80000.00),(74,132,'1','kos 4*3','100',400.00,40000.00),(76,132,'1','kos 4*3','100',400.00,40000.00),(82,131,'1','kos 4*3','100',400.00,40000.00),(83,133,'1','kos 4*3','100',400.00,40000.00),(84,19,'2','ginisapu 7','50',100.00,5000.00),(85,19,'2','ginisapu 7','500',100.00,50000.00),(86,133,'25','kempas','100',170.00,17000.00),(87,133,'25','kempas','200',170.00,34000.00),(88,134,'25','kempas','100',170.00,17000.00),(89,134,'1','kos 4*3','10',400.00,4000.00),(90,135,'2','ginisapu 7','10',100.00,1000.00),(93,135,'50','wood powder','10',500.00,5000.00),(94,21,'1','kos 4*3','100',400.00,40000.00),(95,21,'2','ginisapu 7','200',100.00,20000.00),(96,21,'1','kos 4*3','100',400.00,40000.00),(97,22,'1','kos 4*3','100',400.00,40000.00),(98,23,'1','kos 4*3','100',400.00,40000.00),(99,24,'1','kos 4*3','100',400.00,40000.00),(100,25,'2','ginisapu 7','350',100.00,35000.00),(101,26,'1','kos 4*3','450',400.00,180000.00),(112,32,'1','kos 4*3','100',400.00,40000.00),(113,32,'2','ginisapu 7','450',100.00,45000.00),(154,32,'1','kos','100',455.00,45500.00),(155,32,'1','kos','150',455.00,68250.00),(156,32,'1','kos','140',455.00,63700.00),(157,37,'1','kos','150',455.00,68250.00),(158,37,'50','wood powder','1',500.00,500.00),(159,38,'1','kos','100',250.00,25000.00),(160,38,'1','kos','150',250.00,37500.00),(161,39,'1','kos','150',250.00,37500.00),(162,40,'50','wood powder','10',500.00,5000.00),(163,40,'25','kempas','100',200.00,20000.00),(164,40,'50','wood powder','10',500.00,5000.00),(165,40,'50','wood powder','20',500.00,10000.00),(166,41,'1','kos','123',250.00,30750.00),(167,41,'50','wood powder','10',500.00,5000.00),(168,41,'50','wood powder','100',500.00,50000.00),(169,42,'2','burutha','200',900.00,180000.00),(170,43,'50','wood powder','100',500.00,50000.00),(171,43,'25','kempas','150',200.00,30000.00);
/*!40000 ALTER TABLE `advanceditems` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `borrow`
--

DROP TABLE IF EXISTS `borrow`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `borrow` (
  `dealNo` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `tp` varchar(12) DEFAULT NULL,
  `nic` varchar(45) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `discount` decimal(65,2) DEFAULT NULL,
  `total` decimal(65,2) DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`dealNo`)
) ENGINE=InnoDB AUTO_INCREMENT=149 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `borrow`
--

LOCK TABLES `borrow` WRITE;
/*!40000 ALTER TABLE `borrow` DISABLE KEYS */;
INSERT INTO `borrow` VALUES (144,'priyantha','0762314588','982335412V','11/A , Kandy Road , Kandy',0.00,36500.00,'2021-01-18'),(148,'prasanna','','','',1000.00,71000.00,'2021-02-09');
/*!40000 ALTER TABLE `borrow` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cashdeals`
--

DROP TABLE IF EXISTS `cashdeals`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cashdeals` (
  `dealNo` int(11) NOT NULL AUTO_INCREMENT,
  `subtotatl` decimal(65,2) DEFAULT NULL,
  `DiscountValue` decimal(65,2) DEFAULT NULL,
  `TotaltValue` decimal(65,2) DEFAULT NULL,
  `paymentValue` decimal(65,2) DEFAULT NULL,
  `BalanceValue` decimal(65,2) DEFAULT NULL,
  `advanced` decimal(65,2) DEFAULT NULL,
  `date` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `name` varchar(249) CHARACTER SET latin1 DEFAULT NULL,
  PRIMARY KEY (`dealNo`)
) ENGINE=InnoDB AUTO_INCREMENT=98 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cashdeals`
--

LOCK TABLES `cashdeals` WRITE;
/*!40000 ALTER TABLE `cashdeals` DISABLE KEYS */;
/*!40000 ALTER TABLE `cashdeals` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cashier_login`
--

DROP TABLE IF EXISTS `cashier_login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cashier_login` (
  `no` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `phone` varchar(10) DEFAULT NULL,
  `id` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `pass` varchar(45) DEFAULT NULL,
  `activity` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `state` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cashier_login`
--

LOCK TABLES `cashier_login` WRITE;
/*!40000 ALTER TABLE `cashier_login` DISABLE KEYS */;
INSERT INTO `cashier_login` VALUES (14,'kasun','0765666546','565656564646','kandy','kasun','2021-01-19 17:28:26',1),(16,'prasanna','0765231257','114455222336','kldjldskfjkljf','prasanna','2021-01-25 08:42:21',1),(17,'chamara','0775044481','982545465V','kandy','jcd','2021-02-07 08:37:56',1);
/*!40000 ALTER TABLE `cashier_login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cashitems`
--

DROP TABLE IF EXISTS `cashitems`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cashitems` (
  `dealCode` int(11) NOT NULL AUTO_INCREMENT,
  `dealNo` int(11) DEFAULT NULL,
  `itemCode` varchar(200) CHARACTER SET latin1 NOT NULL,
  `itemName` varchar(200) CHARACTER SET latin1 DEFAULT NULL,
  `itemPrice` decimal(16,2) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `price` decimal(65,2) DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`dealCode`),
  KEY `dealNo_idx` (`dealNo`)
) ENGINE=InnoDB AUTO_INCREMENT=704 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cashitems`
--

LOCK TABLES `cashitems` WRITE;
/*!40000 ALTER TABLE `cashitems` DISABLE KEYS */;
INSERT INTO `cashitems` VALUES (634,147,'2','burutha',900.00,25,22500.00,'2021-02-07'),(661,146,'1','kos',455.00,100,45500.00,'2021-02-08'),(703,148,'2','burutha',900.00,80,71000.00,'2021-02-09');
/*!40000 ALTER TABLE `cashitems` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cut_stocks`
--

DROP TABLE IF EXISTS `cut_stocks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cut_stocks` (
  `itemCode` varchar(45) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  PRIMARY KEY (`itemCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cut_stocks`
--

LOCK TABLES `cut_stocks` WRITE;
/*!40000 ALTER TABLE `cut_stocks` DISABLE KEYS */;
INSERT INTO `cut_stocks` VALUES ('1','kos',100);
/*!40000 ALTER TABLE `cut_stocks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `emplyoees`
--

DROP TABLE IF EXISTS `emplyoees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `emplyoees` (
  `no` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `phone` varchar(10) DEFAULT NULL,
  `nic` varchar(45) DEFAULT NULL,
  `address` varchar(249) DEFAULT NULL,
  `salary` decimal(65,2) DEFAULT NULL,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emplyoees`
--

LOCK TABLES `emplyoees` WRITE;
/*!40000 ALTER TABLE `emplyoees` DISABLE KEYS */;
INSERT INTO `emplyoees` VALUES (1,'kasun','0766324349','323566565656','nuwara',1500.00),(3,'lal','0762365985','199823214759','kandy',1000.00);
/*!40000 ALTER TABLE `emplyoees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `errors`
--

DROP TABLE IF EXISTS `errors`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `errors` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `error` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=311 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `errors`
--

LOCK TABLES `errors` WRITE;
/*!40000 ALTER TABLE `errors` DISABLE KEYS */;
INSERT INTO `errors` VALUES (289,'java.lang.NullPointerException - borrowers 392'),(290,'java.lang.ArrayIndexOutOfBoundsException: -1 this is not a error  - borrowers 282'),(291,'java.lang.NullPointerExceptionthis is not a error activites 259'),(292,'java.lang.NullPointerExceptionthis is not a error activites 259'),(293,'java.lang.NullPointerExceptionthis is not a error activites 259'),(294,'java.lang.NullPointerExceptionthis is not a error activites 259'),(295,'java.lang.NullPointerExceptionthis is not a error activites 259'),(296,'java.lang.NullPointerExceptionthis is not a error activites 259'),(297,'net.sf.jasperreports.engine.JRException: Invalid page index range: 0 - -1 of 0. Main Frame 893'),(298,'net.sf.jasperreports.engine.JRException: Invalid page index range: 0 - -1 of 0. Main Frame 893'),(299,'net.sf.jasperreports.engine.JRException: Invalid page index range: 0 - -1 of 0. Main Frame 477'),(300,'java.lang.ArrayIndexOutOfBoundsException: -1 this is not a error, advanced 18'),(301,'net.sf.jasperreports.engine.JRException: Invalid page index range: 0 - -1 of 0. Main Frame 477'),(302,'java.lang.NumberFormatException - cashout resons 226'),(303,'net.sf.jasperreports.engine.JRException: Invalid page index range: 0 - -1 of 0. Main Frame 477'),(304,'net.sf.jasperreports.engine.JRException: Invalid page index range: 0 - -1 of 0. Main Frame 477'),(305,'net.sf.jasperreports.engine.JRException: Invalid page index range: 0 - -1 of 0. Main Frame 477'),(306,'java.lang.NumberFormatException - cashout resons 226'),(307,'java.lang.NullPointerException - cashout resons 226'),(308,'java.lang.NumberFormatException - cashout resons 226'),(309,'java.lang.NumberFormatException - cashout resons 226'),(310,'java.lang.NumberFormatException - cashout resons 226');
/*!40000 ALTER TABLE `errors` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `incomedata`
--

DROP TABLE IF EXISTS `incomedata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `incomedata` (
  `incomeCode` int(11) NOT NULL AUTO_INCREMENT,
  `sellIncome` decimal(65,2) DEFAULT NULL,
  `date` varchar(20) NOT NULL,
  `borrowing` decimal(65,2) DEFAULT NULL,
  PRIMARY KEY (`incomeCode`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `incomedata`
--

LOCK TABLES `incomedata` WRITE;
/*!40000 ALTER TABLE `incomedata` DISABLE KEYS */;
INSERT INTO `incomedata` VALUES (67,1500.00,'2021-02-08',0.00),(68,63500.00,'2021-02-09',71000.00);
/*!40000 ALTER TABLE `incomedata` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `outgoing`
--

DROP TABLE IF EXISTS `outgoing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `outgoing` (
  `dealNo` int(11) NOT NULL AUTO_INCREMENT,
  `outgoing` decimal(65,2) DEFAULT NULL,
  `reson` varchar(250) DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`dealNo`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `outgoing`
--

LOCK TABLES `outgoing` WRITE;
/*!40000 ALTER TABLE `outgoing` DISABLE KEYS */;
INSERT INTO `outgoing` VALUES (17,500.00,'tea','2021-01-12'),(18,1500.00,'kama','2021-01-12'),(19,2000.00,'ana','2021-01-12'),(20,300.00,'kama ekak','2021-01-12'),(21,20.00,'pen 2','2021-01-12'),(22,500.00,'tea','2021-01-13'),(23,15000.00,'lunch\n','2021-01-16'),(24,1500.00,'tea','2021-01-31'),(25,1500.00,' klj','2021-02-09'),(27,1300.00,' kama','2021-02-09');
/*!40000 ALTER TABLE `outgoing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pass`
--

DROP TABLE IF EXISTS `pass`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pass` (
  `Id` int(11) NOT NULL,
  `pass` varchar(255) NOT NULL,
  `passState` tinyint(4) DEFAULT NULL,
  `question` varchar(255) DEFAULT NULL,
  `answer` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pass`
--

LOCK TABLES `pass` WRITE;
/*!40000 ALTER TABLE `pass` DISABLE KEYS */;
INSERT INTO `pass` VALUES (1,'75f7fb31e8fff2a9393457757f749b3e',1,'name','tissa'),(2,'574f02bf81a557f25b5346e071cbaef8',1,NULL,NULL);
/*!40000 ALTER TABLE `pass` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payments`
--

DROP TABLE IF EXISTS `payments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `payments` (
  `dealNo` int(11) NOT NULL AUTO_INCREMENT,
  `cusCode` varchar(200) DEFAULT NULL,
  `due` decimal(65,2) DEFAULT NULL,
  `payment` decimal(65,2) DEFAULT NULL,
  `newAmount` decimal(65,2) DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`dealNo`),
  KEY `dealNo` (`dealNo`)
) ENGINE=InnoDB AUTO_INCREMENT=65 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payments`
--

LOCK TABLES `payments` WRITE;
/*!40000 ALTER TABLE `payments` DISABLE KEYS */;
INSERT INTO `payments` VALUES (7,'108',680.00,680.00,0.00,'2021-01-03'),(8,'108',0.00,0.00,0.00,'2021-01-03'),(9,'107',940.00,1000.00,0.00,'2021-01-03'),(10,'107',0.00,0.00,0.00,'2021-01-03'),(11,'110',320.00,20.00,300.00,'2021-01-03'),(12,'110',300.00,200.00,100.00,'2021-01-03'),(14,'110',100.00,0.00,100.00,'2021-01-03'),(15,'122',300000.00,25000.00,275000.00,'2021-01-03'),(16,'122',275000.00,50000.00,225000.00,'2021-01-03'),(17,'122',225000.00,100000.00,125000.00,'2021-01-03'),(18,'122',125000.00,0.00,125000.00,'2021-01-03'),(19,'122',125000.00,25000.00,100000.00,'2021-01-03'),(20,'122',100000.00,30000.00,70000.00,'2021-01-03'),(21,'122',70000.00,100000.00,0.00,'2021-01-03'),(22,'109',3000.00,5000.00,0.00,'2021-01-03'),(23,'110',100.00,100.00,0.00,'2021-01-03'),(24,'123',3700000.00,1000000.00,2700000.00,'2021-01-03'),(25,'123',2700000.00,50000.00,2650000.00,'2021-01-03'),(26,'123',2650000.00,817500.00,1832500.00,'2021-01-03'),(27,'123',1832500.00,1032500.00,800000.00,'2021-01-03'),(28,'123',800000.00,500000.00,300000.00,'2021-01-03'),(29,'123',300000.00,25000.00,275000.00,'2021-01-03'),(30,'123',275000.00,275000.00,0.00,'2021-01-03'),(31,'105',1200.00,1000.00,200.00,'2021-01-10'),(32,'105',200.00,100.00,100.00,'2021-01-10'),(33,'126',150000.00,5000.00,145000.00,'2021-01-10'),(34,'126',145000.00,145000.00,0.00,'2021-01-10'),(35,'128',45000.00,10000.00,35000.00,'2021-01-10'),(36,'128',35000.00,20000.00,15000.00,'2021-01-10'),(37,'128',15000.00,15000.00,0.00,'2021-01-10'),(38,'134',21000.00,5000.00,16000.00,'2021-01-13'),(39,'134',16000.00,1000.00,15000.00,'2021-01-13'),(40,'134',15000.00,1000.00,14000.00,'2021-01-13'),(41,'134',14000.00,4000.00,10000.00,'2021-01-13'),(42,'134',10000.00,2000.00,8000.00,'2021-01-13'),(43,'134',8000.00,2000.00,6000.00,'2021-01-13'),(44,'134',6000.00,6000.00,0.00,'2021-01-13'),(45,'136',5000.00,5000.00,0.00,'2021-01-13'),(46,'138',60000.00,15000.00,45000.00,'2021-01-13'),(47,'140',120000.00,10000.00,110000.00,'2021-01-13'),(48,'145',55000.00,1000.00,54000.00,'2021-01-16'),(49,'145',54000.00,20000.00,34000.00,'2021-01-16'),(50,'145',34000.00,15000.00,19000.00,'2021-01-16'),(51,'145',19000.00,19000.00,0.00,'2021-01-16'),(52,'144',400000.00,15000.00,385000.00,'2021-01-18'),(53,'144',385000.00,15500.00,369500.00,'2021-01-18'),(54,'144',369500.00,8000.00,361500.00,'2021-01-18'),(55,'146',15000.00,15000.00,0.00,'2021-01-20'),(56,'146',278000.00,78000.00,200000.00,'2021-01-26'),(57,'146',200000.00,50000.00,150000.00,'2021-01-26'),(58,'146',150000.00,150000.00,0.00,'2021-01-26'),(59,'145',40000.00,40000.00,0.00,'2021-01-26'),(60,'144',361500.00,50000.00,311500.00,'2021-01-26'),(61,'144',311500.00,200000.00,111500.00,'2021-01-27'),(62,'144',111500.00,50000.00,61500.00,'2021-01-27'),(63,'147',22500.00,5000.00,17500.00,'2021-02-07'),(64,'144',61500.00,25000.00,36500.00,'2021-02-09');
/*!40000 ALTER TABLE `payments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `raw_stocks`
--

DROP TABLE IF EXISTS `raw_stocks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `raw_stocks` (
  `itemcode` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  PRIMARY KEY (`itemcode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `raw_stocks`
--

LOCK TABLES `raw_stocks` WRITE;
/*!40000 ALTER TABLE `raw_stocks` DISABLE KEYS */;
INSERT INTO `raw_stocks` VALUES (23,'kos5',523);
/*!40000 ALTER TABLE `raw_stocks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stocks`
--

DROP TABLE IF EXISTS `stocks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stocks` (
  `itemcode` varchar(200) NOT NULL,
  `name` varchar(200) NOT NULL,
  `sellprice` decimal(65,2) DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  PRIMARY KEY (`itemcode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stocks`
--

LOCK TABLES `stocks` WRITE;
/*!40000 ALTER TABLE `stocks` DISABLE KEYS */;
INSERT INTO `stocks` VALUES ('1','kos',250.00,1300),('2','burutha',900.00,120),('25','kempas',200.00,1500),('3','thekka',150.00,200),('50','wood powder',500.00,300);
/*!40000 ALTER TABLE `stocks` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-02-09 17:20:41
