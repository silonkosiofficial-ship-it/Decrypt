package p143o2;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends p143o2.w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p143o2.n nVar) {
        super(nVar);
        p247y7.AbstractC7350t.f(nVar, "database");
    }

    protected abstract void i(p253z2.h hVar, java.lang.Object obj);

    public final void j(java.lang.Object obj) {
        p253z2.h hVarB = b();
        try {
            i(hVarB, obj);
            hVarB.o1();
        } finally {
            h(hVarB);
        }
    }
}
