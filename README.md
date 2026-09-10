Nama : Muhammad Ilham Zaini
<br>
Kelas : Sistem Informasi C'25
<br>
Nim : 2509116091
<br>

# Sistem Manajemen Jasa Service AC

## <b>1. Deskripsi Singkat Program</b>

Sistem Manajemen Jasa Service AC merupakan program berbasis Java yang berguna untuk mengelola data teknisi, data pelanggan, dan data service AC. Program ini dijalankan melalui console dan menggunakan <b>ArrayList</b> untuk menyimpan data selama program berjalan.

Program ini memiliki tiga menu utama, yaitu:

<b>1. Data Pelanggan</b>, digunakan untuk mengelola data teknisi yang melakukan service AC.

<b>2. Data Teknisi</b>, digunakan untuk mengelola data pelanggan yang menggunakan jasa service AC.

<b>3. Data Service AC</b>, digunakan untuk mengelola data service AC yang dilakukan oleh teknisi kepada pelanggan.

Setiap menu dari sistem manajemen jasa service AC ini memiliki fitur <b> CRUD (Create, Read, Update, Delete)</b>, yaitu menambah, melihat, mengubah, dan menghapus data.

---

## <b>2. Penjelasan Alur Program</b>

Ketika program dijalankan, sistem akan menampilkan <b>Menu Utama</b> yang terdiri dari menu Data Pelanggan, Data Teknisi, Data Servis AC, dan Keluar.

Pengguna dapat memilih menu dengan memasukkan angka sesuai dengan pilihan yang tersedia. Setelah memilih salah satu menu, sistem akan menampilkan submenu yang berisi fitur tambah, lihat, ubah, hapus, dan kembali ke menu utama.

<b>A. Menu Data Pelanggan</b>

Menu Data Pelanggan digunakan untuk mengelola informasi pelanggan yang menggunakan jasa servis AC.

Terdapat beberapa pilihan:

<b>1. Tambah Pelanggan</b>, Pengguna memasukkan nama pelanggan, alamat, dan nomor HP. Data tersebut kemudian dibuat menjadi objek Pelanggan dan disimpan ke dalam ArrayList.

<b>2. Lihat Pelanggan</b> ,Sistem menampilkan seluruh data pelanggan yang telah tersimpan. Data yang ditampilkan meliputi nama, alamat, dan nomor HP pelanggan.

<b>3. Ubah Pelanggan</b>, Pengguna memilih nomor pelanggan yang ingin diubah. Setelah itu, pengguna dapat memasukkan nama, alamat, dan nomor HP baru.

<b>4. Hapus Pelanggan</b>, Pengguna memilih nomor pelanggan yang ingin dihapus, kemudian sistem menghapus data pelanggan tersebut dari ArrayList.

<b>5. Kembali</b>, Pengguna kembali ke Menu Utama.


<b>B. Menu Data Teknisi</b>

Menu Data Teknisi digunakan untuk mengelola data teknisi yang menangani pekerjaan servis AC.

Terdapat beberapa pilihan:

<b>1. Tambah Teknisi</b>, Pengguna memasukkan nama teknisi dan nomor HP. Data tersebut kemudian dibuat menjadi objek Teknisi dan disimpan ke dalam ArrayList.

<b>2. Lihat Teknisi</b>, Sistem menampilkan seluruh data teknisi yang telah tersimpan. Informasi yang ditampilkan berupa nama dan nomor HP teknisi.

<b>3. Ubah Teknisi</b>, Pengguna memilih nomor teknisi yang ingin diubah, kemudian memasukkan nama dan nomor HP baru.

<b>4. Hapus Teknisi</b>, Pengguna memilih nomor teknisi yang ingin dihapus, kemudian sistem menghapus data teknisi tersebut dari ArrayList.

<b>5. Kembali</b>, Pengguna kembali ke Menu Utama.


<b>C. Menu Data Servis AC</b>

Menu Data Servis AC digunakan untuk mengelola data pekerjaan servis AC yang dilakukan untuk pelanggan.

Terdapat beberapa pilihan:

<b>1. Tambah Servis</b>, Pengguna memasukkan nama pelanggan, jenis AC, keluhan, nama teknisi, dan biaya servis. Data tersebut kemudian dibuat menjadi objek Service dan disimpan ke dalam ArrayList.

<b>2. Lihat Servis</b>, Sistem menampilkan seluruh data servis AC yang telah tersimpan. Informasi yang ditampilkan meliputi pelanggan, jenis AC, keluhan, teknisi, dan biaya servis.

<b>3. Ubah Servis</b>, Pengguna memilih nomor servis yang ingin diubah. Setelah itu, pengguna dapat memasukkan nama pelanggan, jenis AC, keluhan, teknisi, dan biaya servis yang baru.

<b>4. Hapus Servis</b>, Pengguna memilih nomor servis yang ingin dihapus, kemudian sistem menghapus data servis tersebut dari ArrayList.

<b>5. Kembali</b>, Pengguna kembali ke Menu Utama.


<b>D. Keluar Program</b>, Jika pengguna memilih menu <b>0. Keluar</b> pada Menu Utama, sistem akan menampilkan pesan:

<b>"Terima kasih telah menggunakan sistem."</b>

Setelah itu, perulangan program akan berhenti.

---

## <b>3. Dokumentasi Program</b>

### <b>A. Menu Data Pelanggan</b>

Berikut merupakan dokumentasi tampilan Menu Data Pelanggan yang digunakan untuk mengelola data pelanggan. Menu ini menyediakan fitur tambah, lihat, ubah, dan hapus data pelanggan.

<img width="230" height="160" alt="Screenshot 2026-09-10 215541" src="https://github.com/user-attachments/assets/6dec70e9-7c64-4bbe-9410-62e96818796a" />


### <b>B. Menu Data Teknisi</b>

Berikut merupakan dokumentasi tampilan Menu Data Teknisi yang digunakan untuk mengelola data teknisi. Menu ini menyediakan fitur tambah, lihat, ubah, dan hapus data teknisi.

<img width="237" height="152" alt="Screenshot 2026-09-10 215746" src="https://github.com/user-attachments/assets/0cd7b534-c447-4a1d-9861-24757018b8a6" />

### <b>C. Menu Data Service AC</b>

Berikut merupakan dokumentasi tampilan Menu Data Servis AC yang digunakan untuk mengelola data pekerjaan servis AC. Menu ini menyediakan fitur tambah, lihat, ubah, dan hapus data servis.

<img width="277" height="152" alt="Screenshot 2026-09-10 215953" src="https://github.com/user-attachments/assets/fd3f8ab3-c84c-490e-ad35-d39339450e5a" />

## <b>3. Implementasi Program</b>

### <b>3.1 Implementasi Menu Data Pelanggan</b>

<p> Menu Data Pelanggan digunakan untuk mengelola data pelanggan yang menggunakan jasa servis AC. Pada menu ini terdapat fitur <b>Tambah Pelanggan</b>, <b>Lihat Pelanggan</b>, <b>Ubah Pelanggan</b>, dan <b>Hapus Pelanggan</b>. </p>

<img width="351" height="752" alt="Screenshot 2026-09-10 222129" src="https://github.com/user-attachments/assets/5c3a90b1-1b6a-4bd2-b138-28df1559b030" />
  <img width="305" height="401" alt="Screenshot 2026-09-10 222214" src="https://github.com/user-attachments/assets/02f9ee78-29bb-4074-82b5-00084c0fe0cd" />

<p align="center">
  <b>Gambar 1. Implementasi Menu Data Pelanggan</b>
</p>

### <b>3.2 Implementasi Menu Data Teknisi</b>

<p> Menu Data Teknisi digunakan untuk mengelola data teknisi yang bertugas melakukan servis AC. Pengguna dapat menambahkan, melihat, mengubah, dan menghapus data teknisi yang tersimpan dalam sistem. </p>

<p align="center">
<img width="321" height="845" alt="Screenshot 2026-09-10 222712" src="https://github.com/user-attachments/assets/720702a0-3daf-42eb-b2c0-5a2553fc637c" />
  <img width="317" height="386" alt="Screenshot 2026-09-10 222759" src="https://github.com/user-attachments/assets/48869be9-8c5a-434a-91b5-6515efa25373" />
</p>

<p align="center">
  <b>Gambar 2. Implementasi Menu Data Teknisi</b>
</p>

### <b>3.3 Implementasi Menu Data Service AC </b>

<p> Menu Data Servis AC digunakan untuk mengelola data pekerjaan servis AC. Pada menu ini pengguna dapat menambahkan, melihat, mengubah, dan menghapus data servis yang telah tersimpan. </p>

<p align="center">
<img width="657" height="841" alt="Screenshot 2026-09-10 223204" src="https://github.com/user-attachments/assets/6c41d14c-9e02-4581-9516-a7b3dd630d59" />
  <img width="310" height="198" alt="Screenshot 2026-09-10 223242" src="https://github.com/user-attachments/assets/7537b303-7270-4af8-a769-7879b520c793" />
</p>

<p align="center">
  <b>Gambar 3. Implementasi Menu Data Service AC</b>
</p>
