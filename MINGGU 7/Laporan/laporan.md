## 6.2.3 Pertanyaan
1. Jelaskan perbedaan metod TampilData dan Tampilposisi pada class PencarianMhs
* TampilData digunakan untuk menampilkan data nomer NIM
* TampilPosisi digunakan untuk menampilkan posisi data yang ada di index.
2. Jelaskan fungsi break pada kode program dibawah ini!
* Ketika data pada array listMhs dengan indeks[i] dengan atribut nim sama dengan data yang di cari dari
parameter dari input nim maka variable posisi berisi I sehingga pencarian langsung di hentikan.
3. Jika Data Nim yang dimasukkan tidak terurut dari kecil ke besar. Apakah program masih dapat
berjalan? Apakah hasil yang dikeluarkan benar? Mengapa demikian! 6.3. Searching / Pencarian
Menggunakan Binary Search
* Program masih berjalan namun output yang keluar tidak dapat urut mulai dari terkecil hingga terbesar,
karena menggunakan sequence search penginputan data tidak harus ber urutan.
## 6.3.3 Pertanyaan
1. Tunjukkan pada kode program yang mana proses divide dijalankan!

<img src="./ss/1.png">
2. Tunjukkan pada kode program yang mana proses conquer dijalankan!

<img src="./ss/2.png">
3. Jika data Nim yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa
demikian!
* Program bisa berjalan namun pada melakuan binary search data tidak temukan, karena saat
menggunakan binary search data harus berurutan.
4. Jika Nim yang dimasukkan dari NIM terbesar ke terkecil (missal : 20215, 20214, 20212, 20211, 20210)
dan elemen yang dicari adalah 20210. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak
sesuai maka ubahlah kode program binary seach agar hasilnya sesuai
5. Modifikasilah program diatas yang mana jumlah mahasiswa yang di inputkan sesuai dengan masukan
dari keyboard.