package fr.asi.xsp.testblog.composants;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import com.ibm.xsp.library.AbstractXspLibrary;

/**
 * Library contenant les composants générés à partir
 * des custom controls de la base des composants
 * @author Lionel HERVIER
 */
public class ComposantsLibrary extends AbstractXspLibrary {

	/**
	 * @see AbstractXspLibrary#getLibraryId()
	 */
	@Override
	public String getLibraryId() {
		return ComposantsLibrary.class.getPackage().getName();
	}

	/**
	 * @see AbstractXspLibrary#getPluginId()
	 */
	@Override
	public String getPluginId() {
		return ComposantsLibrary.class.getPackage().getName();
	}
	
	/**
	 * @see com.ibm.xsp.library.AbstractXspLibrary#getFacesConfigFiles()
	 */
	@Override
	public String[] getFacesConfigFiles() {
		return new String[] {};
	}
		
	/**
	 * @see AbstractXspLibrary#getXspConfigFiles()
	 */
	@Override
	public String[] getXspConfigFiles() {
		List<String> configs = new ArrayList<String>();
		URL url = Activator.getDefault().getBundle().getEntry("/xsp-config.list");
		if( url != null ) {
			InputStream in = null;
			Reader reader = null;
			BufferedReader breader = null;
			try {
				URLConnection conn = url.openConnection();
				conn.setDoInput(true);
				conn.setDoOutput(false);
				conn.setUseCaches(true);
				in = conn.getInputStream();
				reader = new InputStreamReader(in, "UTF-8");
				breader = new BufferedReader(reader);
				String line = breader.readLine();
				while( line != null ) {
					if( line.length() != 0 )
						configs.add(line);
					line = breader.readLine();
				}
			} catch(IOException e) {
				throw new RuntimeException(e);
			} finally {
				try {
					breader.close();
					reader.close();
					in.close();
				} catch(IOException e) {
					e.printStackTrace(System.err);
				}
			}
		}
		String[] ret = new String[configs.size()];
		configs.toArray(ret);
		return ret;
	}
}
