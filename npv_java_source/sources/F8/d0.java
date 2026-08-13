package F8;

/* JADX INFO: loaded from: classes2.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f2876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f2877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f2878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final J8.o f2879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final F8.AbstractC0946g f2880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final F8.AbstractC0947h f2881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f2882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2883h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private java.util.ArrayDeque f2884i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private java.util.Set f2885j;

    public interface a {

        /* JADX INFO: renamed from: F8.d0$a$a, reason: collision with other inner class name */
        public static final class C0066a implements F8.d0.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f2886a;

            @Override // F8.d0.a
            public void a(p237x7.a aVar) {
                p247y7.AbstractC7350t.f(aVar, "block");
                if (this.f2886a) {
                    return;
                }
                this.f2886a = ((java.lang.Boolean) aVar.b()).booleanValue();
            }

            public final boolean b() {
                return this.f2886a;
            }
        }

        void a(p237x7.a aVar);
    }

    public enum b {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER;


        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private static final /* synthetic */ p157p7.a f2891G = p157p7.b.a(e());
    }

    public static abstract class c {

        public static abstract class a extends F8.d0.c {
            public a() {
                super(null);
            }
        }

        public static final class b extends F8.d0.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final F8.d0.c.b f2892a = new F8.d0.c.b();

            private b() {
                super(null);
            }

            @Override // F8.d0.c
            public J8.j a(F8.d0 d0Var, J8.i iVar) {
                p247y7.AbstractC7350t.f(d0Var, "state");
                p247y7.AbstractC7350t.f(iVar, "type");
                return d0Var.j().z(iVar);
            }
        }

        /* JADX INFO: renamed from: F8.d0$c$c, reason: collision with other inner class name */
        public static final class C0067c extends F8.d0.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final F8.d0.c.C0067c f2893a = new F8.d0.c.C0067c();

            private C0067c() {
                super(null);
            }

            @Override // F8.d0.c
            public /* bridge */ /* synthetic */ J8.j a(F8.d0 d0Var, J8.i iVar) {
                return (J8.j) b(d0Var, iVar);
            }

            public java.lang.Void b(F8.d0 d0Var, J8.i iVar) {
                p247y7.AbstractC7350t.f(d0Var, "state");
                p247y7.AbstractC7350t.f(iVar, "type");
                throw new java.lang.UnsupportedOperationException("Should not be called");
            }
        }

        public static final class d extends F8.d0.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final F8.d0.c.d f2894a = new F8.d0.c.d();

            private d() {
                super(null);
            }

            @Override // F8.d0.c
            public J8.j a(F8.d0 d0Var, J8.i iVar) {
                p247y7.AbstractC7350t.f(d0Var, "state");
                p247y7.AbstractC7350t.f(iVar, "type");
                return d0Var.j().G(iVar);
            }
        }

        private c() {
        }

        public /* synthetic */ c(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public abstract J8.j a(F8.d0 d0Var, J8.i iVar);
    }

    public d0(boolean z6, boolean z10, boolean z11, J8.o oVar, F8.AbstractC0946g abstractC0946g, F8.AbstractC0947h abstractC0947h) {
        p247y7.AbstractC7350t.f(oVar, "typeSystemContext");
        p247y7.AbstractC7350t.f(abstractC0946g, "kotlinTypePreparator");
        p247y7.AbstractC7350t.f(abstractC0947h, "kotlinTypeRefiner");
        this.f2876a = z6;
        this.f2877b = z10;
        this.f2878c = z11;
        this.f2879d = oVar;
        this.f2880e = abstractC0946g;
        this.f2881f = abstractC0947h;
    }

    public static /* synthetic */ java.lang.Boolean d(F8.d0 d0Var, J8.i iVar, J8.i iVar2, boolean z6, int i6, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
        }
        if ((i6 & 4) != 0) {
            z6 = false;
        }
        return d0Var.c(iVar, iVar2, z6);
    }

    public java.lang.Boolean c(J8.i iVar, J8.i iVar2, boolean z6) {
        p247y7.AbstractC7350t.f(iVar, "subType");
        p247y7.AbstractC7350t.f(iVar2, "superType");
        return null;
    }

    public final void e() {
        java.util.ArrayDeque arrayDeque = this.f2884i;
        p247y7.AbstractC7350t.c(arrayDeque);
        arrayDeque.clear();
        java.util.Set set = this.f2885j;
        p247y7.AbstractC7350t.c(set);
        set.clear();
        this.f2883h = false;
    }

    public boolean f(J8.i iVar, J8.i iVar2) {
        p247y7.AbstractC7350t.f(iVar, "subType");
        p247y7.AbstractC7350t.f(iVar2, "superType");
        return true;
    }

    public F8.d0.b g(J8.j jVar, J8.d dVar) {
        p247y7.AbstractC7350t.f(jVar, "subType");
        p247y7.AbstractC7350t.f(dVar, "superType");
        return F8.d0.b.CHECK_SUBTYPE_AND_LOWER;
    }

    public final java.util.ArrayDeque h() {
        return this.f2884i;
    }

    public final java.util.Set i() {
        return this.f2885j;
    }

    public final J8.o j() {
        return this.f2879d;
    }

    public final void k() {
        this.f2883h = true;
        if (this.f2884i == null) {
            this.f2884i = new java.util.ArrayDeque(4);
        }
        if (this.f2885j == null) {
            this.f2885j = P8.g.f8491E.a();
        }
    }

    public final boolean l(J8.i iVar) {
        p247y7.AbstractC7350t.f(iVar, "type");
        return this.f2878c && this.f2879d.D(iVar);
    }

    public final boolean m() {
        return this.f2876a;
    }

    public final boolean n() {
        return this.f2877b;
    }

    public final J8.i o(J8.i iVar) {
        p247y7.AbstractC7350t.f(iVar, "type");
        return this.f2880e.a(iVar);
    }

    public final J8.i p(J8.i iVar) {
        p247y7.AbstractC7350t.f(iVar, "type");
        return this.f2881f.a(iVar);
    }

    public boolean q(p237x7.l lVar) {
        p247y7.AbstractC7350t.f(lVar, "block");
        F8.d0.a.C0066a c0066a = new F8.d0.a.C0066a();
        lVar.l(c0066a);
        return c0066a.b();
    }
}
