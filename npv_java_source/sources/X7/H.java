package X7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class H {

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final X7.H.a f15951D = new X7.H.a();

        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(O7.InterfaceC1421b interfaceC1421b) {
            p247y7.AbstractC7350t.f(interfaceC1421b, "it");
            return java.lang.Boolean.valueOf(X7.C1831i.f16020a.b(p218v8.c.t(interfaceC1421b)));
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final X7.H.b f15952D = new X7.H.b();

        b() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(O7.InterfaceC1421b interfaceC1421b) {
            p247y7.AbstractC7350t.f(interfaceC1421b, "it");
            return java.lang.Boolean.valueOf(X7.C1827e.f16009o.j((O7.Z) interfaceC1421b));
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final X7.H.c f15953D = new X7.H.c();

        c() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(O7.InterfaceC1421b interfaceC1421b) {
            p247y7.AbstractC7350t.f(interfaceC1421b, "it");
            return java.lang.Boolean.valueOf(L7.g.g0(interfaceC1421b) && X7.C1828f.m(interfaceC1421b) != null);
        }
    }

    public static final boolean a(O7.InterfaceC1421b interfaceC1421b) {
        p247y7.AbstractC7350t.f(interfaceC1421b, "<this>");
        return d(interfaceC1421b) != null;
    }

    public static final java.lang.String b(O7.InterfaceC1421b interfaceC1421b) {
        O7.InterfaceC1421b interfaceC1421bT;
        p138n8.f fVarI;
        p247y7.AbstractC7350t.f(interfaceC1421b, "callableMemberDescriptor");
        O7.InterfaceC1421b interfaceC1421bC = c(interfaceC1421b);
        if (interfaceC1421bC == null || (interfaceC1421bT = p218v8.c.t(interfaceC1421bC)) == null) {
            return null;
        }
        if (interfaceC1421bT instanceof O7.U) {
            return X7.C1831i.f16020a.a(interfaceC1421bT);
        }
        if (!(interfaceC1421bT instanceof O7.Z) || (fVarI = X7.C1827e.f16009o.i((O7.Z) interfaceC1421bT)) == null) {
            return null;
        }
        return fVarI.g();
    }

    private static final O7.InterfaceC1421b c(O7.InterfaceC1421b interfaceC1421b) {
        if (L7.g.g0(interfaceC1421b)) {
            return d(interfaceC1421b);
        }
        return null;
    }

    public static final O7.InterfaceC1421b d(O7.InterfaceC1421b interfaceC1421b) {
        p237x7.l lVar;
        p247y7.AbstractC7350t.f(interfaceC1421b, "<this>");
        if (!X7.I.f15954a.g().contains(interfaceC1421b.getName()) && !X7.C1829g.f16014a.d().contains(p218v8.c.t(interfaceC1421b).getName())) {
            return null;
        }
        if (interfaceC1421b instanceof O7.U ? true : interfaceC1421b instanceof O7.T) {
            lVar = X7.H.a.f15951D;
        } else {
            if (!(interfaceC1421b instanceof O7.Z)) {
                return null;
            }
            lVar = X7.H.b.f15952D;
        }
        return p218v8.c.f(interfaceC1421b, false, lVar, 1, null);
    }

    public static final O7.InterfaceC1421b e(O7.InterfaceC1421b interfaceC1421b) {
        p247y7.AbstractC7350t.f(interfaceC1421b, "<this>");
        O7.InterfaceC1421b interfaceC1421bD = d(interfaceC1421b);
        if (interfaceC1421bD != null) {
            return interfaceC1421bD;
        }
        X7.C1828f c1828f = X7.C1828f.f16011o;
        p138n8.f name = interfaceC1421b.getName();
        p247y7.AbstractC7350t.e(name, "getName(...)");
        if (c1828f.l(name)) {
            return p218v8.c.f(interfaceC1421b, false, X7.H.c.f15953D, 1, null);
        }
        return null;
    }

    public static final boolean f(O7.InterfaceC1424e interfaceC1424e, O7.InterfaceC1420a interfaceC1420a) {
        p247y7.AbstractC7350t.f(interfaceC1424e, "<this>");
        p247y7.AbstractC7350t.f(interfaceC1420a, "specialCallableDescriptor");
        O7.InterfaceC1432m interfaceC1432mB = interfaceC1420a.b();
        p247y7.AbstractC7350t.d(interfaceC1432mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        F8.M mW = ((O7.InterfaceC1424e) interfaceC1432mB).w();
        p247y7.AbstractC7350t.e(mW, "getDefaultType(...)");
        while (true) {
            interfaceC1424e = p178r8.f.s(interfaceC1424e);
            if (interfaceC1424e == null) {
                return false;
            }
            if (!(interfaceC1424e instanceof Z7.c) && G8.s.b(interfaceC1424e.w(), mW) != null) {
                return !L7.g.g0(interfaceC1424e);
            }
        }
    }

    public static final boolean g(O7.InterfaceC1421b interfaceC1421b) {
        p247y7.AbstractC7350t.f(interfaceC1421b, "<this>");
        return p218v8.c.t(interfaceC1421b).b() instanceof Z7.c;
    }

    public static final boolean h(O7.InterfaceC1421b interfaceC1421b) {
        p247y7.AbstractC7350t.f(interfaceC1421b, "<this>");
        return g(interfaceC1421b) || L7.g.g0(interfaceC1421b);
    }
}
