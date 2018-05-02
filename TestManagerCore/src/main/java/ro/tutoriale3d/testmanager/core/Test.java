package ro.tutoriale3d.testmanager.core;

import javax.xml.bind.annotation.XmlRootElement;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * @author alexgrigoras
 * @created 18 feb 2018
 * @version 1.0
 */
@XmlRootElement
public class Test {
	private int Nr_intrebare;
	private String Enunt;
	private String Rasp1;
	private String Rasp2;
	private String Rasp3;
	private String Rasp4;
	private String Solutie;
	
	public Test() {
	}
	
	public Test(int Nr_intrebare, String Enunt, String Rasp1, String Rasp2,String Rasp3,String Rasp4,String Solutie) {
		super();
		this.Nr_intrebare = Nr_intrebare;
		this.Enunt = Enunt;
		this.Rasp1 = Rasp1;
		this.Rasp2 = Rasp2;
		this.Rasp3 = Rasp3;
		this.Rasp4 = Rasp4;
		this.Solutie = Solutie;
	}
	public int getNr_intrebare() {
		return Nr_intrebare;
	}
	public String getEnunt() {
		return Enunt;
	}
	public String getRasp1() {
		return Rasp1;
	}
	public String getRasp2() {
		return Rasp2;
	}
	public String getRasp3() {
		return Rasp3;
	}
	public String getRasp4() {
		return Rasp4;
	}
	public String getSolutie() {
		return Solutie;
	}
	@Override
	public String toString() {
		
		JSONObject testObject = new JSONObject();
		testObject.put("Nr_intrebare", Nr_intrebare);
		testObject.put("Enunt", Enunt);
		testObject.put("Rasp1", Rasp1);
		testObject.put("Rasp2", Rasp2);
		testObject.put("Rasp3", Rasp3);
		testObject.put("Rasp4", Rasp4);
		testObject.put("Solutie", Solutie);
		
        //System.out.println("Object: test");
        
        return testObject.toJSONString();
	}
	
}