-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 17-10-2026 a las 17:20:35
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tienda_db`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `precio` double NOT NULL,
  `id` bigint(20) NOT NULL,
  `imagen` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `descripcion` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`precio`, `id`, `imagen`, `nombre`, `descripcion`) VALUES
(671.21, 1, 'camera.jpg', 'FinePix Pro2 3D Camera', 'Cámara profesional FinePix Pro2 3D con lente de alta resolución, grabación Full HD y diseño ergonómico ideal para fotógrafos exigentes.'),
(215.1, 2, 'hard-drive.jpg', 'EXP Portable Hard Drive', 'Disco duro externo EXP Portable de alta velocidad, 1TB, conexión USB 3.0, resistente a golpes y compatible con Windows y Mac.'),
(2121.86, 3, 'watch.jpg', 'Luxury Ultra thin Wrist Watch', 'Reloj de lujo ultradelgado con correa de acero inoxidable, resistencia al agua y diseño elegante para toda ocasión.'),
(10232.35, 4, 'laptop.jpg', 'XP 1155 Intel Core Laptop', 'Laptop XP 1155 con procesador Intel Core i7, pantalla de 15 pulgadas, 16GB RAM y 512GB SSD, ideal para trabajo y gaming.'),
(189.99, 5, 'auriculares.jpg', 'Auriculares Bluetooth', 'Auriculares Bluetooth con micrófono integrado, cancelación de ruido, batería de larga duración y sonido envolvente 360º.'),
(95, 6, 'mouse.jpg', 'Mouse Inalámbrico', 'Mouse ergonómico con sensor óptico preciso, diseño cómodo y conexión inalámbrica estable.'),
(250, 7, 'teclado.jpg', 'Teclado Mecánico RGB', 'Teclado mecánico retroiluminado RGB, con switches duraderos y diseño compacto para gamers.'),
(850, 8, 'monitor.jpg', 'Monitor 24 Pulgadas', 'Monitor LED Full HD de 24 pulgadas, colores vibrantes y tecnología antirreflejo para mayor comodidad visual.'),
(180, 9, 'powerbank.jpg', 'Cargador Portátil 10000mAh', 'Powerbank compacto de alta capacidad, con carga rápida y doble puerto USB.');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
