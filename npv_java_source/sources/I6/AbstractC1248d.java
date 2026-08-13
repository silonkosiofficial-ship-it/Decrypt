package I6;

/* JADX INFO: renamed from: I6.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1248d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final W6.C1767a f5174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final W6.C1767a f5175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final J6.b f5176c;

    /* JADX INFO: renamed from: I6.d$a */
    static final class a extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f5177G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f5178H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f5179I;

        a(p127m7.e eVar) {
            super(3, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            if (this.f5177G != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            O6.d dVar = (O6.d) this.f5178H;
            androidx.appcompat.app.D.a(dVar.d().c(I6.AbstractC1248d.f5174a));
            return null;
        }

        @Override // p237x7.q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object j(O6.d dVar, U6.b bVar, p127m7.e eVar) {
            I6.AbstractC1248d.a aVar = new I6.AbstractC1248d.a(eVar);
            aVar.f5178H = dVar;
            aVar.f5179I = bVar;
            return aVar.B(p087i7.M.f46721a);
        }
    }

    /* JADX INFO: renamed from: I6.d$b */
    static final class b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f5180G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f5181H;

        b(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            if (this.f5180G != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            androidx.appcompat.app.D.a(((Q6.c) this.f5181H).H0().d().x0().c(I6.AbstractC1248d.f5175b));
            return null;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(Q6.c cVar, p127m7.e eVar) {
            return ((I6.AbstractC1248d.b) x(cVar, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            I6.AbstractC1248d.b bVar = new I6.AbstractC1248d.b(eVar);
            bVar.f5181H = obj;
            return bVar;
        }
    }

    static {
        F7.o oVarP;
        F7.c cVarB = p247y7.P.b(E6.a.class);
        F7.o oVarP2 = null;
        try {
            oVarP = p247y7.P.p(E6.a.class);
        } catch (java.lang.Throwable unused) {
            oVarP = null;
        }
        f5174a = new W6.C1767a("UploadProgressListenerAttributeKey", new p017b7.a(cVarB, oVarP));
        F7.c cVarB2 = p247y7.P.b(E6.a.class);
        try {
            oVarP2 = p247y7.P.p(E6.a.class);
        } catch (java.lang.Throwable unused2) {
        }
        f5175b = new W6.C1767a("DownloadProgressListenerAttributeKey", new p017b7.a(cVarB2, oVarP2));
        f5176c = J6.i.c("BodyProgress", new p237x7.l() { // from class: I6.c
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return I6.AbstractC1248d.b((J6.d) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M b(J6.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "$this$createClientPlugin");
        dVar.f(I6.C1246b.f5169a, new I6.AbstractC1248d.a(null));
        dVar.f(I6.C1245a.f5164a, new I6.AbstractC1248d.b(null));
        return p087i7.M.f46721a;
    }

    public static final J6.b e() {
        return f5176c;
    }
}
