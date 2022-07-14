package com.example.tugasdicoding;

import java.util.ArrayList;

public class HeroesData {
    private static String[] heroNames = {
            "Beast Master",
            "Earth Spirit",
            "Lycan",
            "Magnus",
            "Mars",
            "Phoenix",
            "Snapfire",
            "Timbersaw",
            "Undying",
            "WraithKing"
    };

    private static String[] heroDetails = {
            "Namun pahlawan Kekuatan serbaguna lainnya adalah Karroch atau Beastmaster. Sementara banyak yang menganggapnya sebagai offlaner dan terkadang bahkan jungler, Beastmaster dapat mendorong seperti urusan siapa pun dan bahkan membuat pahlawan musuh mundur dari jalur karena anteknya yang luar biasa.",
            "Earth Spirit atau Kaolin mungkin sedikit fiddly bagi siapa saja yang terbiasa dengan pahlawan Kekuatan kebanyakan inisiator atau tank, tetapi di tangan kanan, dia bersinar di jalur tengah. Banyaknya kemampuan kontrol kerumunan dan gangguan Kaolin membuatnya menjadi bencana berjalan bagi tim musuh.",
            "Sekarang, bagi mereka yang mencari keju dan memenangkan permainan dalam meta atau statusnya saat ini, tidak terlihat lagi selain Banehallow atau Lycan. Konsensus komunitas adalah bahwa dia \"secara tidak sengaja\" dibuat dikuasai oleh pembaruan terkini. Sekarang, dia dapat menjalankan sekawanan serigala masing-masing dengan peluang kritis dan potensi pertanian yang tinggi serta mendorong kecakapan.",
            "Setiap tim yang bagus membutuhkan inisiator tipe Strength yang solid dan tidak banyak yang bisa menandingi Magnus untuk peran itu. Skill pamungkasnya, Reverse Polarity, dapat merusak rencana musuh lebih cepat daripada reaksi mereka. Itu memang membuat Magnus menjadi target kemampuan stun tapi itu bisa dengan mudah diperbaiki.",
            "Dalam meta DOTA 2 saat ini, Mars biasanya dianggap sebagai offlaner paling kuat. Kemampuan agresifnya membuatnya menjadi momok di medan perang dan akan sangat bodoh untuk melawannya sendirian atau satu lawan satu. Selain memiliki skill ofensif dengan cooldown rendah, ia juga memiliki banyak peluang untuk melakukan knock back kepada musuh.",
            "Berbicara tentang pahlawan Kekuatan terbang, Phoenix adalah salah satu karakter pengganti. Dia adalah pahlawan jarak jauh dengan banyak HP yang tersisa dan dapat masuk ke dalam banyak peran. Ia dapat melakukan support, carry, dan inisiator. Terlepas dari stat Strength, Anda mungkin ingin menghindari tank terlalu banyak karena Phoenix memiliki kemampuan yang lebih baik digunakan untuk tujuan yang berbeda.",
            "Snapfire akan menjadi pilihan populer lainnya untuk pahlawan Kekuatan karena fleksibilitasnya. Duo penunggang naga ini juga memiliki penampilan yang sangat imut dan siapa pun yang meremehkannya dan hewan peliharaannya yang lucu pasti akan gerah.",
            "Tentu saja, hero DPS tipe Strength juga ada dan Rizzrack atau Timbersaw telah membuktikan bahwa kombinasi seperti itu dapat menimbulkan ketakutan di hati musuh. Seorang pemain Timbersaw yang kompeten dapat mengantongi beberapa Double atau Triple Kills dengan cukup mudah jika mereka cukup beruntung.",
            "Anda tidak perlu menebak-nebak apa yang mampu dilakukan Dirge atau Undying Yang Mahakuasa. Nama mengatakan itu semua. Dia adalah tank sejati dan sementara kebanyakan tank tetap agak kaku atau kuat hanya di awal permainan, Dirge sedikit berbeda karena dia juga seorang perapal mantra yang tangguh.",
            "Sama seperti Undying, Ostarion atau Wraith King adalah tank yang tidak akan mati. Dia juga menawarkan pasif Reinkarnasi meskipun miliknya jauh lebih baik karena memiliki cooldown yang lebih rendah dan menambahkan gimmicks. Tidak seperti Undying, bagaimanapun, dia lebih sederhana untuk digunakan dan lebih lugas."
    };

    private static int[] heroesImages = {
            R.drawable.beastmaster,
            R.drawable.earthspirit,
            R.drawable.lycan,
            R.drawable.magnus,
            R.drawable.mars,
            R.drawable.phoenix,
            R.drawable.snapfire,
            R.drawable.timbersaw,
            R.drawable.undying,
            R.drawable.wk
    };

    static ArrayList<Hero> getListData() {
        ArrayList<Hero> list = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++) {
            Hero hero = new Hero();
            hero.setName(heroNames[position]);
            hero.setDetail(heroDetails[position]);
            hero.setPhoto(heroesImages[position]);
            list.add(hero);
        }
        return list;
    }
}
