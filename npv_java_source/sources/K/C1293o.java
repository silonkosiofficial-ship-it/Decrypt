package K;

/* JADX INFO: renamed from: K.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1293o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.concurrent.atomic.AtomicReference f5878a = new java.util.concurrent.atomic.AtomicReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V.InterfaceC1742q0 f5879b = V.J0.a(0.0f);

    /* JADX INFO: renamed from: K.o$a */
    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f5880G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f5881H;

        /* JADX INFO: renamed from: K.o$a$a, reason: collision with other inner class name */
        static final class C0144a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f5883G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ W8.InterfaceC1822z0 f5884H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ K.C1293o f5885I;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0144a(W8.InterfaceC1822z0 interfaceC1822z0, K.C1293o c1293o, p127m7.e eVar) {
                super(2, eVar);
                this.f5884H = interfaceC1822z0;
                this.f5885I = c1293o;
            }

            /* JADX WARN: Code duplicated, block: B:23:0x0049 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:26:0x0057 A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0055 -> B:21:0x003a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x0049
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = p137n7.b.g()
                    int r1 = r8.f5883G
                    r2 = 0
                    r3 = 500(0x1f4, double:2.47E-321)
                    r5 = 3
                    r6 = 2
                    r7 = 1
                    if (r1 == 0) goto L2a
                    if (r1 == r7) goto L26
                    if (r1 == r6) goto L22
                    if (r1 != r5) goto L1a
                    p087i7.x.b(r9)     // Catch: java.lang.Throwable -> L18
                    goto L3a
                L18:
                    r9 = move-exception
                    goto L58
                L1a:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L22:
                    p087i7.x.b(r9)     // Catch: java.lang.Throwable -> L18
                    goto L4a
                L26:
                    p087i7.x.b(r9)
                    goto L3a
                L2a:
                    p087i7.x.b(r9)
                    W8.z0 r9 = r8.f5884H
                    if (r9 == 0) goto L3a
                    r8.f5883G = r7
                    java.lang.Object r9 = W8.C0.g(r9, r8)
                    if (r9 != r0) goto L3a
                    return r0
                L3a:
                    K.o r9 = r8.f5885I     // Catch: java.lang.Throwable -> L18
                    r1 = 1065353216(0x3f800000, float:1.0)
                    K.C1293o.b(r9, r1)     // Catch: java.lang.Throwable -> L18
                    r8.f5883G = r6     // Catch: java.lang.Throwable -> L18
                    java.lang.Object r9 = W8.Y.a(r3, r8)     // Catch: java.lang.Throwable -> L18
                    if (r9 != r0) goto L4a
                    return r0
                L4a:
                    K.o r9 = r8.f5885I     // Catch: java.lang.Throwable -> L18
                    K.C1293o.b(r9, r2)     // Catch: java.lang.Throwable -> L18
                    r8.f5883G = r5     // Catch: java.lang.Throwable -> L18
                    java.lang.Object r9 = W8.Y.a(r3, r8)     // Catch: java.lang.Throwable -> L18
                    if (r9 != r0) goto L3a
                    return r0
                L58:
                    K.o r0 = r8.f5885I
                    K.C1293o.b(r0, r2)
                    throw r9
                */
                throw new UnsupportedOperationException("Method not decompiled: K.C1293o.a.C0144a.B(java.lang.Object):java.lang.Object");
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
                return ((K.C1293o.a.C0144a) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return new K.C1293o.a.C0144a(this.f5884H, this.f5885I, eVar);
            }
        }

        a(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            if (this.f5880G != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            return p147o7.b.a(p200u.AbstractC7162c0.a(K.C1293o.this.f5878a, null, W8.AbstractC1788i.d((W8.N) this.f5881H, null, null, new K.C1293o.a.C0144a((W8.InterfaceC1822z0) K.C1293o.this.f5878a.getAndSet(null), K.C1293o.this, null), 3, null)));
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((K.C1293o.a) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            K.C1293o.a aVar = K.C1293o.this.new a(eVar);
            aVar.f5881H = obj;
            return aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(float f6) {
        this.f5879b.h(f6);
    }

    public final float c() {
        return this.f5879b.b();
    }

    public final java.lang.Object e(p127m7.e eVar) {
        java.lang.Object objF = W8.O.f(new K.C1293o.a(null), eVar);
        return objF == p137n7.b.g() ? objF : p087i7.M.f46721a;
    }
}
