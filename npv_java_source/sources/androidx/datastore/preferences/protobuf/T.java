package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class T implements androidx.datastore.preferences.protobuf.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.datastore.preferences.protobuf.O f21964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.datastore.preferences.protobuf.l0 f21965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f21966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.datastore.preferences.protobuf.AbstractC2056p f21967d;

    private T(androidx.datastore.preferences.protobuf.l0 l0Var, androidx.datastore.preferences.protobuf.AbstractC2056p abstractC2056p, androidx.datastore.preferences.protobuf.O o6) {
        this.f21965b = l0Var;
        this.f21966c = abstractC2056p.e(o6);
        this.f21967d = abstractC2056p;
        this.f21964a = o6;
    }

    private int j(androidx.datastore.preferences.protobuf.l0 l0Var, java.lang.Object obj) {
        return l0Var.i(l0Var.g(obj));
    }

    private void k(androidx.datastore.preferences.protobuf.l0 l0Var, androidx.datastore.preferences.protobuf.AbstractC2056p abstractC2056p, java.lang.Object obj, androidx.datastore.preferences.protobuf.d0 d0Var, androidx.datastore.preferences.protobuf.C2055o c2055o) {
        java.lang.Object objF = l0Var.f(obj);
        androidx.datastore.preferences.protobuf.C2058s c2058sD = abstractC2056p.d(obj);
        while (d0Var.A() != Integer.MAX_VALUE) {
            try {
                if (!m(d0Var, c2055o, abstractC2056p, c2058sD, l0Var, objF)) {
                    return;
                }
            } finally {
                l0Var.o(obj, objF);
            }
        }
    }

    static androidx.datastore.preferences.protobuf.T l(androidx.datastore.preferences.protobuf.l0 l0Var, androidx.datastore.preferences.protobuf.AbstractC2056p abstractC2056p, androidx.datastore.preferences.protobuf.O o6) {
        return new androidx.datastore.preferences.protobuf.T(l0Var, abstractC2056p, o6);
    }

    private boolean m(androidx.datastore.preferences.protobuf.d0 d0Var, androidx.datastore.preferences.protobuf.C2055o c2055o, androidx.datastore.preferences.protobuf.AbstractC2056p abstractC2056p, androidx.datastore.preferences.protobuf.C2058s c2058s, androidx.datastore.preferences.protobuf.l0 l0Var, java.lang.Object obj) throws androidx.datastore.preferences.protobuf.C2065z {
        int iU = d0Var.u();
        if (iU != androidx.datastore.preferences.protobuf.r0.f22110a) {
            if (androidx.datastore.preferences.protobuf.r0.b(iU) != 2) {
                return d0Var.H();
            }
            java.lang.Object objB = abstractC2056p.b(c2055o, this.f21964a, androidx.datastore.preferences.protobuf.r0.a(iU));
            if (objB == null) {
                return l0Var.m(obj, d0Var);
            }
            abstractC2056p.h(d0Var, objB, c2055o, c2058s);
            return true;
        }
        java.lang.Object objB2 = null;
        int iK = 0;
        androidx.datastore.preferences.protobuf.AbstractC2047g abstractC2047gD = null;
        while (d0Var.A() != Integer.MAX_VALUE) {
            int iU2 = d0Var.u();
            if (iU2 == androidx.datastore.preferences.protobuf.r0.f22112c) {
                iK = d0Var.k();
                objB2 = abstractC2056p.b(c2055o, this.f21964a, iK);
            } else if (iU2 == androidx.datastore.preferences.protobuf.r0.f22113d) {
                if (objB2 != null) {
                    abstractC2056p.h(d0Var, objB2, c2055o, c2058s);
                } else {
                    abstractC2047gD = d0Var.D();
                }
            } else if (!d0Var.H()) {
                break;
            }
        }
        if (d0Var.u() != androidx.datastore.preferences.protobuf.r0.f22111b) {
            throw androidx.datastore.preferences.protobuf.C2065z.b();
        }
        if (abstractC2047gD != null) {
            if (objB2 != null) {
                abstractC2056p.i(abstractC2047gD, objB2, c2055o, c2058s);
            } else {
                l0Var.d(obj, iK, abstractC2047gD);
            }
        }
        return true;
    }

    private void n(androidx.datastore.preferences.protobuf.l0 l0Var, java.lang.Object obj, androidx.datastore.preferences.protobuf.s0 s0Var) {
        l0Var.s(l0Var.g(obj), s0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void a(java.lang.Object obj, java.lang.Object obj2) {
        androidx.datastore.preferences.protobuf.g0.F(this.f21965b, obj, obj2);
        if (this.f21966c) {
            androidx.datastore.preferences.protobuf.g0.D(this.f21967d, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void b(java.lang.Object obj, androidx.datastore.preferences.protobuf.d0 d0Var, androidx.datastore.preferences.protobuf.C2055o c2055o) {
        k(this.f21965b, this.f21967d, obj, d0Var, c2055o);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void c(java.lang.Object obj) {
        this.f21965b.j(obj);
        this.f21967d.f(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final boolean d(java.lang.Object obj) {
        return this.f21967d.c(obj).k();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void e(java.lang.Object obj, androidx.datastore.preferences.protobuf.s0 s0Var) {
        java.util.Iterator itN = this.f21967d.c(obj).n();
        if (itN.hasNext()) {
            androidx.appcompat.app.D.a(((java.util.Map.Entry) itN.next()).getKey());
            throw null;
        }
        n(this.f21965b, obj, s0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public boolean f(java.lang.Object obj, java.lang.Object obj2) {
        if (!this.f21965b.g(obj).equals(this.f21965b.g(obj2))) {
            return false;
        }
        if (this.f21966c) {
            return this.f21967d.c(obj).equals(this.f21967d.c(obj2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int g(java.lang.Object obj) {
        int iJ = j(this.f21965b, obj);
        return this.f21966c ? iJ + this.f21967d.c(obj).f() : iJ;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public java.lang.Object h() {
        androidx.datastore.preferences.protobuf.O o6 = this.f21964a;
        return o6 instanceof androidx.datastore.preferences.protobuf.AbstractC2062w ? ((androidx.datastore.preferences.protobuf.AbstractC2062w) o6).H() : o6.c().R();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int i(java.lang.Object obj) {
        int iHashCode = this.f21965b.g(obj).hashCode();
        return this.f21966c ? (iHashCode * 53) + this.f21967d.c(obj).hashCode() : iHashCode;
    }
}
