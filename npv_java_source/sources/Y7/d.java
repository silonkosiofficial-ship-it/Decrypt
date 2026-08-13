package Y7;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Y7.d f16473a = new Y7.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.Map f16474b = p097j7.S.k(p087i7.B.a("PACKAGE", java.util.EnumSet.noneOf(P7.n.class)), p087i7.B.a("TYPE", java.util.EnumSet.of(P7.n.f8437V, P7.n.f8450i0)), p087i7.B.a("ANNOTATION_TYPE", java.util.EnumSet.of(P7.n.f8438W)), p087i7.B.a("TYPE_PARAMETER", java.util.EnumSet.of(P7.n.f8439X)), p087i7.B.a("FIELD", java.util.EnumSet.of(P7.n.f8441Z)), p087i7.B.a("LOCAL_VARIABLE", java.util.EnumSet.of(P7.n.f8442a0)), p087i7.B.a("PARAMETER", java.util.EnumSet.of(P7.n.f8443b0)), p087i7.B.a("CONSTRUCTOR", java.util.EnumSet.of(P7.n.f8444c0)), p087i7.B.a("METHOD", java.util.EnumSet.of(P7.n.f8445d0, P7.n.f8446e0, P7.n.f8447f0)), p087i7.B.a("TYPE_USE", java.util.EnumSet.of(P7.n.f8448g0)));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.Map f16475c = p097j7.S.k(p087i7.B.a("RUNTIME", P7.m.RUNTIME), p087i7.B.a("CLASS", P7.m.BINARY), p087i7.B.a("SOURCE", P7.m.SOURCE));

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final Y7.d.a f16476D = new Y7.d.a();

        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F8.E l(O7.G g6) {
            p247y7.AbstractC7350t.f(g6, "module");
            O7.j0 j0VarB = Y7.a.b(Y7.c.f16468a.d(), g6.t().o(L7.j.a.f6341H));
            F8.E type = j0VarB != null ? j0VarB.getType() : null;
            return type == null ? H8.k.d(H8.j.f4499f1, new java.lang.String[0]) : type;
        }
    }

    private d() {
    }

    public final p198t8.g a(p048e8.InterfaceC6536b interfaceC6536b) {
        p048e8.m mVar = interfaceC6536b instanceof p048e8.m ? (p048e8.m) interfaceC6536b : null;
        if (mVar == null) {
            return null;
        }
        java.util.Map map = f16475c;
        p138n8.f fVarD = mVar.d();
        P7.m mVar2 = (P7.m) map.get(fVarD != null ? fVarD.g() : null);
        if (mVar2 == null) {
            return null;
        }
        p138n8.b bVarM = p138n8.b.m(L7.j.a.f6347K);
        p247y7.AbstractC7350t.e(bVarM, "topLevel(...)");
        p138n8.f fVarO = p138n8.f.o(mVar2.name());
        p247y7.AbstractC7350t.e(fVarO, "identifier(...)");
        return new p198t8.j(bVarM, fVarO);
    }

    public final java.util.Set b(java.lang.String str) {
        java.util.EnumSet enumSet = (java.util.EnumSet) f16474b.get(str);
        return enumSet != null ? enumSet : p097j7.Z.d();
    }

    public final p198t8.g c(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "arguments");
        java.util.ArrayList<p048e8.m> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (obj instanceof p048e8.m) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList<P7.n> arrayList2 = new java.util.ArrayList();
        for (p048e8.m mVar : arrayList) {
            Y7.d dVar = f16473a;
            p138n8.f fVarD = mVar.d();
            p097j7.AbstractC6879v.C(arrayList2, dVar.b(fVarD != null ? fVarD.g() : null));
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(p097j7.AbstractC6879v.x(arrayList2, 10));
        for (P7.n nVar : arrayList2) {
            p138n8.b bVarM = p138n8.b.m(L7.j.a.f6345J);
            p247y7.AbstractC7350t.e(bVarM, "topLevel(...)");
            p138n8.f fVarO = p138n8.f.o(nVar.name());
            p247y7.AbstractC7350t.e(fVarO, "identifier(...)");
            arrayList3.add(new p198t8.j(bVarM, fVarO));
        }
        return new p198t8.b(arrayList3, Y7.d.a.f16476D);
    }
}
