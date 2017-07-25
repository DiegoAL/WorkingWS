package model;

import java.io.InputStream;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class ReadXML {

	public List<Negociacao> read(InputStream xml) {
		XStream xStream = new XStream(new DomDriver());
		xStream.alias("negociacao", Negociacao.class);
		return (List<Negociacao>) xStream.fromXML(xml);
	}
}
