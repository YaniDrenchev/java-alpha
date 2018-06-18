package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.nio.channels.FileLock;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class OnlineMarket {
    public static HashMap<String, Product> byName = new HashMap<>();
    public static StringBuilder result = new StringBuilder();
    private static HashMap<String, TreeSet<Product>> orderedProductsBytype = new HashMap<>();
    private static TreeSet<Product> orderdProducts = new TreeSet();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean buffer = true;
        while (buffer) {
            String command = "";
            String arg[] = new String[3];
            String line[] = reader.readLine().split(" ");
            command = line[0];
            String title = "";
            double price = 0;
            double pricefrom = 0;
            double priceto = 0;
            String type = "";
            if (!command.equals("end")) {
                if (command.equals("add")) {
                    title = line[1];
                    price = Double.parseDouble(line[2]);
                    type = line[3];
                } else if (command.equals("filter")) {
                    if ((command + line[1] + line[2]).equals("filterbytype")) {
                        command += line[1];
                        command += line[2];
                    } else if ((command + line[1] + line[2]).equals("filterbyprice") && line.length == 7) {
                        command += line[1];
                        command += line[2];
                        pricefrom = Double.parseDouble(line[4]);
                        priceto = Double.parseDouble(line[6]);
                    } else if (line.length == 5 &&
                            (command + line[1] + line[2] + line[3]).equals("filterbypricefrom")) {
                        command += line[1];
                        command += line[2];
                        command += line[3];
                        pricefrom = Float.parseFloat(line[4]);
                    } else if ((command + line[1] + line[2] + line[3]).equals("filterbypriceto")) {
                        command += line[1];
                        command += line[2];
                        command += line[3];
                        priceto = Double.parseDouble(line[4]);
                    }
                }
            }


            switch (command) {
                case "add":
                    if (byName.containsKey(title)) {
                        result.append(String.format("Error: Product %s already exists\n", title));
                        break;
                    } else {
                        if (!orderedProductsBytype.containsKey(type)) {
                            orderedProductsBytype.put(type, new TreeSet<>());
                        }
                        TreeSet<Product> ordered = orderedProductsBytype.get(type);
                        Product newProduct = new Product(title, price, type);
                        byName.put(title, newProduct);
                        result.append(String.format("Ok: Product %s added successfully\n", title));
                        ordered.add(newProduct);
                        orderdProducts.add(newProduct);
                    }
                    break;
                case "filterbytype":
                    String typeTocheck = line[3];
                    if (orderedProductsBytype.containsKey(typeTocheck)) {
                        result.append("Ok: ");
                        result.append(orderedProductsBytype.get(typeTocheck).stream()
                                .limit(10)
                                .map(Product::toString)
                                .collect(Collectors.joining(", ")));
                    } else {
                        result.append(String.format("Error: Type %s does not exists", typeTocheck));
                    }
                    result.append("\n");
                    break;
                case "filterbyprice":
                    double finalPricefrom = pricefrom;
                    double finalPriceto = priceto;
                    result.append("Ok: ");
                    result.append(orderdProducts.stream()
                            .filter(x -> x.price >= finalPricefrom)
                            .filter(x -> x.price <= finalPriceto)
                            .limit(10)
                            .map(Product::toString)
                            .collect(Collectors.joining(", ")));
                    result.append("\n");
                    break;
                case "filterbypricefrom":
                    finalPricefrom = pricefrom;
                    result.append("Ok: ");
                    result.append(orderdProducts.stream()
                            .filter(x -> x.price >= finalPricefrom)
                            .limit(10)
                            .map(Product::toString)
                            .collect(Collectors.joining(", ")));
                    result.append("\n");
                    break;
                case "filterbypriceto":
                    finalPriceto = priceto;
                    result.append("Ok: ");
                    result.append(orderdProducts.stream()
                            .filter(x -> x.price <= finalPriceto)
                            .limit(10)
                            .map(Product::toString)
                            .collect(Collectors.joining(", ")));
                    result.append("\n");
                    break;
                case "end":
                    buffer = false;
            }
        }
        //        result.delete(result.length()-1, result.length()-1);

        System.out.println(result);
    }

    static class Product implements Comparable {
        String name;
        double price;
        String type;

        public Product(String name, double price, String type) {
            this.name = name;
            this.price = price;
            this.type = type;
        }

        @Override

        public int compareTo(Object o) {
            Product product = (Product) o;
            int priceCompare = Double.compare(this.price, product.price);
            if (priceCompare != 0) {
                return priceCompare;
            }
            int titleCompare = this.name.compareTo(product.name);
            if (titleCompare != 0) {
                return titleCompare;
            }
            return this.type.compareTo(product.type);
        }

        @Override
        public String toString() {
            if (price % 1 == 0) {
                int newPrice = (int) price;
                return String.format("%s(%d)", name, newPrice);
            } else {
                return String.format("%s(%s)", name, String.valueOf(price));

            }
        }

        public static String fmt(double d) {
            if (d == (long) d)
                return String.format("%d", (long) d);
            else
                return String.format("%s", d);
        }
    }

}

