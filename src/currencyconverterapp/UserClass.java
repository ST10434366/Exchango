
package currencyconverterapp;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class UserClass {
    
    private String username;
    private String password;
    private ArrayList<Object> history; 
    private String defaultFromCurrency;
    private String defaultToCurrency;
    private String defaultLanguage;

    public UserClass()
    {
        this.username = ""; 
        this.password = "";
        this.history = new ArrayList<>();
        this.defaultFromCurrency = "";
        this.defaultToCurrency = "";
        this.defaultLanguage = "";
    }
    
    public void setLanguage(String language)
    {
        this.defaultLanguage = language;
    }
    
    public String getLanguage()
    {
        return this.defaultLanguage;
    }
    
    public void setDefaultCurrencies(String fromCurrency, String toCurrency)
    {
        this.defaultFromCurrency = fromCurrency;
        this.defaultToCurrency = toCurrency;
    }
    
    public String getDefaultFromCurrency()
    {
        return this.defaultFromCurrency;
    }

    public String getDefaultToCurrency()
    {
        return this.defaultToCurrency;
    }    
    
    public void setUsername(String username)
    {
        this.username = username;
    }
    
    public String getUsername()
    {
        return this.username;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public String getPassword()
    {
        return this.password;
    }
    
    
    
    
    
    
}
