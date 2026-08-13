package R5;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final com.google.firebase.remoteconfig.a a(L5.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "<this>");
        com.google.firebase.remoteconfig.a aVarK = com.google.firebase.remoteconfig.a.k();
        p247y7.AbstractC7350t.e(aVarK, "getInstance()");
        return aVarK;
    }

    public static final N5.n b(p237x7.l lVar) {
        p247y7.AbstractC7350t.f(lVar, "init");
        N5.n.b bVar = new N5.n.b();
        lVar.l(bVar);
        N5.n nVarC = bVar.c();
        p247y7.AbstractC7350t.e(nVarC, "builder.build()");
        return nVarC;
    }
}
