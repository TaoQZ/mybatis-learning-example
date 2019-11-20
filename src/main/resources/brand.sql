CREATE TABLE `brand` (
                         `id` int(11) NOT NULL AUTO_INCREMENT,
                         `name` varchar(50) DEFAULT NULL,
                         `image` varchar(50) DEFAULT NULL,
                         `letter` varchar(10) DEFAULT NULL,
                         PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
INSERT INTO `brand` VALUES ('1', '花花公子', null, 'H');
INSERT INTO `brand` VALUES ('2', '唐狮', null, 'T');
INSERT INTO `brand` VALUES ('3', '韩都衣舍', null, 'H');
INSERT INTO `brand` VALUES ('4', '太平鸟', null, 'T');
INSERT INTO `brand` VALUES ('5', '森马', null, 'S');
INSERT INTO `brand` VALUES ('6', '大嘴猴', null, 'D');