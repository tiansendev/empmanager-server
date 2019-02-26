-- MySQL dump 10.13  Distrib 5.7.20, for Linux (x86_64)
--
-- Host: localhost    Database: empmanager
-- ------------------------------------------------------
-- Server version	5.7.25-0ubuntu0.16.04.2

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
-- Table structure for table `tb_emp`
--

DROP TABLE IF EXISTS `tb_emp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_emp` (
  `id` varchar(36) NOT NULL,
  `emp_name` varchar(255) DEFAULT NULL,
  `emp_gender` tinyint(4) DEFAULT '0' COMMENT '0:男; 1：女',
  `emp_age` int(3) DEFAULT NULL,
  `emp_code` varchar(255) DEFAULT NULL COMMENT '预留',
  `emp_salary` int(11) DEFAULT NULL COMMENT '薪水 预留',
  `emp_remark` varchar(255) DEFAULT NULL,
  `create_id` varchar(36) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `tb_emp_emp_name_uindex` (`emp_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='员工表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_emp`
--

LOCK TABLES `tb_emp` WRITE;
/*!40000 ALTER TABLE `tb_emp` DISABLE KEYS */;
INSERT INTO `tb_emp` VALUES ('0be7446e38fe11e996cec85b762eb9b9','emp2',0,24,NULL,NULL,NULL,NULL,'2019-02-25 21:05:38','2019-02-25 21:05:38'),('21e95d78390011e996cec85b762eb9b9','emp8',0,88,NULL,NULL,NULL,NULL,'2019-02-25 21:20:34','2019-02-25 21:20:34'),('27dfa53b38ff11e996cec85b762eb9b9','emp5',1,44,NULL,NULL,NULL,NULL,'2019-02-25 21:13:35','2019-02-25 21:13:35'),('3f731c1238fe11e996cec85b762eb9b9','emp234',1,22,NULL,NULL,NULL,NULL,NULL,'2019-02-26 10:34:39'),('a86b55d638fe11e996cec85b762eb9b9','emp4',1,11,NULL,NULL,NULL,NULL,'2019-02-25 21:10:01','2019-02-25 21:10:01');
/*!40000 ALTER TABLE `tb_emp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_manager`
--

DROP TABLE IF EXISTS `tb_manager`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_manager` (
  `id` varchar(36) NOT NULL,
  `mgr_name` varchar(255) NOT NULL,
  `mgr_age` int(3) DEFAULT NULL,
  `gender` tinyint(4) NOT NULL DEFAULT '0' COMMENT '0:男;1: 女',
  `role_id` tinyint(4) DEFAULT '99' COMMENT '100: 系统管理员\n99： 普通注册管理员',
  `mgr_password` varchar(255) NOT NULL COMMENT '密码',
  `mgr_status` tinyint(4) DEFAULT NULL COMMENT '预留',
  `mgr_remark` varchar(255) DEFAULT NULL,
  `create_id` varchar(36) DEFAULT NULL COMMENT '创建人id',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `update_date` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `tb_Manager_mgr_name_uindex` (`mgr_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='管理员';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_manager`
--

LOCK TABLES `tb_manager` WRITE;
/*!40000 ALTER TABLE `tb_manager` DISABLE KEYS */;
INSERT INTO `tb_manager` VALUES ('1','admin1',NULL,0,100,'123456',NULL,'系统默认',NULL,NULL,NULL),('2','admin2',NULL,0,100,'123456',NULL,'系统默认',NULL,NULL,NULL);
/*!40000 ALTER TABLE `tb_manager` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-02-26 19:07:01
