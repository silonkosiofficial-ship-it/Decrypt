package C6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o {
    public static final C6.c b(F6.k kVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(kVar, "engineFactory");
        p247y7.AbstractC7350t.f(lVar, "block");
        C6.j jVar = new C6.j();
        lVar.l(jVar);
        final F6.b bVarA = kVar.a(jVar.j());
        C6.c cVar = new C6.c(bVarA, jVar, true);
        m7.i.b bVarI = cVar.getCoroutineContext().i(W8.InterfaceC1822z0.f15544h);
        p247y7.AbstractC7350t.c(bVarI);
        ((W8.InterfaceC1822z0) bVarI).e1(new p237x7.l() { // from class: C6.n
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return C6.o.c(bVarA, (java.lang.Throwable) obj);
            }
        });
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M c(F6.b bVar, java.lang.Throwable th) throws java.io.IOException {
        bVar.close();
        return p087i7.M.f46721a;
    }
}
