## 4.2.3 pertanyaan
1. Jelaskan mengenai base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial! 
* Base line yang di gunakan Ketika kondisi n = 1 maka akan di return ke 1. Karena hitungan nilai
faktorial di mulai angka n tertentu kemudian di kalikan dengan angka di bawahnya hingga angka 1
2.  Pada implementasi Algoritma Divide and Conquer Faktorial apakah lengkap terdiri dari 3 tahapan
divide, conquer, combine? Jelaskan masing-masing bagiannya pada kode program!
* Devide terjadi Ketika kode factorialDC(n-1) 
3. Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan
for?Buktikan!
4. Tambahkan pegecekan waktu eksekusi kedua jenis method tersebut!
5. Buktikan dengan inputan elemen yang di atas 20 angka, apakah ada perbedaan waktu eksekusi?

## 4.3.3 Pertanyaan
1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()!
* PangkatBF menggunakan algoritma brute force, sedangkan PangkatDC menggunakan algoritma Divide
Conquer
2. Pada method PangkatDC() terdapat potongan program sebagai berikut: Jelaskan arti potongan kode
tersebut
* Untuk memilih pangkat yang ganjil atau genap, karena pada saat proses divide, conquer dan combine
akan berbeda jika nilai pangkat ganjil atau genap
3. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!
4. Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan konstruktor.
5. Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan!

## 4.4.3 Pertanyaan
1. Berikan ilustrasi perbedaan perhitungan keuntungan dengan method TotalBF() ataupun TotalDC()
* PangkatBF menggunakan algoritma brute force, sedangkan PangkatDC menggunakan algoritma Divide
Conquer
2. Perhatikan output dari kedua jenis algoritma tersebut bisa jadi memiliki hasil berbeda di belakang
koma. Bagaimana membatasi output di belakang koma agar menjadi standar untuk kedua jenis
algoritma tersebut.
* Karena pada TotalBF() menggunakan tipe data double dimana hasil hitungannya akan sangat detail,
sedangkan di TotalDC() menggunakan campuran dengan tipe data int oleh karena itu hasilnya
merupakan pembulatan.
3. Mengapa terdapat formulasi return value berikut?Jelaskan!
* Untuk mempermudah menghitung hasil keuntungan. Algoritma
Divide and Conquer adalah algoritma pemecahan masalah dengan cara membagi masalah
kedalam bagian-bagian kecil, kemudian menyelesaikan masalah tersebut dari bagian yang
paling rendah / bawah
4. Kenapa dibutuhkan variable mid pada method TotalDC()?
* Untuk menentukan posisi akhir pada hasil divide
5. Program perhitungan keuntungan suatu perusahaan ini hanya untuk satu perusahaan saja. Bagaimana
cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa perusahaan.(Setiap perusahaan
bisa saja memiliki jumlah bulan berbeda-beda)? Buktikan dengan program!
