import java.util.Scanner;
import java.util.ArrayList;

public class FarmaciaInkafarma4 {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<String> emailsRegistrados = new ArrayList<>();
    static ArrayList<String> clavesRegistradas = new ArrayList<>();
    static boolean sesionIniciada = false;

    static ArrayList<String> productosRespiratorio  = new ArrayList<>();
    static ArrayList<Double> preciosRespiratorio    = new ArrayList<>();

    static ArrayList<String> productosVitaminas     = new ArrayList<>();
    static ArrayList<Double> preciosVitaminas       = new ArrayList<>();

    static ArrayList<String> productosPiel          = new ArrayList<>();
    static ArrayList<Double> preciosPiel            = new ArrayList<>();

    static ArrayList<String> productosCabello       = new ArrayList<>();
    static ArrayList<Double> preciosCabello         = new ArrayList<>();

    public static void main(String[] args) {
        inicializarDatos();
        mostrarBienvenida();

        System.out.println("==========================================");
        System.out.println("          COMO DESEA INGRESAR?          ");
        System.out.println("==========================================");
        System.out.println("1. Iniciar sesion");
        System.out.println("2. Entrar como invitado");
        System.out.println("3. Registrarse");
        System.out.println("==========================================");
        System.out.print("Seleccione una opcion: ");
        int modoIngreso = sc.nextInt();

        if (modoIngreso == 1) {
            boolean accesoPermitido = iniciarSesion(3);
            if (accesoPermitido) {
                sesionIniciada = true;
                menuPrincipal();
            } else {
                System.out.println("Sistema bloqueado por demasiados intentos fallidos.");
                System.out.println("Comuniquese con su farmacia mas cercana.");
            }
        } else if (modoIngreso == 2) {
            sesionIniciada = false;
            System.out.println("Bienvenido, Invitado!");
            System.out.println("Puede ver los productos pero para comprar debe iniciar sesion.");
            menuPrincipal();
        } else if (modoIngreso == 3) {
            registrarUsuario();
        } else {
            System.out.println("Opcion invalida. Vuelva a iniciar el programa.");
        }
    }

    public static void inicializarDatos() {
        productosRespiratorio.add("Vick Vaporub 12g");        preciosRespiratorio.add(2.98);
        productosRespiratorio.add("Vick Vaporub 50g");        preciosRespiratorio.add(10.80);
        productosRespiratorio.add("Vick Vaporub 100g");       preciosRespiratorio.add(16.30);
        productosRespiratorio.add("Nastizol Forte x10");      preciosRespiratorio.add(10.79);
        productosRespiratorio.add("Nastizol Junior x10");     preciosRespiratorio.add(6.00);
        productosRespiratorio.add("Nastizol Multisintomas");  preciosRespiratorio.add(1.57);
        productosRespiratorio.add("Vitapyrena Forte");        preciosRespiratorio.add(2.10);
        productosRespiratorio.add("Pharamol Antigripal");     preciosRespiratorio.add(1.90);
        productosRespiratorio.add("Don Grippa x100");         preciosRespiratorio.add(90.00);
        productosRespiratorio.add("Teragran x100");           preciosRespiratorio.add(140.00);

        productosVitaminas.add("Vithaton Gragea x30");        preciosVitaminas.add(39.00);
        productosVitaminas.add("Prevencel x15");              preciosVitaminas.add(30.35);
        productosVitaminas.add("Pirixodina x100");            preciosVitaminas.add(40.00);
        productosVitaminas.add("Aneurin Forte NF x10");       preciosVitaminas.add(17.50);
        productosVitaminas.add("Dynamogen x20");              preciosVitaminas.add(66.20);
        productosVitaminas.add("Calcitriol 0.25mg x100");     preciosVitaminas.add(215.00);
        productosVitaminas.add("Trimetabol 100ml");           preciosVitaminas.add(25.40);
        productosVitaminas.add("Vitacose Plus x2");           preciosVitaminas.add(18.60);
        productosVitaminas.add("Mucovit Jarabe 110ml");       preciosVitaminas.add(34.00);
        productosVitaminas.add("Cefasel 100mcg x20");         preciosVitaminas.add(48.10);

        productosPiel.add("Gel Limpiador Effaclar La Roche-Posay"); preciosPiel.add(89.90);
        productosPiel.add("Crema Hidratante Facial CeraVe");        preciosPiel.add(68.50);
        productosPiel.add("Gel Cream Oil Control Eucerin");         preciosPiel.add(105.00);
        productosPiel.add("Serum Hyalu B5 La Roche-Posay");        preciosPiel.add(169.00);
        productosPiel.add("Mineral 89 Vichy");                      preciosPiel.add(124.00);
        productosPiel.add("Agua Micelar Bioderma");                 preciosPiel.add(55.00);
        productosPiel.add("Hydro Boost Water Gel Neutrogena");      preciosPiel.add(49.90);
        productosPiel.add("Cicaplast Baume B5 La Roche-Posay");     preciosPiel.add(98.50);
        productosPiel.add("Effaclar Duo La Roche-Posay");           preciosPiel.add(132.00);
        productosPiel.add("Crema Facial Nivea Soft");               preciosPiel.add(35.00);

        productosCabello.add("Shampoo Sedal Ceramidas");        preciosCabello.add(15.00);
        productosCabello.add("Acondicionador Pantene");         preciosCabello.add(16.50);
        productosCabello.add("Shampoo LOreal Elvive");          preciosCabello.add(19.90);
        productosCabello.add("Shampoo Head and Shoulders");     preciosCabello.add(18.00);
        productosCabello.add("Acondicionador Herbal Essences"); preciosCabello.add(22.00);
        productosCabello.add("Shampoo Konzil Keratina");        preciosCabello.add(14.00);
        productosCabello.add("Crema de Peinar Garnier");        preciosCabello.add(13.50);
        productosCabello.add("Shampoo Johnsons Baby");          preciosCabello.add(12.00);
        productosCabello.add("Mascarilla Kerastase Nutritive"); preciosCabello.add(120.00);
        productosCabello.add("Shampoo Ogx Biotina y Colageno"); preciosCabello.add(32.90);
    }

    public static void mostrarBienvenida() {
        System.out.println("==========================================");
        System.out.println("         BIENVENIDO A INKAFARMA          ");
        System.out.println("         La farmacia del Peru             ");
        System.out.println("         Siempre cerca de tu salud        ");
        System.out.println("==========================================");
    }

    public static boolean iniciarSesion(int intentosRestantes) {
        if (intentosRestantes == 0) {
            System.out.println("Sin intentos restantes. Acceso bloqueado.");
            return false;
        }
        String emailCorrecto = "cliente@gmail.com";
        String claveCorrecto = "inka123";

        System.out.println("--- INICIO DE SESION ---");
        System.out.println("Intentos disponibles: " + intentosRestantes);
        System.out.print("Correo electronico: ");
        String email = sc.next();
        System.out.print("Contrasena: ");
        String clave = sc.next();

        if (!email.contains("@")) {
            System.out.println("El correo debe contener @. Ejemplo: tu@correo.com");
            return iniciarSesion(intentosRestantes);
        } else if (clave.length() < 6) {
            System.out.println("La contrasena debe tener al menos 6 caracteres.");
            return iniciarSesion(intentosRestantes);
        } else if (email.equals(emailCorrecto) && clave.equals(claveCorrecto)) {
            System.out.println("Acceso concedido! Bienvenido a InkaFarma.");
            return true;
        } else {
            for (int i = 0; i < emailsRegistrados.size(); i++) {
                if (emailsRegistrados.get(i).equals(email) && clavesRegistradas.get(i).equals(clave)) {
                    System.out.println("Acceso concedido! Bienvenido");
                    return true;
                }
            }
            System.out.println("Correo o contrasena incorrectos.");
            return iniciarSesion(intentosRestantes - 1);
        }
    }

    public static void registrarUsuario() {
        System.out.println("==========================================");
        System.out.println("           REGISTRO DE USUARIO           ");
        System.out.println("==========================================");
        String emailNuevo;
        while (true) {
            System.out.print("Ingrese su correo electronico: ");
            emailNuevo = sc.next();
            if (!emailNuevo.contains("@")) {
                System.out.println("El correo debe contener @. Ejemplo: tu@correo.com");
                continue;
            }
            break;
        }
        String clavaNueva;
        while (true) {
            System.out.print("Cree una contrasena (minimo 6 caracteres): ");
            clavaNueva = sc.next();
            if (clavaNueva.length() < 6) {
                System.out.println("La contrasena debe tener al menos 6 caracteres.");
                continue;
            }
            break;
        }
        emailsRegistrados.add(emailNuevo);
        clavesRegistradas.add(clavaNueva);

        System.out.println("==========================================");
        System.out.println("  Registro exitoso!");
        System.out.println("  Ya puede iniciar sesion con su cuenta.");
        System.out.println("==========================================");
        System.out.print("Desea iniciar sesion ahora? (1=Si / 0=No): ");
        int respuesta = sc.nextInt();
        if (respuesta == 1) {
            boolean acceso = iniciarSesion(3);
            if (acceso) {
                sesionIniciada = true;
                menuPrincipal();
            }
        } else {
            System.out.println("Puede iniciar sesion cuando desee. Hasta pronto!");
        }
    }

    public static void menuPrincipal() {
        int opcion;
        do {
            System.out.println("==========================================");
            System.out.println("              MENU PRINCIPAL             ");
            System.out.println("==========================================");
            System.out.println("1. Farmacia");
            System.out.println("2. Salud");
            System.out.println("3. Dermatologia");
            System.out.println("4. Rutina Diaria");
            System.out.println("0. Salir");
            System.out.println("==========================================");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: kewin(); break;
                case 2: alan();  break;
                case 3: yohan(); break;
                case 4: shiro(); break;
                case 0:
                    System.out.println("Gracias por visitar InkaFarma!");
                    System.out.println("Cuide su salud. Hasta pronto!");
                    break;
                default:
                    System.out.println("Opcion invalida. Ingrese un numero del 0 al 4.");
            }
        } while (opcion != 0);
    }

    public static void kewin() {
        System.out.println("==========================================");
        System.out.println("               FARMACIA                  ");
        System.out.println("==========================================");
        System.out.println("1. Cuidado respiratorio");
        System.out.println("2. Malestar de la tos con flema");
        System.out.print("Elija subcategoria: ");
        int op = sc.nextInt();

        double subtotal = 0;
        if (op == 1) {
            subtotal = elegirProducto(productosRespiratorio, preciosRespiratorio, "Cuidado Respiratorio");
        } else if (op == 2) {
            System.out.println("--- Malestar de la Tos con Flema ---");
            System.out.println("EN PROSESO");
        } else {
            System.out.println("Opcion invalida.");
            return;
        }
        if (subtotal > 0) {
            double montoPagado = validarPago(subtotal);
            generarBoleta("Farmacia", subtotal, montoPagado);
        }
    }

    public static void alan() {
        System.out.println("==========================================");
        System.out.println("                 SALUD                   ");
        System.out.println("==========================================");
        System.out.println("1. Vitaminas y Complementos");
        System.out.println("2. Mama y Bebe");
        System.out.println("3. Nutricion para Todos");
        System.out.print("Elija subcategoria: ");
        int op = sc.nextInt();

        double subtotal = 0;
        if (op == 1) {
            subtotal = elegirProducto(productosVitaminas, preciosVitaminas, "Vitaminas y Complementos");
        } else if (op == 2) {
            System.out.println("--- Mama y Bebe ---");
            System.out.println("EN PROSESO");
        } else if (op == 3) {
            System.out.println("--- Nutricion para Todos ---");
            System.out.println("EN PROSESO");
        } else {
            System.out.println("Opcion invalida.");
            return;
        }
        if (subtotal > 0) {
            double montoPagado = validarPago(subtotal);
            generarBoleta("Salud", subtotal, montoPagado);
        }
    }

    public static void yohan() {
        System.out.println("==========================================");
        System.out.println("             DERMATOLOGIA                ");
        System.out.println("==========================================");
        System.out.println("1. Cuidado de la Piel");
        System.out.println("2. Proteccion Solar");
        System.out.print("Elija subcategoria: ");
        int op = sc.nextInt();

        double subtotal = 0;
        if (op == 1) {
            subtotal = elegirProducto(productosPiel, preciosPiel, "Cuidado de la Piel");
        } else if (op == 2) {
            System.out.println("--- Proteccion Solar ---");
            System.out.println("EN PROSESO");
        } else {
            System.out.println("Opcion invalida.");
            return;
        }
        if (subtotal > 0) {
            double montoPagado = validarPago(subtotal);
            generarBoleta("Dermatologia", subtotal, montoPagado);
        }
    }

    public static void shiro() {
        System.out.println("==========================================");
        System.out.println("             RUTINA DIARIA               ");
        System.out.println("==========================================");
        System.out.println("1. Cuidado del Cabello");
        System.out.println("2. Cuidado Personal");
        System.out.println("3. Belleza");
        System.out.println("4. Cuidado Bucal");
        System.out.print("Elija subcategoria: ");
        int op = sc.nextInt();

        double subtotal = 0;
        if (op == 1) {
            subtotal = elegirProducto(productosCabello, preciosCabello, "Cuidado del Cabello");
        } else if (op == 2) {
            System.out.println("--- Cuidado Personal ---");
            System.out.println("EN PROSESO");
        } else if (op == 3) {
            System.out.println("--- Belleza ---");
            System.out.println("EN PROSESO");
        } else if (op == 4) {
            System.out.println("--- Cuidado Bucal ---");
            System.out.println("EN PROSESO");
        } else {
            System.out.println("Opcion invalida.");
            return;
        }
        if (subtotal > 0) {
            double montoPagado = validarPago(subtotal);
            generarBoleta("Rutina Diaria", subtotal, montoPagado);
        }
    }

    public static double elegirProducto(ArrayList<String> lista, ArrayList<Double> precios, String titulo) {
        System.out.println("--- " + titulo + " ---");
        for (int i = 0; i < lista.size(); i++) {
            System.out.printf("%2d. %-45s - S/ %6.2f%n", i + 1, lista.get(i), precios.get(i));
        }
        System.out.print("Elija producto: ");
        int op = sc.nextInt() - 1;

        if (op < 0 || op >= lista.size()) {
            System.out.println("Producto no encontrado.");
            return 0;
        }
        System.out.print("Cantidad: ");
        int cantidad = sc.nextInt();

        if (cantidad < 1) {
            System.out.println("La cantidad debe ser al menos 1.");
            return 0;
        }
        double subtotal = precios.get(op) * cantidad;
        System.out.println("Agregado: " + lista.get(op) + " x" + cantidad + " = S/" + subtotal);
        return subtotal;
    }

    public static double validarPago(double totalPagar) {
        if (!sesionIniciada) {
            System.out.println("==========================================");
            System.out.println("  Para comprar debe tener una cuenta.");
            System.out.println("==========================================");
            System.out.println("1. Iniciar sesion");
            System.out.println("2. Registrarse");
            System.out.println("3. Cancelar compra");
            System.out.println("==========================================");
            System.out.print("Seleccione una opcion: ");
            int opcion = sc.nextInt();

            if (opcion == 1) {
                boolean acceso = iniciarSesion(3);
                if (!acceso) {
                    System.out.println("No se pudo iniciar sesion. Compra cancelada.");
                    return 0;
                }
            } else if (opcion == 2) {
                registrarUsuario();
                System.out.print("Desea iniciar sesion ahora para continuar? (1=Si / 0=No): ");
                int iniciar = sc.nextInt();
                if (iniciar == 1) {
                    boolean acceso = iniciarSesion(3);
                    if (!acceso) {
                        System.out.println("No se pudo iniciar sesion. Compra cancelada.");
                        return 0;
                    }
                } else {
                    System.out.println("Compra cancelada. Debe iniciar sesion para comprar.");
                    return 0;
                }
            } else {
                System.out.println("Compra cancelada.");
                return 0;
            }
            sesionIniciada = true;
            System.out.println("Sesion iniciada exitosamente! Continuando con su compra...");
        }

        System.out.println("========================================");
        System.out.println("         METODO DE PAGO                ");
        System.out.println("========================================");
        System.out.println("1. Efectivo");
        System.out.println("2. Tarjeta de credito o debito");
        System.out.println("3. Yape o Plin");
        System.out.println("========================================");
        System.out.print("Seleccione metodo de pago: ");
        int metodo = sc.nextInt();

        if (metodo < 1 || metodo > 3) {
            System.out.println("Opcion invalida. Se usara Efectivo por defecto.");
            metodo = 1;
        }

        double montoPagado = 0;
        if (metodo == 1)      montoPagado = pagarEfectivo(totalPagar);
        else if (metodo == 2) montoPagado = pagarTarjeta(totalPagar);
        else if (metodo == 3) montoPagado = pagarYape(totalPagar);
        return montoPagado;
    }

    public static double pagarEfectivo(double totalPagar) {
        double montoPagado;
        do {
            System.out.println("Total a pagar: S/" + totalPagar);
            System.out.print("Ingrese su pago en efectivo: S/");
            montoPagado = sc.nextDouble();
            if (montoPagado <= 0) {
                System.out.println("El monto debe ser mayor a 0.");
            } else if (montoPagado < totalPagar) {
                System.out.println("Monto insuficiente. Falta: S/" + (totalPagar - montoPagado));
            }
        } while (montoPagado < totalPagar);
        System.out.println("Pago en efectivo aceptado.");
        return montoPagado;
    }

    public static double pagarTarjeta(double totalPagar) {
        System.out.println("--- Pago con Tarjeta ---");
        System.out.println("- El numero de tarjeta debe tener 16 digitos.");
        System.out.println("- Solo se acepta el monto exacto.");
        System.out.println("- El CVV debe tener 3 digitos.");
        System.out.println("- La fecha de vencimiento debe ser mayor al 2024.");

        String numeroTarjeta;
        boolean tarjetaValida = false;
        do {
            System.out.print("Ingrese numero de tarjeta (16 digitos): ");
            numeroTarjeta = sc.next();
            if (numeroTarjeta.length() != 16) {
                System.out.println("El numero de tarjeta debe tener exactamente 16 digitos.");
            } else {
                tarjetaValida = true;
            }
        } while (!tarjetaValida);

        String cvv;
        boolean cvvValido = false;
        do {
            System.out.print("Ingrese CVV (3 digitos): ");
            cvv = sc.next();
            if (cvv.length() != 3) {
                System.out.println("El CVV debe tener exactamente 3 digitos.");
            } else {
                cvvValido = true;
            }
        } while (!cvvValido);

        int añoVencimiento;
        boolean fechaValida = false;
        do {
            System.out.print("Ingrese año de vencimiento (ejemplo: 2026): ");
            añoVencimiento = sc.nextInt();
            if (añoVencimiento <= 2025) {
                System.out.println("La tarjeta esta vencida. Ingrese una tarjeta vigente.");
            } else {
                fechaValida = true;
            }
        } while (!fechaValida);

        System.out.println("Total a pagar: S/" + totalPagar);
        System.out.println("El cobro exacto de S/" + totalPagar + " se realizara a su tarjeta.");
        System.out.println("Pago con tarjeta aprobado.");
        return totalPagar;
    }

    public static double pagarYape(double totalPagar) {
        System.out.println("--- Pago con Yape o Plin ---");
        System.out.println("- El numero de celular debe tener 9 digitos.");
        System.out.println("- El numero debe empezar con 9.");
        System.out.println("- El monto minimo por Yape es S/1.00.");
        System.out.println("- El monto maximo por Yape es S/500.00.");

        if (totalPagar > 500) {
            System.out.println("El total supera el limite de S/500 para Yape o Plin.");
            System.out.println("Se usara Efectivo en su lugar.");
            return pagarEfectivo(totalPagar);
        }

        String celular;
        boolean celularValido = false;
        do {
            System.out.print("Ingrese su numero de celular Yape o Plin: ");
            celular = sc.next();
            if (celular.length() != 9) {
                System.out.println("El numero debe tener 9 digitos.");
            } else if (celular.charAt(0) != '9') {
                System.out.println("El numero debe empezar con 9.");
            } else {
                celularValido = true;
            }
        } while (!celularValido);

        System.out.println("Total a pagar: S/" + totalPagar);
        System.out.println("Se enviara un cobro de S/" + totalPagar + " al numero " + celular);
        System.out.print("Confirma el pago? (1=Si / 0=No): ");
        int confirmar = sc.nextInt();

        if (confirmar != 1) {
            System.out.println("Pago cancelado. Se usara Efectivo.");
            return pagarEfectivo(totalPagar);
        }
        System.out.println("Pago por Yape o Plin confirmado.");
        return totalPagar;
    }

    public static void generarBoleta(String categoria, double totalPagar, double montoPagado) {
        double igv      = totalPagar * 0.18;
        double subtotal = totalPagar / 1.18;
        double vuelto   = montoPagado - totalPagar;

        System.out.println("========================================");
        System.out.println("      BOLETA DE VENTA - INKAFARMA      ");
        System.out.println("      Seccion: " + categoria);
        System.out.println("----------------------------------------");
        System.out.println("SUBTOTAL (sin IGV) : S/" + subtotal);
        System.out.println("IGV (18%)           : S/" + igv);
        System.out.println("TOTAL               : S/" + totalPagar);
        System.out.println("MONTO PAGADO        : S/" + montoPagado);
        System.out.println("VUELTO              : S/" + vuelto);
        System.out.println("========================================");
        System.out.println("  Gracias por su compra en InkaFarma!");
        System.out.println("  Cuide su salud. Nos vemos pronto.");
        System.out.println("========================================");
    }
}
