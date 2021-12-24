
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

public class Question2 {
	
	static LinkedHashMap<String, Integer> linkedHashMapobject = new LinkedHashMap<String, Integer>();
	static TreeMap<Integer,String> treemap=new TreeMap<Integer,String>();
	
	static String selctedcontinent = "";
	static long totalpopulation =0;
	static long total ;
	static String output ="";
	static HashMap<String,Long> Africa =new HashMap<String,Long>();  //Africa
	static List<Country> AfricaC = new ArrayList<Country>();    //Africa
	static HashMap<String,Long> SAmerica =new HashMap<String,Long>(); //South America
	static List<Country> SAmericaC = new ArrayList<Country>();  //South America
	static HashMap<String,Long> NAmerica =new HashMap<String,Long>(); //North America
	static List<Country> NAmericaC = new ArrayList<Country>();  //North America
	static HashMap<String,Long> Europe =new HashMap<String,Long>(); //Europe
	static List<Country> EuropeC = new ArrayList<Country>();  //Europe
	static HashMap<String,Long> Asia =new HashMap<String,Long>(); //Asia
	static List<Country> AsiaC = new ArrayList<Country>();  //Asia
	static HashMap<String,Long> Australia =new HashMap<String,Long>(); //Australia/Oceania
	static List<Country>AustraliaC = new ArrayList<Country>();  //Australia/Oceania
	
	
	
	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getInstance(); //formats number
		worldpopulation(); // Generates population of the world
		
		continentpop("Africa"); //Computes the population of a Continent
		
		output = selctedcontinent +" has a population of "+ String.valueOf(nf.format(totalpopulation)); //Output statement
		
		System.out.print(output); //Prints Output
		
		/*linkedHashMap();
		for (String key : linkedHashMapobject.keySet()) {                                              //Step 4

			System.out.println(key +":\t" + linkedHashMapobject.get(key));
			}
		*/
		
		/*treemap();
		for(Map.Entry map  : treemap.entrySet()){  
			System.out.println(map.getKey()+" "+map.getValue()); }*/
		}
	
	
	/* instruction says return type should be int but this does not
	accommodate population for Asia; the best return type to use is long because int data type 32bit and its 
	largest int value is 2,147,483,647 while long data type is 64bits and its largest long value is
	9,223,372,036,854,775,807*/
	
	static long getPopulation(List<Country> countries, String continent) {
		selctedcontinent = continent;
		total = 0;
		countries.forEach((Country c)-> total += c.getPopulation());
		return  total;}
	
	
	static void continentpop(String continent) {
		switch(continent) {
	
		case "South America":
			totalpopulation= getPopulation(SAmericaC, "South America");
			break;
		case "North America":
			totalpopulation= getPopulation(SAmericaC, "North America");
			break;
		case "Africa":
			totalpopulation = getPopulation(AfricaC, "Africa");
			break;
		case "Europe":
			totalpopulation = getPopulation(EuropeC, "Europe");
			break;
		case "Asia":
			totalpopulation = getPopulation(AsiaC, "Asia");
			break;
		case "Australia":
			totalpopulation = getPopulation(AustraliaC, "Australia");
			break;
		case "Oceania":
			totalpopulation = getPopulation(AustraliaC, "Australia");
			break;
		}
		
	}
	
	//Source https://www.worldometers.info/geography/7-continents/
	
	static void worldpopulation() {
		SAmerica.put("Brazil",(long)212559417);
		SAmerica.put("Colombia",(long)50882891);
		SAmerica.put("Argentina",(long)45195774);
		SAmerica.put("Peru",(long)32971854);
		SAmerica.put("Venezuela",(long)28435940);
		SAmerica.put("Chile",(long)19116201);
		SAmerica.put("Ecuador",(long)17643054);
		SAmerica.put("Bolivia",(long)11673021);
		SAmerica.put("Paraguay",(long)7132538);
		SAmerica.put("Uruguay",(long)3473730);
		SAmerica.put("Guyana",(long)786552);
		SAmerica.put("Suriname",(long)586632);
		SAmerica.put("French Guiana",(long)298682);
		SAmerica.put("Falkland Islands",(long)3480);
		
		
		NAmerica.put("U.S.A.",(long)331002651);
		NAmerica.put("Mexico",(long)128932753);
		NAmerica.put("Canada",(long)37742154);
		NAmerica.put("Guatemala",(long)17915568);
		NAmerica.put("Haiti",(long)11402528);
		NAmerica.put("Cuba",(long)11326616);
		NAmerica.put("Dominican Republic",(long)10847910);
		NAmerica.put("Honduras",(long)9904607);
		NAmerica.put("Nicaragua",(long)6624554);
		NAmerica.put("El Salvador",(long)6486205);
		NAmerica.put("Costa Rica",(long)5094118);
		NAmerica.put("Panama",(long)4314767);
		NAmerica.put("Jamaica",(long)2961167);
		NAmerica.put("Puerto Rico",(long)2860853);
		NAmerica.put("Trinidad and Tobago",(long)1399488);
		NAmerica.put("Guadeloupe",(long)400124);
		NAmerica.put("Belize",(long)397628);
		NAmerica.put("Bahamas",(long)393244);
		NAmerica.put("Martinique",(long)375265);
		NAmerica.put("Barbados",(long)287375);
		NAmerica.put("Saint Lucia",(long)183627);
		NAmerica.put("Curaçao",(long)164093);
		NAmerica.put("Grenada",(long)112523);
		NAmerica.put("Saint Vincent and the Grenadines",(long)110940);
		NAmerica.put("Aruba",(long)106766);
		NAmerica.put("United States Virgin Islands",(long)104425);
		NAmerica.put("Antigua and Barbuda",(long)97929);
		NAmerica.put("Dominica",(long)71986);
		NAmerica.put("Cayman Islands",(long)65722);
		NAmerica.put("Bermuda",(long)62278);
		NAmerica.put("Greenland",(long)56770);
		NAmerica.put("Saint Kitts and Nevis",(long)53199);
		NAmerica.put("Sint Maarten",(long)	42876);
		NAmerica.put("Turks and Caicos Islands",(long)38717);
		NAmerica.put("Saint Martin",(long)38666);
		NAmerica.put("British Virgin Islands",(long)30231);
		NAmerica.put("Caribbean Netherlands",(long)26223);
		NAmerica.put("Anguilla",(long)15003);
		NAmerica.put("Saint Barthélemy",(long)9877);
		NAmerica.put("Saint Pierre and Miquelon",(long)5794);
		NAmerica.put("Montserrat",(long)4992);	
		
		
		
		Africa.put("Nigeria",(long)206139589);
		Africa.put("Ethiopia",	(long)114963588);
		Africa.put("Egypt",	(long)102334404);
		Africa.put("DR Congo",	(long)89561403);
		Africa.put("Tanzania",	(long)	59734218);
		Africa.put("South Africa",	(long)	59308690);
		Africa.put("Kenya",	(long)	53771296);
		Africa.put("Uganda",	(long)	45741007);
		Africa.put("Algeria",	(long)	43851044);
		Africa.put("Sudan",	(long)	43849260);
		Africa.put("Morocco",	(long)	36910560);
		Africa.put("Angola",	(long)	32866272);
		Africa.put("Mozambique",	(long)	31255435);
		Africa.put("Ghana",	(long)	31072940);
		Africa.put("Madagascar",	(long)	27691018);
		Africa.put("Cameroon",	(long)	26545863);
		Africa.put("Côte d'Ivoire",	(long)	26378274);
		Africa.put("Niger",	(long)	24206644);
		Africa.put("Burkina Faso",	(long)	20903273);
		Africa.put("Mali",	(long)	20250833);
		Africa.put("Malawi",	(long)	19129952);
		Africa.put("Zambia",	(long)	18383955);
		Africa.put("Senegal",	(long)	16743927);
		Africa.put("Chad",	(long)	16425864);
		Africa.put("Somalia",	(long)	15893222);
		Africa.put("Zimbabwe",	(long)	14862924);
		Africa.put("Guinea",	(long)	13132795);
		Africa.put("Rwanda",	(long)	12952218);
		Africa.put("Benin",	(long)	12123200);
		Africa.put("Burundi",	(long)	11890784);
		Africa.put("Tunisia",	(long)	11818619);
		Africa.put("South Sudan",	(long)	11193725);
		Africa.put("Togo",	(long)	8278724);
		Africa.put("Sierra Leone",	(long)	7976983);
		Africa.put("Libya",	(long)	6871292	);
		Africa.put("Congo",	(long)	5518087);
		Africa.put("Liberia",	(long)	5057681);
		Africa.put("Central African Republic",	(long)	4829767);
		Africa.put("Mauritania",	(long)	4649658);
		Africa.put("Eritrea",	(long)	3546421);
		Africa.put("Namibia",	(long)	2540905);
		Africa.put("Gambia",	(long)	2416668);
		Africa.put("Botswana",	(long)	2351627);
		Africa.put("Gabon",	(long)	2225734);
		Africa.put("Lesotho",	(long)	2142249);
		Africa.put("Guinea-Bissau",	(long)	1968001);
		Africa.put("Equatorial Guinea",	(long)	1402985);
		Africa.put("Mauritius",	(long)	1271768);
		Africa.put("Eswatini",	(long)	1160164);
		Africa.put("Djibouti",	(long)	988000);
		Africa.put("Comoros",	(long)	869601);
		Africa.put("Cabo Verde",	(long)	555987);
		Africa.put("Sao Tome & Principe",	(long)	219159);
		Africa.put("Seychelles",	(long)	98347);
		
		
		Europe.put("Russia",(long)145934462);
		Europe.put("Germany",(long)	83783942);
		Europe.put("United Kingdom",(long)67886011);
		Europe.put("France",(long)65273511);
		Europe.put("Italy",(long)60461826);
		Europe.put("Spain",(long)46754778);
		Europe.put("Ukraine",(long)43733762);
		Europe.put("Poland",(long)37846611);
		Europe.put("Romania",(long)19237691);
		Europe.put("Netherlands",(long)17134872);
		Europe.put("Belgium",(long)11589623);
		Europe.put("Czechia",(long)10708981);
		Europe.put("Greece",(long)10423054);
		Europe.put("Portugal",(long)10196709);
		Europe.put("Sweden",(long)10099265);
		Europe.put("Hungary",(long)9660351);
		Europe.put("Belarus",(long)9449323);
		Europe.put("Austria",(long)9006398);
		Europe.put("Serbia",(long)8737371);
		Europe.put("Switzerland",(long)8654622);
		Europe.put("Bulgaria",(long)6948445);
		Europe.put("Denmark",(long)5792202);
		Europe.put("Finland",(long)5540720);
		Europe.put("Slovakia",(long)5459642);
		Europe.put("Norway",(long)5421241);
		Europe.put("Ireland",(long)4937786);
		Europe.put("Croatia",(long)4105267);
		Europe.put("Moldova",(long)4033963);
		Europe.put("Bosnia and Herzegovina",(long)3280819);
		Europe.put("Albania",(long)2877797);
		Europe.put("Lithuania",(long)2722289);
		Europe.put("North Macedonia",(long)2083374);
		Europe.put("Slovenia",(long)2078938);
		Europe.put("Latvia",(long)1886198);
		Europe.put("Estonia",(long)1326535);
		Europe.put("Montenegro",(long)628066);
		Europe.put("Luxembourg",(long)625978);
		Europe.put("Malta",(long)441543);
		Europe.put("Iceland",(long)341243);
		Europe.put("Channel Islands",(long)173863);
		Europe.put("Isle of Man",(long)85033);
		Europe.put("Andorra",(long)77265);
		Europe.put("Faeroe Islands",(long)48863);
		Europe.put("Monaco",(long)39242);
		Europe.put("Liechtenstein",(long)38128);
		Europe.put("San Marino",(long)33931);
		Europe.put("Gibraltar",(long)33691);
		Europe.put("Holy See",(long)801);
		
		
		Asia.put("China",(long)1439323776);
		Asia.put("India",(long)1380004385);
		Asia.put("Indonesia",(long)273523615);
		Asia.put("Pakistan",(long)220892340);
		Asia.put("Bangladesh",(long)164689383);
		Asia.put("Japan",(long)126476461);
		Asia.put("Philippines",(long)109581078);
		Asia.put("Vietnam",(long)97338579);
		Asia.put("Turkey",(long)84339067);
		Asia.put("Iran",(long)83992949);
		Asia.put("Thailand",(long)69799978);
		Asia.put("Myanmar",(long)54409800);
		Asia.put("South Korea",(long)51269185);
		Asia.put("Iraq",(long)40222493);
		Asia.put("Afghanistan",(long)38928346);
		Asia.put("Saudi Arabia",(long)34813871);
		Asia.put("Uzbekistan",(long)33469203);
		Asia.put("Malaysia",(long)32365999);
		Asia.put("Yemen",(long)29825964);
		Asia.put("Nepal",(long)29136808);
		Asia.put("North Korea",(long)25778816);
		Asia.put("aiwan",(long)23816775);
		Asia.put("Sri Lanka",(long)21413249);
		Asia.put("Kazakhstan",(long)18776707);
		Asia.put("Syria",(long)	17500658);
		Asia.put("Cambodia",(long)16718965);
		Asia.put("Jordan",(long)10203134);
		Asia.put("Azerbaijan",(long)10139177);
		Asia.put("United Arab Emirates",(long)9890402);
		Asia.put("Tajikistan",(long)9537645);
		Asia.put("Israel",(long)8655535);
		Asia.put("Hong Kong",(long)7496981);
		Asia.put("Laos",(long)7275560);
		Asia.put("Lebanon",(long)6825445);
		Asia.put("Kyrgyzstan",(long)6524195);
		Asia.put("Turkmenistan",(long)6031200);
		Asia.put("Singapore",(long)5850342);
		Asia.put("Oman",(long)5106626);
		Asia.put("State of Palestine",(long)501414);
		Asia.put("Kuwait",(long)4270571);
		Asia.put("Georgia",(long)3989167);
		Asia.put("Mongolia",(long)3278290);
		Asia.put("Armenia",(long)2963243);
		Asia.put("Qatar",(long)2881053);
		Asia.put("Bahrain",(long)1701575);
		Asia.put("Timor-Leste",(long)1318445);	
		Asia.put("Cyprus",(long)1207359);
		Asia.put("Bhutan",(long)771608);
		Asia.put("Macao",(long)649335);
		Asia.put("Maldives",(long)540544);
		Asia.put("Brunei Darussalam",(long)	437479);
		Australia.put("Australia",(long)	25499884);
		Australia.put("Papua New Guinea",(long)	8947024);
		Australia.put("New Zealand",(long)	4822233);
		Australia.put("Fiji",(long)896445);
		Australia.put("Solomon Islands",(long)686884);
		Australia.put("Micronesia",(long)548914);
		Australia.put("Vanuatu",(long)307145);
		Australia.put("New Caledonia",(long)285498);
		Australia.put("French Polynesia",(long)280908);
		Australia.put("Samoa",(long)198414);
		Australia.put("Guam",(long)168775);
		Australia.put("Kiribati",(long)119449);
		Australia.put("Tonga",(long)	105695);
		Australia.put("Marshall Islands",(long)59190);
		Australia.put("Northern Mariana Islands",(long)57559);
		Australia.put("American Samoa",(long)55191);
		Australia.put("Palau",(long)	18094);
		Australia.put("Cook Islands",(long)17564);
		Australia.put("Tuvalu",(long)11792);
		Australia.put("Wallis and Futuna Islands",(long)11239);
		Australia.put("Nauru",(long)10824);
		Australia.put("Niue",(long)1626);
		Australia.put("Tokelau",(long)	1357);
			
		
		Africa.forEach((c,p)->AfricaC.add(new Country(c,p)));
		
		SAmerica.forEach((c,p)->SAmericaC.add(new Country(c,p))	);
		NAmerica.forEach((c,p)->NAmericaC.add(new Country(c,p))	);
		Europe.forEach((c,p)->EuropeC.add(new Country(c,p))	);
		Asia.forEach((c,p)->AsiaC.add(new Country(c,p))	);
		Australia.forEach((c,p)->AustraliaC.add(new Country(c,p))	);
	}
	
	static LinkedHashMap<String, Integer>linkedHashMap(){
		linkedHashMapobject.put("Samsung Grand quattro price ", 10000);

		linkedHashMapobject.put("Micromax canvas price",9000);

		linkedHashMapobject.put("Sony T2 Ultra price", 20000);

		linkedHashMapobject.put("Nokia Lumia price", 15000);

		linkedHashMapobject.put("Microsoft Lumia price ", 16000);
		return (LinkedHashMap<String, Integer>) linkedHashMapobject;
		
	}
	
	static TreeMap<Integer,String>treemap(){
		treemap.put(102,"Core");

		treemap.put(100,"I");

		treemap.put(103,"Java");

		treemap.put(101,"Love");
		
		return treemap;
	}
	
	
	public static class Country {
	    public String getContinent() {
	        return continent;
	    }

	    public long getPopulation() {
	        return population;
	    }

	    public Country(String continent, long population) {
	        this.continent = continent;
	        this.population = population;
	    }
	    public Country() {
			// TODO Auto-generated constructor stub
		}
		String continent;
	    long population;
	}
}
