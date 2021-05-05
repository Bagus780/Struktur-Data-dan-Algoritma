## Praktikum 1
1. Jelaskan perbedaan antara single linked list dengan double linked lists! 
    * Perbedaan yang terlihat setelah melakukan praktikum adalah, dalam single linked list hanya memiliki satu pointer yang mengarah kepada node setelahnya. Sehingga data tidak dapat kembali ke data yang telah dilewati. Sedangkan pada Double Linked List memiliki 2 pointer yang mengarah kepada data sebelum dan setelah data tersebut. Sehingga ketika ingin menampilkan data sebelunya maka dapat dilakukan pemanggilan pointer sebelumnya.

2. Perhatikan class Node, didalamnya terdapat atribut next dan prev. Untuk apakah atribut tersebut? 
    * Atribut next digunakan sebagai pointer kedata setelah node tersebut dan atribut prev digunakan sebagai pointer ke data sebelumnya.

3.	Perhatikan konstruktor pada class DoubleLinkedLists. Apa kegunaan inisialisasi atribut head dan size seperti pada gambar berikut ini? 
    * Kegunaan dari inisialisasi atribut head adalah membuat sebuah data dalam double linked list yang digunakan sebagai data paling depan. Yang mana nanti akan digunakan untuk memanggil data selanjutnya. Sedangkan atribut size digunakan untuk menghitung berapa banyak data dalam linked list tersebut.

4.	Pada method addFirst(), kenapa dalam pembuatan object dari konstruktor class Node prev dianggap sama dengan null? 
Node newNode = new Node(null, item, head); 
    * Karena dalam membuat atau menambahkan data terdepan (first) maka pointer prev akan diisi null sehingga tidak mengarah kedata manapun.

5.	Perhatikan pada method addFirst().  Apakah arti statement head.prev = newNode ? 
    * Statement tersebut digunakan untuk mengisi nilai head.prev dengan nilai elemen seperti yang ada dalam konstruktor newNode

6.	Perhatikan isi method addLast(), apa arti dari pembuatan object Node dengan mengisikan parameter prev dengan current, dan next dengan null? 
Node newNode = new Node(current, item, null);  
    * Penambahan data terletak diakhir maka prev data tersebut akan menunjuk ke current/ data sebelumnya. Lalu item itu merupakan data inputannya. Untuk node nextnya berupa null karena data ini terletak diakhir maka sudah tidak ada lagi data yang ditunjukk untuk selanjutnya, maka nextnya bernilai null.

## Praktikum 2
1.	Apakah maksud statement berikut pada method removeFirst()?
head = head.next; head.prev = null; 
    * Yang dimaksud dalam statment tersebut adalah mengubah atribut head dengan nilai head.next dan mengubah head.prev menjadi nilai null.

2.	Bagaimana cara mendeteksi posisi data ada pada bagian akhir pada method removeLast()?
    * Dengan melakukan perulanggan hingga menemukan current.next.next== null dan mengubah current.next dengan nilai null ketika looping berhenti

3.	Jelaskan alasan potongan kode program di bawah ini tidak cocok untuk perintah remove!
    * Kode diatas tidak cocok digunakan untuk perintah rmemove karena penunjukkan pointernya tidak jelas, atau ambigu sehingga tidak cocok dengan perintah remove

4.	Jelaskan fungsi kode program berikut ini pada fungsi remove!
    * Fungsi kode program tersebut dalah untuk mengganti penunjukkan pointer prev dan pointernya. Pointer next nya berganti current.prev.next, sedangkan pointer prevnya berganti current.next.prev.

## Praktikum 3
1.	Jelaskan method size() pada class DoubleLinkedLists! 
    * public int size() {
        return size;
      }

    Method size digunakan untuk mengembalikan nilai size dari linked list dengan tipe data int.

2.	Jelaskan cara mengatur indeks pada double linked lists supaya dapat dimulai dari indeks ke- 1! 
    * Agar indeks pada double linked list dimulai dari index 1 maka dapat dilakukan dengan mengubah head menjadi head.next. sehingga nanti pada indeks ke 0 tidak akan diisikan data , sehingga langsung dilewati ke index 1.

3.	Jelaskan perbedaan karakteristik fungsi Add pada Double Linked Lists dan Single Linked Lists!  
    * Pada single linked list ketika menambahkan data baru kita hanya mengubah next saja namun dalam double linked list kita harus mengubah prev dan next.

4.	Jelaskan perbedaan logika dari kedua kode program di bawah ini! 
    <img src="./ss/4.png">

    * Perbedaan dari kedua logika tersebut adalah, pada gambar a untuk mengidentifikasi dia kosong atau tidak dengan melihat isi sizenya, jadi jika sizenya dicek == 0 maka dapat dipastikan bahwa isi double linked list tersebut kosong. Sedangkan pada gambar b dilihat dari headnya, jika headnya == null maka double linked list tersebut kosong