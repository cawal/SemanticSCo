/*******************************************************************************
 * Copyright 2016 Gabriela D. A. Guardia
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

 *    http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*******************************************************************************/

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.01 at 03:53:42 PM BRST 
//

package semanticsco.interactions.discoverservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import semanticsco.interactions.basictypes.InputFunctRequest;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InputFunctRequest" type="{http://semanticsco/interactions/BasicTypes}InputFunctRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "inputFunctRequest"
})
@XmlRootElement(name = "DiscoverServicesRequest")
public class DiscoverServicesRequest {

    @XmlElement(name = "InputFunctRequest", required = true)
    protected InputFunctRequest inputFunctRequest;

    /**
     * Gets the value of the inputFunctRequest property.
     * 
     * @return
     *     possible object is
     *     {@link InputFunctRequest }
     *     
     */
    public InputFunctRequest getInputFunctRequest() {
        return inputFunctRequest;
    }

    /**
     * Sets the value of the inputFunctRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputFunctRequest }
     *     
     */
    public void setInputFunctRequest(InputFunctRequest value) {
        this.inputFunctRequest = value;
    }

}