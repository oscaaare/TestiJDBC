package fi.haagahelia.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fi.haagahelia.demo.domain.Customer;
import fi.haagahelia.demo.domain.CustomerDAO;

@Controller
public class CustomerController {
    @Autowired
    private CustomerDAO customerDAO;
    
    @RequestMapping(value="/customerlist")
    public String customerList(Model model) {	
        // Fetch all customers
        List<Customer> customers = customerDAO.findAll();
        
        // Add customer list to model and return to view
        model.addAttribute("customers", customers);
        return "customerlist";
    }	
	
}
