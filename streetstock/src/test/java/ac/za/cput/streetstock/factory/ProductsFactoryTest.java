package ac.za.cput.streetstock.factory;

import ac.za.cput.streetstock.domain.Products;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductsFactoryTest
{

    @Test
    public void getProduct()
    {
        String pname = "hp";
        Products p = ProductsFactory.getProduct(pname);
        System.out.println(p);
        Assert.assertNotNull(p.getProductName());
    }
}