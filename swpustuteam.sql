/*
SQLyog Ultimate v11.27 (32 bit)
MySQL - 5.5.49 : Database - newsmanagement
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`newsmanagement` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `newsmanagement`;

/*Table structure for table `news_comment` */

DROP TABLE IF EXISTS `news_comment`;

CREATE TABLE `news_comment` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '评论编号',
  `newsid` int(11) NOT NULL COMMENT '新闻编号',
  `content` varchar(255) NOT NULL COMMENT '评论内容',
  `author` varchar(40) DEFAULT NULL COMMENT '评论人',
  `crteatedate` datetime NOT NULL COMMENT '评论时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `news_comment` */

insert  into `news_comment`(`id`,`newsid`,`content`,`author`,`crteatedate`) values (1,1,'严重吗','李四','2018-03-14 13:14:21'),(2,2,'谁夺冠了','李四','2018-03-15 13:14:37'),(3,3,'什么时候到的','李四','2018-03-16 13:14:54');

/*Table structure for table `news_detail` */

DROP TABLE IF EXISTS `news_detail`;

CREATE TABLE `news_detail` (
  `id` int(40) NOT NULL COMMENT '新闻编号',
  `title` varchar(255) NOT NULL COMMENT '新闻标题',
  `summary` varchar(255) DEFAULT NULL COMMENT '新闻摘要',
  `author` varchar(20) DEFAULT NULL COMMENT '作者',
  `createdate` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `news_detail` */

insert  into `news_detail`(`id`,`title`,`summary`,`author`,`createdate`) values (1,'重大交通事故','广州市天河区','张三','2018-03-04 13:12:02'),(2,'奥运会夺冠','实力发挥','张三','2018-03-05 13:12:43'),(3,'奥运圣火传递','抵达北京','张三','2018-03-06 13:13:22');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
