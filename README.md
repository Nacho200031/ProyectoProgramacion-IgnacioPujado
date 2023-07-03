# ProyectoProgramacion-IgnacioPujado
ignacio pujado. profe,me salia un error de actualizacion de spring pero creo que logre solucionarlo



SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema ejemplo2
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema ejemplo2
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `ejemplo2` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `ejemplo2` ;

-- -----------------------------------------------------
-- Table `ejemplo2`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ejemplo2`.`usuario` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(40) NULL DEFAULT NULL,
  `apellido` VARCHAR(40) NULL DEFAULT NULL,
  `telefono` VARCHAR(40) NULL DEFAULT NULL,
  `email` VARCHAR(255) NULL DEFAULT NULL,
  `password` VARCHAR(40) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `ejemplo2`.`usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ejemplo2`.`usuarios` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(40) NULL DEFAULT NULL,
  `apellido` VARCHAR(40) NULL DEFAULT NULL,
  `telefono` VARCHAR(40) NULL DEFAULT NULL,
  `email` VARCHAR(255) NULL DEFAULT NULL,
  `password` VARCHAR(40) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

