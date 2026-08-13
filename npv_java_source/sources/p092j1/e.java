package p092j1;

/* JADX INFO: loaded from: classes.dex */
public class e extends p092j1.a implements p102k1.e {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private final p092j1.g f49157o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final j1.g.e f49158p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private java.util.ArrayList f49159q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private p122m1.j f49160r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p092j1.g gVar, j1.g.e eVar) {
        super(gVar);
        p247y7.AbstractC7350t.f(gVar, "state");
        p247y7.AbstractC7350t.f(eVar, "type");
        this.f49157o0 = gVar;
        this.f49158p0 = eVar;
        this.f49159q0 = new java.util.ArrayList();
    }

    public final p092j1.e T0(java.lang.Object... objArr) {
        p247y7.AbstractC7350t.f(objArr, "objects");
        p097j7.AbstractC6879v.D(this.f49159q0, objArr);
        return this;
    }

    public final void U0() {
        super.apply();
    }

    public p122m1.j V0() {
        return this.f49160r0;
    }

    protected final p092j1.g W0() {
        return this.f49157o0;
    }

    public final java.util.ArrayList X0() {
        return this.f49159q0;
    }

    public final j1.g.e Y0() {
        return this.f49158p0;
    }

    @Override // p092j1.a, p092j1.f
    public p122m1.e a() {
        return V0();
    }

    @Override // p092j1.a, p092j1.f
    public void apply() {
    }
}
