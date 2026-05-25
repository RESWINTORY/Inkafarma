import java.util.Scanner;
public class FarmaciaInkafarma {
    static Scanner sc = new Scanner(System.in);
    static boolean sesionIniciada = false;
    public static void main(String[] args) {
        mostrarBienvenida();
        System.out.println("==========================================");
        System.out.println("          COMO DESEA INGRESAR?          ");
        System.out.println("==========================================");
        System.out.println("1. Iniciar sesion");
        System.out.println("2. Entrar como invitado");
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
        } else {
            System.out.println("Opcion invalida. Vuelva a iniciar el programa.");
        }
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

        String emailCorrecto = "cliente@inkafarma.pe";
        String claveCorrecto = "inka123";

        System.out.println("--- INICIO DE SESION ---");
        System.out.println("Intentos disponibles: " + intentosRestantes);
        System.out.print("Correo electronico: ");
        String email = sc.next();
        System.out.print("Contrasena: ");
        String clave = sc.next();

        boolean emailValido = email.contains("@");

        if (!emailValido) {
            System.out.println("El correo debe contener @. Ejemplo: tu@correo.com");
            return iniciarSesion(intentosRestantes);
        }

        else if (clave.length() < 6) {
            System.out.println("La contrasena debe tener al menos 6 caracteres.");
            return iniciarSesion(intentosRestantes);
        }

        else if (email.equals(emailCorrecto) && clave.equals(claveCorrecto)) {
            System.out.println("Acceso concedido! Bienvenido a InkaFarma.");
            return true;
        } else {
            System.out.println("Correo o contrasena incorrectos.");
            return iniciarSesion(intentosRestantes - 1);
        }
    }

    public static void menuPrincipal() {
        int opcion;
        do {
            System.out.println("==========================================");
            System.out.println("              MENU PRINCIPAL             ");
            System.out.println("==========================================");
            System.out.println("1. Farmacia.");
            System.out.println("2. Salud.");
            System.out.println("3. Dermatologia");
            System.out.println("4. Rutina Diaria");
            System.out.println("0. Salir");
            System.out.println("==========================================");
            System.out.print("Seleccione una opcion:");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1: kewin();  break;
                case 2: alan();   break;
                case 3: yohan();  break;
                case 4: shiro();  break;
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
        switch (op) {
            case 1: subtotal = cuidadoRespiratorio(); break;
            case 2:
                System.out.println("--- Malestar de la Tos con Flema ---");
                System.out.println("EN PROSESO");
                break;
            default:
                System.out.println("Opcion invalida.");
                return;
        }
        if (subtotal > 0) {
            double montoPagado = validarPago(subtotal);
            generarBoleta("Farmacia", subtotal, montoPagado);
        }
    }

    public static double cuidadoRespiratorio() {
        System.out.println("--- Cuidado Respiratorio ---");
        System.out.println(" 1. Vick Vaporub 12g                 - S/  2.98");
        System.out.println(" 2. Vick Vaporub 50g                 - S/ 10.80");
        System.out.println(" 3. Vick Vaporub 100g                - S/ 16.30");
        System.out.println(" 4. Nastizol Forte x10               - S/ 10.79");
        System.out.println(" 5. Nastizol Junior x10              - S/  6.00");
        System.out.println(" 6. Nastizol Multisintomas x2        - S/  1.57");
        System.out.println(" 7. Vitapyrena Forte miel limon      - S/  2.10");
        System.out.println(" 8. Pharamol Antigripal              - S/  1.90");
        System.out.println(" 9. Don Grippa x100                  - S/ 90.00");
        System.out.println("10. Teragran x100                    - S/140.00");
        System.out.print("Elija producto: ");
        int prod = sc.nextInt();

        double precio = 0;
        String nombre = "";

        switch (prod) {
            case  1: precio =   2.98; nombre = "Vick Vaporub 12g";       break;
            case  2: precio =  10.80; nombre = "Vick Vaporub 50g";       break;
            case  3: precio =  16.30; nombre = "Vick Vaporub 100g";      break;
            case  4: precio =  10.79; nombre = "Nastizol Forte";         break;
            case  5: precio =   6.00; nombre = "Nastizol Junior";        break;
            case  6: precio =   1.57; nombre = "Nastizol Multisintomas"; break;
            case  7: precio =   2.10; nombre = "Vitapyrena Forte";       break;
            case  8: precio =   1.90; nombre = "Pharamol Antigripal";    break;
            case  9: precio =  90.00; nombre = "Don Grippa x100";        break;
            case 10: precio = 140.00; nombre = "Teragran x100";          break;
            default:
                System.out.println("Producto no encontrado.");
                return 0;
        }

        System.out.print("Cantidad: ");
        int cantidad = sc.nextInt();

        if (cantidad < 1) {
            System.out.println("La cantidad debe ser al menos 1.");
            return 0;
        }

        double subtotal = precio * cantidad;
        System.out.println("Agregado: " + nombre + " x" + cantidad + " = S/" + subtotal);
        return subtotal;
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

        switch (op) {
            case 1: subtotal = vitaminasComplementos(); break;
            case 2:
                System.out.println("--- Mama y Bebe ---");
                System.out.println("EN PROSESO");
                break;
            case 3:
                System.out.println("--- Nutricion para Todos ---");
                System.out.println("EN PROSESO");
                break;
            default:
                System.out.println("Opcion invalida.");
                return;
        }

        if (subtotal > 0) {
            double montoPagado = validarPago(subtotal);
            generarBoleta("Salud - Alan", subtotal, montoPagado);
        }
    }

    public static double vitaminasComplementos() {
        System.out.println("--- Vitaminas y Complementos ---");
        System.out.println(" 1. Vithaton Gragea x30              - S/  39.00");
        System.out.println(" 2. Prevencel x15                    - S/  30.35");
        System.out.println(" 3. Pirixodina x100                  - S/  40.00");
        System.out.println(" 4. Aneurin Forte NF x10             - S/  17.50");
        System.out.println(" 5. Dynamogen x20                    - S/  66.20");
        System.out.println(" 6. Calcitriol 0.25mg x100           - S/ 215.00");
        System.out.println(" 7. Trimetabol 100ml                 - S/  25.40");
        System.out.println(" 8. Vitacose Plus x2                 - S/  18.60");
        System.out.println(" 9. Mucovit Jarabe 110ml             - S/  34.00");
        System.out.println("10. Cefasel 100mcg x20               - S/  48.10");
        System.out.print("Elija producto: ");
        int prod = sc.nextInt();

        double precio = 0;
        String nombre = "";

        switch (prod) {
            case  1: precio =  39.00; nombre = "Vithaton Gragea";   break;
            case  2: precio =  30.35; nombre = "Prevencel";         break;
            case  3: precio =  40.00; nombre = "Pirixodina";        break;
            case  4: precio =  17.50; nombre = "Aneurin Forte NF";  break;
            case  5: precio =  66.20; nombre = "Dynamogen";         break;
            case  6: precio = 215.00; nombre = "Calcitriol 0.25mg"; break;
            case  7: precio =  25.40; nombre = "Trimetabol";        break;
            case  8: precio =  18.60; nombre = "Vitacose Plus";     break;
            case  9: precio =  34.00; nombre = "Mucovit Jarabe";    break;
            case 10: precio =  48.10; nombre = "Cefasel 100mcg";    break;
            default:
                System.out.println("Producto no encontrado.");
                return 0;
        }

        System.out.print("Cantidad: ");
        int cantidad = sc.nextInt();

        if (cantidad < 1) {
            System.out.println("La cantidad debe ser al menos 1.");
            return 0;
        }

        double subtotal = precio * cantidad;
        System.out.println("Agregado: " + nombre + " x" + cantidad + " = S/" + subtotal);
        return subtotal;
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
        switch (op) {
            case 1: subtotal = cuidadoPiel(); break;
            case 2:
                System.out.println("--- Proteccion Solar ---");
                System.out.println("EN PROSESO");
                break;
            default:
                System.out.println("Opcion invalida.");
                return;
        }
        if (subtotal > 0) {
            double montoPagado = validarPago(subtotal);
            generarBoleta("Dermatologia", subtotal, montoPagado);
        }
    }

    public static double cuidadoPiel() {
        System.out.println("--- Cuidado de la Piel ---");
        System.out.println(" 1. Gel Limpiador Effaclar La Roche-Posay  - S/  89.90");
        System.out.println(" 2. Crema Hidratante Facial CeraVe         - S/  68.50");
        System.out.println(" 3. Gel Cream Oil Control Eucerin           - S/ 105.00");
        System.out.println(" 4. Serum Hyalu B5 La Roche-Posay          - S/ 169.00");
        System.out.println(" 5. Mineral 89 Vichy                       - S/ 124.00");
        System.out.println(" 6. Agua Micelar Bioderma                  - S/  55.00");
        System.out.println(" 7. Hydro Boost Water Gel Neutrogena       - S/  49.90");
        System.out.println(" 8. Cicaplast Baume B5 La Roche-Posay      - S/  98.50");
        System.out.println(" 9. Effaclar Duo La Roche-Posay            - S/ 132.00");
        System.out.println("10. Crema Facial Nivea Soft                - S/  35.00");
        System.out.print("Elija producto: ");
        int prod = sc.nextInt();

        double precio = 0;
        String nombre = "";

        switch (prod) {
            case  1: precio =  89.90; nombre = "Gel Limpiador Effaclar";  break;
            case  2: precio =  68.50; nombre = "Crema Hidratante CeraVe"; break;
            case  3: precio = 105.00; nombre = "Gel Cream Eucerin";        break;
            case  4: precio = 169.00; nombre = "Serum Hyalu B5";           break;
            case  5: precio = 124.00; nombre = "Mineral 89 Vichy";         break;
            case  6: precio =  55.00; nombre = "Agua Micelar Bioderma";    break;
            case  7: precio =  49.90; nombre = "Hydro Boost Neutrogena";   break;
            case  8: precio =  98.50; nombre = "Cicaplast Baume B5";       break;
            case  9: precio = 132.00; nombre = "Effaclar Duo";             break;
            case 10: precio =  35.00; nombre = "Crema Facial Nivea Soft";  break;
            default:
                System.out.println("Producto no encontrado.");
                return 0;
        }

        System.out.print("Cantidad: ");
        int cantidad = sc.nextInt();

        if (cantidad < 1) {
            System.out.println("La cantidad debe ser al menos 1.");
            return 0;
        }

        double subtotal = precio * cantidad;
        System.out.println("Agregado: " + nombre + " x" + cantidad + " = S/" + subtotal);
        return subtotal;
    }

    public static void shiro() {
        System.out.println("==========================================");
        System.out.println("             RUTINA DIARIA                ");
        System.out.println("==========================================");
        System.out.println("1. Cuidado del Cabello");
        System.out.println("2. Cuidado Personal");
        System.out.println("3. Belleza");
        System.out.println("4. Cuidado Bucal");
        System.out.print("Elija subcategoria: ");
        int op = sc.nextInt();
        double subtotal = 0;
        switch (op) {
            case 1: subtotal = cuidadoCabello();break;
            case 2:
                System.out.println("--- Cuidado Personal ---");
                System.out.println("EN PROSESO");
                break;
            case 3:
                System.out.println("--- Belleza ---");
                System.out.println("EN PROSESO");
                break;
            case 4:
                System.out.println("--- Cuidado Bucal ---");
                System.out.println("EN PROSESO");
                break;
            default:
                System.out.println("Opcion invalida.");
                return;
        }
        if (subtotal > 0) {
            double montoPagado = validarPago(subtotal);
            generarBoleta("Rutina Diaria", subtotal, montoPagado);
        }
    }

    public static double cuidadoCabello() {
        System.out.println("--- Cuidado del Cabello ---");
        System.out.println("1. Shampoo Sedal Ceramidas          - S/  15.00");
        System.out.println("2. Acondicionador Pantene           - S/  16.50");
        System.out.println("3. Shampoo LOreal Elvive            - S/  19.90");
        System.out.println("4. Shampoo Head and Shoulders       - S/  18.00");
        System.out.println("5. Acondicionador Herbal Essences   - S/  22.00");
        System.out.println("6. Shampoo Konzil Keratina          - S/  14.00");
        System.out.println("7. Crema de Peinar Garnier          - S/  13.50");
        System.out.println("8. Shampoo Johnsons Baby            - S/  12.00");
        System.out.println("9. Mascarilla Kerastase Nutritive   - S/ 120.00");
        System.out.println("10. Shampoo Ogx Biotina y Colageno  - S/  32.90");
        System.out.print("Codigo del producto: ");
        int prod = sc.nextInt();

        double precio;
        String nombre;

        switch (prod) {
            case 1: precio =  15.00; nombre = "Shampoo Sedal";        break;
            case 2: precio =  16.50; nombre = "Acondi. Pantene";      break;
            case 3: precio =  19.90; nombre = "Shampoo LOreal";       break;
            case 4: precio =  18.00; nombre = "Shampoo H&S";          break;
            case 5: precio =  22.00; nombre = "Acondi. Herbal Ess.";  break;
            case 6: precio =  14.00; nombre = "Shampoo Konzil";       break;
            case 7: precio =  13.50; nombre = "Crema Garnier";        break;
            case 8: precio =  12.00; nombre = "Shampoo Johnsons";     break;
            case 9: precio = 120.00; nombre = "Mascarilla Kerastase"; break;
            case 10: precio =  32.90; nombre = "Shampoo Ogx";          break;
            default:
                System.out.println("Producto no encontrado.");
                return 0;
        }

        System.out.print("Cantidad: ");
        int cantidad = sc.nextInt();

        if (cantidad < 1) {
            System.out.println("La cantidad debe ser al menos 1.");
            return 0;
        }

        double subtotal = precio * cantidad;
        System.out.println("Agregado: " + nombre + " x " + cantidad + " = S/ " + subtotal);
        return subtotal;
    }


    public static double validarPago(double totalPagar) {
        if (!sesionIniciada) {
            System.out.println("==========================================");
            System.out.println("  Para comprar debe iniciar sesion primero.");
            System.out.println("  Iniciando sesion ahora...");
            System.out.println("==========================================");
            boolean acceso = iniciarSesion(3);
            if (!acceso) {
                System.out.println("No se pudo iniciar sesion. Compra cancelada.");
                return 0;
            }
            sesionIniciada = true;
            System.out.println("Sesion iniciada! Continuando con su compra...");
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

        boolean metodoValido = metodo == 1 || metodo == 2 || metodo == 3;

        if (!metodoValido) {
            System.out.println("Opcion invalida. Se usara Efectivo por defecto.");
            metodo = 1;
        }

        double montoPagado = 0;

        switch (metodo) {
            case 1:
                montoPagado = pagarEfectivo(totalPagar);
                break;
            case 2:
                montoPagado = pagarTarjeta(totalPagar);
                break;
            case 3:
                montoPagado = pagarYape(totalPagar);
                break;
        }

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
        System.out.println("Restricciones:");
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

            if (añoVencimiento <= 2024) {
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
        System.out.println("Restricciones:");
        System.out.println("- El numero de celular debe tener 9 digitos.");
        System.out.println("- El numero debe empezar con 9.");
        System.out.println("- El monto minimo por Yape es S/1.00.");
        System.out.println("- El monto maximo por Yape es S/500.00.");

        if (totalPagar > 500) {
            System.out.println("El total supera el limite de S/500 para Yape o Plin.");
            System.out.println("Por favor elija otro metodo de pago.");
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
