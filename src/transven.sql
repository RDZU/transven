-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-07-2016 a las 16:59:47
-- Versión del servidor: 10.1.8-MariaDB
-- Versión de PHP: 5.6.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `transven`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE PROCEDURE `ActualizarPrecio` (`pTarifa_Kg` DECIMAL(10,2), `pTarifa_viaje` DECIMAL(10,2), `pTarifa_Km` DECIMAL(10,2), `pTarifa_viatico` DECIMAL(10,2), `pSueldo_base` DECIMAL(10,2))  update precio
set
Tarifa_Kg=pTarifa_Kg,
Tarifa_viaje=pTarifa_viaje,
Tarifa_Km=pTarifa_Km,
Tarifa_viatico=pTarifa_viatico,
Sueldo_base=pSueldo_base
where ID=0$$

CREATE PROCEDURE `EditarUsuario` (`pcedula_usuario` INT, `pnombre` VARCHAR(20), `papellido` VARCHAR(20), `pdireccion` VARCHAR(100), `ptelefono` VARCHAR(15), `pacceso` VARCHAR(10), `plogin` VARCHAR(20), `pcontraseña` VARCHAR(32), `ppcedula_usuario` INT)  update usuario
set cedula_usuario=pcedula_usuario,
nombre=pnombre,
apellido=papellido,
direccion=pdireccion,
telefono=ptelefono,
acceso=pacceso,
login=plogin,
contraseña=MD5(pcontraseña)
where cedula_usuario=ppcedula_usuario$$

CREATE PROCEDURE `EliminarUsuario` (`pcedula_usuario` INT)  delete from usuario
where cedula_usuario=pcedula_usuario$$

CREATE PROCEDURE `InsertarUsuario` (`pcedula_usuario` INT, `pnombre` VARCHAR(20), `papellido` VARCHAR(20), `pdireccion` VARCHAR(100), `ptelefono` VARCHAR(15), `pacceso` VARCHAR(10), `plogin` VARCHAR(20), `pcontraseña` VARCHAR(32))  insert into usuario
set cedula_usuario=pcedula_usuario,
nombre=pnombre,
apellido=papellido,
direccion=pdireccion,
telefono=ptelefono,
acceso=pacceso,
login=plogin,
contraseña=MD5(pcontraseña)$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `chofer`
--

CREATE TABLE `chofer` (
  `cedula_chofer` int(10) UNSIGNED NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellido` varchar(20) NOT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `estado` varchar(15) NOT NULL,
  `Num_viajes` int(10) UNSIGNED DEFAULT NULL,
  `Km_recorrido` decimal(10,2) UNSIGNED DEFAULT NULL,
  `dia_viaje` int(10) UNSIGNED DEFAULT NULL,
  `viatico` decimal(10,2) DEFAULT NULL,
  `pago` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `chofer`
--

INSERT INTO `chofer` (`cedula_chofer`, `nombre`, `apellido`, `direccion`, `telefono`, `estado`, `Num_viajes`, `Km_recorrido`, `dia_viaje`, `viatico`, `pago`) VALUES
(1000, 'Maria', 'Garcia', 'Av caracas', '', 'Ocupado', 0, '0.00', 0, '2000.00', '24300.00'),
(2000, 'perdo', 'perez', 'ccs', '0.00', 'Ocupado', 1, '27900.00', 5, '0.00', '10000.00'),
(3000, 'Jose', 'Cote', '', '', 'Ocupado', 0, '0.00', 0, '4000.00', '14000.00'),
(4000, 'Luis', 'Castro', '', '', 'Ocupado', 0, '0.00', 0, '0.00', '10000.00'),
(4500, 'Robert', 'Vallenilla', '', '', 'Ocupado', 0, '0.00', 0, '0.00', '10000.00'),
(5000, 'Perez', 'Jimenez', 'bna', '', 'Ocupado', 0, '0.00', 0, '0.00', '10000.00'),
(5050, 'Pedro', 'Moya', 'Nueva Barcelona', '0414-78622', 'Ocupado', 1, '1000.00', 3, '0.00', '10000.00'),
(6000, 'Vicente', 'Gomez', 'bna', '', 'Ocupado', 0, '0.00', 0, '0.00', '10000.00'),
(7000, 'Juan', 'Calors', 'DIego bautsita', '455', 'Ocupado', 1, '500.00', 2, '0.00', '10000.00'),
(8000, 'Eliezer', 'Lopez', 'Bna', '', 'Disponible', 0, '0.00', 0, '2000.00', '12000.00'),
(8500, 'Miguel', 'Contreras', 'Arborada', '', 'Ocupado', 1, '4000.00', 5, '0.00', '10000.00'),
(9000, 'Franciosco', 'Fernandez', 'PLC', '0414-78954', 'Disponible', 0, '0.00', 0, '0.00', '0.00'),
(70005, 'Alejandra', 'Miche', '', '', 'Ocupado', 0, '0.00', 0, '0.00', '10000.00'),
(2014785, 'Manrique', 'Castro', 'Boyaca', '0', 'Ocupado', 0, '0.00', 0, '0.00', '10000.00'),
(24513866, 'jose', 'cortez', 'araya	', '04128321424', 'Disponible', 0, '0.00', 0, '2000.00', '22800.00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `cedula_cliente` int(10) UNSIGNED NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellido` varchar(20) NOT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `cedula_usuario` int(10) UNSIGNED DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`cedula_cliente`, `nombre`, `apellido`, `direccion`, `telefono`, `cedula_usuario`) VALUES
(100, 'Romulo ', 'Betancourt', 'Caracas', '0414-45722', 400),
(200, 'Jen', 'Cova', 'Boyaca', '0412-478542', 400),
(300, 'Carlos', 'Chalbaud', 'Caracas', '0414-789542', 400),
(400, 'Angelica', 'Rich', 'Puerto La Cruz', '0414-78222', 400),
(444, 'Johan', 'useche', 'plc', '0414-78952', 505),
(555, 'Alfredo', 'Garcia', 'Casitas', '0414-48526', 400),
(21475, 'Johan', 'Useche', 'Puerto La Cruz', '0416-789452', 400),
(123456, 'Roxana', 'Carpio', 'lecheria morro', '0416-8754', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estacionamiento`
--

CREATE TABLE `estacionamiento` (
  `idEstacionamiento` int(11) NOT NULL,
  `ciudad` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `estacionamiento`
--

INSERT INTO `estacionamiento` (`idEstacionamiento`, `ciudad`) VALUES
(1, 'caracas el valle'),
(9, 'caracas'),
(10, 'Anzoategui'),
(11, 'Lecherias'),
(12, 'Puerto La cruz'),
(13, 'Tucupita'),
(14, 'San Cristobal'),
(15, 'Maracaibo'),
(16, 'Cupira'),
(17, 'Vargas'),
(18, 'Barquisimeto');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `kilometraje`
--

CREATE TABLE `kilometraje` (
  `ID` int(11) NOT NULL,
  `numero_solicitud` int(10) UNSIGNED NOT NULL,
  `placa` varchar(15) DEFAULT NULL,
  `cedula_chofer` int(10) UNSIGNED DEFAULT NULL,
  `km_inicial` decimal(10,2) DEFAULT NULL,
  `km_final` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `kilometraje`
--

INSERT INTO `kilometraje` (`ID`, `numero_solicitud`, `placa`, `cedula_chofer`, `km_inicial`, `km_final`) VALUES
(1, 1, 'HHH11', 2000, NULL, NULL),
(2, 1, 'HHH10', 1000, NULL, NULL),
(3, 1, 'HHH10', 3000, NULL, NULL),
(4, 2, 'HHH12', 4000, NULL, NULL),
(5, 3, 'HHH415', 5000, NULL, NULL),
(6, 4, 'HHH415', 5000, NULL, NULL),
(7, 5, 'HHH415', 5000, NULL, NULL),
(8, 11, 'HHH452', 2014785, '500.00', '0.00'),
(10, 11, 'HHH14', 2014785, '500.00', '0.00'),
(14, 3, 'HHH452', 7000, '700.00', '0.00'),
(20, 11, 'HHH415', 7000, '0.00', '400.00'),
(49, 11, '45FSA', 7000, '0.00', '300.00'),
(63, 11, 'HHH14', 7000, '0.00', '400.00'),
(67, 11, 'HHH12', 7000, '0.00', '600.00'),
(71, 12, 'HHH14', 7000, '400.00', '1000.00'),
(72, 12, 'HHH452', 7000, '1250.00', '1700.00'),
(73, 11, 'HHH415', 8000, '1500.00', '1800.00'),
(74, 11, 'HHH452', 2014785, '1700.00', '2500.00'),
(75, 11, 'HHH452', 2014785, '1700.00', '2500.00'),
(76, 11, 'HHH452', 2014785, '2500.00', '3000.00'),
(77, 11, 'HHH452', 6000, '2500.00', '3000.00'),
(78, 27, 'HHH10', 2014785, '0.00', '500.00'),
(79, 27, 'HHH10', 5000, '0.00', '500.00'),
(80, 18, 'HHH12', 5000, '2000.00', '2500.00'),
(82, 28, 'HHH14', 6000, '1000.00', '1500.00'),
(83, 17, 'HHH415', 4500, '1800.00', '2500.00'),
(85, 30, '45FSA', 70005, '300.00', '350.00'),
(87, 29, 'HHH415', 8500, '31000.00', '36000.00'),
(95, 28, 'HHH15', 1000, '2700.00', '3500.00'),
(96, 29, 'HHH13', 5050, '0.00', '1500.00'),
(98, 43, 'HHH13', 24513866, '1000.00', '1700.00'),
(99, 44, 'HHH13', 70005, '1700.00', '3100.00'),
(100, 44, 'HHH13', 3000, '1700.00', '3100.00'),
(101, 44, 'HHH10', 4000, '500.00', '1000.00'),
(102, 45, 'HBGD4', 7000, '0.00', '500.00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mantenimiento`
--

CREATE TABLE `mantenimiento` (
  `idMantenimiento` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `descripcion` varchar(100) DEFAULT NULL,
  `repuesto` varchar(45) NOT NULL,
  `placa` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `mantenimiento`
--

INSERT INTO `mantenimiento` (`idMantenimiento`, `fecha`, `descripcion`, `repuesto`, `placa`) VALUES
(1, '2016-04-09', 'fasaf', 'casa', 'HHH415'),
(2, '2016-04-09', 'caucho', 'cas', 'HHH415'),
(4, '2016-04-23', 'rolinera', 'caucho', 'HHH415'),
(5, '2016-04-12', '4faros de luces delanteors', 'faros', 'HHH452'),
(6, '2016-04-13', 'juegos de luces', 'luces', '45FSA'),
(7, '2016-05-12', '4 caucho', 'Caucho', 'HHH10'),
(8, '2016-05-12', '300cc', 'Motor', '45FSA'),
(10, '2016-07-30', 'Ferraro', 'Motor', 'DSADA14');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `precio`
--

CREATE TABLE `precio` (
  `ID` int(10) UNSIGNED NOT NULL,
  `Tarifa_Kg` decimal(10,2) UNSIGNED DEFAULT NULL,
  `Tarifa_viaje` decimal(10,2) UNSIGNED DEFAULT NULL,
  `Tarifa_Km` decimal(10,2) UNSIGNED DEFAULT NULL,
  `Tarifa_viatico` decimal(10,2) UNSIGNED DEFAULT NULL,
  `Sueldo_base` decimal(10,2) UNSIGNED DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `precio`
--

INSERT INTO `precio` (`ID`, `Tarifa_Kg`, `Tarifa_viaje`, `Tarifa_Km`, `Tarifa_viatico`, `Sueldo_base`) VALUES
(0, '30.00', '300.00', '15.00', '1000.00', '10000.00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `solicitud`
--

CREATE TABLE `solicitud` (
  `numero_solicitud` int(10) UNSIGNED NOT NULL,
  `cedula_cliente` int(10) UNSIGNED NOT NULL,
  `cargamento` varchar(45) DEFAULT NULL,
  `carga` int(10) UNSIGNED NOT NULL,
  `precio` decimal(10,2) UNSIGNED NOT NULL,
  `origen` varchar(45) DEFAULT NULL,
  `destino` varchar(150) NOT NULL,
  `fecha_envio` datetime DEFAULT NULL,
  `fecha_entrega` datetime DEFAULT NULL,
  `estado` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `solicitud`
--

INSERT INTO `solicitud` (`numero_solicitud`, `cedula_cliente`, `cargamento`, `carga`, `precio`, `origen`, `destino`, `fecha_envio`, `fecha_entrega`, `estado`) VALUES
(1, 21475, 'bloques', 5000, '7000.00', 'ccs', 'bna', '2016-04-15 21:13:00', '2016-04-15 21:13:00', 'Enviado'),
(2, 21475, 'cabillas', 4000, '5000.00', 'ccs', 'plc', '2016-03-16 21:27:00', '2016-03-16 21:27:00', 'Enviado'),
(3, 21475, 'sacos de cemento', 7000, '5000.00', 'ccs', 'bna', '2016-04-15 23:09:00', '2016-04-15 23:09:00', 'Enviado'),
(4, 123456, 'bloque', 4000, '10000.00', 'caracas el valle', 'Barcelona', '2016-04-15 21:17:00', '2016-04-15 21:17:00', 'Enviado'),
(5, 123456, 'hormigon', 4000, '10000.00', 'ccs', 'bna', '2016-03-09 21:27:00', '2016-03-09 21:27:00', 'Enviado'),
(11, 123456, 'scasc', 4400, '454.00', 'Enviado', 'bna', '2016-04-15 23:08:00', '2016-04-15 23:08:00', 'Enviado'),
(12, 21475, 'scsa', 44, '4.00', 'caracas', 'vfddf', '2016-04-15 23:09:00', '2016-04-15 23:09:00', 'Enviado'),
(13, 100, 'Ceramica', 4000, '120000.00', 'caracas el valle', 'Caracas', '2016-05-09 14:09:00', '2016-05-09 14:09:00', 'Enviado'),
(14, 300, 'Ceramica', 18000, '200000.00', 'caracas el valle', 'ccsgvdf', '2016-05-10 14:09:00', '2016-05-10 14:09:00', 'Enviado'),
(15, 100, 'Bloques', 7000, '18000.00', 'caracas el valle', 'ccs', '2016-01-09 14:19:00', '2016-01-09 14:19:00', 'Enviado'),
(16, 200, 'Bloquesgg', 50000, '70000.00', 'caracas el valle', 'ccs', '2016-02-10 14:19:00', '2016-02-10 14:19:00', 'Pendiente'),
(17, 21475, 'bloque', 7000, '20000.00', 'bna', 'ccs', '2016-01-09 14:19:00', '2016-01-09 14:19:00', 'Enviado'),
(18, 21475, 'bloquerrrr', 7000, '50000.00', 'caracas el valle', 'ccs', '2016-02-04 18:07:00', '2016-02-04 18:07:00', 'Pendiente'),
(19, 21475, 'bloque', 5000, '70000.00', 'ccs', 'bna', '2016-01-09 14:19:00', '2016-04-15 21:17:00', 'Enviado'),
(20, 21475, 'ceramica', 4000, '7000.00', 'ccs', 'bna', '2016-05-04 18:07:00', NULL, 'Enviado'),
(21, 300, 'bloque', 4000, '5000.00', 'bna', 'ccs', '2016-02-15 21:17:00', '2016-04-15 21:17:00', 'Enviado'),
(22, 200, 'ceramica', 4000, '5000.00', 'caracas el valle', 'maracay', '2016-03-16 21:17:00', '2016-03-16 21:17:00', 'Enviado'),
(23, 300, 'ceramica', 4000, '5000.00', 'caracas el valle', 'ccsa', '2016-04-12 21:17:00', '2016-07-20 20:22:00', 'Enviado'),
(24, 200, 'caraota', 4000, '10000.00', 'caracas el valle', 'ccs', '2016-04-13 21:17:00', '2016-07-20 20:22:00', 'Enviado'),
(25, 200, 'blouqe', 4000, '5000.00', 'caracas el valle', 'ccs', '2016-04-09 18:35:00', '2016-07-21 20:16:00', 'Enviado'),
(26, 100, 'bloque', 4000, '5000.00', 'caracas el valle', 'bna', '2016-05-09 18:35:00', '2016-05-09 19:00:00', 'Enviado'),
(27, 555, 'Ceramica', 7000, '5000.00', 'caracas el valle', 'Bna', '2016-05-12 12:24:00', '2016-05-12 12:24:00', 'Enviado'),
(28, 555, 'Harina Pan', 4000, '5000.00', 'caracas el valle', 'Bna', '2016-05-09 14:09:00', '2016-05-09 14:09:00', 'Enviado'),
(29, 100, 'Queso', 4000, '10000.00', 'Lecherias', 'Cumana', '2016-04-15 21:17:00', '2016-04-15 21:17:00', 'Enviado'),
(30, 400, 'Cabillas', 30000, '1000000.00', 'San Cristobal', 'Gobernacion del tachira', '2016-05-13 11:37:00', '2016-05-13 11:37:00', 'Enviado'),
(43, 100, 'bloque', 5000, '100000.00', 'caracas el valle', 'barcelona', '2016-07-20 15:45:00', '2016-07-20 15:45:00', 'Enviado'),
(44, 123456, 'bloque', 505, '10100.00', 'caracas el valle', 'gdrgdrvdsfsd', '2016-06-21 07:40:00', '2016-07-20 07:42:00', 'Enviado'),
(45, 444, 'bloque', 5000, '100000.00', 'Anzoategui', 'gobernacion de tachira', '2016-07-15 10:12:00', '2016-07-16 10:22:00', 'Enviado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `cedula_usuario` int(10) UNSIGNED NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellido` varchar(20) NOT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `acceso` varchar(10) NOT NULL,
  `login` varchar(20) NOT NULL,
  `contraseña` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`cedula_usuario`, `nombre`, `apellido`, `direccion`, `telefono`, `acceso`, `login`, `contraseña`) VALUES
(400, 'Fredeleine', 'Monzant', 'Arborada', '0416-78412', 'Empleado', 'frede', '0a7f8a7568242da668684cae8d8972dd'),
(500, 'Andrea', 'Dos Santos', 'Lecherias', '0415-455', 'Empleado', 'andrea', '54910c5c09962d6d268b1f3231fded77'),
(504, 'Manuel', 'Carrasquero', 'barcelona kkk', '0414-87411', 'Gerente', 'manuel', '96917805fd060e3766a9a1b834639d35'),
(505, 'Randolph', 'Zamora', 'Arboleda', '0414-7760973', 'Gerente', 'Randy', 'b569628f772e83ca1bf17f06a74a26e5'),
(200000, 'Fernando', 'Martinez de la Riva', 'San Diego', '0414-7892', 'Empleado', 'fernado', 'c56d0e9a7ccec67b4ea131655038d604');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vehiculo`
--

CREATE TABLE `vehiculo` (
  `placa` varchar(15) NOT NULL,
  `modelo` varchar(20) DEFAULT NULL,
  `numero_solicitud` int(11) DEFAULT NULL,
  `observacion` varchar(100) DEFAULT NULL,
  `kilometraje` decimal(10,2) UNSIGNED NOT NULL,
  `estado` varchar(15) NOT NULL,
  `capacidad` int(11) UNSIGNED NOT NULL,
  `idEstacionamiento` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `vehiculo`
--

INSERT INTO `vehiculo` (`placa`, `modelo`, `numero_solicitud`, `observacion`, `kilometraje`, `estado`, `capacidad`, `idEstacionamiento`) VALUES
('45FSA', 'mercedes benz', 0, '', '350.00', 'Disponible', 35000, 1),
('DSADA14', 'mercedes', 0, '', '0.00', 'Disponible', 31000, 15),
('HBGD4', 'mercedes', 0, '', '500.00', 'Disponible', 29000, 16),
('HHH10', 'Mercedes Benz', 0, NULL, '1000.00', 'Disponible', 31500, 1),
('HHH11', 'Mercedes Benz', 0, NULL, '1050.00', 'Disponible', 35000, 10),
('HHH12', 'Renault', 0, NULL, '2500.00', 'Disponible', 31000, 1),
('HHH13', 'Ford', 0, 'ninguna', '3100.00', 'Disponible', 31000, 1),
('HHH14', 'Ford', 0, 'ninguna', '1500.00', 'Mantenimiento', 35000, 9),
('HHH15', 'Ford', 0, '', '3500.00', 'Disponible', 31000, 10),
('HHH16', 'Mercedes', 0, '', '0.00', 'Disponible', 15000, 11),
('HHH415', 'Toyota', 0, 'Ninguna', '35000.00', 'Disponible', 31000, 1),
('HHH415B', 'mercedes', 0, '', '0.00', 'Disponible', 28000, 16),
('HHH452', 'Renault', 0, 'Ninguna', '3000.00', 'Disponible', 30000, 11);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `chofer`
--
ALTER TABLE `chofer`
  ADD PRIMARY KEY (`cedula_chofer`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`cedula_cliente`),
  ADD KEY `fkCedula_cliente_idx` (`cedula_usuario`);

--
-- Indices de la tabla `estacionamiento`
--
ALTER TABLE `estacionamiento`
  ADD PRIMARY KEY (`idEstacionamiento`);

--
-- Indices de la tabla `kilometraje`
--
ALTER TABLE `kilometraje`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `fk_vehiculo_has_chofer_chofer1_idx` (`cedula_chofer`),
  ADD KEY `fk_vehiculo_has_chofer_vehiculo1_idx` (`placa`),
  ADD KEY `fk_vehiculo_has_solicitud_idx` (`numero_solicitud`);

--
-- Indices de la tabla `mantenimiento`
--
ALTER TABLE `mantenimiento`
  ADD PRIMARY KEY (`idMantenimiento`),
  ADD KEY `FK_Mantenimiento_placa_idx` (`placa`);

--
-- Indices de la tabla `precio`
--
ALTER TABLE `precio`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `solicitud`
--
ALTER TABLE `solicitud`
  ADD PRIMARY KEY (`numero_solicitud`),
  ADD KEY `fkNumero_solicitud_idx` (`cedula_cliente`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`cedula_usuario`),
  ADD UNIQUE KEY `login_UNIQUE` (`login`);

--
-- Indices de la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  ADD PRIMARY KEY (`placa`),
  ADD KEY `fkVehiculo_idEstacionamiento_idx` (`idEstacionamiento`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `estacionamiento`
--
ALTER TABLE `estacionamiento`
  MODIFY `idEstacionamiento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
--
-- AUTO_INCREMENT de la tabla `kilometraje`
--
ALTER TABLE `kilometraje`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=103;
--
-- AUTO_INCREMENT de la tabla `mantenimiento`
--
ALTER TABLE `mantenimiento`
  MODIFY `idMantenimiento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT de la tabla `solicitud`
--
ALTER TABLE `solicitud`
  MODIFY `numero_solicitud` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=46;
--
-- AUTO_INCREMENT de la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  MODIFY `idEstacionamiento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `fkCedula` FOREIGN KEY (`cedula_usuario`) REFERENCES `usuario` (`cedula_usuario`) ON DELETE SET NULL ON UPDATE NO ACTION;

--
-- Filtros para la tabla `kilometraje`
--
ALTER TABLE `kilometraje`
  ADD CONSTRAINT `fk_Solicitud_has_Kilometraje` FOREIGN KEY (`numero_solicitud`) REFERENCES `solicitud` (`numero_solicitud`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_vehiculo_has_chofer_chofer1` FOREIGN KEY (`cedula_chofer`) REFERENCES `chofer` (`cedula_chofer`) ON DELETE SET NULL ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_vehiculo_has_vehiculo` FOREIGN KEY (`placa`) REFERENCES `vehiculo` (`placa`) ON DELETE SET NULL ON UPDATE NO ACTION;

--
-- Filtros para la tabla `mantenimiento`
--
ALTER TABLE `mantenimiento`
  ADD CONSTRAINT `FK_Mantenimiento_placa` FOREIGN KEY (`placa`) REFERENCES `vehiculo` (`placa`) ON DELETE CASCADE ON UPDATE NO ACTION;

--
-- Filtros para la tabla `solicitud`
--
ALTER TABLE `solicitud`
  ADD CONSTRAINT `fkNumero_solicitud` FOREIGN KEY (`cedula_cliente`) REFERENCES `cliente` (`cedula_cliente`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  ADD CONSTRAINT `fkVehiculo_idEstacionamiento` FOREIGN KEY (`idEstacionamiento`) REFERENCES `estacionamiento` (`idEstacionamiento`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
