package p055f4;

/* JADX INFO: loaded from: classes3.dex */
public final class T0 implements p055f4.S0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f45082a;

    private T0(java.lang.Object obj) {
        this.f45082a = obj;
    }

    public static p055f4.S0 b(java.lang.Object obj) {
        if (obj != null) {
            return new p055f4.T0(obj);
        }
        throw new java.lang.NullPointerException("instance cannot be null");
    }

    @Override // p055f4.W0
    public final java.lang.Object a() {
        return this.f45082a;
    }
}
