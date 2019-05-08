package com.tel.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        alien teluso = new alien();
        teluso.setAid(101);
        teluso.setAname("priya");
        teluso.setColor("blue");
        System.out.println( "teluso" +teluso );
        
        Configuration con = new Configuration();
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
    //    System.out.println( "Hello World!11" );
        session.save(teluso);
    }
}
