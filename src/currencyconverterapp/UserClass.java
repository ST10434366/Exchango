//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^{ BEGINNING OF FILE }^^^^^^^^^^^^^^^^^^^^^^^^^^//
package currencyconverterapp;

import java.util.ArrayList;
/**
 *
 * @author ST10434366
 */
public class UserClass {
    
    private String username;
    private String password;
    private ArrayList<Object> history; 
    private String defaultFromCurrency;
    private String defaultToCurrency;
    private String defaultLanguage;

    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//
    // Constructor intialises object value to defaults.
    public UserClass()
    {
        this.username = ""; 
        this.password = "";
        this.history = new ArrayList<>();
        this.defaultFromCurrency = "";
        this.defaultToCurrency = "";
        this.defaultLanguage = "";
    }
    
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//
    // Setter method for language field 
    public void setLanguage(String language)
    {
        this.defaultLanguage = language;
    }
    
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//
    // Getter method for language field 
    public String getLanguage()
    {
        return this.defaultLanguage;
    }
    
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//
    // Setter method for Default currency from field 
    public void setDefaultCurrencies(String fromCurrency, String toCurrency)
    {
        this.defaultFromCurrency = fromCurrency;
        this.defaultToCurrency = toCurrency;
    }
    
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//
    // Getter method for Default currency from field 
    public String getDefaultFromCurrency()
    {
        return this.defaultFromCurrency;
    }

    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//
    // Getter method for Default currency to field 
    public String getDefaultToCurrency()
    {
        return this.defaultToCurrency;
    }    
    
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//
    // Setter method for username field 
    public void setUsername(String username)
    {
        this.username = username;
    }
    
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//
    // Getter method for username field 
    public String getUsername()
    {
        return this.username;
    }
    
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//
    // Setter method for password field 
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//
    // Getter method for password field 
    public String getPassword()
    {
        return this.password;
    }
}
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^{ END OF FILE }^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//

