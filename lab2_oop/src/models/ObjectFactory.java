//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.12.01 at 12:23:49 PM
//


package models;


import jakarta.xml.bind.annotation.XmlRegistry;


@XmlRegistry
public class ObjectFactory {


    public ObjectFactory() {
    }

    public KnifesDesc createKnifeDesc() {
        return new KnifesDesc();
    }


    public KnifesDesc.KnifeVisual createKnifeDescKnifeVisual() {
        return new KnifesDesc.KnifeVisual();
    }

    public KnifesDesc.KnifeVisual.KnifeHandle createKnifeDescKnifeVisualKnifeHandle() {
        return new KnifesDesc.KnifeVisual.KnifeHandle();
    }


    public Knifes createKnifes() {
        return new Knifes();
    }


    public KnifesDesc.KnifeVisual.KnifeBlade createKnifeDescKnifeVisualKnifeBlade() {
        return new KnifesDesc.KnifeVisual.KnifeBlade();
    }


    public KnifesDesc.KnifeVisual.KnifeHandle.Wood createKnifeDescKnifeVisualKnifeHandleWood() {
        return new KnifesDesc.KnifeVisual.KnifeHandle.Wood();
    }

}