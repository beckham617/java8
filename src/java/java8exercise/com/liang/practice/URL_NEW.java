package java8exercise.com.liang.practice;

import java.net.MalformedURLException;

public class URL_NEW {

	private String protocol;
	private String host;
	private String port;
	private String path;
	
	public URL_NEW(String url) {
		this(null,url);
	}
	
    public URL_NEW(URL_NEW ctnt, String url) {
    	
		String original = url;
        int i, limit, c;
        int start = 0;
        String newProtocol = null;
        boolean aRef=false;
        boolean isRelative = false;

        try {
            limit = url.length();
            while ((limit > 0) && (url.charAt(limit - 1) <= ' ')) {
                limit--;
            }
            while ((start < limit) && (url.charAt(start) <= ' ')) {
                start++;
            }

            if (url.regionMatches(true, start, "url:", 0, 4)) {
                start += 4;
            }
            if (start < url.length() && url.charAt(start) == '#') {
                aRef=true;
            }
            for (i = start ; !aRef && (i < limit) &&
                     ((c = url.charAt(i)) != '/') ; i++) {
                if (c == ':') {

                    String s = url.substring(start, i).toLowerCase();
                    newProtocol = s;
                    start = i + 1;
                    break;
                }
            }

            // Only use our ctnt if the protocols match.
            protocol = newProtocol;
            if ((ctnt != null) && ((newProtocol == null) ||
                            newProtocol.equalsIgnoreCase(ctnt.protocol))) {
                if (ctnt.path != null && ctnt.path.startsWith("/"))
                    newProtocol = null;

                if (newProtocol == null) {
                    protocol = ctnt.protocol;
                    //authority = ctnt.authority;
                    //userInfo = ctnt.userInfo;
                    host = ctnt.host;
                    port = ctnt.port;
                    //file = ctnt.file;
                    path = ctnt.path;
                    isRelative = true;
                }
            }

            if (protocol == null) {
                throw new MalformedURLException("no protocol: "+original);
            }




        } catch(MalformedURLException e) {
            //throw e;
        } catch(Exception e) {
            throw e;
        }
    
	}

	public String getProtocol() {
		return protocol;
	}

	public String getHost() {
		return host;
	}

	public String getPort() {
		return port;
	}

	public String getPath() {
		return path;
	}
	   
    
	    
}
