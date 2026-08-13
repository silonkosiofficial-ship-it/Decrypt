package p073h2;

/* JADX INFO: loaded from: classes.dex */
public abstract class S {

    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f46006G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f46007H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p237x7.p f46008I;

        /* JADX INFO: renamed from: h2.S$a$a, reason: collision with other inner class name */
        static final class C0534a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            java.lang.Object f46009G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            int f46010H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            private /* synthetic */ java.lang.Object f46011I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            final /* synthetic */ Z8.InterfaceC1870g f46012J;

            /* JADX INFO: renamed from: K, reason: collision with root package name */
            final /* synthetic */ p237x7.p f46013K;

            /* JADX INFO: renamed from: h2.S$a$a$a, reason: collision with other inner class name */
            static final class C0535a extends p147o7.l implements p237x7.p {

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                int f46014G;

                /* JADX INFO: renamed from: H, reason: collision with root package name */
                final /* synthetic */ Y8.j f46015H;

                /* JADX INFO: renamed from: I, reason: collision with root package name */
                final /* synthetic */ p237x7.p f46016I;

                /* JADX INFO: renamed from: h2.S$a$a$a$a, reason: collision with other inner class name */
                static final class C0536a extends p147o7.l implements p237x7.p {

                    /* JADX INFO: renamed from: G, reason: collision with root package name */
                    int f46017G;

                    /* JADX INFO: renamed from: H, reason: collision with root package name */
                    private /* synthetic */ java.lang.Object f46018H;

                    /* JADX INFO: renamed from: I, reason: collision with root package name */
                    final /* synthetic */ Y8.j f46019I;

                    /* JADX INFO: renamed from: J, reason: collision with root package name */
                    final /* synthetic */ p237x7.p f46020J;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0536a(Y8.j jVar, p237x7.p pVar, p127m7.e eVar) {
                        super(2, eVar);
                        this.f46019I = jVar;
                        this.f46020J = pVar;
                    }

                    @Override // p147o7.a
                    public final java.lang.Object B(java.lang.Object obj) {
                        java.lang.Object objG = p137n7.b.g();
                        int i6 = this.f46017G;
                        if (i6 == 0) {
                            p087i7.x.b(obj);
                            p073h2.U u6 = new p073h2.U((W8.N) this.f46018H, this.f46019I);
                            p237x7.p pVar = this.f46020J;
                            this.f46017G = 1;
                            if (pVar.u(u6, this) == objG) {
                                return objG;
                            }
                        } else {
                            if (i6 != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            p087i7.x.b(obj);
                        }
                        return p087i7.M.f46721a;
                    }

                    @Override // p237x7.p
                    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
                    public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
                        return ((h2.S.a.C0534a.C0535a.C0536a) x(n6, eVar)).B(p087i7.M.f46721a);
                    }

                    @Override // p147o7.a
                    public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                        h2.S.a.C0534a.C0535a.C0536a c0536a = new h2.S.a.C0534a.C0535a.C0536a(this.f46019I, this.f46020J, eVar);
                        c0536a.f46018H = obj;
                        return c0536a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0535a(Y8.j jVar, p237x7.p pVar, p127m7.e eVar) {
                    super(2, eVar);
                    this.f46015H = jVar;
                    this.f46016I = pVar;
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    java.lang.Object objG = p137n7.b.g();
                    int i6 = this.f46014G;
                    try {
                        if (i6 == 0) {
                            p087i7.x.b(obj);
                            h2.S.a.C0534a.C0535a.C0536a c0536a = new h2.S.a.C0534a.C0535a.C0536a(this.f46015H, this.f46016I, null);
                            this.f46014G = 1;
                            if (W8.O.f(c0536a, this) == objG) {
                                return objG;
                            }
                        } else {
                            if (i6 != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            p087i7.x.b(obj);
                        }
                        Y8.C.a.a(this.f46015H, null, 1, null);
                    } catch (java.lang.Throwable th) {
                        this.f46015H.c(th);
                    }
                    return p087i7.M.f46721a;
                }

                @Override // p237x7.p
                /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
                    return ((h2.S.a.C0534a.C0535a) x(n6, eVar)).B(p087i7.M.f46721a);
                }

                @Override // p147o7.a
                public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                    return new h2.S.a.C0534a.C0535a(this.f46015H, this.f46016I, eVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0534a(Z8.InterfaceC1870g interfaceC1870g, p237x7.p pVar, p127m7.e eVar) {
                super(2, eVar);
                this.f46012J = interfaceC1870g;
                this.f46013K = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:14:0x005e A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:15:0x005f  */
            /* JADX WARN: Code duplicated, block: B:18:0x006b  */
            /* JADX WARN: Code duplicated, block: B:20:0x007d A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:21:0x007e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007b -> B:7:0x001a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r0 = p137n7.b.g()
                    int r1 = r12.f46010H
                    r2 = 2
                    r3 = 1
                    r4 = 0
                    if (r1 == 0) goto L31
                    if (r1 == r3) goto L25
                    if (r1 != r2) goto L1d
                    java.lang.Object r1 = r12.f46009G
                    Y8.l r1 = (Y8.l) r1
                    java.lang.Object r5 = r12.f46011I
                    W8.z0 r5 = (W8.InterfaceC1822z0) r5
                    p087i7.x.b(r13)
                L1a:
                    r13 = r1
                    r1 = r5
                    goto L52
                L1d:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L25:
                    java.lang.Object r1 = r12.f46009G
                    Y8.l r1 = (Y8.l) r1
                    java.lang.Object r5 = r12.f46011I
                    W8.z0 r5 = (W8.InterfaceC1822z0) r5
                    p087i7.x.b(r13)
                    goto L63
                L31:
                    p087i7.x.b(r13)
                    java.lang.Object r13 = r12.f46011I
                    r5 = r13
                    W8.N r5 = (W8.N) r5
                    r13 = 0
                    r1 = 6
                    Y8.j r13 = Y8.m.b(r13, r4, r4, r1, r4)
                    h2.S$a$a$a r8 = new h2.S$a$a$a
                    x7.p r1 = r12.f46013K
                    r8.<init>(r13, r1, r4)
                    r9 = 3
                    r10 = 0
                    r6 = 0
                    r7 = 0
                    W8.z0 r1 = W8.AbstractC1784g.d(r5, r6, r7, r8, r9, r10)
                    Y8.l r13 = r13.iterator()
                L52:
                    r12.f46011I = r1
                    r12.f46009G = r13
                    r12.f46010H = r3
                    java.lang.Object r5 = r13.a(r12)
                    if (r5 != r0) goto L5f
                    return r0
                L5f:
                    r11 = r1
                    r1 = r13
                    r13 = r5
                    r5 = r11
                L63:
                    java.lang.Boolean r13 = (java.lang.Boolean) r13
                    boolean r13 = r13.booleanValue()
                    if (r13 == 0) goto L7e
                    java.lang.Object r13 = r1.next()
                    Z8.g r6 = r12.f46012J
                    r12.f46011I = r5
                    r12.f46009G = r1
                    r12.f46010H = r2
                    java.lang.Object r13 = r6.a(r13, r12)
                    if (r13 != r0) goto L1a
                    return r0
                L7e:
                    W8.InterfaceC1822z0.a.a(r5, r4, r3, r4)
                    i7.M r13 = p087i7.M.f46721a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: h2.S.a.C0534a.B(java.lang.Object):java.lang.Object");
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
                return ((h2.S.a.C0534a) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                h2.S.a.C0534a c0534a = new h2.S.a.C0534a(this.f46012J, this.f46013K, eVar);
                c0534a.f46011I = obj;
                return c0534a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p237x7.p pVar, p127m7.e eVar) {
            super(2, eVar);
            this.f46008I = pVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f46006G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                h2.S.a.C0534a c0534a = new h2.S.a.C0534a((Z8.InterfaceC1870g) this.f46007H, this.f46008I, null);
                this.f46006G = 1;
                if (W8.O.f(c0534a, this) == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            return ((h2.S.a) x(interfaceC1870g, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            h2.S.a aVar = new h2.S.a(this.f46008I, eVar);
            aVar.f46007H = obj;
            return aVar;
        }
    }

    public static final Z8.InterfaceC1869f a(p237x7.p pVar) {
        p247y7.AbstractC7350t.f(pVar, "block");
        return Z8.AbstractC1875l.b(Z8.AbstractC1871h.x(new h2.S.a(pVar, null)), -2, null, 2, null);
    }
}
