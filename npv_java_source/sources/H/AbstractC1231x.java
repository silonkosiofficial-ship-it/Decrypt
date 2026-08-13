package H;

/* JADX INFO: renamed from: H.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1231x {

    /* JADX INFO: renamed from: H.x$a */
    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f4220G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f4221H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p251z0.K f4222I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ H.F f4223J;

        /* JADX INFO: renamed from: H.x$a$a, reason: collision with other inner class name */
        static final class C0103a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f4224G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ p251z0.K f4225H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ H.F f4226I;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0103a(p251z0.K k6, H.F f6, p127m7.e eVar) {
                super(2, eVar);
                this.f4225H = k6;
                this.f4226I = f6;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f4224G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    p251z0.K k6 = this.f4225H;
                    H.F f6 = this.f4226I;
                    this.f4224G = 1;
                    if (H.AbstractC1231x.e(k6, f6, this) == objG) {
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
                return ((H.AbstractC1231x.a.C0103a) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return new H.AbstractC1231x.a.C0103a(this.f4225H, this.f4226I, eVar);
            }
        }

        /* JADX INFO: renamed from: H.x$a$b */
        static final class b extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f4227G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ p251z0.K f4228H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ H.F f4229I;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(p251z0.K k6, H.F f6, p127m7.e eVar) {
                super(2, eVar);
                this.f4228H = k6;
                this.f4229I = f6;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f4227G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    p251z0.K k6 = this.f4228H;
                    H.F f6 = this.f4229I;
                    this.f4227G = 1;
                    if (H.AbstractC1231x.d(k6, f6, this) == objG) {
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
                return ((H.AbstractC1231x.a.b) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return new H.AbstractC1231x.a.b(this.f4228H, this.f4229I, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p251z0.K k6, H.F f6, p127m7.e eVar) {
            super(2, eVar);
            this.f4222I = k6;
            this.f4223J = f6;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            if (this.f4220G != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            W8.N n6 = (W8.N) this.f4221H;
            W8.P p6 = W8.P.UNDISPATCHED;
            W8.AbstractC1788i.d(n6, null, p6, new H.AbstractC1231x.a.C0103a(this.f4222I, this.f4223J, null), 1, null);
            return W8.AbstractC1788i.d(n6, null, p6, new H.AbstractC1231x.a.b(this.f4222I, this.f4223J, null), 1, null);
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((H.AbstractC1231x.a) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            H.AbstractC1231x.a aVar = new H.AbstractC1231x.a(this.f4222I, this.f4223J, eVar);
            aVar.f4221H = obj;
            return aVar;
        }
    }

    /* JADX INFO: renamed from: H.x$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ H.F f4230D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(H.F f6) {
            super(1);
            this.f4230D = f6;
        }

        public final void a(long j6) {
            this.f4230D.b(j6);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a(((p131n0.g) obj).v());
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: H.x$c */
    static final class c extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ H.F f4231D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(H.F f6) {
            super(0);
            this.f4231D = f6;
        }

        public final void a() {
            this.f4231D.c();
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: H.x$d */
    static final class d extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ H.F f4232D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(H.F f6) {
            super(0);
            this.f4232D = f6;
        }

        public final void a() {
            this.f4232D.onCancel();
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: H.x$e */
    static final class e extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ H.F f4233D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(H.F f6) {
            super(2);
            this.f4233D = f6;
        }

        public final void a(p251z0.B b6, long j6) {
            this.f4233D.e(j6);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a((p251z0.B) obj, ((p131n0.g) obj2).v());
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: H.x$f */
    static final class f extends p147o7.k implements p237x7.p {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        java.lang.Object f4234E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        int f4235F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f4236G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ H.F f4237H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(H.F f6, p127m7.e eVar) {
            super(2, eVar);
            this.f4237H = f6;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x005d A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:19:0x006b  */
        /* JADX WARN: Code duplicated, block: B:21:0x007f  */
        /* JADX WARN: Code duplicated, block: B:27:0x0089 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:29:0x0086 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005b -> B:17:0x005e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:29:0x0086
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = p137n7.b.g()
                int r1 = r12.f4235F
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r1 = r12.f4234E
                z0.B r1 = (p251z0.B) r1
                java.lang.Object r4 = r12.f4236G
                z0.c r4 = (p251z0.InterfaceC7367c) r4
                p087i7.x.b(r13)
                goto L5e
            L1a:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L22:
                java.lang.Object r1 = r12.f4236G
                z0.c r1 = (p251z0.InterfaceC7367c) r1
                p087i7.x.b(r13)
                goto L43
            L2a:
                p087i7.x.b(r13)
                java.lang.Object r13 = r12.f4236G
                r1 = r13
                z0.c r1 = (p251z0.InterfaceC7367c) r1
                r12.f4236G = r1
                r12.f4235F = r3
                r5 = 0
                r6 = 0
                r8 = 2
                r9 = 0
                r4 = r1
                r7 = r12
                java.lang.Object r13 = p230x.D.e(r4, r5, r6, r7, r8, r9)
                if (r13 != r0) goto L43
                return r0
            L43:
                z0.B r13 = (p251z0.B) r13
                H.F r4 = r12.f4237H
                long r5 = r13.h()
                r4.a(r5)
                r4 = r1
                r1 = r13
            L50:
                r12.f4236G = r4
                r12.f4234E = r1
                r12.f4235F = r2
                r13 = 0
                java.lang.Object r13 = p251z0.AbstractC7366b.a(r4, r13, r12, r3, r13)
                if (r13 != r0) goto L5e
                return r0
            L5e:
                z0.p r13 = (p251z0.C7380p) r13
                java.util.List r13 = r13.c()
                int r5 = r13.size()
                r6 = 0
            L69:
                if (r6 >= r5) goto L89
                java.lang.Object r7 = r13.get(r6)
                z0.B r7 = (p251z0.B) r7
                long r8 = r7.f()
                long r10 = r1.f()
                boolean r8 = p251z0.A.d(r8, r10)
                if (r8 == 0) goto L86
                boolean r7 = r7.i()
                if (r7 == 0) goto L86
                goto L50
            L86:
                int r6 = r6 + 1
                goto L69
            L89:
                H.F r13 = r12.f4237H
                r13.d()
                i7.M r13 = p087i7.M.f46721a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: H.AbstractC1231x.f.B(java.lang.Object):java.lang.Object");
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(p251z0.InterfaceC7367c interfaceC7367c, p127m7.e eVar) {
            return ((H.AbstractC1231x.f) x(interfaceC7367c, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            H.AbstractC1231x.f fVar = new H.AbstractC1231x.f(this.f4237H, eVar);
            fVar.f4236G = obj;
            return fVar;
        }
    }

    public static final java.lang.Object c(p251z0.K k6, H.F f6, p127m7.e eVar) {
        java.lang.Object objF = W8.O.f(new H.AbstractC1231x.a(k6, f6, null), eVar);
        return objF == p137n7.b.g() ? objF : p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object d(p251z0.K k6, H.F f6, p127m7.e eVar) {
        java.lang.Object objD = p230x.l.d(k6, new H.AbstractC1231x.b(f6), new H.AbstractC1231x.c(f6), new H.AbstractC1231x.d(f6), new H.AbstractC1231x.e(f6), eVar);
        return objD == p137n7.b.g() ? objD : p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object e(p251z0.K k6, H.F f6, p127m7.e eVar) {
        java.lang.Object objC = p230x.q.c(k6, new H.AbstractC1231x.f(f6, null), eVar);
        return objC == p137n7.b.g() ? objC : p087i7.M.f46721a;
    }
}
