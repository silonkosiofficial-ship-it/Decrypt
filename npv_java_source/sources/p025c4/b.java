package p025c4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.security.SecureRandom f24416a = new java.security.SecureRandom();

    public static java.lang.String a() {
        byte[] bArr = new byte[16];
        f24416a.nextBytes(bArr);
        return android.util.Base64.encodeToString(bArr, 11);
    }
}
