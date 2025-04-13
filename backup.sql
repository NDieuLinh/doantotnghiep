-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: doantotnghiep
-- ------------------------------------------------------
-- Server version	8.0.34

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
-- Table structure for table `bangchamcong`
--

DROP TABLE IF EXISTS `bangchamcong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bangchamcong` (
  `bcc` int NOT NULL AUTO_INCREMENT,
  `Ncdilam` decimal(2,0) DEFAULT NULL,
  `Thangcc` varchar(10) DEFAULT NULL,
  `MaNV` varchar(6) DEFAULT NULL,
  `Nclephep` decimal(2,0) DEFAULT NULL,
  `XepLoai` varchar(10) DEFAULT NULL,
  `NgayThThem` decimal(3,0) DEFAULT NULL,
  `NgayLeThem` decimal(3,0) DEFAULT NULL,
  PRIMARY KEY (`bcc`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bangchamcong`
--

LOCK TABLES `bangchamcong` WRITE;
/*!40000 ALTER TABLE `bangchamcong` DISABLE KEYS */;
/*!40000 ALTER TABLE `bangchamcong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chucvu`
--

DROP TABLE IF EXISTS `chucvu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chucvu` (
  `MaCV` int NOT NULL AUTO_INCREMENT,
  `TenCV` varchar(30) DEFAULT NULL,
  `HSPCCV` decimal(5,0) DEFAULT NULL,
  PRIMARY KEY (`MaCV`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chucvu`
--

LOCK TABLES `chucvu` WRITE;
/*!40000 ALTER TABLE `chucvu` DISABLE KEYS */;
/*!40000 ALTER TABLE `chucvu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phongban`
--

DROP TABLE IF EXISTS `phongban`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `phongban` (
  `MaPB` int NOT NULL AUTO_INCREMENT,
  `TenPB` varchar(30) DEFAULT NULL,
  `SDT` decimal(12,0) DEFAULT NULL,
  PRIMARY KEY (`MaPB`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phongban`
--

LOCK TABLES `phongban` WRITE;
/*!40000 ALTER TABLE `phongban` DISABLE KEYS */;
/*!40000 ALTER TABLE `phongban` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tanggiamtl`
--

DROP TABLE IF EXISTS `tanggiamtl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tanggiamtl` (
  `malg` int NOT NULL AUTO_INCREMENT,
  `MaNV` varchar(6) DEFAULT NULL,
  `ngaythang` varchar(10) DEFAULT NULL,
  `TKN` decimal(10,0) DEFAULT NULL,
  `TKC` decimal(10,0) DEFAULT NULL,
  `Sotien` decimal(12,0) DEFAULT NULL,
  `DienGiai` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`malg`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tanggiamtl`
--

LOCK TABLES `tanggiamtl` WRITE;
/*!40000 ALTER TABLE `tanggiamtl` DISABLE KEYS */;
/*!40000 ALTER TABLE `tanggiamtl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `thamsotl`
--

DROP TABLE IF EXISTS `thamsotl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `thamsotl` (
  `Thangnam` int NOT NULL AUTO_INCREMENT,
  `Luongcb` decimal(10,0) DEFAULT NULL,
  `Ngcchuan` decimal(3,0) DEFAULT NULL,
  `Giocchuan` decimal(3,0) DEFAULT NULL,
  `HSGioTh` decimal(5,0) DEFAULT NULL,
  `HSGioLe` decimal(5,0) DEFAULT NULL,
  `PCAn` decimal(10,0) DEFAULT NULL,
  `TLBHXH` decimal(5,0) DEFAULT NULL,
  `TLBHYT` decimal(5,0) DEFAULT NULL,
  `TLBHTN` decimal(5,0) DEFAULT NULL,
  `TLKPCD` decimal(5,0) DEFAULT NULL,
  PRIMARY KEY (`Thangnam`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `thamsotl`
--

LOCK TABLES `thamsotl` WRITE;
/*!40000 ALTER TABLE `thamsotl` DISABLE KEYS */;
/*!40000 ALTER TABLE `thamsotl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `thuetncn`
--

DROP TABLE IF EXISTS `thuetncn`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `thuetncn` (
  `Bacthue` int NOT NULL AUTO_INCREMENT,
  `Tu` decimal(10,0) DEFAULT NULL,
  `Den` decimal(10,0) DEFAULT NULL,
  `Thuesuat` decimal(5,0) DEFAULT NULL,
  PRIMARY KEY (`Bacthue`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `thuetncn`
--

LOCK TABLES `thuetncn` WRITE;
/*!40000 ALTER TABLE `thuetncn` DISABLE KEYS */;
/*!40000 ALTER TABLE `thuetncn` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ttcongty`
--

DROP TABLE IF EXISTS `ttcongty`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ttcongty` (
  `TenCT` varchar(45) NOT NULL,
  `TongGD` varchar(45) DEFAULT NULL,
  `PhoTGD` varchar(45) DEFAULT NULL,
  `KTT` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`TenCT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ttcongty`
--

LOCK TABLES `ttcongty` WRITE;
/*!40000 ALTER TABLE `ttcongty` DISABLE KEYS */;
/*!40000 ALTER TABLE `ttcongty` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yemployees`
--

DROP TABLE IF EXISTS `yemployees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `yemployees` (
  `Manv` int NOT NULL AUTO_INCREMENT,
  `Hoten` varchar(30) DEFAULT NULL,
  `Ngaysinh` date DEFAULT NULL,
  `Gioitinh` varchar(3) DEFAULT NULL,
  `Quequan` varchar(40) DEFAULT NULL,
  `Diachi` varchar(45) DEFAULT NULL,
  `MaPB` varchar(6) DEFAULT NULL,
  `MaCV` varchar(6) DEFAULT NULL,
  `HSLuong` decimal(5,0) DEFAULT NULL,
  `MSThue` decimal(2,0) DEFAULT NULL,
  PRIMARY KEY (`Manv`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yemployees`
--

LOCK TABLES `yemployees` WRITE;
/*!40000 ALTER TABLE `yemployees` DISABLE KEYS */;
/*!40000 ALTER TABLE `yemployees` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-04-13 15:20:21
