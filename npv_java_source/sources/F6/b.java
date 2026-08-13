package F6;

/* JADX INFO: loaded from: classes3.dex */
public interface b extends W8.N, java.io.Closeable {

    public static final class a {

        /* JADX INFO: renamed from: F6.b$a$a, reason: collision with other inner class name */
        static final class C0064a extends p147o7.d {

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            java.lang.Object f2751F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            java.lang.Object f2752G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            /* synthetic */ java.lang.Object f2753H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            int f2754I;

            C0064a(p127m7.e eVar) {
                super(eVar);
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                this.f2753H = obj;
                this.f2754I |= Integer.MIN_VALUE;
                return F6.b.a.e(null, null, this);
            }
        }

        /* JADX INFO: renamed from: F6.b$a$b, reason: collision with other inner class name */
        static final class C0065b extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f2755G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ F6.b f2756H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ O6.e f2757I;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0065b(F6.b bVar, O6.e eVar, p127m7.e eVar2) {
                super(2, eVar2);
                this.f2756H = bVar;
                this.f2757I = eVar;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f2755G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    if (F6.b.a.f(this.f2756H)) {
                        throw new F6.a(null, 1, null);
                    }
                    F6.b bVar = this.f2756H;
                    O6.e eVar = this.f2757I;
                    this.f2755G = 1;
                    obj = bVar.W0(eVar, this);
                    if (obj == objG) {
                        return objG;
                    }
                } else {
                    if (i6 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj);
                }
                return obj;
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
                return ((F6.b.a.C0065b) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return new F6.b.a.C0065b(this.f2756H, this.f2757I, eVar);
            }
        }

        static final class c extends p147o7.l implements p237x7.q {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f2758G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            private /* synthetic */ java.lang.Object f2759H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            /* synthetic */ java.lang.Object f2760I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            final /* synthetic */ C6.c f2761J;

            /* JADX INFO: renamed from: K, reason: collision with root package name */
            final /* synthetic */ F6.b f2762K;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C6.c cVar, F6.b bVar, p127m7.e eVar) {
                super(3, eVar);
                this.f2761J = cVar;
                this.f2762K = bVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final p087i7.M K(C6.c cVar, Q6.c cVar2, java.lang.Throwable th) {
                if (th != null) {
                    cVar.s().a(R6.a.c(), cVar2);
                }
                return p087i7.M.f46721a;
            }

            /* JADX WARN: Code duplicated, block: B:28:0x00af A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:29:0x00b0  */
            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                F7.o oVarP;
                p017b7.a aVar;
                O6.e eVarC;
                java.lang.Object objE;
                p007a7.e eVar;
                F7.o oVarP2;
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f2758G;
                if (i6 != 0) {
                    if (i6 == 1) {
                        eVarC = (O6.e) this.f2760I;
                        eVar = (p007a7.e) this.f2759H;
                        p087i7.x.b(obj);
                    } else {
                        if (i6 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p087i7.x.b(obj);
                    }
                    return p087i7.M.f46721a;
                }
                p087i7.x.b(obj);
                p007a7.e eVar2 = (p007a7.e) this.f2759H;
                java.lang.Object obj2 = this.f2760I;
                O6.d dVar = new O6.d();
                dVar.r((O6.d) eVar2.b());
                if (obj2 == null) {
                    dVar.k(U6.a.f14544a);
                    F7.c cVarB = p247y7.P.b(java.lang.Object.class);
                    try {
                        oVarP2 = p247y7.P.p(java.lang.Object.class);
                    } catch (java.lang.Throwable unused) {
                        oVarP2 = null;
                    }
                    aVar = new p017b7.a(cVarB, oVarP2);
                } else {
                    boolean z6 = obj2 instanceof U6.b;
                    dVar.k(obj2);
                    if (z6) {
                        dVar.l(null);
                    } else {
                        F7.c cVarB2 = p247y7.P.b(java.lang.Object.class);
                        try {
                            oVarP = p247y7.P.p(java.lang.Object.class);
                        } catch (java.lang.Throwable unused2) {
                            oVarP = null;
                        }
                        aVar = new p017b7.a(cVarB2, oVarP);
                    }
                    this.f2761J.s().a(R6.a.b(), dVar);
                    eVarC = dVar.c();
                    eVarC.a().f(F6.l.c(), this.f2761J.o());
                    F6.l.d(eVarC);
                    F6.b.a.d(this.f2762K, eVarC);
                    F6.b bVar = this.f2762K;
                    this.f2759H = eVar2;
                    this.f2760I = eVarC;
                    this.f2758G = 1;
                    objE = F6.b.a.e(bVar, eVarC, this);
                    if (objE == objG) {
                        return objG;
                    }
                    eVar = eVar2;
                    obj = objE;
                }
                dVar.l(aVar);
                this.f2761J.s().a(R6.a.b(), dVar);
                eVarC = dVar.c();
                eVarC.a().f(F6.l.c(), this.f2761J.o());
                F6.l.d(eVarC);
                F6.b.a.d(this.f2762K, eVarC);
                F6.b bVar2 = this.f2762K;
                this.f2759H = eVar2;
                this.f2760I = eVarC;
                this.f2758G = 1;
                objE = F6.b.a.e(bVar2, eVarC, this);
                if (objE == objG) {
                    return objG;
                }
                eVar = eVar2;
                obj = objE;
                D6.b bVar3 = new D6.b(this.f2761J, eVarC, (O6.h) obj);
                final Q6.c cVarE = bVar3.e();
                this.f2761J.s().a(R6.a.e(), cVarE);
                W8.InterfaceC1822z0 interfaceC1822z0M = W8.C0.m(cVarE.getCoroutineContext());
                final C6.c cVar = this.f2761J;
                interfaceC1822z0M.e1(new p237x7.l() { // from class: F6.c
                    @Override // p237x7.l
                    public final java.lang.Object l(java.lang.Object obj3) {
                        return F6.b.a.c.K(cVar, cVarE, (java.lang.Throwable) obj3);
                    }
                });
                this.f2759H = null;
                this.f2760I = null;
                this.f2758G = 2;
                if (eVar.e(bVar3, this) == objG) {
                    return objG;
                }
                return p087i7.M.f46721a;
            }

            @Override // p237x7.q
            /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object j(p007a7.e eVar, java.lang.Object obj, p127m7.e eVar2) {
                F6.b.a.c cVar = new F6.b.a.c(this.f2761J, this.f2762K, eVar2);
                cVar.f2759H = eVar;
                cVar.f2760I = obj;
                return cVar.B(p087i7.M.f46721a);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void d(F6.b bVar, O6.e eVar) {
            for (F6.h hVar : eVar.g()) {
                if (!bVar.W().contains(hVar)) {
                    throw new java.lang.IllegalArgumentException(("Engine doesn't support " + hVar).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public static java.lang.Object e(F6.b bVar, O6.e eVar, p127m7.e eVar2) {
            F6.b.a.C0064a c0064a;
            if (eVar2 instanceof F6.b.a.C0064a) {
                c0064a = (F6.b.a.C0064a) eVar2;
                int i6 = c0064a.f2754I;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    c0064a.f2754I = i6 - Integer.MIN_VALUE;
                } else {
                    c0064a = new F6.b.a.C0064a(eVar2);
                }
            } else {
                c0064a = new F6.b.a.C0064a(eVar2);
            }
            java.lang.Object objB = c0064a.f2753H;
            java.lang.Object objG = p137n7.b.g();
            int i10 = c0064a.f2754I;
            if (i10 != 0) {
                if (i10 == 1) {
                    eVar = (O6.e) c0064a.f2752G;
                    bVar = (F6.b) c0064a.f2751F;
                    p087i7.x.b(objB);
                } else {
                    if (i10 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(objB);
                }
            }
            p087i7.x.b(objB);
            W8.InterfaceC1822z0 interfaceC1822z0D = eVar.d();
            c0064a.f2751F = bVar;
            c0064a.f2752G = eVar;
            c0064a.f2754I = 1;
            objB = F6.l.b(bVar, interfaceC1822z0D, c0064a);
            if (objB == objG) {
                return objG;
            }
            F6.b bVar2 = bVar;
            p127m7.i iVar = (p127m7.i) objB;
            W8.V vB = W8.AbstractC1788i.b(bVar2, iVar.o0(new F6.m(iVar)), null, new F6.b.a.C0065b(bVar2, eVar, null), 2, null);
            c0064a.f2751F = null;
            c0064a.f2752G = null;
            c0064a.f2754I = 2;
            objB = vB.d1(c0064a);
            return objB == objG ? objG : objB;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean f(F6.b bVar) {
            W8.InterfaceC1822z0 interfaceC1822z0 = (W8.InterfaceC1822z0) bVar.getCoroutineContext().i(W8.InterfaceC1822z0.f15544h);
            return !(interfaceC1822z0 != null ? interfaceC1822z0.f() : false);
        }

        public static java.util.Set g(F6.b bVar) {
            return p097j7.Z.d();
        }

        public static void h(F6.b bVar, C6.c cVar) {
            p247y7.AbstractC7350t.f(cVar, "client");
            cVar.N().l(O6.i.f8098g.a(), new F6.b.a.c(cVar, bVar, null));
        }
    }

    void A0(C6.c cVar);

    F6.j Q();

    java.util.Set W();

    java.lang.Object W0(O6.e eVar, p127m7.e eVar2);
}
