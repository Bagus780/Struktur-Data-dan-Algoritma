## 9.2.3 Pertanyaan 
1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”? 
    * Karena pada class Main untuk baris pertama langsung di print tanpa di beri isi data terlebih dahulu
2. Pada step 10, jelaskan kegunaan kode berikut 
    <img src="./ss/1.png">
  
    * Ketika kondisi awal kosong maka head dan juga tail akan menunjuk ke node input. Ketika linked list tidak kosong maka next pada node input menunjuk node yang dipilih oleh head, lalu head akan menunjuk node input temp.next = nd input yang artinya adalah nd inputnya
3. Perhatikan class SingleLinkedList, pada method insertAt Jelaskan kegunaan kode berikut  
    <img src="./ss/3.png">
    * Penghapusan akan dilakukan pada node paling belakang, ialah yang ditunjuk oleh tail kemudian mengalamai pergeseran tail ke bagian depan

## 9.3.3 Pertanyaan 
1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan! 
    * karena break pada fungsi remove digunakan untuk menghetikan proses 1 kali remove dilakukan. Jika break ini tidak ada maka akan  eror. 
2. Jelaskan kegunaan kode dibawah pada method remove 
    <img src="./ss/2.png">
 
    * Fungsi dari kode tersebut adalah untuk mengganti temp.next dengan temp.next.next. apabila data tersebut sama akan temp.next.next
3.  Apa saja nilai kembalian yang dapat dikembalikan pada method indexOf? Jelaskan maksud masing-masing kembalian tersebut!

    * Pada return -1 dan juga return index. Return 1 digunakan Ketika nilai tidak ada pada list sedangkan return index berate nilai terdapat pada list 
