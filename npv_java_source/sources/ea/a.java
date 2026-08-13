package ea;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends java.security.SecureRandom {
    public final void a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        super.nextBytes(bArr);
    }
}
