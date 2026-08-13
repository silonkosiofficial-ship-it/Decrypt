package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1987y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.compose.ui.platform.C1987y0 f20426a = new androidx.compose.ui.platform.C1987y0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicBoolean f20427b = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicBoolean f20428c = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f20429d = 8;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.y0$a */
    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f20430G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f20431H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f20432I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ Y8.j f20433J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Y8.j jVar, p127m7.e eVar) {
            super(2, eVar);
            this.f20433J = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0037 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:19:0x0040 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:6:0x0013, B:17:0x0038, B:19:0x0040, B:14:0x002b, B:20:0x0054, B:13:0x0026), top: B:27:0x0007 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0035 -> B:17:0x0038). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p137n7.b.g()
                int r1 = r5.f20432I
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r1 = r5.f20431H
                Y8.l r1 = (Y8.l) r1
                java.lang.Object r3 = r5.f20430G
                Y8.B r3 = (Y8.B) r3
                p087i7.x.b(r6)     // Catch: java.lang.Throwable -> L17
                goto L38
            L17:
                r6 = move-exception
                goto L5d
            L19:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L21:
                p087i7.x.b(r6)
                Y8.j r3 = r5.f20433J
                Y8.l r6 = r3.iterator()     // Catch: java.lang.Throwable -> L17
                r1 = r6
            L2b:
                r5.f20430G = r3     // Catch: java.lang.Throwable -> L17
                r5.f20431H = r1     // Catch: java.lang.Throwable -> L17
                r5.f20432I = r2     // Catch: java.lang.Throwable -> L17
                java.lang.Object r6 = r1.a(r5)     // Catch: java.lang.Throwable -> L17
                if (r6 != r0) goto L38
                return r0
            L38:
                java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L17
                boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L17
                if (r6 == 0) goto L54
                java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L17
                i7.M r6 = (p087i7.M) r6     // Catch: java.lang.Throwable -> L17
                java.util.concurrent.atomic.AtomicBoolean r6 = androidx.compose.ui.platform.C1987y0.a()     // Catch: java.lang.Throwable -> L17
                r4 = 0
                r6.set(r4)     // Catch: java.lang.Throwable -> L17
                f0.k$a r6 = p051f0.k.f44821e     // Catch: java.lang.Throwable -> L17
                r6.n()     // Catch: java.lang.Throwable -> L17
                goto L2b
            L54:
                i7.M r6 = p087i7.M.f46721a     // Catch: java.lang.Throwable -> L17
                r6 = 0
                Y8.q.a(r3, r6)
                i7.M r6 = p087i7.M.f46721a
                return r6
            L5d:
                throw r6     // Catch: java.lang.Throwable -> L5e
            L5e:
                r0 = move-exception
                Y8.q.a(r3, r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C1987y0.a.B(java.lang.Object):java.lang.Object");
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((androidx.compose.ui.platform.C1987y0.a) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new androidx.compose.ui.platform.C1987y0.a(this.f20433J, eVar);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.y0$b */
    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ Y8.j f20434D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Y8.j jVar) {
            super(1);
            this.f20434D = jVar;
        }

        public final void a(java.lang.Object obj) {
            if (androidx.compose.ui.platform.C1987y0.f20428c.compareAndSet(false, true)) {
                this.f20434D.j(p087i7.M.f46721a);
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a(obj);
            return p087i7.M.f46721a;
        }
    }

    private C1987y0() {
    }

    public final void b() {
        if (f20427b.compareAndSet(false, true)) {
            Y8.j jVarB = Y8.m.b(1, null, null, 6, null);
            W8.AbstractC1788i.d(W8.O.a(androidx.compose.ui.platform.X.f20045O.b()), null, null, new androidx.compose.ui.platform.C1987y0.a(jVarB, null), 3, null);
            p051f0.k.f44821e.k(new androidx.compose.ui.platform.C1987y0.b(jVarB));
        }
    }
}
