package p220w;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f56087F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        /* synthetic */ java.lang.Object f56088G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f56089H;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f56088G = obj;
            this.f56089H |= Integer.MIN_VALUE;
            return p220w.c.b(null, this);
        }
    }

    static final class b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f56090G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f56091H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p220w.i f56092I;

        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p220w.i f56093D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p220w.i iVar) {
                super(1);
                this.f56093D = iVar;
            }

            public final void a(long j6) {
                this.f56093D.b(new w.i.a.b(j6, null));
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a(((p131n0.g) obj).v());
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p220w.i iVar, p127m7.e eVar) {
            super(2, eVar);
            this.f56092I = iVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f56090G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p251z0.K k6 = (p251z0.K) this.f56091H;
                w.c.b.a aVar = new w.c.b.a(this.f56092I);
                this.f56090G = 1;
                if (p220w.c.d(k6, aVar, this) == objG) {
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
            return ((w.c.b) x(k6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            w.c.b bVar = new w.c.b(this.f56092I, eVar);
            bVar.f56091H = obj;
            return bVar;
        }
    }

    /* JADX INFO: renamed from: w.c$c, reason: collision with other inner class name */
    static final class C0739c extends p147o7.k implements p237x7.p {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        int f56094E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f56095F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ p237x7.l f56096G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0739c(p237x7.l lVar, p127m7.e eVar) {
            super(2, eVar);
            this.f56096G = lVar;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0057  */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p251z0.InterfaceC7367c interfaceC7367c;
            p251z0.B b6;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f56094E;
            if (i6 != 0) {
                if (i6 == 1) {
                    interfaceC7367c = (p251z0.InterfaceC7367c) this.f56095F;
                    p087i7.x.b(obj);
                } else {
                    if (i6 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj);
                }
                b6 = (p251z0.B) obj;
                if (b6 != null) {
                    b6.a();
                }
                return p087i7.M.f46721a;
            }
            p087i7.x.b(obj);
            interfaceC7367c = (p251z0.InterfaceC7367c) this.f56095F;
            this.f56095F = interfaceC7367c;
            this.f56094E = 1;
            obj = p220w.c.b(interfaceC7367c, this);
            if (obj == objG) {
                return objG;
            }
            p251z0.B b10 = (p251z0.B) obj;
            b10.a();
            this.f56096G.l(p131n0.g.d(b10.h()));
            this.f56095F = null;
            this.f56094E = 2;
            obj = p230x.D.l(interfaceC7367c, null, this, 1, null);
            if (obj == objG) {
                return objG;
            }
            b6 = (p251z0.B) obj;
            if (b6 != null) {
                b6.a();
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(p251z0.InterfaceC7367c interfaceC7367c, p127m7.e eVar) {
            return ((p220w.c.C0739c) x(interfaceC7367c, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            p220w.c.C0739c c0739c = new p220w.c.C0739c(this.f56096G, eVar);
            c0739c.f56095F = obj;
            return c0739c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0069 A[LOOP:0: B:21:0x005a->B:25:0x0069, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(p251z0.InterfaceC7367c r8, p127m7.e r9) {
        /*
            boolean r0 = r9 instanceof w.c.a
            if (r0 == 0) goto L13
            r0 = r9
            w.c$a r0 = (w.c.a) r0
            int r1 = r0.f56089H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56089H = r1
            goto L18
        L13:
            w.c$a r0 = new w.c$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f56088G
            java.lang.Object r1 = p137n7.b.g()
            int r2 = r0.f56089H
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.f56087F
            z0.c r8 = (p251z0.InterfaceC7367c) r8
            p087i7.x.b(r9)
            goto L44
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            p087i7.x.b(r9)
        L38:
            r0.f56087F = r8
            r0.f56089H = r3
            r9 = 0
            java.lang.Object r9 = p251z0.AbstractC7366b.a(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L44
            return r1
        L44:
            z0.p r9 = (p251z0.C7380p) r9
            int r2 = r9.b()
            boolean r2 = p251z0.AbstractC7384u.c(r2)
            if (r2 == 0) goto L38
            java.util.List r2 = r9.c()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L5a:
            if (r6 >= r4) goto L6c
            java.lang.Object r7 = r2.get(r6)
            z0.B r7 = (p251z0.B) r7
            boolean r7 = p251z0.AbstractC7381q.a(r7)
            if (r7 != 0) goto L69
            goto L38
        L69:
            int r6 = r6 + 1
            goto L5a
        L6c:
            java.util.List r8 = r9.c()
            java.lang.Object r8 = r8.get(r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p220w.c.b(z0.c, m7.e):java.lang.Object");
    }

    public static final androidx.compose.ui.d c(androidx.compose.ui.d dVar, p220w.i iVar) {
        return p251z0.U.d(dVar, p220w.d.f56097a, new w.c.b(iVar, null));
    }

    public static final java.lang.Object d(p251z0.K k6, p237x7.l lVar, p127m7.e eVar) {
        java.lang.Object objC = p230x.q.c(k6, new p220w.c.C0739c(lVar, null), eVar);
        return objC == p137n7.b.g() ? objC : p087i7.M.f46721a;
    }
}
