CREATE TABLE links (
   id BIGINT AUTO_INCREMENT NOT NULL,
   url VARCHAR(255) NOT NULL,
   category VARCHAR(255) NULL,
   opened BIT(1) NOT NULL,
   read_moment timestamp NULL,
   CONSTRAINT pk_links PRIMARY KEY (id)
);