# VONIC Mobile - Latihan RecyclerView

Proyek ini merupakan salinan proyek VONIC_mobile yang sudah ditambahkan contoh RecyclerView berdasarkan Modul 9.

## Cara membuka
1. Ekstrak ZIP.
2. Buka folder `VONIC_mobile-master` melalui Android Studio (folder yang berisi `settings.gradle.kts`).
3. Tunggu Gradle Sync selesai.
4. Jalankan aplikasi dengan tombol Run.

## File yang ditambahkan/diubah
- `app/build.gradle.kts`: mengaktifkan ViewBinding dan menambahkan dependency RecyclerView.
- `app/src/main/java/com/example/vonic/Disaster.kt`: model data.
- `app/src/main/java/com/example/vonic/DisasterAdapter.kt`: adapter RecyclerView dan click listener.
- `app/src/main/java/com/example/vonic/MainActivity.kt`: mengatur data dummy, adapter, GridLayoutManager, dan Toast.
- `app/src/main/res/layout/activity_main.xml`: halaman daftar bencana.
- `app/src/main/res/layout/item_disaster.xml`: layout satu item bencana.
- `app/src/main/res/drawable/bg_disaster_item.xml`: latar kartu item.

Catatan: sesuai latihan pada modul, tampilan awal Hello World diganti menjadi halaman daftar bencana. Pastikan perangkat memiliki koneksi internet saat Gradle perlu mengunduh dependency.
