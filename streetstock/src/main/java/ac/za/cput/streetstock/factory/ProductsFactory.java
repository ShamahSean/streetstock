package ac.za.cput.streetstock.factory;

import ac.za.cput.streetstock.domain.Products;
import ac.za.cput.streetstock.util.UserName;

public class ProductsFactory
{
    public static Products getProduct(String productName)
    {
        return new Products.Builder().model(UserName.generateUserName())
                .productName(productName)
                .build();
    }
}
