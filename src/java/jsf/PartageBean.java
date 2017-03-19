/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import service.budget.Droit;
import service.budget.IBudgetService;
import service.budget.Partage;

/**
 *
 * @author phuong
 */
@ManagedBean(name = "partageBean")
@SessionScoped
public class PartageBean implements Serializable{
    private List<Droit> droits;
    private List<SelectItem> items;
    private List<Partage> partages;
    private int droit;
    private String name;
    
    public void init(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String name = authentication.getName();
        String[] paths = {"applicationContext.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(paths);
        IBudgetService client = (IBudgetService) ctx.getBean("budget");
        droits.addAll((Collection)client.listerDroits());
        items = new ArrayList<>();
        for(Droit droit : droits){
            items.add(new SelectItem(droit.getId(), droit.getDroit()));
        }
        partages.addAll((Collection)client.listerPartage(name));
        name = "";
        droit = -1;
    }
    
    public void ajouter(){
        
    }
    
    public void supprimer(){
        
    }

    public List<Droit> getDroits() {
        return droits;
    }

    public void setDroits(List<Droit> droits) {
        this.droits = droits;
    }

    public List<SelectItem> getItems() {
        return items;
    }

    public void setItems(List<SelectItem> items) {
        this.items = items;
    }

    public List<Partage> getPartages() {
        return partages;
    }

    public void setPartages(List<Partage> partages) {
        this.partages = partages;
    }

    public int getDroit() {
        return droit;
    }

    public void setDroit(int droit) {
        this.droit = droit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
