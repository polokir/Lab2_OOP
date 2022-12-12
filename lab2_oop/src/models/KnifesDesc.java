//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.12.01 at 12:23:49 PM
//


package models;

import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.math.BigInteger;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "knifeDesc", propOrder = {
        "knifeType",
        "knifeHandy",
        "knifeOrigin",
        "knifeVisual",
        "collection"
})
public class KnifesDesc {

    @XmlElement(required = true)
    protected String knifeType;
    protected int knifeHandy;
    @XmlElement(required = true)
    protected String knifeOrigin;
    @XmlElement(required = true)
    protected KnifesDesc.KnifeVisual knifeVisual;
    protected boolean collection;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String name;


    public String getKnifeType() {
        return knifeType;
    }


    public void setKnifeType(String value) {
        this.knifeType = value;
    }


    public int getKnifeHandy() {
        return knifeHandy;
    }


    public void setKnifeHandy(int value) {
        this.knifeHandy = value;
    }

    public String getKnifeOrigin() {
        return knifeOrigin;
    }


    public void setKnifeOrigin(String value) {
        this.knifeOrigin = value;
    }


    public KnifesDesc.KnifeVisual getKnifeVisual() {
        return knifeVisual;
    }


    public void setKnifeVisual(KnifesDesc.KnifeVisual value) {
        this.knifeVisual = value;
    }


    public boolean isCollection() {
        return collection;
    }


    public void setCollection(boolean value) {
        this.collection = value;
    }


    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "knifeBlade",
            "knifeHandle"
    })
    public static class KnifeVisual {

        @XmlElement(required = true)
        protected KnifesDesc.KnifeVisual.KnifeBlade knifeBlade;
        @XmlElement(required = true)
        protected KnifesDesc.KnifeVisual.KnifeHandle knifeHandle;


        public KnifesDesc.KnifeVisual.KnifeBlade getKnifeBlade() {
            return knifeBlade;
        }

        public void setKnifeBlade(KnifesDesc.KnifeVisual.KnifeBlade value) {
            this.knifeBlade = value;
        }

        public KnifesDesc.KnifeVisual.KnifeHandle getKnifeHandle() {
            return knifeHandle;
        }

        public void setKnifeHandle(KnifesDesc.KnifeVisual.KnifeHandle value) {
            this.knifeHandle = value;
        }


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class KnifeBlade {

            @XmlAttribute(name = "length", required = true)
            protected BigInteger length;
            @XmlAttribute(name = "width", required = true)
            protected BigInteger width;
            @XmlAttribute(name = "metal", required = true)
            protected MetalType metal;

            public BigInteger getLength() {
                return length;
            }

            public void setLength(BigInteger value) {
                this.length = value;
            }

            public BigInteger getWidth() {
                return width;
            }

            public void setWidth(BigInteger value) {
                this.width = value;
            }

            public MetalType getMetal() {
                return metal;
            }

            public void setMetal(MetalType value) {
                this.metal = value;
            }

        }


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "wood",
                "leatherCoated",
                "plastic"
        })
        public static class KnifeHandle {

            protected KnifesDesc.KnifeVisual.KnifeHandle.Wood wood;
            protected Object leatherCoated;
            protected Object plastic;

            public KnifesDesc.KnifeVisual.KnifeHandle.Wood getWood() {
                return wood;
            }

            public void setWood(KnifesDesc.KnifeVisual.KnifeHandle.Wood value) {
                this.wood = value;
            }

            public Object getLeatherCoated() {
                return leatherCoated;
            }

            public void setLeatherCoated(Object value) {
                this.leatherCoated = value;
            }


            public Object getPlastic() {
                return plastic;
            }

            public void setPlastic(Object value) {
                this.plastic = value;
            }


            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Wood {

                @XmlAttribute(name = "type", required = true)
                protected WoodType type;

                public WoodType getType() {
                    return type;
                }

                public void setType(WoodType value) {
                    this.type = value;
                }

            }

        }

    }

}