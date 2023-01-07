package com.example.japanesekoreanrestohalal

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class KoreaMainActiivity : AppCompatActivity() {

    companion object{
        val INTENT_PARACELABLE = "OBJECT_INTENT"
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.koreaactivity_main)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val restokorealist = listOf<Restokorea>(
            Restokorea(
                R.drawable.k01,
                "CASABLANCA(카사블랑카)",
                "Restoran yang berada di 35, Sinheung-ro, Yongsan-gu, Seoul (서울시 용산구 신흥로35) ini menyajikan makan masakan maroko dengan menu khasnya yaitu Lentil soup (렌틸콩 수프) seharga KRW 3.000 , Moroccan chicken sandwich(모로코 치킨 샌드위치) seharga KRW 8.000, dan Prawn shakshuka (새우 샥슈카) seharga KRW 12,000. Jam operasional dari restoran ini adalah mulai dari jam 12:00 - 22:00 dan hari senin tutup. Berdasarkan Korean Tourism Organization (KTO) restoran ini dikategorikan sebagai Muslim-Friendly yaitu restoran yang menyajikan menu makanan halal tetapi masih menjual alkohol.\n" +
                        "\n" +
                        "Alamat: 35, Sinheung-ro, Yongsan-gu, Seoul (서울시 용산구 신흥로35)\n" +
                        "No tlpn: 02-797-8367\n" +
                        "Bahan makanan : Halal Beef, Halal Lamb, Halal Chicken, Halal Seafood\n",

                ),
            Restokorea(
                R.drawable.k02,
                "MOROCOCOCAFE",
                "Restoran yang berada di 35, Sinheung-ro, Yongsan-gu, Seoul (서울시 용산구 신흥로35) ini menyajikan makan masakan maroko dengan menu khasnya yaitu Lentil soup (렌틸콩 수프) seharga KRW 3.000 , Moroccan chicken sandwich(모로코 치킨 샌드위치) seharga KRW 8.000, dan Prawn shakshuka (새우 샥슈카) seharga KRW 12,000. Jam operasional dari restoran ini adalah mulai dari jam 12:00 - 22:00 dan hari senin tutup. Berdasarkan Korean Tourism Organization (KTO) restoran ini dikategorikan sebagai Muslim-Friendly yaitu restoran yang menyajikan menu makanan halal tetapi masih menjual alkohol.\n" +
                        "\n" +
                        "Alamat : 35, Sinheung-ro, Yongsan-gu, Seoul (서울시 용산구 신흥로35)\n" +
                        "No tlpn : 02-797-8367\n" +
                        "Bahan makanan : Halal Beef, Halal Lamb, Halal Chicken, Halal Seafood\n",
            ),
            Restokorea(
                R.drawable.k03,
                "ITAEWON KITCHEN",
                "Restoran yang berada di 2F, 34, Usadan-ro, Yongsan-gu, Seoul,(서울시 용산구 우사단로 34 2층) ini menyajikan makanan malaysia dengan menu khasnya yaitu Nasi goreng ayam(나시고랭 아얌) seharga KRW 10,000, Lamb shanks(램 생스) seharga KRW 14,000, dan Kobideh kebab(쿠비데케밥) seharga KRW 14,000. Jam operasional dari restoran ini adalah mulai dari jam 11:00 - 23:00. Berdasarkan Korean Tourism Organization (KTO) restoran ini dikategorikan sebagai Self-Sertified artinya restoran hanya menyajikan menu makanan halal dan disertifikasi oleh pemilik restoran yang merupakan seorang muslim.\n" +
                        "\n" +
                        "Alamat : 2F, 34, Usadan-ro, Yongsan-gu, Seoul,(서울시 용산구 우사단로 34 2층)\n" +
                        "No tlpn : 02-3785-2468\n" +
                        "Bahan makanan : Halal Beef, Halal Lamb, Halal Chicken, Halal Seafood\n",

                ),
            Restokorea(
                R.drawable.k04,
                "U ri Sushi bar",
                "Restoran yang berada di 52, Jagalchihaean-ro, Jung-gu, Busan (부산광역시 중구 자갈치해안로52) ini menyajikan makan masakan korea dengan menu khasnya yaitu Grilled scallops and abalone(가리비전복구이), Grilled mackerel(고등어구이), dan Raw olive flounder slices(광어회). Jam operasional dari restoran ini adalah mulai dari jam 09:00 - 22:00. Berdasarkan Korean Tourism Organization (KTO) restoran ini dikategorikan sebagai Muslim-Friendly yaitu restoran yang menyajikan menu makanan halal tetapi masih menjual alkohol.\n" +
                        "\n" +
                        "Alamat : 52, Jagalchihaean-ro, Jung-gu, Busan (부산광역시 중구 자갈치해안로52 )\n" +
                        "No tlpn : 051-247-4282\n" +
                        "Bahan makanan : Halal Beef, Halal Lamb, Halal Chicken, Halal Seafood\n",

                ),
            Restokorea(
                R.drawable.k05,
                "Cappadocia",
                "Restoran yang berada di 123-9, Geumdan-ro, Geumjeong-gu, Busan (부산 금정구 금단로 123-9) ini menyajikan makan masakan Turki dengan menu khasnya yaitu Adana (아다나), Chicken kebab (치킨케밥), dan Kuşbaşılı pide (큐슈바슐르피데). Jam operasional dari restoran ini adalah mulai dari jam 11:30 - 22:00. Berdasarkan Korean Tourism Organization (KTO) restoran ini dikategorikan sebagai Self-Sertified artinya restoran hanya menyajikan menu makanan halal dan disertifikasi oleh pemilik restoran yang merupakan seorang muslim.\n" +
                        "Alamat : 123-9, Geumdan-ro, Geumjeong-gu, Busan (부산 금정구 금단로 123-9)\n" +
                        "No tlpn : 051-515-5981\n" +
                        "Bahan makanan : Halal Beef, Halal Lamb, Halal Chicken, Halal Seafood\n",

                ),
            Restokorea(
                R.drawable.k06,
                "Bollywood",
                "Restoran yang berada di 2F, 9, Gwangnam-ro 130beon-gil, Suyeong-gu, Busan (부산광역시 수영구 광남로 130번길 9, 2층 ) ini menyajikan makan masakan India dengan menu khasnya yaitu Vegetable biryani(야채 브리아니), Chilla(칠라), dan Prawn darbari(프라운 다르바리). Jam operasional dari restoran ini adalah mulai dari jam 12:00 - 22:00 dan khusus hari selasa jam operasional nya mulai dari jam 17:00 – 22:00. Berdasarkan Korean Tourism Organization (KTO) restoran ini dikategorikan sebagai Muslim-Friendly yaitu restoran yang menyajikan menu makanan halal tetapi masih menjual alcohol.\n" +
                        "Alamat : 2F, 9, Gwangnam-ro 130beon-gil, Suyeong-gu, Busan (부산광역시 수영구 광남로 130번길 9, 2층 )\n" +
                        "No tlpn : 051-987-9673\n" +
                        "Bahan makanan : Indian\n",

                ),
            Restokorea(
                R.drawable.k07,
                "Butkkotnadeul Beoseotjip",
                "Restoran yang berada di 8, Okpo-ro, Okpo-eup, Dalseong-gun, Daegu (대구광역시 달성군 옥포면 옥포로 8) ini menyajikan makan masakan korea dengan menu khasnya yaitu Mushroom stew (버섯전골), Sweet and sour mushroom (버섯탕수육), dan Sutchonggak mushroom soup (숫총각버섯탕). Jam operasional dari restoran ini adalah mulai dari jam 10:00 - 22:00 dan tutup setiap perayaan Chuseok dan Seollal. Berdasarkan Korean Tourism Organization (KTO) restoran ini dikategorikan sebagai Pork-Free yaitu restoran yang tidak menyajikan menu makanan halal tetapi tidak menggunakan daging babi dalam menunya serta masih menjual alkohol.\n" +
                        "Alamat : 8, Okpo-ro, Okpo-eup, Dalseong-gun, Daegu(대구광역시 달성군 옥포면 옥포로 8)\n" +
                        "No tlpn : 053-616-6655\n" +
                        "Bahan makanan : Korean Cuisine (pork free)\n",

                ),
            Restokorea(
                R.drawable.k08,
                "Juwangsan Samgyetang",
                "Restoran yang berada di 584, Biseul-ro, Hyeonpung-eup, Dalseong-gun, Daegu (대구광역시 달성군 현풍면 비슬로 584) ini menyajikan makan masakan korea dengan menu khasnya yaitu Ginseng chicken soup with black tiger’s paw mushrooms (능이삼계탕), Ginseng chicken soup with abalone(전복사계탕), dan Juwangsan ginseng chicken soup(주왕산삼계탕). Jam operasional dari restoran ini adalah mulai dari jam 10:00 - 21:00 dan tutup setiap perayaan Chuseok dan Seollal. Berdasarkan Korean Tourism Organization (KTO) restoran ini dikategorikan sebagai Pork-Free yaitu restoran yang tidak menyajikan menu makanan halal tetapi tidak menggunakan daging babi dalam menunya serta masih menjual alkohol.\n" +
                        "Alamat : 584, Biseul-ro, Hyeonpung-eup, Dalseong-gun, Daegu (대구광역시 달성군 현풍면 비슬로 584)\n" +
                        "No tlpn : 053-614-2236\n" +
                        "Bahan makanan : Korean Cuisine (pork free)\n",
                ),
            Restokorea(
                R.drawable.k09,
                "Indo Bangnanggi",
                "Restoran yang berada di 81, Daehak-ro, Buk-gu, Daegu(대구광역시 북구 대학로 81) ini menyajikan makan masakan India dengan menu khasnya yaitu Murgh masala curry(무르그마살라커리), Aloo gobi curry(알루고비커리), dan Popular curry menu(인기 커리). Jam operasional dari restoran ini adalah mulai dari jam 10:30 - 22:00 dan tutup setiap hari senin minggu pertama dan minggu ketiga. Berdasarkan Korean Tourism Organization (KTO) restoran ini dikategorikan sebagai Muslim-Friendly yaitu restoran yang menyajikan menu makanan halal tetapi masih menjual alkohol.\n" +
                        "\n" +
                        "Alamat\t\t\t: 81, Daehak-ro, Buk-gu, Daegu(대구광역시 북구 대학로 81)\n" +
                        "No tlpn\t\t: 053-956-9940\n" +
                        "Bahan makanan \t: indian\n",

                ),
            Restokorea(
                R.drawable.k10,
                "Aladdin Kebab",
                " Restoran yang berada di 1F, 187, Neungheodae-ro, Yeonsu-gu, Incheon(인천광역시 연수구 능허대로 187, 1층) ini menyajikan makan masakan Turki dengan menu khasnya yaitu Assorted grill (모듬구이), Arabian kebab(아라비안케밥), dan Chicken curry(치킨커리). Jam operasional dari restoran ini adalah mulai dari jam 10:30 - 22:00. Berdasarkan Korean Tourism Organization (KTO) restoran ini dikategorikan sebagai Self-Sertified artinya restoran hanya menyajikan menu makanan halal dan disertifikasi oleh pemilik restoran yang merupakan seorang muslim.\n" +
                        "\n" +
                        "Alamat : 1F, 187, Neungheodae-ro, Yeonsu-gu, Incheon(인천광역시 연수구 능허대로 187, 1층)\n" +
                        "No tlpn : 032-832-6003\n" +
                        "Bahan makanan \t: Turkish \n",

                ),
            Restokorea(
                R.drawable.k11,
                "BOMBAYBRAU",
                " Restoran yang berada di 160, Central-ro, Yeonsu-gu, Incheon(인천광역시 연수구 센트럴로 160) ini menyajikan makan masakan India dan Nepal dengan menu khasnya yaitu Lamb curry(램커리), Samosa(사모사), dan Chicken biryani (치킨비리야니). Jam operasional dari restoran ini adalah mulai dari jam 11:30 - 22:00. Berdasarkan Korean Tourism Organization (KTO) restoran ini dikategorikan sebagai Muslim-Friendly yaitu restoran yang menyajikan menu makanan halal tetapi masih menjual alkohol.\n" +
                        "Alamat : 160, Central-ro, Yeonsu-gu, Incheon(인천광역시 연수구 센트럴로 160)\n" +
                        "No tlpn : 032-833-7828\n" +
                        "Bahan makanan : Indian Halal Beef, Halal Lamb, Halal Chicken, Halal Seafood\n ",

                ),
            Restokorea(
                R.drawable.k12,
                "HWAREMU",
                "Restoran yang berada di 1F, Acria, 13, Sinsong-ro 125beon-gil, Yeonsu-gu, Incheon (인천광역시 연수구 신송로125번길 13 아크리아 1층) ini menyajikan makan masakan Asia dengan menu khasnya yaitu Soy-marinated shrimp(간장새우), Deluxe lamb ribs(고급양갈비), dan Lamb ribs(양갈비살). Jam operasional dari restoran ini adalah mulai dari jam 17:00 - 01:00. Berdasarkan Korean Tourism Organization (KTO) restoran ini dikategorikan sebagai Pork-Free yaitu restoran yang tidak menyajikan menu makanan halal tetapi tidak menggunakan daging babi dalam menunya serta masih menjual alkohol.\n" +
                        "\n" +
                        "Alamat : 1F, Acria, 13, Sinsong-ro 125beon-gil, Yeonsu-gu, Incheon(인천광역시 연수구 신송로125번길 13 아크리아 1층)\n" +
                        "No tlpn : 032-214-9295\n" +
                        "Bahan makanan : Asian Halal Beef, Halal Lamb, Halal Chicken, Halal Seafood\n",

                ),
            Restokorea(
                R.drawable.k13,
                "Bela Moti",
                "Restoran yang berada di 3F, Terrace Park B Wing, 652, Bangeojinsunhwando-ro, Dong-gu, Ulsan(울산광역시 동구 방어진순환도로 652, 테라스파크 B동 3층) ini menyajikan makan masakan India dengan menu khasnya yaitu Butter chicken curry(버터치킨커리), Tandoori set(탄두리모듬세트), dan Tandoori fish (탄두리피쉬). Jam operasional dari restoran ini adalah mulai dari jam 11:30 - 22:00 dan istirahan mulai dari jam 15:00 – 17:30. Berdasarkan Korean Tourism Organization (KTO) restoran ini dikategorikan sebagai Muslim-Friendly yaitu restoran yang menyajikan menu makanan halal tetapi masih menjual alkohol.\n" +
                        "Alamat : 3F, Terrace Park B Wing, 652, Bangeojinsunhwando-ro, Dong-gu, Ulsan(울산광역시 동구 방어진순환도로 652, 테라스파크 B동 3층)\n" +
                        "No tlpn : 052-251-5010\n" +
                        "Bahan makanan : Indian \n ",

                ),
            Restokorea(
                R.drawable.k14,
                "Café The Garden",
                "Restoran yang berada di 3F, Kangwon Land High1 Grand Hotel Main Tower, 55, Gohan-ro, Gohan-eup, Jeongseon-gun, Gangwon-do(강원도 정선군 고한읍 고한로 55, 강원랜드 메인호텔 3층) ini menyajikan makan masakan western dengan menu khasnya yaitu The Garden Salad(더 가든 샐러드), Mongolian barbecue(몽골리안 바비큐), dan Tenderloin mushroom cream risotto (안심 버섯 크림 리조토). Jam operasional dari restoran ini adalah mulai dari jam 09:00 - 22:00. Berdasarkan Korean Tourism Organization (KTO) restoran ini dikategorikan sebagai Muslim-Friendly yaitu restoran yang menyajikan menu makanan halal tetapi masih menjual alkohol.\n" +
                        "Alamat : 3F, Kangwon Land High1 Grand Hotel Main Tower, 55, Gohan-ro, Gohan-eup, Jeongseon-gun, Gangwon-do(강원도 정선군 고한읍 고한로 55, 강원랜드 메인호텔 3층)\n" +
                        "No tlpn : 033-5907-2667\n" +
                        "Bahan makanan : Western Halal Beef Halal Lamb  Halal Chicken Halal Seafood\n ",

                ),
            Restokorea(
                R.drawable.k15,
                "Mahasiddha Curry",
                "Restoran yang berada di #201, Building 2, 18, Jungang-ro 67beon-gil, Chuncheon-si, Gangwon-do(강원도 춘천시 중앙로67번길 18 2동 201호) ini menyajikan makan masakan India dengan menu khasnya yaitu Two-person couple set(2인커플세트), Chicken biryani(치킨비리야니), dan Prawn amritsari fry_prawns(프라운앙리트사리_새우). Jam operasional dari restoran ini adalah mulai dari jam 11:30 - 22:00. Berdasarkan Korean Tourism Organization (KTO) restoran ini dikategorikan sebagai Muslim-Friendly yaitu restoran yang menyajikan menu makanan halal tetapi masih menjual alkohol.\n" +
                        "Alamat : #201, Building 2, 18, Jungang-ro 67beon-gil, Chuncheon-si, Gangwon-do(강원도 춘천시 중앙로67번길 18 2동 201호)\n" +
                        "No tlpn : 033-254-6600\n" +
                        "Bahan makanan : Indian Halal Beef Halal Lamb Halal Chicken Halal Seafood\n",

                ),
            Restokorea(
                R.drawable.k16,
                "Chuncheon gomtang",
                "Restoran yang berada di 23, Soyangjeong-gil, Chuncheon-si, Gangwon-do(강원도 춘천시 소양로 1가 105-25) ini menyajikan makan masakan korea dengan menu khasnya yaitu Beef bone soup(곰탕), dan Assorted cuts of boiled meat (모듬수육). Jam operasional dari restoran ini adalah mulai dari jam 09:00 - 21:00 dan tutup setiap perayaan Chuseok dan Seollal. Berdasarkan Korean Tourism Organization (KTO) restoran ini dikategorikan sebagai Pork-Free yaitu restoran yang tidak menyajikan menu makanan halal tetapi tidak menggunakan daging babi dalam menunya serta masih menjual alkohol.\n" +
                        "Alamat : 23, Soyangjeong-gil, Chuncheon-si, Gangwon-do(강원도 춘천시 소양로 1가 105-25)\n" +
                        "No tlpn : 033-254-8588\n" +
                        "Bahan makanan : Korean Cuisine (pork free)\n",

                ),
            Restokorea(
                R.drawable.k17,
                "Shubh Indian and Nepalese Restaurant",
                "Restoran yang berada di 1F, 50, Jungsimsangeop 1-ro, Ochang-eup, Cheongwon-gu, Cheongju-si, Chungcheongbuk-do(충북 청주시 청원구 오창읍 중심상업1로 50, 1층) ini menyajikan makan masakan India dan nepal dengan menu khasnya yaitu Samosa(사모사), Chicken curry(치킨커리), dan Couple set(커플세트). Jam operasional dari restoran ini adalah mulai dari jam 11:00 - 22:00. Berdasarkan Korean Tourism Organization (KTO) restoran ini dikategorikan sebagai Muslim-Friendly yaitu restoran yang menyajikan menu makanan halal tetapi masih menjual alkohol.\n" +
                        "Alamat : 1F, 50, Jungsimsangeop 1-ro, Ochang-eup, Cheongwon-gu, Cheongju-si, Chungcheongbuk-do(충북 청주시 청원구 오창읍 중심상업1로 50, 1층)\n" +
                        "No tlpn : 043-218-4892\n" +
                        "Bahan makanan : Nepal, Indian\n",

                ),
            Restokorea(
                R.drawable.k18,
                "ASALAM",
                "Restoran yang berada di 7, Jungang-ro 2-gil, Jeju-si, Jeju-do (제주특별자치도 제주시 중앙로2길 7 ) ini menyajikan makan masakan Arab dengan menu khasnya yaitu Arabic tea(아라빅 티), Lamb mandi rice(양고기 만디라이스), dan Lamb haneeth(양고기 하니드). Jam operasional dari restoran ini adalah mulai dari jam 12:00 - 22:00 istirahat mulai dari jam 15:00 – 17:00 dan tutup setiap hari kamis. Berdasarkan Korean Tourism Organization (KTO) restoran ini dikategorikan sebagai Halal-Sertified yaitu restoran yang telah disertifikasi oleh Badan Sertifikasi Halal terakreditasi seperti Korea Muslim Federation (KMF).\n" +
                        "Alamat : 7, Jungang-ro 2-gil, Jeju-si, Jeju-do (제주특별자치도 제주시 중앙로2길 7)\n" +
                        "No tlpn : 064-751-1225\n" +
                        "Bahan makanan : Arab Halal Beef Halal Lamb Halal Chicken Halal Seafood\n",

                ),
            Restokorea(
                R.drawable.k19,
                "Moksukwon",
                "Restoran yang berada di 1599, Jeonseo-ro, Pungcheon-myeon, Andong-si, Gyeongsangbuk-do(경북 안동시 풍천면 전서로 1599) ini menyajikan makan masakan korea dengan menu khasnya yaitu Set menu with charcoal grilled Andong master salted mackerel (명인 간고등어 숯불구이 정식), dan Braised halal chicken(할랄푸드 찜닭). Jam operasional dari restoran ini adalah mulai dari jam 09:00-19:00. Berdasarkan Korean Tourism Organization (KTO) restoran ini dikategorikan sebagai Pork-Free yaitu restoran yang tidak menyajikan menu makanan halal tetapi tidak menggunakan daging babi dalam menunya serta masih menjual alkohol.\n" +
                        "Alamat : 1599, Jeonseo-ro, Pungcheon-myeon, Andong-si, Gyeongsangbuk-do(경북 안동시 풍천면 전서로 1599)\n" +
                        "No tlpn : 054-582-3788\n" +
                        "Bahan makanan : Korean Cuisine (pork free)\n",

                ),
            Restokorea(
                R.drawable.k20,
                "Sweetindia",
                "Restoran yang berada di 36, Geoseok-gil, Gunsan-si, Jeollabuk-do(전북 군산시 거석길 36) ini menyajikan makan masakan India dengan menu khasnya yaitu Indian stir-fried vegetables (인도야채볶음), Chicken tikka masala (치킨티카마살라), dan Tandoori lamb(탄두리램). Jam operasional dari restoran ini adalah mulai dari jam 11:00 - 22:00. Berdasarkan Korean Tourism Organization (KTO) restoran ini dikategorikan sebagai Muslim-Friendly yaitu restoran yang menyajikan menu makanan halal tetapi masih menjual alkohol.\n" +
                        "Alamat : 36, Geoseok-gil, Gunsan-si, Jeollabuk-do(전북 군산시 거석길 36)\n" +
                        "No tlpn : 063-445-8522\n" +
                        "Bahan makanan : Indian\n"

            )
        )

        val recylerview = findViewById<RecyclerView>(R.id.rv_restk)
        recylerview.layoutManager = LinearLayoutManager(this)
        recylerview.setHasFixedSize(true)
        recylerview.adapter = KoreaAdapter(this, restokorealist){

            val intent = Intent (this, DetailKoreaActivity::class.java )
            intent.putExtra(INTENT_PARACELABLE, it)
            startActivity(intent)
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}