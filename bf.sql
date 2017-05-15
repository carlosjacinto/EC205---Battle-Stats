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
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

/*Data for the table `arma` */

insert  into `arma`(`id`,`nome`,`tipo`,`acessorio`,`dano`,`alcance`,`precisao`,`tiroSemVisada`,`estabilidade`,`cadencia`,`capacidadeDoPente`) values (1,'Teste','2',1,0,0,0,0,0,0,0),(2,'q','1',0,4,4,4,4,4,4,4),(3,'t','2',1,0,0,0,0,0,0,0),(4,'i','1',1,0,0,0,0,0,0,0),(5,'r','2',0,6,6,6,6,6,6,6),(6,'q','1',1,0,0,0,0,0,0,0);

/*Table structure for table `classe` */

DROP TABLE IF EXISTS `classe`;

CREATE TABLE `classe` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `nome` char(100) DEFAULT NULL,
  `tipo` char(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `classe` */

insert  into `classe`(`id`,`nome`,`tipo`) values (1,'teste','teste');

/*Table structure for table `jogador` */

DROP TABLE IF EXISTS `jogador`;

CREATE TABLE `jogador` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nomeDeUsuario` varchar(20) DEFAULT NULL,
  `senha` int(20) DEFAULT NULL,
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
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;

/*Data for the table `jogador` */

insert  into `jogador`(`id`,`nomeDeUsuario`,`senha`,`nome`,`email`,`patente`,`kd`,`score`,`tempoJogo`,`classeFavorita`,`armaFavorita`,`veiculoFavorito`) values (9,'1',1,'1','1',1,1,1,1,'null','null','null'),(10,'carlos',123,'Carlos Henrique','carlosjacinto@gec.inatel.br',9,9,9,9,'null','null','null'),(15,'3',3,'3','3',3,3,3,3,'null','null','null'),(16,'1',6,'6','6',6,6,6,6,'null','null','null'),(17,'3',0,'0','0',0,0,0,0,'null','null','null'),(18,'6',2,'2','2',2,2,2,2,'null','null','null'),(19,'6',9,'9','9',9,9,9,9,'null','null','null');

/*Table structure for table `usuariosadmin` */

DROP TABLE IF EXISTS `usuariosadmin`;

CREATE TABLE `usuariosadmin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(20) DEFAULT NULL,
  `senha` varchar(20) DEFAULT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `usuariosadmin` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
