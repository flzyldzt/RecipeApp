package com.example.yemektarifiapp.util;

import com.example.yemektarifiapp.R;
import com.example.yemektarifiapp.subcategory.SubCategoryModel;
import com.example.yemektarifiapp.subcategory.soup.detail.SoupDetailModel;

import java.util.ArrayList;

public class DummyListGenerator {

    public DummyListGenerator() {
    }

    public ArrayList<SubCategoryModel> getDessertList() {

        //Ürünlerin detay bılgılerını ıceren model:
        ArrayList<SubCategoryModel> dessert = new ArrayList<>();
        dessert.add(
                new SubCategoryModel(
                        "Fırın Sütlaç",
                        R.drawable.firin_sutlac,
                        new SoupDetailModel(R.drawable.firin_sutlac,
                                "1 porsiyon için 286 kaloridir.",
                                "4-6 kişilik",
                                "1 litre süt\n" +
                                        "1 su bardağı şeker\n" +
                                        "Yarım su bardağı pirinç\n" +
                                        "3 yemek kaşığı buğday nişastası\n" +
                                        "1 paket vanilya\n" +
                                        "2 su bardağı su\n" +
                                        "Yarım su bardağı süt (nişastayı açmak için)",
                                "Fırında sütlaç için öncelikle pirinci haşlayalım. Pirinçleri güzelce yıkadıktan sonra 2 su bardağı su ile pirinçler yumuşayıp pişene kadar haşlayın. Çok az sulu kalacaktır.\n" +
                                        "Diğer malzemeleri ekleyelim ve sütlacı pişirelim. Haşlanan pirinçlerin üzerine sütü, vanilyayı ilave edip kaynatın.\n" +
                                        "Bu arada bir kap içerisinde nişasta ve suyu pürüzsüz kıvam alıncaya kadar karıştırın.\n" +
                                        "Karışım kaynamaya başlayınca şekeri ve yarım su bardağı sütle karıştırdığınız 3 yemek kaşığı buğday nişastasını ilave ediniz. 10-15 dk. daha kaynatıp ocağın altını kapatın.\n" +
                                        "Sütlaçları fırına sürelim. Fırın için uygun ısıya dayanıklı sütlaç kaselerine sütlaçlarınızı paylaştırın.\n" +
                                        "Tepsinize soğuk su doldurun ve sütlaç kaplarını fırın tepsinize dizin (Tepsideki su sütlaç kaplarının yarısına kadar gelecek)\n" +
                                        "Tepsiyi fırınınızın en üst rafına yerleştirin.\n" +
                                        "180 derecede, sütlaçlarınız kızarana kadar fırınlayın. Afiyet olsun.")
                )
        );

        dessert.add(
                new SubCategoryModel(
                        "Magnolia",
                        R.drawable.magnolia,
                        new SoupDetailModel(R.drawable.magnolia,
                                "1 porsiyon için 443 kaloridir.",
                                "6 kişilik",
                                "Muhallebisi için;\n" +
                                        "\n" +
                                        "1 litre süt\n" +
                                        "3 yemek kaşığı un\n" +
                                        "2 yemek kaşığı nişasta\n" +
                                        "1 su bardağı şeker\n" +
                                        "1 adet yumurta sarısı\n" +
                                        "1 paket sıvı krema\n" +
                                        "1 paket vanilya\n" +
                                        "\n" +
                                        "Arası için;\n" +
                                        "1,5 paket burçak bisküvi\n" +
                                        "Çilek",
                                "Tencereye süt, şeker, nişasta, un ve yumurtayı alalım.\n" +
                                        "Çırpma teli ile çırpalım.\n" +
                                        "Ocağa alıp karıştırmaya başlayalım.\n" +
                                        "Kıvamı koyulaşıp, göz göz oluncaya kadar pişirelim.\n" +
                                        "Ocaktan alalım, vanilya ekleyelim ve karıştıralım. Soğumaya bırakalım.\n" +
                                        "Muhallebimiz soğurken, ara ara karıştıralım ki üzeri kabuk tutmasın.\n" +
                                        "Muhallebi soğurken, bisküvileri rondodan geçirelim.\n" +
                                        "Muhallebimiz soğuduktan sonra, içine bir paket krema ilave edip mikser ile çırpalım.\n" +
                                        "Çilekleri ince dilimler halinde keselim.\n" +
                                        "Kupların en dibine 1 yemek kaşığı bisküvi ekleyelim.\n" +
                                        "Çilekleri görüntülerdeki gibi dizelim ve üzerine muhallebi ilave edelim.\n" +
                                        "Daha sonra bir kat daha bisküvi ve yine muhallebi, en son bisküvi olacak şekilde pay edelim.")
                )
        );

        dessert.add(
                new SubCategoryModel(
                        "Aşure",
                        R.drawable.asure,
                        new SoupDetailModel(R.drawable.asure,
                                "1 porsiyon için 350 kaloridir.",
                                "16+ kişilik",
                                "2 su bardağı aşurelik buğday\n" +
                                        "2 yemek kaşığı pirinç\n" +
                                        "2 su bardağı haşlanmış nohut\n" +
                                        "2 su bardağı haşlanmış fasulye\n" +
                                        "150 gram kuru kayısı\n" +
                                        "150 gram kuru incir\n" +
                                        "150 gram kuru üzüm\n" +
                                        "1 su bardağından biraz az fındık\n" +
                                        "2 litre su (buğdayları pişirmek için)\n" +
                                        "4 litre sıcak su (su azaldıkça eklemek için)\n" +
                                        "1 tatlı kaşığı karanfil\n" +
                                        "1 çay bardağı su (karanfili kaynatmak için)\n" +
                                        "1,5 su bardağı sıcak süt\n" +
                                        "3 su bardağı toz şeker\n" +
                                        "1 fiske tuz\n" +
                                        "1 fiske karabiber",
                                "İlk olarak nohut ve fasulyeyi ayrı ayrı haşlayalım.\n" +
                                        "Buğdayı yıkayıp, tencereye alalım, üzerine kaynar su ekleyip 10 dk kaynatalım. Çıkan sarı suyu süzelim. Aynı işlemi bir kez daha yapalım ve suyunu süzelim.\n" +
                                        "Daha sonra üzerine 2 litre kadar su ekleyip, 50 dk kadar buğdayı kaynatalım. (Dilerseniz akşamdan iki kez kaynatıp, suyunu süzerek daha sonra sıcak suda sabaha kadar bekletebilirsiniz. Akşamdan ıslatırsanız, 15 dk kaynatmak yeterli olacaktır.).\n" +
                                        "Kuru kayısı ve kuru inciri küçük küçük doğrayalım.\n" +
                                        "Ardından doğradığımız bu meyveleri ve kuru üzümü geniş bir kaseye alarak üzerine sıcak su ekleyelim ve bekletelim.\n" +
                                        "Arada gerektikçe sıcak su eklemeyi ihmal etmeyin. Suyu azalan buğdaylarımıza biraz daha sıcak su ekleyelim.\n" +
                                        "Yaklaşık 50 dakika kadar kaynattığımız ve yumuşayan buğdaya yıkanmış pirinç, pişmiş nohut, haşlanmış fasulye, küçük doğranmış kayısı, incir ve kuru üzümünde suyunu süzerek ekleyelim ve 15 dk kadar kaynatalım.\n" +
                                        "Küçük bir cezve içerisine karanfil alalım ve suyu da ekleyerek 10 dakika kadar kaynamaya bırakalım.\n" +
                                        "Bu sırada suyu azalan buğdaylarımızın üzerine tekrar sıcak su ilave edelim.\n" +
                                        "Son olarak süzgeçten geçirdiğimiz karanfil suyu, fındık, sıcak süt, şeker, isteğe bağlı tuz, karabiber ekleyerek karıştıralım ve yaklaşık 15-20 dk daha kaynatalım.\n" +
                                        "Hazırladığımız aşuremizi tek tek cam kaselere bölüştürelim. Biz bu ölçüler ile 15 kase aşure elde ettik.\n" +
                                        "Aşure kaselerde soğumaya yüz tutunca, üzerini fındık, ceviz, fıstık, kuş üzümü, kuru üzüm ve nar taneleri ile süsleyebilirsiniz. Afiyet olsun.")
                )
        );

        dessert.add(
                new SubCategoryModel(
                        "Vişneli Cheesecake",
                        R.drawable.visneli_cheesecake,
                        new SoupDetailModel(R.drawable.visneli_cheesecake,
                                "Orta büyüklükte 1 dilim Frambuazlı Cheesecake yaklaşık olarak 441 kaloridir.",
                                "10-12 kişilik",
                                "Cheesecake Tabanı için:\n" +
                                        "200 g burçak bisküvi\n" +
                                        "60 gr eritilmiş tereyağı\n" +
                                        "\n" +
                                        "Cheesecake hamuru için:\n" +
                                        "600 g labne peynir\n" +
                                        "400 ml sıvı  krema\n" +
                                        "1 su bardağı şeker\n" +
                                        "3 adet yumurta\n" +
                                        "3 yemek kaşığı nişasta\n" +
                                        "1 paket vanilya\n" +
                                        "Yarım limon suyu\n" +
                                        "\n" +
                                        "Vişne sosu için:\n" +
                                        "300 gr dondurulmuş vişne\n" +
                                        "5 yemek kaşığı şeker\n" +
                                        "1 su bardağı su\n" +
                                        "2 yemek kaşığı nişasta ( yarım çay bardağı suda çözdürülmüş)",
                                "İlk olarak 25 cm’lik kek kalıbımızın tabanına pişirme kağıdı yerleştirelim, kelepçesini kapatarak kenarlarından fazla gelen kısımlarını makas yardımı ile keselim.\n" +
                                        "Pişirme kağıdından uzun şeritler keselim ve bu şeritleri tereyağı ile kalıbın kenarlarına sabitleyelim.\n" +
                                        "Daha sonra kalıbımızın tabanını alüminyum folyo ile kaplayalım.\n" +
                                        "Cheesecakekimizin tabanı için bisküvileri rondodan geçirelim. Tereyağını da eriterek rondodan geçirdiğimiz bisküvilerin üzerine ilave edelim ve güzelce karıştıralım.\n" +
                                        "Kalıbımızın tabanına hazırladığımız harcı bastırarak yerleştirelim ve buzdolabına koyarak 10-15 dakika kadar bekletelim. Bu aşamada harcı bardak yardımı ile bastırabilirsiniz.\n" +
                                        "Bu sırada cheesecakekimizin hamuru için labne peyniri ve kremayı mikserde güzel bir şekilde çırpalım.\n" +
                                        "İçerisine şekeri de ilave ederek çırpmaya devam edelim.\n" +
                                        "Yumurtaları ekleyip güzel bir şekilde çırptıktan sonra üzerine nişastayı, vanilyayı ve limon suyunu da ekleyerek güzelce karışıncaya kadar çırpalım.\n" +
                                        "Kek kalıbımızı dolaptan alalım ve fırın tepsisine yerleştirelim. Üzerine hazırladığımız hamuru aktaralım.\n" +
                                        "Fırın tepsisine ılık su dökelim ve cheesecakekimizi önceden ısıttığımız 180°C fırında 10 dakika kadar pişirelim.\n" +
                                        "Daha sonra sıcaklığı 160°C ye indirelim ve 50 dakika daha pişirmeye devam edelim.\n" +
                                        "Piştikten sonra fırınımızı kapatalım ve 1 saat kadar fırının kapağını açmadan cheesecakekimizin soğumasını bekleyelim.\n" +
                                        "Bu sırada vişneli sosumuzu hazırlamaya başlayalım. Dondurulmuş vişneyi uygun bir tencereye alalım, üzerine şekeri ve 1 su bardağı suyu ilave edelim.\n" +
                                        "Nişastayı yarım çay bardağı suda çözdürelim ve tenceremize ilave edelim.\n" +
                                        "Sosumuzu kaynayıp kıvam alana kadar karıştırarak pişirelim.\n" +
                                        "Hazırladığımız vişneli sosumuzu soğuyan cheesecakekimizin üzerine gezdirelim.\n" +
                                        "Eğer vaktiniz varsa cheesecakekinizi 1 gece buzdolabında dinlendirerek, vaktiniz yoksa 2-3 saat dinlendirerek kalıptan çıkartabilir ve servis edebilirsiniz.\n")
                )
        );

        dessert.add(
                new SubCategoryModel(
                        "Güllaç",
                        R.drawable.gullac,
                        new SoupDetailModel(R.drawable.gullac,
                                "Orta büyüklükteki 1 dilim güllaç yaklaşık olarak 250 kaloridir.",
                                "8-10 kişilik",
                                "12 yaprak güllaç\n" +
                                        "1,5 litre süt\n" +
                                        "2 su bardağı şeker\n" +
                                        "Çekilmiş ceviz\n" +
                                        "2 yemek kaşığı gül suyu (isteğe göre)\n" +
                                        "\n" +
                                        "Üzeri için:\n" +
                                        "Toz Antep fıstığı\n" +
                                        "Kiraz şekerlemesi",
                                "Güllaç tatlısını yapmak için; öncelikle süt ve şekeri tencereye alarak ısıtıyoruz, şekerler tamamen erisin. Bu aşamada sütü çok fazla ısıtmanıza gerek yok, şekerin erimesi yeterli olacaktır.\n" +
                                        "Daha sonra sütü oda sıcaklığında ılınmaya bırakıyoruz. Eğer el yakmayacak şekilde ısıttıysanız tekrar ılıması için beklemenize gerek olmayacaktır. Süt kaynar olursa tatlınız hamur olur o nedenle el yakmayacak şekilde olmalı.\n" +
                                        "Güllaç yaprağının parlak kısmı üste gelecek şekilde ilkini derince bir tepsiye koyuyoruz.\n" +
                                        "Üzerine her yanı ıslanacak şekilde bir iki kepçe süt döküyoruz.\n" +
                                        "Altı güllaç yaprağı için aynı işlemi tekrarlayalım ve 6. katı da ıslattıktan sonra bu kata ceviz serpelim ve üzerine diğer güllaç yapraklarını aynı şekilde ıslatarak serelim.\n" +
                                        "Kalan şekerli sütün içerisine 2 yemek kaşığı gül suyu ekleyip tatlının üzerine gezdirelim. Burada kullandığınız gül suyunun kozmetik ürünü olmamasına dikkat etmelisiniz.\n" +
                                        "Hazırladığımız tatlımızı 2 saat kadar buzdolabında muhafaza edelim.\n" +
                                        "En az 2-3 saat dinlendirdikten sonra üzerini isteğe göre süsleyerek servis edebilirsiniz. Ben toz antep fıstığı ve kiraz şekerlemeleri ile süsledim. Afiyet olsun!")
                )
        );
        return dessert;
    }

    public ArrayList<SubCategoryModel> getSoupList() {
        ArrayList<SubCategoryModel> soup = new ArrayList<>();

        soup.add(
                new SubCategoryModel(
                        "Ezogelin Çorbası",
                        R.drawable.ezogelin,
                        new SoupDetailModel(R.drawable.ezogelin,
                                "Orta büyüklükte 1 kase ezogelin çorbası yaklaşık olarak 91 kaloriye denk gelmektedir.",
                                "8-10 kişilik",
                                "1 yemek kaşığı sıvı yağ\n" +
                                        "1 yemek kaşığı tereyağı\n" +
                                        "1 adet kuru soğan\n" +
                                        "2 diş sarımsak\n" +
                                        "1 su bardağı kırmızı mercimek\n" +
                                        "1 kahve fincanı bulgur (4 yemek kaşığı)\n" +
                                        "Yarım kahve fincanı pirinç (2 yemek kaşığı)\n" +
                                        "6 su bardağı sıcak su + 2,5 su bardağı sıcak su\n" +
                                        "\n" +
                                        "Sosu için;\n" +
                                        "2 yemek kaşığı sıvıyağ\n" +
                                        "1 yemek kaşığı un\n" +
                                        "2 yemek kaşığı domates salçası\n" +
                                        "2 su bardağı sıcak su\n" +
                                        "1 tatlı kaşığı nane\n" +
                                        "1 çay kaşığı kırmızı pul biber\n" +
                                        "1 çay kaşığı karabiber\n" +
                                        "1,5 tatlı kaşığı kadar tuz",
                                "Tencereye tereyağı ve 1 yemek kaşığı sıvı yağ tencereye alınarak ısıtılır.\n" +
                                        "Soğan ve sarımsak küçük küçük doğranır ve tencerede orta ateşte, soğanlar diriliğini kaybedinceye kadar kavrulur. Dilerseniz sarımsakları rendeleyerek de kullanabilirsiniz.\n" +
                                        "Üzerine yıkanmış ve suyu süzülmüş olan kırmızı mercimek, pirinç ve bulgur eklenerek karıştırılır ve kavrulur.\n" +
                                        "Üzerine sıcak su ilave edilerek tencerenin kapağı kapatılır ve pişmeye bırakılır. Çorba kaynayana kadar yüksek ateşte kaynadıktan sonra kısık ateşte ara ara karıştırılır.\n" +
                                        "Bakliyatlar yumuşayınca kadar yaklaşık 35 dakika pişirilir ve ocak kapatılır.\n" +
                                        "Ayrı bir yerde 2 yemek kaşığı sıvı yağ ısıtılır.\n" +
                                        "1 yemek kaşığı un eklenir ve unun kokusu çıkana kadar karıştırılarak kavrulur.\n" +
                                        "Üzerine 2 yemek kaşığı domates salçası eklenir, 1-2 dakika daha kavrulur.\n" +
                                        "Salça da kavrulduktan sonra 2 su bardağı kadar su ilave edilerek kaynatılır.\n" +
                                        "Nane, kırmızı biber, karabiber ilave edilerek hazırlanan sos ocaktan alınır ve çorbaya ilave edilir.\n" +
                                        "Tuzu da eklenerek 1-2 dakika kaynatılır. Bu aşamada gerek duyarsanız sıcak su ekleyebilirsiniz. Ben 2,5 su bardağı kadar sıcak su ekledim ancak siz çorbanızın kıvamına göre ayarlayabilirsiniz.\n" +
                                        "Yaklaşık 5 dakika daha kaynattıktan sonra Ezogelin Çorbamız servise hazır. Afiyet olsun.")
                )
        );

        soup.add(
                new SubCategoryModel(
                        "Yayla Çorbası",
                        R.drawable.yayla,
                        new SoupDetailModel(R.drawable.yayla,
                                "Orta büyüklükteki 1 kase yayla çorbası yaklaşık olarak 94 kaloriye denk gelmektedir.",
                                "4-6 kişilik",
                                "1 fincan pirinç (Türk kahvesi fincanı)\n" +
                                        "7 su bardağı su\n" +
                                        "1 su bardağı yoğurt\n" +
                                        "1 yumurta\n" +
                                        "Yarım fincandan biraz fazla un (Türk kahvesi fincanı)\n" +
                                        "3 yemek kaşığı sıvı yağ\n" +
                                        "2 yemek kaşığı tereyağı\n" +
                                        "Tuz\n" +
                                        "Nane",
                                "Su, sıvı yağ, tuz ve pirinçler tencereye alınır. Pirinçler yumuşayıncaya kadar kaynatılır.\n" +
                                        "Ayrı bir kasede yoğurt, yumurta ve un, 1 su bardağına yakın su ile birlikte iyice çırpılır.\n" +
                                        "Pirinçler yumuşayınca hızlıca karıştırarak yoğurtlu karışım çorbaya eklenir. Kaynayana kadar karıştırılır. Kaynayınca kısık ateşte 10-15 dk kaynatılır. Ara sıra karıştırmayı ihmal etmeyin.\n" +
                                        "Çorbamız piştikten sonra altı kapatılır.\n" +
                                        "Şık bir sunum olması açısından;\n" +
                                        "Çorba kaselere alınır. Ayrı bir yerde tereyağı kızdırılarak nane ile karıştırılır. Ve kaselerdeki çorbaların üzerinde gezdirilir. Kalan naneli tereyağını tenceredeki çorbaya koyup karıştırın.\n" +
                                        "Mis kokulu yayla çorbamız servise hazır.")
                )
        );

        soup.add(
                new SubCategoryModel(
                        "Mercimek Çorbası",
                        R.drawable.mercimek,
                        new SoupDetailModel(R.drawable.mercimek,
                                "Orta büyüklükteki 1 kase kırmızı mercimek çorbası yaklaşık olarak 62 kaloridir.",
                                "6-8 kişilik",
                                "2 su bardağı kırmızı mercimek\n" +
                                        "1 adet soğan\n" +
                                        "2 yemek kaşığı un\n" +
                                        "1 adet havuç\n" +
                                        "Yarım yemek kaşığı biber ya da  domates salçası (rengi kırmızı olsun isterseniz artırabilir ya da hiç kullanmayabilirsiniz)\n" +
                                        "1 tatlı kaşığı tuz\n" +
                                        "Yarım çay kaşığı karabiber\n" +
                                        "1 çay kaşığı kimyon (isteğe bağlı)\n" +
                                        "2 litre sıcak su\n" +
                                        "5 yemek kaşığı sıvı yağ\n" +
                                        "\n" +
                                        "Sosu için:\n" +
                                        "2 yemek kaşığı tereyağı\n" +
                                        "1 tatlı kaşığı kırmızı toz biber",
                                "Kırmızı mercimek çorbası için sıvı yağı tencereye alınarak yemeklik doğranan soğanlar hafif pembeleşinceye kadar kavrulur.\n" +
                                        "Daha sonra un ilave edilerek kısık ateşte kavurmaya devam edilir.\n" +
                                        "Salça kullanılacak ise salça ilave edilir, kavrulduktan sonra küp küp doğranmış havuç ve iyice yıkanıp suyu süzülen mercimekler ilave edilir.\n" +
                                        "Üzerine su eklenerek karıştırılır ve tencerenin kapağı kapatılır. Çorbamız kaynayana kadar orta ateşte, kaynadıktan sonra mercimekler ve havuçlar yumuşayana kadar ara ara karıştırılarak kısık ateşte pişirilir.\n" +
                                        "Çorba piştikten sonra el blenderı ile güzelce ezilir. Eğer blenderiniz yoksa süzgeçten de geçirebilirsiniz.\n" +
                                        "Karabiber, tuz ve isteğe bağlı olarak kimyon eklenir ve karıştırılır. 5 dakika daha pişirilerek ocaktan alınır.\n" +
                                        "Kıvamı koyu gelirse size, bir miktar su ilave edilerek bir taşım kaynatılır.\n" +
                                        "Bu arada küçük bir tavaya iki yemek kaşığı tereyağı alınır, kızdırılır ve bir tatlı kaşığı kırmızı toz biber eklenerek ocaktan alınır.\n" +
                                        "Mercimek çorbası servis kasesine alındıktan sonra üzerine kırmızı biberli sos gezdirilir ve bir dilim limon ile servis edilir.")
                )
        );

        soup.add(
                new SubCategoryModel(
                        "Mantar Çorbası",
                        R.drawable.mantar,
                        new SoupDetailModel(R.drawable.mantar,
                                "Orta büyüklükte 1 kase mantar çorbası yaklaşık olarak 133 kaloridir.",
                                "2-4 kişilik",
                                "500 gram kültür mantarı\n" +
                                        "3 yemek kaşığı un\n" +
                                        "500 ml süt\n" +
                                        "3 su bardağı su (et suyu ve ya tavuk suyu varsa tercih edilmeli)\n" +
                                        "2 yemek kaşığı tereyağı\n" +
                                        "1 adet bulyon (eklemek tercihe kalmış)\n" +
                                        "1 tatlı kaşığı tuz\n" +
                                        "1 çay kaşığı karabiber\n" +
                                        "Yarım limon suyu, 2 kaşık sirke (mantarları haşlarken)\n" +
                                        "2 yemek kaşığı tereyağı (mantarları kavururken)",
                                "Mantarlarınızı bir kaba alınız ve soyunuz. Mantarların tüm soyma aşamalarını resimlerden görebilir mantarlarınızı o şekil de soyabilirsiniz. Soyduğunuz mantarlarınızı şöyle bir sudan geçirin, yıkayın.\n" +
                                        "Su ısıtıcınız ile su kaynatın, kaynayan suyu bir tencereye alın içine yarım limon ve 2 kaşık sirke ekleyin.\n" +
                                        "Yıkanan mantarları da kaynayan suyun içine ekleyin mantarlarınız yumuşayana kadar haşlayın.\n" +
                                        "Mantarlar haşlandı mantarları bir süzgece alın soğusunlar. Mantarlarınız soğudu mantarları bir tabağa doğrayın.\n" +
                                        "Bir tavaya 2 kaşık tereyağı ekleyin, eritin doğramış olduğunuz mantarları da tavaya ekleyerek mantarlarınızı bir güzel kavurun. Resimlerden kavrulan mantarları görebilirsiniz.\n" +
                                        "Çorbayı hazırlayacağınız tencere de 2 kaşık tereyağı eritin buna 3 kaşık unu ekleyin ve kavurun.\n" +
                                        "Kavrulmuş ununuza 500 ml sütü ekleyin ve kaynatın…. süt kaynadı şimdi evde var ise süte 3 su bardağı et suyu veya tavuk suyu ekleyin yok ise de 3 su bardağı kaynamış su ekleyin. .\n" +
                                        "Tencereyi 2-3 karıştırın fokurdadığında kavrulmuş mantarları bu karışıma (yağı ile beraber tavayı sıyırın)ekleyin. Çorbanız nerede ise hazır.\n" +
                                        "Baharat olarak kaynayan çorbaya tuz ve karabiber ekleyin. Arzuya göre bu aşamada 1 adet bulyon ekleyebilirsiniz ama şart da değil tercihinize kalmış.")
                )
        );

        soup.add(
                new SubCategoryModel(
                        "Şehriyeli Tavuk Suyu Çorbası",
                        R.drawable.sehriyeli_tavuk,
                        new SoupDetailModel(R.drawable.sehriyeli_tavuk,
                                "1 kase şehriyeli tavuk suyu çorba yaklaşık olarak 110 kaloridir.",
                                "4-6 kişilik",
                                "1 tavuk incik veya 2 tavuk but\n" +
                                        "5 bardak tavuk suyu\n" +
                                        "1 dolu yemek kaşığı un\n" +
                                        "1. 5 yemek kaşığı margarin veya tereyağı\n" +
                                        "2 yemek kaşığı sıvı yağ\n" +
                                        "1. 5 kahve fincanı tel şehriye\n" +
                                        "Tuz\n" +
                                        "Karabiber",
                                "İstediğiniz tavuk etini kullanabilirsiniz fakat kemikli olsun ki lezzeti iyice suyuna geçsin. Önce tavuk etini tuz ilave etmeden haşlayalım. 1 litreden fazla su ekleyelim. Suyundan 5 bardak alıp çorba için kullanacağız.\n" +
                                        "Tavuk pişince onu bir tabağa çıkaralım. Soğuyunca küçük parçalara ayıralım.\n" +
                                        "Şimdi çorbamızı hazırlayalım. Bir tencereye margarin ve sıvı yağını koyalım. Margarin eriyince unu ekleyelim. Güzelce kavuralım. Un hazır olunca kabarıyor zaten.\n" +
                                        "Üzerine 5 bardak tavuk suyu ilave edelim. Ufalanmış tavuk etlerini ekleyelim.\n" +
                                        "Kaynayınca şehriyeleri katalım. 10-15 dakika kadar şehriyeler pişene kadar kaynatalım.\n" +
                                        "Tuzunu ekleyelim. Tencerenin kapağını kapatalım ve biraz dinlendirelim. Şehriyeler iyice kıvamını bulsun.\n" +
                                        "Servis için tabağa alalım ve karabiber serpelim.\n" +
                                        "Afiyet şifa olsun.\n")
                )
        );
        return soup;
    }

    public ArrayList<SubCategoryModel> getSaladList() {
        ArrayList<SubCategoryModel> salad = new ArrayList<>();

        salad.add(
                new SubCategoryModel(
                        "Arpa Şehriye Salatası",
                        R.drawable.arpa_sehriye_salatasi,
                        new SoupDetailModel(R.drawable.arpa_sehriye_salatasi,
                                "1 kase arpa şehriye salatası yaklaşık olarak 260 kaloridir.",
                                "6-8 kişilik",
                                "2 su bardağı arpa şehriye\n" +
                                        "2 yemek kaşığı sıvı yağ (şehriyeleri pişirmek için)\n" +
                                        "3 su bardağı su ve tuz\n" +
                                        "4-5 dal taze soğan\n" +
                                        "Yarım demet maydanoz\n" +
                                        "Bir tutam dereotu\n" +
                                        "2-3 adet közlenmiş kırmızı biber\n" +
                                        "1 kutu mısır konservesi\n" +
                                        "4-5 adet kornişon turşu\n" +
                                        "Tuz, limon suyu, zeytinyağı",
                                "Öncelikle 2 yemek kaşığı sıvı yağda arpa şehriyeleri hafif kavurun.\n" +
                                        "Sıcak su ve az tuz ekleyerek pilav pişirir gibi pişirin.\n" +
                                        "Pişen pilavı soğumaya bırakın.\n" +
                                        "Tüm yeşillikleri ince ince kıyın.\n" +
                                        "Kırmızı biberi ve turşuları da ufak ufak doğrayın.\n" +
                                        "Soğuyan pilavı tüm malzemelerle birlikte harmanlayın. Afiyet olsun.")
                )
        );

        salad.add(
                new SubCategoryModel(
                        "Mercimek Köftesi",
                        R.drawable.mercimek_koftesi,
                        new SoupDetailModel(R.drawable.mercimek_koftesi,
                                "1 adet mercimek köftesi, yaklaşık olarak 39 kaloridir.",
                                "4-6 kişilik",
                                "1 kase haşlanmış yeşil mercimek (1 su bardağı haşlanmamış mercimek)\n" +
                                        "1 orta boy kapya biber\n" +
                                        "6-7 adet kornişon turşu\n" +
                                        "2 tutam maydanoz\n" +
                                        "1 tutam dereotu\n" +
                                        "2 dal taze soğan (isteğe bağlı)\n" +
                                        "3-4 yemek kaşığı zeytinyağı\n" +
                                        "1 adet limon suyu\n" +
                                        "yarım tatlı kaşığı tuz",
                                "Haşlanmış mercimeği bir kaba alalım. Eğer hazırda haşlanmış mercimeğiniz yoksa 1 su bardağı mercimeği haşlayarak 1 kase haşlanmış mercimek elde edebilirsiniz.\n" +
                                        "Kapya biberi ve kornişon turşuları minik minik doğrayıp mercimeklerin üzerine ekleyelim.\n" +
                                        "Dereotu ve maydanozu da doğrayalım. İnce kıydığımız yeşillikleri de diğer malzemelerin üzerine ekleyelim.\n" +
                                        "Zeytinyağı, limon ve tuzunu ekleyip iyice karıştıralım. Dilediğiniz gibi servis yapın. Afiyet şifa olsun.")
                )
        );

        salad.add(
                new SubCategoryModel(
                        "Haydari",
                        R.drawable.haydari,
                        new SoupDetailModel(R.drawable.haydari,
                                "Orta büyüklükte 1 kase haydari yaklaşık olarak 300 kaloridir.",
                                "2-4 kişilik",
                                "6 yemek kaşığı süzme yoğurt\n" +
                                        "1 tutam dereotu\n" +
                                        "1 yemek kaşığı tereyağı\n" +
                                        "1 tatlı kaşığı nane\n" +
                                        "1 çay kaşığı tuz\n" +
                                        "1 dilim beyaz peynir\n" +
                                        "1 diş sarımsak",
                                "İlk olarak tavaya tereyağını alarak kızdıralım. Bu aşamada cağı çok yüksek ateşte açıp yağı yakmamaya dikkat edelim.\n" +
                                        "Daha sonra naneyi ekleyerek 1-2 tur karıştıralım ve ocaktan alalım.\n" +
                                        "Karıştırma kabına süzme yoğurdu alalım.\n" +
                                        "Diğer taraftan beyaz peyniri çatalla ezerek ufalayalım, dereotunu ince ince kıyalım.\n" +
                                        "Süzme yoğurdun üzerine peynir ve dereotunu ilave edelim.\n" +
                                        "Son olarak naneli tereyağı, ezilmiş sarımsak, tuzu ekleyerek karıştıralım.\n" +
                                        "Haydari mezesini servis tabağına alarak üzerini zeytinyağı ve dereotu ile süsleyelim.\n" +
                                        "Haydari servise hazır. Afiyet olsun :)")
                ))
        ;

        salad.add(
                new SubCategoryModel(
                        "Humus",
                        R.drawable.humus,
                        new SoupDetailModel(R.drawable.humus,
                                "Orta büyüklükte 1 porsiyon humus yaklaşık olarak 339 kaloridir.",
                                "7-8 kişilik",
                                "500 gram koçbaşı nohut (Haşlanmış, kabukları alınmış hali ile yaklaşık 2-3 su bardağı)\n" +
                                        "1,5 çay bardağı ılık su\n" +
                                        "\n" +
                                        "Humus için;\n" +
                                        "1 çay bardağı ılık su\n" +
                                        "1/2 (yarım) çay bardağı tahin\n" +
                                        "1 çay kaşığı kimyon\n" +
                                        "4 çorba kaşığı limon suyu\n" +
                                        "3-4 diş sarımsak (ezilmiş)\n" +
                                        "Tuz\n" +
                                        "\n" +
                                        "Süslemek için:\n" +
                                        "Kimyon\n" +
                                        "Kırmızı pul biber\n" +
                                        "Sumak\n" +
                                        "Kıyılmış maydanoz\n" +
                                        "Arzuya göre salatalık turşusu ve turp",
                                "Nohutlarınızı bir gece önceden ıslatın, düdüklü tencereye alın.\n" +
                                        "Bir taşım kaynatın, çıkan köpüklü suyu dökün.\n" +
                                        "Tekrar sıcak su ekleyip düdüklü tencerenizde tam pişirin(hafif çatlasın ve kabukları kolay çıkabilecek hal alsın. Yaklaşık 15-20 dakika)\n" +
                                        "Nohutların kabuklarını temizleyin, ölçüdeki nohudu elde edin..\n" +
                                        "Kabuksuz nohutları,1,5 çay bardağı su ile orta derinlikte bir tencereye alın\n" +
                                        "Tekrar ocağa koyun, tahta kaşıkla ezerek suyunu hafifçe çektirin. Ilınmış nohudunuzu el püre yapıcınızdan geçirerek pürüzsüz hal almasını sağlayın.\n" +
                                        "Nohut katı bir hal alacak. (Bu aşamada derin dondurucuda saklayabilirsiniz)\n" +
                                        "2. kez kısık ateşe aldığınız nohuta 1 çay bardağı ılık su ekleyin.\n" +
                                        "Yumuşatın, sürekli karıştırarak açılmasını sağlayın(1 dakika). Ateşten aldığınız sıcak nohuta tahin, limon suyu, ezilmiş sarımsak, tuz ve kimyonu ekleyin. Çok iyi karıştırın.\n" +
                                        "Servis tabağınıza aldığınız ve yaydığınız humusu kimyon, kırmızı pul biber, sumak, kıyılmış maydanoz ile süsleyin.\n" +
                                        "Üzerine incecik zeytinyağı gezdirin.\n" +
                                        "Humus mezesini ılık servis yapın.")
                )
        );

        salad.add(
                new SubCategoryModel(
                        "Kısır",
                        R.drawable.kisir,
                        new SoupDetailModel(R.drawable.kisir,
                                "Orta büyüklükte 1 kase kısır yaklaşık olarak 178 kaloridir.",
                                "4-6 kişilik",
                                "1 büyük su bardağı ince bulgur\n" +
                                        "Yarım su sıcak su (bulguru ıslatmak için)\n" +
                                        "3 yaprak marul\n" +
                                        "1 demet maydanoz\n" +
                                        "3 adet taze soğan\n" +
                                        "1 yemek kaşığı zeytinyağı (soğanı kavurmak için)\n" +
                                        "1 küçük salatalık\n" +
                                        "5 tane çeri domates\n" +
                                        "1 tane orta boy sivri biber\n" +
                                        "Yarım çay bardağı zeytinyağı (az gelirse ekleme yapın)\n" +
                                        "1 yemek kaşığı nar ekşisi\n" +
                                        "Karabiber\n" +
                                        "Pul biber\n" +
                                        "Kimyon\n" +
                                        "Tuz\n" +
                                        "1 yemek kaşığı biber salçası\n" +
                                        "1 tatlı kaşığı domates salçası\n" +
                                        "1 diş sarımsak\n" +
                                        "1 küçük soğan",
                                "Öncelikle bulguru sıcak suyla bir miktar ıslatıyoruz.\n" +
                                        "Ama çok az su ile, sadece suyu döktüğümüz anda hemen kendisini çekecek kadar ve kapağını kapatıp 5 dakika demlendiriyoruz.\n" +
                                        "Küçük bir tavada kuru soğanı ve sarımsağı, 1 yemek kaşığı zeytinyağı ile çok az kavurup salçasını ilave ediyoruz.\n" +
                                        "2 dakika daha kavurup ocağı kapatıyoruz.\n" +
                                        "Bulgurun içine döküyoruz ve bütün baharatları, nar ekşisini ve 1 çay bardağı zeytinyağını da ilave edip iyice harmanlıyoruz.\n" +
                                        "İnce ince doğradığımız yeşillikleri ilave edip iyice birbirine yedirdikten sonra en son domateslerimizi ilave edip karıştırıyoruz ve servis yapıyoruz. Afiyet olsun:)")
                )
        );
        return salad;
    }

    public ArrayList<SubCategoryModel> getLegumeList() {
        ArrayList<SubCategoryModel> legume = new ArrayList<>();
        legume.add(
                new SubCategoryModel(
                        "Fellah Köfte",
                        R.drawable.fellah_kofte,
                        new SoupDetailModel(R.drawable.fellah_kofte,
                                "1 porsiyon ( 277g) fellah köftesi 331 kaloridir.",
                                "6-8 kişilik",
                                "2 su bardağı köftelik bulgur\n" +
                                        "2 su bardağı sıcak su\n" +
                                        "1 su bardağı irmik\n" +
                                        "3 yemek kaşığı un\n" +
                                        "1 yemek kaşığı domates salçası\n" +
                                        "1 yemek kaşığı biber salçası\n" +
                                        "1 tatlı kaşığı tuz\n" +
                                        "Yarım su bardağı sıcak su\n" +
                                        "1 adet yumurta\n" +
                                        "1 tatlı kaşığı kimyon\n" +
                                        "\n" +
                                        "Haşlamak için;\n" +
                                        "Su\n" +
                                        "1 çay kaşığı limon tuzu\n" +
                                        "1 çay kaşığı tuz\n" +
                                        "\n" +
                                        "Sosu için;\n" +
                                        "1,5 çay bardağı zeytinyağı\n" +
                                        "5-6 diş sarımsak\n" +
                                        "2 yemek kaşığı biber salçası\n" +
                                        "4 adet domates rendesi\n" +
                                        "Tuz\n" +
                                        "Maydanoz",
                                "Köfte harcımız için uygun bir kap içerisine bulgurumuzu alalım ve üzerine sıcak su ekleyerek üzerini streçleyelim, 10 dakika kadar dinlenmeye bırakalım.\n" +
                                        "Sürenin sonunda şişen bulgurlarımızın üzerini açalım, tahta kaşık ile karıştıralım.\n" +
                                        "Üzerine irmik, un, domates salçası, biber salçası ve  tuzu da ekleyerek hamurumuzu yoğurmaya başlayalım. Bu aşamada ara ara sıcak su ekleyelim. Bu şekilde daha kolay yoğurabileceksiniz.\n" +
                                        "Malzemelerin güzelce karıştığından ve hamurun yeterince soğuduğundan emin olduktan sonra üzerine yumurtamızı ekleyelim.\n" +
                                        "Kimyonu da ekledikten sonra hamurumuzu son kez yoğuralım.\n" +
                                        "Sıra geldi köftelerimizi şekillendirmeye. Bunun için öncelikle yanımıza kase ile su alalım. Ardından parmak uçlarımızı su ile ıslatarak harcımızdan küçük parçalar kopartarak top şekline getirelim.\n" +
                                        "Serçe parmağımız ile hamurumuzun üzerine bastıralım ve unladığımız tepsimize alalım. Harcımız bitene kadar bu işleme devam edelim.\n" +
                                        "Köftelerimizi haşlamak için tencereye kaynayan suyu alalım, içerisine limon tuzu ve tuzu ekleyelim.\n" +
                                        "Ardından şekillendirdiğimiz köftelerimizi de tenceremize alarak ara ara karıştıralım, yaklaşık 5 dakika pişirelim.\n" +
                                        "Haşlanan köftelerimizi kevgir yardımı ile servis tabağımıza alalım.\n" +
                                        "Domates sosu için tavamıza zeytinyağını alalım, ince kıyılmış sarımsaklarımızı da ekleyerek kokusu çıkana kadar kavuralım.\n" +
                                        "Üzerine salçamızı da ilave ederek sarımsaklarla birlikte kavurmaya devam edelim.\n" +
                                        "Rendelediğimiz domateslerimizi de tavamıza alalım ve kavurmaya devam edelim.\n" +
                                        "Hazır olan sosumuzun altını kapatmadan önce tuz ekleyip karıştırarak ocağı kapatalım.\n" +
                                        "Son olarak ince kıyılmış maydanozları da ekleyelim ve karıştıralım.\n" +
                                        "Hazırladığımız fellah köftelerimizi de sosumuzun içerisine alalım ve sosa bulanması için karıştıralım.\n" +
                                        "Bol soslu fellah köftem servise hazır. Deneyeceklere şimdiden afiyet olsun.")
                )
        );

        legume.add(
                new SubCategoryModel(
                        "İçli Köfte",
                        R.drawable.icli_kofte,
                        new SoupDetailModel(R.drawable.icli_kofte,
                                "Orta büyüklükte bir içli köfte yaklaşık 349 kaloridir.",
                                "1-2 kişilik",
                                "Dışı için;\n" +
                                        "1.5 su bardağı ince köftelik bulgur\n" +
                                        "1 çay bardağı irmik\n" +
                                        "1 tatlı kaşığı toz kırmızı biber\n" +
                                        "1 tatlı kaşığı biber salçası\n" +
                                        "1 su bardağından biraz az un\n" +
                                        "1 çay kaşığı tuz\n" +
                                        "1 su bardağı soğuk su\n" +
                                        "\n" +
                                        "İçi için;\n" +
                                        "2 yemek kaşığı sıvı yağ\n" +
                                        "300 gr kıyma\n" +
                                        "3 orta boy soğan\n" +
                                        "Yarım tatlı kaşığı salça\n" +
                                        "Yarım demek maydanoz\n" +
                                        "1 küçük çay bardağı küçük parçalı ceviz (isteğe bağlı)\n" +
                                        "Tuz\n" +
                                        "Pul biber\n" +
                                        "Karabiber (baharatlar ve tuz isteğe göre ayarlanabilir.)\n" +
                                        "\n" +
                                        "Kızartmak için;\n" +
                                        "Sıvı yağ",
                                "Soğanlar ince ince doğranır. Tavaya sıvı yağ alınıp soğanlar eklenir ve pembeleşinceye kadar kavrulur.\n" +
                                        "Kavrulan soğanlara Kıyma eklenir suyunu çekinceye kadar kısık ateşte kavrulur.\n" +
                                        "Daha sonra salça eklenir 3 dk daha kavrulur. Biraz su eklenir tekrar (yumuşak kalması gerekiyor kuru olmamalı).\n" +
                                        "Baharatlar, tuz, ceviz ve ince kıyılmış maydanoz eklenip ocağın altı kapatılır. Soğumaya bırakılır.\n" +
                                        "İnce bulgur 1 bardak soğuk su ile kısır yapar gibi ıslatılır.\n" +
                                        "Suyu çekilince irmik salça baharatlar tuz eklenip 15 dk boyunca azar azar suyu eklenip iyice yoğurulur.\n" +
                                        "Daha sonra un eklenir 5 dk daha yoğurulur. Ele alınıp yuvarlandığında dağılmıyorsa tamamdır. Ele yapışabilir. Eller iyice yıkanır tekrar hamur ele alındığında yapışmaz.\n" +
                                        "Cevizden biraz daha büyük parçalar alınıp baş parmak ile ara ara su alınarak içi ince bir şekilde açılır. İç koyulur ve yukarı doğru limon şeklinde uzatılır. Hepsine aynı işlem uygulanır.\n" +
                                        "Aşamaları çekemedim çünkü ellerim hamurlu iken fotoğraf makinesini tutamadım.\n" +
                                        "Biten içli köfteler kızgın 1 bardak sıvı yağda kızartılır.")
                )
        );

        legume.add(
                new SubCategoryModel(
                        "Kuru Fasulye",
                        R.drawable.kuru_fasulye,
                        new SoupDetailModel(R.drawable.kuru_fasulye,
                                "Orta büyüklükte 1 kase kuru fasulye yaklaşık olarak 267 kaloridir.",
                                "6-8 kişilik",
                                "2 su bardağı kuru fasulye\n" +
                                        "1 adet kuru soğan\n" +
                                        "1 adet kırmızı süs biberi\n" +
                                        "1 yemek kaşığı domates salçası\n" +
                                        "1 yemek kaşığı biber salçası\n" +
                                        "4 yemek kaşığı sıvı yağ\n" +
                                        "1 çay kaşığı karabiber\n" +
                                        "1 çay kaşığı kırmızı toz biber\n" +
                                        "1 çay kaşığı kimyon",
                                "Kuru fasulyeler 1 gece önceden suya ıslanır. Islama suyu dökülüp yeni su eklenerek haşlanır.\n" +
                                        "Minik küpler halinde doğranmış kuru soğan ve biber sıvı yağda pembeleşene kadar kavrulur.\n" +
                                        "Üzerine salçalar eklenerek karıştırılır, haşlanmış kuru fasulyeler de eklenerek kavrulmaya devam edilir (etsiz kuru fasulyede su eklenmeden önce bolca kavurmak gerekir.)\n" +
                                        "Yaklaşık 3-4 dk. kavrulduktan sonra üzerini 3 parmak geçecek kadar su eklenir baharatlar da eklenerek harlı ateşte 5 dk. kadar pişirilip altı kısılır.\n" +
                                        "Fasulyeler yumuşayana kadar pişirilir (fasulyenin cinsine göre değişiklik gösterir.). Afiyet olsun.")
                )
        );

        legume.add(
                new SubCategoryModel(
                        "Keşkek",
                        R.drawable.keskek,
                        new SoupDetailModel(R.drawable.keskek,
                                "1 porsiyon keşkek yaklaşık olarak 481 kaloridir.",
                                "12-14 kişilik",
                                "1 kg aşurelik bütün buğday\n" +
                                        "1 su bardağı nohut\n" +
                                        "800 gram et (tavuk eti koyarsanız 3 adet but)\n" +
                                        "Tuz\n" +
                                        "\n" +
                                        "Sosu için;\n" +
                                        "Tereyağı\n" +
                                        "Salça",
                                "Çömleğin en altına eti yerleştirin.\n" +
                                        "Üzerine yıkamış olduğunuz nohut, buğdayı ve 1 çorba kaşığı tuzu ekleyin.\n" +
                                        "Hazırladığımız malzemenin üzerini 10-15 cm geçecek kadar suyu ekleyin.\n" +
                                        "Çömleği odun fırınına (ekmek fırını) akşamdan koyulur ve sabaha kadar fırında bekletilir.\n" +
                                        "Fırından alınan keşkek büyük tahta kaşık yardımı ile iyice ezilir (tavuk koymuşsanız kemiklerini almayı unutmayın :) )\n" +
                                        "Tabaklara alındıktan sonra üzerine salçalı sos dökülerek servis yapılır. (Aynı şekilde düdüklü tencerede de yapabilirsiniz kısık ateşte 2 saatte pişer)")
                )
        );

        legume.add(
                new SubCategoryModel(
                        "Barbunya Pilaki",
                        R.drawable.barbunya_pilaki,
                        new SoupDetailModel(R.drawable.barbunya_pilaki,
                                "1 porsiyon zeytinyağlı barbunya pilaki yaklaşık olarak 415 kaloridir.",
                                "2-4 kişilik",
                                "500 gram taze barbunya\n" +
                                        "Yarım su bardağı zeytinyağı\n" +
                                        "1 adet soğan\n" +
                                        "1 adet orta boy patates\n" +
                                        "1 adet havuç\n" +
                                        "1 yemek kaşığı domates salçası\n" +
                                        "1 çay kaşığı şeker\n" +
                                        "1 adet domates\n" +
                                        "2-3 diş sarımsak\n" +
                                        "Tuz",
                                "İlk olarak, barbunyaları bir tencereye alarak  üzerini geçecek kadar su ekleyin ve 10 dakika kadar kaynatarak çıkan suyu süzün (barbunyalar pişsin ama dağılmasına izin vermeyin).\n" +
                                        "Diğer yandan soğanları yemeklik doğrayın ve tencerede yarım su bardağı su ile pişirmeye başlayın.\n" +
                                        "Soğanlar yumuşadıktan sonra zeytinyağını ilave ederek; önce salçayı, domatesi sonra da küp küp doğradığınız patatesleri, ince halkalar halinde doğradığınız havucu ve ince kestiğiniz sarımsakları ilave edin.\n" +
                                        "2 dakika kadar yağda çevirdikten sonra şeker, tuz ve 1 su bardağı kadar kaynar suyu ilave edin ve 10 dakika kadar patates ve havuçları pişirin.\n" +
                                        "Daha sonra barbunyaları ilave ederek, suyu kontrol edin. Çok azalmışsa, bir miktar daha kaynar su ilave edebilirsiniz.\n" +
                                        "Patatesler ve havuçlar pişene kadar tencerenin kapağı kapalı ve kısık ateşte kaynatın. Suyunu kontrol etmeyi unutmayın ki, tencerenin tabanı tutmasın.\n" +
                                        "Yemeğiniz piştikten sonra ocaktan alıp, soğuduktan sonra servis edebilirsiniz.")
                )
        );
        return legume;
    }

    public ArrayList<SubCategoryModel> getVegetableList() {
        ArrayList<SubCategoryModel> vegetable = new ArrayList<>();
        vegetable.add(
                new SubCategoryModel(
                        "Biber Dolması",
                        R.drawable.biber_dolmasi,
                        new SoupDetailModel(R.drawable.biber_dolmasi,
                                "Orta büyüklükteki 1 adet biber dolması yaklaşık olarak 132 kaloridir.",
                                "4-6 kişilik",
                                "Yarım kg dolmalık biber\n" +
                                        "Her biber için 1 yemek kaşığı pirinç\n" +
                                        "1 adet soğan\n" +
                                        "1 yemek kaşığı salça\n" +
                                        "Maydanoz\n" +
                                        "2-3 adet domates\n" +
                                        "Karabiber\n" +
                                        "Tuz\n" +
                                        "Nane\n" +
                                        "Sıvı yağ-Zeytinyağı",
                                "Dolmalık biberlerimizi temizleyelim.\n" +
                                        "Soğanları, domatesi küçük küçük doğrayalım.\n" +
                                        "Domatesin kenarlarını biberlerin üstünü kapatmak için kullanacağız o yüzden önce kapatmak için kullanacaklarımızı kesersek daha iyi olur.\n" +
                                        "İçini yemek harcında kullanabiliriz.\n" +
                                        "Bir kaba hazırladığımız soğan, pirinç, salça, maydanoz, domates, karabiber, tuz, nane ve çok az sıvı yağı ekleyip iyice karıştıralım.\n" +
                                        "Daha sonra bu harcı biberlere dolduralım.\n" +
                                        "Harcı doldurduğumuz biberleri, tencereye dizelim.\n" +
                                        "Harcı yaptığımız kabın içine sıcak su koyalım.\n" +
                                        "O artık göz kararı olacak biberlerin yarısına kadar gelecek şekilde kabın içine koyduğumuz suya 1 yemek kaşığı salça ekleyelim ve eritelim.\n" +
                                        "Bu karışımı biberlerin üstüne gelmeyecek şekilde tencereye, biberlerin yarısına gelene kadar dökelim.\n" +
                                        "Kestiğimiz domateslerle biberlerin üstünü kapatalım.\n" +
                                        "Daha sonra biberlerin üstüne çok az sıvı yağ veya zeytinyağı gezdirelim.\n" +
                                        "Kısık ateşte yemeğimizi pişirelim.")
                )
        );

        vegetable.add(
                new SubCategoryModel(
                        "Yaprak Sarması",
                        R.drawable.yaprak_sarmasi,
                        new SoupDetailModel(R.drawable.yaprak_sarmasi,
                                "1 adet yaprak sarması yaklaşık olarak 32 kaloridir.",
                                "6-8 kişilik",
                                "500 gram tokat yaprağı (salamura)\n" +
                                        "1 adet limon\n" +
                                        "Zeytinyağı\n" +
                                        "\n" +
                                        "İç harcı;\n" +
                                        "2 orta boy kuru soğan\n" +
                                        "1,5 su bardağı pirinç\n" +
                                        "Maydanoz\n" +
                                        "1 yemek kaşığı salça\n" +
                                        "Karabiber\n" +
                                        "Kırmızı pul biber\n" +
                                        "Kimyon\n" +
                                        "Nane\n" +
                                        "Tuz\n" +
                                        "2 yemek kaşığı sıvı yağ",
                                "Öncelikle salamura yapraklar 2-3 dakika sıcak suda bekletilir, yıkanır ve süzgece alınır.\n" +
                                        "Geniş bir kabın içerisine soğanlar rendelenir.\n" +
                                        "Üzerine zeytinyağı dökülür.\n" +
                                        "Pirinç yıkanarak  kabın içerisine eklenir.\n" +
                                        "Baharatlar, salça ve tuzu da ilave edildikten sonra ince kıyılmış maydanozu da eklenerek karıştırılır.(çiğden bir iç harç olacak)\n" +
                                        "Yaprağın geniş kısmına iç harçtan konulur ve rulo gibi iki yanlardan kapatarak sarılır. Bu işleme yaprak bitene kadar devam edilir.\n" +
                                        "Sardığımız yaprakların üzerine zeytinyağı ve limon dilimleri ekleyip yaklaşık 5-6 su bardağı kadar da sıcak su ilave edilerek kısık ateşte pişirilir.(üzerine sarmalar dağılmasın diye tencere kapağından biraz küçük ebatta bir kase kapatabilirsiniz.)\n" +
                                        "Afiyet olsun…")
                )
        );

        vegetable.add(
                new SubCategoryModel(
                        "Patatesli Patlıcan Oturtma",
                        R.drawable.patatesli_patlican,
                        new SoupDetailModel(R.drawable.patatesli_patlican,
                                "1 porsiyon patatesli patlıcan oturtma yaklaşık olarak 326 kaloridir.",
                                "4-6 kişilik",
                                "3 adet patlıcan\n" +
                                        "3 adet patates\n" +
                                        "1 adet soğan\n" +
                                        "3 diş sarımsak\n" +
                                        "200 gram kıyma\n" +
                                        "1 tatlı kaşığı domates salçası\n" +
                                        "3-4 adet domates\n" +
                                        "1 adet yeşil biber\n" +
                                        "1 avuç doğranmış maydanoz\n" +
                                        "4-5 yemek kaşığı sıvı yağ\n" +
                                        "Tuz\n" +
                                        "Karabiber\n" +
                                        "2 su bardağı sıcak su",
                                "Önce patlıcanlar alacalı soyulup yuvarlak dilimler halinde doğranır ve tuzlu suda en az 20 dakika bekletilir.\n" +
                                        "Ardından patatesler soyulur ve onlarda yuvarlak halkalar halinde doğranır.\n" +
                                        "Yıkanıp suyu süzülen patlıcan ve patatesler derin ve geniş bir kapta az tuz ve iki yemek kaşığı sıvı yağ ile iyice ovulur.\n" +
                                        "Fırın tepsisine dizilip üzerleri hafif kızarana kadar 180 derece fırında pişirilir ( pişirirken bir on dakika sonra sebzeleri maşayla ters çevirirseniz daha güzel sonuç alırsınız ).\n" +
                                        "Pişen patlıcan ve patatesler daha küçük bir fırın kabına, alta patates üste patlıcan gelecek şekilde dizilir.\n" +
                                        "Bir tavada yemeklik doğranan soğan 2-3 yemek kaşığı sıvı yağda kavrulur.\n" +
                                        "Ardından kıyma ilave edilir ve kavrulmaya devam edilir.\n" +
                                        "Sarımsaklar doğranıp ilave edilir.\n" +
                                        "1 tatlı kaşığı salça konup biraz daha kavrulduktan sonra iki adet domates rendelenip konur ve iki üç dakika pişirilir.\n" +
                                        "İki su bardağı sıcak su ilave edildikten sonra maydanoz, tuz ve karabiber konup bir beş dakika kadar pişirilip patlıcan ve patateslerin üzerine eşit şekilde dökülür.\n" +
                                        "Üzeri arzuya göre domates ve biberle süslenip 180 derece fırında pişirilir.")
                )
        );

        vegetable.add(
                new SubCategoryModel(
                        "Taze Fasulye",
                        R.drawable.taze_fasulye,
                        new SoupDetailModel(R.drawable.taze_fasulye,
                                "Orta porsiyon taze fasulye yemeği yaklaşık olarak 31,3 kaloridir.",
                                "4-6 kişilik",
                                "600 gr taze yeşil fasulye (çalı fasulye kullandım)\n" +
                                        "2 adet domates\n" +
                                        "1 adet soğan\n" +
                                        "Yarım çay kaşığı pul biber\n" +
                                        "Yarım çay kaşığı karabiber\n" +
                                        "2 çay kaşığı tuz\n" +
                                        "Yarım çay bardağı zeytinyağı (veya sıvı yağ)\n" +
                                        "1,5 yemek kaşığı domates salçası\n" +
                                        "2 su bardağı sıcak su",
                                "Yeşil fasulye yemeği için öncelikle zeytinyağında yemeklik doğranmış soğanı pembeleşinceye kadar kavuralım.\n" +
                                        "Ardından salça, doğranmış domatesler ve baharatları da ekleyip bir iki dakika kavuralım.\n" +
                                        "Yıkayıp ortadan ikiye kestiğimiz ve dilimlediğimiz fasulyeleri ekleyip kavurmaya devam edelim.\n" +
                                        "Fasulyeler renk değiştirip yumuşamaya başlayıncaya kadar kavuralım. Fasulyenin hızlı pişmesi için suyunu eklemeden iyice kavurmak önemli. Pişme süresi fasulyenin cinsine göre değişir, çatal kolay batıyorsa ve gıcırdamıyorsa yumuşamış demektir :) Ben çalı fasulye kullandım bu arada, enli bir fasulye olduğu için ortadan da dikine kesiyorum, siz nasıl tercih ederseniz. Kavururken tencereyi kısık ateşe alıp kapağı kapatmayı unutmayın. Yeterince taze güzel bir fasulye ise su eklemeye gerek kalmadan kendi suyu ile kavrulurken bile pişebilir.\n" +
                                        "Tuzunu ayarlayalım, yeşil fasulye yeterince kavrulunca sıcak suyunu ekleyip pişmeye bırakalım.\n" +
                                        "Arada bir fasulye alıp ısırarak pişip pişmediğini kontrol edebilirsiniz.\n" +
                                        "Ocağı kapatınca 15-20 dk ilk sıcaklığının çıkmasını bekleyelim. Taze fasulye yemeğini sıcak olarak da ılık olarak da servis edebilirsiniz. Zeytinyağlı gibi soğuk servis etmek isterseniz salça eklemeden aynı şekilde pişirebilirsiniz. Şimdiden afiyet olsun.")
                )
        );

        vegetable.add(
                new SubCategoryModel(
                        "Etli Bezelye",
                        R.drawable.etli_bezelye,
                        new SoupDetailModel(R.drawable.etli_bezelye,
                                "1 porsiyon etli bezelye yaklaşık olarak 360 kaloridir.",
                                "6-8 kişilik",
                                "Yarım kilogram bezelye\n" +
                                        "2-3 tane patates\n" +
                                        "1 adet havuç\n" +
                                        "250 gr kuşbaşı dana eti\n" +
                                        "1 adet kuru soğan\n" +
                                        "5 çorba kaşığı sıvı yağ\n" +
                                        "2 çorba kaşığı domates salçası\n" +
                                        "Tuz\n" +
                                        "1 tatlı kaşığı kırmızı toz biber\n" +
                                        "1 çay kaşığı karabiber\n" +
                                        "4 su bardağı sıcak su",
                                "Soğan soyulup, yemeklik doğranır.\n" +
                                        "Sıvı yağ tencereye alınıp soğanlar kavrulur.\n" +
                                        "Soğanlar pembeleşince kuşbaşı doğranmış dana eti eklenerek kavrulmaya devam edilir.\n" +
                                        "Ardından soyulup küp küp doğranmış patatesleri ve havucu tencere ekleyin.\n" +
                                        "Salçasını, tuzunu ve baharatlarını ilave edip karıştırın.\n" +
                                        "Bezelyeleri ilave edin.\n" +
                                        "Son olarak 4 su bardağı kadar sıcak suyu da ekleyerek kaynamaya bırakın.\n" +
                                        "Kaynamaya başladıktan 5 dk sonra kısık ateşte 20-25 dk pişirin.\n" +
                                        "Patateslerin piştiğini çatalla kontrol edip altını kapatabilirsiniz. Afiyet olsun…")
                )
        );
        return vegetable;
    }

    public ArrayList<SubCategoryModel> getMeatList() {
        ArrayList<SubCategoryModel> meat = new ArrayList<>();
        meat.add(
                new SubCategoryModel(
                        "Kadınbudu Köfte",
                        R.drawable.kadinbudu_kofte,
                        new SoupDetailModel(R.drawable.kadinbudu_kofte,
                                "1 adet kadınbudu köfte yaklaşık olarak 203 kaloridir.",
                                "4-6 kişilik",
                                "Köftesi için;\n" +
                                        "600g köftelik kıyma (az yağlı)\n" +
                                        "1 adet iri kuru soğan\n" +
                                        "1 yumurta\n" +
                                        "1 kahve fincanı pirinç\n" +
                                        "1 çay kaşığı kimyon\n" +
                                        "1/2 (yarım) çay kaşığı karabiber\n" +
                                        "1 tatlı kaşığı tuz\n" +
                                        "\n" +
                                        "Köfteleri bulamak için;\n" +
                                        "1/2 (yarım) çay bardağı galeta unu\n" +
                                        "1/2 (yarım) çay bardağı buğday unu\n" +
                                        "1 yumurta\n" +
                                        "\n" +
                                        "Kızartmak için;\n" +
                                        "2-3 su bardağı sıvı yağ (ay çiçek yağı)",
                                "Kıymayı ikiye bölün. Yanmaz tavanıza 2-3 kaşık su ve kıymayı alın, kavurun.\n" +
                                        "Kıymayı ateşten almaya yakın rendelenmiş ve suyu sıkılmış soğanlarınızı ekleyin.\n" +
                                        "1 dk. kadar kavurup sonrasında kıymayı soğumaya bırakın.\n" +
                                        "Diğer yandan pirincinizi haşlayın (çok haşlamayın zira yoğurma esnasında parçalanmasın).\n" +
                                        "Yoğurma kabına soğumuş kıyma, çiğ kıyma, haşlanıp süzülmüş pirinci alın.\n" +
                                        "Yumurtayı ve baharatları ekleyin.\n" +
                                        "Köfte harcını yoğurun.\n" +
                                        "En az 2 saat kendini çekmesi ve dinlenmesi için buzdolabında bekletin.\n" +
                                        "Kızartma aşamasında, yağı derin kızartma tenceresine alın.\n" +
                                        "Köftelere iri oval şeklini verin.\n" +
                                        "Köfteleri, önce un ve galeta unu ile harmanlanmış derin kasede karışıma bulayın, ardından çırpılmış yumurtaya…\n" +
                                        "Kızgın yağda kızartın.\n" +
                                        "Afiyet olsun.")
                )
        );

        meat.add(
                new SubCategoryModel(
                        "Beyti Kebabı",
                        R.drawable.beyti_kebabi,
                        new SoupDetailModel(R.drawable.beyti_kebabi,
                                "1 dilim beyti kebabı yaklaşık olarak 97,8 kaloridir.",
                                "4-6 kişilik",
                                "2 adet yufka\n" +
                                        "\n" +
                                        "Sosu İçin;\n" +
                                        "4 adet rendelenmiş domates\n" +
                                        "2 yemek kaşığı tereyağı\n" +
                                        "Karabiber, toz kırmızı biber\n" +
                                        "Tuz\n" +
                                        "\n" +
                                        "Köftesi İçin;\n" +
                                        "400 g kıyma\n" +
                                        "1 adet yumurta\n" +
                                        "1 diş sarımsak\n" +
                                        "1 adet soğan\n" +
                                        "1/2 (yarım) çay bardağı galeta unu\n" +
                                        "Karabiber, pul biber\n" +
                                        "Tuz\n" +
                                        "\n" +
                                        "Servis İçin;\n" +
                                        "çırpılmış yoğurt\n" +
                                        "tuz",
                                "Köftesi için; kıyma, yumurta, rendelenmiş soğan ve sarımsak, yarım çay bardağı galeta unu, karabiber, pul biber ve tuzu derince bir kaba alarak yoğuralım.\n" +
                                        "Köfteleri yassı ve uzun şekiller oluşturarak pişirme kağıdı serdiğimiz fırın tepsisine yerleştirelim.185 derece ısınmış fırında 10-12 dakika fırınlayalım.\n" +
                                        "Köftelerimizi fırından aldıktan sonra 1 adet yufkamızı tezgaha alarak ikiye bölelim.\n" +
                                        "Yarım yufkanın üzerine eritilmiş tereyağından güzelce sürelim.\n" +
                                        "Yufkanın geniş tarafına köftelerimizi tek sıra halinde dizelim ve yufkanın kenarlarını içe katlayarak rulo şeklinde saralım. Bu aşamada çok gevşek sarmamalısınız.\n" +
                                        "Tüm köfteleri aynı şekilde sardıktan sonra rulolarımızı verev şeklinde dilimleyerek yağlı kağıt serilmiş fırın tepsisine sıralayalım.\n" +
                                        "Üzerlerine eritilmiş tereyağından sürerek tekrar fırına yerleştirelim.\n" +
                                        "185 dereceye ısıtılmış fırında üzerleri hafif pembeleşinceye kadar pişirelim.\n" +
                                        "Sosu için; küçük bir tavada tereyağını eritelim.\n" +
                                        "Üzerine domates rendesi boşaltarak 3-4 dakika pişirelim. Eğer domates mevsimi değilse renk vermesi için salçada ekleyebilirsiniz.\n" +
                                        "Son olarak baharatları ve tuzu ilave edip karıştıralım sonra ocaktan alalım.\n" +
                                        "Servis tabağına köftelerimizi alalım. Ortasına bolca yoğurt koyalım.\n" +
                                        "Üzerine domates sosundan gezdirip ince kıyılmış maydanoz serpiştirdikten sonra servis edelim.")
                )
        );

        meat.add(
                new SubCategoryModel(
                        "Tavuk Sote",
                        R.drawable.tavuk_sote,
                        new SoupDetailModel(R.drawable.tavuk_sote,
                                "Orta büyüklükteki 1 porsiyon tavuk göğsü yaklaşık olarak 288 kaloridir.",
                                "2-4 kişilik",
                                "Yarım kg tavuk göğsü\n" +
                                        "2 yemek kaşığı sıvı yağ\n" +
                                        "1 tatlı kaşığı domates salçası\n" +
                                        "2 adet yeşil biber\n" +
                                        "1 adet kırmızı biber\n" +
                                        "1 adet soğan\n" +
                                        "2 diş sarımsak\n" +
                                        "2 adet domates\n" +
                                        "Karabiber\n" +
                                        "Pul biber\n" +
                                        "Tuz\n" +
                                        "1 su bardağı su",
                                "Tavuk etini kuşbaşı doğrayın.\n" +
                                        "Soğanları yemeklik, biberleri julyen doğrayın, domatesleri de küp küp doğrayın.\n" +
                                        "Kısık ateşte tavukları arada karıştırarak kavurun.\n" +
                                        "Suyunu biraz çektikten sonra soğanları ve ince kesilmiş sarımsağı ekleyin.\n" +
                                        "1-2 dk kavurduktan sonra biberleri ilave edin.\n" +
                                        "Biberler de sotelenince domatesi, salçayı, baharatları ve tuzu ekleyip pişirmeye devam edin.\n" +
                                        "Son olarak 1 bardak suyu ekleyin ve etler pişene kadar kapağı kapalı bir şekilde pişirin.")
                )
        );

        meat.add(
                new SubCategoryModel(
                        "Ali Nazik Kebabı",
                        R.drawable.ali_nazik_kebabi,
                        new SoupDetailModel(R.drawable.ali_nazik_kebabi,
                                "Orta porsiyon Alinazik kebabı yaklaşık olarak 407 kaloridir.",
                                "4-6 kişilik",
                                "400 gram süzme yoğurt\n" +
                                        "3-4 adet kemer patlıcan\n" +
                                        "Tuz\n" +
                                        "2-3 diş sarımsak\n" +
                                        "\n" +
                                        "Diğer Malzemeler;\n" +
                                        "500 gram dana kuşbaşı\n" +
                                        "1 yemek kaşığı tereyağı\n" +
                                        "Tuz, karabiber, pul biber, kekik\n" +
                                        "Yarım su bardağı su\n" +
                                        "2 yemek kaşığı domates sosu (isteyen 1 yemek kaşığı salça kullanabilir)",
                                "Patlıcanları közleyip, kabuklarını temizleyin.\n" +
                                        "İnce ince doğrayın.\n" +
                                        "Soğuduktan sonra, ezilmiş sarımsak ve süzme yoğurtla beraber iyice karıştırın.\n" +
                                        "Tuzunu ayarlayın.\n" +
                                        "Diğer taraftan etleri yıkayıp, suyunu süzdürün.\n" +
                                        "Pişirme kabına alarak kısık ateşte, tencerenin kapağı kapalı bir şekilde etlerin bırakmış olduğu suyu çekmesini bekleyin.\n" +
                                        "Daha sonra tereyağını ilave edin.\n" +
                                        "Tuz hariç, baharatları ve domates sosunu ilave edin.\n" +
                                        "Mutlaka sıcak su ekleyin. Çok sulu olmayacak, sadece koyu kıvamlı bir sosumuz olacak.\n" +
                                        "Etlerin pişme süresi uzarsa, sık sık kontrol edip gerekirse tencerenin dibi tutmaması için az az sıcak su ilave edebilirsiniz.\n" +
                                        "Pişen etlere, son olarak tuzu ilave edin ve ocaktan alın.\n" +
                                        "Servis tabağına önce patlıcanlı harç, üzerine ise etleri koyun.\n" +
                                        "İsteğe göre süsleyerek, servis edebilirsiniz.")
                )
        );

        meat.add(
                new SubCategoryModel(
                        "Fırında Köfte Patates",
                        R.drawable.kofte_patates,
                        new SoupDetailModel(R.drawable.kofte_patates,
                                "Orta porsiyon fırında köfte patates yaklaşık olarak 260 kaloridir.",
                                "4-6 kişilik",
                                " 2-3 adet patates\n" +
                                        " 2-3 adet yeşil biber\n" +
                                        " 2 adet domates\n" +
                                        " Sıvı yağ\n" +
                                        " 1.5  yemek kaşığı domates salçası\n" +
                                        "\n" +
                                        "Köftesi için;\n" +
                                        " Yarım kg kıyma\n" +
                                        " 1 adet kuru soğan\n" +
                                        " 2-3 diş sarımsak\n" +
                                        " 1 adet yumurta\n" +
                                        " Yarım su bardağı kadar ufalanmış bayat ekmek içi veya galeta unu\n" +
                                        " Tuz\n" +
                                        " Karabiber\n" +
                                        " Pul biber",
                                "Öncelikle köfteler hazırlanır. Bunun için soğan bir kaç parçaya ayrılarak sarımsaklar ve yumurta ile mutfak robotundan geçirilir. İncecik hale gelen soğanlar ve sarımsaklar kıymaya ilave edilir.\n" +
                                        "Bayat ekmek içi, baharatlar ve tuzu da eklenerek köfte harcı yoğurulur. Malzemeler iyice özdeşleşince ufak parçalar koparılarak köfteler şekillendirilir.\n" +
                                        "Patates ve köfteler kızartılır. Patatesler dilimlenir. Tavada sıvı yağ kızdırılarak köfteler ve patatesler hafifçe kızartılır. (Patateslerin çok fazla pişmesine gerek yok).\n" +
                                        "Köfte ve patatesler fırın kabına alınarak pişirilir. Bütün köfte ve patatesler kızartılınca fırın kabına alınırlar ve üzerine salçalı sıcak su gezdirilir.\n" +
                                        "Domates dilimleri ve biberlerle süslenen fırın tepsisi fırına sürülür. Domatesler pişinceye dek yaklaşık 25 dk kadar düşük ısıda pişirilir. Afiyet olsun…")
                )
        );
        return meat;
    }
}
