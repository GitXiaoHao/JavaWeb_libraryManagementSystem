drop table if exists web.webuser;
drop table if exists web.province;
drop table if exists web.t_book_all;
drop table if exists web.t_book_borrow;
drop table if exists web.t_user_ordinary;
# 构建用户表
use web;
# 管理员
create table T_USER_ADMIN
(
    admin_id        int primary key auto_increment,# 主键
    admin_username  varchar(30) not null unique,# 管理员的用户名
    admin_password  varchar(32) not null,# 管理员的密码
    admin_real_name varchar(30),# 管理员的真实姓名
    admin_birthday  date,# 管理员的生日
    admin_sex       char,                          # 管理员的性别
    admin_telephone varchar(11),                   # 管理员的手机号
    admin_email     varchar(30),# 管理员的邮箱
    admin_status    char,                          # 管理员的状态
    admin_code      varchar(50) unique             # 管理员的唯一标识码
) charset = utf8;
# 普通用户
create table T_USER_ORDINARY
(
    ordinary_id           int primary key auto_increment,# 用户的主键
    ordinary_number       varchar(50) not null unique,#用户的唯一编号
    ordinary_username     varchar(20) not null unique,#用户的用户名 不能重复
    ordinary_password     varchar(32) not null,#密码
    ordinary_name         varchar(10) not null,#用户姓名
    ordinary_telephone    varchar(11) not null,#用户电话
    ordinary_email        varchar(30) not null,#用户邮箱
    ordinary_school       varchar(20),#用户所在学校
    ordinary_dept         varchar(10),#用户所在院系
    ordinary_type         varchar(10),#用户类型 只限图书
    ordinary_jurisdiction char,                          #用户权限
    ordinary_demo         varchar(100),#用户说明
    ordinary_money        double(10, 2)#用户所有的钱
) charset = utf8;
# 全部图书的表
create table T_BOOK_ALL
(
    book_id               int primary key auto_increment,#图书主键
    book_name             varchar(20)  not null unique,#图书名称
    book_author           varchar(10)  not null,#图书作者
    book_publication_date date,#图书出版时间
    book_press            varchar(50)  not null,#出版社
    book_introduce        varchar(200) not null,#图书介绍
    book_price            double(7, 2) not null,#图书价格
    book_ISBN             varchar(17)  not null unique,#图书ISBN码
    book_type             varchar(10),                   #图书类型
    book_status           varchar(10)#状态
) charset = utf8;
#图书的类型
create table T_BOOK_TYPE
(
    book_type_id   int primary key auto_increment,#图书类型主键
    book_type_name varchar(20) not null unique,#图书类型
    book_type_demo varchar(100)                   #图书类型说明
) charset = utf8;
#借阅表
create table T_BOOK_BORROW
(
    borrow_id          int primary key auto_increment,#借阅表主键
    book_ISBN          varchar(17) not null unique,#图书ISBN号
    ordinary_number    varchar(50) not null,#借阅人的唯一标识
    borrow_loan_date   date        not null,#出借日期
    borrow_return_date date        not null,#归还日期
    foreign key (book_ISBN) references T_BOOK_ALL (book_ISBN),#图书的外键
    foreign key (ordinary_number) references T_USER_ORDINARY (ordinary_number)#用户的唯一标识外键
) charset = utf8;
#规则表
create table T_BOOK_RULE
(
    role_id               int primary key auto_increment,#规则表主键
    role_borrow_day       smallint     not null,#借阅期限多少天
    role_borrow_frequency smallint     not null,#借阅次数
    role_borrow_overtime  double(5, 2) not null          #借阅预期处罚多少
) charset = utf8;
#图书状态类型
create table T_BOOK_STATUS
(
    status_id   int primary key auto_increment,#图书状态类型主键
    status_type varchar(10) not null unique,#图书状态}类型
    status_demo varchar(100)                   #状态说明
) charset = utf8;
#图书类型添加
insert into T_BOOK_TYPE
values (null, '漫画', null);
insert into T_BOOK_TYPE
values (null, '小说', null);
insert into T_BOOK_TYPE
values (null, '散文', null);
insert into T_BOOK_TYPE
values (null, '课本', null);
insert into T_BOOK_TYPE
values (null, '文论', null);
insert into T_BOOK_TYPE
values (null, '哲学', null);
#图书状态添加
insert into T_BOOK_STATUS
values (null, '闲置', null);
insert into T_BOOK_STATUS
values (null, '已借阅', null);
insert into T_BOOK_STATUS
values (null, '已售', null);
#图书规则添加
insert into T_BOOK_RULE
values (null, 7, 3, 20.0);
#图书添加
insert into T_BOOK_ALL
values (null, '人类简史', '尤瓦尔·赫拉利', '2014-11-1', '中信出版股份有限公司',
        '《人类简史：从动物到上帝》是一部试图写清人类历史的书。然而它又截然不同于往期读过的历史叙述，那些书大多将目光集中在某一朝代、某一时期或者某一历史事件，他们写作的重点大多在于厘清事实。还有一些人类史、文明史，通常以文明为单位讲述过去，宏观概括，重点在于叙述文明的发展与文明间的互动。',
        50, '
9787508647357', '哲学', '闲置');
insert into T_BOOK_ALL
values (null, '毛泽东选集', '毛泽东', '1991年7月1日', '人民出版社',
        '《毛泽东选集》是1951年人民出版社出版的图书，作者是毛泽东。该书是毛泽东思想的重要载体，是毛泽东思想的集中展现，亦是对20世纪的中国影响最大的书籍之一。',
        81, '
9787010009254', '文论', '闲置');
insert into T_BOOK_ALL
values (null, '战争与和平', '列夫·尼古拉耶维奇·托尔斯泰', '1863—1869年', '老子',
        '《道德经》内容涵盖哲学、伦理学、政治学、军事学等诸多学科，被后人尊奉为治国、齐家、修身、为学的宝典。它对中国的哲学、科学、政治、宗教等产生了深远的影响，体现了古代中国人的一种世界观和人生观。先秦诸子、中国人的文化思想等没有不受老子影响的，被华夏先辈誉为万经之王 [1]  。',
        50, '
9787508647357', '哲学', '闲置');