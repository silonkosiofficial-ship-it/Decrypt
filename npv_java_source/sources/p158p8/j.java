package p158p8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f52821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.nio.ByteBuffer f52822b;

    public interface a {
        int c();
    }

    public interface b {
        p8.j.a a(int i6);
    }

    static {
        byte[] bArr = new byte[0];
        f52821a = bArr;
        f52822b = java.nio.ByteBuffer.wrap(bArr);
    }

    public static boolean a(byte[] bArr) {
        return p158p8.x.e(bArr);
    }

    public static java.lang.String b(byte[] bArr) {
        try {
            return new java.lang.String(bArr, "UTF-8");
        } catch (java.io.UnsupportedEncodingException e6) {
            throw new java.lang.RuntimeException("UTF-8 not supported?", e6);
        }
    }
}
