package com.example.demo.entidades;

import com.example.demo.repositorio.ClientesRepository;
import com.example.demo.repositorio.MascotasRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Controller;

@Controller
@Transactional
public class DatabaseInit implements ApplicationRunner {

    @Autowired
    MascotasRepository mascotasRepository;

    @Autowired
    ClientesRepository clientesRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Cliente clienteJuan = clientesRepository.save(new Cliente(1023242547, "Juan", "juan@gmail.com", 310254334));
        Cliente clientePedro = clientesRepository.save(new Cliente(1023242548, "Pedro", "pedro@gmail.com", 310254335));
        Cliente clienteMaria = clientesRepository.save(new Cliente(1023242549, "Maria", "maria@gmail.com", 310254336));
        Cliente clienteAna = clientesRepository.save(new Cliente(1023242550, "Ana", "ana@gmail.com", 310254337));
        Cliente clienteJose = clientesRepository.save(new Cliente(1023242551, "Jose", "jose@gmail.com", 310254338));
        Cliente clienteCarlos = clientesRepository.save(new Cliente(1023242552, "Carlos", "carlos@gmail.com", 310254339));
        Cliente clienteLuis = clientesRepository.save(new Cliente(1023242553, "Luis", "luis@gmail.com", 310254340));
        Cliente clienteDiana = clientesRepository.save(new Cliente(1023242554, "Diana", "diana@gmail.com", 310254341));
        Cliente clienteLaura = clientesRepository.save(new Cliente(1023242555, "Laura", "laura@gmail.com", 310254342));
        Cliente clienteMiguel = clientesRepository.save(new Cliente(1023242556, "Miguel", "miguel@gmail.com", 310254343));
        Cliente clienteAndres = clientesRepository.save(new Cliente(1023242557, "Andres", "andres@gmail.com", 310254344));
        Cliente clienteSara = clientesRepository.save(new Cliente(1023242558, "Sara", "sara@gmail.com", 310254345));
        Cliente clienteElena = clientesRepository.save(new Cliente(1023242559, "Elena", "elena@gmail.com", 310254346));
        Cliente clienteFernando = clientesRepository.save(new Cliente(1023242560, "Fernando", "fernando@gmail.com", 310254347));
        Cliente clienteNatalia = clientesRepository.save(new Cliente(1023242561, "Natalia", "natalia@gmail.com", 310254348));
        Cliente clienteFranco = clientesRepository.save(new Cliente(1023242562, "Franco", "franco@gmail.com", 310254349));
        Cliente clienteGiulia = clientesRepository.save(new Cliente(1023242563, "Giulia", "giulia@gmail.com", 310254350));
        Cliente clienteLeonardo = clientesRepository.save(new Cliente(1023242564, "Leonardo", "leonardo@gmail.com", 310254351));
        Cliente clienteSophia = clientesRepository.save(new Cliente(1023242565, "Sophia", "sophia@gmail.com", 310254352));
        Cliente clienteMatteo = clientesRepository.save(new Cliente(1023242566, "Matteo", "matteo@gmail.com", 310254353));
        Cliente clienteLuca = clientesRepository.save(new Cliente(1023242567, "Luca", "luca@gmail.com", 310254354));
        Cliente clienteValeria = clientesRepository.save(new Cliente(1023242568, "Valeria", "valeria@gmail.com", 310254355));
        Cliente clienteMarco = clientesRepository.save(new Cliente(1023242569, "Marco", "marco@gmail.com", 310254356));
        Cliente clienteMartina = clientesRepository.save(new Cliente(1023242570, "Martina", "martina@gmail.com", 310254357));
        Cliente clienteEnzo = clientesRepository.save(new Cliente(1023242571, "Enzo", "enzo@gmail.com", 310254358));
        Cliente clienteAlessandra = clientesRepository.save(new Cliente(1023242572, "Alessandra", "alessandra@gmail.com", 310254359));
        Cliente clienteVincenzo = clientesRepository.save(new Cliente(1023242573, "Vincenzo", "vincenzo@gmail.com", 310254360));
        Cliente clienteGabriela = clientesRepository.save(new Cliente(1023242574, "Gabriela", "gabriela@gmail.com", 310254361));
        Cliente clienteRicardo = clientesRepository.save(new Cliente(1023242575, "Ricardo", "ricardo@gmail.com", 310254362));
        Cliente clienteIsabella = clientesRepository.save(new Cliente(1023242576, "Isabella", "isabella@gmail.com", 310254363));
        Cliente clienteJames = clientesRepository.save(new Cliente(1023242577, "James", "james@gmail.com", 310254364));
        Cliente clienteOlivia = clientesRepository.save(new Cliente(1023242578, "Olivia", "olivia@gmail.com", 310254365));
        Cliente clienteWilliam = clientesRepository.save(new Cliente(1023242579, "William", "william@gmail.com", 310254366));
        Cliente clienteEmma = clientesRepository.save(new Cliente(1023242580, "Emma", "emma@gmail.com", 310254367));
        Cliente clienteBenjamin = clientesRepository.save(new Cliente(1023242581, "Benjamin", "benjamin@gmail.com", 310254368));
        Cliente clienteCharlotte = clientesRepository.save(new Cliente(1023242582, "Charlotte", "charlotte@gmail.com", 310254369));
        Cliente clienteLucas = clientesRepository.save(new Cliente(1023242583, "Lucas", "lucas@gmail.com", 310254370));
        Cliente clienteAva = clientesRepository.save(new Cliente(1023242584, "Ava", "ava@gmail.com", 310254371));
        Cliente clienteHenry = clientesRepository.save(new Cliente(1023242585, "Henry", "henry@gmail.com", 310254372));
        Cliente clienteSophiaUS = clientesRepository.save(new Cliente(1023242586, "Sophia", "sophia.us@gmail.com", 310254373));
        Cliente clienteJackson = clientesRepository.save(new Cliente(1023242587, "Jackson", "jackson@gmail.com", 310254374));
        Cliente clienteAmelia = clientesRepository.save(new Cliente(1023242588, "Amelia", "amelia@gmail.com", 310254375));
        Cliente clienteSebastian = clientesRepository.save(new Cliente(1023242589, "Sebastian", "sebastian@gmail.com", 310254376));
        Cliente clienteMiaUS = clientesRepository.save(new Cliente(1023242590, "Mia", "mia.us@gmail.com", 310254377));
        Cliente clienteMichael = clientesRepository.save(new Cliente(1023242591, "Michael", "michael@gmail.com", 310254378));
        Cliente clienteHarper = clientesRepository.save(new Cliente(1023242592, "Harper", "harper@gmail.com", 310254379));
        Cliente clienteAlexander = clientesRepository.save(new Cliente(1023242593, "Alexander", "alexander@gmail.com", 310254380));
        Cliente clienteEvelyn = clientesRepository.save(new Cliente(1023242594, "Evelyn", "evelyn@gmail.com", 310254381));
        Cliente clienteDaniel = clientesRepository.save(new Cliente(1023242595, "Daniel", "daniel@gmail.com", 310254382));
        Cliente clienteScarlett = clientesRepository.save(new Cliente(1023242596, "Scarlett", "scarlett@gmail.com", 310254383));

        Mascota mascota1 = new Mascota(clienteJuan.getNombre(), "Firulais", "Pastor Aleman", 5, 20, "Ning", true, 0, "dog1.jpg");
        mascota1.setCliente(clienteJuan);
        mascotasRepository.save(mascota1);

        Mascota mascota2 = new Mascota(clientePedro.getNombre(), "Rex", "Bulldog", 3, 15, "Ning", true, 0, "dog2.jpg");
        mascota2.setCliente(clientePedro);
        mascotasRepository.save(mascota2);

        Mascota mascota3 = new Mascota(clienteMaria.getNombre(), "Luna", "Poodle", 2, 10, "Ning", true, 0, "dog3.jpg");
        mascota3.setCliente(clienteMaria);
        mascotasRepository.save(mascota3);

        Mascota mascota4 = new Mascota(clienteAna.getNombre(), "Toby", "Labrador", 4, 25, "Ning", true, 0, "dog4.jpg");
        mascota4.setCliente(clienteAna);
        mascotasRepository.save(mascota4);

        Mascota mascota5 = new Mascota(clienteJose.getNombre(), "Max", "Golden Retriever", 6, 30, "Ning", true, 0, "dog5.jpg");
        mascota5.setCliente(clienteJose);
        mascotasRepository.save(mascota5);

        Mascota mascota6 = new Mascota(clienteCarlos.getNombre(), "Chispa", "Beagle", 4, 12, "Ning", true, 0, "dog6.jpg");
        mascota6.setCliente(clienteCarlos);
        mascotasRepository.save(mascota6);

        Mascota mascota7 = new Mascota(clienteLuis.getNombre(), "Bella", "Chihuahua", 2, 3, "Ning", true, 0, "dog7.jpg");
        mascota7.setCliente(clienteLuis);
        mascotasRepository.save(mascota7);

        Mascota mascota8 = new Mascota(clienteDiana.getNombre(), "Rocky", "Boxer", 5, 22, "Ning", true, 0, "dog8.jpg");
        mascota8.setCliente(clienteDiana);
        mascotasRepository.save(mascota8);

        Mascota mascota9 = new Mascota(clienteLaura.getNombre(), "Nina", "Cocker Spaniel", 3, 10, "Ning", true, 0, "dog9.jpg");
        mascota9.setCliente(clienteLaura);
        mascotasRepository.save(mascota9);

        Mascota mascota10 = new Mascota(clienteMiguel.getNombre(), "Simba", "Shih Tzu", 4, 8, "Ning", true, 0, "dog10.jpg");
        mascota10.setCliente(clienteMiguel);
        mascotasRepository.save(mascota10);

        Mascota mascota11 = new Mascota(clienteAndres.getNombre(), "Bruno", "Dálmata", 6, 25, "Ning", true, 0, "dog11.jpg");
        mascota11.setCliente(clienteAndres);
        mascotasRepository.save(mascota11);

        Mascota mascota12 = new Mascota(clienteSara.getNombre(), "Lola", "Basset Hound", 2, 18, "Ning", true, 0, "dog12.jpg");
        mascota12.setCliente(clienteSara);
        mascotasRepository.save(mascota12);

        Mascota mascota13 = new Mascota(clienteElena.getNombre(), "Tina", "Boston Terrier", 3, 7, "Ning", true, 0, "dog13.jpg");
        mascota13.setCliente(clienteElena);
        mascotasRepository.save(mascota13);

        Mascota mascota14 = new Mascota(clienteFernando.getNombre(), "Duke", "Gran Danés", 5, 40, "Ning", true, 0, "dog14.jpg");
        mascota14.setCliente(clienteFernando);
        mascotasRepository.save(mascota14);

        Mascota mascota15 = new Mascota(clienteNatalia.getNombre(), "Coco", "Pug", 1, 6, "Ning", true, 0, "dog15.jpg");
        mascota15.setCliente(clienteNatalia);
        mascotasRepository.save(mascota15);

        Mascota mascota16 = new Mascota(clienteFranco.getNombre(), "Milo", "Husky", 3, 21, "Ning", true, 0, "dog16.jpg");
        mascota16.setCliente(clienteFranco);
        mascotasRepository.save(mascota16);

        Mascota mascota17 = new Mascota(clienteGiulia.getNombre(), "Bella", "Yorkshire Terrier", 2, 5, "Ning", true, 0, "dog17.jpg");
        mascota17.setCliente(clienteGiulia);
        mascotasRepository.save(mascota17);

        Mascota mascota18 = new Mascota(clienteLeonardo.getNombre(), "Oscar", "Doberman", 4, 32, "Ning", true, 0, "dog18.jpg");
        mascota18.setCliente(clienteLeonardo);
        mascotasRepository.save(mascota18);

        Mascota mascota19 = new Mascota(clienteSophia.getNombre(), "Mia", "Shiba Inu", 3, 12, "Ning", true, 0, "dog19.jpg");
        mascota19.setCliente(clienteSophia);
        mascotasRepository.save(mascota19);

        Mascota mascota20 = new Mascota(clienteMatteo.getNombre(), "Bobby", "Rottweiler", 5, 38, "Ning", true, 0, "dog20.jpg");
        mascota20.setCliente(clienteMatteo);
        mascotasRepository.save(mascota20);

        Mascota mascota21 = new Mascota(clienteLuca.getNombre(), "Gigi", "Bichón Frisé", 4, 8, "Ning", true, 0, "dog21.jpg");
        mascota21.setCliente(clienteLuca);
        mascotasRepository.save(mascota21);

        Mascota mascota22 = new Mascota(clienteValeria.getNombre(), "Pipo", "Corgi", 3, 10, "Ning", true, 0, "dog22.jpg");
        mascota22.setCliente(clienteValeria);
        mascotasRepository.save(mascota22);

        Mascota mascota23 = new Mascota(clienteMarco.getNombre(), "Thor", "Dogo Argentino", 6, 35, "Ning", true, 0, "dog23.jpg");
        mascota23.setCliente(clienteMarco);
        mascotasRepository.save(mascota23);

        Mascota mascota24 = new Mascota(clienteMartina.getNombre(), "Daisy", "Border Collie", 2, 16, "Ning", true, 0, "dog24.jpg");
        mascota24.setCliente(clienteMartina);
        mascotasRepository.save(mascota24);

        Mascota mascota25 = new Mascota(clienteEnzo.getNombre(), "Charlie", "French Bulldog", 4, 12, "Ning", true, 0, "dog25.jpg");
        mascota25.setCliente(clienteEnzo);
        mascotasRepository.save(mascota25);

        Mascota mascota26 = new Mascota(clienteAlessandra.getNombre(), "Sasha", "Jack Russell Terrier", 3, 6, "Ning", true, 0, "dog26.jpg");
        mascota26.setCliente(clienteAlessandra);
        mascotasRepository.save(mascota26);

        Mascota mascota27 = new Mascota(clienteVincenzo.getNombre(), "Max", "Pomerania", 2, 4, "Ning", true, 0, "dog27.jpg");
        mascota27.setCliente(clienteVincenzo);
        mascotasRepository.save(mascota27);

        Mascota mascota28 = new Mascota(clienteGabriela.getNombre(), "Lily", "Cavalier King Charles Spaniel", 1, 7, "Ning", true, 0, "dog28.jpg");
        mascota28.setCliente(clienteGabriela);
        mascotasRepository.save(mascota28);

        Mascota mascota29 = new Mascota(clienteRicardo.getNombre(), "Zeus", "Mastín Napolitano", 5, 45, "Ning", true, 0, "dog29.jpg");
        mascota29.setCliente(clienteRicardo);
        mascotasRepository.save(mascota29);

        Mascota mascota30 = new Mascota(clienteIsabella.getNombre(), "Buddy", "Setter Irlandés", 3, 28, "Ning", true, 0, "dog30.jpg");
        mascota30.setCliente(clienteIsabella);
        mascotasRepository.save(mascota30);

        Mascota mascota31 = new Mascota(clienteJames.getNombre(), "Buddy", "Golden Retriever", 4, 30, "Ning", true, 0, "dog31.jpg");
        mascota31.setCliente(clienteJames);
        mascotasRepository.save(mascota31);

        Mascota mascota32 = new Mascota(clienteOlivia.getNombre(), "Bella", "Labrador Retriever", 3, 25, "Ning", true, 0, "dog32.jpg");
        mascota32.setCliente(clienteOlivia);
        mascotasRepository.save(mascota32);

        Mascota mascota33 = new Mascota(clienteWilliam.getNombre(), "Duke", "German Shepherd", 5, 35, "Ning", true, 0, "dog33.jpg");
        mascota33.setCliente(clienteWilliam);
        mascotasRepository.save(mascota33);

        Mascota mascota34 = new Mascota(clienteEmma.getNombre(), "Lucy", "Cocker Spaniel", 2, 15, "Ning", true, 0, "dog34.jpg");
        mascota34.setCliente(clienteEmma);
        mascotasRepository.save(mascota34);

        Mascota mascota35 = new Mascota(clienteBenjamin.getNombre(), "Max", "Bulldog", 4, 20, "Ning", true, 0, "dog35.jpg");
        mascota35.setCliente(clienteBenjamin);
        mascotasRepository.save(mascota35);

        Mascota mascota36 = new Mascota(clienteCharlotte.getNombre(), "Chloe", "Beagle", 3, 12, "Ning", true, 0, "dog36.jpg");
        mascota36.setCliente(clienteCharlotte);
        mascotasRepository.save(mascota36);

        Mascota mascota37 = new Mascota(clienteLucas.getNombre(), "Oscar", "Boxer", 5, 28, "Ning", true, 0, "dog37.jpg");
        mascota37.setCliente(clienteLucas);
        mascotasRepository.save(mascota37);

        Mascota mascota38 = new Mascota(clienteAva.getNombre(), "Sadie", "Poodle", 2, 8, "Ning", true, 0, "dog38.jpg");
        mascota38.setCliente(clienteAva);
        mascotasRepository.save(mascota38);

        Mascota mascota39 = new Mascota(clienteHenry.getNombre(), "Buster", "Dachshund", 6, 11, "Ning", true, 0, "dog39.jpg");
        mascota39.setCliente(clienteHenry);
        mascotasRepository.save(mascota39);

        Mascota mascota40 = new Mascota(clienteSophiaUS.getNombre(), "Molly", "Shih Tzu", 4, 6, "Ning", true, 0, "dog40.jpg");
        mascota40.setCliente(clienteSophiaUS);
        mascotasRepository.save(mascota40);

        Mascota mascota41 = new Mascota(clienteJackson.getNombre(), "Rocky", "Rottweiler", 5, 40, "Ning", true, 0, "dog41.jpg");
        mascota41.setCliente(clienteJackson);
        mascotasRepository.save(mascota41);

        Mascota mascota42 = new Mascota(clienteAmelia.getNombre(), "Zoe", "Border Collie", 3, 18, "Ning", true, 0, "dog42.jpg");
        mascota42.setCliente(clienteAmelia);
        mascotasRepository.save(mascota42);

        Mascota mascota43 = new Mascota(clienteSebastian.getNombre(), "Cooper", "Australian Shepherd", 4, 23, "Ning", true, 0, "dog43.jpg");
        mascota43.setCliente(clienteSebastian);
        mascotasRepository.save(mascota43);

        Mascota mascota44 = new Mascota(clienteMiaUS.getNombre(), "Roxy", "Dalmatian", 3, 25, "Ning", true, 0, "dog44.jpg");
        mascota44.setCliente(clienteMiaUS);
        mascotasRepository.save(mascota44);

        Mascota mascota45 = new Mascota(clienteMichael.getNombre(), "Maverick", "Pit Bull", 2, 22, "Ning", true, 0, "dog45.jpg");
        mascota45.setCliente(clienteMichael);
        mascotasRepository.save(mascota45);

        Mascota mascota46 = new Mascota(clienteHarper.getNombre(), "Bailey", "Great Dane", 5, 50, "Ning", true, 0, "dog46.jpg");
        mascota46.setCliente(clienteHarper);
        mascotasRepository.save(mascota46);

        Mascota mascota47 = new Mascota(clienteAlexander.getNombre(), "Riley", "Pug", 3, 9, "Ning", true, 0, "dog47.jpg");
        mascota47.setCliente(clienteAlexander);
        mascotasRepository.save(mascota47);

        Mascota mascota48 = new Mascota(clienteEvelyn.getNombre(), "Daisy", "Jack Russell Terrier", 2, 7, "Ning", true, 0, "dog48.jpg");
        mascota48.setCliente(clienteEvelyn);
        mascotasRepository.save(mascota48);

        Mascota mascota49 = new Mascota(clienteDaniel.getNombre(), "Hunter", "Siberian Husky", 4, 24, "Ning", true, 0, "dog49.jpg");
        mascota49.setCliente(clienteDaniel);
        mascotasRepository.save(mascota49);

        Mascota mascota50 = new Mascota(clienteScarlett.getNombre(), "Coco", "Pomeranian", 1, 4, "Ning", true, 0, "dog50.jpg");
        mascota50.setCliente(clienteScarlett);
        mascotasRepository.save(mascota50);

        Mascota mascota51 = new Mascota(clienteJuan.getNombre(), "Shadow", "Weimaraner", 3, 28, "Ning", true, 0, "dog51.jpg");
        mascota51.setCliente(clienteJuan);
        mascotasRepository.save(mascota51);

        Mascota mascota52 = new Mascota(clientePedro.getNombre(), "Chico", "Alaskan Malamute", 4, 40, "Ning", true, 0, "dog52.jpg");
        mascota52.setCliente(clientePedro);
        mascotasRepository.save(mascota52);

        Mascota mascota53 = new Mascota(clienteMaria.getNombre(), "Maddie", "Australian Cattle Dog", 2, 20, "Ning", true, 0, "dog53.jpg");
        mascota53.setCliente(clienteMaria);
        mascotasRepository.save(mascota53);

        Mascota mascota54 = new Mascota(clienteAna.getNombre(), "Oreo", "Dalmatian", 3, 24, "Ning", true, 0, "dog54.jpg");
        mascota54.setCliente(clienteAna);
        mascotasRepository.save(mascota54);

        Mascota mascota55 = new Mascota(clienteJose.getNombre(), "Gunner", "Doberman Pinscher", 4, 35, "Ning", true, 0, "dog55.jpg");
        mascota55.setCliente(clienteJose);
        mascotasRepository.save(mascota55);

        Mascota mascota56 = new Mascota(clienteCarlos.getNombre(), "Zara", "Vizsla", 2, 22, "Ning", true, 0, "dog56.jpg");
        mascota56.setCliente(clienteCarlos);
        mascotasRepository.save(mascota56);

        Mascota mascota57 = new Mascota(clienteLuis.getNombre(), "Nala", "Bernese Mountain Dog", 3, 30, "Ning", true, 0, "dog57.jpg");
        mascota57.setCliente(clienteLuis);
        mascotasRepository.save(mascota57);

        Mascota mascota58 = new Mascota(clienteDiana.getNombre(), "Wally", "Saint Bernard", 5, 50, "Ning", true, 0, "dog58.jpg");
        mascota58.setCliente(clienteDiana);
        mascotasRepository.save(mascota58);

        Mascota mascota59 = new Mascota(clienteLaura.getNombre(), "Milo", "Maltese", 1, 4, "Ning", true, 0, "dog59.jpg");
        mascota59.setCliente(clienteLaura);
        mascotasRepository.save(mascota59);

        Mascota mascota60 = new Mascota(clienteMiguel.getNombre(), "Kona", "Australian Shepherd", 4, 23, "Ning", true, 0, "dog60.jpg");
        mascota60.setCliente(clienteMiguel);
        mascotasRepository.save(mascota60);

        Mascota mascota61 = new Mascota(clienteAndres.getNombre(), "Rex", "Bullmastiff", 6, 45, "Ning", true, 0, "dog61.jpg");
        mascota61.setCliente(clienteAndres);
        mascotasRepository.save(mascota61);

        Mascota mascota62 = new Mascota(clienteSara.getNombre(), "Marley", "Cavalier King Charles Spaniel", 2, 7, "Ning", true, 0, "dog62.jpg");
        mascota62.setCliente(clienteSara);
        mascotasRepository.save(mascota62);

        Mascota mascota63 = new Mascota(clienteElena.getNombre(), "Benny", "Schipperke", 3, 5, "Ning", true, 0, "dog63.jpg");
        mascota63.setCliente(clienteElena);
        mascotasRepository.save(mascota63);

        Mascota mascota64 = new Mascota(clienteFernando.getNombre(), "Finn", "Whippet", 4, 10, "Ning", true, 0, "dog64.jpg");
        mascota64.setCliente(clienteFernando);
        mascotasRepository.save(mascota64);

        Mascota mascota65 = new Mascota(clienteNatalia.getNombre(), "Scout", "Nova Scotia Duck Tolling Retriever", 3, 18, "Ning", true, 0, "dog65.jpg");
        mascota65.setCliente(clienteNatalia);
        mascotasRepository.save(mascota65);

        Mascota mascota66 = new Mascota(clienteFranco.getNombre(), "Diesel", "Akita", 5, 32, "Ning", true, 0, "dog66.jpg");
        mascota66.setCliente(clienteFranco);
        mascotasRepository.save(mascota66);

        Mascota mascota67 = new Mascota(clienteGiulia.getNombre(), "Hazel", "Cairn Terrier", 2, 6, "Ning", true, 0, "dog67.jpg");
        mascota67.setCliente(clienteGiulia);
        mascotasRepository.save(mascota67);

        Mascota mascota68 = new Mascota(clienteLeonardo.getNombre(), "Rusty", "Rhodesian Ridgeback", 4, 36, "Ning", true, 0, "dog68.jpg");
        mascota68.setCliente(clienteLeonardo);
        mascotasRepository.save(mascota68);

        Mascota mascota69 = new Mascota(clienteSophia.getNombre(), "Baxter", "Basset Hound", 6, 30, "Ning", true, 0, "dog69.jpg");
        mascota69.setCliente(clienteSophia);
        mascotasRepository.save(mascota69);

        Mascota mascota70 = new Mascota(clienteMatteo.getNombre(), "Thor", "Great Pyrenees", 4, 40, "Ning", true, 0, "dog70.jpg");
        mascota70.setCliente(clienteMatteo);
        mascotasRepository.save(mascota70);

        Mascota mascota71 = new Mascota(clienteLuca.getNombre(), "Piper", "Papillon", 3, 4, "Ning", true, 0, "dog71.jpg");
        mascota71.setCliente(clienteLuca);
        mascotasRepository.save(mascota71);

        Mascota mascota72 = new Mascota(clienteValeria.getNombre(), "Teddy", "Tibetan Mastiff", 5, 45, "Ning", true, 0, "dog72.jpg");
        mascota72.setCliente(clienteValeria);
        mascotasRepository.save(mascota72);

        Mascota mascota73 = new Mascota(clienteMarco.getNombre(), "Simba", "Samoyed", 2, 20, "Ning", true, 0, "dog73.jpg");
        mascota73.setCliente(clienteMarco);
        mascotasRepository.save(mascota73);

        Mascota mascota74 = new Mascota(clienteMartina.getNombre(), "Apollo", "Dogue de Bordeaux", 4, 45, "Ning", true, 0, "dog74.jpg");
        mascota74.setCliente(clienteMartina);
        mascotasRepository.save(mascota74);

        Mascota mascota75 = new Mascota(clienteEnzo.getNombre(), "Lulu", "Lhasa Apso", 3, 6, "Ning", true, 0, "dog75.jpg");
        mascota75.setCliente(clienteEnzo);
        mascotasRepository.save(mascota75);

        Mascota mascota76 = new Mascota(clienteAlessandra.getNombre(), "Chase", "Border Terrier", 2, 5, "Ning", true, 0, "dog76.jpg");
        mascota76.setCliente(clienteAlessandra);
        mascotasRepository.save(mascota76);

        Mascota mascota77 = new Mascota(clienteVincenzo.getNombre(), "Sadie", "Italian Greyhound", 3, 7, "Ning", true, 0, "dog77.jpg");
        mascota77.setCliente(clienteVincenzo);
        mascotasRepository.save(mascota77);

        Mascota mascota78 = new Mascota(clienteGabriela.getNombre(), "Chico", "Shiba Inu", 2, 10, "Ning", true, 0, "dog78.jpg");
        mascota78.setCliente(clienteGabriela);
        mascotasRepository.save(mascota78);

        Mascota mascota79 = new Mascota(clienteRicardo.getNombre(), "Jet", "Manchester Terrier", 4, 8, "Ning", true, 0, "dog79.jpg");
        mascota79.setCliente(clienteRicardo);
        mascotasRepository.save(mascota79);

        Mascota mascota80 = new Mascota(clienteIsabella.getNombre(), "Ginger", "Airedale Terrier", 5, 22, "Ning", true, 0, "dog80.jpg");
        mascota80.setCliente(clienteIsabella);
        mascotasRepository.save(mascota80);

        Mascota mascota81 = new Mascota(clienteJames.getNombre(), "Lola", "Soft Coated Wheaten Terrier", 3, 18, "Ning", true, 0, "dog81.jpg");
        mascota81.setCliente(clienteJames);
        mascotasRepository.save(mascota81);

        Mascota mascota82 = new Mascota(clienteOlivia.getNombre(), "Dakota", "Flat-Coated Retriever", 6, 34, "Ning", true, 0, "dog82.jpg");
        mascota82.setCliente(clienteOlivia);
        mascotasRepository.save(mascota82);

        Mascota mascota83 = new Mascota(clienteWilliam.getNombre(), "Bobby", "Old English Sheepdog", 4, 40, "Ning", true, 0, "dog83.jpg");
        mascota83.setCliente(clienteWilliam);
        mascotasRepository.save(mascota83);

        Mascota mascota84 = new Mascota(clienteEmma.getNombre(), "Cleo", "Saluki", 3, 20, "Ning", true, 0, "dog84.jpg");
        mascota84.setCliente(clienteEmma);
        mascotasRepository.save(mascota84);

        Mascota mascota85 = new Mascota(clienteBenjamin.getNombre(), "Otis", "American Bulldog", 5, 30, "Ning", true, 0, "dog85.jpg");
        mascota85.setCliente(clienteBenjamin);
        mascotasRepository.save(mascota85);

        Mascota mascota86 = new Mascota(clienteCharlotte.getNombre(), "Sunny", "Briard", 4, 32, "Ning", true, 0, "dog86.jpg");
        mascota86.setCliente(clienteCharlotte);
        mascotasRepository.save(mascota86);

        Mascota mascota87 = new Mascota(clienteLucas.getNombre(), "Ava", "Norwegian Elkhound", 2, 23, "Ning", true, 0, "dog87.jpg");
        mascota87.setCliente(clienteLucas);
        mascotasRepository.save(mascota87);

        Mascota mascota88 = new Mascota(clienteAva.getNombre(), "Murphy", "Welsh Springer Spaniel", 3, 20, "Ning", true, 0, "dog88.jpg");
        mascota88.setCliente(clienteAva);
        mascotasRepository.save(mascota88);

        Mascota mascota89 = new Mascota(clienteHenry.getNombre(), "Buster", "Norwegian Lundehund", 2, 8, "Ning", true, 0, "dog89.jpg");
        mascota89.setCliente(clienteHenry);
        mascotasRepository.save(mascota89);

        Mascota mascota90 = new Mascota(clienteSophiaUS.getNombre(), "Jax", "Chinese Crested", 1, 5, "Ning", true, 0, "dog90.jpg");
        mascota90.setCliente(clienteSophiaUS);
        mascotasRepository.save(mascota90);

        Mascota mascota91 = new Mascota(clienteJackson.getNombre(), "Loki", "Komondor", 4, 60, "Ning", true, 0, "dog91.jpg");
        mascota91.setCliente(clienteJackson);
        mascotasRepository.save(mascota91);

        Mascota mascota92 = new Mascota(clienteAmelia.getNombre(), "Hazel", "Hovawart", 3, 32, "Ning", true, 0, "dog92.jpg");
        mascota92.setCliente(clienteAmelia);
        mascotasRepository.save(mascota92);

        Mascota mascota93 = new Mascota(clienteSebastian.getNombre(), "Storm", "Cane Corso", 5, 50, "Ning", true, 0, "dog93.jpg");
        mascota93.setCliente(clienteSebastian);
        mascotasRepository.save(mascota93);

        Mascota mascota94 = new Mascota(clienteMiaUS.getNombre(), "Foxy", "Pharaoh Hound", 2, 18, "Ning", true, 0, "dog94.jpg");
        mascota94.setCliente(clienteMiaUS);
        mascotasRepository.save(mascota94);

        Mascota mascota95 = new Mascota(clienteMichael.getNombre(), "Goofy", "Lagotto Romagnolo", 4, 25, "Ning", true, 0, "dog95.jpg");
        mascota95.setCliente(clienteMichael);
        mascotasRepository.save(mascota95);

        Mascota mascota96 = new Mascota(clienteHarper.getNombre(), "Maxie", "Swedish Vallhund", 3, 14, "Ning", true, 0, "dog96.jpg");
        mascota96.setCliente(clienteHarper);
        mascotasRepository.save(mascota96);

        Mascota mascota97 = new Mascota(clienteAlexander.getNombre(), "Ella", "Wirehaired Vizsla", 4, 29, "Ning", true, 0, "dog97.jpg");
        mascota97.setCliente(clienteAlexander);
        mascotasRepository.save(mascota97);

        Mascota mascota98 = new Mascota(clienteEvelyn.getNombre(), "Chief", "Perro de Agua Español", 2, 21, "Ning", true, 0, "dog98.jpg");
        mascota98.setCliente(clienteEvelyn);
        mascotasRepository.save(mascota98);

        Mascota mascota99 = new Mascota(clienteDaniel.getNombre(), "Ace", "Norwich Terrier", 3, 5, "Ning", true, 0, "dog99.jpg");
        mascota99.setCliente(clienteDaniel);
        mascotasRepository.save(mascota99);

        Mascota mascota100 = new Mascota(clienteScarlett.getNombre(), "Zelda", "Belgian Laekenois", 4, 27, "Ning", true, 0, "dog100.jpg");
        mascota100.setCliente(clienteScarlett);
        mascotasRepository.save(mascota100);


    }

}
