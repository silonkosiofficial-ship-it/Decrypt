package I6;

/* JADX INFO: renamed from: I6.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1256l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final W6.C1767a f5218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final W6.C1767a f5219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final J6.b f5220c;

    /* JADX INFO: renamed from: I6.l$a */
    /* synthetic */ class a extends p247y7.C7348q implements p237x7.a {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final I6.AbstractC1256l.a f5221L = new I6.AbstractC1256l.a();

        a() {
            super(0, I6.P.class, "<init>", "<init>()V", 0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final I6.P b() {
            return new I6.P();
        }
    }

    /* JADX INFO: renamed from: I6.l$b */
    static final class b extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f5222G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f5223H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f5224I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ boolean f5225J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z6, p127m7.e eVar) {
            super(3, eVar);
            this.f5225J = z6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final io.ktor.utils.io.d K(K6.a aVar) {
            return aVar.b();
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f5222G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p007a7.e eVar = (p007a7.e) this.f5223H;
                Q6.c cVar = (Q6.c) this.f5224I;
                if (!this.f5225J && !cVar.H0().x0().e(I6.AbstractC1256l.f5218a)) {
                    final K6.a aVar = new K6.a(cVar.b());
                    D6.b bVarA = L6.b.a(cVar.H0(), new p237x7.a() { // from class: I6.m
                        @Override // p237x7.a
                        public final java.lang.Object b() {
                            return I6.AbstractC1256l.b.K(aVar);
                        }
                    });
                    bVarA.x0().f(I6.AbstractC1256l.f5219b, p087i7.M.f46721a);
                    Q6.c cVarE = bVarA.e();
                    this.f5223H = null;
                    this.f5222G = 1;
                    if (eVar.e(cVarE, this) == objG) {
                        return objG;
                    }
                }
                return p087i7.M.f46721a;
            }
            if (i6 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            return p087i7.M.f46721a;
        }

        @Override // p237x7.q
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object j(p007a7.e eVar, Q6.c cVar, p127m7.e eVar2) {
            I6.AbstractC1256l.b bVar = new I6.AbstractC1256l.b(this.f5225J, eVar2);
            bVar.f5223H = eVar;
            bVar.f5224I = cVar;
            return bVar.B(p087i7.M.f46721a);
        }
    }

    static {
        F7.o oVarP;
        F7.c cVarB = p247y7.P.b(p087i7.M.class);
        F7.o oVarP2 = null;
        try {
            oVarP = p247y7.P.p(p087i7.M.class);
        } catch (java.lang.Throwable unused) {
            oVarP = null;
        }
        f5218a = new W6.C1767a("SkipSaveBody", new p017b7.a(cVarB, oVarP));
        F7.c cVarB2 = p247y7.P.b(p087i7.M.class);
        try {
            oVarP2 = p247y7.P.p(p087i7.M.class);
        } catch (java.lang.Throwable unused2) {
        }
        f5219b = new W6.C1767a("ResponseBodySaved", new p017b7.a(cVarB2, oVarP2));
        f5220c = J6.i.b("DoubleReceivePlugin", I6.AbstractC1256l.a.f5221L, new p237x7.l() { // from class: I6.k
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return I6.AbstractC1256l.b((J6.d) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M b(J6.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "$this$createClientPlugin");
        dVar.b().y().l(Q6.b.f9086g.b(), new I6.AbstractC1256l.b(((I6.P) dVar.e()).a(), null));
        return p087i7.M.f46721a;
    }

    public static final J6.b e() {
        return f5220c;
    }

    public static final boolean f(Q6.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "<this>");
        return cVar.H0().x0().e(f5219b);
    }
}
