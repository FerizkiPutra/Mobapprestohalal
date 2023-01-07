package com.example.japanesekoreanrestohalal

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class JepangMainActivity2 : AppCompatActivity() {

    companion object{
        val INTENT_PARACELABLE = "OBJECT_INTENT"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jepang_main2)


        val restojepangList = listOf<Restojepang>(
            Restojepang(
                R.drawable.j01,
                "Shinjuku Gyoen Ramen Ouka",
                "Restoran ini menyajikan ramen yang unik karena disajikan bersama semangkuk nasi yang bisa kamu santap dengan kuah kaldu dari ramenmu!",
                "Halal status: Pemiliknya Muslim\n" +
                        "\n" +
                        "Kontak: +81 3-5925-8426\n" +
                        "\n" +
                        "Jam operasional:\n" +
                        "\n" +
                        "Senin sampai Kamis – 14.00 s.d 22.00\n" +
                        "\n" +
                        "Jumat – 18.00 s.d 22.00\n" +
                        "\n" +
                        "Sabtu, Minggu, dan Hari Libur Nasional – 13.00 s.d 22.00\n" +
                        "\n" +
                        "Alamat: 1 Chome-11-7 Shinjuku, Tokyo 160-0022, Jepang"

            ),
            Restojepang(
                R.drawable.j02,
                "Naritaya",
                "Kedai ramen di Asakusa yang patut dicoba! Ramen Naritaya memadukan kuah kaldu ayam dan mi segar yang dibuat di pabrik mereka sendiri.",
                "Halal status: Tersertifikasi Halal (oleh Japan Islamic Trust)\n" +
                        "\n" +
                        "Kontak: +81 3-428-9806\n" +
                        "\n" +
                        "Jam operasional:\n" +
                        "\n" +
                        "Senin sampai Sabtu – 11.00 s.d 22.00\n" +
                        "\n" +
                        "Minggu – 11.00 s.d 22.00\n" +
                        "\n" +
                        "Alamat: 2 Chome-7-13 Asakusa, Taito, Tokyo 111-0032, Jepang"
            ),
            Restojepang(
                R.drawable.j03,
                "Menya Kaijin",
                "Ramen seafood ala Menya Kaijin! Kaldunya terbuat dari ikan dan seafood, terlihat bening dan ringan, namun penuh rasa.",
                "Halal status: Menyediakan varian seafood. Karena restoran ini belum tersertifikasi halal, pertimbangan untuk makan di restoran ini kami kembalikan kepada kamu. Jangan lupa untuk memberitahu kepada staf restoran untuk tidak menambahkan ayam di pesananmu, ya!\n" +
                        "\n" +
                        "Kontak: +81 03-3356-5658\n" +
                        "\n" +
                        "Jam operasional:\n" +
                        "\n" +
                        "Senin sampai Jumat – 11.00 s.d 15.00, 16.30 s.d 23.30\n" +
                        "\n" +
                        "Sabtu dan Hari Libur Nasional – 11.00 s.d 23.30\n" +
                        "\n" +
                        "Minggu – 11.00 s.d 23.00\n" +
                        "\n" +
                        "Alamat: 3-35-7 Shinjuku, Shinjuku-ku, Tokyo 160-0022"
            ),
            Restojepang(
                R.drawable.j04,
                "Honolu Ebisu",
                "Jika kamu sedang berkunjung ke Shibuya, mampirlah ke Honolu Ebisu untuk menikmati aneka varian ramen ayam yang menggugah selera..",
                "Status halal: Tersertifikasi Halal (oleh Malaysia Halal Corporation)\n" +
                        "\n" +
                        "Kontak: +81 3-5734-1667\n" +
                        "\n" +
                        "Jam operasional:\n" +
                        "\n" +
                        "Makan siang – 11.30 s.d 14.30 setiap hari\n" +
                        "\n" +
                        "Makan malam – 17.00 s.d 22.00 setiap hari\n" +
                        "\n" +
                        "Alamat: 1 Chome-23-1 Shibuya, Ebisuminami, Tokyo 150-0022, Jepang"
            ),
            Restojepang(
                R.drawable.j05,
                "Ayam-YA Okachimachi",
                "Kuah kaldu ayam ramen halal Ayam-ya yang kaya rasa adalah hal yang kamu butuhkan setelah seharian menjelajahi kota! Ditambah lagi,.",
                "Status Halal: Tersertifikasi Halal (oleh Malaysia Halal Corporation)\n" +
                        "\n" +
                        "Kontak: +81-3-3834-6656\n" +
                        "\n" +
                        "Jam Operasional:\n" +
                        "\n" +
                        "Makan siang – 11.30 s.d 15.00 setiap hari (pemesanan terakhir jam 14.30)\n" +
                        "\n" +
                        "Makan malam – 17.00 s.d 22.00 setiap hari (pemesanan terakhir jam 21.30)\n" +
                        "\n" +
                        "Alamat: 4 Chome-10-1 Taito, Tokyo 110-0016, Jepang"

            ),
            Restojepang(
                R.drawable.j06,
                "Taizan Sakura",
                "Kedai ramen ini bisa dijangkau dengan berjalan kaki dari stasiun Asakusa. Salah satu menu andalannya adalah Sakuraebi Oroshisoba..",
                "Status halal: Tersertifikasi halal.\n" +
                        "\n" +
                        "Kontak: +81 3-5811-1933\n" +
                        "\n" +
                        "Jam operasional: Meski jam buka regulernya belum tercatat di internet, salah satu penulis kami berkunjung saat jam makan siang pada Desember 2018 lalu. Sepertinya restoran ini mulai beroperasi saat jam makan siang, namun perlu dicatat bahwa beberapa restoran tutup sementara di siang hari untuk bersiap melayani makan malam.\n" +
                        "\n" +
                        "Alamat: 1 Chome-33-8A1 building 1F, Taito-ku, Tokyo 11-0032, Jepang."
            ),
            Restojepang(
                R.drawable.j07,
                "Gyumon",
                "Terletak di jalanan Shibuya yang sibuk, Gyumon menyajikan yakiniku halal yang otentik. Restoran ini adalah tempat yang sempurna untuk makan malam yang mengenyangkan.!",
                "Status halal: Menyediakan daging halal. Menyajikan minuman beralkohol. Karena restoran ini belum tersertifikasi halal, pertimbangan untuk makan di restoran ini kami kembalikan kepada masing-masing pembaca.\n" +
                        "\n" +
                        "Kontak: +81 03-5469-2911\n" +
                        "\n" +
                        "Jam operasional:\n" +
                        "\n" +
                        "Senin sampai Sabtu – 12.00 s.d 04.00\n" +
                        "\n" +
                        "Minggu – 12.00 s.d 00.00\n" +
                        "\n" +
                        "Alamat: 3 Chome-14-5 Shibuya, Tokyo 150-0002, Jepang\n" +
                        "\n" +
                        "Petunjuk arah: Keluar melalui pintu selatan stasiun Shibuya lalu berjalan sekitar 8 menit ke arah seberang jembatan layang."
            ),
            Restojepang(
                R.drawable.j08,
                "Sumiyakiya - Roppongi",
                "Berbeda dengan restoran yakiniku lain, restoran yang terletak di Roppongi (dekat dengan Roppongi Hills) menyajikan perpaduan makanan Jepang dan Korea.",
                "Halal status: Menyediakan daging halal. Karena restoran ini belum tersertifikasi halal, pertimbangan untuk makan di restoran ini kami kembalikan kepada masing-masing pembaca.\n" +
                        "\n" +
                        "Kontak: +81 03-3403-5397\n" +
                        "\n" +
                        "Jam operasional:\n" +
                        "\n" +
                        "Senin sampai Sabtu – 17.00 s.d 22.30\n" +
                        "\n" +
                        "Tutup di hari Minggu\n" +
                        "\n" +
                        "Alamat: Nishiazabu 3 Chome-20-16, Minato-ku, Tokyo 106-0031, Jepang\n" +
                        "\n" +
                        "Petunjuk arah: Sekitar 10 menit berjalan kaki dari pintu keluar 1a Stasiun Roppongi atau 5 menit berjalan kaki dari Roppongi Hills."
            ),
            Restojepang(
                R.drawable.j09,
                "Gyu-Kaku - Akasaka Branch",
                "Gyu-Kaku adalah salah satu rangkaian restoran yakiniku populer dari Jepang yang memiliki berbagai cabang di Jepang dan negara lainnya, Akasaka merupakan cabang Gyu-Kaku pertama yang menyediakan versi halal",
                "Halal status: Menyediakan daging halal dan seafood. Karena restoran ini belum tersertifikasi halal, pertimbangan untuk makan di restoran ini kami kembalikan kepada masing-masing pembaca.\n" +
                        "\n" +
                        "Kontak: +81 03-5545-5029\n" +
                        "\n" +
                        "Jam operasional: Setiap hari mulai jam 11.30 s.d 03.00\n" +
                        "\n" +
                        "Alamat: Akasaka 3 Chome-12-11, Central Akasaka Building 2nd Floor, Minato-ku, Tokyo 107-0052, Jepang."
            ),
            Restojepang(
                R.drawable.j10,
                "Yakiniku Panga",
                " Salah satu restoran yakiniku yang wajib didatangi adalah Yakiniku Panga yang bisa ditempuh dengan perjalanan singkat dari Asakusa!",
                "Status halal: Tersertifikasi halal (oleh Japan Halal Foundation)\n" +
                        "\n" +
                        "Kontak: +81 3-3839-8929 atau reservasi lewat Hotpepper\n" +
                        "\n" +
                        "Jam operasional:\n" +
                        "\n" +
                        "Senin sampai Sabtu – 11.30 s.d 14.00, 17.00 s.d 22.30\n" +
                        "\n" +
                        "Minggu – 17.00 s.d 22.00\n" +
                        "\n" +
                        "Alamat: 3 Chome-27-9 Taito, Taito, Tokyo 110-0016, Jepang"
            ),
            Restojepang(
                R.drawable.j11,
                "Origami Asakusa",
                "Origami Asakusa terletak di salah satu pusat keramaian dan tempat favorit para turis di Tokyo (sekitar 2 menit berjalan kaki dari stasiun subway Asakusa). ",
                "Status halal: Tersertifikasi Halal (oleh Japan Islamic Trust)\n" +
                        "\n" +
                        "Kontak: +81 03-5811-1755\n" +
                        "\n" +
                        "Jam operasional:\n" +
                        "\n" +
                        "11.30sd 15.00, 17.30 s.d 21.00 setiap hari\n" +
                        "\n" +
                        "Alamat: Hanakawado 1 Chome-2-8, Taito-ku, Tokyo 110033, Jepang"
            ),
            Restojepang(
                R.drawable.j12,
                "Asakusa Nagomi",
                "Asakusa Nagomi adalah pendatang baru dalam daftar restoran shabu-shabu halal yang terus bertambah dan menyajikan daging wagyu premium A5 di area Asakusa yang sibuk.",
                "Status halal: Tersertifikasi Halal\n" +
                        "\n" +
                        "Kontak: +81 3-6802-7730\n" +
                        "\n" +
                        "Jam operasional: 10.00 s.d 22.00 setiap hari\n" +
                        "\n" +
                        "Alamat: Asakusa 2 Chome-14-17, Taito-ku, Tokyo 111-0035, Jepang"
            ),
            Restojepang(
                R.drawable.j13,
                "Sushiken",
                "Restoran sushi yang terletak di Asakusa ini baru saja mulai menyajikan masakan yang ramah Muslim! ",
                "Status halal: Tersertifikasi halal (oleh Japan Halal Foundation)\n" +
                        "\n" +
                        "Kontak: +81 03-5246-6547\n" +
                        "\n" +
                        "Jam operasional:\n" +
                        "\n" +
                        "Senin sampai Sabtu – 11.30 s.d 16.00, 16.00 s.d 23.30 (pemesanan terakhir jam 23.00)\n" +
                        "\n" +
                        "Minggu dan hari libur nasional – 11.30 s.d 15.00, 15.00 s.d 22.00 (pemesanan terakhir jam 21.30)\n" +
                        "\n" +
                        "*Tutup setiap tanggal 31 Desember\n" +
                        "\n" +
                        "Alamat: 2 Chome-11-4, Asakusa, Taito-ku, Tokyo 111-0032, Jepang."
            ),
            Restojepang(
                R.drawable.j14,
                "Akasaka Saryo Ouka",
                "Akasaka Saryo Ouka adalah kafe ala Jepang pertama di Tokyo. Saryo Ouka menyajikan sushi segar dan juga makan berat seperti Wagyu Beef Rice. ",
                "Status halal: Pemiliknya Muslim\n" +
                        "\n" +
                        "Kontak: +81 3-5346-6547\n" +
                        "\n" +
                        "Jam operasional:\n" +
                        "\n" +
                        "Senin sampai Sabtu – 12.45 s.d 15.00, 18.00 s.d 21.00\n" +
                        "\n" +
                        "Tutup di hari Minggu\n" +
                        "\n" +
                        "Alamat: 2 Chome-11-4, Asakusa, Taito-ku, Tokyo 107-0052, Jepang."
            ),
            Restojepang(
                R.drawable.j15,
                "Homemade Udon Noodles KINEYA MUGIMARU",
                "Jika kamu bepergian melalui Bandara Narita di Tokyo dan mempunyai waktu luang, jangan lupa untuk mencoba udon halal yang ada di bandara, ya!",
                "Status halal: Tersertifikasi halal (oleh Malaysia Consultation & Training Agency)\n" +
                        "\n" +
                        "Kontak: +81 476-32-7877\n" +
                        "\n" +
                        "Jam operasional: 7.30 s.d 21.00 (pemesanan terakhir jam 20.30)\n" +
                        "\n" +
                        "Alamat: Terminal 1 Bandara Internasional Narita, Lantai 5"
            ),
            Restojepang(
                R.drawable.j16,
                "Yoshitomoan Soba",
                "Perjalanan ke Jepang pun tak akan lengkap jika tidak mencoba soba otentik! Meski Yoshitomoan bukanlah restoran soba yang paling mudah dijangkau (perjalanan kereta selama 12 menit dari stasiun Shinjuku.!",
                "Kontak: +81 3-3235-7177\n" +
                        "\n" +
                        "Jam operasional:\n" +
                        "\n" +
                        "Selasa sampai Minggu – 12.00 s.d 14.30, 18.00 s.d 21.00\n" +
                        "\n" +
                        "Tutup di hari Senin serta hari Minggu pertama dan ketiga setiap bulannya.\n" +
                        "\n" +
                        "Alamat: 10 Nandomachi,  Shinjuku-ku, Tokyo"
            ),
            Restojepang(
                R.drawable.j17,
                "Tentei",
                "Ingin makan tempura sebelum terbang kembali ke rumah? Pastikan kamu mengunjungi Tentei di Terminal 2 Narita Airport untuk mencoba tempura lezat yang disajikan dengan soba atau nasi!",
                "Status halal: Dapurnya tersertifikasi halal (oleh Malaysia Halal Consultation & Training Agency). Perlu diingat bahwa restoran ini juga menyajikan alkohol, namun semua gelasnya disimpan terpisah. Pertimbangan untuk makan di restoran ini kami kembalikan kepada masing-masing pembaca.\n" +
                        "\n" +
                        "Kontak: +81 476-34-6133\n" +
                        "\n" +
                        "Jam operasional: 7.30 s.d 21.00 setiap hari (pemesanan terakhir jam 20.30)\n" +
                        "\n" +
                        "Alamat: Terminal 2 Bandara Internasional Narita, Lantai 4"
            ),
            Restojepang(
                R.drawable.j18,
                "La Toque",
                "Butuh alasan lain untuk terbang dari atau menuju Bandara Narita? Well, selain udon halal dan tempura, Narita juga memiliki resto kari Jepang otentik – La Toque!",
                "Status halal: Tersertifikasi halal (oleh Japan Halal Asosciation)\n" +
                        "\n" +
                        "Kontak: +81 476-34-6193\n" +
                        "\n" +
                        "Jam operasional: 7.30 s.d 20.30 setiap hari (pemesanan terakhir jam 20.00)\n" +
                        "\n" +
                        "Alamat: Terminal 2 Bandara Internasional Narita, Lantai 4"
            ),
            Restojepang(
                R.drawable.j19,
                "CoCo Ichibanya",
                "Sekarang kamu bisa menikmati kari Jepang halal CoCo Ichibanya Curry House! Outlet Akihabara dan Shinjuku ini merupakan cabang CoCo Ichibanya yang pertama kali mendapatkan sertifikasi halal!.",
                "Status halal: Tersertifikasi halal (oleh Nippon Asia Halal Association)\n" +
                        "\n" +
                        "Kontak: +81 3-6260-8667\n" +
                        "\n" +
                        "Jam operasional: 11.00 s.d 22.00 setiap hari\n" +
                        "\n" +
                        "Alamat: 1 chome-6, 1F Kanda Matsunagacho, Chiyoda-ku, Tokyo 101-0023"
            ),
            Restojepang(
                R.drawable.j20,
                "Minokichi",
                "Kaiseki adalah sajian tradisional Jepang yang terdiri dari beberapa jenis makanan. Setiap hidangannya dipersiapkan dengan teknik, kemampuan khusus dan disajikan dengan tampilan yang menonjolkan rasa dan bahan khas musim itu.",
                "Status halal: Minokichi telah tersertifikasi sebagai restoran ramah Muslim oleh Kyoto Council of Sharia and Halal Affairs. Reservasi untuk menikmati makanan halal di restoran ini harus dilakukan lima hari sebelum kedatangan.\n" +
                        "\n" +
                        "Kontak: +81 03-3980-8855\n" +
                        "\n" +
                        "Jam operasional:\n" +
                        "\n" +
                        "Senin sampai Sabtu – 11.00 s.d 23.00\n" +
                        "\n" +
                        "Minggu dan hari libur nasional – 11.00 s.d 22.00\n" +
                        "\n" +
                        "*Tutup saat malam tahun baru serta hari Rabu ketiga di bulan Februari dan Agustus\n" +
                        "\n" +
                        "Alamat: Spice Ikebukuro Tobu 15F, 1 Chome-1-25, Nishiikebukuro, Toshima-ku, Tokyo\n" +
                        "\n" +
                        "Petunjuk arah: Sekitar 6 menit berjalan kaki dari jalur JR, Subway, atau Tobu Tojo stasiun Ikebukuro, keluar melalui pintu barat di Tobu Department Store."
            )
        )
            val recylerview = findViewById<RecyclerView>(R.id.rv_restj)
        recylerview.layoutManager = LinearLayoutManager(this)
        recylerview.setHasFixedSize(true)
        recylerview.adapter = JepangAdapter(this, restojepangList) {

            val intent = Intent(this, DetailJepangActivity::class.java)
            intent.putExtra(JepangMainActivity2.INTENT_PARACELABLE, it)
            startActivity(intent)
        }



        }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
    }
