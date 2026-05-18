import java.util.Scanner;

public class farmaciainkafarma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("   BIENVENIDO A INKAFARMA");
        System.out.println("=================================");
        System.out.println("--Siempre pon en números--");
        System.out.println("Selecciones una categoria");
        System.out.println("1. Categoria: Farmacia ");
        System.out.println("2. Categoria: Salud");
        System.out.println("3. Categoria: Dermatologia");
        System.out.println("4. Categoria: Rutina Diaria");
        int opciones = sc.nextInt();
        switch (opciones) {
            case 1:
                kewin(sc);
                break;
            case 2:
                alan(sc);
                break;
            case 3:
                yohan(sc);
                break;
            case 4:
                shiro(sc);
                break;

        }
    }

    public static double kewin(Scanner sc) {
        double totalPagar = 0;
        totalPagar = farmacia(totalPagar, sc);
        if (totalPagar > 0) {
            double montoPagado = validarPago(totalPagar, sc);
            generarBoleta(totalPagar, montoPagado);
        } else {
            System.out.println("No se realizó ninguna compra.");
        }

        sc.close();
        return totalPagar;
    }

    public static double farmacia(double total, Scanner sc) {
        System.out.println("categoria: Farmacia");
        System.out.println("eliga una de las subcategorias");
        System.out.println("1. Malestar de la tos con flema");
        System.out.println("2. Cuidado respiratorio");
        int opciones = sc.nextInt();
        switch (opciones) {
            case 1:

                break;
            case 2:
                System.out.println("==========================================================================");
                total+=Cuidadorespiratorio(sc);
                break;
            default:
                System.out.println("opcion invalida");
        }
        return total;
    }
    public static double Cuidadorespiratorio(Scanner sc) {
        System.out.println("1. UNIDAD 1 UN: Vick Vaporub Ungüento tópico 12g                         - S/2.98");
        System.out.println("2. POTE 1 UN: Vick Vaporub Ungüento tópico 50g                           - S/10.80");
        System.out.println("3. POTE 1 UN: Vick Vaporub Ungüento tópico 100g                          - S/16.30");
        System.out.println("4. BLÍSTER 10 UN: Nastizol Antigripal Forte Comprimido                   - S/10.79");
        System.out.println("5. BLÍSTER 10 UN: Nastizol junior NF Antigripal Comprimidos masticables  - S/6.00");
        System.out.println("6. SOBRE 2 UN: Nastizol Antigripal Multisíntomas Tableta Recubierta      - S/1.57");
        System.out.println("7. GRANULADO 1 UN: Vitapyrena Forte Antigripal Sabor Miel y Limón        - S/2.10");
        System.out.println("8. SOBRE 1 UN: Pharamol Antigripal                                       - S/1.90");
        System.out.println("9. CAJA 100 UN: Don Grippa                                               - S/90.00");
        System.out.println("1'. CAJA 100 UN: Teragran                                                - S/140.00");
        int opciones = sc.nextInt();
        System.out.print("Ingrese cantidad → ");
        int cantidad = sc.nextInt();

        double precio=0;
        switch (opciones) {
            case 1:  precio= 2.98;  break;
            case 2:  precio= 10.80; break;
            case 3:  precio= 16.30; break;
            case 4:  precio= 10.79; break;
            case 5:  precio= 6.00;  break;
            case 6:  precio= 1.57;  break;
            case 7:  precio= 2.10;  break;
            case 8:  precio= 1.90;  break;
            case 9:  precio= 90.00; break;
            case 10: precio= 140.00;break;
            default:
                System.out.println("opcion invalida");
                return 0;
        }
        double subtotal = precio * cantidad;
        System.out.print("Producto agregado:"+precio +" X "+cantidad+" = S/" +subtotal);

        return subtotal;
    }
    public static double validarPago(double totalpagar, Scanner sc ){
        double montopagado;
        do {
            System.out.println("\nEl total a pagar es: "+totalpagar);
            System.out.println("Ingrese el monto pagado");
            montopagado= sc.nextDouble();
            if (montopagado<totalpagar){
                System.out.println("Monto insuficiente, falta pagar: "+(totalpagar-montopagado));
            }
        }
        while (montopagado<totalpagar);
        return montopagado;
    }
    public static void generarBoleta(double totalpagar,double montopagado){
        double igv=totalpagar*0.18;
        double subtotal=totalpagar+montopagado;
        double vuelto=montopagado-totalpagar;
        System.out.println("========BOLETA DE VENTA========");
        System.out.println("SUBTOTAL: "+subtotal);
        System.out.println("TOTAL A PAGAR: "+totalpagar);
        System.out.println("IGV: "+igv);
        System.out.println("MONTO PAGADO: "+montopagado);
        System.out.println("Vuelto: "+vuelto);
        System.out.println("gracias por su compra");

    }

    public static double alan(Scanner sc){
        boolean back=false ;
        double pre= 0;
        do {
            back =false;
            System.out.println("Elija una Categoía:\n1) Salud   ");
            int el = sc.nextInt();
            double tot =0;
            tot=Eleccion(el,back,sc,tot);
            System.out.println("Elija un Producto");
            System.out.println("El precio es de "+tot);
            Prec(0, pre);
            pre = Prec(0, pre);;
            System.out.println("Ingrese la cantidad que va a comprar");
            int canti = sc.nextInt();
            pre = canti *pre ;

        }while(back);
        return pre;
    }
    public static double Eleccion(int el,boolean back ,Scanner scan,double tot) {
        switch (el) {
            case 1:
                System.out.println("Salud");
                System.out.println("Elija un Producto:\n-Vitaminas y Complementos\n1) Vithaton Gragea(x 30 uni)= S/.39,00   2) Prevencel(x 15 uni)= S/.30.35" +
                        "\n3) Pirixodina(x100 uni.) = S/.40,00      4) Aneurin Forte NF( x10 uni.) = S/.17,50" +
                        "\n5) Dynamogen (x20 uni.)= S/.66.20        6) Cacitriol 0.25 mg(x 100 uni.)= S/.215,00" +
                        "\n7) Trimetabol (100 ml)= S/.25,40         8) Vitacose Plus (x2 uni.)= S/.18,60 " +
                        "\n9) Mucovit Jarabe(110 ml)= S/.34.00      10) Cefasel ssa 100 mcg (x20 uni.)=S/.48,10 " +
                        "\n0) ATRAS");
                int subop = scan.nextInt();
                tot = Prec(subop,tot);
                break;
            case 2:
                System.out.println("Mama y Bebe");
                break;
            case 3:
                System.out.println("Nutricions para todos");
                break;
            case 4:
                System.out.println("Dermatologia Cosmética");
                break;
            default:
                System.out.println("Opcion Incorrecta ");
                System.exit(0);
        }
        return tot;
    }
    public static double Prec (int subop,double pre){
        switch (subop ){
            case 1:pre+= 39;
                break;
            case 2:pre+= 30.35;
                break;
            case 3:pre+= 40;
                break;
            case 4:pre+= 17;
                break;
            case 5:pre+= 66;
                break;
            case 6:pre+= 215;
                break;
            case 7:pre+= 25.4;
                break;
            case 8:pre+=18.6;
                break;
            case 9:pre+= 34;
                break;
            case 10:pre+=48.1;
                break;
            case 0:pre=34;
                break;

            default:
        }
        return pre;
    }

    public static int shiro(Scanner sc){
        System.out.println("=== SELECCIONE UN DEPARTAMENTO ===");
        System.out.println("1: Cuidado Personal");
        System.out.println("2: Cuidado del Cabello");
        System.out.println("3: Inka Packs");
        System.out.println("4: Belleza");
        System.out.println("5: Cupones Promocionales");
        System.out.println("Seleccione una opción: ");
        int detectar = sc.nextInt();

        if (detectar != 2) {
            System.out.println("[AVISO] Este sistema demo solo tiene activo el departamento '2: Cuidado del Cabello'.");
            sc.close();
            return detectar;
        }

        System.out.println("=== SELECCIONE UNA CATEGORÍA ===");
        System.out.println("1: Desodorantes");
        System.out.println("2: Cuidado del Cabello");
        System.out.println("3: Baño");
        System.out.println("4: Cuidado Íntimo");
        System.out.println("5: Jabones");
        System.out.println("6: Shampoo y Acondicionador");
        System.out.println("7: Bienestar Sexual");
        System.out.println("8: Cuidado Bucal");
        System.out.println("9: Cuidado y Belleza Superior");
        System.out.println("10: Packs de Cuidado Personal");
        System.out.println("Selecione una opción: ");
        int categoria = sc.nextInt();

        if (categoria != 2 && categoria != 6) {
            System.out.println("[AVISO] Categoría en mantenimiento. Solo disponibles las opciones de Cabello (2 o 6).");
            sc.close();
            return detectar;
        }

        System.out.println("=== SELECCIONE UNA SUBCATEGORÍA ===");
        System.out.println("1: Shampoo y Acondicionadores");
        System.out.println("2: Favoritos en Desodorantes");
        System.out.println("3: Hombre");
        System.out.println("4: Toallas Higiénicas 60 UN");
        System.out.println("5: Toallas Higiénicas");
        System.out.println("6: Mujer");
        System.out.println("7: Lo Mejor en Colgate");
        System.out.println("8: Jabones para toda la Familia");
        System.out.println("Selecione una opción: ");
        int subcategoria = sc.nextInt();

        if (subcategoria != 1) {
            System.out.println("[AVISO] Esta subcategoría no pertenece al flujo de Cuidado del Cabello.");
            sc.close();
            return detectar;
        }

        System.out.println("=== CATALOGO: SHAMPOO Y ACONDICIONADORES ===");
        System.out.println("101. Shampoo Sedal Ceramidas - S/ 15.00 (Marca: Sedal)");
        System.out.println("102. Acondicionador Pantene Restauración - S/ 16.50 (Marca: Pantene)");
        System.out.println("103. Shampoo L'Oréal Elvive Reparación - S/ 19.90 (Marca: L'Oréal)");
        System.out.println("104. Shampoo Head & Shoulders Limpieza Mentol - S/ 18.00 (Marca: H&S)");
        System.out.println("105. Acondicionador Herbai Essences Bio - S/ 22.00 (Marca: Herbal Essences)");
        System.out.println("106. Shampoo Konzil Keratina - S/ 14.00 (Marca: Konzil)");
        System.out.println("107. Crema de Peinar Tratamiento Garnier - S/ 13.50 (Marca: Garnier)");
        System.out.println("108. Shampoo Johnson's Baby Gotas de Brillo - S/ 12.00 (Marca: Johnson's)");
        System.out.println("109. Mascarilla Capilar Kerastase Nutritive - S/ 120.00 (Marca: Kerastase)");
        System.out.println("110. Shampoo Ogx Biotina y Colágeno - S/ 32.90 (Marca: Ogx)");

        System.out.println("Elija el código del producto ([A]a la [j]): ");

        int productoElegido = sc.nextInt();


        System.out.println("-------------------------------------------");
        switch (productoElegido) {
            case 101:
                System.out.println("¡Has elegido: Shampoo Sedal Ceramidas!");
                break;
            case 102:
                System.out.println("¡Has elegido: Acondicionador Pantene Restauración!");
                break;
            case 103:
                System.out.println("¡Has elegido: Shampoo L'Oréal Elvive Reparación!");
                break;
            case 104:
                System.out.println("¡Has elegido: Shampoo Head & Shoulders Limpieza Mentol!");
                break;
            case 105:
                System.out.println("¡Has elegido: Acondicionador Herbal Essences Bio!");
                break;
            case 106:
                System.out.println("¡Has elegido: Shampoo Konzil Keratina!");
                break;
            case 107:
                System.out.println("¡Has elegido: Crema de Peinar Tratamiento Garnier!");
                break;
            case 108:
                System.out.println("¡Has elegido: Shampoo Johnson's Baby Gotas de Brillo!");
                break;
            case 109:
                System.out.println("¡Has elegido: Mascarilla Capilar Kerastase Nutritive!");
                break;
            case 110:
                System.out.println("¡Has elegido: Shampoo Ogx Biotina y Colágeno!");
                break;
            default:
                System.out.println("[ERROR] Código de producto no válido.");
                break;
        }
        System.out.println("-------------------------------------------");

        sc.close();
        return 0;
    }


    public static void yohan(Scanner sc) {
        System.out.println("=======================================================");
        System.out.println("    BIENVENIDO A LA SECCIÓN DE DERMATOLOGÍA INKAFARMA   ");
        System.out.println("=======================================================");

        double totalDerma = 0;
        boolean continuar = true;

        while (continuar) {
            mostrarCatalogoDerma();

            System.out.print("\nIngrese el ID del producto que desea comprar (0 para salir): ");
            int id = sc.nextInt();

            if (id == 0) break;

            System.out.print("Ingrese la cantidad: ");
            int cantidad = sc.nextInt();

            double precio = obtenerPrecioDerma(id);

            if (precio > 0) {
                double subtotal = precio * cantidad;
                totalDerma += subtotal;
                System.out.println("✓ Agregado: " + cantidad + " unidad(es) - Subtotal: S/" + String.format("%.2f", subtotal));
            } else {
                System.out.println("Producto no encontrado.");
            }

            System.out.print("\n¿Desea agregar otro producto? (1 = Sí / 0 = No): ");
            continuar = sc.nextInt() == 1;
        }

        if (totalDerma > 0) {
            System.out.println("\nTotal Dermatología: S/" + String.format("%.2f", totalDerma));
            double montoPagado = validarPago(totalDerma, sc);
            generarBoletaDerma(totalDerma, montoPagado);
        } else {
            System.out.println("No se realizó ninguna compra en Dermatología.");
        }
    }
    public static void mostrarCatalogoDerma() {
        System.out.println("\n--- Catálogo de Dermatología ---");
        System.out.println("ID   | Producto                              | Precio    | Tipo de Piel");
        System.out.println("-----|---------------------------------------|-----------|---------------");
        System.out.println("101  | Gel Limpiador Effaclar                | S/ 89.90  | Grasa");
        System.out.println("102  | Crema Hidratante Facial CeraVe        | S/ 68.50  | Seca");
        System.out.println("103  | Protector Solar Anthelios UVMune 400  | S/115.00  | Mixta");
        System.out.println("104  | Gel Crema Oil Control Eucerin         | S/105.00  | Grasa");
        System.out.println("105  | Sérum Hyalu B5 La Roche-Posay         | S/169.00  | Todo tipo");
        System.out.println("106  | Mineral 89 Vichy                      | S/124.00  | Sensible");
        System.out.println("107  | Agua Micelar Bioderma                 | S/ 55.00  | Todo tipo");
        System.out.println("108  | Hydro Boost Water Gel Neutrogena      | S/ 49.90  | Mixta");
        System.out.println("109  | Cicaplast Baume B5 La Roche-Posay     | S/ 98.50  | Sensible");
        System.out.println("110  | Effaclar Duo(+) La Roche-Posay        | S/132.00  | Grasa");
    }
    public static double obtenerPrecioDerma(int id) {
        switch (id) {
            case 101: return 89.90;
            case 102: return 68.50;
            case 103: return 115.00;
            case 104: return 105.00;
            case 105: return 169.00;
            case 106: return 124.00;
            case 107: return 55.00;
            case 108: return 49.90;
            case 109: return 98.50;
            case 110: return 132.00;
            default:  return 0;
        }
    }
    public static void generarBoletaDerma(double totalpagar, double montopagado) {
        double igv = totalpagar * 0.18;
        double subtotal = totalpagar / 1.18;
        double vuelto = montopagado - totalpagar;

        System.out.println("\n======== BOLETA DERMATOLOGÍA ========");
        System.out.println("SUBTOTAL: S/" + String.format("%.2f", subtotal));
        System.out.println("IGV (18%): S/" + String.format("%.2f", igv));
        System.out.println("TOTAL:    S/" + String.format("%.2f", totalpagar));
        System.out.println("MONTO PAGADO: S/" + montopagado);
        System.out.println("VUELTO:   S/" + String.format("%.2f", vuelto));
        System.out.println("¡Gracias por su compra en Dermatología!");
        System.out.println("=====================================");
    }
}