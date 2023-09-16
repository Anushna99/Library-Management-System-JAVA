-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Feb 12, 2021 at 10:24 AM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ead_cw`
--

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

DROP TABLE IF EXISTS `books`;
CREATE TABLE IF NOT EXISTS `books` (
  `recId` int(11) NOT NULL AUTO_INCREMENT,
  `bookId` varchar(10) NOT NULL,
  `bookTitle` varchar(100) NOT NULL,
  `author` varchar(60) NOT NULL,
  `numOfCopies` int(11) NOT NULL,
  `numOfAvailableCopies` int(11) NOT NULL,
  PRIMARY KEY (`recId`)
) ENGINE=MyISAM AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`recId`, `bookId`, `bookTitle`, `author`, `numOfCopies`, `numOfAvailableCopies`) VALUES
(1, 'B000001', 'Madol Duwa', 'Martin Wickramasinghe', 8, 8),
(2, 'B000002', 'Good Earth', 'Pearl S. Buck', 6, 6),
(3, 'B000003', 'The Godfather', 'Mario Puzo', 5, 3),
(4, 'B000004', 'A Brief History Of Time', 'Stephen Hawking', 10, 9),
(5, 'B000005', 'Tom Sawyer', 'Mark Twain', 12, 12),
(6, 'B000006', 'Oliver Twist', 'Charles Dickens', 15, 14),
(7, 'B000007', 'Rich Dad Poor Dad', 'Robert Kiyosaki', 8, 7),
(8, 'B000008', 'Gamperaliya', 'Martin Wickramasinghe', 12, 10),
(9, 'B000009', 'Jam Fruit Tree', 'Carl Muller', 5, 4),
(10, 'B000010', 'The Flesh Of The Orchid', 'James Hadley Chase', 12, 11),
(11, 'B000011', 'Village By The Sea', 'Anita Desai', 10, 10),
(12, 'B000012', 'Tom', 'MArk twain', 5, 5);

-- --------------------------------------------------------

--
-- Table structure for table `borrowed_books`
--

DROP TABLE IF EXISTS `borrowed_books`;
CREATE TABLE IF NOT EXISTS `borrowed_books` (
  `memberId` varchar(10) NOT NULL,
  `bookId` varchar(10) NOT NULL,
  `borrowedDate` date NOT NULL,
  `dueDate` date NOT NULL,
  `isReturned` varchar(5) NOT NULL DEFAULT 'No',
  PRIMARY KEY (`memberId`,`bookId`,`borrowedDate`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `borrowed_books`
--

INSERT INTO `borrowed_books` (`memberId`, `bookId`, `borrowedDate`, `dueDate`, `isReturned`) VALUES
('M000001', 'B000001', '2021-02-09', '2021-03-02', 'Yes'),
('M000001', 'B000002', '2021-02-09', '2021-03-02', 'Yes'),
('M000001', 'B000003', '2021-02-09', '2021-03-02', 'Yes'),
('M000002', 'B000001', '2021-02-09', '2021-03-02', 'Yes'),
('M000002', 'B000002', '2021-02-10', '2021-03-03', 'Yes'),
('M000001', 'B000007', '2021-02-10', '2021-03-03', 'No'),
('M000006', 'B000003', '2021-02-10', '2021-03-03', 'No'),
('M000006', 'B000004', '2021-02-10', '2021-03-03', 'No'),
('M000004', 'B000006', '2021-02-10', '2021-03-03', 'Yes'),
('M000005', 'B000008', '2021-02-10', '2021-03-03', 'No'),
('M000005', 'B000003', '2021-02-10', '2021-03-03', 'No'),
('M000004', 'B000009', '2021-02-11', '2021-03-04', 'No'),
('M000002', 'B000005', '2021-02-11', '2021-03-04', 'Yes'),
('M000007', 'B000001', '2021-02-11', '2021-03-04', 'Yes'),
('M000006', 'B000008', '2021-02-11', '2021-03-04', 'No'),
('M000003', 'B000010', '2021-02-12', '2021-03-05', 'No'),
('M000002', 'B000006', '2021-02-12', '2021-03-05', 'No');

-- --------------------------------------------------------

--
-- Table structure for table `members`
--

DROP TABLE IF EXISTS `members`;
CREATE TABLE IF NOT EXISTS `members` (
  `recId` int(11) NOT NULL AUTO_INCREMENT,
  `memberId` varchar(10) NOT NULL,
  `firstName` varchar(50) NOT NULL,
  `lastName` varchar(50) NOT NULL,
  `address` varchar(150) NOT NULL,
  `DOB` date NOT NULL,
  `gender` varchar(10) NOT NULL,
  `tpNumber` varchar(12) NOT NULL,
  PRIMARY KEY (`recId`)
) ENGINE=MyISAM AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `members`
--

INSERT INTO `members` (`recId`, `memberId`, `firstName`, `lastName`, `address`, `DOB`, `gender`, `tpNumber`) VALUES
(1, 'M000001', 'Kamal', 'Perera', 'Kandy', '1993-03-09', 'Male', '0785412963'),
(2, 'M000002', 'Nimal', 'Jayasekara', 'Kottawa', '1997-07-22', 'Male', '0714582355'),
(3, 'M000003', 'Asela', 'Senarathna', 'Kottawa', '1989-03-04', 'Male', '0765245874'),
(4, 'M000004', 'Kumara', 'Wijayathilaka', 'Borella', '1998-02-07', 'Male', '0714568245'),
(5, 'M000005', 'Namal', 'Perera', 'Pitipana', '1983-06-16', 'Male', '0784521458'),
(6, 'M000006', 'Ravindu', 'Marapana', 'Colombo,05', '1988-08-28', 'Male', '0112458566'),
(7, 'M000007', 'Nisal', 'Perera', 'Padukka', '2000-03-14', 'Male', '0724566542'),
(8, 'M000008', 'Maheshi', 'Rathnayake', 'Horana', '1991-02-09', 'Female', '0112465632'),
(9, 'M000009', 'Amali', 'Jayaweera', 'Hokandara', '1988-06-13', 'Female', '0784525123'),
(10, 'M000010', 'Tharini', 'Gunawardana', 'Nawala', '2000-11-10', 'Female', '0764851233'),
(11, 'M000011', 'Chamara', 'Galappaththi', 'Kirulapona', '1992-02-01', 'Male', '0112789554'),
(12, 'M000012', 'Madavi', 'Fernando', 'Trinco', '1993-11-28', 'Female', '0360125488');

-- --------------------------------------------------------

--
-- Table structure for table `system_users`
--

DROP TABLE IF EXISTS `system_users`;
CREATE TABLE IF NOT EXISTS `system_users` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `user_type` varchar(15) NOT NULL,
  `mail_address` varchar(150) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `system_users`
--

INSERT INTO `system_users` (`user_id`, `user_name`, `password`, `user_type`, `mail_address`) VALUES
(1, 'Anushna', 'anushna', 'Admin', 'ashashipriya@gmail.com'),
(2, 'Amila', 'amila123', 'Regular', 'amila25@gmail.com'),
(3, 'Kamal', 'kamal123', 'Regular', 'kamal123@gmail.com'),
(4, 'Ashen', 'ashen123', 'Regular', 'ashen123@gmail.com'),
(5, 'Luke12', 'luke123', 'Regular', 'luke12@gmail.com'),
(6, 'Tharindu', 'tharindu', 'Admin', 'tharindu25@gmail.com'),
(7, 'Shamal', 'shamal12', 'Regular', 'shamal@gmail.com');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
