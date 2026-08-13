package N;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f7456F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        /* synthetic */ java.lang.Object f7457G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f7458H;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f7457G = obj;
            this.f7458H |= Integer.MIN_VALUE;
            return N.s.e(null, this);
        }
    }

    static final class b extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f7459F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f7460G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f7461H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f7462I;

        b(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f7461H = obj;
            this.f7462I |= Integer.MIN_VALUE;
            return N.s.h(null, null, null, null, this);
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ N.InterfaceC1358h f7463D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(N.InterfaceC1358h interfaceC1358h) {
            super(1);
            this.f7463D = interfaceC1358h;
        }

        public final void a(p251z0.B b6) {
            if (this.f7463D.b(b6.h())) {
                b6.a();
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p251z0.B) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ N.InterfaceC1358h f7464D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ N.q f7465E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(N.InterfaceC1358h interfaceC1358h, N.q qVar) {
            super(1);
            this.f7464D = interfaceC1358h;
            this.f7465E = qVar;
        }

        public final void a(p251z0.B b6) {
            if (this.f7464D.c(b6.h(), this.f7465E)) {
                b6.a();
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p251z0.B) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class e extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f7466G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f7467H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ N.InterfaceC1358h f7468I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ H.F f7469J;

        static final class a extends p147o7.k implements p237x7.p {

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            int f7470E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            private /* synthetic */ java.lang.Object f7471F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            final /* synthetic */ N.InterfaceC1358h f7472G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ N.C1354d f7473H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ H.F f7474I;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(N.InterfaceC1358h interfaceC1358h, N.C1354d c1354d, H.F f6, p127m7.e eVar) {
                super(2, eVar);
                this.f7472G = interfaceC1358h;
                this.f7473H = c1354d;
                this.f7474I = f6;
            }

            /* JADX WARN: Code duplicated, block: B:30:0x007d  */
            /* JADX WARN: Code duplicated, block: B:32:0x0089 A[RETURN] */
            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                p251z0.InterfaceC7367c interfaceC7367c;
                H.F f6;
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f7470E;
                if (i6 != 0) {
                    if (i6 == 1) {
                        interfaceC7367c = (p251z0.InterfaceC7367c) this.f7471F;
                        p087i7.x.b(obj);
                    } else {
                        if (i6 != 2 && i6 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p087i7.x.b(obj);
                    }
                    return p087i7.M.f46721a;
                }
                p087i7.x.b(obj);
                interfaceC7367c = (p251z0.InterfaceC7367c) this.f7471F;
                this.f7471F = interfaceC7367c;
                this.f7470E = 1;
                obj = N.s.e(interfaceC7367c, this);
                if (obj == objG) {
                    return objG;
                }
                p251z0.C7380p c7380p = (p251z0.C7380p) obj;
                if (N.s.g(c7380p) && p251z0.AbstractC7384u.b(c7380p.b())) {
                    java.util.List listC = c7380p.c();
                    int size = listC.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            N.InterfaceC1358h interfaceC1358h = this.f7472G;
                            N.C1354d c1354d = this.f7473H;
                            this.f7471F = null;
                            this.f7470E = 2;
                            if (N.s.h(interfaceC7367c, interfaceC1358h, c1354d, c7380p, this) == objG) {
                                return objG;
                            }
                        } else {
                            if (!(!((p251z0.B) listC.get(i10)).p())) {
                                break;
                            }
                            i10++;
                        }
                    }
                    if (!N.s.g(c7380p)) {
                        f6 = this.f7474I;
                        this.f7471F = null;
                        this.f7470E = 3;
                        if (N.s.j(interfaceC7367c, f6, c7380p, this) == objG) {
                            return objG;
                        }
                    }
                } else if (!N.s.g(c7380p)) {
                    f6 = this.f7474I;
                    this.f7471F = null;
                    this.f7470E = 3;
                    if (N.s.j(interfaceC7367c, f6, c7380p, this) == objG) {
                        return objG;
                    }
                }
                return p087i7.M.f46721a;
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(p251z0.InterfaceC7367c interfaceC7367c, p127m7.e eVar) {
                return ((N.s.e.a) x(interfaceC7367c, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                N.s.e.a aVar = new N.s.e.a(this.f7472G, this.f7473H, this.f7474I, eVar);
                aVar.f7471F = obj;
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(N.InterfaceC1358h interfaceC1358h, H.F f6, p127m7.e eVar) {
            super(2, eVar);
            this.f7468I = interfaceC1358h;
            this.f7469J = f6;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f7466G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p251z0.K k6 = (p251z0.K) this.f7467H;
                N.s.e.a aVar = new N.s.e.a(this.f7468I, new N.C1354d(k6.getViewConfiguration()), this.f7469J, null);
                this.f7466G = 1;
                if (p230x.q.c(k6, aVar, this) == objG) {
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
        public final java.lang.Object u(p251z0.K k6, p127m7.e eVar) {
            return ((N.s.e) x(k6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            N.s.e eVar2 = new N.s.e(this.f7468I, this.f7469J, eVar);
            eVar2.f7467H = obj;
            return eVar2;
        }
    }

    static final class f extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f7475F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f7476G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f7477H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f7478I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f7479J;

        f(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f7478I = obj;
            this.f7479J |= Integer.MIN_VALUE;
            return N.s.j(null, null, null, this);
        }
    }

    static final class g extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ H.F f7480D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(H.F f6) {
            super(1);
            this.f7480D = f6;
        }

        public final void a(p251z0.B b6) {
            this.f7480D.e(p251z0.AbstractC7381q.g(b6));
            b6.a();
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p251z0.B) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class h extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f7481G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f7482H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p237x7.l f7483I;

        static final class a extends p147o7.k implements p237x7.p {

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            int f7484E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            private /* synthetic */ java.lang.Object f7485F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            final /* synthetic */ p237x7.l f7486G;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p237x7.l lVar, p127m7.e eVar) {
                super(2, eVar);
                this.f7486G = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:11:0x002f A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:12:0x0030). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x002f
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = p137n7.b.g()
                    int r1 = r4.f7484E
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r1 = r4.f7485F
                    z0.c r1 = (p251z0.InterfaceC7367c) r1
                    p087i7.x.b(r5)
                    goto L30
                L13:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1b:
                    p087i7.x.b(r5)
                    java.lang.Object r5 = r4.f7485F
                    z0.c r5 = (p251z0.InterfaceC7367c) r5
                    r1 = r5
                L23:
                    z0.r r5 = p251z0.r.Initial
                    r4.f7485F = r1
                    r4.f7484E = r2
                    java.lang.Object r5 = r1.X0(r5, r4)
                    if (r5 != r0) goto L30
                    return r0
                L30:
                    z0.p r5 = (p251z0.C7380p) r5
                    x7.l r3 = r4.f7486G
                    boolean r5 = N.s.g(r5)
                    r5 = r5 ^ r2
                    java.lang.Boolean r5 = p147o7.b.a(r5)
                    r3.l(r5)
                    goto L23
                */
                throw new UnsupportedOperationException("Method not decompiled: N.s.h.a.B(java.lang.Object):java.lang.Object");
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(p251z0.InterfaceC7367c interfaceC7367c, p127m7.e eVar) {
                return ((N.s.h.a) x(interfaceC7367c, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                N.s.h.a aVar = new N.s.h.a(this.f7486G, eVar);
                aVar.f7485F = obj;
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(p237x7.l lVar, p127m7.e eVar) {
            super(2, eVar);
            this.f7483I = lVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f7481G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p251z0.K k6 = (p251z0.K) this.f7482H;
                N.s.h.a aVar = new N.s.h.a(this.f7483I, null);
                this.f7481G = 1;
                if (k6.V(aVar, this) == objG) {
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
        public final java.lang.Object u(p251z0.K k6, p127m7.e eVar) {
            return ((N.s.h) x(k6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            N.s.h hVar = new N.s.h(this.f7483I, eVar);
            hVar.f7482H = obj;
            return hVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x005f A[LOOP:0: B:19:0x0050->B:23:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object e(p251z0.InterfaceC7367c r7, p127m7.e r8) {
        /*
            boolean r0 = r8 instanceof N.s.a
            if (r0 == 0) goto L13
            r0 = r8
            N.s$a r0 = (N.s.a) r0
            int r1 = r0.f7458H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7458H = r1
            goto L18
        L13:
            N.s$a r0 = new N.s$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f7457G
            java.lang.Object r1 = p137n7.b.g()
            int r2 = r0.f7458H
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f7456F
            z0.c r7 = (p251z0.InterfaceC7367c) r7
            p087i7.x.b(r8)
            goto L45
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            p087i7.x.b(r8)
        L38:
            z0.r r8 = p251z0.r.Main
            r0.f7456F = r7
            r0.f7458H = r3
            java.lang.Object r8 = r7.X0(r8, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            z0.p r8 = (p251z0.C7380p) r8
            java.util.List r2 = r8.c()
            int r4 = r2.size()
            r5 = 0
        L50:
            if (r5 >= r4) goto L62
            java.lang.Object r6 = r2.get(r5)
            z0.B r6 = (p251z0.B) r6
            boolean r6 = p251z0.AbstractC7381q.b(r6)
            if (r6 != 0) goto L5f
            goto L38
        L5f:
            int r5 = r5 + 1
            goto L50
        L62:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: N.s.e(z0.c, m7.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(androidx.compose.ui.platform.A1 a6, p251z0.B b6, p251z0.B b10) {
        return p131n0.g.k(p131n0.g.q(b6.h(), b10.h())) < p230x.l.i(a6, b6.n());
    }

    public static final boolean g(p251z0.C7380p c7380p) {
        java.util.List listC = c7380p.c();
        int size = listC.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (!p251z0.P.g(((p251z0.B) listC.get(i6)).n(), p251z0.P.f57513a.b())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0098  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:47:0x0100  */
    /* JADX WARN: Code duplicated, block: B:49:0x010c  */
    /* JADX WARN: Code duplicated, block: B:55:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object h(p251z0.InterfaceC7367c interfaceC7367c, N.InterfaceC1358h interfaceC1358h, N.C1354d c1354d, p251z0.C7380p c7380p, p127m7.e eVar) {
        N.s.b bVar;
        N.q qVarL;
        java.util.List listC;
        int size;
        p251z0.B b6;
        java.util.List listC2;
        int size2;
        p251z0.B b10;
        if (eVar instanceof N.s.b) {
            bVar = (N.s.b) eVar;
            int i6 = bVar.f7462I;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                bVar.f7462I = i6 - Integer.MIN_VALUE;
            } else {
                bVar = new N.s.b(eVar);
            }
        } else {
            bVar = new N.s.b(eVar);
        }
        java.lang.Object objG = bVar.f7461H;
        java.lang.Object objG2 = p137n7.b.g();
        int i10 = bVar.f7462I;
        int i11 = 0;
        if (i10 == 0) {
            p087i7.x.b(objG);
            c1354d.d(c7380p);
            p251z0.B b11 = (p251z0.B) c7380p.c().get(0);
            if (!N.H.b(c7380p)) {
                int iA = c1354d.a();
                if (iA != 1) {
                    qVarL = iA != 2 ? N.q.f7440a.m() : N.q.f7440a.n();
                } else {
                    qVarL = N.q.f7440a.l();
                }
                if (interfaceC1358h.a(b11.h(), qVarL)) {
                    long jF = b11.f();
                    N.s.d dVar = new N.s.d(interfaceC1358h, qVarL);
                    bVar.f7459F = interfaceC7367c;
                    bVar.f7460G = interfaceC1358h;
                    bVar.f7462I = 2;
                    objG = p230x.l.g(interfaceC7367c, jF, dVar, bVar);
                    if (objG == objG2) {
                        return objG2;
                    }
                    if (((java.lang.Boolean) objG).booleanValue()) {
                        listC2 = interfaceC7367c.L().c();
                        size2 = listC2.size();
                        while (i11 < size2) {
                            b10 = (p251z0.B) listC2.get(i11);
                            if (p251z0.AbstractC7381q.c(b10)) {
                                b10.a();
                            }
                            i11++;
                        }
                    }
                    interfaceC1358h.d();
                }
            } else if (interfaceC1358h.e(b11.h())) {
                long jF2 = b11.f();
                N.s.c cVar = new N.s.c(interfaceC1358h);
                bVar.f7459F = interfaceC7367c;
                bVar.f7460G = interfaceC1358h;
                bVar.f7462I = 1;
                objG = p230x.l.g(interfaceC7367c, jF2, cVar, bVar);
                if (objG == objG2) {
                    return objG2;
                }
                if (((java.lang.Boolean) objG).booleanValue()) {
                    listC = interfaceC7367c.L().c();
                    size = listC.size();
                    while (i11 < size) {
                        b6 = (p251z0.B) listC.get(i11);
                        if (p251z0.AbstractC7381q.c(b6)) {
                            b6.a();
                        }
                        i11++;
                    }
                }
                interfaceC1358h.d();
            }
        } else if (i10 == 1) {
            interfaceC1358h = (N.InterfaceC1358h) bVar.f7460G;
            interfaceC7367c = (p251z0.InterfaceC7367c) bVar.f7459F;
            p087i7.x.b(objG);
            if (((java.lang.Boolean) objG).booleanValue()) {
                listC = interfaceC7367c.L().c();
                size = listC.size();
                while (i11 < size) {
                    b6 = (p251z0.B) listC.get(i11);
                    if (p251z0.AbstractC7381q.c(b6)) {
                        b6.a();
                    }
                    i11++;
                }
            }
            interfaceC1358h.d();
        } else {
            if (i10 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC1358h = (N.InterfaceC1358h) bVar.f7460G;
            interfaceC7367c = (p251z0.InterfaceC7367c) bVar.f7459F;
            p087i7.x.b(objG);
            if (((java.lang.Boolean) objG).booleanValue()) {
                listC2 = interfaceC7367c.L().c();
                size2 = listC2.size();
                while (i11 < size2) {
                    b10 = (p251z0.B) listC2.get(i11);
                    if (p251z0.AbstractC7381q.c(b10)) {
                        b10.a();
                    }
                    i11++;
                }
            }
            interfaceC1358h.d();
        }
        return p087i7.M.f46721a;
    }

    public static final androidx.compose.ui.d i(androidx.compose.ui.d dVar, N.InterfaceC1358h interfaceC1358h, H.F f6) {
        return p251z0.U.c(dVar, interfaceC1358h, f6, new N.s.e(interfaceC1358h, f6, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x00a9 A[Catch: CancellationException -> 0x0035, TryCatch #0 {CancellationException -> 0x0035, blocks: (B:13:0x0031, B:33:0x00a1, B:35:0x00a9, B:37:0x00b8, B:39:0x00c4, B:40:0x00c7, B:41:0x00ca, B:42:0x00ce, B:20:0x004c, B:26:0x0073, B:28:0x0077, B:30:0x0081, B:23:0x0056), top: B:47:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b8 A[Catch: CancellationException -> 0x0035, TryCatch #0 {CancellationException -> 0x0035, blocks: (B:13:0x0031, B:33:0x00a1, B:35:0x00a9, B:37:0x00b8, B:39:0x00c4, B:40:0x00c7, B:41:0x00ca, B:42:0x00ce, B:20:0x004c, B:26:0x0073, B:28:0x0077, B:30:0x0081, B:23:0x0056), top: B:47:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c4 A[Catch: CancellationException -> 0x0035, TryCatch #0 {CancellationException -> 0x0035, blocks: (B:13:0x0031, B:33:0x00a1, B:35:0x00a9, B:37:0x00b8, B:39:0x00c4, B:40:0x00c7, B:41:0x00ca, B:42:0x00ce, B:20:0x004c, B:26:0x0073, B:28:0x0077, B:30:0x0081, B:23:0x0056), top: B:47:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ce A[Catch: CancellationException -> 0x0035, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0035, blocks: (B:13:0x0031, B:33:0x00a1, B:35:0x00a9, B:37:0x00b8, B:39:0x00c4, B:40:0x00c7, B:41:0x00ca, B:42:0x00ce, B:20:0x004c, B:26:0x0073, B:28:0x0077, B:30:0x0081, B:23:0x0056), top: B:47:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object j(p251z0.InterfaceC7367c interfaceC7367c, H.F f6, p251z0.C7380p c7380p, p127m7.e eVar) {
        N.s.f fVar;
        p251z0.B b6;
        java.util.List listC;
        int size;
        int i6;
        p251z0.B b10;
        if (eVar instanceof N.s.f) {
            fVar = (N.s.f) eVar;
            int i10 = fVar.f7479J;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f7479J = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new N.s.f(eVar);
            }
        } else {
            fVar = new N.s.f(eVar);
        }
        java.lang.Object objC = fVar.f7478I;
        java.lang.Object objG = p137n7.b.g();
        int i11 = fVar.f7479J;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    p251z0.B b11 = (p251z0.B) fVar.f7477H;
                    f6 = (H.F) fVar.f7476G;
                    p251z0.InterfaceC7367c interfaceC7367c2 = (p251z0.InterfaceC7367c) fVar.f7475F;
                    p087i7.x.b(objC);
                    b6 = b11;
                    interfaceC7367c = interfaceC7367c2;
                } else {
                    if (i11 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f6 = (H.F) fVar.f7476G;
                    interfaceC7367c = (p251z0.InterfaceC7367c) fVar.f7475F;
                    p087i7.x.b(objC);
                }
                if (((java.lang.Boolean) objC).booleanValue()) {
                    listC = interfaceC7367c.L().c();
                    size = listC.size();
                    for (i6 = 0; i6 < size; i6++) {
                        b10 = (p251z0.B) listC.get(i6);
                        if (p251z0.AbstractC7381q.c(b10)) {
                            b10.a();
                        }
                    }
                    f6.c();
                } else {
                    f6.onCancel();
                }
                return p087i7.M.f46721a;
            }
            p087i7.x.b(objC);
            b6 = (p251z0.B) p097j7.AbstractC6879v.i0(c7380p.c());
            long jF = b6.f();
            fVar.f7475F = interfaceC7367c;
            fVar.f7476G = f6;
            fVar.f7477H = b6;
            fVar.f7479J = 1;
            objC = p230x.l.c(interfaceC7367c, jF, fVar);
            if (objC == objG) {
                return objG;
            }
            p251z0.B b12 = (p251z0.B) objC;
            if (b12 != null && f(interfaceC7367c.getViewConfiguration(), b6, b12)) {
                f6.b(b12.h());
                long jF2 = b12.f();
                N.s.g gVar = new N.s.g(f6);
                fVar.f7475F = interfaceC7367c;
                fVar.f7476G = f6;
                fVar.f7477H = null;
                fVar.f7479J = 2;
                objC = p230x.l.g(interfaceC7367c, jF2, gVar, fVar);
                if (objC == objG) {
                    return objG;
                }
                if (((java.lang.Boolean) objC).booleanValue()) {
                    listC = interfaceC7367c.L().c();
                    size = listC.size();
                    while (i6 < size) {
                        b10 = (p251z0.B) listC.get(i6);
                        if (p251z0.AbstractC7381q.c(b10)) {
                            b10.a();
                        }
                    }
                    f6.c();
                } else {
                    f6.onCancel();
                }
            }
            return p087i7.M.f46721a;
        } catch (java.util.concurrent.CancellationException e6) {
            f6.onCancel();
            throw e6;
        }
    }

    public static final androidx.compose.ui.d k(androidx.compose.ui.d dVar, p237x7.l lVar) {
        return p251z0.U.d(dVar, 8675309, new N.s.h(lVar, null));
    }
}
