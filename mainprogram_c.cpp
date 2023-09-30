#include <iostream>
using namespace std;

int main() {
    // Deklarasi variabel
    int angka = 9;

    // Tipe data
    bool benar = true;

    // Penggunaan perulangan
    for (int i = 0; i < angka; i++) {
        cout << "Perulangan ke-" << i << endl; 
    }
    cout<<endl;

    // Penggunaan percabangan
    if (benar) {
        cout << "Ini adalah pernyataan if" << endl;
    }
    cout<<endl;

    // Penggunaan while
    int counter = 0;
    while (counter < angka) {
        cout << "Counter ke-" << counter << endl;
        counter++;
    }
	cout<<endl;
	
    // Penggunaan do while
    int angka2 = 10;
    do {
        cout << "Angka ke-" << angka2 << endl;
        angka2--;
    } while (angka2 > 0);
    cout<<endl;

    // Array 1D
    cout<<"Array 1 dimensi: ";
    int array1d[] = {3, 2, 5, 1};
    for(int i = 0; i < 4; i++){
    	cout<<array1d[i];
	}
	cout<<endl;

    // Array multidimensi
    cout<<"Array multidimensi: ";
    int arrayMultiDimensi[2][3] = {{1, 2, 3}, {4, 6, 5}};
    for(int i = 0; i < 2; i++){
    	for(int j = 0; j < 3; j++){
    		cout<<arrayMultiDimensi[i][j];
		}
	}
	cout<<endl;
	cout<<endl;

    // Input
    cout<<"Contoh input:"<<endl;
    string nama;
    cout << "Masukkan nama anda: ";
    cin >> nama;

    // Output
    cout<<"Contoh output: "<<endl;
    cout << "Halo, " << nama << "!" << endl;

    // Komentar
    // Ini adalah komentar untuk satu baris

    /*
     * Sedangkan ini adalah komentar 
     * lebih dari satu baris
     */

    return 0;
}

