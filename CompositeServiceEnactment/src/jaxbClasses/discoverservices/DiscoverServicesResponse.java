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

package jaxbClasses.discoverservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import jaxbClasses.basictypes.DiscoverServicesMatching;


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
 *         &lt;element name="DiscoverServicesMatching" type="{http://semanticsco/interactions/BasicTypes}DiscoverServicesMatching" maxOccurs="unbounded"/>
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
    "discoverServicesMatching"
})
@XmlRootElement(name = "DiscoverServicesResponse")
public class DiscoverServicesResponse {

    @XmlElement(name = "DiscoverServicesMatching", required = true)
    protected List<DiscoverServicesMatching> discoverServicesMatching;

    /**
     * Gets the value of the discoverServicesMatching property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discoverServicesMatching property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscoverServicesMatching().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscoverServicesMatching }
     * 
     * 
     */
    public List<DiscoverServicesMatching> getDiscoverServicesMatching() {
        if (discoverServicesMatching == null) {
            discoverServicesMatching = new ArrayList<DiscoverServicesMatching>();
        }
        return this.discoverServicesMatching;
    }

}
