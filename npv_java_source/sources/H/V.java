package H;

/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M0.K f3780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private D0.InterfaceC0900t f3781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private D0.InterfaceC0900t f3782c;

    public V(M0.K k6, D0.InterfaceC0900t interfaceC0900t, D0.InterfaceC0900t interfaceC0900t2) {
        this.f3780a = k6;
        this.f3781b = interfaceC0900t;
        this.f3782c = interfaceC0900t2;
    }

    public /* synthetic */ V(M0.K k6, D0.InterfaceC0900t interfaceC0900t, D0.InterfaceC0900t interfaceC0900t2, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(k6, (i6 & 2) != 0 ? null : interfaceC0900t, (i6 & 4) != 0 ? null : interfaceC0900t2);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    private final long a(long j6) {
        p131n0.i iVarA;
        D0.InterfaceC0900t interfaceC0900t = this.f3781b;
        if (interfaceC0900t == null) {
            iVarA = p131n0.i.f51317e.a();
        } else {
            if (interfaceC0900t.K()) {
                D0.InterfaceC0900t interfaceC0900t2 = this.f3782c;
                iVarA = null;
                if (interfaceC0900t2 != null) {
                    iVarA = D0.AbstractC0899s.a(interfaceC0900t2, interfaceC0900t, false, 2, null);
                }
            } else {
                iVarA = p131n0.i.f51317e.a();
            }
            if (iVarA == null) {
                iVarA = p131n0.i.f51317e.a();
            }
        }
        return H.W.b(j6, iVarA);
    }

    public static /* synthetic */ int e(H.V v6, long j6, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            z6 = true;
        }
        return v6.d(j6, z6);
    }

    public final D0.InterfaceC0900t b() {
        return this.f3782c;
    }

    public final D0.InterfaceC0900t c() {
        return this.f3781b;
    }

    public final int d(long j6, boolean z6) {
        if (z6) {
            j6 = a(j6);
        }
        return this.f3780a.x(j(j6));
    }

    public final M0.K f() {
        return this.f3780a;
    }

    public final boolean g(long j6) {
        long j10 = j(a(j6));
        int iR = this.f3780a.r(p131n0.g.n(j10));
        return p131n0.g.m(j10) >= this.f3780a.s(iR) && p131n0.g.m(j10) <= this.f3780a.t(iR);
    }

    public final void h(D0.InterfaceC0900t interfaceC0900t) {
        this.f3782c = interfaceC0900t;
    }

    public final void i(D0.InterfaceC0900t interfaceC0900t) {
        this.f3781b = interfaceC0900t;
    }

    public final long j(long j6) {
        D0.InterfaceC0900t interfaceC0900t;
        D0.InterfaceC0900t interfaceC0900t2 = this.f3781b;
        if (interfaceC0900t2 == null) {
            return j6;
        }
        if (!interfaceC0900t2.K()) {
            interfaceC0900t2 = null;
        }
        if (interfaceC0900t2 == null || (interfaceC0900t = this.f3782c) == null) {
            return j6;
        }
        D0.InterfaceC0900t interfaceC0900t3 = interfaceC0900t.K() ? interfaceC0900t : null;
        return interfaceC0900t3 == null ? j6 : interfaceC0900t2.G(interfaceC0900t3, j6);
    }

    public final long k(long j6) {
        D0.InterfaceC0900t interfaceC0900t;
        D0.InterfaceC0900t interfaceC0900t2 = this.f3781b;
        if (interfaceC0900t2 == null) {
            return j6;
        }
        if (!interfaceC0900t2.K()) {
            interfaceC0900t2 = null;
        }
        if (interfaceC0900t2 == null || (interfaceC0900t = this.f3782c) == null) {
            return j6;
        }
        D0.InterfaceC0900t interfaceC0900t3 = interfaceC0900t.K() ? interfaceC0900t : null;
        return interfaceC0900t3 == null ? j6 : interfaceC0900t3.G(interfaceC0900t2, j6);
    }
}
