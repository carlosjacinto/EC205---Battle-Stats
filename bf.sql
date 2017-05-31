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
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

/*Data for the table `arma` */

insert  into `arma`(`id`,`nome`,`tipo`,`acessorio`,`dano`,`alcance`,`precisao`,`tiroSemVisada`,`estabilidade`,`cadencia`,`capacidadeDoPente`) values (8,'Deagle44','Pistola',0,75,32,11,31,21,11,71),(9,'CZ-3A1','ADP',0,435,221,323,4321,5123,632,721213),(11,'MINA AA','ADP',1,0,0,0,0,0,0,0),(12,'Ferramenta de Reparo','ADP',1,0,0,0,0,0,0,0),(13,'sdfsadfsa','Escopeta',1,0,0,0,0,0,0,0),(14,'teste','Assalto',1,0,0,0,0,0,0,0);

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
  `nomeDeUsuario` varchar(100) DEFAULT NULL,
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
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=latin1;

/*Data for the table `jogador` */

insert  into `jogador`(`id`,`nomeDeUsuario`,`senha`,`nome`,`email`,`patente`,`kd`,`score`,`tempoJogo`,`classeFavorita`,`armaFavorita`,`veiculoFavorito`) values (35,'Carlos','202cb962ac59075b964b07152d234b70','null','fbf9fc7be1433217c58fc5cf0148ed67',1,1,1,1,'null','null','null');

/*Table structure for table `usuariosadmin` */

DROP TABLE IF EXISTS `usuariosadmin`;

CREATE TABLE `usuariosadmin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(100) DEFAULT NULL,
  `senha` varchar(100) DEFAULT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `usuariosadmin` */

insert  into `usuariosadmin`(`id`,`login`,`senha`,`nome`,`email`) values (2,'Carlos Admin','81dc9bdb52d04dc20036dbd8313ed055','Teste admin','67c06304aeff286bfd75ab8c581bb6f9');

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
