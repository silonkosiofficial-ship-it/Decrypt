package I6;

/* JADX INFO: renamed from: I6.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1252h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final fa.d f5190a = Z6.a.a("io.ktor.client.plugins.defaultTransformers");

    /* JADX INFO: renamed from: I6.h$a */
    static final class a extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f5191G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f5192H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f5193I;

        /* JADX INFO: renamed from: I6.h$a$a, reason: collision with other inner class name */
        public static final class C0121a extends U6.b.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final T6.C1660h f5194a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final long f5195b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ java.lang.Object f5196c;

            C0121a(T6.C1660h c1660h, java.lang.Object obj) {
                this.f5196c = obj;
                this.f5194a = c1660h == null ? T6.C1660h.a.f13133a.a() : c1660h;
                this.f5195b = ((byte[]) obj).length;
            }

            @Override // U6.b
            public java.lang.Long a() {
                return java.lang.Long.valueOf(this.f5195b);
            }

            @Override // U6.b
            public T6.C1660h b() {
                return this.f5194a;
            }

            @Override // U6.b.a
            public byte[] d() {
                return (byte[]) this.f5196c;
            }
        }

        /* JADX INFO: renamed from: I6.h$a$b */
        public static final class b extends U6.b.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final java.lang.Long f5197a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final T6.C1660h f5198b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ java.lang.Object f5199c;

            b(p007a7.e eVar, T6.C1660h c1660h, java.lang.Object obj) {
                this.f5199c = obj;
                java.lang.String strK = ((O6.d) eVar.b()).a().k(T6.C1673v.f13241a.g());
                this.f5197a = strK != null ? java.lang.Long.valueOf(java.lang.Long.parseLong(strK)) : null;
                this.f5198b = c1660h == null ? T6.C1660h.a.f13133a.a() : c1660h;
            }

            @Override // U6.b
            public java.lang.Long a() {
                return this.f5197a;
            }

            @Override // U6.b
            public T6.C1660h b() {
                return this.f5198b;
            }

            @Override // U6.b.c
            public io.ktor.utils.io.d d() {
                return (io.ktor.utils.io.d) this.f5199c;
            }
        }

        a(p127m7.e eVar) {
            super(3, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            U6.b bVarA;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f5191G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p007a7.e eVar = (p007a7.e) this.f5192H;
                java.lang.Object obj2 = this.f5193I;
                T6.C1669q c1669qA = ((O6.d) eVar.b()).a();
                T6.C1673v c1673v = T6.C1673v.f13241a;
                if (c1669qA.k(c1673v.c()) == null) {
                    ((O6.d) eVar.b()).a().e(c1673v.c(), "*/*");
                }
                T6.C1660h c1660hD = T6.AbstractC1677z.d((T6.InterfaceC1676y) eVar.b());
                if (obj2 instanceof java.lang.String) {
                    java.lang.String str = (java.lang.String) obj2;
                    if (c1660hD == null) {
                        c1660hD = T6.C1660h.d.f13165a.b();
                    }
                    bVarA = new U6.f(str, c1660hD, null, 4, null);
                } else if (obj2 instanceof byte[]) {
                    bVarA = new I6.AbstractC1252h.a.C0121a(c1660hD, obj2);
                } else if (obj2 instanceof io.ktor.utils.io.d) {
                    bVarA = new I6.AbstractC1252h.a.b(eVar, c1660hD, obj2);
                } else {
                    bVarA = obj2 instanceof U6.b ? (U6.b) obj2 : I6.AbstractC1254j.a(c1660hD, (O6.d) eVar.b(), obj2);
                }
                if ((bVarA != null ? bVarA.b() : null) != null) {
                    ((O6.d) eVar.b()).a().m(c1673v.h());
                    I6.AbstractC1252h.f5190a.g("Transformed with default transformers request body for " + ((O6.d) eVar.b()).j() + " from " + p247y7.P.b(obj2.getClass()));
                    this.f5192H = null;
                    this.f5191G = 1;
                    if (eVar.e(bVarA, this) == objG) {
                        return objG;
                    }
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object j(p007a7.e eVar, java.lang.Object obj, p127m7.e eVar2) {
            I6.AbstractC1252h.a aVar = new I6.AbstractC1252h.a(eVar2);
            aVar.f5192H = eVar;
            aVar.f5193I = obj;
            return aVar.B(p087i7.M.f46721a);
        }
    }

    /* JADX INFO: renamed from: I6.h$b */
    static final class b extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f5200G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f5201H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f5202I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f5203J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        /* synthetic */ java.lang.Object f5204K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ C6.c f5205L;

        /* JADX INFO: renamed from: I6.h$b$a */
        static final class a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f5206G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            private /* synthetic */ java.lang.Object f5207H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ java.lang.Object f5208I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            final /* synthetic */ Q6.c f5209J;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(java.lang.Object obj, Q6.c cVar, p127m7.e eVar) {
                super(2, eVar);
                this.f5208I = obj;
                this.f5209J = cVar;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f5206G;
                try {
                    if (i6 == 0) {
                        p087i7.x.b(obj);
                        io.ktor.utils.io.t tVar = (io.ktor.utils.io.t) this.f5207H;
                        io.ktor.utils.io.d dVar = (io.ktor.utils.io.d) this.f5208I;
                        io.ktor.utils.io.g gVarA = tVar.a();
                        this.f5206G = 1;
                        obj = io.ktor.utils.io.f.a(dVar, gVarA, Long.MAX_VALUE, this);
                        if (obj == objG) {
                            return objG;
                        }
                    } else {
                        if (i6 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p087i7.x.b(obj);
                    }
                    ((java.lang.Number) obj).longValue();
                    return p087i7.M.f46721a;
                } catch (java.util.concurrent.CancellationException e6) {
                    W8.O.d(this.f5209J, e6);
                    throw e6;
                } catch (java.lang.Throwable th) {
                    W8.O.c(this.f5209J, "Receive failed", th);
                    throw th;
                }
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(io.ktor.utils.io.t tVar, p127m7.e eVar) {
                return ((I6.AbstractC1252h.b.a) x(tVar, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                I6.AbstractC1252h.b.a aVar = new I6.AbstractC1252h.b.a(this.f5208I, this.f5209J, eVar);
                aVar.f5207H = obj;
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C6.c cVar, p127m7.e eVar) {
            super(3, eVar);
            this.f5205L = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p087i7.M K(W8.InterfaceC1819y interfaceC1819y) {
            interfaceC1819y.K0();
            return p087i7.M.f46721a;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00f3 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:44:0x0157  */
        /* JADX WARN: Code duplicated, block: B:47:0x016e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:48:0x016f  */
        /* JADX WARN: Code duplicated, block: B:65:0x0219 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:67:0x021c  */
        /* JADX WARN: Instruction removed from duplicated block: B:67:0x021c, please report this as an issue */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p007a7.e eVar;
            p017b7.a aVarA;
            p007a7.e eVar2;
            p007a7.e eVar3;
            p017b7.a aVar;
            p017b7.a aVar2;
            p007a7.e eVar4;
            p017b7.a aVar3;
            p007a7.e eVar5;
            p017b7.a aVar4;
            p017b7.a aVar5;
            byte[] bArr;
            java.lang.Long lB;
            java.lang.Object objG = p137n7.b.g();
            Q6.d dVar = null;
            switch (this.f5202I) {
                case 0:
                    p087i7.x.b(obj);
                    eVar = (p007a7.e) this.f5203J;
                    Q6.d dVar2 = (Q6.d) this.f5204K;
                    aVarA = dVar2.a();
                    java.lang.Object objB = dVar2.b();
                    if (!(objB instanceof io.ktor.utils.io.d)) {
                        return p087i7.M.f46721a;
                    }
                    Q6.c cVarE = ((D6.b) eVar.b()).e();
                    F7.c cVarA = aVarA.a();
                    if (!p247y7.AbstractC7350t.b(cVarA, p247y7.P.b(p087i7.M.class))) {
                        if (p247y7.AbstractC7350t.b(cVarA, p247y7.P.b(java.lang.Integer.TYPE))) {
                            this.f5203J = eVar;
                            this.f5204K = aVarA;
                            this.f5200G = eVar;
                            this.f5201H = aVarA;
                            this.f5202I = 2;
                            obj = io.ktor.utils.io.f.f((io.ktor.utils.io.d) objB, this);
                            if (obj == objG) {
                                return objG;
                            }
                            eVar5 = eVar;
                            eVar3 = eVar5;
                            aVar4 = aVarA;
                            aVar2 = aVar4;
                            Q6.d dVar3 = new Q6.d(aVar4, p147o7.b.c(java.lang.Integer.parseInt(io.ktor.utils.io.q.a((p149o9.q) obj))));
                            this.f5203J = eVar3;
                            this.f5204K = aVar2;
                            this.f5200G = null;
                            this.f5201H = null;
                            this.f5202I = 3;
                            obj = eVar5.e(dVar3, this);
                            if (obj == objG) {
                                return objG;
                            }
                            aVar5 = aVar2;
                            eVar = eVar3;
                            dVar = (Q6.d) obj;
                            aVarA = aVar5;
                        } else if (p247y7.AbstractC7350t.b(cVarA, p247y7.P.b(p149o9.q.class)) || p247y7.AbstractC7350t.b(cVarA, p247y7.P.b(p149o9.q.class))) {
                            this.f5203J = eVar;
                            this.f5204K = aVarA;
                            this.f5200G = eVar;
                            this.f5201H = aVarA;
                            this.f5202I = 4;
                            obj = io.ktor.utils.io.f.f((io.ktor.utils.io.d) objB, this);
                            if (obj == objG) {
                                return objG;
                            }
                            eVar2 = eVar;
                            eVar3 = eVar2;
                            aVar = aVarA;
                            aVar2 = aVar;
                            Q6.d dVar4 = new Q6.d(aVar, obj);
                            this.f5203J = eVar3;
                            this.f5204K = aVar2;
                            this.f5200G = null;
                            this.f5201H = null;
                            this.f5202I = 5;
                            obj = eVar2.e(dVar4, this);
                            if (obj == objG) {
                                return objG;
                            }
                            aVar5 = aVar2;
                            eVar = eVar3;
                            dVar = (Q6.d) obj;
                            aVarA = aVar5;
                        } else if (p247y7.AbstractC7350t.b(cVarA, p247y7.P.b(byte[].class))) {
                            this.f5203J = eVar;
                            this.f5204K = aVarA;
                            this.f5202I = 6;
                            obj = io.ktor.utils.io.f.j((io.ktor.utils.io.d) objB, this);
                            if (obj == objG) {
                                return objG;
                            }
                            eVar4 = eVar;
                            aVar3 = aVarA;
                            bArr = (byte[]) obj;
                            lB = T6.AbstractC1677z.b(((D6.b) eVar4.b()).e());
                            if (!p247y7.AbstractC7350t.b(((D6.b) eVar4.b()).d().u0(), T6.A.f12975b.b())) {
                                I6.AbstractC1252h.c(lB, bArr.length);
                            }
                            Q6.d dVar5 = new Q6.d(aVar3, bArr);
                            this.f5203J = eVar4;
                            this.f5204K = aVar3;
                            this.f5202I = 7;
                            obj = eVar4.e(dVar5, this);
                            if (obj == objG) {
                                return objG;
                            }
                            aVar5 = aVar3;
                            eVar = eVar4;
                            dVar = (Q6.d) obj;
                            aVarA = aVar5;
                        } else if (p247y7.AbstractC7350t.b(cVarA, p247y7.P.b(io.ktor.utils.io.d.class))) {
                            final W8.InterfaceC1819y interfaceC1819yA = W8.C0.a((W8.InterfaceC1822z0) cVarE.getCoroutineContext().i(W8.InterfaceC1822z0.f15544h));
                            io.ktor.utils.io.s sVarM = io.ktor.utils.io.k.m(eVar, this.f5205L.getCoroutineContext(), false, new I6.AbstractC1252h.b.a(objB, cVarE, null), 2, null);
                            io.ktor.utils.io.k.e(sVarM, new p237x7.a() { // from class: I6.i
                                @Override // p237x7.a
                                public final java.lang.Object b() {
                                    return I6.AbstractC1252h.b.K(interfaceC1819yA);
                                }
                            });
                            Q6.d dVar6 = new Q6.d(aVarA, sVarM.b());
                            this.f5203J = eVar;
                            this.f5204K = aVarA;
                            this.f5202I = 8;
                            obj = eVar.e(dVar6, this);
                            if (obj == objG) {
                                return objG;
                            }
                        } else if (p247y7.AbstractC7350t.b(cVarA, p247y7.P.b(T6.C.class))) {
                            io.ktor.utils.io.e.a((io.ktor.utils.io.d) objB);
                            Q6.d dVar7 = new Q6.d(aVarA, cVarE.e());
                            this.f5203J = eVar;
                            this.f5204K = aVarA;
                            this.f5202I = 9;
                            obj = eVar.e(dVar7, this);
                            if (obj == objG) {
                                return objG;
                            }
                        }
                        if (dVar != null) {
                            I6.AbstractC1252h.f5190a.g("Transformed with default transformers response body for " + ((D6.b) eVar.b()).d().r() + " to " + aVarA.a());
                        }
                        return p087i7.M.f46721a;
                    }
                    io.ktor.utils.io.e.a((io.ktor.utils.io.d) objB);
                    Q6.d dVar8 = new Q6.d(aVarA, p087i7.M.f46721a);
                    this.f5203J = eVar;
                    this.f5204K = aVarA;
                    this.f5202I = 1;
                    obj = eVar.e(dVar8, this);
                    if (obj == objG) {
                        return objG;
                    }
                    aVar5 = aVarA;
                    dVar = (Q6.d) obj;
                    aVarA = aVar5;
                    if (dVar != null) {
                        I6.AbstractC1252h.f5190a.g("Transformed with default transformers response body for " + ((D6.b) eVar.b()).d().r() + " to " + aVarA.a());
                    }
                    return p087i7.M.f46721a;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 9:
                    aVar5 = (p017b7.a) this.f5204K;
                    eVar = (p007a7.e) this.f5203J;
                    p087i7.x.b(obj);
                    dVar = (Q6.d) obj;
                    aVarA = aVar5;
                    if (dVar != null) {
                        I6.AbstractC1252h.f5190a.g("Transformed with default transformers response body for " + ((D6.b) eVar.b()).d().r() + " to " + aVarA.a());
                    }
                    return p087i7.M.f46721a;
                case 2:
                    aVar4 = (p017b7.a) this.f5201H;
                    eVar5 = (p007a7.e) this.f5200G;
                    aVar2 = (p017b7.a) this.f5204K;
                    eVar3 = (p007a7.e) this.f5203J;
                    p087i7.x.b(obj);
                    Q6.d dVar9 = new Q6.d(aVar4, p147o7.b.c(java.lang.Integer.parseInt(io.ktor.utils.io.q.a((p149o9.q) obj))));
                    this.f5203J = eVar3;
                    this.f5204K = aVar2;
                    this.f5200G = null;
                    this.f5201H = null;
                    this.f5202I = 3;
                    obj = eVar5.e(dVar9, this);
                    if (obj == objG) {
                        return objG;
                    }
                    aVar5 = aVar2;
                    eVar = eVar3;
                    dVar = (Q6.d) obj;
                    aVarA = aVar5;
                    if (dVar != null) {
                        I6.AbstractC1252h.f5190a.g("Transformed with default transformers response body for " + ((D6.b) eVar.b()).d().r() + " to " + aVarA.a());
                    }
                    return p087i7.M.f46721a;
                case 4:
                    aVar = (p017b7.a) this.f5201H;
                    eVar2 = (p007a7.e) this.f5200G;
                    aVar2 = (p017b7.a) this.f5204K;
                    eVar3 = (p007a7.e) this.f5203J;
                    p087i7.x.b(obj);
                    Q6.d dVar10 = new Q6.d(aVar, obj);
                    this.f5203J = eVar3;
                    this.f5204K = aVar2;
                    this.f5200G = null;
                    this.f5201H = null;
                    this.f5202I = 5;
                    obj = eVar2.e(dVar10, this);
                    if (obj == objG) {
                        return objG;
                    }
                    aVar5 = aVar2;
                    eVar = eVar3;
                    dVar = (Q6.d) obj;
                    aVarA = aVar5;
                    if (dVar != null) {
                        I6.AbstractC1252h.f5190a.g("Transformed with default transformers response body for " + ((D6.b) eVar.b()).d().r() + " to " + aVarA.a());
                    }
                    return p087i7.M.f46721a;
                case 6:
                    aVar3 = (p017b7.a) this.f5204K;
                    eVar4 = (p007a7.e) this.f5203J;
                    p087i7.x.b(obj);
                    bArr = (byte[]) obj;
                    lB = T6.AbstractC1677z.b(((D6.b) eVar4.b()).e());
                    if (!p247y7.AbstractC7350t.b(((D6.b) eVar4.b()).d().u0(), T6.A.f12975b.b())) {
                        I6.AbstractC1252h.c(lB, bArr.length);
                    }
                    Q6.d dVar11 = new Q6.d(aVar3, bArr);
                    this.f5203J = eVar4;
                    this.f5204K = aVar3;
                    this.f5202I = 7;
                    obj = eVar4.e(dVar11, this);
                    if (obj == objG) {
                        return objG;
                    }
                    aVar5 = aVar3;
                    eVar = eVar4;
                    dVar = (Q6.d) obj;
                    aVarA = aVar5;
                    if (dVar != null) {
                        I6.AbstractC1252h.f5190a.g("Transformed with default transformers response body for " + ((D6.b) eVar.b()).d().r() + " to " + aVarA.a());
                    }
                    return p087i7.M.f46721a;
                default:
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // p237x7.q
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object j(p007a7.e eVar, Q6.d dVar, p127m7.e eVar2) {
            I6.AbstractC1252h.b bVar = new I6.AbstractC1252h.b(this.f5205L, eVar2);
            bVar.f5203J = eVar;
            bVar.f5204K = dVar;
            return bVar.B(p087i7.M.f46721a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(java.lang.Long l6, long j6) {
        if (l6 == null || l6.longValue() == j6) {
            return;
        }
        throw new java.lang.IllegalStateException(("Content-Length mismatch: expected " + l6 + " bytes, but received " + j6 + " bytes").toString());
    }

    public static final void d(C6.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "<this>");
        cVar.D().l(O6.g.f8084g.b(), new I6.AbstractC1252h.a(null));
        cVar.H().l(Q6.f.f9096g.a(), new I6.AbstractC1252h.b(cVar, null));
        I6.AbstractC1254j.b(cVar);
    }
}
