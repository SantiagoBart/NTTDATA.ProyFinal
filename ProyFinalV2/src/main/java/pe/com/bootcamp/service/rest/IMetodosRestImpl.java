package pe.com.bootcamp.service.rest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@Component
public class IMetodosRestImpl implements IMetodosRest {
	private static final Logger logger = LoggerFactory.getLogger(IMetodosRestImpl.class);
/*
	@Autowired
	PropertiesExternas prop;
	
	@Override
	public ListarSerieUnificadaResponse listar(String mensajeTransaccion, ListarSerieUnificadaRequest request) {
		ListarSerieUnificadaResponse responsefinal = new ListarSerieUnificadaResponse();
		
	    String urlValidarDisponibilidadRest = prop.validarDisponibilidadUrl;
	    
		try {
			 logger.info("{} Conectando URL WS: {}",mensajeTransaccion , urlValidarDisponibilidadRest);
			
		      URL url = new URL(urlValidarDisponibilidadRest);

		      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		      connection.setRequestMethod("POST");
		      connection.setRequestProperty("accept", "application/json");
		      connection.setRequestProperty("Content-Type", "application/json");

		      connection.setReadTimeout(Integer.parseInt("20000"));
		      connection.setConnectTimeout(Integer.parseInt("20000"));
		      connection.setDoOutput(true);

		      logger.info(mensajeTransaccion + " Request Body: " + ClaroUtil.printPrettyJSONString(request));

		      // You Can also Create JSONObject here
		      stringBuild(connection, request);
		      int httpResult = connection.getResponseCode();
		      if (httpResult == HttpURLConnection.HTTP_OK) {
		        String response = bufferedReader(connection);
		        logger.info(mensajeTransaccion + Constantes.RESPUESTA_SERVICIO.replace(Constantes.RESPONSE, response));

		        responsefinal = (new ObjectMapper()).readValue(response, ListarSerieUnificadaResponse.class);
		        connection.disconnect();
		      } else {
		        String responseJson = ClaroUtil.bufferedReaderError(connection);
		        logger.info(mensajeTransaccion + Constantes.RESPUESTA_SERVICIO.replace(Constantes.RESPONSE, responseJson));

		        return null;
		      }

		   
		} catch (Exception e) {
			logger.info("ocurrio un error: " + e.getMessage());
		}
		return responsefinal;
	}

	public String bufferedReader(HttpURLConnection connection) throws IOException {
	    StringBuilder sb = new StringBuilder();
	    BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	    String line = null;
	    while ((line = br.readLine()) != null) {
	      sb.append(line + "\n");
	    }
	    br.close();
	    return sb.toString();
	  }

	  public void stringBuild(HttpURLConnection connection, Object object) throws JsonProcessingException, IOException {
	    OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
	    out.write((new ObjectMapper()).writeValueAsString(object));
	    out.close();
	  }*/
}
