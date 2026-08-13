package X7;

/* JADX INFO: renamed from: X7.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1826d extends X7.AbstractC1823a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1826d(X7.x xVar) {
        super(xVar);
        p247y7.AbstractC7350t.f(xVar, "javaTypeEnhancementState");
    }

    private final java.util.List y(p198t8.g gVar) {
        if (!(gVar instanceof p198t8.b)) {
            return gVar instanceof p198t8.j ? p097j7.AbstractC6879v.e(((p198t8.j) gVar).c().m()) : p097j7.AbstractC6879v.m();
        }
        java.lang.Iterable iterable = (java.lang.Iterable) ((p198t8.b) gVar).b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            p097j7.AbstractC6879v.C(arrayList, y((p198t8.g) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // X7.AbstractC1823a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public java.lang.Iterable b(P7.c cVar, boolean z6) {
        p247y7.AbstractC7350t.f(cVar, "<this>");
        java.util.Map mapA = cVar.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : mapA.entrySet()) {
            p097j7.AbstractC6879v.C(arrayList, (!z6 || p247y7.AbstractC7350t.b((p138n8.f) entry.getKey(), X7.B.f15898c)) ? y((p198t8.g) entry.getValue()) : p097j7.AbstractC6879v.m());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // X7.AbstractC1823a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public p138n8.c i(P7.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "<this>");
        return cVar.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // X7.AbstractC1823a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public java.lang.Object j(P7.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "<this>");
        O7.InterfaceC1424e interfaceC1424eI = p218v8.c.i(cVar);
        p247y7.AbstractC7350t.c(interfaceC1424eI);
        return interfaceC1424eI;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // X7.AbstractC1823a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public java.lang.Iterable k(P7.c cVar) {
        P7.g gVarK;
        p247y7.AbstractC7350t.f(cVar, "<this>");
        O7.InterfaceC1424e interfaceC1424eI = p218v8.c.i(cVar);
        return (interfaceC1424eI == null || (gVarK = interfaceC1424eI.k()) == null) ? p097j7.AbstractC6879v.m() : gVarK;
    }
}
