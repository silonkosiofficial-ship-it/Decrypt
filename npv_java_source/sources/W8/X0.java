package W8;

/* JADX INFO: loaded from: classes2.dex */
public final class X0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W8.X0 f15476a = new W8.X0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.ThreadLocal f15477b = p019b9.N.a(new p019b9.D("ThreadLocalEventLoop"));

    private X0() {
    }

    public final W8.AbstractC1791j0 a() {
        return (W8.AbstractC1791j0) f15477b.get();
    }

    public final W8.AbstractC1791j0 b() {
        java.lang.ThreadLocal threadLocal = f15477b;
        W8.AbstractC1791j0 abstractC1791j0 = (W8.AbstractC1791j0) threadLocal.get();
        if (abstractC1791j0 != null) {
            return abstractC1791j0;
        }
        W8.AbstractC1791j0 abstractC1791j0A = W8.AbstractC1797m0.a();
        threadLocal.set(abstractC1791j0A);
        return abstractC1791j0A;
    }

    public final void c() {
        f15477b.set(null);
    }

    public final void d(W8.AbstractC1791j0 abstractC1791j0) {
        f15477b.set(abstractC1791j0);
    }
}
