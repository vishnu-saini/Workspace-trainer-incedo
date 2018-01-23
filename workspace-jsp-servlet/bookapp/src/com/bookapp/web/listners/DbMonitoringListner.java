package com.bookapp.web.listners;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class DbMonitoringListner implements ServletContextAttributeListener {

   
    public void attributeAdded(ServletContextAttributeEvent event)  { 
         System.out.println(" attributeAdded(ServletContextAttributeEvent event)");
    }

	
    public void attributeRemoved(ServletContextAttributeEvent arg0)  { 
        
    }

	
    public void attributeReplaced(ServletContextAttributeEvent arg0)  { 
         // TODO Auto-generated method stub
    }
	
}
