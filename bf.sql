/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.1.53-community : Database - battlefield
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`battlefield` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `battlefield`;

/*Table structure for table `arma` */

DROP TABLE IF EXISTS `arma`;

CREATE TABLE `arma` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `nome` char(100) DEFAULT NULL,
  `tipo` char(100) DEFAULT NULL,
  `acessorio` tinyint(1) DEFAULT NULL,
  `dano` bigint(20) DEFAULT '0',
  `alcance` bigint(20) DEFAULT '0',
  `precisao` bigint(20) DEFAULT '0',
  `tiroSemVisada` bigint(20) DEFAULT '0',
  `estabilidade` bigint(20) DEFAULT '0',
  `cadencia` bigint(20) DEFAULT '0',
  `capacidadeDoPente` bigint(20) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

/*Data for the table `arma` */

insert  into `arma`(`id`,`nome`,`tipo`,`acessorio`,`dano`,`alcance`,`precisao`,`tiroSemVisada`,`estabilidade`,`cadencia`,`capacidadeDoPente`) values (8,'Deagle44','Pistola',0,7,6,5,4,3,2,1),(9,'AEK-971','Assalto',0,1,2,3,4,5,6,7),(11,'RPG','ADP',1,0,0,0,0,0,0,0),(12,'Ferramenta de Reparo','ADP',1,0,0,0,0,0,0,0);

/*Table structure for table `classe` */

DROP TABLE IF EXISTS `classe`;

CREATE TABLE `classe` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `nome` char(100) DEFAULT NULL,
  `tipo` char(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `classe` */

insert  into `classe`(`id`,`nome`,`tipo`) values (4,'Engenheiro','ADP'),(5,'Batedor','Rifle de precisão'),(6,'Suporte','M.L.');

/*Table structure for table `jogador` */

DROP TABLE IF EXISTS `jogador`;

CREATE TABLE `jogador` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nomeDeUsuario` varchar(20) DEFAULT NULL,
  `senha` varchar(100) DEFAULT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `patente` bigint(20) DEFAULT NULL,
  `kd` double DEFAULT NULL,
  `score` bigint(20) DEFAULT NULL,
  `tempoJogo` bigint(20) DEFAULT NULL,
  `classeFavorita` char(100) DEFAULT NULL,
  `armaFavorita` char(100) DEFAULT NULL,
  `veiculoFavorito` char(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=latin1;

/*Data for the table `jogador` */

insert  into `jogador`(`id`,`nomeDeUsuario`,`senha`,`nome`,`email`,`patente`,`kd`,`score`,`tempoJogo`,`classeFavorita`,`armaFavorita`,`veiculoFavorito`) values (9,'1','1','1','1',1,1,1,1,'null','null','null'),(10,'carlos','123','Carlos Henrique','carlosjacinto@gec.inatel.br',9,9,9,9,'null','null','null'),(15,'3','3','3','3',3,3,3,3,'null','null','null'),(16,'1','6','6','6',6,6,6,6,'null','null','null'),(17,'3','0','0','0',0,0,0,0,'null','null','null'),(18,'6','2','2','2',2,2,2,2,'null','null','null'),(19,'6','9','9','9',9,9,9,9,'null','null','null'),(20,'edu','null','null','irineu@gmail.com',12,2,3,5,NULL,NULL,NULL),(21,'qqqq','[C@6b7d0ad9','null','qqqq2@dada.com',11,111,11111,1,NULL,NULL,NULL),(22,'qqqqaaaa','[C@6528f568','null','qaaaaqqq2@dada.com',112222,1113333,11111,1,NULL,NULL,NULL),(23,'carlos1','[C@58d0eca0','null','carlos@gec.inatel.br',1,1,1,1,NULL,NULL,NULL),(24,'carlos23','123','null','carlos@gmail.com',2,3,4,1,NULL,NULL,NULL),(25,'dsadsad','123','null','adasd@carlos.com',1,1,1,1,NULL,NULL,NULL),(26,'daniel','daniel','null','daniel@gmail.com',75,1,500,122,NULL,NULL,NULL),(27,'daniel1','123','null','daniel1@gmail.com',12,12,12,23,'teste',NULL,NULL),(28,'daniel2','123','null','daniel2@gmail.com',13,342,231,321,'teste','aek',NULL),(29,'daniel3','321','null','daniel3@gmail.com',12,321,3213,213,'v','i','t-90'),(30,'Daniel4','555','null','Daniel4@gmail.com',325,5,566,85,'a','r','LAV'),(31,'Daniel5','444','null','Daniel5@gmail.com',56,565,43,435,'teste','aek','R'),(32,'dasdfdgv','111','null','dsadsad@njasdh.com',3224,324,432,23414,'a','aek','LAV');

/*Table structure for table `usuariosadmin` */

DROP TABLE IF EXISTS `usuariosadmin`;

CREATE TABLE `usuariosadmin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(20) DEFAULT NULL,
  `senha` varchar(20) DEFAULT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `usuariosadmin` */

insert  into `usuariosadmin`(`id`,`login`,`senha`,`nome`,`email`) values (1,'Admin','1234','Admin1','admin@admin.com');

/*Table structure for table `veiculo` */

DROP TABLE IF EXISTS `veiculo`;

CREATE TABLE `veiculo` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `nome` char(100) DEFAULT NULL,
  `tipo` char(100) DEFAULT NULL,
  `possuiArmamento` int(20) DEFAULT NULL,
  `armaPrimaria` char(100) DEFAULT NULL,
  `armaSecundaria` char(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

/*Data for the table `veiculo` */

insert  into `veiculo`(`id`,`nome`,`tipo`,`possuiArmamento`,`armaPrimaria`,`armaSecundaria`) values (1,'a','t',0,'',''),(2,'t','r',1,'2','3'),(3,'LAV','Veiculo leve',1,'canhao 25mm','dsa'),(4,'R','e',0,'',''),(6,'t-90','tanque',1,'sabot','araa'),(8,'M1-Abrams','Blindado',1,'Capsula sabot','metralhadora .50');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
