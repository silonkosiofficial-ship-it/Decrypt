package X7;

/* JADX INFO: renamed from: X7.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1831i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final X7.C1831i f16020a = new X7.C1831i();

    /* JADX INFO: renamed from: X7.i$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final X7.C1831i.a f16021D = new X7.C1831i.a();

        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean l(O7.InterfaceC1421b interfaceC1421b) {
            p247y7.AbstractC7350t.f(interfaceC1421b, "it");
            return java.lang.Boolean.valueOf(X7.C1831i.f16020a.b(interfaceC1421b));
        }
    }

    private C1831i() {
    }

    private final boolean c(O7.InterfaceC1421b interfaceC1421b) {
        if (p097j7.AbstractC6879v.Z(X7.C1829g.f16014a.c(), p218v8.c.h(interfaceC1421b)) && interfaceC1421b.n().isEmpty()) {
            return true;
        }
        if (!L7.g.g0(interfaceC1421b)) {
            return false;
        }
        java.util.Collection collectionF = interfaceC1421b.f();
        p247y7.AbstractC7350t.e(collectionF, "getOverriddenDescriptors(...)");
        java.util.Collection<O7.InterfaceC1421b> collection = collectionF;
        if (!collection.isEmpty()) {
            for (O7.InterfaceC1421b interfaceC1421b2 : collection) {
                X7.C1831i c1831i = f16020a;
                p247y7.AbstractC7350t.c(interfaceC1421b2);
                if (c1831i.b(interfaceC1421b2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final java.lang.String a(O7.InterfaceC1421b interfaceC1421b) {
        p138n8.f fVar;
        p247y7.AbstractC7350t.f(interfaceC1421b, "<this>");
        L7.g.g0(interfaceC1421b);
        O7.InterfaceC1421b interfaceC1421bF = p218v8.c.f(p218v8.c.t(interfaceC1421b), false, X7.C1831i.a.f16021D, 1, null);
        if (interfaceC1421bF == null || (fVar = (p138n8.f) X7.C1829g.f16014a.a().get(p218v8.c.l(interfaceC1421bF))) == null) {
            return null;
        }
        return fVar.g();
    }

    public final boolean b(O7.InterfaceC1421b interfaceC1421b) {
        p247y7.AbstractC7350t.f(interfaceC1421b, "callableMemberDescriptor");
        if (X7.C1829g.f16014a.d().contains(interfaceC1421b.getName())) {
            return c(interfaceC1421b);
        }
        return false;
    }
}
