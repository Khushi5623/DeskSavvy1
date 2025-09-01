/*
SQLyog Ultimate v8.82 
MySQL - 5.1.45-community : Database - virtual_office
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`virtual_office` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `virtual_office`;

/*Table structure for table `addemp` */

DROP TABLE IF EXISTS `addemp`;

CREATE TABLE `addemp` (
  `empid` int(4) NOT NULL AUTO_INCREMENT,
  `cid` varchar(50) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `dep` varchar(50) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `state` varchar(100) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `pin` varchar(15) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`empid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `addemp` */

insert  into `addemp`(`empid`,`cid`,`name`,`dep`,`city`,`state`,`address`,`pin`,`phone`,`email`) values (1,'1212','Aman','Web','Lucknow','UttarÂ Pradesh','Lucknow','225306','09935859457','ar799973@gmail.com'),(2,'1212','Aman ','admin','Lucknow','UttarÂ Pradesh','Lucknow','India','123','ar799973@gmail.com');

/*Table structure for table `attendance` */

DROP TABLE IF EXISTS `attendance`;

CREATE TABLE `attendance` (
  `emp_id` varchar(23) DEFAULT NULL,
  `com_id` varchar(34) DEFAULT NULL,
  `aten_date` varchar(46) DEFAULT NULL,
  `in_time` varchar(49) DEFAULT NULL,
  `cout_date` varchar(49) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `attendance` */

insert  into `attendance`(`emp_id`,`com_id`,`aten_date`,`in_time`,`cout_date`) values ('111','111','2024-07-11','10:47:45','2024-07-11'),('111','111','2024-07-12','9:2:20','2024-07-12');

/*Table structure for table `company_login` */

DROP TABLE IF EXISTS `company_login`;

CREATE TABLE `company_login` (
  `id` varchar(50) DEFAULT NULL,
  `pass` varchar(50) DEFAULT NULL,
  `u_type` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `company_login` */

insert  into `company_login`(`id`,`pass`,`u_type`) values ('1234','1234','admin'),('1212','1212','company');

/*Table structure for table `emp_login` */

DROP TABLE IF EXISTS `emp_login`;

CREATE TABLE `emp_login` (
  `com_id` varchar(10) DEFAULT NULL,
  `emp_id` varchar(40) DEFAULT NULL,
  `password` varchar(39) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `emp_login` */

insert  into `emp_login`(`com_id`,`emp_id`,`password`) values ('111','111','111'),('1212','ar799973@gmail.com','Aman ');

/*Table structure for table `event` */

DROP TABLE IF EXISTS `event`;

CREATE TABLE `event` (
  `com_id` varchar(20) DEFAULT NULL,
  `subject` varchar(100) DEFAULT NULL,
  `event` varchar(100) DEFAULT NULL,
  `e_date` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `event` */

/*Table structure for table `liveapply` */

DROP TABLE IF EXISTS `liveapply`;

CREATE TABLE `liveapply` (
  `emp_id` varchar(20) DEFAULT NULL,
  `com_id` varchar(20) DEFAULT NULL,
  `subject` varchar(200) DEFAULT NULL,
  `msg` varchar(300) DEFAULT NULL,
  `a_date` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `liveapply` */

insert  into `liveapply`(`emp_id`,`com_id`,`subject`,`msg`,`a_date`) values ('111','111','','','2024-07-11');

/*Table structure for table `registration` */

DROP TABLE IF EXISTS `registration`;

CREATE TABLE `registration` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `cname` varchar(100) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `state` varchar(100) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `pin` varchar(10) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `fax` varchar(15) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `website` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `registration` */

/*Table structure for table `salary` */

DROP TABLE IF EXISTS `salary`;

CREATE TABLE `salary` (
  `empid` varchar(20) DEFAULT NULL,
  `cid` varchar(50) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `dep` varchar(50) DEFAULT NULL,
  `sal` varchar(50) DEFAULT NULL,
  `u_data` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `salary` */

insert  into `salary`(`empid`,`cid`,`name`,`dep`,`sal`,`u_data`) values ('1','1212','Aman','Web','12000','2024-07-09');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
