CREATE DATABASE  IF NOT EXISTS `steem` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `steem`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: steem
-- ------------------------------------------------------
-- Server version	5.1.45-community

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
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `us_id` int(11) NOT NULL AUTO_INCREMENT,
  `us_firstname` varchar(55) NOT NULL,
  `us_lastname` varchar(55) NOT NULL,
  `us_gender` varchar(45) DEFAULT NULL,
  `us_age` int(11) DEFAULT NULL,
  `us_country` varchar(80) DEFAULT NULL,
  `us_email` varchar(90) DEFAULT NULL,
  `us_mobilenumber` varchar(10) DEFAULT NULL,
  `us_description` varchar(800) DEFAULT NULL,
  `us_steempoints` int(11) DEFAULT NULL,
  `us_username` varchar(45) DEFAULT NULL,
  `us_password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`us_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`us_id`, `us_firstname`, `us_lastname`, `us_gender`, `us_age`, `us_country`, `us_email`, `us_mobilenumber`, `us_description`, `us_steempoints`, `us_username`, `us_password`) VALUES (1,'Nimisha ','Panth','Female',21,'India','nim@gmail.com','9856645454','Forget Project.Play Games!!!',123,'the_BLACKJACK','1234'),(2,'Soumyadeep','Paul','Male',22,'India','som@gmail.com','7896214532','Play.Eat.Sleep.Play.Repeat',100,'Wanna_Escape','1234'),(3,'Saikat','Singha Mahapatra','Male',22,'India','saik@gmail.com','7894545612','Time to Rule And Conquer!!!!',145,'Kaitas','1234');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-27 15:51:52

CREATE DATABASE  IF NOT EXISTS `steem` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `steem`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: steem
-- ------------------------------------------------------
-- Server version	5.1.45-community

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
-- Table structure for table `comment`
--

DROP TABLE IF EXISTS `comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comment` (
  `co_id` int(11) NOT NULL AUTO_INCREMENT,
  `co_content` text NOT NULL,
  `co_us_id` int(11) NOT NULL,
  `co_po_id` int(11) NOT NULL,
  PRIMARY KEY (`co_id`),
  KEY `co_us_id` (`co_us_id`),
  KEY `co_po_id` (`co_po_id`),
  CONSTRAINT `co_us_id` FOREIGN KEY (`co_us_id`) REFERENCES `user` (`us_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `co_po_id` FOREIGN KEY (`co_po_id`) REFERENCES `post` (`po_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comment`
--

LOCK TABLES `comment` WRITE;
/*!40000 ALTER TABLE `comment` DISABLE KEYS */;
INSERT INTO `comment` (`co_id`, `co_content`, `co_us_id`, `co_po_id`) VALUES (27,'Sniper ready in the Arena.Anyone Here???!!!!',3,5),(28,'Trading needs $200.Not Allowed in this Forum',2,2),(29,'Deployed in the Arena.....',1,3);
/*!40000 ALTER TABLE `comment` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-27 15:51:49
CREATE DATABASE  IF NOT EXISTS `steem` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `steem`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: steem
-- ------------------------------------------------------
-- Server version	5.1.45-community

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
-- Table structure for table `friend`
--

DROP TABLE IF EXISTS `friend`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `friend` (
  `fr_id` int(11) NOT NULL AUTO_INCREMENT,
  `fr_us_id` int(11) NOT NULL,
  `fr_fr_id` int(11) NOT NULL,
  PRIMARY KEY (`fr_id`),
  KEY `fr_us_id` (`fr_us_id`),
  KEY `fr_fr_id` (`fr_fr_id`),
  CONSTRAINT `fr_us_id` FOREIGN KEY (`fr_us_id`) REFERENCES `user` (`us_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fr_fr_id` FOREIGN KEY (`fr_fr_id`) REFERENCES `user` (`us_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `friend`
--

LOCK TABLES `friend` WRITE;
/*!40000 ALTER TABLE `friend` DISABLE KEYS */;
INSERT INTO `friend` (`fr_id`, `fr_us_id`, `fr_fr_id`) VALUES (1,1,2),(2,2,1),(3,1,3),(4,2,3),(5,3,1),(6,3,2);
/*!40000 ALTER TABLE `friend` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-27 15:51:55
CREATE DATABASE  IF NOT EXISTS `steem` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `steem`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: steem
-- ------------------------------------------------------
-- Server version	5.1.45-community

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
-- Table structure for table `game`
--

DROP TABLE IF EXISTS `game`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `game` (
  `ga_id` int(11) NOT NULL AUTO_INCREMENT,
  `ga_name` varchar(90) DEFAULT NULL,
  `ga_description` varchar(1000) DEFAULT NULL,
  `ga_about` varchar(800) DEFAULT NULL,
  `ga_price` int(11) DEFAULT NULL,
  `ga_rating` int(11) DEFAULT NULL,
  `ga_developer` varchar(45) DEFAULT NULL,
  `ga_year` int(11) DEFAULT NULL,
  `ga_genre` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`ga_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `game`
--

LOCK TABLES `game` WRITE;
/*!40000 ALTER TABLE `game` DISABLE KEYS */;
INSERT INTO `game` (`ga_id`, `ga_name`, `ga_description`, `ga_about`, `ga_price`, `ga_rating`, `ga_developer`, `ga_year`, `ga_genre`) VALUES (1,'Team Fortress 2','Nine distinct classes provide range of tactical abilities.','Best Game Ever',550,9,'Valve Corporation',2007,'First-person Shooter'),(2,'PUBG','PUBG is a battle royale shooter.','Best Multiplayer game',650,9,'Bluehole',2017,'Battle Royale'),(3,'Counter-Strike: GO','CS:GO will expand upon the team-based action gameplay.','Team-based action gameplay',720,9,'Hidden Path Entertainment',2012,'First-person Shooter'),(4,'Dota 2','Players worldwide enter battle over a hundred Dota heroes.','The most-played game on Steam.',640,8,'Valve Corporation',2013,'Multiplayer Online Battle Arena'),(5,'STAR WARS','Climb on and experience the pure adrenaline-pumping excitement.','One Champion. No Limits.',700,8,'Petroglyph Games',2007,'Real-time Strategy'),(6,'Call of Duty: MW','Remastered in true high-definition & improved textures.','Most critically-acclaimed games.',800,8,'Infinity Ward',2009,'First-person Shooter'),(7,'Left 4 Dead 2','Set in the zombie apocalypse.','Best action horror.',500,8,'Valve Corporation',2009,'First-person Shooter,Survival Horror'),(8,'Assassin\'s Creed Unity','Set in the city of Paris,the French Revolution.','Best action/adventure game.',540,8,'Ubisoft Montreal',2014,'Action,Adventure');
/*!40000 ALTER TABLE `game` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-27 15:51:50
CREATE DATABASE  IF NOT EXISTS `steem` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `steem`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: steem
-- ------------------------------------------------------
-- Server version	5.1.45-community

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
-- Table structure for table `gameusers`
--

DROP TABLE IF EXISTS `gameusers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gameusers` (
  `gu_id` int(11) NOT NULL AUTO_INCREMENT,
  `gu_ga_id` int(11) NOT NULL,
  `gu_us_id` int(11) NOT NULL,
  PRIMARY KEY (`gu_id`),
  KEY `gu_ga_id` (`gu_ga_id`),
  KEY `gu_us_id` (`gu_us_id`),
  CONSTRAINT `gu_ga_id` FOREIGN KEY (`gu_ga_id`) REFERENCES `game` (`ga_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `gu_us_id` FOREIGN KEY (`gu_us_id`) REFERENCES `user` (`us_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gameusers`
--

LOCK TABLES `gameusers` WRITE;
/*!40000 ALTER TABLE `gameusers` DISABLE KEYS */;
INSERT INTO `gameusers` (`gu_id`, `gu_ga_id`, `gu_us_id`) VALUES (1,2,1),(2,3,1),(3,7,1),(4,8,1),(5,5,1),(6,1,2),(7,4,2),(8,5,2),(9,7,2),(10,8,3),(11,3,3),(12,4,3);
/*!40000 ALTER TABLE `gameusers` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-27 15:51:56
CREATE DATABASE  IF NOT EXISTS `steem` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `steem`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: steem
-- ------------------------------------------------------
-- Server version	5.1.45-community

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
-- Table structure for table `post`
--

DROP TABLE IF EXISTS `post`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `post` (
  `po_id` int(11) NOT NULL AUTO_INCREMENT,
  `po_content` text NOT NULL,
  `po_us_id` int(11) NOT NULL,
  `po_title` text NOT NULL,
  PRIMARY KEY (`po_id`),
  KEY `po_us_id` (`po_us_id`),
  CONSTRAINT `po_us_id` FOREIGN KEY (`po_us_id`) REFERENCES `user` (`us_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `post`
--

LOCK TABLES `post` WRITE;
/*!40000 ALTER TABLE `post` DISABLE KEYS */;
INSERT INTO `post` (`po_id`, `po_content`, `po_us_id`, `po_title`) VALUES (1,'A Strange Unique item is an item in TF2 that behaves like a Strange item, yet has yellow text like a unique item. The item shows up in your backpack with the standard strange counter icon in the upper right corner, and does indeed keep count. The majority of items that were produced from this glitch originated from crate unboxings, but the glitch affected all items that should have been Strange, including MvM rewards. A handful of Strange Unique Australiums and Botkillers were created as a result.',1,'Strange Unique Item'),(2,'Sniper is kind of hard, at the first time you play this game, but dont worry you can be a hacker by following this Idiot, With bad english, guide.Sniper takes so much skill in general, if you have high sensitivity mouse setting, i reccomend you to use low sensetivity. Because it will help you track down their heads.',2,'Sniper Is Hard'),(3,'This is a PUBG Arena',1,'pubg'),(4,'Anyone here to Trade',2,'Trade anyone?');
/*!40000 ALTER TABLE `post` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-27 15:51:53

