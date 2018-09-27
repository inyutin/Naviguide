package com.example.dmitry.naviguide;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(Context context) {
        super(context, "Database5", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "CREATE TABLE site (" +
                        "name text, descr text, lat double, lng double, route_id integer, audio text);");
        db.execSQL(
                "CREATE TABLE route (" +
                        "name text, descr text, city_id integer, picture text);");

//        db.execSQL("INSERT INTO route VALUES (" + "\"Центр Москвы\", " + "\"\", " + String.valueOf(0) + ", \"center\");");
//        db.execSQL("INSERT INTO route VALUES (" + "\"Древняя Москва\", " + "\"\", " + String.valueOf(0) + ", \"ancient_dd\");");
//        db.execSQL("INSERT INTO route VALUES (" + "\"Культурная Москва\", " + "\"\", " + String.valueOf(0) + ", \"cultural_dd\");");
//        db.execSQL("INSERT INTO route VALUES (" + "\"Шоппинг в Москве\", " + "\"\", " + String.valueOf(0) + ", \"shopping_dd\");");
//        db.execSQL("INSERT INTO route VALUES (" + "\"Ночная Москва\", " + "\"\", " + String.valueOf(0) + ", \"night_dd\");");
//        db.execSQL("INSERT INTO route VALUES (" + "\"Парки Москвы\", " + "\"\", " + String.valueOf(0) + ", \"parks_dd\");");
//        db.execSQL("INSERT INTO route VALUES (" + "\"Мраморные пещеры Крыма\", " + "\"\", " + String.valueOf(0) + ", \"cave\");");
//        db.execSQL("INSERT INTO route VALUES (" + "\"Грязевые вулканы Гобустана\", " + "\"\", " + String.valueOf(0) + ", \"dirty_volkano\");");
//        db.execSQL("INSERT INTO route VALUES (" + "\"Лучшие граффити Берлина\", " + "\"\", " + String.valueOf(0) + ", \"berlin\");");
//
//        db.execSQL("INSERT INTO site VALUES (\"Городская усадьба П. П. Игнатьевой – Н. А. Белкина\", \"Городска́я уса́дьба П. П. Игна́тьевой — Н. А. Бе́лкина — памятник архитектуры, расположенный в городе Москве.\", 55.725830000000002, 37.621670000000002, 2, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Городская усадьба Я. А. Маслова — А. П. Оболенского\", \"Городская усадьба Я. А. Маслова — А. П. Оболенского — памятник архитектуры, расположенный в городе Москве.\", 55.763891940000001, 37.624068059999999, 2, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Грибоедовский ЗАГС\", \"Грибое́довский ЗАГС (''Дворец бракосочетания № 1'') — первый Московский Дворец бракосочетания, открытый в 1961 году, в бывшем особняке, построенном в 1909 году по заказу купца А. В. Рериха архитектором С. В. Воскресенским. Расположен в центре старой Москвы.\", 55.765805999999998, 37.644694000000001, 2, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Дача Муромцева\", \"Да́ча Му́ромцева — общее название исторической дачи Муромцева, дачи председателя первой Государственной думы Сергея Муромцева в Царицыне (Москва), возведённой в 1893 году и разобранной в середине 1960-х годов; а также здания более поздней постройки — деревянного дома, возведённого в 1960-х на фундаменте первоначального строения и получившего известность в конце 2000-х годов под аналогичным названием «Дача Муромцева».\", 55.608713899999998, 37.668105599999997, 2, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Детский мир (Лубянская площадь)\", \"«Де́тский мир» (с 2015 года — «Центральный детский магазин на Лубянке») — универмаг с товарами для детей и юношества, построенный в 1953—1957 годах в центре Москвы, на площади Дзержинского (с 1990 года — Лубянская площадь) по проекту архитектора Алексея Душкина (соавторы И. М. Потрубач и Г. Г. Аквилев, инженер Л. М. Глиэр) на месте снесённого Лубянского пассажа, над станцией метро глубокого заложения «Дзержинская» (с 1990 года — «Лубянка»).\", 55.760150000000003, 37.624811100000002, 2, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Дом архитекторов (Москва)\", \"Дом архитекторов (также Дом на Ростовской набережной) — жилой дом, расположенный в Москве на Ростовской набережной, 5. Построен архитектором Щусевым в стиле постконструктивизма в 1930-х годах. Здание является частью нереализованного проекта парадного ансамбля Смоленской и Ростовской набережных, задуманного Щусевым. Боковые крылья, облицованные бежевым кирпичом, достроены в начале 1960-х.\", 55.7425, 37.575560000000003, 2, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Дом банка и торгового дома «И. В. Юнкер и Ко»\", \"Дом банка и торгового дома «И. В. Юнкер и Ко» — историческое здание, расположено в Москве на улице Кузнецкий Мост, 16/5. Построено в 1876 году архитектором П. С. Кампиони. Перестроено в 1900—1908 годах в стиле модерн архитектором А. Э. Эрихсоном. В 1913—1915 годах архитектором В. И. Ерамишанцевым, при участии братьев Весниных фасад здания перестроен в неоклассических формах. Дом банка и торгового дома «И. В. Юнкер и Ко» является объектом культурного наследия регионального значения. По мнению ряда искусствоведов, здание является одной из лучших построек московской неоклассики.\", 55.761766110000003, 37.622118059999998, 2, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Дом Дворцового ведомства в Денежном переулке\", \"Дом Дворцо́вого ве́домства в Де́нежном переу́лке — памятник архитектуры, расположенный в городе Москве.\", 55.742220000000003, 37.588059999999999, 2, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Дом И. Л. Чернышёва\", \"Городская усадьба И. Л. Чернышёва — памятник архитектуры, расположенный в Москве.\", 55.766390000000001, 37.665280000000003, 2, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Дом культуры имени Зуева\", \"Дом культуры имени Зуева (или Клуб профсоюзов коммунальников имени Зуева) — здание дома культуры в Москве, расположенное на Лесной улице; один из наиболее ярких и известных в мире памятников конструктивизма. Построен в 1927—1929 годах по проекту архитектора Ильи Голосова и назван в честь участника революции 1905 года, слесаря трамвайного парка Сергея Зуева. На территории ДК работают театры, среди которых «Квартет И», «Другой театр».\", 55.779170000000001, 37.590000000000003, 2, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Дом культуры имени Русакова\", \"Дом культу́ры и́мени И. В. Русако́ва (изначально — ''Клуб Русако́ва Сою́за Коммуна́льников'') — здание рабочего клуба на пересечении улиц Стромынка и Бабаевская в Москве. Было построено в 1929 году для работников Союза коммунальников по проекту архитектора Константина Мельникова. Является объектом культурного наследия России и входит в перечень Всемирного фонда памятников архитектуры\", 55.79139, 37.687220000000003, 3, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Дом Л. И. Долгова\", \"Дом Л. И. Долго́ва — памятник архитектуры, расположенный в городе Москве.\", 55.775559999999999, 37.632779999999997, 3, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Дом Мельникова\", \"Дом Мельникова (Дом-мастерская архитектора Константина Степановича Мельникова) — одноквартирный жилой дом, всемирно известный памятник архитектуры советского авангарда в архитектуре. Был построен в 1927—1929 годах в Кривоарбатском переулке в Москве по проекту выдающегося советского архитектора Константина Мельникова для себя и своей семьи.\", 55.748066000000001, 37.589447999999997, 3, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Дом Моссельпрома\", \"Дом Моссельпрома в Москве — памятник русского конструктивизма и авангарда, расположенный на углу Калашного и Нижнего Кисловского переулков. Историческую и культурную ценность представляет как само здание, построенное по проекту архитектора Н. Д. Струкова, так и панно, выполненное художниками А. М. Родченко и В. Ф. Степановой, а также воспроизведённый на доме рекламный слоган «Нигде кроме, как в Моссельпроме», авторство текста которого принадлежит В. Маяковскому.\", 55.753889999999998, 37.602499999999999, 3, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Дом Мусорина-Полежаевой\", \"Дом Мусорина-Полежаевой — памятник архитектуры, расположен в Замоскворечье в Москве по адресу: ул. Бахрушина, д. 21, стр. 4.\", 55.734029999999997, 37.636536110000002, 3, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Дом на Моховой\", \"Дом на Моховой — здание в центре Москвы на Моховой улице. Дом построен в 1934 году по проекту архитектора Ивана Жолтовского для сотрудников Моссовета. Строительство здания вызвало противоречивые отзывы и активную дискуссию среди архитекторов. Дом Жолтовского ознаменовал собой перелом в советской архитектуре, его прозвали «''гвоздём в гроб конструктивизма''». Здание имеет статус объекта культурного наследия регионального значения. С 2000-х годов в нём размещается головной офис компании АФК «Система».\", 55.75611, 37.613059999999997, 3, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Дом Общества «Детский труд и отдых»\", \"Дом Общества „Детский труд и отдых“ — памятник архитектуры, расположенный в Москве.\", 55.790559999999999, 37.598610000000001, 3, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Дом Орловых-Мещерских\", \"Дом Орловых-Мещерских — достопримечательность Москвы, образец классической архитектуры. Включен М. Ф. Казаковым в альбом лучших «партикулярных» зданий города. Расположен на углу Романова переулка (дом 7) и Большой Никитской (дом 5/7).\", 55.755389000000001, 37.609000000000002, 3, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Дом П. А. Сырейщикова (Рахмановых)\", \"Дом П. А. Сырейщикова (Рахмановых) — памятник архитектуры, расположенный в городе Москве.\", 55.754440000000002, 37.654440000000001, 3, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Дом Палибина\", \"Дом Пали́бина — памятник архитектуры, расположенный в Москве.\", 55.738610000000001, 37.57694, 3, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Дом писателей в Лаврушинском переулке\", \"Дом писателей в Лаврушинском переулке — жилой дом—памятник архитектуры, расположенный в городе Москве, один из объектов культурного наследия федерального значения.\", 55.741109999999999, 37.621940000000002, 4, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Дом Пороховщикова\", \"Дом Пороховщико́ва — особняк в центре Москвы, по адресу: Староконюшенный переулок, д. 36. Построен в 1871—1872 годах для российского предпринимателя и мецената А. А. Пороховщикова, владельца гостиницы «Славянский базар» и одноимённого ресторана. Здание, построенное на древнем фундаменте из дерева, удачно синтезировало приёмы национальной архитектурной традиции. Сложенный из толстых брёвен, украшенный резными наличниками, карнизами и подзорами, особняк сочетает крупные объёмы и не лишённый живописности облик. Проект дома в 1873 году получил премию на Всемирной выставке в Вене. Объект культурного наследия федерального значения.\", 55.749813000000003, 37.594641000000003, 4, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Дом поэта А. Н. Майкова\", \"Дом поэта А. Н. Майкова — памятник архитектуры, расположенный в городе Москве.\", 55.774999999999999, 37.640560000000001, 4, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Дом Рокотова\", \"Дом Ф. С. Ро́котова — жилой дом XVIII века в Москве на Старой Басманной, 30/1.\", 55.768329999999999, 37.668059999999997, 4, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Дом Снегирёва на Плющихе\", \"Дом Снегирёва на Девичьем поле — особняк профессора В. Ф. Снегирева, расположенный в Хамовниках по адресу: улица Плющиха, 62, строение 2.\", 55.737124999999999, 37.574691700000002, 4, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Дом Трубецких в Петровском переулке\", \"Дом А. С. Трубецко́й-Бове́ — памятник архитектуры, расположенный в городе Москве.\", 55.765279999999997, 37.612780000000001, 4, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Доходные здания Джамгаровых\", \"Доходные здания Джамгаровых — два исторических торговых здания в Москве, расположенные на территории владения № 18/7 на углу улиц Кузнецкий Мост и Рождественки. Построены по заказу братьев-банкиров Джамгаровых в 1893 году (правая часть, архитектор Б. В. Фрейденберг) и в 1909 году (левая часть, архитектор А. Э. Эрихсон). Здания представляют ценность в историко-культурном отношении.\", 55.761988899999999, 37.623294399999999, 4, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Доходный дом Б. Н. Шнауберта\", \"Доходный дом Б. Н. Шнауберта — памятник архитектуры, расположенный в городе Москве.\", 55.755279999999999, 37.641109999999998, 4, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Доходный дом Бебутовой\", \"Доходный дом Бебутовой — памятник архитектуры, расположенный в городе Москве.\", 55.766939999999998, 37.62556, 4, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Доходный дом В. И. Фирсановой\", \"Доходный дом В. И. Фирсановой — памятник архитектуры, расположенный в городе Москве.\", 55.76417, 37.620829999999998, 4, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Доходный дом Е. А. Депре\", \"Дохо́дный дом Е. А. Депре́ — памятник архитектуры, расположенный в городе Москве. В стенах строения жил драматург Натан Зархи.\", 55.768329999999999, 37.616669999999999, 5, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Доходный дом купца Камзолкина\", \"Доходный дом купца Камзолкина — памятник архитектуры, расположенный в городе Москве.\", 55.773330000000001, 37.63167, 5, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Доходный дом купцов Архангельских\", \"Доходный дом купцов Архангельских — памятник архитектуры, расположенный в городе Москве.\", 55.761670000000002, 37.63861, 5, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Доходный дом Н. Г. Тарховой\", \"Доходный дом Н. Г. Тарховой — памятник архитектуры, расположенный в городе Москве.\", 55.75694, 37.651389999999999, 5, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Доходный дом Первого Российского страхового общества (Москва)\", \"Доходный дом Первого Российского страхового общества — исторический доходный дом в Москве, расположен на углу улиц Кузнецкий Мост и Большой Лубянки. Здесь в 1918—1952 годах размещался Народный комиссариат по иностранным делам (с 1946 года — Министерство иностранных дел СССР). Здание является выявленным объектом культурного наследия.\", 55.762386100000001, 37.627591700000004, 5, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Доходный дом Сокол\", \"Доходный дом М. В. Сокол — исторический доходный дом в Москве, расположен на улице Кузнецкий Мост. Здание является объектом культурного наследия регионального значения.\", 55.761658300000001, 37.616833300000003, 5, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Доходный дом Торлецкого — Захарьина\", \"\", 55.761416699999998, 37.623702799999997, 5, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Доходный дом Трындиных\", \"Дохо́дный дом Тры́ндиных — памятник архитектуры, расположенный в городе Москве.\", 55.755279999999999, 37.641109999999998, 5, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Доходный дом Хомякова\", \"Доходный дом А. С. Хомякова — историческое здание в Москве на пересечении улиц Кузнецкий Мост и Петровка. Построен в 1900 году архитектором И. А. Ивановым-Шицем. Здание является редким сохранившимся памятником, выполненным в Москве в стилистике венского модерна.\", 55.761255599999998, 37.618083300000002, 5, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Евангелический приют для сирот\", \"Евангелический приют для сирот — приют ''Евангелического попечительства о бедных женщинах и детях'' для детей бедных родителей и детей-сирот в возрасте от 2 до 9 лет, российского и немецкого подданства.\", 55.765675000000002, 37.6676444, 5, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Жилой дом Военно-инженерной академии им. В. В. Куйбышева\", \"Жилой дом Военно-инженерной академии имени В. В. Куйбышева — многоквартирный жилой дом в Москве на пересечении Яузского бульвара с Подколокольным переулком. Построен в 1934—1941 годах по проекту архитектора И. А. Голосова для сотрудников и слушателей Военно-инженерной академии имени В. В. Куйбышева. Здание имеет статус выявленного объекта культурного наследия регионального значения.\", 55.752220000000001, 37.645560000000003, 6, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Замоскворечье (район Москвы)\", \"Замоскворе́чье — район и муниципальное образование в Центральном административном округе Москвы, расположенные в излучине реки Москвы, на правом её берегу, к югу от Кремля.\", 55.739719999999998, 37.625, 6, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Зарядье (концертный зал)\", \"Зарядье (''Государственное бюджетное учреждение культуры города Москвы «Московский концертный зал „Зарядье“»'') — концертный зал в Москве, расположенный в природно-ландшафтном парке «Зарядье» по адресу улица Варварка, дом 6, строение 4. Открыт в 2018 году.\", 55.751390000000001, 37.631390000000003, 6, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Здание Московского международного торгового банка\", \"Здание Московского международного торгового банка — историческое здание в Москве, расположенное на углу улиц Кузнецкий Мост и Рождественки. Построено по заказу Московского международного торгового банка архитектором С. С. Эйбушицем в 1898 году. Здание является объектом культурного наследия регионального значения.\", 55.762430600000002, 37.623794400000001, 6, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Здание СЭВ\", \"Комплекс зданий секретариата Совета экономической взаимопомощи — комплекс зданий, расположенный по адресу Новый Арбат, дом 36 в районе Арбат Центрального административного округа города Москвы. Комплекс включает 3 здания, объединённых общим стилобатом: 31-этажную административную высотку, конференц-центр и 13-этажную гостиницу «Мир». Здания были возведены в 1963—1970 годах для размещения органов Совета экономической взаимопомощи, в 1991—1992 годах отчуждены  в пользу мэрии Москвы вместе с другим недвижимым имуществом СЭВ. В здании разместилось московское правительство, а в 1994 году в здании также располагалась Государственная дума I созыва.\", 55.753610000000002, 37.57694, 6, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Здание торговой фирмы А. М. Михайлова\", \"Здание торговой фирмы А. М. Михайлова — историческое торговое здание, расположено в Москве на улице Кузнецкий Мост, 14. Построено по заказу меховщика А. М. Михайлова архитектором А. Э. Эрихсоном в 1903 году. С середины 1940-х годов по 2002 год в здании размещался Общесоюзный дом моделей одежды, в настоящее время в доме работает магазин одежды премиум-класса «Podium concept store». Здание является выявленным объектом культурного наследия.\", 55.761389999999999, 37.621670000000002, 6, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Иллюзион (кинотеатр, Москва)\", \"«Иллюзио́н» — действующий московский кинотеатр, филиал Госфильмофонда РФ. \", 55.748060000000002, 37.645000000000003, 6, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Киргизия (Кинотеатр, Москва)\", \"Кинотеатр Киргизия — кинотеатр в Москве, находившийся в районе Новогиреево по адресу Зелёный проспект, 81 и открытый 28 апреля 1972 года, ранее принадлежавший сети КАРО- фильм.\", 55.751866110000002, 37.819983059999998, 6, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Клуб Дорхимзавода имени М. В. Фрунзе\", \"Клуб Союза химиков Дорогомиловского химического завода имени М. В. Фрунзе — многоэтажное здание московского рабочего клуба в стиле конструктивизма, расположенное в Дорогомилово по адресу Бережковская набережная, 28. Построено в 1927—1929 годах архитектором Константином Мельниковым по заказу Союза химиков для рабочих Дорогомиловского химического завода\", 55.731110000000001, 37.547780000000003, 6, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Клуб фабрики «Буревестник»\", \"Клуб фабрики «Буревестник» (клуб «Буревестник») — здание клуба на 3-й Рыбинской (бывшей Огородной) улице в Москве. Построено в 1928—1930 годах по проекту выдающегося советского архитектора Константина Мельникова по заказу Московского губернского отдела Союза кожевенников для рабочих обувной фабрики «Буревестник».\", 55.79083, 37.661389999999997, 6, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Клуб фабрики «Свобода»\", \"Клуб фабрики «Свобода» (также известен как «Дворец культуры им. М. Горького», «Дворец культуры работников торговли» и «Суриковъ-Холл») — здание клуба на Вятской улице в Москве, построенное в 1929 году по проекту выдающегося советского архитектора Константина Мельникова для рабочих Государственной мыльно-косметической фабрики «Свобода» треста ТЭЖЭ № 4 Союза химиков (позднее Косметическое объединение «Свобода»).\", 55.800559999999997, 37.581389999999999, 7, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Колизей (Москва)\", \"Колизей — бывший кинотеатр в Москве, занимал здание, построенное специально для кинотеатра на Чистопрудном бульваре, дом 19а.\", 55.761741700000002, 37.645947200000002, 7, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Аллея Космонавтов\", \"Алле́я Космона́втов (также ''аллея Героев Космоса'', ''аллея Героев Космонавтов'' — пешеходная улица, расположенная между южным и северным входами станции метро «ВДНХ». Открыта 4 октября 1967 в честь десятилетия запуска первого искусственного спутника Земли. Проходит от Останкинского проезда до монумента «Покорителям космоса». 12 апреля 1967 года на аллее состоялось торжественное открытие памятников советским учёным-ракетостроителям и героям-космонавтам. К 2017 году было установлено 14 памятников выдающимся деятелям космонавтики.\", 55.820611, 37.639333000000001, 7, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Круговая кинопанорама\", \"Кругова́я кинопанора́ма — разработанная в СССР кругорамная кинематографическая система, использующая 11 (в ранней версии 22) 35-мм киноплёнок для создания изображения с горизонтальным углом обзора 360°. В зрительном зале, расположенном внутри цилиндрического экрана, нет сидячих мест и зрители смотрят фильм стоя.\", 55.827097199999997, 37.629869399999997, 7, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Малый Николаевский дворец\", \"Ма́лый Никола́евский дворе́ц — трёхэтажное здание, располагавшееся с 1775 по 1929 год в Кремле на углу Ивановской площади. Служил резиденцией императорской семьи в Москве до строительства Большого Кремлёвского дворца.\", 55.751463000000001, 37.619478100000002, 7, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Медведково (усадьба)\", \"Медведково — подмосковная усадьба, принадлежавшая в XVI—XVII веках роду Пожарских. Усадьба находилась восточнее церкви, близ нынешней Полярной улицы. До наших дней не сохранилась.\", 55.865560000000002, 37.63944, 7, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Милютинский сад\", \"Милютинский сад (бывш. сад Межевой канцелярии) — исторический городской сад площадью 0,91 га; находится в Басманном районе Центрального административного округа Москвы (Покровский бульвар, 10, сад, не путать с также находящимся в Басманном районе Милютинским сквером на ул. Новорязанская). Сад расположен в историческом районе Ивановская горка в черте Белого города. Объект культурного наследия регионального значения.\", 55.75611, 37.64667, 7, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Миру — мир! (скульптура)\", \"«Миру — мир!» — монументальная скульптурная композиция работы Станислава Людвиговича Савицкого, воздвигнутая в ряде советских городов в 1955-59 годах. Олицетворяет миролюбивую политику Советского Союза в период нарастания угрозы ядерной войны и глобальной катастрофы. Посвящена борьбе за мир, дружбе народов, грядущему коммунистическому освобождению и преображению человечества — представители некогда противопоставляемых друг другу рас несут на своих руках Земной Шар, обвитый лентой с надписью «МИР» на многих языках.\", 55.726799999999997, 37.560899999999997, 7, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Морозовский сад\", \"Морозовский сад — исторический городской сад площадью 0,46 га; находится в Басманном районе Центрального административного округа Москвы (Большой Трёхсвятительский переулок, владение 1, сад). Сад расположен в одной из самых возвышенных частей исторического района Ивановская горка, в черте Белого города. Объект культурного наследия регионального значения.\", 55.755436099999997, 37.6435472, 7, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Московская соборная мечеть\", \"Московская соборная мечеть — главная мечеть Москвы, одна из крупнейших и высочайших мечетей в России и Европе. Первое здание мечети построено в 1904 году, в 2011-м оно было снесено для строительства нового, открытие которого состоялось 23 сентября 2015 года. Мечеть расположена в Мещанском районе в Выползовом переулке у улицы Дурова и Олимпийского проспекта рядом со спортивным комплексом «Олимпийский» и станцией метро «Проспект Мира».\", 55.779170000000001, 37.626939999999998, 7, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Московский газовый завод\", \"Московский газовый завод — бывший газовый завод в Басманном районе Центрального административного округа Москвы, построенный в 1865 году для освещения города, памятник промышленной архитектуры. В настоящее время помещения завода переоборудованы в бизнес-центр.\", 55.761110000000002, 37.663060000000002, 8, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Московский планетарий\", \"Моско́вский планета́рий — один из самых больших в мире и самый старый планетарий в России. Расположен в Москве возле новой территории Московского зоопарка, недалеко от Садового кольца. Построен в 1927—1929 годах по проекту архитекторов М. О. Барща, М. И. Синявского и инженера Г. А. Зундблата.\", 55.761389999999999, 37.58361, 8, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Надвратная церковь Страстного монастыря\", \"Святые ворота Страстного монастыря — въездные центральные ворота не существующего ныне Страстного монастыря в Москве, над которыми была надстроена церковь Алексия Человека Божия. Представляли собой доминирующий архитектурный акцент Страстной площади (ныне Пушкинской).\", 55.765243060000003, 37.605328890000003, 8, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Новодевичье кладбище\", \"Новоде́вичье кла́дбище — кладбище в московских Хамовниках при Новодевичьем монастыре. Основано при Новодевичьем монастыре, построенном в 1525 году. Официально возраст кладбища отсчитывается с 1904 года.\", 55.724719999999998, 37.554169999999999, 8, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Океанариум на Дмитровском шоссе\", \"Океанариум на Дмитровском шоссе — первый океанариум в Москве, располагающийся в торгово-развлекательном центре «РИО» на Дмитровском шоссе, 163. Признан крупнейшим в России, после Москвариума. Создан на средства ГК «Ташир». Инвестиции в проект составили 18 млн долларов.\", 55.909399999999998, 37.539700000000003, 8, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Особняк Н. В. Кузнецовой\", \"Особня́к Наде́жды Вику́ловны Кузнецо́вой — правый корпус усадебного комплекса промышленника Матвея Кузнецова, официально принадлежавшего его жене.\", 55.782218059999998, 37.633266110000001, 8, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Павильон «Украина» на ВДНХ\", \"Павильон «Украина» (экспозиция «Земледелие») — 58-й павильон ВДНХ, построенный в 1950—1954 годах. До 1963 года носил название «Украинская ССР».\", 55.83278, 37.626939999999998, 8, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Палаты в Кадашёвской слободе\", \"Пала́ты в Кадашёвской слободе́ — памятник архитектуры, расположенный в городе Москве.\", 55.742780000000003, 37.621110000000002, 8, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Палаты Гребенщиковых\", \"Палаты Гребенщиковых — памятник архитектуры, расположенный в городе Москве.\", 55.741109999999999, 37.659170000000003, 8, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Палаты князя Андрея Друцкого\", \"Палаты князя Андрея Друцкого — памятник архитектуры, расположенный в городе Москве.\", 55.748330000000003, 37.597499999999997, 8, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Пассаж Попова\", \"Пассаж К. С. Попова (позднее — Джамгаровых) — историческое торговое здание, расположено в Москве на улице Кузнецкий Мост, 12. Построено по заказу чаеторговца К. С. Попова архитектором А. И. Резановым в 1877 году. В пассаже Попова в 1882 году открылась первая московская телефонная станция, а в 1885 году на фасаде здания впервые в Москве появилась световая реклама. С 1958 по 2014 в здании работала Государственная публичная научно-техническая библиотека. Здание является заявленным объектом культурного наследия.\", 55.761693999999999, 37.621110999999999, 9, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Пассаж Сан-Галли\", \"Пассаж Сан-Галли — выставочно-торговый комплекс в виде пассажа, расположенный на улице Кузнецкий Мост в центре Москвы, является памятником архитектуры регионального значения. С 1953 года в здании размещается Московский дом художника.\", 55.762313900000002, 37.622213899999998, 9, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Мост Победы\", \"Мост Побе́ды (бывш. 1-й Ленинградский путепровод) — путепровод на Ленинградском шоссе в Москве. Проходит над путями Рижского направления Московской железной дороги, соединяя районы Сокол и Войковский. Тип конструкции моста — железобетонный, балочный, четырёхпролётный. Ленинградское шоссе на мосту имеет 4 полосы движения в каждом направлении. Длина моста составляет 132 м, ширина — 35 м.\", 55.814808300000003, 37.501275, 9, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Погодинская изба\", \"«Погодинская изба» — историческое здание на Девичьем поле в Москве, деревянный сруб, построенный в традициях русского народного деревянного зодчества для историка и коллекционера М. П. Погодина. Адрес: Москва, Погодинская улица, 12А.\", 55.732219999999998, 37.566940000000002, 9, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Посёлок Загородной больницы (Кунцево)\", \"Посёлок Загородной больницы (посёлок Кремлёвской больницы, также, после 1960 — посёлок ЦКБ, дома ЦКБ, дома Центральной больницы, неофициально — «Красные дома») — исторический район (жилой квартал) в Западном административном округе Москвы, в районе пересечения улиц Академика Павлова, Партизанской и Маршала Тимошенко. Первоначально возводился как жильё для сотрудников строящейся в то время Загородной больницы (Центральной клинической больницы Четвёртого Главного управления при Минздраве СССР) в западных пригородах бывшего подмосковного города Кунцево, в 1960 году вошедшего в состав Москвы.\", 55.742220000000003, 37.39611, 9, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Прага (ресторан)\", \"«Пра́га» — московский ресторан, расположенный на Арбате, дом 2.\", 55.7523889, 37.5997111, 9, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Пушкинский дуб (Москва)\", \"Пушкинский дуб — черешчатый дуб на Тверском бульваре Москвы.\", 55.759552800000002, 37.600208299999998, 9, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Рублёвский гидроузел\", \"Рублёвский гидроузел — гидроузел на Москве-реке в 16,1 километра ниже по течению от устья реки Истры вблизи от посёлка Рублёво, в городе Москве. Собственник сооружений гидроузла — МГУП «Мосводоканал».\", 55.768300000000004, 37.32, 9, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Семёновское кладбище\", \"Семёновское кладбище — бывшее кладбище, до 1935 одно из самых крупных и известных мест погребения усопших в Москве. Находится в районе Соколиная Гора, Восточного административного округа города Москвы (Измайловское шоссе, 2).\", 55.779000000000003, 37.717717999999998, 9, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Строкинское укрепление\", \"Строкинское укрепление (также известно как Петровские укрепления и Измайловская аномалия) — остатки земляных фортификационных сооружений на территории современного района Восточное Измайлово Москвы.\", 55.79278, 37.835279999999997, 9, \"\");");
//
//        db.execSQL("INSERT INTO site VALUES (\"Спасская башня Московского Кремля\", \"Спасская башня была сооружена в 1491 году в период княжения Ивана III архитектором Пьетро Антонио Солари, о чём свидетельствуют белокаменные плиты с памятными надписями, установленные над въездными воротами башни. С внешней стороны башни надпись сделана на латинском языке, с внутренней — на русском: «В лето 6999 [1491] июля божией милостию сделана бысть сия стрельница повелением Иоанна Васильевича государя и самодержца всея Руси и великого князя Володимерского и Московского и Новгородского и Псковского и Тверского и Югорского и Вятского и Пермского и Болгарского и иных в 30 лето государств его, а делал Пётр Антоний Солярио от града Медиолана».\", 55.752544, 37.621425 , 1, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Собор Василия Блаженного\", \"Собор объединяет десять церквей (приделов), часть из которых освящены в честь святых, дни памяти которых пришлись на решающие бои за Казань[3]. Центральная церковь сооружена в честь Покрова Богородицы, вокруг которой группируются отдельные церкви в честь: Святой Троицы, Входа Господня в Иерусалим, Николы Великорецкого, Трёх Патриархов: Александра, Иоанна и Павла Нового, Григория Армянского, Киприана и Иустины, Александра Свирского и Варлаама Хутынского, размещённые на одном основании-подклете, и придел в честь Василия Блаженного[4][5], по имени которого храм получил второе, более известное название.\", 55.752667, 37.623222, 1, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Александровский сад\", \"Алекса́ндровский сад — парк в Тверском районе Москвы, расположен вдоль западной Кремлёвской стены, тянется от площади Революции до Кремлёвской набережной[1]. Был основан в 1812 году. Парк площадью 10 гектаров состоит из трёх частей: Верхнего, Среднего и Нижнего садов. В нём находятся такие исторические объекты, как Кутафья башня Кремля, Итальянский грот, обелиск к 300-летию Дома Романовых и другие. Особое место занимают памятники, посвященные Отечественной войне 1812 года и Великой Отечественной войне[1].\", 55.752345, 37.613701, 1, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Храм Христа Спасителя\", \"Хра́м Христа́ Спаси́теля — кафедральный собор Русской православной церкви, расположенный в Москве на улице Волхонке. Существующее сооружение, построенное в 1990-х годах, является воссозданием одноимённого храма, созданного в XIX веке[1].\", 55.744592, 37.605614, 1, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Памятник Петру Первому\", \"Памятник Петру в техническом плане представляет собой уникальное инженерное сооружение. Несущий каркас монумента выполнен из нержавеющей стали, на него навешены бронзовые детали облицовки. Отдельно друг от друга собирались образующая пьедестал нижняя часть памятника, корабль и фигура Петра; последние в готовом виде монтировались на пьедестал. Ванты корабля выполнены из нержавеющей стали. Каждый из них сплетён из нескольких тросов и закреплён таким образом, что полностью исключена их подвижность. Паруса имеют внутри пространственный металлический каркас (для уменьшения веса), они изготовлены из меди методом выколотки.\", 55.738611, 37.608333, 1, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Парк искусств «Музеон»\", \"Парк искусств «Музеон» — музей скульптуры в Москве под открытым небом, крупнейший в России. В парке установлено более 800 работ. В коллекции Музеона представлены монументы вождей 1930—50-х годов, памятники эпохи соцреализма и бюсты Героев Социалистического Труда, а также работы скульпторов-авангардистов. Они расположены вдоль аллеи и на газонах, доступ к которым не ограничен: посетители музея свободно гуляют среди скульптур, прикасаются к ним и фотографируются[3]. Парк искусств находится в нижней части поймы Москвы-реки, он ограничен Крымским валом, набережной Москвы-реки и Мароновским переулком[4]. Объединение ЦПКиО им. М. Горького и Музеона обсуждали с 2014 года[5] — в октябре 2015 года парк искусств стал составной частью Парка Горького[6].\", 55.735554, 37.607916, 1, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Крымский мост\", \"Кры́мский мост — висячий мост через Москву-реку, расположен на трассе Садового кольца, соединяет Зубовский бульвар с улицей Крымский Вал. Построен в 1938 году в рамках Генерального плана реконструкции Москвы 1935 года по проекту архитектора Александра Власова и инженера Бориса Петровича Константинова[3][4][5]. Существует несколько версий происхождения названия моста: по соединяемым им Крымской площади и улице Крымский Вал; по названию древнего Крымского брода; по находившемуся в XVI веке неподалёку от него двору крымского хана[4][1][6]. В 2007 году Правительство Москвы включило мост в реестр охраняемых объектов культурного наследия столицы[6][7][8].\", 55.733889, 37.598889, 1, \"\");");
//        db.execSQL("INSERT INTO site VALUES (\"Парк Горького\", \"Центра́льный парк культу́ры и óтдыха и́мени Макси́ма Гóрького (сокращённо ЦПКиО или парк Горького) — московский парк культуры и отдыха, столичная рекреационная зона, одна из самых больших и популярных в городе[2][3]. Партерная часть парка появилась в 1923 году после организации на этой территории Всероссийской сельскохозяйственной выставки (ВСХВ), планировку которой от входа до Нескучного сада выполнил архитектор-авангардист Константин Мельников. ЦПКиО был открыт 12 августа 1928 года, в 1932-м парку присвоили имя писателя Максима Горького. В разное время проектировкой парка занимались Эль Лисицкий и Александр Власов. Арка главного входа возведена в 1955 году по проекту архитектора Георгия Щуко[4].\", 55.731169, 37.6031, 1, \"\");");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}