-- MySQL dump 10.13  Distrib 5.7.22, for Linux (x86_64)
--
-- Host: localhost    Database: config
-- ------------------------------------------------------
-- Server version	5.7.22

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
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `hash` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'gdwIevWx/Xopnb0FY3ULScns6lYfGZ6PTmbcuIQA4bdXyYV/P2tLTiQsmZ6sBuMN+OrLEtvXMYX9o+I2mHU0Z1tDm5NOjAGuiDHmWhExysVDW4X7XvBe39yT1a1lav/WlNHgzxqY/YNAqeHqZIunGl7vAHz8vSa3AZDmmuMXdDE='),(2,'B0xEiPCcYZvjyzE+J1kNtLUzYTxtxogVIk+E/8NYc11YOhTEcXXqcgjT2QpV6x0DYA8Mk5hKMjbAdSduBGrP3vKLlnkGOLJP0eZNzt3wpp80sQbhDJwUrrdpXkWNThLl1SfgnleKO+CgMbsNd1Po4kXKBCfGcggaKUoauAGdL90='),(3,'bVHdmPAEM3BKVorDdAnPxC4foSUOK1X1I2CNXqog0LR0yOzOAmaqs3FHE1R6tFAsxOwkLMEt/C5hB+ajYVcWSVscT0QuZP+b3f77yMMmeYsxkQwt6Nz4nQtpWW1nwhvJKD0nf48LvlBBLQzDG/5Hx7B1FPrs40jBaCSSFrOxU1g='),(4,'H/9S9dAKUowr1uzN13MVAcbRRYpsnlxyrBeJfw7pUamn2lEk3WOtZEjlnEemhkERYxYshiPCadPMzU5zGffRhig1+j7bfx4dIWf7xKDnjxhgxLO6sjoyg9D8xZOrNU1rybNTFhYjImOROz2g+JFxVnaA98mDLwAvnc/b671sT/4='),(5,'Pw2lle9xEArLdtUrxFhSRfYaiv5oSjZCv8+NcRAmYbtNqXlGG6Ryb+fyIFezCyBewubEI1UfrXC6h8iFBp+r9TdLIFLakuovQnO/5DvD0bGqcY4MwlmRo6lcILSmTRNZHDA6kqUCLSKQjjk63oOH32hPdqTGk4B+VYvodTweSRU='),(6,'IELzcGdgimIQw/8AJ8Z3eu5YKzAJ491uLnXjJ8+pYFts4yzSM+/1aCKYFELSLzabr5obPY675I/HhHT/ckJvW54ZJxBx+Rmb9NMgaP8US8sRohzFMgZOznVqx3RWaUXGobINCip+3InaDGGErPe8XuWul8tRGEStZ+S9H/averU='),(7,'SX1Cnyq06lkJRhPxpQ8eqih841vWjME3nv8olAY5wil02NIxnIOd5u9Iry1PvjEGIKD4j3GNGZW1X3pROLKRpf3DhB+qmymKuqYyeLFZIBF0DUdM4n/m3DqpGMh3XR7eqo/rGTBC5Ckg1pcm5zZ8WfWYxAG6KVJ4WA3fO4iwIUg=');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-11 22:11:59