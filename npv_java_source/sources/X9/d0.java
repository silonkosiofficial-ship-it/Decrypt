package X9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d0 {
    public static final byte[] a(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "<this>");
        byte[] bytes = str.getBytes(S8.C1631d.f12624b);
        p247y7.AbstractC7350t.e(bytes, "getBytes(...)");
        return bytes;
    }

    public static final java.util.concurrent.locks.ReentrantLock b() {
        return new java.util.concurrent.locks.ReentrantLock();
    }

    public static final java.lang.String c(byte[] bArr) {
        p247y7.AbstractC7350t.f(bArr, "<this>");
        return new java.lang.String(bArr, S8.C1631d.f12624b);
    }
}
