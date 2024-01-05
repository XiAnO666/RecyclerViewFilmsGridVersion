package com.example.recycleviewfilms

import android.app.DownloadManager

class FilmsProvider {
    companion object{
        val filmsFirstList = listOf<Films>(
            Films(
                title = "Fight Club",
                script = "Un joven sin ilusiones lucha contra su insomnio, consecuencia quizás de su hastío por su gris y rutinaria vida. En un viaje en avión conoce a Tyler Durden, un carismático vendedor de jabón que sostiene una filosofía muy particular: el perfeccionismo es cosa de gentes débiles; en cambio, la autodestrucción es lo único que hace que realmente la vida merezca la pena. Ambos deciden entonces formar un club secreto de lucha donde descargar sus frustaciones y su ira que tendrá un éxito arrollador.",
                year = "1999",
                cartel = "https://image.tmdb.org/t/p/w300_and_h450_bestv2//1yWmCAIGSVNuTOGyz9F48W9g1Ux.jpg"
            ),
            Films(
                title ="El maquinista",
                script = "Trevor Reznik, un empleado de una fábrica, padece desde hace tiempo un grave problema de insomnio, un mal que él esconde y que le provoca serias alucinaciones. Trevor no duerme desde hace un año. La fatiga le ha comportado un horrible deterioro de su condición física y su salud mental. Repelidos por su aspecto físico, sus compañeros de trabajo primero le evitan, y después se volverán contra él cuando uno de ellos pierde un brazo en un incidente en el que Trevor se ve involucrado.",
                year = "2004",
                cartel = "https://image.tmdb.org/t/p/w300_and_h450_bestv2//2z6jtS2dVTbM73USNEewBh7kwX3.jpg"
            ),
            Films(
                title ="Big Fish",
                script = "\"Big Fish\" cuenta la historia entre un padre moribundo, Edward Bloom (Albert Finney), y su hijo Will (Ewan McGregor), quien trata de aprender más acerca de su progenitor, reuniendo las distintas historias que este le ha contado. Así, Will recrea su vida en una serie de leyendas y mitos inspirados por los pocos hechos que conoce. Pero a partir del deseo de su madre Sandy, por reunir al padre con su hijo, este comienza a comprender la debacle de su padre. En sus relatos hay viajes alrededor del mundo, y delirios que incluyen gigantes, tornados y brujas.",
                year = "2003",
                cartel = "https://image.tmdb.org/t/p/w300_and_h450_bestv2//m4gYCeV4GfGDw4PpMgU9kFIaNxP.jpg"
            ),
            Films(
                title ="Captain Fantastic",
                script = "Ben es un padre que ha pasado diez años viviendo en los remotos bosques situados al noroeste del Pacífico criando a sus seis hijos. Sin embargo un día la familia debe abandonar su modo de vida en la naturaleza y volver a la civilización. Asimilar su nueva situación y adaptarse de nuevo a la sociedad moderna no les va a resultar nada sencillo.",
                year = "2016",
                cartel = "https://image.tmdb.org/t/p/w300_and_h450_bestv2//kZHOnykzKPuEVldrzZKqvsNG7sL.jpg"
            ),
            Films(
                title ="Interstellar",
                script = "Narra las aventuras de un grupo de exploradores que hacen uso de un agujero de gusano recientemente descubierto para superar las limitaciones de los viajes espaciales tripulados y vencer las inmensas distancias que tiene un viaje interestelar.",
                year = "2014",
                cartel = "https://image.tmdb.org/t/p/w300_and_h450_bestv2//nrSaXF39nDfAAeLKksRCyvSzI2a.jpg"
            ),
            Films(
                title ="Yo, Daniel Blake",
                script = "Por primera vez en su vida, víctima de problemas cardiacos, Daniel Blake, carpintero inglés de 59 años, se ve obligado a acudir a las ayudas sociales. Sin embargo, a pesar de que el médico le ha prohibido trabajar, la administración le obliga a buscar un empleo si no desea recibir una sanción. En el transcurso de sus citas al “job center”, Daniel se cruza con Rachel, una madre soltera de dos niños que tuvo que aceptar un alojamiento a 450 km de su ciudad para evitar que la envíen a un hogar de acogida. Prisioneros de la maraña de aberraciones administrativas actuales de Gran Bretaña, Daniel y Rachel intentarán ayudarse mutuamente.",
                year = "2016",
                cartel = "https://image.tmdb.org/t/p/w300_and_h450_bestv2//akgb2pVUwOsWa26KyO2UjFoZgWE.jpg"
            ),
            Films(
                title ="Funny Games",
                script = "Anna, su marido George y su hijo de diez años se van a descansar a su residencia de vacaciones situada al lado de un lago. Nada más llegar, aparecen dos jóvenes aparentemente muy educados que dicen ser amigos de los vecinos y que les piden unos huevos. Remake norteamericano de la película homónima de Haneke, de 1997.",
                year = "1997",
                cartel = "https://image.tmdb.org/t/p/w300_and_h450_bestv2//hOOinLAf1hs9knh04BlmJfWmpfX.jpg"
            ),Films(
                title ="La caza",
                script = "Tras un divorcio difícil, Lucas, de cuarenta años, ha encontrado una nueva novia, un nuevo trabajo y se dispone a reconstruir su relación con Marcus, su hijo adolescente. Pero algo va mal. Un detalle. Un comentario inocente. Una mentira fortuita. Y mientras la nieve comienza a caer y las luces de Navidad se iluminan, la mentira se extiende como un virus invisible. El estupor y la desconfianza se propagan y la pequeña comunidad se sumerge en la histeria colectiva, obligando a Lucas a luchar por salvar su vida y su dignidad.",
                year = "2012",
                cartel = "https://image.tmdb.org/t/p/w300_and_h450_bestv2//kOIf3U36sLKaVjO5sUsifCsfQ4i.jpg"
            ),Films(
                title ="Harold y Maude",
                script = "Comedia negra que relata la historia de un joven de buena familia obsesionado con la muerte, hasta el punto de que su pasatiempo favorito es probar diferentes métodos de suicidio. Obtuvo excelentes críticas.",
                year = "1971",
                cartel = "https://image.tmdb.org/t/p/w300_and_h450_bestv2//tEXdC1RB0xWU9t5TffvHs7SctnZ.jpg"
            ),Films(
                title ="Los Goonies",
                script = "Mikey, un muchacho de trece años, que junto con su hermano mayor y sus amigos se hacen llamar 'Los Goonies', decide subir a jugar al desván de su casa, donde su padre guarda antigüedades. Allí, el grupo encuentra el mapa de un tesoro.",
                year = "1985",
                cartel = "https://image.tmdb.org/t/p/w300_and_h450_bestv2//v7dWDGqLS0FHsVpSLNeKo9xlkg1.jpg"
            ),Films(
                title ="El padrino",
                script = "Don Vito Corleone, conocido dentro de los círculos del hampa como 'El Padrino', es el patriarca de una de las cinco familias que ejercen el mando de la Cosa Nostra en Nueva York en los años cuarenta. Don Corleone tiene cuatro hijos: una chica, Connie, y tres varones; Sonny, Michael y Fredo. Cuando el Padrino reclina intervenir en el negocio de estupefacientes, empieza una cruenta lucha de violentos episodios entre las distintas familias del crimen organizado.",
                year = "1972",
                cartel = "https://image.tmdb.org/t/p/w300_and_h450_bestv2//ApiEfzSkrqS4m1L5a2GwWXzIiAs.jpg"
            ),Films(
                title ="Muerte entre las flores",
                script = "Año 1929. Entre dos amigos surge una gran rivalidad a causa del amor de una mujer. Leo, un gángster que domina la ciudad, y Tom, su lugarteniente, se enfrentan en una guerra abierta que desencadenará traiciones, conflictos políticos, corruptelas y escisiones internas.",
                year = "1990",
                cartel = "https://image.tmdb.org/t/p/w300_and_h450_bestv2//6ja0oa1pj7o9StfmaRAJVhTqcsi.jpg"
            ),Films(
                title ="1917",
                script = "1917. La Gran Guerra amenazaba con cambiar, para siempre, el orden mundial. Ante la amenaza que se cernía, Estados Unidos decidió entrar en el conflicto con el objetivo de desequilibrar la balanza que caracterizaba a la contienda.",
                year = "2020",
                cartel = "https://image.tmdb.org/t/p/w300_and_h450_bestv2//axdhbcZeOsfX3ZpwtgdgPIjc06l.jpg"
            ),Films(
                title ="El día de la bestia",
                script = "Un sacerdote cree haber encontrado el mensaje secreto del Apocalipsis según San Juan: El Anticristo nacerá el 25 de diciembre de 1995 en Madrid. Para detener este nacimiento satánico, el cura se une a un joven aficionado al death metal, José María, intentando por todos los medios descubrir en qué parte de Madrid tendrá lugar el apocalíptico evento. Con la ayuda del profesor Cavan, que presenta un programa de televisión sobre el mundo esotérico y sobrenatural, el cura y José Mari invocan al diablo en una extraña ceremonia.",
                year = "1995",
                cartel = "https://image.tmdb.org/t/p/w300_and_h450_bestv2//e6Ogfx9HGvYFZ35fkb7k6fI5XzG.jpg"
            ),Films(
                title ="Pulp Fiction",
                script = "Jules y Vincent, dos asesinos a sueldo con muy pocas luces, trabajan para Marsellus Wallace. Vincent le confiesa a Jules que Marsellus le ha pedido que cuide de Mia, su mujer. Jules le recomienda prudencia porque es muy peligroso sobrepasarse con la novia del jefe. Cuando llega la hora de trabajar, ambos deben ponerse manos a la obra. Su misión: recuperar un misterioso maletín.",
                year = "1995",
                cartel = "https://image.tmdb.org/t/p/w300_and_h450_bestv2//hNcQAuquJxTxl2fJFs1R42DrWcf.jpg"
            ),Films(
                title ="El gran hotel Budapest",
                script = "El Sr. Gustave H., un legendario conserje de un famoso hotel europeo de entreguerras, entabla amistad con Zero Moustafa, un joven empleado al que convierte en su protegido. La historia trata sobre el robo y la recuperación de una pintura renacentista de valor incalculable y sobre la batalla que enfrenta a los miembros de una familia por una inmensa fortuna. Como telón de fondo, los levantamientos que transformaron Europa durante la primera mitad del siglo XX.",
                year = "2014",
                cartel = "https://image.tmdb.org/t/p/w300_and_h450_bestv2//qqwg8WnsFR7uHWvGOoc6S6UUsTi.jpg"
            ),Films(
                title ="Joker",
                script = "Arthur Fleck es un hombre ignorado por la sociedad, cuya motivación en la vida es hacer reír. Pero una serie de trágicos acontecimientos le llevarán a ver el mundo de otra forma. Película basada en Joker, el popular personaje de DC Comics y archivillano de Batman, pero que en este film toma un cariz más realista y oscuro.",
                year = "2019",
                cartel = "https://image.tmdb.org/t/p/w300_and_h450_bestv2//v0eQLbzT6sWelfApuYsEkYpzufl.jpg"
            ),

        )
    }
}