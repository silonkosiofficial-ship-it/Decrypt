package D0;

/* JADX INFO: renamed from: D0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0891j implements D0.G {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final D0.InterfaceC0895n f1873C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final D0.EnumC0897p f1874D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final D0.EnumC0898q f1875E;

    public C0891j(D0.InterfaceC0895n interfaceC0895n, D0.EnumC0897p enumC0897p, D0.EnumC0898q enumC0898q) {
        this.f1873C = interfaceC0895n;
        this.f1874D = enumC0897p;
        this.f1875E = enumC0898q;
    }

    @Override // D0.InterfaceC0895n
    public int S(int i6) {
        return this.f1873C.S(i6);
    }

    @Override // D0.InterfaceC0895n
    public int T(int i6) {
        return this.f1873C.T(i6);
    }

    @Override // D0.G
    public D0.X U(long j6) {
        if (this.f1875E == D0.EnumC0898q.Width) {
            return new D0.C0893l(this.f1874D == D0.EnumC0897p.Max ? this.f1873C.T(Y0.C1859b.k(j6)) : this.f1873C.S(Y0.C1859b.k(j6)), Y0.C1859b.g(j6) ? Y0.C1859b.k(j6) : 32767);
        }
        return new D0.C0893l(Y0.C1859b.h(j6) ? Y0.C1859b.l(j6) : 32767, this.f1874D == D0.EnumC0897p.Max ? this.f1873C.t(Y0.C1859b.l(j6)) : this.f1873C.n0(Y0.C1859b.l(j6)));
    }

    @Override // D0.InterfaceC0895n
    public java.lang.Object Z() {
        return this.f1873C.Z();
    }

    @Override // D0.InterfaceC0895n
    public int n0(int i6) {
        return this.f1873C.n0(i6);
    }

    @Override // D0.InterfaceC0895n
    public int t(int i6) {
        return this.f1873C.t(i6);
    }
}
