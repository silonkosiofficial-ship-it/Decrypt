package p258z9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(p219v9.f fVar) {
        return (fVar.j() instanceof p219v9.d) || fVar.j() == v9.m.b.f56057a;
    }

    public static final p249y9.i d(p249y9.AbstractC7358b abstractC7358b, java.lang.Object obj, p199t9.e eVar) {
        p247y7.AbstractC7350t.f(abstractC7358b, "json");
        p247y7.AbstractC7350t.f(eVar, "serializer");
        final p247y7.O o6 = new p247y7.O();
        new p258z9.Q(abstractC7358b, new p237x7.l() { // from class: z9.g0
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj2) {
                return p258z9.h0.e(o6, (p249y9.i) obj2);
            }
        }).t(eVar, obj);
        java.lang.Object obj2 = o6.f57254C;
        if (obj2 != null) {
            return (p249y9.i) obj2;
        }
        p247y7.AbstractC7350t.p("result");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M e(p247y7.O o6, p249y9.i iVar) {
        p247y7.AbstractC7350t.f(iVar, "it");
        o6.f57254C = iVar;
        return p087i7.M.f46721a;
    }
}
