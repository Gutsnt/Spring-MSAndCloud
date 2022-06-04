package academy.digitallab.store.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import academy.digitallab.store.product.entity.Product;
import academy.digitallab.store.product.repository.ProductRepository;

@DataJpaTest
public class ProductRepositoryMockTest {
	@Autowired
	private ProductRepository productRepository; 
	
	public void whenfindByCategory_thenReturnListProduct() {
		Product product01 = Product.
	}

}
