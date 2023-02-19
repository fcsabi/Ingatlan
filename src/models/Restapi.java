// Farkas Csaba
// 2023-002-19
// SZOFT II/N
// Dolgozat IV
package models;

public class Restapi {

    public Restapi() {
    }

    public String getIngatlan() {
        HttpClient http = new HttpClient();
        String host = "http://[::1]:3000/";
        String endpoint = "ingatlan";
        String urlStr = host + endpoint;
        String res = http.get(urlStr);
        return res;
    }

}
