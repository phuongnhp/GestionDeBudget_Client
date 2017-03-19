package service.budget;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour operationDetail complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="operationDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categorie" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="commentaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateOp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montant" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="montantPrevu" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="opType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operationDetail", propOrder = {
    "categorie",
    "commentaire",
    "dateOp",
    "id",
    "label",
    "montant",
    "montantPrevu",
    "opType",
    "username"
})
public class OperationDetail {

    protected Integer categorie;
    protected String commentaire;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOp;
    protected Integer id;
    protected String label;
    protected Double montant;
    protected Double montantPrevu;
    protected Integer opType;
    protected String username;

    /**
     * Obtient la valeur de la propriété categorie.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCategorie() {
        return categorie;
    }

    /**
     * Définit la valeur de la propriété categorie.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCategorie(Integer value) {
        this.categorie = value;
    }

    /**
     * Obtient la valeur de la propriété commentaire.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentaire() {
        return commentaire;
    }

    /**
     * Définit la valeur de la propriété commentaire.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentaire(String value) {
        this.commentaire = value;
    }

    /**
     * Obtient la valeur de la propriété dateOp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getDateOp() {
        System.out.println(dateOp);
        System.out.println(dateOp.toGregorianCalendar().getTime());
        return dateOp.toGregorianCalendar().getTime();
    }
    
    public XMLGregorianCalendar getDateOp1(){
        return dateOp;
    }

    /**
     * Définit la valeur de la propriété dateOp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     * @throws javax.xml.datatype.DatatypeConfigurationException
     *     
     */
    public void setDateOp(Date value) throws DatatypeConfigurationException {
        GregorianCalendar date = new GregorianCalendar();
        date.setTime(value);
        this.dateOp = DatatypeFactory.newInstance()
            .newXMLGregorianCalendar(date);
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété label.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Définit la valeur de la propriété label.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Obtient la valeur de la propriété montant.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontant() {
        return montant;
    }

    /**
     * Définit la valeur de la propriété montant.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontant(Double value) {
        this.montant = value;
    }

    /**
     * Obtient la valeur de la propriété montantPrevu.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontantPrevu() {
        return montantPrevu;
    }

    /**
     * Définit la valeur de la propriété montantPrevu.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontantPrevu(Double value) {
        this.montantPrevu = value;
    }

    /**
     * Obtient la valeur de la propriété opType.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOpType() {
        return opType;
    }

    /**
     * Définit la valeur de la propriété opType.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOpType(Integer value) {
        this.opType = value;
    }

    /**
     * Obtient la valeur de la propriété username.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Définit la valeur de la propriété username.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    @Override
    public String toString() {
        return "OperationDetail{" + "categorie=" + categorie + ", commentaire=" + commentaire + ", dateOp=" + dateOp + ", id=" + id + ", label=" + label + ", montant=" + montant + ", montantPrevu=" + montantPrevu + ", opType=" + opType + ", username=" + username + '}';
    }

}
