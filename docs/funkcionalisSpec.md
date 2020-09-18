# Funkcionális Specifikáció
## Használati esetek
A követelmény specifikáció, azon belül is a "Követelménylista" című bekezdése alapján az egyes pontok kifejtésére kerül sor ebben a fejezetben.
* A programmal lehetőséget szeretnénk nyújtani az olyan kisgyermekes családoknak, kik hasonló körülmények között élnek, mint e program megrendelője.
* Legfőbb célja az akasztófa játékunknak, hogy már a kezdetekkor az internettől való függetlenedés ötlete járt a fejünkben. Ezért ez a program még a béta verzióban internet nélkül fog működni.
* A program elindítása után, az alábbi lehetőségeink lesznek:

    * A játék képes lesz előre megadott korosztály opciót nyújtani a felhasználónak, hogy minden egyes korosztály szabadidejében megtalálja a kikapcsolódási lehetőséget offline, a gép előtt ülve is.
    * Tartalmazni fog még kategória fület is, amiben kiválaszthatjuk a számunkra leginkább megfelelő kategóriát, amiben igazán otthon érezzük magunkat.
    * További szűrési lehetőséget nyújt majd a témakör opció, mellyel tovább növelhetjük esélyünket a játék által generált szó eltalálására és így az eredménytáblán megcélzott álomként számontartott első hely megszerzésére.
    * Mellesleg a játék csak bizonyos hibázási lehetőséget enged, ezáltal valami kihívási lehetőséget tartogatva magában, hogy a cél nem a tippelgetés lesz, hanem az általunk bírtoklott tudás használata.
    *  Hibajelzésként a játék minden egyes hiba után másik ábrát fog mutatni a felhasználónak, így az utolsó hibázás után egy felakasztott bábút láthatunk.
    
    * Minden kör végén a játék fel fogja ajánlani a felhasználó számára a következő opciókat:
        * Kilépési lehetőség, ha már unjuk a játékot akkor nyugodtan félbehagyhatjuk.
        * Újrakezdési lehetőség, a játék újrakezdéséhez nem kell mindig előről elindítanunk az alkalmazást, csak használjuk majd ezt a funkciót.
        * Leaderboard, a belépést követően a játék bekér egy felhasználói nevet, és majd ehhez fogja társítani a játszott játékok számát és a győztes játékok számát. A tábla elején mindig a legtöbb játékot nyert játékos neve szerepel majd.
     * A szoftverben az egyik legfontosabb **funkció**, hogy egy szerethető és könnyen kezelhető felületet nyújtsunk a felhasználóknak.
        
## Jelenlegi helyzet
## Jelenlegi üzleti folyamatok modellje
## Igényelt üzleti folyamatok
## Képernyőtervek

Számunkra a projekt kinézete mindenféleképpen elsőszámú prioritás.
A legfontosabb az, hogy a képernyőn lévő elemek ne legyenek összesűrítve.
A célunk az, hogy minél átláthatóbb és felhasználóbarát legyen.

Ehhez a JavaFX eszközeit alkalmazzuk. Emellett a JavaFX-hez tartozó SceneBuilder is felhasználásra kerül.
Elsősorban azért, mert ez ismerős számunkra, de emellett azért is mert nem komplikált a használata Java mellett.

Az alkalmazás először is egy bejelentkező ablakkal indul. A bejelentkező ablak tartalmaz egy bemeneti mezőt.
A bemeneti mezőben írjuk be a felhasználónevünket amelyet eltárolunk.
