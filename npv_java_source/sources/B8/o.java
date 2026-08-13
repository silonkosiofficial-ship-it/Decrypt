package B8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o extends R7.z {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final E8.n f912I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p138n8.c cVar, E8.n nVar, O7.G g6) {
        super(g6, cVar);
        p247y7.AbstractC7350t.f(cVar, "fqName");
        p247y7.AbstractC7350t.f(nVar, "storageManager");
        p247y7.AbstractC7350t.f(g6, "module");
        this.f912I = nVar;
    }

    public abstract B8.h O0();

    public boolean T0(p138n8.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p248y8.h hVarU = u();
        return (hVarU instanceof D8.h) && ((D8.h) hVarU).q().contains(fVar);
    }

    public abstract void U0(B8.k kVar);
}
