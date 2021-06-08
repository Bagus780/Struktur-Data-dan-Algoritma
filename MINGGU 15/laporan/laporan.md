## 12.2.3 Pertanyaan Percobaan
1. Sebutkan beberapa jenis (minimal 3) algoritma yang menggunakan dasar Graph, dan apakah
kegunaan algoritma-algoritma tersebut?
Jawaban :
A. BFS = Digunakan sebagai algoritma pencarian
B. DFS = Digunakan sebagai algoritma pencarian
C. Algoritma Bellman-Ford = Untuk
2. Pada class Graph terdapat array bertipe LinkedList, yaitu LinkedList list[]. Apakah tujuan pembuatan
variabel tersebut ?
Jawaban :
Untuk melakukan pemanggilan fungsi linked list dan mengisi list yang berupa vertex pada linked list
tersebut.
3. Apakah alasan pemanggilan method addFirst() untuk menambahkan data, bukan method add jenis
lain pada linked list ketika digunakan pada method addEdge pada class Graph?
jawaban :
Untuk mengenalkan pertama kali vertex tersebut dan juga koneksinya
4. Bagaimana cara mendeteksi prev pointer pada saat akan melakukan penghapusan suatu edge pada
graph ?
Jawaban :
Dengan cara melakukan looping vertex. Jadi, jika vertex lebih besar dari (i) dan destination sama dengan
(i) maka akan dilihat source dari i dan edge akan otomatis dihapus.