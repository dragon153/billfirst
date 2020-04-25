/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50729
Source Host           : 192.168.1.200:3306
Source Database       : bill

Target Server Type    : MYSQL
Target Server Version : 50729
File Encoding         : 65001

Date: 2020-02-17 11:03:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bill
-- ----------------------------
DROP TABLE IF EXISTS `bill`;
CREATE TABLE `bill` (
  `bid` int(11) NOT NULL AUTO_INCREMENT,
  `billcode` varchar(25) DEFAULT NULL,
  `billname` varchar(25) DEFAULT NULL,
  `billunit` varchar(25) DEFAULT NULL,
  `billnum` int(8) DEFAULT NULL,
  `money` double(8,2) DEFAULT NULL,
  `pay` tinyint(1) DEFAULT NULL,
  `pid` int(11) DEFAULT NULL,
  `createdate` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`bid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bill
-- ----------------------------
INSERT INTO `bill` VALUES ('1', 'b1', '1号服务', '箱', '30', '2.44', '1', '1', '2020-02-12 06:49:20');
INSERT INTO `bill` VALUES ('4', 'b2', '2号服务', '件', '10', '10000.00', '0', '2', '2020-02-14 19:32:16');
INSERT INTO `bill` VALUES ('6', 'ceshi', '雪碧', null, '10', '1000.00', '0', '4', '2020-02-16 18:48:08');

-- ----------------------------
-- Table structure for provider
-- ----------------------------
DROP TABLE IF EXISTS `provider`;
CREATE TABLE `provider` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `providername` varchar(25) DEFAULT NULL,
  `contactpeople` varchar(25) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `address` varchar(60) DEFAULT NULL,
  `describe` varchar(100) DEFAULT NULL,
  `createdate` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of provider
-- ----------------------------
INSERT INTO `provider` VALUES ('1', 'p222', 'b货供应商', '12512532255', '南街', '经常', '2020-02-14 19:30:23');
INSERT INTO `provider` VALUES ('2', 'p333', 'C货供应商', '15245253585', '北街', '偶尔', '2020-02-14 19:30:50');
INSERT INTO `provider` VALUES ('3', 'demo', 'd', '1533325354', '南街', '偶尔', '2020-02-16 10:36:26');
INSERT INTO `provider` VALUES ('4', '123', '123', '1533285325', 'beijie', 'dsadas', '2020-02-16 10:42:56');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(25) DEFAULT NULL,
  `realname` varchar(25) DEFAULT NULL,
  `password` varchar(25) DEFAULT NULL,
  `gender` tinyint(1) DEFAULT NULL,
  `usertype` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'root', '龙', '1234', '1', '0');
INSERT INTO `user` VALUES ('2', 'dragon', '张', '123', '0', '1');
INSERT INTO `user` VALUES ('5', 'demo2', 'dragon', '123', '1', '1');
INSERT INTO `user` VALUES ('7', '测试', '测试号', '123', '0', '1');
