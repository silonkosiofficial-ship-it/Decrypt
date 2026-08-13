package V3;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static java.lang.String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return android.util.Base64.encodeToString(bArr, 0);
    }

    public static java.lang.String b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return android.util.Base64.encodeToString(bArr, 11);
    }
}
