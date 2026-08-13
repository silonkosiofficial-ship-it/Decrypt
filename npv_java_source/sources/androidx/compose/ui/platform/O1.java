package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public abstract class O1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.Map f19909a = new java.util.LinkedHashMap();

    public static final class a implements android.view.View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ android.view.View f19910C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ V.U0 f19911D;

        a(android.view.View view, V.U0 u6) {
            this.f19910C = view;
            this.f19911D = u6;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View view) {
            this.f19910C.removeOnAttachStateChangeListener(this);
            this.f19911D.Y();
        }
    }

    public static final class b implements androidx.lifecycle.InterfaceC2083o {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ W8.N f19912C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ V.E0 f19913D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ V.U0 f19914E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p247y7.O f19915F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final /* synthetic */ android.view.View f19916G;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f19917a;

            static {
                int[] iArr = new int[androidx.lifecycle.AbstractC2079k.a.values().length];
                try {
                    iArr[androidx.lifecycle.AbstractC2079k.a.ON_CREATE.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[androidx.lifecycle.AbstractC2079k.a.ON_START.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[androidx.lifecycle.AbstractC2079k.a.ON_STOP.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[androidx.lifecycle.AbstractC2079k.a.ON_DESTROY.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[androidx.lifecycle.AbstractC2079k.a.ON_PAUSE.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                try {
                    iArr[androidx.lifecycle.AbstractC2079k.a.ON_RESUME.ordinal()] = 6;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                try {
                    iArr[androidx.lifecycle.AbstractC2079k.a.ON_ANY.ordinal()] = 7;
                } catch (java.lang.NoSuchFieldError unused7) {
                }
                f19917a = iArr;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.platform.O1$b$b, reason: collision with other inner class name */
        static final class C0378b extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f19918G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            private /* synthetic */ java.lang.Object f19919H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ p247y7.O f19920I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            final /* synthetic */ V.U0 f19921J;

            /* JADX INFO: renamed from: K, reason: collision with root package name */
            final /* synthetic */ androidx.lifecycle.r f19922K;

            /* JADX INFO: renamed from: L, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.O1.b f19923L;

            /* JADX INFO: renamed from: M, reason: collision with root package name */
            final /* synthetic */ android.view.View f19924M;

            /* JADX INFO: renamed from: androidx.compose.ui.platform.O1$b$b$a */
            static final class a extends p147o7.l implements p237x7.p {

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                int f19925G;

                /* JADX INFO: renamed from: H, reason: collision with root package name */
                final /* synthetic */ Z8.N f19926H;

                /* JADX INFO: renamed from: I, reason: collision with root package name */
                final /* synthetic */ androidx.compose.ui.platform.L0 f19927I;

                /* JADX INFO: renamed from: androidx.compose.ui.platform.O1$b$b$a$a, reason: collision with other inner class name */
                static final class C0379a implements Z8.InterfaceC1870g {

                    /* JADX INFO: renamed from: C, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.ui.platform.L0 f19928C;

                    C0379a(androidx.compose.ui.platform.L0 l6) {
                        this.f19928C = l6;
                    }

                    @Override // Z8.InterfaceC1870g
                    public /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
                        return b(((java.lang.Number) obj).floatValue(), eVar);
                    }

                    public final java.lang.Object b(float f6, p127m7.e eVar) {
                        this.f19928C.a(f6);
                        return p087i7.M.f46721a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(Z8.N n6, androidx.compose.ui.platform.L0 l6, p127m7.e eVar) {
                    super(2, eVar);
                    this.f19926H = n6;
                    this.f19927I = l6;
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    java.lang.Object objG = p137n7.b.g();
                    int i6 = this.f19925G;
                    if (i6 == 0) {
                        p087i7.x.b(obj);
                        Z8.N n6 = this.f19926H;
                        androidx.compose.ui.platform.O1.b.C0378b.a.C0379a c0379a = new androidx.compose.ui.platform.O1.b.C0378b.a.C0379a(this.f19927I);
                        this.f19925G = 1;
                        if (n6.b(c0379a, this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i6 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p087i7.x.b(obj);
                    }
                    throw new p087i7.C6665k();
                }

                @Override // p237x7.p
                /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
                    return ((androidx.compose.ui.platform.O1.b.C0378b.a) x(n6, eVar)).B(p087i7.M.f46721a);
                }

                @Override // p147o7.a
                public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                    return new androidx.compose.ui.platform.O1.b.C0378b.a(this.f19926H, this.f19927I, eVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0378b(p247y7.O o6, V.U0 u6, androidx.lifecycle.r rVar, androidx.compose.ui.platform.O1.b bVar, android.view.View view, p127m7.e eVar) {
                super(2, eVar);
                this.f19920I = o6;
                this.f19921J = u6;
                this.f19922K = rVar;
                this.f19923L = bVar;
                this.f19924M = view;
            }

            /* JADX WARN: Code duplicated, block: B:25:0x006c  */
            /* JADX WARN: Code duplicated, block: B:31:0x0083  */
            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) throws java.lang.Throwable {
                W8.InterfaceC1822z0 interfaceC1822z0;
                W8.InterfaceC1822z0 interfaceC1822z0D;
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f19918G;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC1822z0 = (W8.InterfaceC1822z0) this.f19919H;
                    try {
                        p087i7.x.b(obj);
                        if (interfaceC1822z0 != null) {
                            W8.InterfaceC1822z0.a.a(interfaceC1822z0, null, 1, null);
                        }
                        this.f19922K.u().d(this.f19923L);
                        return p087i7.M.f46721a;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        if (interfaceC1822z0 != null) {
                            W8.InterfaceC1822z0.a.a(interfaceC1822z0, null, 1, null);
                        }
                        this.f19922K.u().d(this.f19923L);
                        throw th;
                    }
                }
                p087i7.x.b(obj);
                W8.N n6 = (W8.N) this.f19919H;
                try {
                    androidx.compose.ui.platform.L0 l6 = (androidx.compose.ui.platform.L0) this.f19920I.f57254C;
                    if (l6 != null) {
                        Z8.N nE = androidx.compose.ui.platform.O1.e(this.f19924M.getContext().getApplicationContext());
                        l6.a(((java.lang.Number) nE.getValue()).floatValue());
                        interfaceC1822z0D = W8.AbstractC1788i.d(n6, null, null, new androidx.compose.ui.platform.O1.b.C0378b.a(nE, l6, null), 3, null);
                    } else {
                        interfaceC1822z0D = null;
                    }
                    try {
                        V.U0 u6 = this.f19921J;
                        this.f19919H = interfaceC1822z0D;
                        this.f19918G = 1;
                        if (u6.z0(this) == objG) {
                            return objG;
                        }
                        interfaceC1822z0 = interfaceC1822z0D;
                        if (interfaceC1822z0 != null) {
                            W8.InterfaceC1822z0.a.a(interfaceC1822z0, null, 1, null);
                        }
                        this.f19922K.u().d(this.f19923L);
                        return p087i7.M.f46721a;
                    } catch (java.lang.Throwable th2) {
                        interfaceC1822z0 = interfaceC1822z0D;
                        th = th2;
                        if (interfaceC1822z0 != null) {
                            W8.InterfaceC1822z0.a.a(interfaceC1822z0, null, 1, null);
                        }
                        this.f19922K.u().d(this.f19923L);
                        throw th;
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    interfaceC1822z0 = null;
                }
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
                return ((androidx.compose.ui.platform.O1.b.C0378b) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                androidx.compose.ui.platform.O1.b.C0378b c0378b = new androidx.compose.ui.platform.O1.b.C0378b(this.f19920I, this.f19921J, this.f19922K, this.f19923L, this.f19924M, eVar);
                c0378b.f19919H = obj;
                return c0378b;
            }
        }

        b(W8.N n6, V.E0 e6, V.U0 u6, p247y7.O o6, android.view.View view) {
            this.f19912C = n6;
            this.f19913D = e6;
            this.f19914E = u6;
            this.f19915F = o6;
            this.f19916G = view;
        }

        @Override // androidx.lifecycle.InterfaceC2083o
        public void i(androidx.lifecycle.r rVar, androidx.lifecycle.AbstractC2079k.a aVar) {
            int i6 = androidx.compose.ui.platform.O1.b.a.f19917a[aVar.ordinal()];
            if (i6 == 1) {
                W8.AbstractC1788i.d(this.f19912C, null, W8.P.UNDISPATCHED, new androidx.compose.ui.platform.O1.b.C0378b(this.f19915F, this.f19914E, rVar, this, this.f19916G, null), 1, null);
                return;
            }
            if (i6 == 2) {
                V.E0 e6 = this.f19913D;
                if (e6 != null) {
                    e6.b();
                }
                this.f19914E.y0();
                return;
            }
            if (i6 == 3) {
                this.f19914E.l0();
            } else {
                if (i6 != 4) {
                    return;
                }
                this.f19914E.Y();
            }
        }
    }

    static final class c extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f19929G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f19930H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f19931I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ android.content.ContentResolver f19932J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ android.net.Uri f19933K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.O1.d f19934L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        final /* synthetic */ Y8.j f19935M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        final /* synthetic */ android.content.Context f19936N;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(android.content.ContentResolver contentResolver, android.net.Uri uri, androidx.compose.ui.platform.O1.d dVar, Y8.j jVar, android.content.Context context, p127m7.e eVar) {
            super(2, eVar);
            this.f19932J = contentResolver;
            this.f19933K = uri;
            this.f19934L = dVar;
            this.f19935M = jVar;
            this.f19936N = context;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0054 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:21:0x0055  */
        /* JADX WARN: Code duplicated, block: B:24:0x0060 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0016, B:18:0x0048, B:22:0x0058, B:24:0x0060, B:14:0x002d, B:17:0x0042), top: B:31:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:26:0x0081 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x0082  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007f -> B:8:0x0019). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = p137n7.b.g()
                int r1 = r8.f19930H
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L31
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r8.f19929G
                Y8.l r1 = (Y8.l) r1
                java.lang.Object r4 = r8.f19931I
                Z8.g r4 = (Z8.InterfaceC1870g) r4
                p087i7.x.b(r9)     // Catch: java.lang.Throwable -> L1b
            L19:
                r9 = r4
                goto L48
            L1b:
                r9 = move-exception
                goto L8c
            L1d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L25:
                java.lang.Object r1 = r8.f19929G
                Y8.l r1 = (Y8.l) r1
                java.lang.Object r4 = r8.f19931I
                Z8.g r4 = (Z8.InterfaceC1870g) r4
                p087i7.x.b(r9)     // Catch: java.lang.Throwable -> L1b
                goto L58
            L31:
                p087i7.x.b(r9)
                java.lang.Object r9 = r8.f19931I
                Z8.g r9 = (Z8.InterfaceC1870g) r9
                android.content.ContentResolver r1 = r8.f19932J
                android.net.Uri r4 = r8.f19933K
                r5 = 0
                androidx.compose.ui.platform.O1$d r6 = r8.f19934L
                r1.registerContentObserver(r4, r5, r6)
                Y8.j r1 = r8.f19935M     // Catch: java.lang.Throwable -> L1b
                Y8.l r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1b
            L48:
                r8.f19931I = r9     // Catch: java.lang.Throwable -> L1b
                r8.f19929G = r1     // Catch: java.lang.Throwable -> L1b
                r8.f19930H = r3     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r4 = r1.a(r8)     // Catch: java.lang.Throwable -> L1b
                if (r4 != r0) goto L55
                return r0
            L55:
                r7 = r4
                r4 = r9
                r9 = r7
            L58:
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L1b
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L1b
                if (r9 == 0) goto L82
                r1.next()     // Catch: java.lang.Throwable -> L1b
                android.content.Context r9 = r8.f19936N     // Catch: java.lang.Throwable -> L1b
                android.content.ContentResolver r9 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L1b
                java.lang.String r5 = "animator_duration_scale"
                r6 = 1065353216(0x3f800000, float:1.0)
                float r9 = android.provider.Settings.Global.getFloat(r9, r5, r6)     // Catch: java.lang.Throwable -> L1b
                java.lang.Float r9 = p147o7.b.b(r9)     // Catch: java.lang.Throwable -> L1b
                r8.f19931I = r4     // Catch: java.lang.Throwable -> L1b
                r8.f19929G = r1     // Catch: java.lang.Throwable -> L1b
                r8.f19930H = r2     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r9 = r4.a(r9, r8)     // Catch: java.lang.Throwable -> L1b
                if (r9 != r0) goto L19
                return r0
            L82:
                android.content.ContentResolver r9 = r8.f19932J
                androidx.compose.ui.platform.O1$d r0 = r8.f19934L
                r9.unregisterContentObserver(r0)
                i7.M r9 = p087i7.M.f46721a
                return r9
            L8c:
                android.content.ContentResolver r0 = r8.f19932J
                androidx.compose.ui.platform.O1$d r1 = r8.f19934L
                r0.unregisterContentObserver(r1)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.O1.c.B(java.lang.Object):java.lang.Object");
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            return ((androidx.compose.ui.platform.O1.c) x(interfaceC1870g, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            androidx.compose.ui.platform.O1.c cVar = new androidx.compose.ui.platform.O1.c(this.f19932J, this.f19933K, this.f19934L, this.f19935M, this.f19936N, eVar);
            cVar.f19931I = obj;
            return cVar;
        }
    }

    public static final class d extends android.database.ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y8.j f19937a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Y8.j jVar, android.os.Handler handler) {
            super(handler);
            this.f19937a = jVar;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z6, android.net.Uri uri) {
            this.f19937a.j(p087i7.M.f46721a);
        }
    }

    public static final V.U0 b(android.view.View view, p127m7.i iVar, androidx.lifecycle.AbstractC2079k abstractC2079k) {
        V.E0 e6;
        if (iVar.i(p127m7.f.f51196A) == null || iVar.i(V.InterfaceC1723j0.f14901f) == null) {
            iVar = androidx.compose.ui.platform.X.f20045O.a().o0(iVar);
        }
        V.InterfaceC1723j0 interfaceC1723j0 = (V.InterfaceC1723j0) iVar.i(V.InterfaceC1723j0.f14901f);
        if (interfaceC1723j0 != null) {
            V.E0 e10 = new V.E0(interfaceC1723j0);
            e10.a();
            e6 = e10;
        } else {
            e6 = null;
        }
        p247y7.O o6 = new p247y7.O();
        p127m7.i l6 = (p071h0.k) iVar.i(p071h0.k.f45803y);
        if (l6 == null) {
            l6 = new androidx.compose.ui.platform.L0();
            o6.f57254C = l6;
        }
        p127m7.i iVarO0 = iVar.o0(e6 != null ? e6 : p127m7.j.f51198C).o0(l6);
        V.U0 u6 = new V.U0(iVarO0);
        u6.l0();
        W8.N nA = W8.O.a(iVarO0);
        if (abstractC2079k == null) {
            androidx.lifecycle.r rVarA = androidx.lifecycle.Z.a(view);
            abstractC2079k = rVarA != null ? rVarA.u() : null;
        }
        if (abstractC2079k != null) {
            view.addOnAttachStateChangeListener(new androidx.compose.ui.platform.O1.a(view, u6));
            abstractC2079k.a(new androidx.compose.ui.platform.O1.b(nA, e6, u6, o6, view));
            return u6;
        }
        C0.a.c("ViewTreeLifecycleOwner not found from " + view);
        throw new p087i7.C6665k();
    }

    public static /* synthetic */ V.U0 c(android.view.View view, p127m7.i iVar, androidx.lifecycle.AbstractC2079k abstractC2079k, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            iVar = p127m7.j.f51198C;
        }
        if ((i6 & 2) != 0) {
            abstractC2079k = null;
        }
        return b(view, iVar, abstractC2079k);
    }

    public static final V.AbstractC1744s d(android.view.View view) {
        V.AbstractC1744s abstractC1744sF = f(view);
        if (abstractC1744sF != null) {
            return abstractC1744sF;
        }
        for (android.view.ViewParent parent = view.getParent(); abstractC1744sF == null && (parent instanceof android.view.View); parent = parent.getParent()) {
            abstractC1744sF = f((android.view.View) parent);
        }
        return abstractC1744sF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Z8.N e(android.content.Context context) {
        Z8.N n6;
        java.util.Map map = f19909a;
        synchronized (map) {
            try {
                java.lang.Object objL = map.get(context);
                if (objL == null) {
                    android.content.ContentResolver contentResolver = context.getContentResolver();
                    android.net.Uri uriFor = android.provider.Settings.Global.getUriFor("animator_duration_scale");
                    Y8.j jVarB = Y8.m.b(-1, null, null, 6, null);
                    objL = Z8.AbstractC1871h.L(Z8.AbstractC1871h.x(new androidx.compose.ui.platform.O1.c(contentResolver, uriFor, new androidx.compose.ui.platform.O1.d(jVarB, androidx.core.os.h.a(android.os.Looper.getMainLooper())), jVarB, context, null)), W8.O.b(), Z8.I.a.b(Z8.I.f16761a, 0L, 0L, 3, null), java.lang.Float.valueOf(android.provider.Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    map.put(context, objL);
                }
                n6 = (Z8.N) objL;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return n6;
    }

    public static final V.AbstractC1744s f(android.view.View view) {
        java.lang.Object tag = view.getTag(p071h0.l.f45811G);
        if (tag instanceof V.AbstractC1744s) {
            return (V.AbstractC1744s) tag;
        }
        return null;
    }

    private static final android.view.View g(android.view.View view) {
        java.lang.Object parent = view.getParent();
        while (parent instanceof android.view.View) {
            android.view.View view2 = (android.view.View) parent;
            if (view2.getId() == 16908290) {
                return view;
            }
            parent = view2.getParent();
            view = view2;
        }
        return view;
    }

    public static final V.U0 h(android.view.View view) {
        if (!view.isAttachedToWindow()) {
            C0.a.b("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        android.view.View viewG = g(view);
        V.AbstractC1744s abstractC1744sF = f(viewG);
        if (abstractC1744sF == null) {
            return androidx.compose.ui.platform.N1.f19902a.a(viewG);
        }
        if (abstractC1744sF instanceof V.U0) {
            return (V.U0) abstractC1744sF;
        }
        throw new java.lang.IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer".toString());
    }

    public static final void i(android.view.View view, V.AbstractC1744s abstractC1744s) {
        view.setTag(p071h0.l.f45811G, abstractC1744s);
    }
}
