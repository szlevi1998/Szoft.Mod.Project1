# Funkcionális Specifikáció
## Bevezetés
Mai rohanó és fejlett világunkban az emberek többségében teljesen megváltoztak
 azon értékrendek, hogy mit tartanak fontosnak és mire tekintenek úgy,
 mintha nem is létezne. Születésünktől fogva a legtöbbünk célja az, hogy 
 már 20 és 30 éves korunkra saját autóval, házzal, modell barátnővel és 
 luxusjachtokkal rendelkezzünk egyben elérve az anyagi függetlenséget is.
 Az ilyen emberek fejében nagyon erős az a fajta céltudatosság és magamutogatás,
  hogy ezt a külvilág tudta nélkül elérni szinte lehetetlen.
 Osztogatják a saját tippjeiket a meggazdagosághoz vezető úthoz, ezáltal
  a szegényebb rétegtől megvonva azt a kevés pénzt is, amivel rendelkeznek,
   mivel ezek a tippek sosem ingyenesek.
 Ezt látva a mi csapatunk gondolt egyet és merészet, és a falvakban élő
  szegényebb réteg számára nyújtana egy új szórakozási lehetőséget, leváltva
   a régi papír és toll alapú változatot.
 A csapat és a program célja, hogy sorra járjuk falvakat, és néhány szegényebb
  családnak készítünk offline számítógépes programokat.
 A gépeket és a hozzá való eszközöket az önkormányzat biztosította a családok számára.
 Az első szerencsések között van e akasztófa játék megrendelője is.
## Használati esetek
A követelmény specifikáció, azon belül is a "Követelménylista" című bekezdése
alapján az egyes pontok kifejtésére kerül sor ebben a fejezetben.
* A programmal lehetőséget szeretnénk nyújtani az olyan kisgyermekes 
családoknak, kik hasonló körülmények között élnek, mint e program megrendelője.
* Legfőbb célja az akasztófa játékunknak, hogy már a kezdetekkor az internettől
 való függetlenedés ötlete járt a fejünkben. Ezért ez a program még a béta 
 verzióban internet nélkül fog működni.
* A program elindítása után, az alábbi lehetőségeink lesznek:
    
    * A játékos nevének megadása az erre kijelölt helyen, ezután az alábbi
    játéklehetőségek lesznek.
    * A játék képes lesz előre megadott korosztály opciót nyújtani a felhasználónak,
     hogy minden egyes korosztály szabadidejében megtalálja a kikapcsolódási
     lehetőséget offline, a gép előtt ülve is.
    * Tartalmazni fog még kategória fület is, amiben kiválaszthatjuk a
    számunkra leginkább megfelelő kategóriát, amiben igazán otthon érezzük
    magunkat.
    * Mellesleg a játék csak bizonyos hibázási lehetőséget enged, ezáltal
     valami kihívási lehetőséget tartogatva magában, hogy a cél nem a
     tippelgetés lesz, hanem az általunk bírtoklott tudás használata.
    *  Hibajelzésként a játék minden egyes hiba után másik ábrát fog mutatni a 
    felhasználónak, így az utolsó hibázás után egy felakasztott bábút láthatunk.
    
    * Minden kör végén a játék fel fogja ajánlani a felhasználó számára a következő opciókat:
        * Kilépési lehetőség, ha már unjuk a játékot akkor nyugodtan
        félbehagyhatjuk.
        
        * Újrakezdési lehetőség, a játék újrakezdéséhez nem kell mindig előről 
        elindítanunk az alkalmazást, csak használjuk majd ezt a funkciót.
        * Leaderboard, a belépést követően a játék bekér egy felhasználói nevet,
         és majd ehhez fogja társítani a játszott játékok számát és a győztes játékok számát.
          A tábla elején mindig a legtöbb játékot nyert játékos neve szerepel majd.
     * A szoftverben az egyik legfontosabb **funkció**, hogy egy szerethető és könnyen kezelhető felületet nyújtsunk a felhasználóknak.
        
## Jelenlegi helyzet

Az akasztófa játék amit szeretnénk ha korszerűsítve lenne igencsak könnyű szabályzattal bír, de a mostani elavult módszerekkel már nehezen követhető a játékmenet vagy akár az egymás közti versengés.
Jelenleg a játék menete papíralapon játszódik ami nehézségekhez vezet mint például sok tárolnivaló papír illetve eredmények és nehezen átláthatóság.
Manapság az ismerettségi körünkból már egyre többen próbálnák ki a játékot aminek köszönhetően megnőne a papír kapacítás.
Ezeknek a gondoknak megfelelően kéne egy új és korszerű játékplatform amivel haladni lehetne a technológiával.
A játék kidolgozása számítógépre igencsak megkönnyítené a mi dolgunkat, mint felhasználók mivel egy helyen láthatnánk mások eredményeit ami motiváló tudna számunkra lenni.
Télen akár az időjárás is tud minket korlátozni mivel este sötétben nem lehet papíralapú játékot játszani csak fény mellett ami drága tud lenni.

 * Papíralapú játék
 
 * Ranglista nélküli játék
 
 * Szabályzat nélküli játék
 
 * Adott felszerelés nélkül játszhatatlan játék
 
 * Átláthatatlan játékvezetés
 
## Jelenlegi üzleti folyamatok modellje

Az alkalmazásunk számos fontos és praktikus funkciókkal rendelkezik.

Az alkalmazás futtatás után az indítóablak jelenik meg, ahol az adatok felvetéle történik.
Az indítóablak futása során a felhasználó nevét eltároljuk az adatbázisukban. 
 
* Az indítóablak menüje ezeket a funkciókat tartalmazza:
  * Felhasználó név megadása
  * Kitalált szó kategóriájának megválasztása
  * Korosztály kiválasztása
  * Alkalmazásból kilépés

* Ezek után a főablakban a játék elkezdésénel a játék úgy fog szót választani, ahogy a felhasználó döntött az indítóablaknál.

* Természetesen a főablak az amely a legtöbb funkciót tartalmazza az alkalmazásunkban.

* Az alábbi folyamatokat és funkciókat tartalmazza a főablak:
 * A kitalált szavak megjelenítése/ eltakarása
 * A betűk felhasználása
 * A hibák jelzése egy bizonyos ábrával
 * Kilépés gomb a játék félbeszakításhoz  
 * Újrakezdési lehetőség ha a hibák összegyűlnek
 * Háttérben a győzelmek számolása. 
 
 * A főablakban kezeljük a felhasználó interakcióit és döntéseit. 
  A program jelzi ha a játékos jól vagy rosszul tippelt. Abban az esetben ha hibázik akkor hibák jelzésre kerülnek.
  Ha jól tippelt akkor a betűk megjelennek a kitalált szóban.
  
  * Hibák összegyűlésénel a játék döntési lehetőséget ajánl fel: Akarunk tovább játszani vagy nem?
  Ha folytatjuk akkor az alkalmazás új szót választ nekünk.
  Abban az esetben, ha nem folytatjuk a játékot, akkor az eredménylistához kerülünk. 
  
  * A kilépés gomb nem az alkalmazás bezárását jelenti. Ehelyett átírányit minket az eredménylistához.
  
  * A legutolsó folyamat a programban az eredménylista megjelenítése.
  
  * Az eredménylista az alábbi funkciókat tartalmazza:
   * Megjeleníti a játékos nevét és győzelmeinek számát.
   * Visszaugró gomb a játékhoz.
   
  * Megtekinthetjük itt a játékosok listáját és a győzelmek számát.
  * A visszaugró gombbal játszhatunk újra, az előző beállítások alapján.  

## Igényelt üzleti folyamatok
## Képernyőtervek

Számunkra a projekt kinézete mindenféleképpen elsőszámú prioritás.
A legfontosabb az, hogy a képernyőn lévő elemek ne legyenek összesűrítve.
A célunk az, hogy minél átláthatóbb és felhasználóbarát legyen.

* Ehhez a JavaFX eszközeit alkalmazzuk. Emellett a JavaFX-hez tartozó SceneBuilder is felhasználásra kerül.
Elsősorban azért, mert ez ismerős számunkra, de emellett azért is mert nem komplikált a használata Java mellett.

### Indítóablak

* Az alkalmazás először is egy indítóablakkal indul. A bejelentkező ablak tartalmaz egy bemeneti mezőt.
A bemeneti mezőben írjuk be a felhasználónevünket amelyet eltárolunk. 
Abban az esetben, ha nem írunk felhasználónevet, akkor a rendszer nem enged tovább.
 
 * Miután sikerült megadni a felhasználóneved, utána a program felkínálja a lehetőséget,hogy kiválaszd a korosztályt és a kitalálandó szókategóriáját.
 
 * Ezután tovább léphetünk a főjátékra. 

### Játékablak
 
 * A képernyő közepén majd láthatjuk a rublikákat amelyek a bizonyos szónak a betűit tárolja.
 A betűk az ablak alján helyezkednek el. Ha egy betűre rányomunk, akkor a rendszer ellenőrzi, hogy vajon a szót tartalmazza az a betű.
 Ha tartalmazza akkor a már említett rublikák helyére bekerül(nek) az adott betű. Ha nem tartalmazza akkor a hiba jelzésre kerül.
 A kattintás után az adott betű át lesz húzva és többet nem lehet felhasználni.

* Segítségünk nem lesz, csak saját magunkra leszünk utalva.
 
 * Játék lefolyása alatt a felhasználónak lehetősége van arra, hogy a játékot félbeszakítsa a játékot.
 
 * Ha a hibák összegyűlnek (11) akkor a játékos elveszíti a játékot. Ezután a program új játékra kéri fel a használót.
 A hibázások után majd egy ábrát láthatunk, ami mindig frissülni fog, ha újra hibás betűt választunk.
 Ha újra játszani akar a felhasználó, akkor a program egy újabb szót választ ki.

### Eredménylista
 
 * Azonban ha a játékos nem akar többet játszani, akkor a program az eredménylistához vezet.
  Az eredménylistában láthatóak, majd a játékos neve, a győzelmeinek száma.
  
 * Emellett lesz egy gomb ami vissza visz a játékba, ha a felhasználó újra játszani szeretne.
 

