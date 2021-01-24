package com.au.hibernate.assignment;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.query.Query;



public class BookManager {

	
	private static SessionFactory factory;
	
	public static void main(String[] args) {
		
		try {
			factory =new Configuration().configure().buildSessionFactory();
		
		}catch(Exception e) {
			System.err.print(e);
		}
		
		BookManager bookManager=new BookManager();
//		Integer bookId= bookManager.addBook("Physics","HC varma",105);   //To add a book
//		 bookManager.addBook("Maths","RD Sharma",101); 
//		 bookManager.addBook("C++","Stanley",110); 
//		 bookManager.addBook("Java","Herbert Schildt",120); 
//		 bookManager.addBook("Networking","Kurose",130); 
		
		
		bookManager.getBook();										   // To Display all the book
		//bookManager.updateBook(2);									// update the book having id 2 update the name Maths to c and author name RD sharma to Yashvant 
		//bookManager.deleteBook(5);										// delete book having id 5
		//bookManager.getBookName("C++");
		//bookManager.getBookCount();										//count the number of book present in the table
	}
	
	
	private void getBookName(String name) {
		Session session = factory.openSession();
		Transaction tx= null;
		try {
			tx = session.beginTransaction();
			Book book = session.get(Book.class, name);
			if(book==null)
				System.out.println("No book available with this name");
			else
			{
			System.out.println("Get book by Name");
			System.out.println(book.getId()+" "+book.getName()+" "+book.getAuthor()+""+book.getIsbnCode());
			}
			tx.commit();
		}catch(Exception e) {
			e.printStackTrace();
			if(tx !=null)
				tx.rollback();
		}finally {
			session.close();
		}
		
		
	}


	private void getBookCount() {
		
		Session session =factory.openSession();
		Transaction tx=null;
		try {
			tx = session.beginTransaction();
			Query query = session.createQuery("select count(*) from Book");
	             
					Long count = (Long)query.uniqueResult();
	                System.out.println("Total Books:" + count);
	            
			
			tx.commit();
		}catch(Exception e) {
			e.printStackTrace();
			if(tx !=null)
				tx.rollback();
		}finally {
			session.close();
		}
		
		
	}


	private void deleteBook(int x) {
		
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Book book = session.get(Book.class, x);
			session.remove(book);
			tx.commit();
		}catch(Exception e) {
			e.printStackTrace();
			if(tx !=null)
				tx.rollback();
		}finally {
			session.close();
		}
		
		
	}


	private void updateBook(int x) {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Book book = session.get(Book.class, x);
			book.setName("C");
			book.setAuthor("Yashvant");
			session.update(book);
			tx.commit();
		}catch(Exception e) {
			e.printStackTrace();
			if(tx !=null)
				tx.rollback();
		}finally {
			session.close();
		}
		
	}


	private void getBook() {
		Session session =factory.openSession();
		Transaction tx=null;
		try {
			tx = session.beginTransaction();
			List<Book> bookList = session.createQuery("FROM Book").list();
			
			if(bookList.isEmpty())
			{
				System.out.println("Books not available");
			}
			else {
			for(Book result : bookList) {
				System.out.print(result.getId()+" ");
				System.out.print(result.getName()+" ");
				System.out.print(result.getAuthor()+" ");
				System.out.print(result.getIsbnCode()+" ");
			}
			}
			tx.commit();
		}catch(Exception e) {
			e.printStackTrace();
			if(tx !=null)
				tx.rollback();
		}finally {
			session.close();
		}
		
		
	}


	private Integer addBook(String name,String author,int isbnCode)
	{
		Session session=factory.openSession();
		Transaction tx=null;
		Integer bookId =null;
		try {
			tx=session.beginTransaction();
			Book book=new Book(name, author, isbnCode);
			 bookId = (Integer)session.save(book);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return bookId;
	}

}
