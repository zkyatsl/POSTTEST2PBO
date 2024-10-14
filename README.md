#  🛩🎮PROGRAM MANAJEMEN ATMINT WARNET SKYNET💻
 Tugas Posttest 2 Praktikum PBO Semester 3
- [ STRUKTUR. ](#struktur)
- [ ALUR. ](#alur)
- [ CARA PENGGUNAAN. ](#cara)


<a name="struktur"></a>
## 👷🏻Struktur
### Package Utama:

- **Main.java** : Kelas ini adalah titik masuk (entry point) dari program yang mengelola operasi utama seperti tampilan menu, interaksi pengguna, dan eksekusi logika program. 

### Package Model:

- **Computer.java** : Kelas yang merepresentasikan komputer di warnet dengan atribut seperti id, status, dan ratePerHour (tarif per jam). Properti id bersifat final, menunjukkan bahwa setiap komputer memiliki identitas yang tidak berubah.

- **User.java**: Kelas ini merepresentasikan pengguna warnet, baik pengguna Reguler maupun VIP, yang diatur melalui inheritance. Atribut utama dari kelas ini adalah name dan balance.

- **ComputerManager.java** ***(final class)*** : Mengelola operasi CRUD (Create, Read, Update, Delete) untuk objek Computer. Kelas ini bersifat final, sehingga tidak dapat diubah oleh kelas lain.

- **UserManager.java** : Mengelola operasi CRUD untuk objek User.

### INTERFACE

- **CRUDOperations.java** : Interface ini mendefinisikan operasi CRUD umum untuk objek komputer dan pengguna. Kelas-kelas pengelola seperti ComputerManager dan UserManager mengimplementasikan interface ini untuk memastikan konsistensi metode CRUD.

<a name="alur"></a>
## 📋 ALUR
Program ini berbasis menu, di mana pengguna (admin) dapat berinteraksi untuk mengelola komputer dan pengguna (user) di warnet. Berikut adalah alur kerja program:

- Tampilan Menu Utama: Program akan menampilkan beberapa opsi, termasuk melihat status komputer, melihat status pengguna, mengelola komputer (CRUD), mengelola pengguna (CRUD), dan keluar dari program.

- Lihat Status Komputer: Menampilkan tabel status semua komputer, termasuk ID komputer, statusnya (Online/Offline), dan tarif per jam.

- Lihat Status Pengguna: Menampilkan tabel pengguna beserta nama dan saldo mereka.

- Admin - Kelola Komputer: Admin dapat melakukan operasi CRUD pada komputer. Admin dapat menambah komputer baru, mengubah status komputer (Online/Offline), dan menghapus komputer.

- Admin - Kelola Pengguna: Admin juga dapat mengelola pengguna warnet. Admin bisa menambah pengguna baru, mengubah saldo pengguna, dan menghapus pengguna. Selain itu, admin dapat mengubah status pengguna antara Reguler dan VIP, dengan perbedaan pada layanan yang diperoleh dan tarif.

- Keluar dari Program: Menghentikan program.

<a name="cara"></a>
## 👽CARA PENGGUNAAN🤖

### CRUD
- ***Penggunaan CRUD di bagian KELOLA KOMPUTER dan KELOLA PENGGUNA itu sama saja, sebenarnya instruksinya sudah bisa cukup jelas dengan gambar-gambar berikut.*** 
#### 1. READ

![image](https://github.com/user-attachments/assets/92f1cc40-6130-40a8-9138-ceaec0aa4955)

- Pilih opsi 1 untuk melihat status komputer dan pilih opsi 2 untuk melihat status pengguna.

#### 2. CREATE

- ***Kita ambil contoh disini dengan masuk ke menu pengguna, seperti yang saya bilang sebelumnya terkait cara pemakaian CRUD di Kelola Komputer sama saja***

![image](https://github.com/user-attachments/assets/17af917f-6445-48d3-9aeb-13989728fcbc)

#### 3. UPDATE
- BEFORE
  
![image](https://github.com/user-attachments/assets/4adc17bc-1ed4-4cc4-99ae-c9e637782eb7)

- AFTER
  
![image](https://github.com/user-attachments/assets/ea7eed8f-a15e-4213-b8de-f4b2fe4dc3fb)

#### 4.DELETE
- BEFORE
  
![image](https://github.com/user-attachments/assets/13771b7e-6ba5-4850-a193-e7dbdc73d164)

- AFTER
  
![image](https://github.com/user-attachments/assets/41a11a3e-26c9-49c2-a9e1-83be9fe15c54)
