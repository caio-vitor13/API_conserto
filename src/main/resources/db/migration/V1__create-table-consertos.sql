create table consertos(
            id bigint not null auto_increment,
            hora_entrada varchar(20) not null,
            hora_saida varchar(20) not null,
            nome varchar(20) not null,
            anos_experiencia varchar(5) not null,
            marca varchar(20) not null,
            modelo varchar(20) not null,
            ano varchar(4) not null,

            primary key(id)
);
