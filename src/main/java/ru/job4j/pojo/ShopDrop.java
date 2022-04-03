package ru.job4j.pojo;

import javax.imageio.metadata.IIOMetadataFormatImpl;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        for (int j = index; j < products.length; j++) {
            if (j != products.length - 1) {
                products[j] = products[j + 1];
            } else {
                products[j] = null;
            }
        }
        return products;
    }
}
