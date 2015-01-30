package com.kuroshfarsimadan.demonstration.file.retrieve;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;


import com.kuroshfarsimadan.demonstration.finvoice.Finvoice;

public class FinvoiceApplication {


	final private static File xml
			= new File("WebContent/resources/xml-files/Finvoice_13_malli.xml");

	final private static File xsd
			= new File("WebContent/resources/xml-files/Finvoice1.3.xsd");

	private static Finvoice finvoice;

	private static ArrayList<Finvoice> allFinvoices
			= new ArrayList<Finvoice>();


	public static ArrayList<Finvoice> getAllFinvoices() {
		return allFinvoices;
	}



	public static void setAllFinvoices(ArrayList<Finvoice> allFinvoices) {
		FinvoiceApplication.allFinvoices = allFinvoices;
	}



	public static void allXmlBillsToObjects() throws IOException,
			JAXBException, SAXException {
		try {
		System.out.println("Phase one");
		final JAXBContext jaxbContext = JAXBContext.newInstance(Finvoice.class);
		final Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants
				.W3C_XML_SCHEMA_NS_URI);
		File currentDirectory = new File("WebContent/resources/xml-files/bills/");
		File[] files = currentDirectory.listFiles();
		System.out.println("Phase two");
		for (int i = 0; i < files.length; i++) {
			File file = files[i];
			System.out.println("Phase three");
			if (file.getName().endsWith(".xml")) {
				System.out.println("kaikkiXMLLaskutOlioksi metodi --> "
						+ file);
				Schema schema = schemaFactory.newSchema(xsd);
				jaxbUnmarshaller.setSchema(schema);
				allFinvoices.add((Finvoice) jaxbUnmarshaller
						.unmarshal(file));
			}
		}
		}catch(NullPointerException e) {
			System.out.println(e);
		}

	}



	public void validate() throws SAXException, IOException {
		SchemaFactory factory
				= SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");

		Schema schema = factory.newSchema(xsd);
		Validator validator = schema.newValidator();
		validator.validate(new StreamSource(xml));
	}

	public void toObject() throws JAXBException, SAXException {
		final JAXBContext jaxbContext = JAXBContext.newInstance(Finvoice.class);
		final Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

		SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants
				.W3C_XML_SCHEMA_NS_URI);
		Schema schema = schemaFactory.newSchema(xsd);
		jaxbUnmarshaller.setSchema(schema);

		finvoice = (Finvoice) jaxbUnmarshaller.unmarshal(xml);
	}

	public void toXml() throws JAXBException, SAXException {

		final JAXBContext jaxbContext = JAXBContext
				.newInstance(Finvoice.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		jaxbMarshaller.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-15");
		jaxbMarshaller.setProperty(Marshaller.JAXB_NO_NAMESPACE_SCHEMA_LOCATION,
				"Finvoice1.3.xsd");


		SchemaFactory schemaFactory = SchemaFactory
				.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Schema schema = schemaFactory.newSchema(xsd);
		jaxbMarshaller.setSchema(schema);

		jaxbMarshaller.marshal(finvoice, xml);
	}

	public int getBillsAmount() throws IOException {
		int billsAmount = 0;

		File currentDirectory = new File("resources/xml-files/");
		File[] files = currentDirectory.listFiles();

		for (int i = 0; i < files.length; i++) {
			File file = files[i];

			if (file.isDirectory()) {
				System.out.println("directory:" + file.getCanonicalPath());
			}
			else if (file.getName().endsWith(".xml")) {
				billsAmount++;
			}
		}

		return billsAmount;
	}

	public void printXmlContent() {
		// HUOM! KESKENERÄINEN TESTAUSMETODI
		// Yhden case tapauksen tai XML laskun sisältö

		// Pakollinen kenttä
		System.out.println("Verovelvollisen nimi: " + finvoice
			.getSellerPartyDetails().getSellerOrganisationName());

		// Pakollinen kenttä
		System.out.println("010 Y-tunnus: " + finvoice
				.getSellerPartyDetails().getSellerPartyIdentifier());

		// Pakollinen kenttä
		System.out.println("050 Ilmoitusjakso: ");

		String kausi = finvoice.getDeliveryDetails().getDeliveryDate()
				.getValue().toString();
		String tempKausi = kausi.substring(4, 6);
		// Pakollinen kenttä
		System.out.println("052 Kohdekausi: " + tempKausi);

		String vuosi = finvoice.getDeliveryDetails().getDeliveryDate()
				.getValue().toString();
		String tempVuosi = kausi.substring(0, 4);
		// Pakollinen kenttä
		System.out.println("053 Vuosi: " + tempVuosi);

		// Pakollinen kenttä
		// Huom. Käsittelysäännöt. S = 24%.
		// Muista myös, että laskulla voi olla monta verokantaa
		// tuo get(0) on ensimmäisen verokannan tiedot
		System.out.println("301 24%(?) vero: " + finvoice
				.getInvoiceDetails().getVatSpecificationDetails().get(0)
				.getVatRatePercent());

		// Pakollinen kenttä
		System.out.println("302 14%(?) vero: " + finvoice
				.getInvoiceDetails().getVatSpecificationDetails().get(0)
				.getVatRatePercent());

		// Pakollinen kenttä
		System.out.println("303 10%(?) vero: "  + finvoice
				.getInvoiceDetails().getVatSpecificationDetails().get(0)
				.getVatRatePercent());

	}




	public static void findFiles() throws IOException {
		File currentDirectory = new File("WebContent/resources/xml-files/");
		File[] files = currentDirectory.listFiles();
		/*
			http://www.mkyong.com/java/search-directories-recursively-for-file-in-java/
			http://stackoverflow.com/questions/15624226/java-search-for-files-in-a-directory
		*/
		System.out.println("Juuresta alkaen oleva kansiorakenne on: "+
		currentDirectory.getCanonicalPath());
		System.out.println("Kansion E-Laskut tiedostot "
				+"ovat seuravanlaiset: ");
		for (int i = 0; i < files.length; i++) {
			File file = files[i];

			if (file.isDirectory()) {
				System.out.println("directory:" + file.getCanonicalPath());

			}
			else {
				System.out.println(file.getName());
			}
		}


		BufferedReader reader = null;
		reader = new BufferedReader(new FileReader(
				new File("WebContent/resources/xml-files/Finvoice_13_malli.xml")));
		File file = new File("WebContent/resources/xml-files/Finvoice_13_malli.xml");
		String fileName = file.getName() + "_tunniste.xml";
		String line;
		StringBuilder stringBuilder = new StringBuilder();

		while ((line=reader.readLine())!= null) {
			stringBuilder.append(line.trim());
		}

		/*
		 * Algoritmi, jossa luetaan String muodossa oleva e-lasku, joka
		 * muutetaan
		 * ,ottamalla pois alussa oleva SOAP sanoma, konvertoimalla takaisin
		 * STANDARDIEN mukaiseksi XML tiedostoksi, jossa SOAP sanoman pitää
		 * olla
		 * erillinen tiedosto, jotta XML tiedosto voidaan lukea JDOM:illa.
		 *
		 * huom. mitää muutosta ei tehdä alkuperäiseen tiedostoon, mutta
		 * jaoteltu SOAP JA XML
		 * nimetään, samantapaisiksi tunnisteella tunnistusta varten...
		 */


		System.out.println(stringBuilder);
		//stringToDom(sb, fileName);
	}


	private static void validateDate(String startDate, String endDate) {


	}

	private static void checkStartDate(String startDate) throws ParseException {
		String date = startDate;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		sdf.setLenient(false);
		sdf.parse(date);
		System.out.println(sdf);
		System.out.println(date);
	}

	private static void checkEndDate(String endDate) throws ParseException {
		String date = endDate;
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		dateFormat.setLenient(false);
		dateFormat.parse(date);
		System.out.println(dateFormat);
		System.out.println(date);
	}

	private static void checkYTunnus(String yTunnus) {

		// Ei toimi.
		int lengthOfTunnus = yTunnus.length();
		if (lengthOfTunnus == 9 && yTunnus.contains("-")
				&& yTunnus.indexOf("-") == 7
				&& yTunnus.substring(0,7).matches("[0-9]+")
				&& yTunnus.substring(8,9).matches("[0-9]+")) {

			System.out.println("Y-TUNNUS OIKEASSA MUODOSSA!");
		}
	}

	public void findEntrepreunersAllBills() {
		
	}
	
	public static void askEntrepreunersInformation() throws ParseException, JAXBException, SAXException, IOException {
		/*
		 * Tämä metodi kysyy yrittäjältä kaikki hänen tietyn kauden 
		 * tiedot.
		 */
		/*
		Alla oleva voi olla riskikäs, koska vaikka on tyhmää käydä läpi 
		kaikki tiedostot ensin
		ja sitten lukea niiden sisältöä niin voimme olettaa, 
		että täytetyt tiedot eivät ole täydellisiä,
		mutta Tieto Finland Oy lupasi, että esimerkkitiedostot ovat 
		täydellisiä 
		
		Muista tehdä syöttötarkastus alla oleville
		Yritys- ja yhteisötunnuksessa on seitsemän numeroa, 
		väliviiva ja tarkistusmerkki eli se on muotoa 1234567-8.
		*/
		String y_tunnus = "0235901-7";
		String startDate = "19981010";
		String endDate = "19981010";
		Scanner input = new Scanner(System.in);
		/*
		System.out.println("SYÖTÄ YRITYKSESI Y-TUNNUS: "); 
		y_tunnus = input.nextLine();
		
		System.out.println("SYÖTÄ YRITYKSESI KAUDEN ALKUPÄIVÄMÄÄRÄ "+ 
		"(vvvvkkpp):");
		startDate = input.nextLine();
		
		// ... Format="CCYYMMDD">20130812</DeliveryDate>
		System.out.println("SYÖTÄ YRITYKSESI KAUDEN LOPPUPVM "+
		"(vvvvkkpp): "); 
		endDate = input.nextLine();
		
		System.out.println(y_tunnus);
		System.out.println(startDate);
		System.out.println(endDate);
		*/
		
		//sovellus.tulostaXMLSisalto();
		//sovellus.tulostaXMLSisalto();
		
		
		/*
		 * Alla olevassa for loopissa käydään läpi kaikki
		 * haetut fnvoicet laskut ja yritetään hakea
		 * yrittäjän syöttämän y-tunnuksen perusteella
		 * hänen kaikki osto ja myyntilaskut
		*/
		for (int i = 0; i < allFinvoices.size(); i++) {
			String billSellerYTunnus;
			String billBuyerYTunnus;
			/*
			 * Alla oleva olio vain ottaa ihan selvennyksen
			 * vuoksi käsiteltävissä olevan laskun tiedot
			 * yhteen olioon, jota sitten käydään läpi ja verrataan
			 */
			Finvoice localFinvoice = allFinvoices.get(i); 
			System.out.println("Forloop " + i);
			
			
			try{
			if(finvoice.getSellerPartyDetails().getSellerPartyIdentifier().toString() != null) {
				System.out.println(finvoice.getSellerPartyDetails().getSellerPartyIdentifier().toString());
				billSellerYTunnus = finvoice.getSellerPartyDetails().getSellerPartyIdentifier().toString();
				if(y_tunnus.equalsIgnoreCase(billSellerYTunnus)){
					System.out.println("Tässä laskussa on kyse yrittäjän myyntilaskusta");
				}

			}
			}catch(Exception ex) {
				System.out.println("NULL VALUE FOUND IN SELLER DETAILS");
			}
			
			try{
			if(finvoice.getBuyerPartyDetails().getBuyerPartyIdentifier().toString() != null) {
				System.out.println(finvoice.getBuyerPartyDetails().getBuyerPartyIdentifier().toString() != null);
				billBuyerYTunnus = finvoice.getBuyerPartyDetails().getBuyerPartyIdentifier().toString();
				if(y_tunnus.equalsIgnoreCase(billBuyerYTunnus)){
					System.out.println("Tässä laskussa on kyse yrittäjän ostolaskusta");
				}
			}
			}catch(Exception ex) {
				System.out.println("NULL VALUE FOUND IN BUYER DETAILS");
			}
			System.out.println();
			
			
			
		}
		/* 
		 * Alla olevien metodien työnä on tarkistaa, että yrittäjän
		 * syöttämät tiedot ovat oikeassa muodossa. 
		 */
		
		// checkYTunnus(y_tunnus);
		
		// checkStartDate(startDate);
		
		// checkEndDate(endDate);
		
		// validateDate(startDate, endDate);
	}

	public static void main(String[] args) throws ParseException, IOException {
		FinvoiceApplication application = new FinvoiceApplication();

			try {
				application.allXmlBillsToObjects();
				application.toObject();
				application.findFiles();
				application.printXmlContent();
				//askEntrepreunersInformation();
				// findFiles();    
				/*
				  *  Huomautus! Tämä muokkaa XML-tiedostoa, joten se kannattaa 
				  *  jättää tässä vaiheessa pois!
				*/
				//sovellus.toXML();
				//findFiles();
				//laskeLaskuLKM();
			}
			catch (final JAXBException e) {
				System.out.println("JAXB käsittely ei onnistunut. Syy:");
				e.printStackTrace();
			}
			catch (final SAXException e) {
				System.out.println("Validointi ei onnistunut. Syy:");
				e.printStackTrace();
			}catch(NullPointerException e) {
				e.printStackTrace();
				System.out.println(e);
			}
		}


}
