create database Test
use Test
CREATE TABLE NhanVien (
    IDNhanVien INT PRIMARY KEY IDENTITY(1,1) NOT NULL,
    HoTen NVARCHAR(50) NOT NULL,
    SoCCCD NVARCHAR(20) NOT NULL,
    NgaySinh DATE NULL,
    TenDangNhap NVARCHAR(50) NOT NULL,
    MatKhau NVARCHAR(50) NOT NULL,
    VaiTro NVARCHAR(50) NOT NULL
);

CREATE TABLE Ban8 (
    id INT PRIMARY KEY IDENTITY(1,1) NOT NULL,
    ngay DATE NOT NULL,
    gio_bat_dau TIME(7) NOT NULL,
    gio_ket_thuc TIME(7) NULL,
    tong_tien DECIMAL(10, 2) NULL
);
CREATE TABLE Ban7 (
    id INT PRIMARY KEY IDENTITY(1,1) NOT NULL,
    ngay DATE NOT NULL,
    gio_bat_dau TIME(7) NOT NULL,
    gio_ket_thuc TIME(7) NULL,
    tong_tien DECIMAL(10, 2) NULL
);
CREATE TABLE Ban6 (
    id INT PRIMARY KEY IDENTITY(1,1) NOT NULL,
    ngay DATE NOT NULL,
    gio_bat_dau TIME(7) NOT NULL,
    gio_ket_thuc TIME(7) NULL,
    tong_tien DECIMAL(10, 2) NULL
);
CREATE TABLE Ban5 (
    id INT PRIMARY KEY IDENTITY(1,1) NOT NULL,
    ngay DATE NOT NULL,
    gio_bat_dau TIME(7) NOT NULL,
    gio_ket_thuc TIME(7) NULL,
    tong_tien DECIMAL(10, 2) NULL
);
CREATE TABLE Ban4 (
    id INT PRIMARY KEY IDENTITY(1,1) NOT NULL,
    ngay DATE NOT NULL,
    gio_bat_dau TIME(7) NOT NULL,
    gio_ket_thuc TIME(7) NULL,
    tong_tien DECIMAL(10, 2) NULL
);
CREATE TABLE Ban3 (
    id INT PRIMARY KEY IDENTITY(1,1) NOT NULL,
    ngay DATE NOT NULL,
    gio_bat_dau TIME(7) NOT NULL,
    gio_ket_thuc TIME(7) NULL,
    tong_tien DECIMAL(10, 2) NULL
);
CREATE TABLE Ban2 (
    id INT PRIMARY KEY IDENTITY(1,1) NOT NULL,
    ngay DATE NOT NULL,
    gio_bat_dau TIME(7) NOT NULL,
    gio_ket_thuc TIME(7) NULL,
    tong_tien DECIMAL(10, 2) NULL
);
CREATE TABLE Ban1 (
    id INT PRIMARY KEY IDENTITY(1,1) NOT NULL,
    ngay DATE NOT NULL,
    gio_bat_dau TIME(7) NOT NULL,
    gio_ket_thuc TIME(7) NULL,
    tong_tien DECIMAL(10, 2) NULL
);

insert Into NhanVien( HoTen, SoCCCD, NgaySinh, TenDangNhap, MatKhau, VaiTro)
values('Duy', '1234567', getDAte(), 'duy', '123', 'QuanLy')