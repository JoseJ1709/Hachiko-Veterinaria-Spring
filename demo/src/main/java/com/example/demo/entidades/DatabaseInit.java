package com.example.demo.entidades;

import com.example.demo.repositorio.*;
import com.example.demo.servicio.DrogaService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Controller;

import java.sql.Date;

@Controller
@Transactional
public class DatabaseInit implements ApplicationRunner {
    @Autowired
    DrogaService drogaService;

    @Autowired
    MascotasRepository mascotasRepository;

    @Autowired
    ClientesRepository clientesRepository;

    @Autowired
    VeterinariosRepository veterinariosRepository;

    @Autowired
    DrogasRepository drogasRepository;

    @Autowired
    TratamientosRepository tratamientosRepository;

    @Autowired
    AdministradoresRepository administradoresRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {

        Administrador admin1 = new Administrador("admin1", "password1");
        Administrador admin2 = new Administrador("admin2", "password2");
        Administrador admin3 = new Administrador("admin3", "password3");
        Administrador admin4 = new Administrador("admin4", "password4");
        Administrador admin5 = new Administrador("admin5", "password5");

        administradoresRepository.save(admin1);
        administradoresRepository.save(admin2);
        administradoresRepository.save(admin3);
        administradoresRepository.save(admin4);
        administradoresRepository.save(admin5);

        Veterinario vet1 = new Veterinario("Dr. Smith", "123456", "password1", "Cardiología", "foto1.jpg", 2);
        Veterinario vet2 = new Veterinario("Dr. Johnson", "123457", "password2", "Dermatología", "foto2.jpg", 4);
        Veterinario vet3 = new Veterinario("Dr. Williams", "123458", "password3", "Neurología", "foto3.jpg", 10);
        Veterinario vet4 = new Veterinario("Dr. Brown", "123459", "password4", "Oncología", "foto4.jpg", 3);
        Veterinario vet5 = new Veterinario("Dr. Jones", "123460", "password5", "Pediatría", "foto5.jpg", 5);
        Veterinario vet6 = new Veterinario("Dr. Garcia", "123461", "password6", "Cirugía", "foto6.jpg", 7);
        Veterinario vet7 = new Veterinario("Dr. Martinez", "123462", "password7", "Oftalmología", "foto7.jpg", 0);
        Veterinario vet8 = new Veterinario("Dr. Rodriguez", "123463", "password8", "Geriatría", "foto8.jpg", 0);
        Veterinario vet9 = new Veterinario("Dr. Hernandez", "123464", "password9", "Endocrinología", "foto9.jpg", 0);
        Veterinario vet10 = new Veterinario("Dr. Lopez", "123465", "password10", "Nefrología", "foto10.jpg", 0);
      Veterinario vet11 = new Veterinario("Dr. White", "123466", "password11", "Anestesiología", "foto11.jpg", 0);
      Veterinario vet12 = new Veterinario("Dr. Green", "123467", "password12", "Patología", "foto12.jpg", 0);
      Veterinario vet13 = new Veterinario("Dr. Black", "123468", "password13", "Radiología", "foto13.jpg", 0);
      Veterinario vet14 = new Veterinario("Dr. Blue", "123469", "password14", "Toxicología", "foto14.jpg", 0);
      Veterinario vet15 = new Veterinario("Dr. Gray", "123470", "password15", "Microbiología", "foto15.jpg", 0);
      Veterinario vet16 = new Veterinario("Dr. Red", "123471", "password16", "Parasitología", "foto16.jpg", 0);
      Veterinario vet17 = new Veterinario("Dr. Brown", "123472", "password17", "Inmunología", "foto17.jpg", 0);
      Veterinario vet18 = new Veterinario("Dr. Purple", "123473", "password18", "Genética", "foto18.jpg", 0);
      Veterinario vet19 = new Veterinario("Dr. Yellow", "123474", "password19", "Nutrición", "foto19.jpg", 0);
      Veterinario vet20 = new Veterinario("Dr. Orange", "123475", "password20", "Epidemiología", "foto20.jpg", 0);

        vet1 = veterinariosRepository.save(vet1);
        vet2 = veterinariosRepository.save(vet2);
        vet3 = veterinariosRepository.save(vet3);
        vet4 = veterinariosRepository.save(vet4);
        vet5 = veterinariosRepository.save(vet5);
        vet6 = veterinariosRepository.save(vet6);
        vet7 = veterinariosRepository.save(vet7);
        vet8 = veterinariosRepository.save(vet8);
        vet9 = veterinariosRepository.save(vet9);
        vet10 = veterinariosRepository.save(vet10);
        vet11 = veterinariosRepository.save(vet11);
        vet12 = veterinariosRepository.save(vet12);
        vet13 = veterinariosRepository.save(vet13);
        vet14 = veterinariosRepository.save(vet14);
        vet15 = veterinariosRepository.save(vet15);
        vet16 = veterinariosRepository.save(vet16);
        vet17 = veterinariosRepository.save(vet17);
        vet18 = veterinariosRepository.save(vet18);
        vet19 = veterinariosRepository.save(vet19);
        vet20 = veterinariosRepository.save(vet20);


        Droga droga1 = new Droga("Droga A", 100, 150, 50, 10);
        Droga droga2 = new Droga("Droga B", 200, 250, 30, 5);
        Droga droga3 = new Droga("Droga C", 300, 350, 20, 20);
        Droga droga4 = new Droga("Droga D", 400, 450, 10, 4);
        Droga droga5 = new Droga("Droga E", 500, 550, 5, 2);

        droga1 = drogasRepository.save(droga1);
        droga2 = drogasRepository.save(droga2);
        droga3 = drogasRepository.save(droga3);
        droga4 = drogasRepository.save(droga4);
        droga5 = drogasRepository.save(droga5);

        drogaService.cargarDrogras();

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

        Mascota mascota1 = new Mascota("Firulais", "Pastor Aleman", 5, 20, "Ning", true,"https://static.fundacion-affinity.org/cdn/farfuture/PVbbIC-0M9y4fPbbCsdvAD8bcjjtbFc0NSP3lRwlWcE/mtime:1643275542/sites/default/files/los-10-sonidos-principales-del-perro.jpg");
        mascota1.setCliente(clienteJuan);
        mascotasRepository.save(mascota1);

        Mascota mascota2 = new Mascota( "Rex", "Bulldog", 3, 15, "Ning", true,"https://images.pexels.com/photos/406014/pexels-photo-406014.jpeg?auto=compress&cs=tinysrgb&w=600");
        mascota2.setCliente(clientePedro);
        mascotasRepository.save(mascota2);

        Mascota mascota3 = new Mascota("Luna", "Poodle", 2, 10, "Ning", true,"https://images.pexels.com/photos/1805164/pexels-photo-1805164.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota3.setCliente(clienteMaria);
        mascotasRepository.save(mascota3);

        Mascota mascota4 = new Mascota("Toby", "Labrador", 4, 25, "Ning", true,"https://images.pexels.com/photos/1851164/pexels-photo-1851164.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota4.setCliente(clienteAna);
        mascotasRepository.save(mascota4);

        Mascota mascota5 = new Mascota("Max", "Golden Retriever", 6, 30, "Ning", true,"https://images.pexels.com/photos/2253275/pexels-photo-2253275.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota5.setCliente(clienteJose);
        mascotasRepository.save(mascota5);

        Mascota mascota6 = new Mascota( "Chispa", "Beagle", 4, 12, "Ning", true,"https://images.pexels.com/photos/825947/pexels-photo-825947.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota6.setCliente(clienteCarlos);
        mascotasRepository.save(mascota6);

        Mascota mascota7 = new Mascota( "Bella", "Chihuahua", 2, 3, "Ning", true,"https://images.pexels.com/photos/3090875/pexels-photo-3090875.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota7.setCliente(clienteLuis);
        mascotasRepository.save(mascota7);

        Mascota mascota8 = new Mascota("Rocky", "Boxer", 5, 22, "Ning", true,"https://images.pexels.com/photos/1294062/pexels-photo-1294062.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota8.setCliente(clienteDiana);
        mascotasRepository.save(mascota8);

        Mascota mascota9 = new Mascota("Nina", "Cocker Spaniel", 3, 10, "Ning", true,"https://images.pexels.com/photos/8894301/pexels-photo-8894301.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota9.setCliente(clienteLaura);
        mascotasRepository.save(mascota9);

        Mascota mascota10 = new Mascota("Simba", "Shih Tzu", 4, 8, "Ning", true,"https://images.pexels.com/photos/3361739/pexels-photo-3361739.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota10.setCliente(clienteMiguel);
        mascotasRepository.save(mascota10);

        Mascota mascota11 = new Mascota("Bruno", "Dálmata", 6, 25, "Ning", true,"https://images.pexels.com/photos/27153407/pexels-photo-27153407/free-photo-of-dog-near-water-in-black-and-white.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota11.setCliente(clienteAndres);
        mascotasRepository.save(mascota11);

        Mascota mascota12 = new Mascota("Lola", "Basset Hound", 2, 18, "Ning", true,"https://images.pexels.com/photos/754491/pexels-photo-754491.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota12.setCliente(clienteSara);
        mascotasRepository.save(mascota12);

        Mascota mascota13 = new Mascota("Tina", "Boston Terrier", 3, 7, "Ning", true,"https://images.pexels.com/photos/1954515/pexels-photo-1954515.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota13.setCliente(clienteElena);
        mascotasRepository.save(mascota13);

        Mascota mascota14 = new Mascota("Duke", "Gran Danés", 5, 40, "Ning", true,"https://images.pexels.com/photos/532310/pexels-photo-532310.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota14.setCliente(clienteFernando);
        mascotasRepository.save(mascota14);

        Mascota mascota15 = new Mascota("Coco", "Pug", 1, 6, "Ning", true,"https://images.pexels.com/photos/1851188/pexels-photo-1851188.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota15.setCliente(clienteNatalia);
        mascotasRepository.save(mascota15);

        Mascota mascota16 = new Mascota("Milo", "Husky", 3, 21, "Ning", true,"https://images.pexels.com/photos/27073905/pexels-photo-27073905/free-photo-of-portrait-of-husky.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota16.setCliente(clienteFranco);
        mascotasRepository.save(mascota16);

        Mascota mascota17 = new Mascota("Bella", "Yorkshire Terrier", 2, 5, "Ning", true,"https://images.pexels.com/photos/1420405/pexels-photo-1420405.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota17.setCliente(clienteGiulia);
        mascotasRepository.save(mascota17);

        Mascota mascota18 = new Mascota("Oscar", "Doberman", 4, 32, "Ning", true,"https://images.pexels.com/photos/11497215/pexels-photo-11497215.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2g");
        mascota18.setCliente(clienteLeonardo);
        mascotasRepository.save(mascota18);

        Mascota mascota19 = new Mascota("Mia", "Shiba Inu", 3, 12, "Ning", true,"https://images.pexels.com/photos/26793963/pexels-photo-26793963/free-photo-of-a-shiba-dog-sitting-on-the-floor.png?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota19.setCliente(clienteSophia);
        mascotasRepository.save(mascota19);

        Mascota mascota20 = new Mascota("Bobby", "Rottweiler", 5, 38, "Ning", true,"https://images.pexels.com/photos/170325/pexels-photo-170325.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota20.setCliente(clienteMatteo);
        mascotasRepository.save(mascota20);

        Mascota mascota21 = new Mascota("Gigi", "Bichón Frisé", 4, 8, "Ning", true,"https://images.pexels.com/photos/13723455/pexels-photo-13723455.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota21.setCliente(clienteLuca);
        mascotasRepository.save(mascota21);

        Mascota mascota22 = new Mascota("Pipo", "Corgi", 3, 10, "Ning", true,"https://images.pexels.com/photos/27818807/pexels-photo-27818807/free-photo-of-a-corgi-dog-sitting-in-a-park.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota22.setCliente(clienteValeria);
        mascotasRepository.save(mascota22);

        Mascota mascota23 = new Mascota("Thor", "Dogo Argentino", 6, 35, "Ning", true,"https://images.pexels.com/photos/7017660/pexels-photo-7017660.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota23.setCliente(clienteMarco);
        mascotasRepository.save(mascota23);

        Mascota mascota24 = new Mascota("Daisy", "Border Collie", 2, 16, "Ning", true,"https://images.pexels.com/photos/8343330/pexels-photo-8343330.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota24.setCliente(clienteMartina);
        mascotasRepository.save(mascota24);

        Mascota mascota25 = new Mascota("Charlie", "French Bulldog", 4, 12, "Ning", true,"https://images.pexels.com/photos/15677168/pexels-photo-15677168/free-photo-of-dog-standing-on-grass.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota25.setCliente(clienteEnzo);
        mascotasRepository.save(mascota25);

        Mascota mascota26 = new Mascota("Sasha", "Jack Russell Terrier", 3, 6, "Ning", true,"https://images.pexels.com/photos/1750543/pexels-photo-1750543.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota26.setCliente(clienteAlessandra);
        mascotasRepository.save(mascota26);

        Mascota mascota27 = new Mascota("Max", "Pomerania", 2, 4, "Ning", true,"https://images.pexels.com/photos/27132953/pexels-photo-27132953/free-photo-of-portrait-of-a-keeshond-dog.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota27.setCliente(clienteVincenzo);
        mascotasRepository.save(mascota27);

        Mascota mascota28 = new Mascota("Lily", "Cavalier King Charles Spaniel", 1, 7, "Ning", true,"https://images.pexels.com/photos/1390361/pexels-photo-1390361.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota28.setCliente(clienteGabriela);
        mascotasRepository.save(mascota28);

        Mascota mascota29 = new Mascota("Zeus", "Mastín Napolitano", 5, 45, "Ning", true,"https://images.pexels.com/photos/27147726/pexels-photo-27147726/free-photo-of-eurasier-dog-on-leash.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota29.setCliente(clienteRicardo);
        mascotasRepository.save(mascota29);

        Mascota mascota30 = new Mascota("Buddy", "Setter Irlandés", 3, 28, "Ning", true,"https://images.pexels.com/photos/20989921/pexels-photo-20989921/free-photo-of-setter-standing-on-hill.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota30.setCliente(clienteIsabella);
        mascotasRepository.save(mascota30);

        Mascota mascota31 = new Mascota("Buddy", "Golden Retriever", 4, 30, "Ning", true, "https://images.pexels.com/photos/8057474/pexels-photo-8057474.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota31.setCliente(clienteJames);
        mascotasRepository.save(mascota31);

        Mascota mascota32 = new Mascota("Bella", "Labrador Retriever", 3, 25, "Ning", true, "https://images.pexels.com/photos/20449895/pexels-photo-20449895/free-photo-of-labrador-welpe-spielend.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota32.setCliente(clienteOlivia);
        mascotasRepository.save(mascota32);

        Mascota mascota33 = new Mascota("Duke", "German Shepherd", 5, 35, "Ning", true, "https://images.pexels.com/photos/27124732/pexels-photo-27124732/free-photo-of-obedient-german-shepherd.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota33.setCliente(clienteWilliam);
        mascotasRepository.save(mascota33);

        Mascota mascota34 = new Mascota("Lucy", "Cocker Spaniel", 2, 15, "Ning", true, "https://images.pexels.com/photos/4393933/pexels-photo-4393933.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota34.setCliente(clienteEmma);
        mascotasRepository.save(mascota34);

        Mascota mascota35 = new Mascota("Max", "Bulldog", 4, 20, "Ning", true, "https://images.pexels.com/photos/27024363/pexels-photo-27024363/free-photo-of-a-bulldog-sitting-in-front-of-wooden-doors.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota35.setCliente(clienteBenjamin);
        mascotasRepository.save(mascota35);

        Mascota mascota36 = new Mascota("Chloe", "Beagle", 3, 12, "Ning", true, "https://images.pexels.com/photos/27060628/pexels-photo-27060628/free-photo-of-a-beagle-walking-on-the-grass-in-a-park.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota36.setCliente(clienteCharlotte);
        mascotasRepository.save(mascota36);

        Mascota mascota37 = new Mascota("Oscar", "Boxer", 5, 28, "Ning", true, "https://images.pexels.com/photos/605496/pexels-photo-605496.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota37.setCliente(clienteLucas);
        mascotasRepository.save(mascota37);

        Mascota mascota38 = new Mascota("Sadie", "Poodle", 2, 8, "Ning", true, "https://images.pexels.com/photos/27028301/pexels-photo-27028301/free-photo-of-couple-sitting-with-poodle-on-floor-in-house.jpeg?auto=compress&cs=tinysrgb&w=800");
        mascota38.setCliente(clienteAva);
        mascotasRepository.save(mascota38);

        Mascota mascota39 = new Mascota("Buster", "Dachshund", 6, 11, "Ning", true, "https://images.pexels.com/photos/257519/pexels-photo-257519.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota39.setCliente(clienteHenry);
        mascotasRepository.save(mascota39);

        Mascota mascota40 = new Mascota("Molly", "Shih Tzu", 4, 6, "Ning", true, "https://images.pexels.com/photos/2623968/pexels-photo-2623968.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota40.setCliente(clienteSophiaUS);
        mascotasRepository.save(mascota40);

        Mascota mascota41 = new Mascota("Rocky", "Rottweiler", 5, 40, "Ning", true, "https://images.pexels.com/photos/8327652/pexels-photo-8327652.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota41.setCliente(clienteJackson);
        mascotasRepository.save(mascota41);

        Mascota mascota42 = new Mascota("Zoe", "Border Collie", 3, 18, "Ning", true, "https://images.pexels.com/photos/8343334/pexels-photo-8343334.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota42.setCliente(clienteAmelia);
        mascotasRepository.save(mascota42);

        Mascota mascota43 = new Mascota("Cooper", "Australian Shepherd", 4, 23, "Ning", true, "https://images.pexels.com/photos/14666143/pexels-photo-14666143.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota43.setCliente(clienteSebastian);
        mascotasRepository.save(mascota43);

        Mascota mascota44 = new Mascota("Roxy", "Dalmatian", 3, 25, "Ning", true, "https://images.pexels.com/photos/4936221/pexels-photo-4936221.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota44.setCliente(clienteMiaUS);
        mascotasRepository.save(mascota44);

        Mascota mascota45 = new Mascota("Maverick", "Pit Bull", 2, 22, "Ning", true, "https://images.pexels.com/photos/160846/french-bulldog-summer-smile-joy-160846.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota45.setCliente(clienteMichael);
        mascotasRepository.save(mascota45);

        Mascota mascota46 = new Mascota("Bailey", "Great Dane", 5, 50, "Ning", true, "https://images.pexels.com/photos/27153411/pexels-photo-27153411/free-photo-of-a-dog-is-standing-in-the-water-with-its-collar-on.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota46.setCliente(clienteHarper);
        mascotasRepository.save(mascota46);

        Mascota mascota47 = new Mascota("Riley", "Pug", 3, 9, "Ning", true, "https://images.pexels.com/photos/1591939/pexels-photo-1591939.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota47.setCliente(clienteAlexander);
        mascotasRepository.save(mascota47);

        Mascota mascota48 = new Mascota("Daisy", "Jack Russell Terrier", 2, 7, "Ning", true, "https://images.pexels.com/photos/2115604/pexels-photo-2115604.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota48.setCliente(clienteEvelyn);
        mascotasRepository.save(mascota48);

        Mascota mascota49 = new Mascota("Hunter", "Siberian Husky", 4, 24, "Ning", true, "https://images.pexels.com/photos/2853422/pexels-photo-2853422.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota49.setCliente(clienteDaniel);
        mascotasRepository.save(mascota49);

        Mascota mascota50 = new Mascota("Coco", "Pomeranian", 1, 4, "Ning", true, "https://images.pexels.com/photos/3687770/pexels-photo-3687770.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota50.setCliente(clienteScarlett);
        mascotasRepository.save(mascota50);

        Mascota mascota51 = new Mascota("Shadow", "Weimaraner", 3, 28, "Ning", true, "https://images.pexels.com/photos/14730791/pexels-photo-14730791.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota51.setCliente(clienteJuan);
        mascotasRepository.save(mascota51);

        Mascota mascota52 = new Mascota("Chico", "Alaskan Malamute", 4, 40, "Ning", true, "https://images.pexels.com/photos/27035188/pexels-photo-27035188/free-photo-of-an-alaskan-malamute-lying-on-the-grass.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota52.setCliente(clientePedro);
        mascotasRepository.save(mascota52);

        Mascota mascota53 = new Mascota("Maddie", "Australian Cattle Dog", 2, 20, "Ning", true, "https://images.pexels.com/photos/1436134/pexels-photo-1436134.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota53.setCliente(clienteMaria);
        mascotasRepository.save(mascota53);

        Mascota mascota54 = new Mascota("Oreo", "Dalmatian", 3, 24, "Ning", true, "https://images.pexels.com/photos/18279419/pexels-photo-18279419/free-photo-of-dalmatian-in-black-and-white.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota54.setCliente(clienteAna);
        mascotasRepository.save(mascota54);

        Mascota mascota55 = new Mascota("Gunner", "Doberman Pinscher", 4, 35, "Ning", true, "https://images.pexels.com/photos/6585354/pexels-photo-6585354.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota55.setCliente(clienteJose);
        mascotasRepository.save(mascota55);

        Mascota mascota56 = new Mascota("Zara", "Vizsla", 2, 22, "Ning", true, "https://images.pexels.com/photos/2304910/pexels-photo-2304910.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota56.setCliente(clienteCarlos);
        mascotasRepository.save(mascota56);

        Mascota mascota57 = new Mascota("Nala", "Bernese Mountain Dog", 3, 30, "Ning", true, "https://images.pexels.com/photos/4364166/pexels-photo-4364166.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota57.setCliente(clienteLuis);
        mascotasRepository.save(mascota57);

        Mascota mascota58 = new Mascota("Wally", "Saint Bernard", 5, 50, "Ning", true, "https://images.pexels.com/photos/16465602/pexels-photo-16465602/free-photo-of-saint-bernard-dog-in-shelter.jpeg?auto=compress&cs=tinysrgb&w=800");
        mascota58.setCliente(clienteDiana);
        mascotasRepository.save(mascota58);

        Mascota mascota59 = new Mascota("Milo", "Maltese", 1, 4, "Ning", true, "https://images.pexels.com/photos/1458925/pexels-photo-1458925.jpeg");
        mascota59.setCliente(clienteLaura);
        mascotasRepository.save(mascota59);

        Mascota mascota60 = new Mascota("Kona", "Australian Shepherd", 4, 23, "Ning", true, "https://images.pexels.com/photos/7080324/pexels-photo-7080324.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota60.setCliente(clienteMiguel);
        mascotasRepository.save(mascota60);

        Mascota mascota61 = new Mascota("Rex", "Bullmastiff", 6, 45, "Ning", true, "https://images.pexels.com/photos/8368964/pexels-photo-8368964.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota61.setCliente(clienteAndres);
        mascotasRepository.save(mascota61);

        Mascota mascota62 = new Mascota("Marley", "Cavalier King Charles Spaniel", 2, 7, "Ning", true, "https://images.pexels.com/photos/1390361/pexels-photo-1390361.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota62.setCliente(clienteSara);
        mascotasRepository.save(mascota62);

        Mascota mascota63 = new Mascota("Benny", "Schipperke", 3, 5, "Ning", true, "https://images.pexels.com/photos/14320523/pexels-photo-14320523.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota63.setCliente(clienteElena);
        mascotasRepository.save(mascota63);

        Mascota mascota64 = new Mascota("Finn", "Whippet", 4, 10, "Ning", true, "https://images.pexels.com/photos/14320523/pexels-photo-14320523.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota64.setCliente(clienteFernando);
        mascotasRepository.save(mascota64);

        Mascota mascota65 = new Mascota("Scout", "Nova Scotia Duck Tolling Retriever", 3, 18, "Ning", true, "https://images.pexels.com/photos/7516482/pexels-photo-7516482.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota65.setCliente(clienteNatalia);
        mascotasRepository.save(mascota65);

        Mascota mascota66 = new Mascota("Diesel", "Akita", 5, 32, "Ning", true, "https://images.pexels.com/photos/5745209/pexels-photo-5745209.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota66.setCliente(clienteFranco);
        mascotasRepository.save(mascota66);

        Mascota mascota67 = new Mascota("Hazel", "Cairn Terrier", 2, 6, "Ning", true, "https://images.pexels.com/photos/1404727/pexels-photo-1404727.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota67.setCliente(clienteGiulia);
        mascotasRepository.save(mascota67);

        Mascota mascota68 = new Mascota("Rusty", "Rhodesian Ridgeback", 4, 36, "Ning", true, "https://images.pexels.com/photos/53261/pexels-photo-53261.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota68.setCliente(clienteLeonardo);
        mascotasRepository.save(mascota68);

        Mascota mascota69 = new Mascota("Baxter", "Basset Hound", 6, 30, "Ning", true, "https://images.pexels.com/photos/1582835/pexels-photo-1582835.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota69.setCliente(clienteSophia);
        mascotasRepository.save(mascota69);

        Mascota mascota70 = new Mascota("Thor", "Great Pyrenees", 4, 40, "Ning", true, "https://images.pexels.com/photos/213232/pexels-photo-213232.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota70.setCliente(clienteMatteo);
        mascotasRepository.save(mascota70);

        Mascota mascota71 = new Mascota("Piper", "Papillon", 3, 4, "Ning", true, "https://images.pexels.com/photos/3969716/pexels-photo-3969716.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota71.setCliente(clienteLuca);
        mascotasRepository.save(mascota71);

        Mascota mascota72 = new Mascota("Teddy", "Tibetan Mastiff", 5, 45, "Ning", true, "https://images.pexels.com/photos/26852089/pexels-photo-26852089/free-photo-of-head-of-tibetan-spaniel-dog.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota72.setCliente(clienteValeria);
        mascotasRepository.save(mascota72);

        Mascota mascota73 = new Mascota("Simba", "Samoyed", 2, 20, "Ning", true, "https://images.pexels.com/photos/27065577/pexels-photo-27065577/free-photo-of-a-samoyed-dog-sitting-on-a-field.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota73.setCliente(clienteMarco);
        mascotasRepository.save(mascota73);

        Mascota mascota74 = new Mascota("Apollo", "Dogue de Bordeaux", 4, 45, "Ning", true, "https://images.pexels.com/photos/23528662/pexels-photo-23528662/free-photo-of-bordeaux-mastiff-dog-sitting-on-grass-with-his-tongue-out.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota74.setCliente(clienteMartina);
        mascotasRepository.save(mascota74);

        Mascota mascota75 = new Mascota("Lulu", "Lhasa Apso", 3, 6, "Ning", true, "https://images.pexels.com/photos/11642573/pexels-photo-11642573.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota75.setCliente(clienteEnzo);
        mascotasRepository.save(mascota75);

        Mascota mascota76 = new Mascota("Chase", "Border Terrier", 2, 5, "Ning", true, "https://images.pexels.com/photos/5733174/pexels-photo-5733174.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota76.setCliente(clienteAlessandra);
        mascotasRepository.save(mascota76);

        Mascota mascota77 = new Mascota("Sadie", "Italian Greyhound", 3, 7, "Ning", true, "https://images.pexels.com/photos/27016771/pexels-photo-27016771/free-photo-of-greyhound-relaxing-on-patio.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota77.setCliente(clienteVincenzo);
        mascotasRepository.save(mascota77);

        Mascota mascota78 = new Mascota("Chico", "Shiba Inu", 2, 10, "Ning", true, "https://images.pexels.com/photos/4587979/pexels-photo-4587979.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota78.setCliente(clienteGabriela);
        mascotasRepository.save(mascota78);

        Mascota mascota79 = new Mascota("Jet", "Manchester Terrier", 4, 8, "Ning", true, "https://images.pexels.com/photos/27038193/pexels-photo-27038193/free-photo-of-dog-on-grass-at-field.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota79.setCliente(clienteRicardo);
        mascotasRepository.save(mascota79);

        Mascota mascota80 = new Mascota("Ginger", "Airedale Terrier", 5, 22, "Ning", true, "https://images.pexels.com/photos/17656008/pexels-photo-17656008/free-photo-of-airedale-terrier-on-leash.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota80.setCliente(clienteIsabella);
        mascotasRepository.save(mascota80);

        Mascota mascota81 = new Mascota("Lola", "Soft Coated Wheaten Terrier", 3, 18, "Ning", true, "https://images.pexels.com/photos/9922532/pexels-photo-9922532.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota81.setCliente(clienteJames);
        mascotasRepository.save(mascota81);

        Mascota mascota82 = new Mascota("Dakota", "Flat-Coated Retriever", 6, 34, "Ning", true, "https://images.pexels.com/photos/27434758/pexels-photo-27434758/free-photo-of-a-white-puppy-with-brown-eyes-is-looking-at-the-camera.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota82.setCliente(clienteOlivia);
        mascotasRepository.save(mascota82);

        Mascota mascota83 = new Mascota("Bobby", "Old English Sheepdog", 4, 40, "Ning", true, "https://images.pexels.com/photos/21939284/pexels-photo-21939284/free-photo-of-portrait-of-boy-with-old-english-sheepdog.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota83.setCliente(clienteWilliam);
        mascotasRepository.save(mascota83);

        Mascota mascota84 = new Mascota("Cleo", "Saluki", 3, 20, "Ning", true, "https://images.pexels.com/photos/1573919/pexels-photo-1573919.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota84.setCliente(clienteEmma);
        mascotasRepository.save(mascota84);

        Mascota mascota85 = new Mascota("Otis", "American Bulldog", 5, 30, "Ning", true, "https://images.pexels.com/photos/5766668/pexels-photo-5766668.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota85.setCliente(clienteBenjamin);
        mascotasRepository.save(mascota85);

        Mascota mascota86 = new Mascota("Sunny", "Briard", 4, 32, "Ning", true, "https://images.pexels.com/photos/27152412/pexels-photo-27152412/free-photo-of-dog-on-the-beach.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota86.setCliente(clienteCharlotte);
        mascotasRepository.save(mascota86);

        Mascota mascota87 = new Mascota("Ava", "Norwegian Elkhound", 2, 23, "Ning", true, "https://images.pexels.com/photos/20462535/pexels-photo-20462535/free-photo-of-photo-of-a-dog-standing-on-the-snow.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota87.setCliente(clienteLucas);
        mascotasRepository.save(mascota87);

        Mascota mascota88 = new Mascota("Murphy", "Welsh Springer Spaniel", 3, 20, "Ning", true, "https://images.pexels.com/photos/8734432/pexels-photo-8734432.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota88.setCliente(clienteAva);
        mascotasRepository.save(mascota88);

        Mascota mascota89 = new Mascota("Buster", "Norwegian Lundehund", 2, 8, "Ning", true, "https://images.pexels.com/photos/11675900/pexels-photo-11675900.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota89.setCliente(clienteHenry);
        mascotasRepository.save(mascota89);

        Mascota mascota90 = new Mascota("Jax", "Chinese Crested", 1, 5, "Ning", true, "https://images.pexels.com/photos/27668729/pexels-photo-27668729/free-photo-of-portrait-of-chinese-dog.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota90.setCliente(clienteSophiaUS);
        mascotasRepository.save(mascota90);

        Mascota mascota91 = new Mascota("Loki", "Komondor", 4, 60, "Ning", true, "https://images.pexels.com/photos/27794391/pexels-photo-27794391/free-photo-of-close-up-of-a-dog.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota91.setCliente(clienteJackson);
        mascotasRepository.save(mascota91);

        Mascota mascota92 = new Mascota("Hazel", "Hovawart", 3, 32, "Ning", true, "https://images.pexels.com/photos/4297811/pexels-photo-4297811.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota92.setCliente(clienteAmelia);
        mascotasRepository.save(mascota92);

        Mascota mascota93 = new Mascota("Storm", "Cane Corso", 5, 50, "Ning", true, "https://images.pexels.com/photos/5029647/pexels-photo-5029647.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota93.setCliente(clienteSebastian);
        mascotasRepository.save(mascota93);

        Mascota mascota94 = new Mascota("Foxy", "Hound", 2, 18, "Ning", true, "https://images.pexels.com/photos/1582835/pexels-photo-1582835.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota94.setCliente(clienteMiaUS);
        mascotasRepository.save(mascota94);

        Mascota mascota95 = new Mascota("Goofy", "Lagotto Romagnolo", 4, 25, "Ning", true, "https://images.pexels.com/photos/11003088/pexels-photo-11003088.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota95.setCliente(clienteMichael);
        mascotasRepository.save(mascota95);

        Mascota mascota96 = new Mascota("Maxie", "Swedish Vallhund", 3, 14, "Ning", true, "https://images.pexels.com/photos/10249033/pexels-photo-10249033.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota96.setCliente(clienteHarper);
        mascotasRepository.save(mascota96);

        Mascota mascota97 = new Mascota("Ella", "Wirehaired Vizsla", 4, 29, "Ning", false, "https://images.pexels.com/photos/19221918/pexels-photo-19221918/free-photo-of-water-dripping-from-the-wet-muzzle-of-a-dog-standing-in-a-river-in-winter.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota97.setCliente(clienteAlexander);
        mascotasRepository.save(mascota97);

        Mascota mascota98 = new Mascota("Chief", "Perro de Agua Español", 2, 21, "Ning", false, "https://images.pexels.com/photos/9111572/pexels-photo-9111572.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota98.setCliente(clienteEvelyn);
        mascotasRepository.save(mascota98);

        Mascota mascota99 = new Mascota("Ace", "Norwich Terrier", 3, 5, "Ning", false, "https://images.pexels.com/photos/7210283/pexels-photo-7210283.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota99.setCliente(clienteDaniel);
        mascotasRepository.save(mascota99);

        Mascota mascota100 = new Mascota("Zelda", "Belgian Laekenois", 4, 27, "Ning", false, "https://images.pexels.com/photos/5431404/pexels-photo-5431404.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2");
        mascota100.setCliente(clienteScarlett);
        mascotasRepository.save(mascota100);



        // Crear 10 tratamientos, cada uno con un veterinario, una droga y una mascota
        Tratamiento tratamiento1 = new Tratamiento(new Date(System.currentTimeMillis()));
        tratamiento1.setVeterinario(vet1);
        tratamiento1.setDroga(droga1);
        tratamiento1.setMascota(mascota1);
        tratamientosRepository.save(tratamiento1);

        Tratamiento tratamiento2 = new Tratamiento(new Date(System.currentTimeMillis()));
        tratamiento2.setVeterinario(vet2);
        tratamiento2.setDroga(droga2);
        tratamiento2.setMascota(mascota2);
        tratamientosRepository.save(tratamiento2);

        Tratamiento tratamiento3 = new Tratamiento(new Date(System.currentTimeMillis()));
        tratamiento3.setVeterinario(vet3);
        tratamiento3.setDroga(droga3);
        tratamiento3.setMascota(mascota3);
        tratamientosRepository.save(tratamiento3);

        Tratamiento tratamiento4 = new Tratamiento(new Date(System.currentTimeMillis()));
        tratamiento4.setVeterinario(vet4);
        tratamiento4.setDroga(droga4);
        tratamiento4.setMascota(mascota4);
        tratamientosRepository.save(tratamiento4);

        Tratamiento tratamiento5 = new Tratamiento(new Date(System.currentTimeMillis()));
        tratamiento5.setVeterinario(vet5);
        tratamiento5.setDroga(droga5);
        tratamiento5.setMascota(mascota5);
        tratamientosRepository.save(tratamiento5);

        Tratamiento tratamiento6 = new Tratamiento(new Date(System.currentTimeMillis()));
        tratamiento6.setVeterinario(vet6);
        tratamiento6.setDroga(droga1);
        tratamiento6.setMascota(mascota6);
        tratamientosRepository.save(tratamiento6);

        Tratamiento tratamiento7 = new Tratamiento(new Date(System.currentTimeMillis()));
        tratamiento7.setVeterinario(vet7);
        tratamiento7.setDroga(droga2);
        tratamiento7.setMascota(mascota7);
        tratamientosRepository.save(tratamiento7);

        Tratamiento tratamiento8 = new Tratamiento(new Date(System.currentTimeMillis()));
        tratamiento8.setVeterinario(vet8);
        tratamiento8.setDroga(droga3);
        tratamiento8.setMascota(mascota8);
        tratamientosRepository.save(tratamiento8);

        Tratamiento tratamiento9 = new Tratamiento(new Date(System.currentTimeMillis()));
        tratamiento9.setVeterinario(vet9);
        tratamiento9.setDroga(droga4);
        tratamiento9.setMascota(mascota9);
        tratamientosRepository.save(tratamiento9);

        Tratamiento tratamiento10 = new Tratamiento(new Date(System.currentTimeMillis()));
        tratamiento10.setVeterinario(vet10);
        tratamiento10.setDroga(droga5);
        tratamiento10.setMascota(mascota10);
        tratamientosRepository.save(tratamiento10);



    }

}
