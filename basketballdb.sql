-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 01, 2022 at 12:20 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `basketballdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `matches`
--

CREATE DATABASE basketballdb;

USE basketballdb;

CREATE TABLE `matches` (
  `id` int(11) NOT NULL,
  `home_team` int(11) NOT NULL,
  `away_team` int(11) NOT NULL,
  `round` int(11) NOT NULL,
  `home_score` int(11) NOT NULL,
  `away_score` int(11) NOT NULL,
  `q1_home_score` int(11) NOT NULL,
  `q1_away_score` int(11) NOT NULL,
  `q2_home_score` int(11) NOT NULL,
  `q2_away_score` int(11) NOT NULL,
  `q3_home_score` int(11) NOT NULL,
  `q3_away_score` int(11) NOT NULL,
  `q4_home_score` int(11) NOT NULL,
  `q4_away_score` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `matches`
--

INSERT INTO `matches` (`id`, `home_team`, `away_team`, `round`, `home_score`, `away_score`, `q1_home_score`, `q1_away_score`, `q2_home_score`, `q2_away_score`, `q3_home_score`, `q3_away_score`, `q4_home_score`, `q4_away_score`) VALUES
(1, 7, 5, 23, 77, 76, 22, 21, 17, 15, 16, 28, 22, 12),
(2, 2, 6, 23, 82, 87, 19, 17, 20, 19, 19, 27, 24, 24),
(3, 10, 1, 23, 80, 74, 17, 20, 18, 13, 21, 23, 24, 18),
(4, 4, 9, 23, 90, 82, 21, 25, 24, 20, 15, 18, 30, 19),
(5, 12, 8, 23, 98, 67, 17, 20, 32, 15, 24, 15, 25, 17),
(6, 3, 13, 23, 93, 74, 16, 19, 20, 29, 16, 25, 16, 21),
(7, 13, 7, 24, 89, 67, 21, 16, 20, 17, 25, 12, 23, 22),
(8, 1, 4, 24, 83, 67, 26, 11, 15, 21, 32, 19, 10, 16),
(9, 5, 2, 24, 79, 80, 19, 23, 22, 19, 19, 19, 19, 20),
(10, 8, 3, 24, 83, 74, 18, 19, 22, 19, 21, 20, 22, 16),
(11, 6, 11, 24, 70, 78, 13, 20, 18, 30, 25, 10, 14, 18),
(12, 9, 12, 24, 67, 76, 12, 16, 17, 18, 24, 22, 14, 20),
(13, 2, 13, 25, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(14, 12, 3, 25, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(15, 7, 8, 25, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(16, 10, 6, 25, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(17, 9, 1, 25, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(18, 11, 5, 25, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(19, 3, 7, 26, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(20, 1, 12, 26, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(21, 8, 2, 26, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(22, 13, 11, 26, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(23, 5, 10, 26, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(24, 6, 4, 26, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `players`
--

CREATE TABLE `players` (
  `id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `position` varchar(20) NOT NULL,
  `team_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `players`
--

INSERT INTO `players` (`id`, `name`, `position`, `team_id`) VALUES
(1, 'K. Papadakis', 'Guard', 1),
(2, 'B. Garrett', 'Forward', 1),
(3, 'H. Mike', 'Guard', 1),
(4, 'J. Abrams', 'Guard', 1),
(5, 'D. Stamatis', 'Guard', 1),
(6, 'M. Dolezaj', 'Forward', 1),
(7, 'G. Fillios', 'Guard', 1),
(8, 'D. Charitopoulos', 'Forward', 1),
(9, 'A. Panagiotis', 'Guard', 1),
(10, 'I. Koloveros', 'Guard', 2),
(11, 'L. Mavrokefalidis', 'Guard', 2),
(12, 'D. Hamilton', 'Forward', 2),
(13, 'N. Arsenopoulos', 'Guard', 2),
(14, 'G. Giouzelis', 'Forward', 2),
(15, 'E. Tzolos', 'Guard', 2),
(16, 'M. Kingsley', 'Forward', 2),
(17, 'K. Tumba', 'Guard', 2),
(18, 'M. Mustafa', 'Forward', 2),
(19, 'G. Simmons', 'Guard', 3),
(20, 'G. Tsalmpouris', 'Center', 3),
(21, 'G. Diamantakos', 'Center', 3),
(22, 'G. Bogris', 'Center', 3),
(23, 'F. Zoumpos', 'Guard', 3),
(24, 'N. Tsiakmas', 'Guard', 3),
(25, 'E. Long', 'Guard', 3),
(26, 'T. McLean', 'Guard', 3),
(27, 'R. Vaughn', 'Guard', 4),
(28, 'V. Mouratos', 'Guard', 4),
(29, 'A. Nikolaidis', 'Guard', 4),
(30, 'D. Kaklamanakis', 'Center', 4),
(31, 'J. Savage', 'Guard', 4),
(32, 'A. Aminu', 'Center', 4),
(33, 'N. Persidis', 'Forward', 4),
(34, 'Williams Jr', 'Guard', 4),
(35, 'V. Toliopoulos', 'Guard', 5),
(36, 'Edward Greene IV', 'Guard', 5),
(37, 'D. Rivers', 'Guard', 5),
(38, 'G. Kamperidis', 'Forward', 5),
(39, 'E. Mantzaris', 'Guard', 5),
(40, 'J. Love', 'Guard', 5),
(41, 'V. Jankovic', 'Forward', 5),
(42, 'N. Renfro', 'Forward', 5),
(43, 'T. Petteway', 'Forward', 6),
(44, 'V. Christidis', 'Forward', 6),
(45, 'S. Gray', 'Guard', 6),
(46, 'K. Bilalis', 'Guard', 6),
(47, 'T. Gielo', 'Forward', 6),
(48, 'C. Saloustros', 'Guard', 6),
(49, 'G. Cosey', 'Guard', 6),
(50, 'D. Moraitis', 'Guard', 6),
(51, 'S. Poulianitis', 'Guard', 7),
(52, 'A. Cowan', 'Guard', 7),
(53, 'S. Juiston', 'Forward', 7),
(54, 'O. Netzipoglou', 'Guard', 7),
(55, 'X. Williams', 'Forward', 7),
(56, 'E. Lockett', 'Guard', 7),
(57, 'T. Kottas', 'Center', 7),
(58, 'N. Kamaras', 'Forward', 7),
(59, 'T. Zaras', 'Guard', 8),
(60, 'M. Maric', 'Center', 8),
(61, 'M. Tsairelis', 'Forward', 8),
(62, 'S. Moody', 'Guard', 8),
(63, 'O. Krubally', 'Forward', 8),
(64, 'J. Hudson', 'Guard', 8),
(65, 'Z. Karampelas', 'Guard', 8),
(66, 'J. Berzins', 'Forward', 8),
(67, 'J. Grant', 'Center', 9),
(68, 'D. Agravanis', 'Forward', 9),
(69, 'K. Ray', 'Guard', 9),
(70, 'M. Foster', 'Guard', 9),
(71, 'T. Simpson', 'Guard', 9),
(72, 'N. Gikas', 'Guard', 9),
(73, 'D. Hunt', 'Center', 9),
(74, 'I. Agravanis', 'Forward', 9),
(75, 'J. Barrufet', 'Guard', 10),
(76, 'A. Rautins', 'Guard', 10),
(77, 'G. Kouzeloglou', 'Forward', 10),
(78, 'I. Hummer', 'Forward', 10),
(79, 'D. Mavroeidis', 'Center', 10),
(80, 'A. Petropoulos', 'Guard', 10),
(81, 'A. Koniaris', 'Guard', 10),
(82, 'D. Flionis', 'Guard', 10),
(83, 'J. Floyd', 'Guard', 11),
(84, 'S. Miller', 'Forward', 11),
(85, 'S. Momirov', 'Guard', 11),
(86, 'V. Margaritis', 'Forward', 11),
(87, 'K. Williams', 'Guard', 11),
(88, 'S. Billis', 'Forward', 11),
(89, 'S. Pot', 'Guard', 11),
(90, 'K. Tillie', 'Forward', 11),
(91, 'J. Evans', 'Forward', 12),
(92, 'I. Papapetrou', 'Forward', 12),
(93, 'O. White', 'Forward', 12),
(94, 'D. Macon', 'Guard', 12),
(95, 'N. Chougaz', 'Forward', 12),
(96, 'L. Kaselakis', 'Forward', 12),
(97, 'H. Sant-Roos', 'Guard', 12),
(98, 'V. Kavvadas', 'Center', 12),
(99, 'A. Vezenkov', 'Forward', 13),
(100, 'K. Sloukas', 'Guard', 13),
(101, 'Q. Acy', 'Forward', 13),
(102, 'M. Fall', 'Center', 13),
(103, 'M. Lountzis', 'Guard', 13),
(104, 'K. Papanikolaou', 'Forward', 13),
(105, 'G. Larentzakis', 'Guard', 13),
(106, 'T. Walkup', 'Guard', 13);

-- --------------------------------------------------------

--
-- Table structure for table `players_match_stats`
--

CREATE TABLE `players_match_stats` (
  `player_id` int(11) NOT NULL,
  `round` int(11) NOT NULL,
  `points` int(11) NOT NULL,
  `rebounds` int(11) NOT NULL,
  `assists` int(11) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `players_match_stats`
--

INSERT INTO `players_match_stats` (`player_id`, `round`, `points`, `rebounds`, `assists`, `id`) VALUES
(2, 23, 10, 3, 2, 1),
(3, 23, 7, 5, 2, 2),
(52, 23, 19, 5, 4, 3),
(100, 23, 23, 4, 3, 4),
(16, 23, 15, 6, 4, 5),
(25, 23, 14, 6, 4, 6),
(40, 23, 23, 7, 1, 7),
(52, 24, 25, 7, 2, 8),
(12, 24, 18, 3, 0, 9),
(100, 24, 26, 3, 1, 10),
(99, 24, 23, 4, 2, 11),
(49, 24, 17, 7, 3, 12),
(43, 24, 19, 4, 2, 13),
(35, 24, 17, 7, 3, 14),
(20, 24, 19, 5, 3, 15),
(61, 24, 21, 4, 5, 16);

-- --------------------------------------------------------

--
-- Table structure for table `players_overall_stats`
--

CREATE TABLE `players_overall_stats` (
  `player_id` int(11) NOT NULL,
  `points` int(11) NOT NULL,
  `rebounds` int(11) NOT NULL,
  `assists` int(11) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `players_overall_stats`
--

INSERT INTO `players_overall_stats` (`player_id`, `points`, `rebounds`, `assists`, `id`) VALUES
(52, 341, 110, 132, 1),
(20, 332, 112, 89, 2),
(28, 267, 113, 145, 3),
(39, 185, 110, 95, 4),
(77, 245, 145, 87, 5),
(104, 278, 132, 98, 6),
(99, 305, 143, 89, 7),
(100, 345, 87, 127, 8),
(81, 259, 120, 78, 9),
(63, 257, 113, 89, 10),
(42, 152, 89, 78, 11),
(35, 256, 78, 56, 12),
(40, 178, 78, 98, 13),
(72, 152, 56, 74, 14),
(68, 214, 103, 87, 15);

-- --------------------------------------------------------

--
-- Table structure for table `teams`
--

CREATE TABLE `teams` (
  `id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `logo` varchar(300) NOT NULL,
  `wins` int(11) NOT NULL,
  `losses` int(11) NOT NULL,
  `matches` int(11) NOT NULL,
  `points` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `teams`
--

INSERT INTO `teams` (`id`, `name`, `logo`, `wins`, `losses`, `matches`, `points`) VALUES
(1, 'Iraklis', 'https://upload.wikimedia.org/wikipedia/el/5/59/GS_Iraklis_BC_logo.png', 6, 16, 22, 27),
(2, 'Ionikos', 'https://upload.wikimedia.org/wikipedia/el/c/c2/IonikoshncWHITE.png', 6, 16, 22, 25),
(3, 'Apollon Patras', 'https://upload.wikimedia.org/wikipedia/en/9/91/A.S._Apollon_Patras_logo.png', 7, 15, 22, 29),
(4, 'Lavrio', 'https://upload.wikimedia.org/wikipedia/en/d/d2/GS_Lavrio_Megabolt_logo.png', 8, 14, 22, 30),
(5, 'PAOK', 'https://upload.wikimedia.org/wikipedia/en/8/86/P.A.O.K._B.C._logo.png', 9, 13, 22, 31),
(6, 'Peristeri', 'https://upload.wikimedia.org/wikipedia/en/7/71/Peristeri_Winmasters_logo.png', 9, 13, 22, 31),
(7, 'Aris', 'https://upload.wikimedia.org/wikipedia/en/4/4f/Arisbc_crest.png', 10, 12, 22, 32),
(8, 'Larisa', 'https://upload.wikimedia.org/wikipedia/en/7/79/Larissa_Basketball_Club_Logo.jpg', 9, 12, 22, 32),
(9, 'Promitheas', 'https://upload.wikimedia.org/wikipedia/en/thumb/c/c5/Promitheas_Patras_BC_logo.svg/1200px-Promitheas_Patras_BC_logo.svg.png', 11, 11, 22, 33),
(10, 'AEK', 'https://upload.wikimedia.org/wikipedia/en/thumb/2/22/AEK_NEW_LOGO_3_STARS.png/200px-AEK_NEW_LOGO_3_STARS.png', 12, 10, 22, 34),
(11, 'Kolossos Rhodes', 'https://upload.wikimedia.org/wikipedia/en/5/55/Kolossos_Rodou_H_Hotels_logo.png', 14, 8, 22, 36),
(12, 'Panathinaikos', 'https://upload.wikimedia.org/wikipedia/en/thumb/1/18/Panathinaikos_BC_logo.svg/1200px-Panathinaikos_BC_logo.svg.png', 20, 2, 22, 42),
(13, 'Olympiakos', 'https://upload.wikimedia.org/wikipedia/en/thumb/7/7f/Olympiacos_BC_logo.svg/1200px-Olympiacos_BC_logo.svg.png', 21, 1, 22, 43);

-- --------------------------------------------------------

--
-- Table structure for table `teams_match_stats`
--

CREATE TABLE `teams_match_stats` (
  `match_id` int(11) NOT NULL,
  `team_id` int(11) NOT NULL,
  `free_throws` int(11) NOT NULL,
  `lost_free_throws` int(11) NOT NULL,
  `2pointers` int(11) NOT NULL,
  `lost_2pointers` int(11) NOT NULL,
  `3pointers` int(11) NOT NULL,
  `lost_3pointers` int(11) NOT NULL,
  `field_goals` int(11) NOT NULL,
  `lost_field_goals` int(11) NOT NULL,
  `rebounds` int(11) NOT NULL,
  `defensive_rebounds` int(11) NOT NULL,
  `offensive_rebounds` int(11) NOT NULL,
  `assists` int(11) NOT NULL,
  `turnovers` int(11) NOT NULL,
  `steals` int(11) NOT NULL,
  `blocks` int(11) NOT NULL,
  `fouls` int(11) NOT NULL,
  `timeouts` int(11) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `teams_match_stats`
--

INSERT INTO `teams_match_stats` (`match_id`, `team_id`, `free_throws`, `lost_free_throws`, `2pointers`, `lost_2pointers`, `3pointers`, `lost_3pointers`, `field_goals`, `lost_field_goals`, `rebounds`, `defensive_rebounds`, `offensive_rebounds`, `assists`, `turnovers`, `steals`, `blocks`, `fouls`, `timeouts`, `id`) VALUES
(1, 7, 15, 31, 19, 37, 8, 20, 27, 57, 28, 21, 7, 14, 5, 7, 0, 21, 4, 1),
(1, 5, 11, 18, 19, 28, 9, 22, 28, 50, 21, 28, 3, 13, 11, 2, 3, 24, 5, 2),
(2, 2, 20, 26, 16, 31, 10, 34, 26, 65, 34, 27, 7, 18, 11, 4, 2, 19, 6, 3),
(2, 6, 13, 13, 22, 40, 10, 30, 32, 70, 37, 28, 9, 16, 10, 4, 2, 24, 3, 4),
(3, 10, 11, 15, 21, 29, 9, 40, 30, 69, 37, 28, 9, 16, 10, 3, 4, 22, 0, 5),
(3, 1, 12, 21, 13, 36, 12, 26, 25, 62, 34, 26, 8, 18, 10, 5, 1, 18, 6, 6),
(4, 4, 31, 37, 19, 38, 7, 23, 26, 61, 40, 29, 11, 19, 9, 4, 5, 18, 4, 7),
(4, 9, 11, 15, 22, 44, 9, 22, 31, 66, 32, 26, 6, 18, 9, 6, 1, 29, 4, 8),
(5, 12, 9, 14, 25, 43, 13, 30, 38, 73, 36, 22, 14, 19, 9, 7, 3, 26, 3, 9),
(5, 8, 19, 27, 15, 29, 6, 21, 21, 50, 25, 19, 6, 12, 17, 2, 3, 21, 5, 10),
(6, 3, 5, 8, 18, 36, 9, 25, 27, 61, 30, 21, 9, 11, 12, 4, 0, 18, 4, 11),
(6, 13, 9, 9, 26, 42, 11, 24, 37, 66, 31, 26, 5, 23, 6, 10, 4, 17, 1, 12),
(7, 13, 17, 24, 12, 24, 16, 36, 28, 60, 32, 23, 9, 26, 11, 9, 5, 15, 1, 13),
(7, 7, 5, 5, 19, 41, 8, 21, 27, 62, 31, 24, 7, 15, 17, 5, 1, 25, 2, 14),
(8, 1, 16, 21, 23, 39, 7, 27, 30, 66, 40, 28, 12, 20, 7, 10, 1, 24, 2, 15),
(8, 4, 5, 8, 13, 35, 12, 27, 25, 62, 33, 24, 9, 15, 15, 6, 2, 19, 3, 16),
(9, 5, 9, 12, 23, 36, 8, 32, 31, 68, 33, 24, 9, 18, 10, 8, 5, 20, 4, 17),
(9, 2, 11, 15, 21, 41, 9, 25, 30, 66, 40, 29, 11, 13, 13, 5, 3, 16, 4, 18),
(10, 8, 14, 19, 21, 39, 9, 24, 30, 63, 38, 26, 12, 26, 11, 9, 2, 18, 3, 19),
(10, 3, 11, 14, 15, 26, 11, 34, 26, 60, 29, 21, 8, 17, 12, 8, 5, 19, 4, 20),
(11, 6, 13, 19, 18, 35, 7, 29, 25, 64, 40, 30, 10, 12, 15, 11, 4, 21, 4, 21),
(11, 11, 15, 23, 12, 37, 13, 24, 25, 61, 39, 31, 8, 17, 15, 7, 1, 19, 4, 22),
(12, 9, 13, 20, 18, 29, 6, 23, 24, 52, 28, 21, 7, 10, 14, 7, 2, 20, 5, 23),
(12, 12, 15, 19, 20, 39, 7, 22, 27, 61, 38, 24, 14, 13, 13, 8, 2, 20, 1, 24);

-- --------------------------------------------------------

--
-- Table structure for table `teams_overall_stats`
--

CREATE TABLE `teams_overall_stats` (
  `team_id` int(11) NOT NULL,
  `rebounds` int(11) NOT NULL,
  `steals` int(11) NOT NULL,
  `turnovers` int(11) NOT NULL,
  `fouls` int(11) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `teams_overall_stats`
--

INSERT INTO `teams_overall_stats` (`team_id`, `rebounds`, `steals`, `turnovers`, `fouls`, `id`) VALUES
(10, 765, 143, 257, 423, 1),
(3, 756, 110, 253, 428, 2),
(7, 775, 763, 295, 426, 3),
(2, 769, 145, 275, 446, 4),
(1, 813, 169, 336, 475, 5),
(11, 569, 178, 302, 475, 6),
(8, 563, 154, 365, 530, 7),
(4, 713, 143, 297, 490, 8),
(13, 805, 191, 263, 485, 9),
(12, 836, 125, 226, 430, 10),
(5, 772, 112, 263, 447, 11),
(6, 756, 142, 272, 410, 12),
(9, 772, 123, 285, 436, 13);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `matches`
--
ALTER TABLE `matches`
  ADD PRIMARY KEY (`id`),
  ADD KEY `home_team` (`home_team`),
  ADD KEY `away_team` (`away_team`);

--
-- Indexes for table `players`
--
ALTER TABLE `players`
  ADD PRIMARY KEY (`id`),
  ADD KEY `team_id` (`team_id`);

--
-- Indexes for table `players_match_stats`
--
ALTER TABLE `players_match_stats`
  ADD PRIMARY KEY (`id`),
  ADD KEY `player_id` (`player_id`);

--
-- Indexes for table `players_overall_stats`
--
ALTER TABLE `players_overall_stats`
  ADD PRIMARY KEY (`id`),
  ADD KEY `player_id` (`player_id`);

--
-- Indexes for table `teams`
--
ALTER TABLE `teams`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `teams_match_stats`
--
ALTER TABLE `teams_match_stats`
  ADD PRIMARY KEY (`id`),
  ADD KEY `match_id` (`match_id`),
  ADD KEY `team_id` (`team_id`);

--
-- Indexes for table `teams_overall_stats`
--
ALTER TABLE `teams_overall_stats`
  ADD PRIMARY KEY (`id`),
  ADD KEY `team_id` (`team_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `matches`
--
ALTER TABLE `matches`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT for table `players`
--
ALTER TABLE `players`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=107;

--
-- AUTO_INCREMENT for table `players_match_stats`
--
ALTER TABLE `players_match_stats`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `players_overall_stats`
--
ALTER TABLE `players_overall_stats`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `teams_match_stats`
--
ALTER TABLE `teams_match_stats`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT for table `teams_overall_stats`
--
ALTER TABLE `teams_overall_stats`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `matches`
--
ALTER TABLE `matches`
  ADD CONSTRAINT `matches_ibfk_1` FOREIGN KEY (`home_team`) REFERENCES `teams` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `matches_ibfk_2` FOREIGN KEY (`away_team`) REFERENCES `teams` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `players`
--
ALTER TABLE `players`
  ADD CONSTRAINT `players_ibfk_1` FOREIGN KEY (`team_id`) REFERENCES `teams` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `players_match_stats`
--
ALTER TABLE `players_match_stats`
  ADD CONSTRAINT `players_match_stats_ibfk_2` FOREIGN KEY (`player_id`) REFERENCES `players` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `players_overall_stats`
--
ALTER TABLE `players_overall_stats`
  ADD CONSTRAINT `players_overall_stats_ibfk_1` FOREIGN KEY (`player_id`) REFERENCES `players` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `teams_match_stats`
--
ALTER TABLE `teams_match_stats`
  ADD CONSTRAINT `teams_match_stats_ibfk_1` FOREIGN KEY (`match_id`) REFERENCES `matches` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `teams_match_stats_ibfk_2` FOREIGN KEY (`team_id`) REFERENCES `teams` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `teams_overall_stats`
--
ALTER TABLE `teams_overall_stats`
  ADD CONSTRAINT `teams_overall_stats_ibfk_1` FOREIGN KEY (`team_id`) REFERENCES `teams` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
