import java.util.Scanner;
import java.util.Random;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class InkaArraysList {
    static Scanner scan = new Scanner(System.in);
    static String StatusUser= "Invitado";
    static boolean AccesoCompra = false;
    static int SelectUser;
    static ArrayList<String> NameUser = new ArrayList<>();
    static ArrayList<String> EmailRegister = new ArrayList<>();
    static ArrayList<String> ContraRegister = new ArrayList<>();
    static boolean Admin= false;
   
    static ArrayList<String> CuidaRespiratorio = new ArrayList<>();
    static ArrayList<String> Dermatologia = new ArrayList<>();
    static ArrayList<String> Vitaminas = new ArrayList<>();
    static ArrayList<String> CuidaCabello = new ArrayList<>();

    static ArrayList<Integer> CarriKewin = new ArrayList<>();
    static ArrayList<Integer> CarriAlan = new ArrayList<>();
    static ArrayList<Integer> CarriJohan = new ArrayList<>();
    static ArrayList<Integer> CarriShiron = new ArrayList<>();

    static ArrayList<Double> PreRespi = new ArrayList<>();
    static ArrayList<Double> PreDerma = new ArrayList<>();
    static ArrayList<Double> PreVita = new ArrayList<>();
    static ArrayList<Double> PreCabello = new ArrayList<>();



    public static void DatRespiratorio() {
        CuidaRespiratorio.add("Vick Vaporub 12g");
        PreRespi.add(2.98);
        CuidaRespiratorio.add("Vick Vaporub 50g");
        PreRespi.add(10.8);
        CuidaRespiratorio.add("Vick Vaporub 100g");
        PreRespi.add(16.30);
        CuidaRespiratorio.add("Nastizol Forte");
        PreRespi.add(10.79);
        CuidaRespiratorio.add("Nastizol Junior");
        PreRespi.add(6.0);
        CuidaRespiratorio.add("Nastizol Multisíntomas");
        PreRespi.add(1.57);
        CuidaRespiratorio.add("Vitapyrena Forte miel limon");
        PreRespi.add(2.1);
        CuidaRespiratorio.add("Pharamol Antigripal");
        PreRespi.add(1.9);
        CuidaRespiratorio.add("Don gripa x100");
        PreRespi.add(90.0);
        CuidaRespiratorio.add("Teragran x100");
        PreRespi.add(140.0);
    }

    public static void DatDermato() {
        Dermatologia.add("Gel Limpiador");
        PreDerma.add(89.9);
        Dermatologia.add("Crema Hidratante CeraVe");
        PreDerma.add(68.5);
        Dermatologia.add("Gel Cream, Eucerin");
        PreDerma.add(105.0);
        Dermatologia.add("Serum Hyalu B-5");
        PreDerma.add(169.0);
        Dermatologia.add("Mineral 89Vivhy");
        PreDerma.add(124.0);
        Dermatologia.add("Agua Micelar Bioderma");
        PreDerma.add(55.0);
        Dermatologia.add("Hydro Boost Water");
        PreDerma.add(49.9);
        Dermatologia.add("Cicanplast Baume B5");
        PreDerma.add(98.5);
        Dermatologia.add("effaclar Duo Roche-Posay");
        PreDerma.add(132.0);
        Dermatologia.add("Crema Facial Nivea Soft");
        PreDerma.add(35.0);
    }

    public static void DatVitaminas() {
        Vitaminas.add("Vithaton Gragea x30");
        PreVita.add(39.0);
        Vitaminas.add("Prevenel x50");
        PreVita.add(30.35);
        Vitaminas.add("Pirixodina x100");
        PreVita.add(40.0);
        Vitaminas.add("Aneurin Forte NF x10");
        PreVita.add(17.5);
        Vitaminas.add("Dynamogen x20");
        PreVita.add(66.2);
        Vitaminas.add("Calcitriol 0.25mg x10");
        PreVita.add(215.0);
        Vitaminas.add("Trimetabol 100ml");
        PreVita.add(25.4);
        Vitaminas.add("Vitacose Plus x2 ");
        PreVita.add(18.6);
        Vitaminas.add("Mucovit Jarabe 110ml");
        PreVita.add(34.0);
        Vitaminas.add("Cefasel 100mcg x20");
        PreVita.add(48.10);
    }

    public static void DatCabello() {
        CuidaCabello.add("Shampoo Sedal Ceramidas");
        PreCabello.add(15.0);
        CuidaCabello.add("Acondicionador Pantene");
        PreCabello.add(16.5);
        CuidaCabello.add("Shampoo Loreal Elvive");
        PreCabello.add(19.9);
        CuidaCabello.add("Shampooo Head and Shoulders");
        PreCabello.add(18.0);
        CuidaCabello.add("Acondicionador Herbal Essences");
        PreCabello.add(22.0);
        CuidaCabello.add("Shampoo Konzil Keratina");
        PreCabello.add(14.0);
        CuidaCabello.add("Crema de Peinar Garnier");
        PreCabello.add(13.5);
        CuidaCabello.add("Shampoo Jhonsons Baby");
        PreCabello.add(12.0);
        CuidaCabello.add("Mascarilla Kerastase Nutritive");
        PreCabello.add(120.0);
        CuidaCabello.add("Shampoo Ogx Biotina y Colageno");
        PreCabello.add(32.9);
    }
    private static void CorreosContrase(){
        NameUser.add("Administrador");NameUser.add("Alan");
        EmailRegister.add("Admin@com");EmailRegister.add("alanyucra@com");
        ContraRegister.add("admin1234");ContraRegister.add("123abcd");
    }

    static void main(String[] args) {
        DatRespiratorio();
        DatVitaminas();
        DatDermato();
        DatCabello();
        CorreosContrase();
        while (true) {
            System.out.print("╔=====================================╗" +
                    "\n╟           METODO DE INGRESO         ╢" +
                    "\n╚=====================================╝" +
                    "\nStatus Usuario: "+StatusUser +"  Admin: "+Admin+
                    "\n1) Iniciar Sesion       3) Entrar al Menu" +
                    "\n2) Crear Cuenta         ");
            if (Admin) {
                System.out.println("4) Panel de Admin");
            } else {
                System.out.println("\u001B[90m4) Panel de Admin\u001B[0m");
            }
            int opcMet = scan.nextInt();
            switch (opcMet) {
                case 0:
                    System.exit(0);
                case 1:InicioSesion();
                    break;
                case 2:
                    CreaCuenta();
                    break;
                case 3:
                    MenuInkafarma();
                    break;
                case 4:
                    if(!Admin) {
                        System.out.println("Aun no puedes seleccionar esa opcion");
                    }else {
                        Admininistrador();
                    }
                default:
                    System.out.println("Opcion no válida.");
            }
        }
    }
    public static void InicioSesion() {
        System.out.println("╔=======================================╗");
        System.out.println("╟            INICIO DE SESION           ╢");
        System.out.println("╚=======================================╝");
        System.out.println("Seleccione el Usuario al que va a ingresar: ");
        while(true) {
            if (Admin) {
                System.out.println("\u001B[90m1) Admininistrador\u001B[0m");
            } else {
                System.out.println("1) Administrador");
            }
            for (int i = 1; i < NameUser.size(); i++) {
                System.out.println((i + 1) + ") " + NameUser.get(i));
            }
            System.out.println((NameUser.size()+1)+") Atras");
            SelectUser = scan.nextInt();
            if (SelectUser == 0) {
                System.exit(0);
            }else if(SelectUser<0&&SelectUser>NameUser.size()+1) {
                System.out.println("Opcion no valida");
                continue;
            }else if(SelectUser==NameUser.size()+1){
                return;
            } else if (Admin && SelectUser == 1) {
                System.out.println("\n==== Ya Tienes el admin activado.====");
                continue;
            }
            break;
        }
        int intentos = 3;
        while (true) {
            System.out.println("Tienes " + intentos + " intentos.");
            System.out.print("Ingrese su correo:");
            String correo = scan.next();
            if (correo.equals("a")) {
                break;
            }
            System.out.print("Ingrese su contraseña:");
            String contra = scan.next();
            if (!correo.equals(EmailRegister.get(SelectUser - 1)) || !contra.equals(ContraRegister.get(SelectUser - 1))) {
                System.out.println("------Correo o contraseña incorrecto--------\n\n");
                intentos--;
                if (intentos == 0) {
                    System.out.println("Fallastes 3 intenetos, se bloquera por 10 segundos.");
                    try {
                        for (int i = 10; i >= 1; i--) {
                            System.out.println(i + " segundos");
                            Thread.sleep(1000);
                        }
                    } catch (InterruptedException o) {
                        o.printStackTrace();
                    }
                    intentos+=3;
                }
                continue;
            } else if (!Admin && correo.equals(EmailRegister.getFirst()) && correo.equals(EmailRegister.getFirst())) {
                Admin = true;
            }else {
                System.out.println("=========== Tienes acceso a compra ==========");
                StatusUser = "Cliente";
                AccesoCompra = true;
            }
            break;
        }
    }
    public static void CreaCuenta() {
        System.out.println("============= CREAR CUENTA ============");
        String newUser,newCore, newContr;
        while(true) {
            System.out.print("Ingrese un nombre de usuario: ");
            newUser = scan.next();
            if(newUser.length()>20){
                System.out.println("El nombre de Usuario debe al maximo 20 digitos");
            continue;
            }
            break;
        }
        while (true) {
            System.out.print("Ingrese el correo: ");
            newCore = scan.next();
            if (!newCore.contains("@")) {
                System.out.println("El Correo debe contener \"@\".");
                continue;
            }
            break;
        }
        while (true) {
            System.out.print("Ingrese la contraseña: ");
            newContr = scan.next();
            if (newContr.length() < 6) {
                System.out.println("La contraseña debe tener minimo 6 digigtos.");
                continue;
            }
            break;
        }
        NameUser.add(newUser);
        EmailRegister.add(newCore);
        ContraRegister.add(newContr);

    }
    public static void ListaKewin(){
        for (int i = 0; i < CuidaRespiratorio.size(); i++) {
            System.out.printf("%-2d) %-30s%.2f%n", (i + 1), CuidaRespiratorio.get(i), PreRespi.get(i));
        }
        System.out.println((CuidaRespiratorio.size()+1)+") Atras");
    }

    public static void ListaAlan(){
        for (int i = 0; i < Vitaminas.size(); i++) {
            System.out.printf("%-2d) %-25s%.2f%n", (i + 1), Vitaminas.get(i), PreVita.get(i));
        }
        System.out.println((Vitaminas.size()+1)+") Atras");
    }

    public static void ListaJohan(){
        for (int i = 0; i < Dermatologia.size(); i++) {
            System.out.printf("%-2d) %-28s%.2f%n", (i + 1), Dermatologia.get(i), PreDerma.get(i));
        }
        System.out.println((Dermatologia.size()+1)+") Atras");
    }

    public static void ListaShiro(){
        for (int i = 0; i < CuidaCabello.size(); i++) {
            System.out.printf("%-2d) %-34s%.2f%n", (i + 1), CuidaCabello.get(i), PreCabello.get(i));
        }
        System.out.println((CuidaCabello.size()+1)+") Atras");
    }

    public static void Admininistrador(){
        while(true){
            System.out.println("╔=====================================╗");
            System.out.println("╟        PANEL DE ADMINISTRADOR       ╢");
            System.out.println("╚=====================================╝");
            System.out.println("1) Agregar            4) Buscar");
            System.out.println("2) Eliminar           5) Atras");
            System.out.println("3) Modificar");
            int opcAdmin = scan.nextInt();
            switch (opcAdmin) {
                case 0:
                    System.out.println("Sistema cerrando");
                    System.exit(0);
                case 1:Agregar();
                    break;
                case 2:Eliminar();
                    break;
                case 3:Modificar();
                    break;
                case 4:Buscar();
                    break;
                case 5:return;
                default:System.out.println("Ingrese la cpcion correcta");
            }
        }
    }

    public static void Agregar(){
        while(true){
            System.out.println("============ AGREGAR PRODUCTOS ============");
            System.out.println("1) Cuiddado respiratorios");
            System.out.println("2) Vitaminas y complementos");
            System.out.println("3) Cuidado de la piel");
            System.out.println("4) Cuidado del cabello");
            System.out.println("5) Atras");
            int opcAdd = scan.nextInt();
            scan.nextLine();
            switch (opcAdd){
                case 0: System.exit(0);
                case 1:System.out.println("============ Cuidados Respiratorios ===========");
                    System.out.print("Ingrese el nombre del producto: ");
                    CuidaRespiratorio.add(scan.nextLine());
                    System.out.print("Ingrese su precio: ");
                    PreRespi.add(scan.nextDouble());
                    break;
                case 2: System.out.println("============ Vitaminas y complementos ===========");
                    System.out.print("Ingrese el nombre del producto: ");
                    Vitaminas.add(scan.nextLine());
                    System.out.print("Ingrese su precio: ");
                    PreVita.add(scan.nextDouble());
                    break;
                case 3: System.out.println("=============== Dermatologia ===============");
                    System.out.print("Ingrese el nombre del producto: ");
                    Dermatologia.add(scan.nextLine());
                    System.out.print("Ingrese su precio: ");
                    PreDerma.add(scan.nextDouble());
                    break;
                case 4:System.out.println("=============== Cuidados del Cabello ===============");
                    System.out.print("Ingrese el nombre del producto: ");
                    CuidaCabello.add(scan.nextLine());
                    System.out.print("Ingrese su precio: ");
                    PreCabello.add(scan.nextDouble());
                    break;
                case 5:return;
                default: System.out.println("Opocion no válida.");
            }
        }
    }

    public static void Eliminar(){
        while(true){
            System.out.println("============ ELIMINAR PRODUCTOS ============");
            System.out.println("1) Cuiddado respiratorios");
            System.out.println("2) Vitaminas y complementos");
            System.out.println("3) Cuidado de la piel");
            System.out.println("4) Cuidado del cabello");
            System.out.println("5) Atras");
            int opcERemove = scan.nextInt();
            switch (opcERemove) {
                case 0:
                    System.exit(0);
                case 1:while(true) {
                    System.out.println("============== CUIDADOS RESPIRATORIOS ==============");
                    ListaKewin();
                    int RemoveRespi = scan.nextInt();
                    if (RemoveRespi == 0) {
                        System.exit(0);
                    }else if(RemoveRespi==CuidaRespiratorio.size()+1){
                        break;
                    } else if (RemoveRespi > 0 && RemoveRespi <=CuidaRespiratorio.size()) {
                        CuidaRespiratorio.remove(RemoveRespi - 1);
                        PreRespi.remove(RemoveRespi - 1);
                    } else {
                        System.out.println("Opcion no valida.");
                    }
                }
                    break;
                case 2:
                    while(true) {
                        System.out.println("========= VITAMINAS Y COMMPLEMENTOS ===========");
                        ListaAlan();
                        int RemoveVita = scan.nextInt();
                        if (RemoveVita == 0) {
                            System.exit(0);
                        }else if(RemoveVita==Vitaminas.size()+1){
                            break;
                        } else if (RemoveVita > 0 && RemoveVita <=Vitaminas.size()) {
                            Vitaminas.remove(RemoveVita-1);
                            PreVita.remove(RemoveVita-1);
                        }else {
                            System.out.println("Opcion no valida");
                        }
                    }
                    break;
                case 3:while (true) {
                    System.out.println("============ DERMATOLOGIA ============");
                    ListaJohan();
                    int RemoveDerma = scan.nextInt();
                    if (RemoveDerma == 0) {
                        System.exit(0);
                    } else if (RemoveDerma == Dermatologia.size() + 1) {
                        break;
                    } else if (RemoveDerma > 0 && RemoveDerma <=Dermatologia.size()) {
                        Dermatologia.remove(RemoveDerma - 1);
                        PreDerma.remove(RemoveDerma - 1);
                    } else {
                        System.out.println("Opcion no valida");
                        break;
                    }
                }
                    break;
                case 4:while (true) {
                    ListaShiro();
                    int RemoveCabello = scan.nextInt();
                    if (RemoveCabello == 0) {
                        System.exit(0);
                    } else if (RemoveCabello == CuidaCabello.size() + 1) {
                        break;
                    } else if (RemoveCabello > 0 && RemoveCabello <=CuidaCabello.size()) {
                        CuidaCabello.remove(RemoveCabello - 1);
                        PreCabello.remove(RemoveCabello - 1);
                    } else {
                        System.out.println("Opcion no valida");
                    }
                }
                    break;
                case 5: return;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }

    public static void Modificar(){
        while(true) {
            System.out.println("======= MODIFICAR PRODUCTOS ======");
            System.out.println("1) Cuiddado respiratorios");
            System.out.println("2) Vitaminas y complementos");
            System.out.println("3) Cuidado de la piel");
            System.out.println("4) Cuidado del cabello");
            System.out.println("5) Atras\n");
            int opcMod = scan.nextInt();
            int posicion;
            switch (opcMod) {
                case 0:
                    System.exit(0);
                case 1:
                    while (true) {
                        System.out.println("Ingrese la opcion que va a reemplazar");
                        ListaKewin();
                        posicion = scan.nextInt();
                        if (posicion == CuidaRespiratorio.size() + 1) {
                            break;
                        } else if (posicion > 0 && posicion <= CuidaRespiratorio.size()) {
                            System.out.print("Escribe nuevo extra: ");
                            scan.nextLine();
                            CuidaRespiratorio.set(posicion - 1, scan.nextLine());
                            System.out.print("Ingrese el pecio: ");
                            PreRespi.set(posicion - 1, scan.nextDouble());
                            break;
                        } else {
                            System.out.println("Opcion no valida");
                        }
                    }
                    break;
                case 2:
                    while (true) {
                        System.out.println("Ingrese la opcion que va a reemplazar:");
                        ListaAlan();
                        posicion = scan.nextInt();
                        if (posicion == Vitaminas.size() + 1) {
                            break;
                        } else if (posicion > 0 && posicion <= Vitaminas.size()) {
                            System.out.print("Escribe nuevo extra: ");
                            scan.nextLine();
                            Vitaminas.set(posicion - 1, scan.nextLine());
                            System.out.print("Ingrese el pecio: ");
                            PreVita.set(posicion - 1, scan.nextDouble());
                            break;
                        } else {
                            System.out.println("Opcion no valida");
                        }
                    }
                    break;
                case 3:
                    while (true) {
                        System.out.println("Ingrese la opcion que va a reemplazar:");
                        ListaJohan();
                        posicion = scan.nextInt();
                        if (posicion == Dermatologia.size() + 1) {
                            break;
                        } else if (posicion > 0 && posicion <= Dermatologia.size()) {
                            System.out.print("Escribe nuevo extra: ");
                            scan.nextLine();
                            Dermatologia.set(posicion - 1, scan.nextLine());
                            System.out.print("Ingrese el pecio: ");
                            PreDerma.set(posicion - 1, scan.nextDouble());
                            break;
                        } else {
                            System.out.println("Opcion no valida");
                        }
                    }
                    break;
                case 4:
                    while (true) {
                        System.out.println("Ingrese la opcion que va a reemplazar:");
                        ListaShiro();
                        posicion = scan.nextInt();
                        if (posicion == CuidaCabello.size() + 1) {
                            break;
                        } else if (posicion > 0 && posicion <= CuidaCabello.size()) {
                            System.out.print("Escribe nuevo extra: ");
                            scan.nextLine();
                            CuidaCabello.set(posicion - 1, scan.nextLine());
                            System.out.print("Ingrese el pecio: ");
                            PreCabello.set(posicion - 1, scan.nextDouble());
                            break;
                        } else {
                            System.out.println("Opcion no valida");
                        }
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }

    public static void Buscar(){
        System.out.println("----BUSCAR PRODUCTO----");
        System.out.print(" Ingrese el nombre exacto del artículo: ");
        scan.nextLine();
        String buscar = scan.nextLine();
        boolean Respi = CuidaRespiratorio.contains(buscar);
        boolean Vit = Vitaminas.contains(buscar);
        boolean Derma = Dermatologia.contains(buscar);
        boolean Cabello = CuidaCabello.contains(buscar);
        if (Respi || Vit ||Derma || Cabello) {
            System.out.println("\nResultado : \"" + buscar + "\" si existe en el sistema.");
        }
        if (Respi) {
            System.out.println("Categoría > Cuidados Respiratorio > producto ("+(CuidaRespiratorio.indexOf(buscar)+1)+") S/ "+PreRespi.get(CuidaRespiratorio.indexOf(buscar)));
        }
        if (Vit) {
            System.out.println("Categoría > Vitaminas y complementos > producto (" +( Vitaminas.indexOf(buscar)+1)+") S/ "+PreVita.get(Vitaminas.indexOf(buscar)));
        }
        if (Derma) {
            System.out.println("Categoría > Dermatologia > producto (" + (Dermatologia.indexOf(buscar)+1)+") S/ "+PreDerma.get(Dermatologia.indexOf(buscar)));
        }
        if(Cabello) {
            System.out.println("Categoría > Cuidado de Cabello > producto ("+(CuidaCabello.indexOf(buscar)+1)+") S/ "+PreCabello.get(CuidaCabello.indexOf(buscar)));
        }
    }

    public static void MenuInkafarma() {
        LlenarCarry();
        while (true) {
            System.out.println("╔=====================================╗");
            System.out.println("╟               INKAFARMA             ╢");
            System.out.println("╚=====================================╝");
            System.out.println("Ingrese \"0\" cuando desee salir.");
            System.out.println("1) Cuidado Respiratorio.");
            System.out.println("2) Vitaminas y complementos.");
            System.out.println("3) Cuidado de la piel.");
            System.out.println("4) Cuidao del cabello.");
            System.out.println("5) Detalles de compra.");
            System.out.println("6) Atras");
            int opcFarma = scan.nextInt();
            switch (opcFarma) {
                case 0: System.exit(0);
                case 1: Kewin();continue;
                case 2: Alan();continue;
                case 3:Johan();continue;
                case 4:Shiro();continue;
                case 5:boolean Seguir=DetalleBuy();
                if(Seguir){continue;}
                    break;
                case 6:VaciarCarry();return;
                default: System.out.println("Opcion Inválida");
            }
            break;
        }
    }

    public static void Kewin() {
        while (true) {
            System.out.println("╔=====================================╗");
            System.out.println("╟         CUIDADO RESPIRATORIO        ╢");
            System.out.println("╚=====================================╝");
            ListaKewin();
            int opcResp = scan.nextInt();
            if (opcResp == 0) {
                System.exit(0);
            } else if (opcResp == CuidaRespiratorio.size()+1) {
                return;
            } else if (opcResp > 0 && opcResp < CuidaRespiratorio.size() + 1) {
            CarritoBuy(opcResp, CarriKewin);
            }else{
                System.out.println("Opcion invalida.");
            }
        }
    }

    public static void Johan() {
        while (true) {
            System.out.println("╔=====================================╗");
            System.out.println("╟             DERMATOLOGIA            ╢");
            System.out.println("╚=====================================╝");
            ListaJohan();
            int opcDerma = scan.nextInt();
            if (opcDerma == 0) {
                System.exit(0);
            } else if (opcDerma == Dermatologia.size()+1) {
                return;
            }else if (opcDerma > 0 && opcDerma < Dermatologia.size() + 1){
                CarritoBuy(opcDerma, CarriJohan);
            } else  {
                System.out.println("----------Opcion invalida-----------\n\n");
            }
        }
    }

    public static void Shiro() {
        while (true) {
            System.out.println("╔=====================================╗");
            System.out.println("╟         CUIDADO DEL CABELLO         ╢");
            System.out.println("╚=====================================╝");
            ListaShiro();
            int opcCabello = scan.nextInt();
            if (opcCabello == 0) {
                System.exit(0);
            } else if (opcCabello == CuidaCabello.size()+1) {
                return;
            }else if (opcCabello > 0 && opcCabello < CuidaCabello.size()+1) {
                CarritoBuy(opcCabello, CarriShiron);
            } else
                System.out.println("Opcion invalida");
            }
        }

    public static void Alan() {
        while (true) {
            System.out.println("╔=====================================╗");
            System.out.println("╟       VITAMINAS Y COMPLEMENTOS      ╢");
            System.out.println("╚=====================================╝");
            ListaAlan();
            int opcVit = scan.nextInt();
            if (opcVit == 0) {
                System.exit(0);
            } else if (opcVit == Vitaminas.size() + 1) {
                return;
            } else if (opcVit > 0 && opcVit < Vitaminas.size() + 1) {
                CarritoBuy(opcVit, CarriAlan);
            }else  {
                System.out.println("Opcion Invalida");
            }

        }
    }

    public static void LlenarCarry() {
        for (int i = 0; i < CuidaRespiratorio.size(); i++) {
            CarriKewin.add(0);
        }
        for (int i = 0; i < Vitaminas.size(); i++) {
            CarriAlan.add(0);
        }
        for (int i = 0; i < Dermatologia.size(); i++) {
            CarriJohan.add(0);
        }
        for (int i = 0; i < CuidaCabello.size(); i++) {
            CarriShiron.add(0);
        }

    }

    public static void VaciarCarry(){
        CarriKewin.clear();
        CarriAlan.clear();
        CarriJohan.clear();
        CarriShiron.clear();
    }

    public static void CarritoBuy(int opcion, ArrayList<Integer> carrito) {
        while (true) {
            System.out.print("Ingrese la cantidad: ");
            int canti = scan.nextInt();
            if (canti < 0) {
                continue;
            } else if (canti == 0) {
                System.exit(0);
            }
            carrito.set(opcion - 1, canti);
            break;
        }
    }

    public static boolean DetalleBuy() {
        double Total = 0;
        boolean RecibirDetalles = false;
            for (Integer elementKewin : CarriKewin) {
                if (elementKewin > 0) {
                    RecibirDetalles = true;
                }
                if (RecibirDetalles) {
                    break;
                }
            }
            for (Integer elementAlan : CarriAlan) {
                if (elementAlan > 0) {
                    RecibirDetalles = true;
                }
                if (RecibirDetalles) {
                    break;
                }
            }
            for (Integer elementJohan : CarriJohan) {
                if (elementJohan > 0) {
                    RecibirDetalles = true;
                }
                if (RecibirDetalles) {
                    break;
                }
            }
            for (Integer elementShiro : CarriShiron) {
                if (elementShiro > 0) {
                    RecibirDetalles = true;
                }
                if (RecibirDetalles) {
                    break;
                }
            }
        if (!RecibirDetalles) {
            System.out.println("======== No realizastes ni una compra. =======");return true;
        }
            System.out.println("┌————————┬———————————————————————————————————┬——————————┐");
            System.out.println("│Cantidad│              Productos            │  Precio  │");
            System.out.println("├————————┼———————————————————————————————————┴——————————┤");
            for (int i = 0; i < CuidaRespiratorio.size(); i++) {
                if (CarriKewin.get(i) > 0) {
                    double SubKewin = CarriKewin.get(i) * PreRespi.get(i);
                    System.out.printf("│   %-5d│ %-34s| %-9.2f│%n", CarriKewin.get(i), CuidaRespiratorio.get(i), SubKewin);
                    Total += SubKewin;
                }
            }
            for (int i = 0; i < Vitaminas.size(); i++) {
                if (CarriAlan.get(i) > 0) {
                    double SubAlan = CarriAlan.get(i) * PreVita.get(i);
                    System.out.printf("│   %-5d│ %-34s| %-9.2f│%n", CarriAlan.get(i), Vitaminas.get(i), SubAlan);
                    Total += SubAlan;
                }
            }
            for (int i = 0; i < Dermatologia.size(); i++) {
                if (CarriJohan.get(i) > 0) {
                    double SubJohan = CarriJohan.get(i) * PreDerma.get(i);
                    System.out.printf("│   %-5d│ %-34s| %-9.2f│%n", CarriJohan.get(i), Dermatologia.get(i), SubJohan);
                    Total += SubJohan;
                }
            }
            for (int i = 0; i < CuidaCabello.size(); i++) {
                if (CarriShiron.get(i) > 0) {
                    double SubShiro = CarriShiron.get(i) * PreCabello.get(i);
                    System.out.printf("│   %-5d│ %-34s| %-9.2f│%n", CarriShiron.get(i), CuidaCabello.get(i), SubShiro);
                    Total += SubShiro;
                }
            }
            System.out.println("├————————┴———————————————————————————————————┬----------┤");
            System.out.printf("│                   TOTAL                    │ %-8.3f │%n", Total);
            System.out.println("└————————————————————————————————————————————┴——————————┘");
            while (true) {
                System.out.println("\n1) Realizar Compra               2) Seguir comprando ");
                int opcComprar = scan.nextInt();
                if (opcComprar==0){
                    System.exit(0);
                }else if(opcComprar==1) {
                    break;
                }else if(opcComprar==2){
                    return true;
                }else{
                    System.out.println("-----------Opcion no válida----------\n\n");
                }
            }
            while(!AccesoCompra){
                System.out.println("================================");
                System.out.println("=    DEBES INICIAR SESION      =");
                System.out.println("================================");
                System.out.println("1) Iniciar Sesion      3) Atras");
                System.out.println("2) Crear Cuenta");
                int opcInicio = scan.nextInt();
                switch (opcInicio){
                    case 0: System.exit(0);
                    case 1:
                        System.out.println("\n\nNo puedes Realizar compra a traves del usuario de Admin");
                        InicioSesion(); break;
                    case 2:CreaCuenta(); break;
                    case 3: return false;
                    default:
                        System.out.println("Opcion inválida");
                }
            }

            MetodoPago(Total);
        return false;
    }

    public static void MetodoPago(double Total) {
        double monto=0;
        while (monto==0) {
            System.out.println("╔========================================╗");
            System.out.println("╟              METODO DE PAGO            ╢");
            System.out.println("╚========================================╝");
            System.out.println("1) Efectivo       3) Tarjeta de Crédito");
            System.out.println("2) Yape o Pin     4) Cacelar Compra");
            int opcMetPago = scan.nextInt();
            switch (opcMetPago){
                case 0: System.exit(0);
                case 1:monto= Efectivo(Total);break;
                case 2:monto= YapePin(Total);break;
                case 3:monto= TarjetaCred(Total);break;
                case 4:
                    System.out.println("Compra cancelada");break;
                default:
                    System.out.println("Opcion invalida");
            }
        }
        try {
            for (int e = 1; e <= 3; e++) {
                Thread.sleep(100);
                System.out.print("Cargando");
                Thread.sleep(250);
                System.out.print(".");
                Thread.sleep(200);
                System.out.print(".");
                Thread.sleep(150);
                System.out.println(".");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        BoletaFinal(Total,monto);
    }

    public static double Efectivo(double Total){
        while(true) {
            System.out.println("Por esta ocacion si ingresa \"0\" irá atras > Metodo de Pago.");
            System.out.println("El total a pagar es de S/ " + Total + ".");
            System.out.print("Ingrese el monto a pagar: ");
            double monto = scan.nextInt();
            if(monto==0){
                return 0;
            }else if(monto<Total){
                System.out.println("Monto Insuficiente.");
            }else {
                return monto;
            }
        }
    }

    public static double YapePin(double Total){
        if (Total > 500) {
            System.out.println("\n\n== El precio total supera los S/ 500.00. Elija otro Metodo de Pago. ==");
            return 0;
        }
        System.out.println("--------------Restricciones----------------");
        System.out.println("-Por esta ocacion si ingresa \"0\" irá atras > Metodo de Pago.");
        System.out.println("-El numero de celular debe tener 9 digitos.");
        System.out.println("-El numero debe empezar con 9.");
        while (true) {
            System.out.print("Ingrese el numero de celular: ");
            String numero = scan.next();
            if(numero.equals("0")){
                return 0;
            }else if (numero.charAt(0) != '9') {
                System.out.println("El numero de telefono debe iniciar con 9: ");
                continue;
            } else if (numero.length() != 9) {
                System.out.println("El numero de telefono debe tener 9 digitos.");
                continue;
            }
            break;
        }
        System.out.println("Por esta ocacion si ingresa \"0\" irá atras > Metodo de Pago.");
        System.out.println("El total a pagar es de S/ " + Total );
        while (true) {
            System.out.print("Ingrese el monto a pagar: ");
            double monto = scan.nextDouble();
            if (monto == 0) {
                return 0;
            } else if (monto < Total) {
                System.out.println("Monto Insuficiente");
            }else {
                return monto;
            }
        }
    }

    public static double TarjetaCred(double Total) {
        System.out.println("----------------------- Restricciones ------------------------- ");
        System.out.println("Por esta ocacion si ingresa \"0\" irá atras > Metodo de Pago.");
        System.out.println("1.-El numero de tarjeta debe tener 16 digitos");
        System.out.println("2.-El CVV debe tener 3 digitos.");
        System.out.println("3.-La fecha de vencimiento debe ser mayor de " + (Year.now().getValue()-1)+ ".");
        System.out.println("4.-Solo acepta monto exacto.");
        while(true){
            System.out.print("Ingrese el numero de tarjeta: ");
            String numTarj = scan.next();
            if(numTarj.equals("0")) {
                return 0;
            }else if(numTarj.length()!=16){
                System.out.println("El numero de tarjeta debe tener 16 digitos.");
                continue;
            }
            break;
        }
        while(true){
            System.out.print("Ingrese el CVV de la tarjeta: ");
            String Cvv = scan.next();
            if(Cvv.equals("0")){
                return 0;
            }else if(Cvv.length()!=3){
                System.out.println("El CVV de la tarjeta de tener 3 digitos.");
                continue;
            }
            break;
        }
        while(true){
            System.out.print("Ingrese el año de vencimiento de la tarjeta: ");
            int yearVenci = scan.nextInt();
            if(yearVenci==0){
                return 0;
            }else if(yearVenci<Year.now().getValue()){
                System.out.println("-------------Tarjeta vencida----------------\n");
                continue;
            }else if(yearVenci>Year.now().getValue()+4){
                System.out.println("------Fecha de Vencimiento no existente-----\n");
                continue;
            }
            break;
        }
        System.out.println("----------------PAGO EXITOSO----------------");
        return Total;

    }
    
    private static int numBolet(){
        Random ram = new Random();
        return ram.nextInt(999999)+111111;
    }

    private static String FechaActual(){
        return LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    private static String HoraActual(){
        return LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
    
    public static void BoletaFinal(double Total,double monto){
        double subNet=Total/1.18;
        double igv=Total-subNet;
        double vuelto = monto-Total;
        System.out.println("╔=======================================================╗");
        System.out.println("╟                     BOLETA DE COMPRA                  ╢");
        System.out.println("╚=======================================================╝");
        System.out.printf("│Usuario: %-22s   N°Boleta: "+numBolet()+"     │%n",NameUser.get(SelectUser-1));
        System.out.printf("│Fecha: %-17s         Hora: %-10s      │%n",FechaActual(),HoraActual());
        System.out.println("│Restaurante: InkaFarma, Juliaca                        │");
        System.out.println("├————————┬———————————————————————————————————┬——————————┤");
        System.out.println("│Cantidad│              Productos            │  Precio  │");
        System.out.println("├————————┼———————————————————————————————————┴——————————┤");
        for (int i = 0; i < CuidaRespiratorio.size(); i++) {
            if (CarriKewin.get(i) > 0) {
                double SubKewin = CarriKewin.get(i) * PreRespi.get(i);
                System.out.printf("│   %-5d│ %-34s| %-9.2f│%n", CarriKewin.get(i), CuidaRespiratorio.get(i), SubKewin);
                Total += SubKewin;
            }
        }
        for (int i = 0; i < Vitaminas.size(); i++) {
            if (CarriAlan.get(i) > 0) {
                double SubAlan = CarriAlan.get(i) * PreVita.get(i);
                System.out.printf("│   %-5d│ %-34s| %-9.2f│%n", CarriAlan.get(i), Vitaminas.get(i), SubAlan);
                Total += SubAlan;
            }
        }
        for (int i = 0; i < Dermatologia.size(); i++) {
            if (CarriJohan.get(i) > 0) {
                double SubJohan = CarriJohan.get(i) * PreDerma.get(i);
                System.out.printf("│   %-5d│ %-34s| %-9.2f│%n", CarriJohan.get(i), Dermatologia.get(i), SubJohan);
                Total += SubJohan;
            }
        }
        for (int i = 0; i < CuidaCabello.size(); i++) {
            if (CarriShiron.get(i) > 0) {
                double SubShiro = CarriShiron.get(i) * PreCabello.get(i);
                System.out.printf("│   %-5d│ %-34s| %-9.2f│%n", CarriShiron.get(i), CuidaCabello.get(i), SubShiro);
                Total += SubShiro;
            }
        }

        System.out.println("├————————┴———————————————————————————————————┬----------┤");
        System.out.printf("│                   TOTAL                    │ %-8.3f │%n", Total);
        System.out.println("├————————————————————————————————————————————┴——————————┤");
        System.out.printf("│ IGV: %-15.3f       SubNeto: %-10.3f        │%n",igv,subNet);
        System.out.printf("│ SubNeto: %-11.3f       Vuelto: %-7.3f            │%n",subNet,vuelto);
        System.out.println("├———————————————————————————————————————————————————————┤");
        System.out.println("│              MUCHAS GRACIAS POR SU COMPRA             │");
        System.out.println("└———————————————————————————————————————————————————————┘");
        VaciarCarry();
        try{
            Thread.sleep(10000);
        }catch(InterruptedException o){
            o.printStackTrace();
        }
    }
}
