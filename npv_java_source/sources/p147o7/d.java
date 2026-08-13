package p147o7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d extends p147o7.a {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p127m7.i f52553D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private transient p127m7.e f52554E;

    public d(p127m7.e eVar) {
        this(eVar, eVar != null ? eVar.getContext() : null);
    }

    public d(p127m7.e eVar, p127m7.i iVar) {
        super(eVar);
        this.f52553D = iVar;
    }

    @Override // p147o7.a
    protected void D() {
        p127m7.e eVar = this.f52554E;
        if (eVar != null && eVar != this) {
            m7.i.b bVarI = getContext().i(p127m7.f.f51196A);
            p247y7.AbstractC7350t.c(bVarI);
            ((p127m7.f) bVarI).H(eVar);
        }
        this.f52554E = p147o7.c.f52552C;
    }

    public final p127m7.e E() {
        p127m7.e eVarQ0 = this.f52554E;
        if (eVarQ0 == null) {
            p127m7.f fVar = (p127m7.f) getContext().i(p127m7.f.f51196A);
            if (fVar == null || (eVarQ0 = fVar.q0(this)) == null) {
                eVarQ0 = this;
            }
            this.f52554E = eVarQ0;
        }
        return eVarQ0;
    }

    @Override // p127m7.e
    public p127m7.i getContext() {
        p127m7.i iVar = this.f52553D;
        p247y7.AbstractC7350t.c(iVar);
        return iVar;
    }
}
