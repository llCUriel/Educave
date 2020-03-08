package MD5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash {

    private MessageDigest md;
    private StringBuffer sb;
    private byte[] array;
    private String hashType;

    public Hash() {
        this.md = null;
        this.sb = null;
        this.array = null;
    }

    public Hash(MessageDigest md, StringBuffer sb, byte[] array) {
        this.md = md;
        this.sb = sb;
        this.array = array;
    }

    public Hash(String hashType) {
        this.hashType = hashType;
        this.md = null;
        this.sb = null;
        this.array = null;
    }

    public String getHash(String txt, String hashType) {
        try {
            md = MessageDigest.getInstance(hashType);
            array = md.digest(txt.getBytes());
            sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100)
                        .substring(1, 3));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public String encriptarTextoMD5(String txt) {
        hashType = "MD5";
        return getHash(txt, hashType);
    }

    public String encriptarTextoSHA1(String txt) {
        hashType = "SHA1";
        return getHash(txt, hashType);
    }

}
