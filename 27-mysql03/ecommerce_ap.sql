-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema ch_ap
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema ch_ap
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `ch_ap` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `ch_ap` ;

-- -----------------------------------------------------
-- Table `ch_ap`.`products`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ch_ap`.`products` (
  `id_product` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(60) NOT NULL,
  `description` VARCHAR(180) NOT NULL,
  `price` DOUBLE NOT NULL,
  `availability` TINYINT(1) NOT NULL,
  PRIMARY KEY (`id_product`))
ENGINE = InnoDB
AUTO_INCREMENT = 21
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `ch_ap`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ch_ap`.`users` (
  `id_user` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(120) NOT NULL,
  `email` VARCHAR(60) NOT NULL,
  `phone` VARCHAR(20) NULL DEFAULT NULL,
  `password` VARCHAR(60) NOT NULL,
  PRIMARY KEY (`id_user`))
ENGINE = InnoDB
AUTO_INCREMENT = 10
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `ch_ap`.`orders`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ch_ap`.`orders` (
  `id_order` INT ZEROFILL NOT NULL AUTO_INCREMENT,
  `order_date` DATE NOT NULL,
  `total_amount` DOUBLE NOT NULL,
  `order_status` SET("preparando", "enviado", "entregado") NOT NULL,
  `users_id_user` INT NOT NULL,
  PRIMARY KEY (`id_order`),
  UNIQUE INDEX `id_order_UNIQUE` (`id_order` ASC) VISIBLE,
  INDEX `fk_orders_users_idx` (`users_id_user` ASC) VISIBLE,
  CONSTRAINT `fk_orders_users`
    FOREIGN KEY (`users_id_user`)
    REFERENCES `ch_ap`.`users` (`id_user`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ch_ap`.`order_details`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ch_ap`.`order_details` (
  `id_order_details` INT NOT NULL AUTO_INCREMENT,
  `quantity` INT NOT NULL,
  `price_per_unit` DOUBLE NOT NULL,
  `orders_id_order` INT ZEROFILL NOT NULL,
  `products_id_product` INT NOT NULL,
  PRIMARY KEY (`id_order_details`, `orders_id_order`),
  UNIQUE INDEX `id_order_details_UNIQUE` (`id_order_details` ASC) VISIBLE,
  INDEX `fk_order_details_orders1_idx` (`orders_id_order` ASC) VISIBLE,
  INDEX `fk_order_details_products1_idx` (`products_id_product` ASC) VISIBLE,
  CONSTRAINT `fk_order_details_orders1`
    FOREIGN KEY (`orders_id_order`)
    REFERENCES `ch_ap`.`orders` (`id_order`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_order_details_products1`
    FOREIGN KEY (`products_id_product`)
    REFERENCES `ch_ap`.`products` (`id_product`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
