package p055f4;

/* JADX INFO: loaded from: classes3.dex */
public final class Q0 implements p055f4.S0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p055f4.V0 f45074a;

    public static void b(p055f4.V0 v6, p055f4.V0 v10) {
        p055f4.Q0 q6 = (p055f4.Q0) v6;
        if (q6.f45074a != null) {
            throw new java.lang.IllegalStateException();
        }
        q6.f45074a = v10;
    }

    @Override // p055f4.W0
    public final java.lang.Object a() {
        p055f4.V0 v6 = this.f45074a;
        if (v6 != null) {
            return v6.a();
        }
        throw new java.lang.IllegalStateException();
    }
}
