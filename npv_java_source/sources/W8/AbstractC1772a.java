package W8;

/* JADX INFO: renamed from: W8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1772a extends W8.F0 implements W8.InterfaceC1822z0, p127m7.e, W8.N {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p127m7.i f15481E;

    public AbstractC1772a(p127m7.i iVar, boolean z6, boolean z10) {
        super(z10);
        if (z6) {
            i0((W8.InterfaceC1822z0) iVar.i(W8.InterfaceC1822z0.f15544h));
        }
        this.f15481E = iVar.o0(this);
    }

    @Override // W8.F0
    protected final void G0(java.lang.Object obj) {
        if (!(obj instanceof W8.A)) {
            i1(obj);
        } else {
            W8.A a6 = (W8.A) obj;
            h1(a6.f15423a, a6.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // W8.F0
    public java.lang.String I() {
        return W8.S.a(this) + " was cancelled";
    }

    @Override // W8.F0, W8.InterfaceC1822z0
    public boolean f() {
        return super.f();
    }

    protected void g1(java.lang.Object obj) {
        u(obj);
    }

    @Override // p127m7.e
    public final p127m7.i getContext() {
        return this.f15481E;
    }

    @Override // W8.N
    public p127m7.i getCoroutineContext() {
        return this.f15481E;
    }

    @Override // W8.F0
    public final void h0(java.lang.Throwable th) {
        W8.L.a(this.f15481E, th);
    }

    protected void h1(java.lang.Throwable th, boolean z6) {
    }

    protected void i1(java.lang.Object obj) {
    }

    public final void j1(W8.P p6, java.lang.Object obj, p237x7.p pVar) {
        p6.g(pVar, obj, this);
    }

    @Override // p127m7.e
    public final void t(java.lang.Object obj) {
        java.lang.Object objV0 = v0(W8.C.b(obj));
        if (objV0 == W8.G0.f15446b) {
            return;
        }
        g1(objV0);
    }

    @Override // W8.F0
    public java.lang.String w0() {
        java.lang.String strG = W8.H.g(this.f15481E);
        if (strG == null) {
            return super.w0();
        }
        return '\"' + strG + "\":" + super.w0();
    }
}
