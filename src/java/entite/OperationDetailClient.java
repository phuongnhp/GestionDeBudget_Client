/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

import java.util.Date;
import javax.xml.datatype.DatatypeConfigurationException;
import service.budget.OperationDetail;


/**
 *
 * @author phuong
 */
public class OperationDetailClient {
    Integer id;
    String label;
    Integer categorie;
    Double montant;
    Double montantPrevu;
    Date dateOp;
    String commentaire;
    String username;
    Integer opType;

    public OperationDetailClient(String label, Integer categorie, Double montant, Double montantPrevu, Date dateOp, String commentaire, String username, Integer opType) {
        this.label = label;
        this.categorie = categorie;
        this.montant = montant;
        this.montantPrevu = montantPrevu;
        this.dateOp = dateOp;
        this.commentaire = commentaire;
        this.username = username;
        this.opType = opType;
    }

    public OperationDetailClient(OperationDetail opt) {
        this.id = opt.getId();
        this.label = opt.getLabel();
        this.categorie = opt.getCategorie();
        this.montant = opt.getMontant();
        this.montantPrevu = opt.getMontantPrevu();
        this.dateOp = opt.getDateOp();
        this.commentaire = opt.getCommentaire();
        this.username = opt.getUsername();
        this.opType = opt.getOpType();
    }

    public OperationDetail toOperationDetail() throws DatatypeConfigurationException {
        OperationDetail opt = new OperationDetail();
        opt.setId(this.getId());
        opt.setLabel(this.getLabel());
        opt.setCategorie(this.getCategorie());
        opt.setMontant(this.getMontant());
        opt.setMontantPrevu(this.getMontantPrevu());
        opt.setDateOp(this.getDateOp());
        opt.setCommentaire(this.getCommentaire());
        opt.setUsername(this.getUsername());
        opt.setOpType(this.getOpType());
        return opt;
    }

    public OperationDetailClient() {
    }

    @Override
    public String toString() {
        return "OperationDetail{" + "id=" + id + ", label=" + label + ", categorie=" + categorie + ", montant=" + montant + ", montantPrevu=" + montantPrevu + ", dateOp=" + dateOp + ", commentaire=" + commentaire + ", username=" + username + ", opType=" + opType + '}';
    }

    public Integer getCategorie() {
        return categorie;
    }

    public void setCategorie(Integer categorie) {
        this.categorie = categorie;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public Double getMontantPrevu() {
        return montantPrevu;
    }

    public void setMontantPrevu(Double montantPrevu) {
        this.montantPrevu = montantPrevu;
    }

    public Date getDateOp() {
        return dateOp;
    }

    public void setDateOp(Date dateOp) {
        this.dateOp = dateOp;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getOpType() {
        return opType;
    }

    public void setOpType(Integer opType) {
        this.opType = opType;
    }
}
