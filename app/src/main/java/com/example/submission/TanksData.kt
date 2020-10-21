package com.example.submission

object TanksData {

    private val tankNames = arrayOf(
        "T-34",
        "M4 Sherman",
        "Tiger I",
        "Tiger II",
        "KV Tank",
        "IS Tank",
        "M26 Pershing",
        "T-26",
        "Panther",
        "Panzer IV"
    )

    private val tankDetails = arrayOf(
        "T-34 ialah tank medium buatan Uni Soviet yang diperkenalkan tahun 1940 diterjunkan dalam Perang Dunia Ke-II dalam operasi Barbarossa, Tank ini merupakan tank legenda dalam perang dunia ke 2 karena performanya yang sangat baik, Senjata 76.2mm miliknya lebih kuat daripada tank lainnya. Tank ini diproduksi sebanyak 35120 buah dengan panjang tank 6.68 meter, lebar 3 meter, dan tinggi 2.45 meter.  ",
        "M4 Sherman adalah tank medium yang paling banyak digunakan oleh Amerika Serikat dan sekutunya dalam Perang Dunia Ke-II, M4 teruji dapat diandalkan, murah dan tersedia dalam jumlah besar, tank ini merupakan pengembangan dari tank M3 dengan panjang 5.84-6.27 meter, lebar 2.62-2.99 meter dan tinggi 2.74-2.97 meter",
        "Tank Tiger I adalah tank berat terkenal buatan jerman yang telah dipakai sejak 1942 dan digunakan dalam berbagai pertempuran pada Perang Dunia Ke-II. Tank ini merupakan Tank berat pertama dari Jerman dan Tank ini memiliki senjata utama kelas berat dan dapat membuat takut tank lawan di front timur. Tank ini dipakai dalam pengepungan kota Leningrad, Tank ini memiliki panjang 6.3 meter, lebar 3.56 meter dan tinggi 3 meter ",
        "Tank Tiger II ialah tank penerus tank tiger I, dengan tujuan menggantikan Tank Tiger I yang telah beroperasi, penambahan yang ada ialah penambahan lapisan armor sehingga berat tank ini bertambah dan membuatnya kesulitan dalam bermanuver akan tetapi tank ini sangatlah kuat bahkan hanya dapat dirusak oleh bom angkatan udara atau merian angkatan laut, tank ini memiliki panjang 7.38 meter, lebar 3.75 meter dan tinggi 3.09 meter",
        "Tank KV ialah salah satu tank kelas berat buatan Uni Soviet yang dibuat dari tahun 1939 dan dioperasikan hingga 1946. Tank ini pertama kali digunakan dalam operasi Barbarossa guna menahan invasi Jerman ke Uni Soviet. Tank ini diproduksi dalam jumlah sedikit dikarenakan harganya mahal. Tank ini memili panjang 8.49 meter, lebar 3.25 meter, dan 2.87 meter",
        "Tank IS ialah tank kelas berat yang menjadi penerus dari Tank KV, Tank ini dibuat unutk melawan Senjata 88 mm milik Jerman dan melawan tank Panzer IV Jerman. Tank ini dipakai sejak April 1944 dan menjadi ujung tombak dalam pasukan merah dalam pertempuran berlin. Tank ini memiliki panjang 9.9 meter, lebar 3.09 meter dan tinggi 2.73 meter.",
        "Tank ini ialah tank kelas berat/medium dari Amerika Serikat yang menjadi pengganti tank M4 Sherman akan tetapi dikarenakan proses pengembangannya yang lama maka hanya sedikit jumlahnya yang diterjunkan dalam perang dunia ke 2, Tank ini memiliki lapisan armor yang setara dengan T34 Soviet, Tank ini memiliki panjang 6.3 meter, lebar 3.51 meter dan tinggi 2.78 meter",
        "Tank kelas ringan buatan Uni Soviet ini merupakan desain tank paling sukses hingga armor tipisnya menjadi rawan akan senjata anti-tank, tank ini diproduksi hingga berjumlah 11000 unit, tank ini merupakan tank terbanyak yang dipakai dalam melawan invasi jerman pada tahun 1941 dan dalam pertempuran Moskow, Stalingrad, kauskaskus dan Leningrad . Tank ini memiliki panjang 4.65 meter, lebar 2.44 meter dan tinggi 2.24 meter",
        "Tank kelas menengah dari Jerman ini dibuat untuk menggantikan Panther III dan Panther IV tetapi dalam kenyataannya ia bertempur bersama adiknya Panther IV dan Tank Berat Tiger I, Tank ini merupakan tank terbanyak yang dibuat oleh Jerman guna melawan T-34 milik Soviet, tank ini dikenal dengan daya tembak yang luar biasa dan pertahanan yang baik sehingga ia menjadi salah satu tank terbaik dalam PD II. Tank ini memiliki panjang 6.87 meter, lebar 3.27 meter dan tinggi 2.99 meter.",
        "Tank Kelas menengah dari Jerman ini dikembangkan pada akhir 1930 dan sangat dipakai dalam perang dunia ke 2, Tank ini merupakan tank kedua terbanyak yang digunakan oleh jerman dengan jumlah yang dibuat sebanyak 8500 unit, tank ini mengembangkan meriam yang lebih besar untuk melawan tank t-34 milik soviet. Tank ini memiliki panjang 5.92 meter, lebar 2.88 meter dan tinggi 2.68 meter "
    )

    private val tankOrigin = arrayOf(
        "Uni Soviet",
        "Amerika Serikat",
        "Jerman",
        "Jerman",
        "Uni Soviet",
        "Uni Soviet",
        "Amerika Serikat",
        "Uni Soviet",
        "Jerman",
        "Jerman",
    )

    private val tankMasses = arrayOf(
        "26.5 ton",
        "33.4 ton",
        "54 ton",
        "68.5 ton",
        "45 ton",
        "46 ton",
        "46 ton",
        "9.6 ton",
        "44.8 ton",
        "25 ton"
    )

    private val tankType = arrayOf(
        "Tank medium",
        "Tank medium",
        "Tank berat",
        "Tank berat",
        "Tank berat",
        "Tank berat",
        "Tank berat/medium",
        "Tank ringan",
        "Tank berat",
        "Tank berat"
    )

    private val tankLength = arrayOf(
        "6.68 meter",
        "5.84 meter",
        "6.316 meter",
        "7.38 meter",
        "6.75 meter",
        "9.9 meter",
        "6.337 meter",
        "4.65 meter",
        "6.87 meter",
        "5.92 meter"
    )

    private val tankWidth = arrayOf(
        "3 meter",
        "2.62 meter",
        "3.56 meter",
        "3.755 meter",
        "3.32 meter",
        "3.09 meter",
        "3.51 meter",
        "2.44 meter",
        "3.27 meter",
        "2.88 meter"
    )

    private val tankHeight = arrayOf(
        "2.45 meter",
        "2.74 meter",
        "3 meter",
        "3.09 meter",
        "2.71 meter",
        "2.73 meter",
        "2.78 meter",
        "2.24 meter",
        "2.99 meter",
        "2.68 meter"
    )


    private val tankImages = intArrayOf(
        R.drawable.t34,
        R.drawable.m4sherman,
        R.drawable.tiger1,
        R.drawable.tiger2,
        R.drawable.kv,
        R.drawable.istank,
        R.drawable.m26,
        R.drawable.t26,
        R.drawable.panzer,
        R.drawable.panzer4
    )

    val listData: ArrayList<Tank>
        get() {
            val list = arrayListOf<Tank>()
            for (position in tankNames.indices) {
                val tank = Tank()
                tank.name_tank = tankNames[position]
                tank.detail_tank = tankDetails[position]
                tank.negara_tank = tankOrigin[position]
                tank.berat_tank = tankMasses[position]
                tank.jenis_tank = tankType[position]
                tank.panjang_tank = tankLength[position]
                tank.lebar_tank = tankWidth[position]
                tank.tinggi_tank = tankHeight[position]
                tank.gambar_tank = tankImages[position]
                list.add(tank)
            }
            return list
        }
}
