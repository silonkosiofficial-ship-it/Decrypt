package I6;

/* JADX INFO: renamed from: I6.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1251g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final W6.C1767a f5184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final fa.d f5185b;

    /* JADX INFO: renamed from: I6.g$a */
    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f5186G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f5187H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f5188I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        /* synthetic */ java.lang.Object f5189J;

        a(p127m7.e eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:34:0x00e0 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:37:0x00e9 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:38:0x00eb  */
        /* JADX WARN: Code duplicated, block: B:41:0x00f5  */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) throws java.lang.Throwable {
            int iM0;
            Q6.c cVar;
            int i6;
            Q6.c cVar2;
            Q6.c cVar3;
            java.lang.String str;
            java.lang.Throwable o6;
            java.lang.Object objG = p137n7.b.g();
            int i10 = this.f5188I;
            if (i10 != 0) {
                if (i10 == 1) {
                    iM0 = this.f5187H;
                    cVar = (Q6.c) this.f5189J;
                    p087i7.x.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i6 = this.f5187H;
                    cVar2 = (Q6.c) this.f5186G;
                    cVar3 = (Q6.c) this.f5189J;
                    p087i7.x.b(obj);
                }
                str = (java.lang.String) obj;
                if (300 > i6 && i6 < 400) {
                    o6 = new I6.L(cVar2, str);
                } else if (400 > i6 && i6 < 500) {
                    o6 = new I6.C1249e(cVar2, str);
                } else if (500 <= i6 || i6 >= 600) {
                    o6 = new I6.O(cVar2, str);
                } else {
                    o6 = new I6.T(cVar2, str);
                }
                I6.AbstractC1251g.f5185b.g("Default response validation for " + cVar3.H0().d().r() + " failed with " + o6);
                throw o6;
            }
            p087i7.x.b(obj);
            Q6.c cVar4 = (Q6.c) this.f5189J;
            if (!((java.lang.Boolean) cVar4.H0().x0().b(I6.AbstractC1260p.j())).booleanValue()) {
                I6.AbstractC1251g.f5185b.g("Skipping default response validation for " + cVar4.H0().d().r());
                return p087i7.M.f46721a;
            }
            iM0 = cVar4.e().m0();
            D6.b bVarH0 = cVar4.H0();
            if (iM0 < 300 || bVarH0.x0().e(I6.AbstractC1251g.f5184a)) {
                return p087i7.M.f46721a;
            }
            this.f5189J = cVar4;
            this.f5187H = iM0;
            this.f5188I = 1;
            java.lang.Object objA = D6.d.a(bVarH0, this);
            if (objA == objG) {
                return objG;
            }
            cVar = cVar4;
            obj = objA;
            D6.b bVar = (D6.b) obj;
            bVar.x0().f(I6.AbstractC1251g.f5184a, p087i7.M.f46721a);
            Q6.c cVarE = bVar.e();
            this.f5189J = cVar;
            this.f5186G = cVarE;
            this.f5187H = iM0;
            this.f5188I = 2;
            java.lang.Object objB = Q6.e.b(cVarE, null, this, 1, null);
            if (objB == objG) {
                return objG;
            }
            i6 = iM0;
            cVar2 = cVarE;
            obj = objB;
            cVar3 = cVar;
            str = (java.lang.String) obj;
            if (300 > i6) {
                if (400 > i6) {
                    if (500 <= i6) {
                        o6 = new I6.O(cVar2, str);
                    } else {
                        o6 = new I6.O(cVar2, str);
                    }
                } else if (500 <= i6) {
                    o6 = new I6.O(cVar2, str);
                } else {
                    o6 = new I6.O(cVar2, str);
                }
            } else if (400 > i6) {
                if (500 <= i6) {
                    o6 = new I6.O(cVar2, str);
                } else {
                    o6 = new I6.O(cVar2, str);
                }
            } else if (500 <= i6) {
                o6 = new I6.O(cVar2, str);
            } else {
                o6 = new I6.O(cVar2, str);
            }
            I6.AbstractC1251g.f5185b.g("Default response validation for " + cVar3.H0().d().r() + " failed with " + o6);
            throw o6;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(Q6.c cVar, p127m7.e eVar) {
            return ((I6.AbstractC1251g.a) x(cVar, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            I6.AbstractC1251g.a aVar = new I6.AbstractC1251g.a(eVar);
            aVar.f5189J = obj;
            return aVar;
        }
    }

    static {
        F7.o oVarP;
        F7.c cVarB = p247y7.P.b(p087i7.M.class);
        try {
            oVarP = p247y7.P.p(p087i7.M.class);
        } catch (java.lang.Throwable unused) {
            oVarP = null;
        }
        f5184a = new W6.C1767a("ValidateMark", new p017b7.a(cVarB, oVarP));
        f5185b = Z6.a.a("io.ktor.client.plugins.DefaultResponseValidation");
    }

    public static final void d(final C6.j jVar) {
        p247y7.AbstractC7350t.f(jVar, "<this>");
        I6.AbstractC1260p.f(jVar, new p237x7.l() { // from class: I6.f
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return I6.AbstractC1251g.e(jVar, (I6.C1258n) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M e(C6.j jVar, I6.C1258n c1258n) {
        p247y7.AbstractC7350t.f(c1258n, "$this$HttpResponseValidator");
        c1258n.d(jVar.k());
        c1258n.e(new I6.AbstractC1251g.a(null));
        return p087i7.M.f46721a;
    }
}
