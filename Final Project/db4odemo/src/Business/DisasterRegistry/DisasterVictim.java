/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DisasterRegistry;

import Business.Enterprise.ReliefOrganizationEnterprise;
import Business.Organization.Organization;
import java.io.File;
import javax.swing.Icon;

/**
 *
 * @author mamta
 */
public class DisasterVictim {

    String name;
    int age;
    String gender;
    private File file;
    private Icon image;
    long contact;
    String address;
    String nationality;
    String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public Icon getImage() {
        return image;
    }

    public void setImage(Icon image) {
        this.image = image;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public enum NationalityType {

        Unknown("Unknown"),
        American("American"),
        Andorran("Andorran"),
        Angolan("Angolan"),
        Argentine("Argentine"),
        Australian("Australian"),
        Austrian("Austrian"),
        Azerbaijani("Azerbaijani"),
        Bahamian("Bahamian"),
        Bangladeshi("Bangladeshi"),
        Barbadian("Barbadian"),
        Basque("Basque"),
        Belarusian("Belarusian"),
        Belgian("Belgian"),
        Belizean("Belizean"),
        Beninese("Beninese"),
        Bermudian("Bermudian"),
        Bhutanese("Bhutanese"),
        Bolivian("Bolivian"),
        Bosniak("Bosniak"),
        Botswana("Botswana"),
        Brazilian("Brazilian"),
        Breton("Breton"),
        British("British"),
        Bruneian("Bruneian"),
        Bulgarian("Bulgarian"),
        Burkinabé("Burkinabé"),
        Burmese("Burmese"),
        Burundian("Burundian"),
        Cambodian("Cambodian"),
        Cameroonian("Cameroonian"),
        Canadian("Canadian"),
        Catalan("Catalan"),
        Chadian("Chadian"),
        Chilean("Chilean"),
        Chinese("Chinese"),
        Colombian("Colombian"),
        Comorian("Comorian"),
        Congolese("Congolese"),
        Croatian("Croatian"),
        Cuban("Cuban"),
        Cypriot("Cypriot"),
        Ecuadorian("Ecuadorian"),
        Egyptian("Egyptian"),
        Emirati("Emirati"),
        English("English"),
        Equatoguinean("Equatoguinean"),
        Eritrean("Eritrean"),
        Estonian("Estonian"),
        Ethiopian("Ethiopian"),
        Faroese("Faroese"),
        Fijian("Fijian"),
        Finn("Finn"),
        Filipino("Filipino"),
        Gabonese("Gabonese"),
        Gambian("Gambian"),
        Georgian("Georgian"),
        German("German"),
        BalticGerman("BalticGerman"),
        Ghanaian("Ghanaian"),
        Gibraltarian("Gibraltarian"),
        Greek("Greek"),
        Grenadian("Grenadian"),
        Guatemalan("Guatemalan"),
        Guinean("Guinean"),
        Guyanese("Guyanese"),
        Haitian("Haitian"),
        Honduran("Honduran"),
        HongKonger("HongKonger"),
        Hungarian("Hungarian"),
        Icelander("Icelander"),
        Indian("Indian"),
        Indonesian("Indonesian"),
        Iranian("Iranian"),
        Iraqi("Iraqi"),
        Irish("Irish"),
        Israeli("Israeli"),
        Italian("Italian"),
        Ivoirian("Ivoirian"),
        Jamaican("Jamaican"),
        Japanese("Japanese"),
        Jordanian("Jordanian"),
        Kazakh("Kazakh"),
        Kenyan("Kenyan"),
        Korean("Korean"),
        Kosovar("Kosovar"),
        Kuwaiti("Kuwaiti"),
        Kyrgyz("Kyrgyz"),
        Lao("Lao"),
        Latvian("Latvian"),
        Lebanese("Lebanese"),
        Liberian("Liberian"),
        Libyan("Libyan"),
        Liechtensteiner("Liechtensteiner"),
        Lithuanian("Lithuanian"),
        Luxembourger("Luxembourger"),
        Macao("Macao"),
        Macedonian("Macedonian"),
        Malagasy("Malagasy"),
        Malawian("Malawian"),
        Malaysian("Malaysian"),
        Maldivian("Maldivian"),
        Malian("Malian"),
        Maltese("Maltese"),
        Manx("Manx"),
        Marshallese("Marshallese"),
        Mauritanian("Mauritanian"),
        Mauritian("Mauritian"),
        Mexican("Mexican"),
        Micronesian("Micronesian"),
        Moldovan("Moldovan"),
        Monégasque("Monégasque"),
        Mongolian("Mongolian"),
        Montenegrin("Montenegrin"),
        Moroccan("Moroccan"),
        Mozambican("Mozambican"),
        Namibian("Namibian"),
        Nauran("Nauran"),
        Nepalese("Nepalese"),
        NewZealander("NewZealander"),
        Nicaraguan("Nicaraguan"),
        Nigerien("Nigerien"),
        Nigerian("Nigerian"),
        Norwegian("Norwegian"),
        Omani("Omani"),
        Pakistani("Pakistani"),
        Palauan("Palauan"),
        Palestinian("Palestinian"),
        Panamanian("Panamanian"),
        Paraguayan("Paraguayan"),
        Peruvian("Peruvian"),
        Pole("Pole"),
        Portuguese("Portuguese"),
        PuertoRican("PuertoRican"),
        Qatari("Qatari"),
        Quebecer("Quebecer"),
        Réunionnai("Réunionnai"),
        Romanian("Romanian"),
        Russian("Russian"),
        Rwandan("Rwandan"),
        Saudi("Saudi"),
        Scot("Scot"),
        Senegalese("Senegalese"),
        Serb("Serb"),
        Seychelloi("Seychelloi"),
        Singaporean("Singaporean"),
        Slovak("Slovak"),
        Slovene("Slovene"),
        Somali("Somali"),
        Somalilander("Somalilander"),
        Sotho("Sotho"),
        SouthAfrican("SouthAfrican"),
        Spaniard("Spaniard"),
        SriLankan("SriLankan"),
        Sudanese("Sudanese"),
        Surinamese("Surinamese"),
        Swazi("Swazi"),
        Swede("Swede"),
        Swis("Swis"),
        Syriac("Syriac"),
        Syrian("Syrian"),
        Taiwanese("Taiwanese"),
        Tamil("Tamil"),
        Tajik("Tajik"),
        Tanzanian("Tanzanian"),
        Thai("Thai"),
        Tibetan("Tibetan"),
        Tobagonian("Tobagonian"),
        Togolese("Togolese"),
        Tongan("Tongan"),
        Trinidadian("Trinidadian"),
        Tunisian("Tunisian"),
        Turk("Turk"),
        Tuvaluan("Tuvaluan"),
        Ugandan("Ugandan"),
        Ukrainian("Ukrainian"),
        Uruguayan("Uruguayan"),
        Uzbek("Uzbek"),
        Vanuatuan("Vanuatuan"),
        Venezuelan("Venezuelan"),
        Vietnamese("Vietnamese"),
        Vincentian("Vincentian"),
        Welsh("Welsh"),
        Yemeni("Yemeni"),
        Zambian("Zambian"),
        Zimbabwean("Zimbabwean");

        private String value;

        private NationalityType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    @Override
    public String toString() {
        return name;
    }

}
