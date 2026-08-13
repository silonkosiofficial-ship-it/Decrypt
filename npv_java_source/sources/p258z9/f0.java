package p258z9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f0 {
    public static final java.lang.Object a(p249y9.AbstractC7358b abstractC7358b, p249y9.i iVar, p199t9.a aVar) {
        p229w9.h k6;
        p247y7.AbstractC7350t.f(abstractC7358b, "json");
        p247y7.AbstractC7350t.f(iVar, "element");
        p247y7.AbstractC7350t.f(aVar, "deserializer");
        if (iVar instanceof p249y9.D) {
            k6 = new p258z9.P(abstractC7358b, (p249y9.D) iVar, null, null, 12, null);
        } else if (iVar instanceof p249y9.C7359c) {
            k6 = new p258z9.S(abstractC7358b, (p249y9.C7359c) iVar);
        } else {
            if (!(iVar instanceof p249y9.w) && !p247y7.AbstractC7350t.b(iVar, p249y9.A.INSTANCE)) {
                throw new p087i7.s();
            }
            k6 = new p258z9.K(abstractC7358b, (p249y9.F) iVar, null, 4, null);
        }
        return k6.x(aVar);
    }
}
