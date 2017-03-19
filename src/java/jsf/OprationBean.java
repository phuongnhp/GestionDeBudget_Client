package jsf;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author phuong
 */
import entite.OperationDetailClient;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;
import javax.xml.datatype.DatatypeConfigurationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import service.budget.Categorie;
import service.budget.IBudgetService;
import service.budget.OperationDetail;

@ManagedBean(name = "operationBean")
@SessionScoped
public class OprationBean implements Serializable {

    private OperationDetailClient opt;
    private List<Categorie> categories;
    private List<SelectItem> cats;
    
    public Date getDateOp() throws DatatypeConfigurationException {
        System.out.println("Phuong : " + opt.getDateOp());
        if (opt.getDateOp() == null) {
            opt.setDateOp(new Date());
        }
        return opt.getDateOp();
        //return new Date();
    }

    public void setDateOp(Date dateOp) {
        /*GregorianCalendar date = new GregorianCalendar();
         date.setTime(value);
         this.dateOp = DatatypeFactory.newInstance()
         .newXMLGregorianCalendar(date);                    */
        opt.setDateOp(dateOp);
    }

    public void init() {
        System.out.println(opt);
        categories = new ArrayList<>();
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String name = authentication.getName();
        String[] paths = {"applicationContext.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(paths);
        IBudgetService client = (IBudgetService) ctx.getBean("budget");
        categories.addAll((Collection) client.listerCats(0));
        categories.addAll((Collection) client.listerCats(1));
        cats = new ArrayList<>();
        for(Categorie cat : categories){
            cats.add(new SelectItem(cat.getId(), cat.getCatNom()));
        }
        if (opt.getId() != null) {
            OperationDetail tmp = client.chercherOpt(opt.getId(), name);
            System.out.println(tmp);
            opt = new OperationDetailClient(tmp);
        }else{
            opt = new OperationDetailClient();
        }
    }

    public String creer(){
        try {
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            String name = authentication.getName();
            String[] paths = {"applicationContext.xml"};
            ApplicationContext ctx = new ClassPathXmlApplicationContext(paths);
            IBudgetService client = (IBudgetService) ctx.getBean("budget");
            OperationDetail tmp = opt.toOperationDetail();
            tmp.setUsername(name);
            System.out.println(tmp);
            client.creerOpt(tmp.getLabel(), tmp.getCategorie(),tmp.getMontant(), tmp.getMontantPrevu(), tmp.getDateOp1(), tmp.getCommentaire() , name, 0, name);
            return "monBudget";
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(OprationBean.class.getName()).log(Level.SEVERE, null, ex);
            return "operationCre";
        }
    }

    public String modifier() {
        try {
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            String name = authentication.getName();
            String[] paths = {"applicationContext.xml"};
            ApplicationContext ctx = new ClassPathXmlApplicationContext(paths);
            IBudgetService client = (IBudgetService) ctx.getBean("budget");
            OperationDetail tmp = opt.toOperationDetail();
            System.out.println(tmp);
            client.modifierOpt(tmp.getId(), tmp.getLabel(), tmp.getCategorie(),tmp.getMontant(), tmp.getMontantPrevu(), tmp.getDateOp1(), tmp.getCommentaire() , name, tmp.getOpType(), name);
            return "monBudget";
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(OprationBean.class.getName()).log(Level.SEVERE, null, ex);
            return "operationMod";
        }
    }

    public List<SelectItem> getCats() {
        return cats;
    }

    public void setCats(List<SelectItem> cats) {
        this.cats = cats;
    }

    public Integer getCategorie() {
        return opt.getCategorie();
    }

    public void setCategorie(Integer categorie) {
        opt.setCategorie(categorie);
    }

    public String getCommentaire() {
        return opt.getCommentaire();
    }

    public void setCommentaire(String commentaire) {
        opt.setCommentaire(commentaire);
    }

    

    public List<Categorie> getCategories() {
        return categories;
    }

    public void setCategories(List<Categorie> categories) {
        this.categories = categories;
    }

    public OprationBean() {
        opt = new OperationDetailClient();
    }

    public OperationDetailClient getOpt() {
        return opt;
    }

    public void setOpt(OperationDetailClient opt) {
        this.opt = opt;
    }

    public Integer getId() {
        return opt.getId();
    }

    public void setId(Integer id) {
        opt.setId(id);
    }

    public String getLabel() {
        return opt.getLabel();
    }

    public void setLabel(String label) {
        opt.setLabel(label);
    }

    public Double getMontant() {
        return opt.getMontant();
    }

    public void setMontant(Double montant) {
        opt.setMontant(montant);
    }

    public Double getMontantPrevu() {
        return opt.getMontantPrevu();
    }

    public void setMontantPrevu(Double montantPrevu) {
        opt.setMontantPrevu(montantPrevu);
    }

    public int getOpType() {
        return opt.getOpType();
    }

    public void setOpType(int opType) {
        opt.setOpType(opType);
    }

    public String getUsername() {
        return opt.getUsername();
    }

    public void setUsername(String username) {
        opt.setUsername(username);
    }

}
