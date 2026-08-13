package p009a9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l {

    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f17198G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f17199H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f17200I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f17201J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        int f17202K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f17203L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1869f[] f17204M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ p237x7.a f17205N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ p237x7.q f17206O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1870g f17207P;

        /* JADX INFO: renamed from: a9.l$a$a, reason: collision with other inner class name */
        static final class C0330a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f17208G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ Z8.InterfaceC1869f[] f17209H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ int f17210I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f17211J;

            /* JADX INFO: renamed from: K, reason: collision with root package name */
            final /* synthetic */ Y8.j f17212K;

            /* JADX INFO: renamed from: a9.l$a$a$a, reason: collision with other inner class name */
            static final class C0331a implements Z8.InterfaceC1870g {

                /* JADX INFO: renamed from: C, reason: collision with root package name */
                final /* synthetic */ Y8.j f17213C;

                /* JADX INFO: renamed from: D, reason: collision with root package name */
                final /* synthetic */ int f17214D;

                /* JADX INFO: renamed from: a9.l$a$a$a$a, reason: collision with other inner class name */
                static final class C0332a extends p147o7.d {

                    /* JADX INFO: renamed from: F, reason: collision with root package name */
                    /* synthetic */ java.lang.Object f17215F;

                    /* JADX INFO: renamed from: H, reason: collision with root package name */
                    int f17217H;

                    C0332a(p127m7.e eVar) {
                        super(eVar);
                    }

                    @Override // p147o7.a
                    public final java.lang.Object B(java.lang.Object obj) {
                        this.f17215F = obj;
                        this.f17217H |= Integer.MIN_VALUE;
                        return a9.l.a.C0330a.C0331a.this.a(null, this);
                    }
                }

                C0331a(Y8.j jVar, int i6) {
                    this.f17213C = jVar;
                    this.f17214D = i6;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // Z8.InterfaceC1870g
                public final java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
                    a9.l.a.C0330a.C0331a.C0332a c0332a;
                    if (eVar instanceof a9.l.a.C0330a.C0331a.C0332a) {
                        c0332a = (a9.l.a.C0330a.C0331a.C0332a) eVar;
                        int i6 = c0332a.f17217H;
                        if ((i6 & Integer.MIN_VALUE) != 0) {
                            c0332a.f17217H = i6 - Integer.MIN_VALUE;
                        } else {
                            c0332a = new a9.l.a.C0330a.C0331a.C0332a(eVar);
                        }
                    } else {
                        c0332a = new a9.l.a.C0330a.C0331a.C0332a(eVar);
                    }
                    java.lang.Object obj2 = c0332a.f17215F;
                    java.lang.Object objG = p137n7.b.g();
                    int i10 = c0332a.f17217H;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            p087i7.x.b(obj2);
                        } else {
                            if (i10 != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            p087i7.x.b(obj2);
                        }
                        return p087i7.M.f46721a;
                    }
                    p087i7.x.b(obj2);
                    Y8.j jVar = this.f17213C;
                    p097j7.L l6 = new p097j7.L(this.f17214D, obj);
                    c0332a.f17217H = 1;
                    if (jVar.h(l6, c0332a) == objG) {
                        return objG;
                    }
                    c0332a.f17217H = 2;
                    if (W8.g1.a(c0332a) == objG) {
                        return objG;
                    }
                    return p087i7.M.f46721a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0330a(Z8.InterfaceC1869f[] interfaceC1869fArr, int i6, java.util.concurrent.atomic.AtomicInteger atomicInteger, Y8.j jVar, p127m7.e eVar) {
                super(2, eVar);
                this.f17209H = interfaceC1869fArr;
                this.f17210I = i6;
                this.f17211J = atomicInteger;
                this.f17212K = jVar;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f17208G;
                try {
                    if (i6 == 0) {
                        p087i7.x.b(obj);
                        Z8.InterfaceC1869f[] interfaceC1869fArr = this.f17209H;
                        int i10 = this.f17210I;
                        Z8.InterfaceC1869f interfaceC1869f = interfaceC1869fArr[i10];
                        a9.l.a.C0330a.C0331a c0331a = new a9.l.a.C0330a.C0331a(this.f17212K, i10);
                        this.f17208G = 1;
                        if (interfaceC1869f.b(c0331a, this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i6 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p087i7.x.b(obj);
                    }
                    if (this.f17211J.decrementAndGet() == 0) {
                        Y8.C.a.a(this.f17212K, null, 1, null);
                    }
                    return p087i7.M.f46721a;
                } catch (java.lang.Throwable th) {
                    if (this.f17211J.decrementAndGet() == 0) {
                        Y8.C.a.a(this.f17212K, null, 1, null);
                    }
                    throw th;
                }
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
                return ((a9.l.a.C0330a) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return new a9.l.a.C0330a(this.f17209H, this.f17210I, this.f17211J, this.f17212K, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Z8.InterfaceC1869f[] interfaceC1869fArr, p237x7.a aVar, p237x7.q qVar, Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            super(2, eVar);
            this.f17204M = interfaceC1869fArr;
            this.f17205N = aVar;
            this.f17206O = qVar;
            this.f17207P = interfaceC1870g;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x00bd A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x00be  */
        /* JADX WARN: Code duplicated, block: B:26:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:28:0x00ca A[LOOP:0: B:28:0x00ca->B:48:?, LOOP_START, PHI: r6 r10
  0x00ca: PHI (r6v6 int) = (r6v5 int), (r6v7 int) binds: [B:25:0x00c5, B:48:?] A[DONT_GENERATE, DONT_INLINE]
  0x00ca: PHI (r10v8 j7.L) = (r10v7 j7.L), (r10v21 j7.L) binds: [B:25:0x00c5, B:48:?] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:30:0x00da  */
        /* JADX WARN: Code duplicated, block: B:33:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:36:0x00f1  */
        /* JADX WARN: Code duplicated, block: B:38:0x00fb  */
        /* JADX WARN: Code duplicated, block: B:40:0x0111 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:41:0x0112  */
        /* JADX WARN: Code duplicated, block: B:43:0x0134 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:46:0x00ef A[EDGE_INSN: B:46:0x00ef->B:35:0x00ef BREAK  A[LOOP:0: B:28:0x00ca->B:48:?], SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0135 -> B:45:0x0137). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object r24) {
            /*
                Method dump skipped, instruction units count: 314
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: a9.l.a.B(java.lang.Object):java.lang.Object");
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((a9.l.a) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            a9.l.a aVar = new a9.l.a(this.f17204M, this.f17205N, this.f17206O, this.f17207P, eVar);
            aVar.f17203L = obj;
            return aVar;
        }
    }

    public static final java.lang.Object a(Z8.InterfaceC1870g interfaceC1870g, Z8.InterfaceC1869f[] interfaceC1869fArr, p237x7.a aVar, p237x7.q qVar, p127m7.e eVar) {
        java.lang.Object objA = p009a9.o.a(new a9.l.a(interfaceC1869fArr, aVar, qVar, interfaceC1870g, null), eVar);
        return objA == p137n7.b.g() ? objA : p087i7.M.f46721a;
    }
}
