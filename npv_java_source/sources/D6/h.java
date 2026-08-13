package D6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {
    public static final void a(java.lang.Long l6, long j6, T6.A a6) {
        p247y7.AbstractC7350t.f(a6, "method");
        if (l6 == null || l6.longValue() < 0 || p247y7.AbstractC7350t.b(a6, T6.A.f12975b.b()) || l6.longValue() == j6) {
            return;
        }
        throw new java.lang.IllegalStateException("Content-Length mismatch: expected " + l6 + " bytes, but received " + j6 + " bytes");
    }
}
