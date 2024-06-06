CREATE DATABASE  IF NOT EXISTS `salon_lepote` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `salon_lepote`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: salon_lepote
-- ------------------------------------------------------
-- Server version	8.0.37

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `klijenat`
--

DROP TABLE IF EXISTS `klijenat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `klijenat` (
  `id_klijenta` int NOT NULL AUTO_INCREMENT,
  `ime` varchar(255) NOT NULL,
  `prezime` varchar(255) NOT NULL,
  `adresa` varchar(255) NOT NULL,
  `Telefon` int NOT NULL,
  PRIMARY KEY (`id_klijenta`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `klijenat`
--

LOCK TABLES `klijenat` WRITE;
/*!40000 ALTER TABLE `klijenat` DISABLE KEYS */;
INSERT INTO `klijenat` VALUES (1,'Marko','Marković','Drinska 1',655544323),(2,'Ana','Anić','Martinska 3',623344123),(3,'Milica','Marković','Majke Jevrosime 27',697788306),(4,'Marta','Milošević','Porodice Nikšić 3',674455123),(5,'Marina','Prvenac','Divizije 12',643344586),(6,'Jelena','Marković','Peke 44',628712334),(7,'Julka','Momić','Kumodraška 265',642737122),(8,'Radomir','Perišić','Miljkova 32',686122883),(9,'Lena','Bitići','Sajam 263',653382912),(10,'Jasmina','Miljković','Brdo67',653312789);
/*!40000 ALTER TABLE `klijenat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stilista`
--

DROP TABLE IF EXISTS `stilista`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stilista` (
  `id_stiliste` int NOT NULL AUTO_INCREMENT,
  `ime` varchar(255) NOT NULL,
  `prezime` varchar(255) NOT NULL,
  `Godine` int NOT NULL,
  `pozicija` varchar(255) NOT NULL,
  `id_usluge` int NOT NULL,
  PRIMARY KEY (`id_stiliste`),
  KEY `idUsluge_idx` (`pozicija`),
  KEY `fkUsluga_idx` (`id_usluge`),
  CONSTRAINT `fkUsluga` FOREIGN KEY (`id_usluge`) REFERENCES `usluga` (`id_usluge`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stilista`
--

LOCK TABLES `stilista` WRITE;
/*!40000 ALTER TABLE `stilista` DISABLE KEYS */;
INSERT INTO `stilista` VALUES (11,'Anđela','Rokvić',23,'Frizer',11),(12,'Staša','Marković',56,'Šminker',12),(13,'Jana','Anić',49,'Manikir',13),(14,'Anja','Trajković',42,'Pedikir',11),(15,'Anastasija','Badža',33,'Frizer',11);
/*!40000 ALTER TABLE `stilista` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `termin`
--

DROP TABLE IF EXISTS `termin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `termin` (
  `id_termina` int NOT NULL AUTO_INCREMENT,
  `datum` varchar(255) NOT NULL,
  `vreme` varchar(255) NOT NULL,
  `id_klijenta` int NOT NULL,
  PRIMARY KEY (`id_termina`),
  KEY `fkKlijenat_idx` (`id_termina`),
  KEY `fkKlijenta_idx` (`id_klijenta`),
  CONSTRAINT `fkKlijenta` FOREIGN KEY (`id_klijenta`) REFERENCES `klijenat` (`id_klijenta`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `termin`
--

LOCK TABLES `termin` WRITE;
/*!40000 ALTER TABLE `termin` DISABLE KEYS */;
INSERT INTO `termin` VALUES (1,'2024-02-02','12:30:00',1),(2,'2024-06-02','11:00:00',1),(3,'2024-06-22','12:30:00',1),(4,'2024-06-18','12:30:00',1),(5,'2024-06-07','10:30:00',1),(6,'2024-06-09','12:00:00',1),(7,'2024-06-01','12:30:00',1),(8,'2024-06-08','09:30:00',1),(9,'2024-06-05','16:30:00',1),(10,'2024-06-09','12:30:00',1);
/*!40000 ALTER TABLE `termin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usluga`
--

DROP TABLE IF EXISTS `usluga`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usluga` (
  `id_usluge` int NOT NULL AUTO_INCREMENT,
  `naziv` varchar(255) NOT NULL,
  `Cena` int NOT NULL,
  PRIMARY KEY (`id_usluge`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usluga`
--

LOCK TABLES `usluga` WRITE;
/*!40000 ALTER TABLE `usluga` DISABLE KEYS */;
INSERT INTO `usluga` VALUES (11,'Frizura',2200),(12,'Šminkanje',3000),(13,'Manikir',2300),(14,'Pedikir',1200),(15,'Šišanje',1400);
/*!40000 ALTER TABLE `usluga` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-06 16:03:04
