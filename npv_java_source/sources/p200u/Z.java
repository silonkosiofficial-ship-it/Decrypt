package p200u;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends p200u.v0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f54777d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V.InterfaceC1753w0 f54778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V.InterfaceC1753w0 f54779c;

    public Z(java.lang.Object obj) {
        super(null);
        this.f54778b = V.A1.d(obj, null, 2, null);
        this.f54779c = V.A1.d(obj, null, 2, null);
    }

    @Override // p200u.v0
    public java.lang.Object a() {
        return this.f54778b.getValue();
    }

    @Override // p200u.v0
    public java.lang.Object b() {
        return this.f54779c.getValue();
    }

    @Override // p200u.v0
    public void d(java.lang.Object obj) {
        this.f54778b.setValue(obj);
    }

    @Override // p200u.v0
    public void f(p200u.s0 s0Var) {
    }

    @Override // p200u.v0
    public void g() {
    }

    public void h(java.lang.Object obj) {
        this.f54779c.setValue(obj);
    }
}
