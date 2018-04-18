package tutorials3d.webservices.core;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author alexgrigoras
 * @created 17 feb 2018
 * @version 1.0
 */
@XmlRootElement
public class Tutorial {

	private int id;
	private String intrebare;
	private String[] variante = new String[4];;
	private String raspuns;
	
	public Tutorial() {
	}
	
}
