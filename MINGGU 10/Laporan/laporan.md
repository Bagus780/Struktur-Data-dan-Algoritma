## 8.2.3 Pertanyaan
1. Pada method Create, mengapa atribut front dan rear diinisialisasi dengan nilai -1, tidak 0?
    * Pada data awal di asumsikan queue masih kosong, jadi kode tersebut (menginisialisasikan
    front=rear=-tidak menunjuk pada indeks kosong manapun(karena queue masih kosong), jika nilainya
    0 maka menunjuk pada indeks 0 atau data pada indeks ke 0.
2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!

    <img src="./ss/1.png">

    * kondisi dimana data paling belakang dari queue berada di indeks terakhir array. Jadi jika dimasukkan data baru, maka data tersebut akan menempati posisi indeks ke-0, artinya posisi rear = 0.

3. Perhatikan kembali method Enqueue, baris kode program manakah yang menunjukkan bahwa data
baru disimpan pada posisi terakhir di dalam queue?

    <img src="./ss/2.png">

    * Jika dimasukkan data baru, maka data tersebut akan menempati posisi setelah data paling belakang atau data terakhir saat ini, yaitu menempati indeks rear + 1. Ini menunjukkan bahwa data baru akan disimpan pada posisi terakhir queue.

4. Perhatikan kembali method Dequeue, baris kode program manakah yang menunjukkan bahwa data
yang dikeluarkan adalah data pada posisi paling depan di dalam queue?
    <img src="./ss/3.png">
5. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!

    <img src="./ss/4.png">

    * merupakan kondisi jika data paling depan dari queue berada di indeks terakhir array (max -1). Jadi apabila dilakukan pengambilan data , maka data yang terambil adalah data di index terakhir array (max -1 ) kemudian posisi front akan bergeser pada indeks ke-0.
6. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0),
melainkan int i=front? 7. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!
    * Karena tidak selalu posisi front berada pada indeks ke-0, bisa saja ia dimulai pada indeks ke 1, 2, dan
seterusnya. Oleh karena itulah, nilai yang tercetak/diprint adalah nilai yang terletak pada indeks yang
terisi, yaitu terhitung dimulai dari indeks posisi front
7. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!
    * Maksud dari method tersebut adalah nilai i jika tidak berpotensi sebagai near, maka akan dilakukan pembahan pada variable tersebut lalu akan dimodulus dengan nilai max atau kapasitas dari queue tersebut. Untuk mencegah ngeprint melebihi Batasan max, maka perlu ada modulus max.
## 8.3.3 Pertanyaan
1. Perhatikan class Queue, apa fungsi kode program berikut pada method Dequeue?
       <img src="./ss/2.1.png">
* Digunakan untuk mendeklarasi objek class penumpang yang meliki parameter.
2. Pada soal nomor 1, apabila kode program tersebut diganti dengan kode berikut:
Penumpang data = new Penumpang()
Apakah yang terjadi? Mengapa demikian?
* Kode Program error atau salah , dikarenakan pada Class penumpang terdapat konstruktor
penumpang dengan membawa parameter , sehingga pada saat melakukan instansiasi object, object
baru harus mengembalikan nilai ke konstruktor dengan membawa parameter
3. Tunjukkan kode program yang digunakan untuk menampilkan data yang dikeluarkan dari queue!
4. Lakukan modifikasi program dengan menambahkan method baru bernama peekRear pada class
Queue yang digunakan untuk mengecek antrian yang berada di posisi belakang! Tambahkan puladaftar menu
5. Cek Antrian paling belakang pada class QueueMain sehingga method peekRear
dapat dipanggil!