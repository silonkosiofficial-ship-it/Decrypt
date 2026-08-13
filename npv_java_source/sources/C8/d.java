package C8;

/* JADX INFO: loaded from: classes2.dex */
public final class d {
    public final java.io.InputStream a(java.lang.String str) throws java.io.IOException {
        p247y7.AbstractC7350t.f(str, "path");
        java.lang.ClassLoader classLoader = C8.d.class.getClassLoader();
        if (classLoader == null) {
            return java.lang.ClassLoader.getSystemResourceAsStream(str);
        }
        java.net.URL resource = classLoader.getResource(str);
        if (resource == null) {
            return null;
        }
        java.net.URLConnection uRLConnectionOpenConnection = resource.openConnection();
        uRLConnectionOpenConnection.setUseCaches(false);
        return uRLConnectionOpenConnection.getInputStream();
    }
}
