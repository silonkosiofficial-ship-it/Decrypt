package I6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final fa.d f5129a = Z6.a.a("io.ktor.client.plugins.HttpTimeout");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final J6.b f5130b = J6.i.b("HttpTimeout", I6.I.a.f5131J, new p237x7.l() { // from class: I6.H
        @Override // p237x7.l
        public final java.lang.Object l(java.lang.Object obj) {
            return I6.I.c((J6.d) obj);
        }
    });

    /* synthetic */ class a extends p247y7.AbstractC7332a implements p237x7.a {

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public static final I6.I.a f5131J = new I6.I.a();

        a() {
            super(0, I6.G.class, "<init>", "<init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", 0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final I6.G b() {
            return new I6.G(null, null, null, 7, null);
        }
    }

    static final class b extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f5132G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f5133H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f5134I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ java.lang.Long f5135J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ java.lang.Long f5136K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ java.lang.Long f5137L;

        static final class a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f5138G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ java.lang.Long f5139H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ O6.d f5140I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            final /* synthetic */ W8.InterfaceC1822z0 f5141J;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(java.lang.Long l6, O6.d dVar, W8.InterfaceC1822z0 interfaceC1822z0, p127m7.e eVar) {
                super(2, eVar);
                this.f5139H = l6;
                this.f5140I = dVar;
                this.f5141J = interfaceC1822z0;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f5138G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    long jLongValue = this.f5139H.longValue();
                    this.f5138G = 1;
                    if (W8.Y.a(jLongValue, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i6 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj);
                }
                I6.D d6 = new I6.D(this.f5140I);
                I6.I.f5129a.g("Request timeout: " + this.f5140I.j());
                W8.InterfaceC1822z0 interfaceC1822z0 = this.f5141J;
                java.lang.String message = d6.getMessage();
                p247y7.AbstractC7350t.c(message);
                W8.C0.c(interfaceC1822z0, message, d6);
                return p087i7.M.f46721a;
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
                return ((I6.I.b.a) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return new I6.I.b.a(this.f5139H, this.f5140I, this.f5141J, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(java.lang.Long l6, java.lang.Long l10, java.lang.Long l11, p127m7.e eVar) {
            super(3, eVar);
            this.f5135J = l6;
            this.f5136K = l10;
            this.f5137L = l11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p087i7.M K(W8.InterfaceC1822z0 interfaceC1822z0, java.lang.Throwable th) {
            W8.InterfaceC1822z0.a.a(interfaceC1822z0, null, 1, null);
            return p087i7.M.f46721a;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f5132G;
            if (i6 != 0) {
                if (i6 == 1) {
                    p087i7.x.b(obj);
                    return obj;
                }
                if (i6 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
                return obj;
            }
            p087i7.x.b(obj);
            J6.k.a aVar = (J6.k.a) this.f5133H;
            O6.d dVar = (O6.d) this.f5134I;
            if (T6.V.b(dVar.j().o())) {
                this.f5133H = null;
                this.f5132G = 1;
                java.lang.Object objA = aVar.a(dVar, this);
                return objA == objG ? objG : objA;
            }
            dVar.e();
            dVar.e();
            I6.F f6 = I6.F.f5123a;
            I6.G g6 = (I6.G) dVar.g(f6);
            if (g6 == null && I6.I.d(this.f5135J, this.f5136K, this.f5137L)) {
                g6 = new I6.G(null, null, null, 7, null);
                dVar.m(f6, g6);
            }
            if (g6 != null) {
                java.lang.Long l6 = this.f5136K;
                java.lang.Long l10 = this.f5137L;
                java.lang.Long l11 = this.f5135J;
                java.lang.Long lB = g6.b();
                if (lB != null) {
                    l6 = lB;
                }
                g6.e(l6);
                java.lang.Long lD = g6.d();
                if (lD != null) {
                    l10 = lD;
                }
                g6.g(l10);
                java.lang.Long lC = g6.c();
                if (lC != null) {
                    l11 = lC;
                }
                g6.f(l11);
                java.lang.Long lC2 = g6.c();
                if (lC2 != null && lC2.longValue() != Long.MAX_VALUE) {
                    final W8.InterfaceC1822z0 interfaceC1822z0D = W8.AbstractC1788i.d(aVar, null, null, new I6.I.b.a(lC2, dVar, dVar.h(), null), 3, null);
                    dVar.h().e1(new p237x7.l() { // from class: I6.J
                        @Override // p237x7.l
                        public final java.lang.Object l(java.lang.Object obj2) {
                            return I6.I.b.K(interfaceC1822z0D, (java.lang.Throwable) obj2);
                        }
                    });
                }
            }
            this.f5133H = null;
            this.f5132G = 2;
            java.lang.Object objA2 = aVar.a(dVar, this);
            return objA2 == objG ? objG : objA2;
        }

        @Override // p237x7.q
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object j(J6.k.a aVar, O6.d dVar, p127m7.e eVar) {
            I6.I.b bVar = new I6.I.b(this.f5135J, this.f5136K, this.f5137L, eVar);
            bVar.f5133H = aVar;
            bVar.f5134I = dVar;
            return bVar.B(p087i7.M.f46721a);
        }
    }

    public static final H6.a b(O6.e eVar, java.lang.Throwable th) {
        java.lang.Object objB;
        p247y7.AbstractC7350t.f(eVar, "request");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Connect timeout has expired [url=");
        sb.append(eVar.h());
        sb.append(", connect_timeout=");
        I6.G g6 = (I6.G) eVar.c(I6.F.f5123a);
        if (g6 == null || (objB = g6.b()) == null) {
            objB = "unknown";
        }
        sb.append(objB);
        sb.append(" ms]");
        return new H6.a(sb.toString(), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M c(J6.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "$this$createClientPlugin");
        dVar.f(J6.k.f5742a, new I6.I.b(((I6.G) dVar.e()).c(), ((I6.G) dVar.e()).b(), ((I6.G) dVar.e()).d(), null));
        return p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(java.lang.Long l6, java.lang.Long l10, java.lang.Long l11) {
        return (l6 == null && l10 == null && l11 == null) ? false : true;
    }

    public static final java.net.SocketTimeoutException e(O6.e eVar, java.lang.Throwable th) {
        java.lang.Object objD;
        p247y7.AbstractC7350t.f(eVar, "request");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Socket timeout has expired [url=");
        sb.append(eVar.h());
        sb.append(", socket_timeout=");
        I6.G g6 = (I6.G) eVar.c(I6.F.f5123a);
        if (g6 == null || (objD = g6.d()) == null) {
            objD = "unknown";
        }
        sb.append(objD);
        sb.append("] ms");
        return H6.b.a(sb.toString(), th);
    }

    public static final long h(long j6) {
        if (j6 == Long.MAX_VALUE) {
            return 0L;
        }
        return j6;
    }

    public static final J6.b i() {
        return f5130b;
    }
}
