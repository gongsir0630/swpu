/*
SQLyog Ultimate v11.27 (32 bit)
MySQL - 5.5.49 : Database - swpu
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`swpu` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `swpu`;

/*Table structure for table `manage` */

DROP TABLE IF EXISTS `manage`;

CREATE TABLE `manage` (
  `id` varchar(20) NOT NULL COMMENT '业务员编号 建议学号',
  `realName` varchar(20) DEFAULT NULL COMMENT '真实姓名',
  `password` varchar(50) DEFAULT NULL COMMENT '密码',
  `sex` int(4) DEFAULT NULL COMMENT '性别',
  `phone` varchar(20) DEFAULT NULL COMMENT '电话号码',
  `qq` varchar(20) DEFAULT NULL COMMENT 'QQ号码',
  `address` varchar(255) DEFAULT NULL COMMENT '寝室住址',
  `idCard` varchar(40) DEFAULT NULL COMMENT '身份证号码',
  `type` int(4) DEFAULT NULL COMMENT '用户类型 1组长 2业务员',
  `major` varchar(40) DEFAULT NULL COMMENT '专业',
  `createDate` datetime DEFAULT NULL COMMENT '用户创建时间',
  `lastLoginTime` datetime DEFAULT NULL COMMENT '最后一次登陆时间',
  `changeTime` datetime DEFAULT NULL COMMENT '最后修改时间',
  `changeBy` varchar(20) DEFAULT NULL COMMENT '修改人的Id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `manage` */

insert  into `manage`(`id`,`realName`,`password`,`sex`,`phone`,`qq`,`address`,`idCard`,`type`,`major`,`createDate`,`lastLoginTime`,`changeTime`,`changeBy`) values ('201431050184','朱军','123456',1,'13032820513','820637268','s21-161','511324199405134859',1,'勘查技术与工程',NULL,'2018-04-17 12:31:18','2018-01-02 11:04:15','201431050184'),('201431050185','牟钊','0000',1,'13032820513','83035678','s21-c151','325787985677677777',2,'勘查技术与工程',NULL,NULL,'2018-03-23 14:49:44','201431050183'),('201431060561','李云飞','0000',1,'18583381282','177036170','S11-513','610323199606222114',2,'2014信息管理与信息系统','2018-01-03 16:52:23',NULL,NULL,NULL),('201531031120','刘鹏坤','0000',1,'15351207582','1065392882','S12-321','513029199709096482',2,'2015机械工程','2018-01-03 16:50:59',NULL,NULL,NULL),('201531031121','廖孙波','0000',1,'13808208044','1223182675','S12-321','513029199612203850',2,'2015机械工程','2018-01-03 16:50:27',NULL,NULL,NULL),('201531060258','李彦佩','0000',2,'17761264819','1361977956','S3-212','510182199607282827',2,'2015软件工程','2018-01-03 17:05:40',NULL,NULL,NULL),('201531070550','杨鹏山','0000',1,'13890779624','1215049891','S14-620','511304199710191416',1,'2015自动化','2018-01-03 16:23:09',NULL,NULL,NULL),('201531080249','王珺','0000',1,'18244274260','704301438','S14-305','61048119961214051X',1,'2015测绘工程','2018-01-03 16:51:19',NULL,NULL,NULL),('201531100394','杨海燕','0000',2,'18280350339','1649852479','s2-501','622322199506203829',2,'2015国际经济与贸易','2018-01-03 16:49:29',NULL,NULL,NULL),('201631061130','李明','0000',1,'15680651025','952255201','S21b-349','513822199903067018',2,'2016计算机科学与技术',NULL,'2018-01-03 19:18:49','2018-01-03 19:16:37','201431050184'),('201631062324','唐聪','0000',1,'18508171540','1242423674','S21b-422','51130419801281011',2,'2016软件工程','2018-01-03 16:50:10',NULL,NULL,NULL),('201631082336','朱仕林','0000',1,'13708029197','2680741130','S21b-446','513022199711013978',2,'2016建筑环境与能源应用',NULL,NULL,'2018-03-23 14:53:08','201431050183'),('201731061426','龚涛','0000',1,'17361040630','3198307775','s15-127','511921199806304218',2,'2017计算机科学与技术',NULL,NULL,'2018-03-23 14:54:14','201431050183');

/*Table structure for table `manage_sign` */

DROP TABLE IF EXISTS `manage_sign`;

CREATE TABLE `manage_sign` (
  `id` varchar(20) NOT NULL COMMENT '签到表编号',
  `createTime` date DEFAULT NULL COMMENT '创建时间',
  `week` int(4) DEFAULT NULL COMMENT '星期几',
  `banci` varchar(20) DEFAULT NULL COMMENT '当前班次',
  `createName` varchar(20) DEFAULT NULL COMMENT '填写人签名',
  `confirmName` varchar(20) DEFAULT NULL COMMENT '接班人签字',
  `latesDes` varchar(255) DEFAULT NULL COMMENT '迟到旷班描述',
  `bikesDes` varchar(255) DEFAULT NULL COMMENT '自行车使用描述',
  `keysDes` varchar(255) DEFAULT NULL COMMENT '钥匙使用描述',
  `CDMD125` varchar(40) DEFAULT NULL COMMENT '电信125端口',
  `CDMD182` varchar(40) DEFAULT NULL COMMENT '电信182端口',
  `CUQ` varchar(40) DEFAULT NULL COMMENT '联通端口',
  `EDU` varchar(40) DEFAULT NULL COMMENT '教育网端口',
  `logistics1` int(10) DEFAULT NULL COMMENT '后勤未受理',
  `logistics2` int(10) DEFAULT NULL COMMENT '后勤未完工',
  `CDMDUnfinish` int(10) DEFAULT NULL COMMENT '电信待完成',
  `remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `manage_sign` */

/*Table structure for table `manage_sign_bikes` */

DROP TABLE IF EXISTS `manage_sign_bikes`;

CREATE TABLE `manage_sign_bikes` (
  `id` int(40) NOT NULL AUTO_INCREMENT,
  `signTableId` varchar(40) DEFAULT NULL COMMENT '关联签到表ID',
  `bikeId` varchar(40) DEFAULT NULL COMMENT '自行车编号',
  `station` int(4) DEFAULT NULL COMMENT '是否存在 存在1 不存在2',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=99 DEFAULT CHARSET=utf8;

/*Data for the table `manage_sign_bikes` */

/*Table structure for table `manage_sign_keys` */

DROP TABLE IF EXISTS `manage_sign_keys`;

CREATE TABLE `manage_sign_keys` (
  `id` int(40) NOT NULL AUTO_INCREMENT,
  `signTableId` varchar(40) DEFAULT NULL COMMENT '关联签到表ID',
  `keyId` varchar(40) DEFAULT NULL COMMENT '钥匙编号',
  `station` int(4) DEFAULT NULL COMMENT '是否存在 存在1 不存在2',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=149 DEFAULT CHARSET=utf8;

/*Data for the table `manage_sign_keys` */

/*Table structure for table `manage_sign_tools` */

DROP TABLE IF EXISTS `manage_sign_tools`;

CREATE TABLE `manage_sign_tools` (
  `id` int(40) NOT NULL AUTO_INCREMENT,
  `signTable` varchar(40) DEFAULT NULL COMMENT '关联签到表ID',
  `toolId` varchar(40) DEFAULT NULL COMMENT '工具编号',
  `station` int(4) DEFAULT NULL COMMENT '是否存在 存在1  不存在2',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=501 DEFAULT CHARSET=utf8;

/*Data for the table `manage_sign_tools` */

/*Table structure for table `manage_sign_watchs` */

DROP TABLE IF EXISTS `manage_sign_watchs`;

CREATE TABLE `manage_sign_watchs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `signTableId` varchar(40) DEFAULT NULL COMMENT '关联签到表的id',
  `manageId` varchar(40) DEFAULT NULL COMMENT '人员的学号',
  `staion` int(4) DEFAULT NULL COMMENT '值班状态1正常 2迟到 3旷班',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=153 DEFAULT CHARSET=utf8;

/*Data for the table `manage_sign_watchs` */

/*Table structure for table `orderend` */

DROP TABLE IF EXISTS `orderend`;

CREATE TABLE `orderend` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `orderId` varchar(40) DEFAULT NULL COMMENT '工单表ID',
  `endUserId` varchar(40) DEFAULT NULL COMMENT '完工人ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8;

/*Data for the table `orderend` */

insert  into `orderend`(`id`,`orderId`,`endUserId`) values (34,'20180326115719','201431060561'),(35,'20180326115719','201631062324'),(36,'20180326115719','201631082336'),(37,'20180322134155','201631062324'),(38,'20180322134155','201631082336'),(39,'20180322134255','201431050178'),(40,'20180322134255','201431050185'),(41,'20180322134255','201431060561'),(47,'20180327091022','201431050183'),(49,'20180327091022','201731061426'),(54,'20180327091615','201431050179'),(55,'20180327091615','201531060258');

/*Table structure for table `ordertable` */

DROP TABLE IF EXISTS `ordertable`;

CREATE TABLE `ordertable` (
  `id` varchar(20) NOT NULL COMMENT '工单编号',
  `startTime` datetime DEFAULT NULL COMMENT '派单时间',
  `tableType` int(4) DEFAULT NULL COMMENT '工单类型 1电信 2srun 3端口',
  `address` varchar(255) DEFAULT NULL COMMENT '用户地址',
  `userType` int(4) DEFAULT NULL COMMENT '用户类型 1学生 2教师',
  `userName` varchar(20) DEFAULT NULL COMMENT '客户姓名',
  `appointmentTime` datetime DEFAULT NULL COMMENT '预约时间',
  `userPhone` varchar(20) DEFAULT NULL COMMENT '联系方式',
  `station` int(4) DEFAULT '0' COMMENT '状态 1未完工 2正在派单 3完工',
  `description` varchar(255) DEFAULT NULL COMMENT '故障描述',
  `startname` varchar(20) DEFAULT NULL COMMENT '派单人学号',
  `startNameString` varchar(20) DEFAULT NULL COMMENT '派单人姓名',
  `endName` varchar(20) DEFAULT NULL COMMENT '完工人姓名，关联完工人表',
  `chudanren` varchar(20) DEFAULT NULL COMMENT '出单人id',
  `chudanname` varchar(20) DEFAULT NULL COMMENT '出单人姓名',
  `chudandate` datetime DEFAULT NULL COMMENT '出单时间',
  `endTime` datetime DEFAULT NULL COMMENT '解决时间',
  `reason` varchar(255) DEFAULT NULL COMMENT '具体原因',
  `solve` varchar(255) DEFAULT NULL COMMENT '解决办法',
  `duankou` int(4) DEFAULT NULL COMMENT '端口消耗',
  `mianban` int(4) DEFAULT NULL COMMENT '面板消耗',
  `shuijingtou` int(4) DEFAULT NULL COMMENT '水晶头消耗',
  `wangxian` int(4) DEFAULT NULL COMMENT '网线消耗',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `changeDate` datetime DEFAULT NULL COMMENT '修改时间',
  `changeBy` varchar(20) DEFAULT NULL COMMENT '修改人',
  `changeNameString` varchar(20) DEFAULT NULL COMMENT '更改人姓名',
  `recordMan` varchar(20) DEFAULT NULL COMMENT '登记人id',
  `recordName` varchar(20) DEFAULT NULL COMMENT '登记人姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `ordertable` */

insert  into `ordertable`(`id`,`startTime`,`tableType`,`address`,`userType`,`userName`,`appointmentTime`,`userPhone`,`station`,`description`,`startname`,`startNameString`,`endName`,`chudanren`,`chudanname`,`chudandate`,`endTime`,`reason`,`solve`,`duankou`,`mianban`,`shuijingtou`,`wangxian`,`remark`,`changeDate`,`changeBy`,`changeNameString`,`recordMan`,`recordName`) values ('20180322134155','2018-03-22 13:41:55',2,'s16-321',NULL,NULL,'2018-03-22 13:41:55','18124929947',3,'主线无信号','201431050184','朱军',NULL,'201431050185','牟钊','2018-03-28 12:32:34','2018-03-29 12:20:52','主线有问题','重新做了主线',3,1,0,2,NULL,NULL,NULL,NULL,'201531031120','刘鹏坤'),('20180322134255','2018-03-22 13:42:55',2,'s16-321',NULL,'潘老师','2018-03-22 13:42:55','18124929947',3,'主线无信号','201431050184','朱军',NULL,'201531070550','杨鹏山','2018-03-28 11:08:00','2018-03-29 12:40:47','没得原因','没有解决',2,6,23,5,NULL,NULL,NULL,NULL,'201431060561','李云飞'),('20180326115719','2018-03-26 11:57:19',3,'s23-234',NULL,NULL,'2018-03-26 11:57:19','13032820513',3,'面板有问题','201531100394','杨海燕',NULL,'201531060258','李彦佩','2018-03-28 12:33:07','2018-03-29 11:39:45','网线没有插好','重新做了网线',1,3,4,2,NULL,NULL,NULL,NULL,'201431050185','牟钊'),('20180327091022','2018-03-27 09:10:22',2,'t45-506',NULL,'','2018-03-27 09:10:22','83035987',3,'路由器问题','201431050184','朱军',NULL,'201631082336','朱仕林','2018-04-02 21:56:32','2018-04-03 12:22:15','111111111111111111111','111111111111111111',0,0,0,0,NULL,NULL,NULL,NULL,'201431050184','朱军'),('20180327091615','2018-03-27 23:16:15',3,'s16-405',NULL,'修改的','2018-03-27 09:16:15','12345679',3,'修改的','201731061426','刘鹏坤',NULL,'201431050184','朱军','2018-03-29 12:57:25','2018-03-30 02:57:28','修改的','修改的',10,10,10,10,NULL,'2018-04-09 12:00:04','201431050184','朱军','201431050184','朱军'),('20180411161316','2018-04-11 16:13:16',1,'s13-512',NULL,NULL,'2018-04-11 16:13:16','13032820513',1,'全寝室不能上网，主端口无响应','201531100394','杨海燕',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('20180411161421','2018-04-11 16:14:21',2,'t32-402',NULL,NULL,'2018-04-11 16:14:21','83035111',1,'*******************************','201531080249','王珺',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('20180416135533','2018-04-16 13:55:33',1,'s21-c161',NULL,NULL,'2018-04-16 13:55:33','88888888',1,'朱军的网络有问题','201631061130','李明',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('20180417102247','2018-04-17 10:22:47',1,'4652',NULL,NULL,'2018-04-17 10:22:47','44444444',1,'shsfehvhhgfh','201631062324','唐聪',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `tool_bikes` */

DROP TABLE IF EXISTS `tool_bikes`;

CREATE TABLE `tool_bikes` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `bikeId` varchar(40) DEFAULT NULL COMMENT '自行车编号',
  `bikeName` varchar(40) DEFAULT NULL COMMENT '自行车名称',
  `bikePrice` double DEFAULT NULL COMMENT '自行车价格',
  `station` int(4) DEFAULT NULL COMMENT '使用状态 1 使用 2未使用',
  `bikeDes` varchar(255) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `tool_bikes` */

insert  into `tool_bikes`(`id`,`bikeId`,`bikeName`,`bikePrice`,`station`,`bikeDes`) values (1,'xjzx001','小蓝',300,1,NULL),(2,'xjzx002','小灰',200,1,NULL);

/*Table structure for table `tool_keys` */

DROP TABLE IF EXISTS `tool_keys`;

CREATE TABLE `tool_keys` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `keyId` varchar(40) DEFAULT NULL COMMENT '钥匙编号',
  `keyName` varchar(40) DEFAULT NULL COMMENT '钥匙名字',
  `station` int(4) DEFAULT NULL COMMENT '使用状态 1使用 2未使用',
  `keyDes` varchar(255) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `tool_keys` */

insert  into `tool_keys`(`id`,`keyId`,`keyName`,`station`,`keyDes`) values (1,'001','机房钥匙1号',1,NULL),(2,'002','机房钥匙2号',1,NULL),(3,'003','值班室门钥匙',1,NULL);

/*Table structure for table `tool_tools` */

DROP TABLE IF EXISTS `tool_tools`;

CREATE TABLE `tool_tools` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `toolId` varchar(40) DEFAULT NULL COMMENT '工具编号',
  `toolName` varchar(40) DEFAULT NULL COMMENT '工具名称',
  `toolPrice` double DEFAULT NULL COMMENT '工具价格',
  `station` int(4) DEFAULT NULL COMMENT '使用状态 1使用 2未使用',
  `toolDes` varchar(255) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `tool_tools` */

insert  into `tool_tools`(`id`,`toolId`,`toolName`,`toolPrice`,`station`,`toolDes`) values (1,'c001','测线仪A',50,1,NULL),(2,'c002','测线仪B',50,1,NULL),(3,'c003','测线仪C',50,1,NULL),(4,'c004','测线仪D',50,1,NULL),(5,'d001','打线刀A',300,1,NULL),(6,'d002','打线刀B',300,1,NULL),(7,'w001','网线钳A',600,1,NULL),(8,'w002','网线钳B',600,1,NULL),(9,'w003','网线钳C',600,1,NULL),(10,'x001','寻线仪A',300,1,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
