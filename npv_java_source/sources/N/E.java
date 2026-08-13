package N;

/* JADX INFO: loaded from: classes.dex */
public final class E extends N.AbstractC1352b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final S0.V f7296j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final H.V f7297k;

    public E(S0.V v6, S0.L l6, H.V v10, N.I i6) {
        super(v6.f(), v6.h(), v10 != null ? v10.f() : null, l6, i6, null);
        this.f7296j = v6;
        this.f7297k = v10;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    private final int a0(H.V v6, int i6) {
        p131n0.i iVarA;
        D0.InterfaceC0900t interfaceC0900tC = v6.c();
        if (interfaceC0900tC != null) {
            D0.InterfaceC0900t interfaceC0900tB = v6.b();
            iVarA = interfaceC0900tB != null ? D0.AbstractC0899s.a(interfaceC0900tB, interfaceC0900tC, false, 2, null) : null;
            if (iVarA == null) {
                iVarA = p131n0.i.f51317e.a();
            }
        } else {
            iVarA = p131n0.i.f51317e.a();
        }
        p131n0.i iVarE = v6.f().e(p().b(M0.N.i(this.f7296j.h())));
        return p().a(v6.f().x(p131n0.h.a(iVarE.i(), iVarE.l() + (p131n0.m.g(iVarA.k()) * i6))));
    }

    public final java.util.List Y(p237x7.l lVar) {
        if (!M0.N.h(u())) {
            return p097j7.AbstractC6879v.p(new S0.C1593a("", 0), new S0.U(M0.N.l(u()), M0.N.l(u())));
        }
        S0.InterfaceC1601i interfaceC1601i = (S0.InterfaceC1601i) lVar.l(this);
        if (interfaceC1601i != null) {
            return p097j7.AbstractC6879v.e(interfaceC1601i);
        }
        return null;
    }

    public final S0.V Z() {
        return S0.V.d(this.f7296j, e(), u(), null, 4, null);
    }

    public final N.E b0() {
        H.V v6;
        if (w().length() > 0 && (v6 = this.f7297k) != null) {
            T(a0(v6, 1));
        }
        p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final N.E c0() {
        H.V v6;
        if (w().length() > 0 && (v6 = this.f7297k) != null) {
            T(a0(v6, -1));
        }
        p247y7.AbstractC7350t.d(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }
}
