# Rendszerterv
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
## A rendszer célja
## A project tervezete
## A rendszer felépítése
Az adatbázis kapcsolathoz szükséges egy adatbázis connection osztály,
amely létrehozza, fenntartja, és zárja az adatbáziskapcsolatot.
A felhasználóval való kommunikációt javafx-ben íródott interface valósítja
meg, ezek praktikusan külső fájlokból, és forrásból módosított részekből
állnak.
Az adatbázis három lényeges táblája a korosztály, a kategória és a user
tábla lesz.A korosztály és a kategória tábla közti kapcsolatot egy másik,
táblával, egy kapcsolótáblával oldottuk meg. Ez a tábla az általunk az
adatbázisba bevitt szavakat fogja tárolni, és hogy kiszűrjük, hogy egy
szó egy játékosnál csak egyszer szerepeljen, erre hoztuk létre a táblában
a hasznalt boolean típust. Ez majd True-ra vált minden olyan szó mellett,
amelyet már megpróbáltuk kitalálni, függetlenül attól, hogy az eltalálás
sikeres volt e vagy nem. A korosztály táblában lévő leírás szolgál majd
a 3 korosztálytípus, fiatal, középkorú és idős tárolására. A kategória
táblában szereplő névben lesznek tárolva a kategóriák nevei. Az utolsó táblában,
a userben pedig a leaderboardhoz szükséges adatokat fogjuk eltárolni.
A játék végén lesz ez megtekinthető, mégpedig a névben a már megadott
összes játékos neve mellett a játszott és nyert menetek számát láthatjuk majd.
A kezdetekben a kategóriák száma és a tartalmazott szavak limitáltak 
lesznek, ez a jövőben egy továbbfejleszthető opcióként tartjuk számon,
függően az érdeklődéstől.

A program controller részének megvalósítását Java programozási nyelven terveztük el.
A projekthez továbbá felhasználtuk a Maven nevű projekt menedzsment eszköztárat is.

Szavak               |   User              |   Kategória   | Korosztaly
---------------------|---------------------|---------------|-----
ID primary key       | ID primary key      | ID primary key| ID primary key
fk_korosztaly INTEGER| nev VARCHAR         |neve VARCHAR   | leiras VARCHAR
fk_kategoria INTEGER | jatszott INTEGER    |
szo VARCHAR          | nyert INTEGER       |
hasznalt BOOLEAN     |

Másképpen az adatbázis:

![Kép az adatbázisról: ](photos/adatb.png)
## Projectmunkások és felelősségeik
## Ütemterv
## Mérföldkövek
## Üzleti szereplők
## Üzleti folyamatok
## Üzleti entitások
## Követelmények
## Funkcionális követelmények
## Nem funkcionális követelmények
## Funkcionális terv
## Rendszerszereplők
## Rendszerhasználati esetek és lefutásaik
## Menü hierarchiák
## Fizikai környezet
## Fejlesztői eszközök
## Keretrendszer
## Architekturális terv
## Egy architekturális tervezési minta
## Az alkalmazás rétegei, fő komponensei, ezek kapcsolatai
## Rendszer bővíthetősége
## Biztonsági funkciók
## Adatbázis terv
## Logikai adatmodell
## Implementációs terv
## Perzisztencia-osztályok
## Üzleti logika osztályai
## Tesztterv