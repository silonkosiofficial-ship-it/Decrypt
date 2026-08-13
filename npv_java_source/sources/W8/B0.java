package W8;

/* JADX INFO: loaded from: classes2.dex */
public class B0 extends W8.F0 implements W8.InterfaceC1819y {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final boolean f15425E;

    public B0(W8.InterfaceC1822z0 interfaceC1822z0) {
        super(true);
        i0(interfaceC1822z0);
        this.f15425E = g1();
    }

    private final boolean g1() {
        W8.F0 f0V;
        W8.InterfaceC1807s interfaceC1807sA0 = a0();
        W8.C1809t c1809t = interfaceC1807sA0 instanceof W8.C1809t ? (W8.C1809t) interfaceC1807sA0 : null;
        if (c1809t != null && (f0V = c1809t.v()) != null) {
            while (!f0V.V()) {
                W8.InterfaceC1807s interfaceC1807sA1 = f0V.a0();
                W8.C1809t c1809t2 = interfaceC1807sA1 instanceof W8.C1809t ? (W8.C1809t) interfaceC1807sA1 : null;
                if (c1809t2 == null || (f0V = c1809t2.v()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // W8.InterfaceC1819y
    public boolean K0() {
        return t0(p087i7.M.f46721a);
    }

    @Override // W8.F0
    public boolean V() {
        return this.f15425E;
    }

    @Override // W8.F0
    public boolean X() {
        return true;
    }

    @Override // W8.InterfaceC1819y
    public boolean g(java.lang.Throwable th) {
        return t0(new W8.A(th, false, 2, null));
    }
}
