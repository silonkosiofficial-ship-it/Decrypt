package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2064y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final java.nio.charset.Charset f22234a = java.nio.charset.Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final java.nio.charset.Charset f22235b = java.nio.charset.Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final java.nio.charset.Charset f22236c = java.nio.charset.Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f22237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final java.nio.ByteBuffer f22238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.AbstractC2048h f22239f;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.y$a */
    public interface a {
        boolean a(int i6);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.y$b */
    public interface b extends java.util.List, java.util.RandomAccess {
        boolean I();

        void q();

        androidx.datastore.preferences.protobuf.AbstractC2064y.b u(int i6);
    }

    static {
        byte[] bArr = new byte[0];
        f22237d = bArr;
        f22238e = java.nio.ByteBuffer.wrap(bArr);
        f22239f = androidx.datastore.preferences.protobuf.AbstractC2048h.h(bArr);
    }

    static java.lang.Object a(java.lang.Object obj) {
        obj.getClass();
        return obj;
    }

    static java.lang.Object b(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException(str);
    }

    public static int c(boolean z6) {
        return z6 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i6, int i10) {
        int iH = h(i10, bArr, i6, i10);
        if (iH == 0) {
            return 1;
        }
        return iH;
    }

    public static int f(long j6) {
        return (int) (j6 ^ (j6 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return androidx.datastore.preferences.protobuf.q0.m(bArr);
    }

    static int h(int i6, byte[] bArr, int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            i6 = (i6 * 31) + bArr[i12];
        }
        return i6;
    }

    public static java.lang.String i(byte[] bArr) {
        return new java.lang.String(bArr, f22235b);
    }
}
