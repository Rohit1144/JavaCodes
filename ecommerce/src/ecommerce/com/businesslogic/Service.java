package ecommerce.com.businesslogic;
import ecommerce.com.Product;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;   
import org.hibernate.cfg.Configuration;






public class Service {
	private static SessionFactory sessionFactory = null;
	Transaction transaction = null;
	Session sessiong = null;
	
	public void  addProduct(Product product) {
		// initialize the session
		Session session = null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		// begin transaction
		transaction = session.beginTransaction();	
		session.save(product);// this save() will form "insert into table " query	// automatically// in DB"
		transaction.commit();

	}
	
	public Product updateEmployeById(Product prod, int id) {
		Session session = null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		// begin transaction
		transaction=session.beginTransaction();
		
		Product product = (Product)session.get(Product.class, id);
	
		product.setLaptopName(prod.getLaptopName());  // values are coming from client that isMainClas
		product.setColor(prod.getColor());
		product.setWeight(prod.getWeight());
		product.setModel(prod.getModel());
		product.setScreensize(prod.getScreensize());
		session.update(product);
		transaction.commit();
		return product;

	}
	
	public List<Product> getProductDetails() {
		// Initialize the session
		Session session = null;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();

		// begin transaction
		transaction = session.beginTransaction();
		
		Query query =session.createQuery("FROM Product");
		
		List<Product> productList = query.list();
		
		return productList;

	
	}

	}
