
package service.budget;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour creerOptResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="creerOptResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://budget.service/}operationDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creerOptResponse", propOrder = {
    "_return"
})
public class CreerOptResponse {

    @XmlElement(name = "return")
    protected OperationDetail _return;

    /**
     * Obtient la valeur de la propriété return.
     * 
     * @return
     *     possible object is
     *     {@link OperationDetail }
     *     
     */
    public OperationDetail getReturn() {
        return _return;
    }

    /**
     * Définit la valeur de la propriété return.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationDetail }
     *     
     */
    public void setReturn(OperationDetail value) {
        this._return = value;
    }

}
