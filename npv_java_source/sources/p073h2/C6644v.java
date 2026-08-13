package p073h2;

/* JADX INFO: renamed from: h2.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6644v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.CopyOnWriteArrayList f46258a = new java.util.concurrent.CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Z8.y f46259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Z8.N f46260c;

    /* JADX INFO: renamed from: h2.v$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p073h2.C6641s f46262E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p073h2.C6641s f46263F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p073h2.C6641s c6641s, p073h2.C6641s c6641s2) {
            super(1);
            this.f46262E = c6641s;
            this.f46263F = c6641s2;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p073h2.C6630g l(p073h2.C6630g c6630g) {
            return p073h2.C6644v.this.c(c6630g, this.f46262E, this.f46263F);
        }
    }

    /* JADX INFO: renamed from: h2.v$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ boolean f46264D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p073h2.EnumC6642t f46265E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p073h2.r f46266F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p073h2.C6644v f46267G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z6, p073h2.EnumC6642t enumC6642t, p073h2.r rVar, p073h2.C6644v c6644v) {
            super(1);
            this.f46264D = z6;
            this.f46265E = enumC6642t;
            this.f46266F = rVar;
            this.f46267G = c6644v;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p073h2.C6630g l(p073h2.C6630g c6630g) {
            p073h2.C6641s c6641sA;
            if (c6630g == null || (c6641sA = c6630g.e()) == null) {
                c6641sA = p073h2.C6641s.f46238f.a();
            }
            p073h2.C6641s c6641sB = c6630g != null ? c6630g.b() : null;
            if (this.f46264D) {
                c6641sB = p073h2.C6641s.f46238f.a().i(this.f46265E, this.f46266F);
            } else {
                c6641sA = c6641sA.i(this.f46265E, this.f46266F);
            }
            return this.f46267G.c(c6630g, c6641sA, c6641sB);
        }
    }

    public C6644v() {
        Z8.y yVarA = Z8.P.a(null);
        this.f46259b = yVarA;
        this.f46260c = Z8.AbstractC1871h.b(yVarA);
    }

    private final p073h2.r b(p073h2.r rVar, p073h2.r rVar2, p073h2.r rVar3, p073h2.r rVar4) {
        if (rVar4 == null) {
            return rVar3;
        }
        return (!(rVar instanceof h2.r.b) || ((rVar2 instanceof h2.r.c) && (rVar4 instanceof h2.r.c)) || (rVar4 instanceof h2.r.a)) ? rVar4 : rVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p073h2.C6630g c(p073h2.C6630g c6630g, p073h2.C6641s c6641s, p073h2.C6641s c6641s2) {
        p073h2.r rVarB;
        p073h2.r rVarB2;
        p073h2.r rVarB3;
        if (c6630g == null || (rVarB = c6630g.d()) == null) {
            rVarB = h2.r.c.f46235b.b();
        }
        p073h2.r rVarB4 = b(rVarB, c6641s.f(), c6641s.f(), c6641s2 != null ? c6641s2.f() : null);
        if (c6630g == null || (rVarB2 = c6630g.c()) == null) {
            rVarB2 = h2.r.c.f46235b.b();
        }
        p073h2.r rVarB5 = b(rVarB2, c6641s.f(), c6641s.e(), c6641s2 != null ? c6641s2.e() : null);
        if (c6630g == null || (rVarB3 = c6630g.a()) == null) {
            rVarB3 = h2.r.c.f46235b.b();
        }
        return new p073h2.C6630g(rVarB4, rVarB5, b(rVarB3, c6641s.f(), c6641s.d(), c6641s2 != null ? c6641s2.d() : null), c6641s, c6641s2);
    }

    private final void d(p237x7.l lVar) {
        java.lang.Object value;
        p073h2.C6630g c6630g;
        Z8.y yVar = this.f46259b;
        do {
            value = yVar.getValue();
            p073h2.C6630g c6630g2 = (p073h2.C6630g) value;
            c6630g = (p073h2.C6630g) lVar.l(c6630g2);
            if (p247y7.AbstractC7350t.b(c6630g2, c6630g)) {
                return;
            }
        } while (!yVar.g(value, c6630g));
        if (c6630g != null) {
            java.util.Iterator it = this.f46258a.iterator();
            while (it.hasNext()) {
                ((p237x7.l) it.next()).l(c6630g);
            }
        }
    }

    public final Z8.N e() {
        return this.f46260c;
    }

    public final void f(p073h2.C6641s c6641s, p073h2.C6641s c6641s2) {
        p247y7.AbstractC7350t.f(c6641s, "sourceLoadStates");
        d(new p073h2.C6644v.a(c6641s, c6641s2));
    }

    public final void g(p073h2.EnumC6642t enumC6642t, boolean z6, p073h2.r rVar) {
        p247y7.AbstractC7350t.f(enumC6642t, "type");
        p247y7.AbstractC7350t.f(rVar, "state");
        d(new p073h2.C6644v.b(z6, enumC6642t, rVar, this));
    }
}
