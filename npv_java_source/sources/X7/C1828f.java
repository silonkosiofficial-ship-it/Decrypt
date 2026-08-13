package X7;

/* JADX INFO: renamed from: X7.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1828f extends X7.I {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final X7.C1828f f16011o = new X7.C1828f();

    /* JADX INFO: renamed from: X7.f$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final X7.C1828f.a f16012D = new X7.C1828f.a();

        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(O7.InterfaceC1421b interfaceC1421b) {
            p247y7.AbstractC7350t.f(interfaceC1421b, "it");
            return java.lang.Boolean.valueOf(X7.C1828f.f16011o.j(interfaceC1421b));
        }
    }

    /* JADX INFO: renamed from: X7.f$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final X7.C1828f.b f16013D = new X7.C1828f.b();

        b() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(O7.InterfaceC1421b interfaceC1421b) {
            p247y7.AbstractC7350t.f(interfaceC1421b, "it");
            return java.lang.Boolean.valueOf((interfaceC1421b instanceof O7.InterfaceC1443y) && X7.C1828f.f16011o.j(interfaceC1421b));
        }
    }

    private C1828f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j(O7.InterfaceC1421b interfaceC1421b) {
        return p097j7.AbstractC6879v.Z(X7.I.f15954a.e(), p068g8.y.d(interfaceC1421b));
    }

    public static final O7.InterfaceC1443y k(O7.InterfaceC1443y interfaceC1443y) {
        p247y7.AbstractC7350t.f(interfaceC1443y, "functionDescriptor");
        X7.C1828f c1828f = f16011o;
        p138n8.f name = interfaceC1443y.getName();
        p247y7.AbstractC7350t.e(name, "getName(...)");
        if (c1828f.l(name)) {
            return (O7.InterfaceC1443y) p218v8.c.f(interfaceC1443y, false, X7.C1828f.a.f16012D, 1, null);
        }
        return null;
    }

    public static final X7.I.b m(O7.InterfaceC1421b interfaceC1421b) {
        O7.InterfaceC1421b interfaceC1421bF;
        java.lang.String strD;
        p247y7.AbstractC7350t.f(interfaceC1421b, "<this>");
        X7.I.a aVar = X7.I.f15954a;
        if (!aVar.d().contains(interfaceC1421b.getName()) || (interfaceC1421bF = p218v8.c.f(interfaceC1421b, false, X7.C1828f.b.f16013D, 1, null)) == null || (strD = p068g8.y.d(interfaceC1421bF)) == null) {
            return null;
        }
        return aVar.l(strD);
    }

    public final boolean l(p138n8.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "<this>");
        return X7.I.f15954a.d().contains(fVar);
    }
}
