package F0;

/* JADX INFO: renamed from: F0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0913d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final F0.AbstractC0913d.a f2573a = new F0.AbstractC0913d.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p237x7.l f2574b = F0.AbstractC0913d.b.f2576D;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p237x7.l f2575c = F0.AbstractC0913d.c.f2577D;

    /* JADX INFO: renamed from: F0.d$a */
    public static final class a implements E0.l {
        a() {
        }

        @Override // E0.l
        public java.lang.Object D0(E0.c cVar) {
            return cVar.a().b();
        }
    }

    /* JADX INFO: renamed from: F0.d$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final F0.AbstractC0913d.b f2576D = new F0.AbstractC0913d.b();

        b() {
            super(1);
        }

        public final void a(F0.C0911c c0911c) {
            c0911c.W1();
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((F0.C0911c) obj);
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: F0.d$c */
    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final F0.AbstractC0913d.c f2577D = new F0.AbstractC0913d.c();

        c() {
            super(1);
        }

        public final void a(F0.C0911c c0911c) {
            c0911c.Z1();
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((F0.C0911c) obj);
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(F0.C0911c c0911c) {
        androidx.compose.ui.d.c cVarO = F0.AbstractC0925k.m(c0911c).k0().o();
        p247y7.AbstractC7350t.d(cVarO, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return ((F0.C0) cVarO).T1();
    }
}
