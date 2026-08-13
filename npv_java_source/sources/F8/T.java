package F8;

/* JADX INFO: loaded from: classes2.dex */
public final class T extends F8.j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O7.f0 f2856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f2857b;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F8.E b() {
            return F8.U.b(F8.T.this.f2856a);
        }
    }

    public T(O7.f0 f0Var) {
        p247y7.AbstractC7350t.f(f0Var, "typeParameter");
        this.f2856a = f0Var;
        this.f2857b = p087i7.AbstractC6669o.a(p087i7.r.PUBLICATION, new F8.T.a());
    }

    private final F8.E d() {
        return (F8.E) this.f2857b.getValue();
    }

    @Override // F8.i0
    public F8.u0 a() {
        return F8.u0.OUT_VARIANCE;
    }

    @Override // F8.i0
    public boolean b() {
        return true;
    }

    @Override // F8.i0
    public F8.E getType() {
        return d();
    }

    @Override // F8.i0
    public F8.i0 v(G8.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
        return this;
    }
}
