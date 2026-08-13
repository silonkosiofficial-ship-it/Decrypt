package p010b;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.nio.charset.Charset f23992a = java.nio.charset.StandardCharsets.UTF_8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f23993b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char[] f23994c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private static void a(byte[] bArr, int i6, int i10, char[] cArr, char[] cArr2, int i11) {
        for (int i12 = i6; i12 < i6 + i10; i12++) {
            int i13 = i11 + 1;
            byte b6 = bArr[i12];
            cArr2[i11] = cArr[(b6 & 240) >>> 4];
            i11 += 2;
            cArr2[i13] = cArr[b6 & 15];
        }
    }

    public static char[] b(byte[] bArr) {
        return c(bArr, true);
    }

    public static char[] c(byte[] bArr, boolean z6) {
        return d(bArr, z6 ? f23993b : f23994c);
    }

    protected static char[] d(byte[] bArr, char[] cArr) {
        char[] cArr2 = new char[bArr.length << 1];
        a(bArr, 0, bArr.length, cArr, cArr2, 0);
        return cArr2;
    }

    public static java.lang.String e(byte[] bArr) {
        return new java.lang.String(b(bArr));
    }
}
