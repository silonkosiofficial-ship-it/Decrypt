package Y7;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Y7.c f16468a = new Y7.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p138n8.f f16469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p138n8.f f16470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p138n8.f f16471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.util.Map f16472e;

    static {
        p138n8.f fVarO = p138n8.f.o("message");
        p247y7.AbstractC7350t.e(fVarO, "identifier(...)");
        f16469b = fVarO;
        p138n8.f fVarO2 = p138n8.f.o("allowedTargets");
        p247y7.AbstractC7350t.e(fVarO2, "identifier(...)");
        f16470c = fVarO2;
        p138n8.f fVarO3 = p138n8.f.o("value");
        p247y7.AbstractC7350t.e(fVarO3, "identifier(...)");
        f16471d = fVarO3;
        f16472e = p097j7.S.k(p087i7.B.a(L7.j.a.f6341H, X7.B.f15899d), p087i7.B.a(L7.j.a.f6349L, X7.B.f15901f), p087i7.B.a(L7.j.a.f6354P, X7.B.f15904i));
    }

    private c() {
    }

    public static /* synthetic */ P7.c f(Y7.c cVar, p048e8.InterfaceC6535a interfaceC6535a, p008a8.g gVar, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 4) != 0) {
            z6 = false;
        }
        return cVar.e(interfaceC6535a, gVar, z6);
    }

    public final P7.c a(p138n8.c cVar, p048e8.InterfaceC6538d interfaceC6538d, p008a8.g gVar) {
        p048e8.InterfaceC6535a interfaceC6535aJ;
        p247y7.AbstractC7350t.f(cVar, "kotlinName");
        p247y7.AbstractC7350t.f(interfaceC6538d, "annotationOwner");
        p247y7.AbstractC7350t.f(gVar, "c");
        if (p247y7.AbstractC7350t.b(cVar, L7.j.a.f6413y)) {
            p138n8.c cVar2 = X7.B.f15903h;
            p247y7.AbstractC7350t.e(cVar2, "DEPRECATED_ANNOTATION");
            p048e8.InterfaceC6535a interfaceC6535aJ2 = interfaceC6538d.j(cVar2);
            if (interfaceC6535aJ2 != null || interfaceC6538d.o()) {
                return new Y7.e(interfaceC6535aJ2, gVar);
            }
        }
        p138n8.c cVar3 = (p138n8.c) f16472e.get(cVar);
        if (cVar3 == null || (interfaceC6535aJ = interfaceC6538d.j(cVar3)) == null) {
            return null;
        }
        return f(f16468a, interfaceC6535aJ, gVar, false, 4, null);
    }

    public final p138n8.f b() {
        return f16469b;
    }

    public final p138n8.f c() {
        return f16471d;
    }

    public final p138n8.f d() {
        return f16470c;
    }

    public final P7.c e(p048e8.InterfaceC6535a interfaceC6535a, p008a8.g gVar, boolean z6) {
        p247y7.AbstractC7350t.f(interfaceC6535a, "annotation");
        p247y7.AbstractC7350t.f(gVar, "c");
        p138n8.b bVarC = interfaceC6535a.c();
        if (p247y7.AbstractC7350t.b(bVarC, p138n8.b.m(X7.B.f15899d))) {
            return new Y7.i(interfaceC6535a, gVar);
        }
        if (p247y7.AbstractC7350t.b(bVarC, p138n8.b.m(X7.B.f15901f))) {
            return new Y7.h(interfaceC6535a, gVar);
        }
        if (p247y7.AbstractC7350t.b(bVarC, p138n8.b.m(X7.B.f15904i))) {
            return new Y7.b(gVar, interfaceC6535a, L7.j.a.f6354P);
        }
        if (p247y7.AbstractC7350t.b(bVarC, p138n8.b.m(X7.B.f15903h))) {
            return null;
        }
        return new p018b8.e(gVar, interfaceC6535a, z6);
    }
}
