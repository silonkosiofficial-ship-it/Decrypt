package R;

/* JADX INFO: loaded from: classes.dex */
public abstract class o implements p210v.H {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final boolean f9233C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final R.u f9234D;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ V.G1 f9235D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(V.G1 g6) {
            super(0);
            this.f9235D = g6;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R.g b() {
            return (R.g) this.f9235D.getValue();
        }
    }

    public o(boolean z6, V.G1 g6) {
        this.f9233C = z6;
        this.f9234D = new R.u(z6, new R.o.a(g6));
    }

    public abstract void e(z.n.b bVar, W8.N n6);

    public final void f(p161q0.g gVar, float f6, long j6) {
        this.f9234D.b(gVar, java.lang.Float.isNaN(f6) ? R.i.a(gVar, this.f9233C, gVar.i()) : gVar.B0(f6), j6);
    }

    public abstract void g(z.n.b bVar);

    public final void h(p250z.i iVar, W8.N n6) {
        this.f9234D.c(iVar, n6);
    }
}
