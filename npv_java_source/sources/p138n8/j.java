package p138n8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p138n8.c f52067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p138n8.c f52068b;

    static {
        p138n8.c cVar = new p138n8.c("java.lang");
        f52067a = cVar;
        p138n8.c cVarC = cVar.c(p138n8.f.o("annotation"));
        p247y7.AbstractC7350t.e(cVarC, "child(...)");
        f52068b = cVarC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p138n8.b k(java.lang.String str) {
        return new p138n8.b(p138n8.i.f52015a.b(), p138n8.f.o(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p138n8.b l(java.lang.String str) {
        return new p138n8.b(p138n8.i.f52015a.f(), p138n8.f.o(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p138n8.b m(java.lang.String str) {
        return new p138n8.b(p138n8.i.f52015a.c(), p138n8.f.o(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p138n8.b n(java.lang.String str) {
        return new p138n8.b(p138n8.i.f52015a.d(), p138n8.f.o(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p138n8.b o(java.lang.String str) {
        return new p138n8.b(p138n8.i.f52015a.e(), p138n8.f.o(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Map p(java.util.Map map) {
        java.util.Set<java.util.Map.Entry> setEntrySet = map.entrySet();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(E7.j.d(p097j7.S.d(p097j7.AbstractC6879v.x(setEntrySet, 10)), 16));
        for (java.util.Map.Entry entry : setEntrySet) {
            p087i7.u uVarA = p087i7.B.a(entry.getValue(), entry.getKey());
            linkedHashMap.put(uVarA.c(), uVarA.d());
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p138n8.b q(p138n8.f fVar) {
        p138n8.i iVar = p138n8.i.f52015a;
        return new p138n8.b(iVar.a().h(), p138n8.f.o(fVar.m() + iVar.a().j().m()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p138n8.b r(java.lang.String str) {
        return new p138n8.b(p138n8.i.f52015a.g(), p138n8.f.o(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p138n8.b s(java.lang.String str) {
        return new p138n8.b(p138n8.i.f52015a.h(), p138n8.f.o(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p138n8.b t(p138n8.b bVar) {
        return new p138n8.b(p138n8.i.f52015a.f(), p138n8.f.o('U' + bVar.j().m()));
    }
}
