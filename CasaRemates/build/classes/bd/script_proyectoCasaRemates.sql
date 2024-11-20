/*
SQLyog - Free MySQL GUI v5.11
Host - 5.5.24-log : Database - bd
*********************************************************************
Server version : 5.5.24-log
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `bd`;

USE `bd`;

/*Table structure for table `producto` */

DROP TABLE IF EXISTS `producto`;

CREATE TABLE `producto` (
  `codigo` varchar(10) DEFAULT NULL,
  `nombreProducto` varchar(30) DEFAULT NULL,
  `descripcionProducto` varchar(50) DEFAULT NULL,
  `valorUnitario` int(11) DEFAULT NULL,
  `oferta` tinyint(1) DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  `descontinuado` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `producto` */

insert into `producto` (`codigo`,`nombreProducto`,`descripcionProducto`,`valorUnitario`,`oferta`,`stock`,`descontinuado`) values ('AA1','Televisor','Televisor 32pulg LG',120000,0,5,1);
insert into `producto` (`codigo`,`nombreProducto`,`descripcionProducto`,`valorUnitario`,`oferta`,`stock`,`descontinuado`) values ('BB1','Microondas','Microondas 24lt Panasonic',20000,1,10,0);
insert into `producto` (`codigo`,`nombreProducto`,`descripcionProducto`,`valorUnitario`,`oferta`,`stock`,`descontinuado`) values ('CC1','Horno Electrico','Horno Electrico LG',32000,1,10,1);
insert into `producto` (`codigo`,`nombreProducto`,`descripcionProducto`,`valorUnitario`,`oferta`,`stock`,`descontinuado`) values ('DD1','Televisor','Televisro 42pulg Sony',100000,1,5,1);
