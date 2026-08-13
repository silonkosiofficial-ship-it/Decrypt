package p249y9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v {
    public static final p249y9.AbstractC7358b a(p249y9.AbstractC7358b abstractC7358b, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(abstractC7358b, "from");
        p247y7.AbstractC7350t.f(lVar, "builderAction");
        p249y9.C7361e c7361e = new p249y9.C7361e(abstractC7358b);
        lVar.l(c7361e);
        return new p249y9.u(c7361e.a(), c7361e.b());
    }

    public static /* synthetic */ p249y9.AbstractC7358b b(p249y9.AbstractC7358b abstractC7358b, p237x7.l lVar, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            abstractC7358b = p249y9.AbstractC7358b.f57393d;
        }
        return a(abstractC7358b, lVar);
    }
}
