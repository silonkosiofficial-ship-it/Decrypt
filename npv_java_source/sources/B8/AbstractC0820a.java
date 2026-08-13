package B8;

/* JADX INFO: renamed from: B8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0820a implements O7.O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E8.n f849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B8.v f850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O7.G f851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected B8.k f852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final E8.h f853e;

    /* JADX INFO: renamed from: B8.a$a, reason: collision with other inner class name */
    static final class C0014a extends p247y7.AbstractC7352v implements p237x7.l {
        C0014a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O7.K l(p138n8.c cVar) {
            p247y7.AbstractC7350t.f(cVar, "fqName");
            B8.o oVarD = B8.AbstractC0820a.this.d(cVar);
            if (oVarD == null) {
                return null;
            }
            oVarD.U0(B8.AbstractC0820a.this.e());
            return oVarD;
        }
    }

    public AbstractC0820a(E8.n nVar, B8.v vVar, O7.G g6) {
        p247y7.AbstractC7350t.f(nVar, "storageManager");
        p247y7.AbstractC7350t.f(vVar, "finder");
        p247y7.AbstractC7350t.f(g6, "moduleDescriptor");
        this.f849a = nVar;
        this.f850b = vVar;
        this.f851c = g6;
        this.f853e = nVar.h(new B8.AbstractC0820a.C0014a());
    }

    @Override // O7.O
    public boolean a(p138n8.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "fqName");
        return (this.f853e.q(cVar) ? (O7.K) this.f853e.l(cVar) : d(cVar)) == null;
    }

    @Override // O7.L
    public java.util.List b(p138n8.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "fqName");
        return p097j7.AbstractC6879v.q(this.f853e.l(cVar));
    }

    @Override // O7.O
    public void c(p138n8.c cVar, java.util.Collection collection) {
        p247y7.AbstractC7350t.f(cVar, "fqName");
        p247y7.AbstractC7350t.f(collection, "packageFragments");
        P8.a.a(collection, this.f853e.l(cVar));
    }

    protected abstract B8.o d(p138n8.c cVar);

    protected final B8.k e() {
        B8.k kVar = this.f852d;
        if (kVar != null) {
            return kVar;
        }
        p247y7.AbstractC7350t.p("components");
        return null;
    }

    protected final B8.v f() {
        return this.f850b;
    }

    protected final O7.G g() {
        return this.f851c;
    }

    protected final E8.n h() {
        return this.f849a;
    }

    protected final void i(B8.k kVar) {
        p247y7.AbstractC7350t.f(kVar, "<set-?>");
        this.f852d = kVar;
    }

    @Override // O7.L
    public java.util.Collection x(p138n8.c cVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(cVar, "fqName");
        p247y7.AbstractC7350t.f(lVar, "nameFilter");
        return p097j7.Z.d();
    }
}
