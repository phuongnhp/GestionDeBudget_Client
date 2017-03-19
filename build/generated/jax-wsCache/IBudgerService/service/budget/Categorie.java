
package service.budget;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour categorie complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="categorie">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catNom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "categorie", propOrder = {
    "catNom",
    "catType",
    "id"
})
public class Categorie {

    protected String catNom;
    protected Integer catType;
    protected Integer id;

    /**
     * Obtient la valeur de la propriété catNom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatNom() {
        return catNom;
    }

    /**
     * Définit la valeur de la propriété catNom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatNom(String value) {
        this.catNom = value;
    }

    /**
     * Obtient la valeur de la propriété catType.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCatType() {
        return catType;
    }

    /**
     * Définit la valeur de la propriété catType.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCatType(Integer value) {
        this.catType = value;
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

}
