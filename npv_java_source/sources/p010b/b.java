package p010b;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    private static byte[] a(java.lang.String str, java.nio.charset.Charset charset) {
        if (str == null) {
            return null;
        }
        return str.getBytes(charset);
    }

    public static byte[] b(java.lang.String str) {
        return a(str, java.nio.charset.StandardCharsets.UTF_8);
    }
}
