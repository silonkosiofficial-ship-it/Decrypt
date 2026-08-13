package Z8;

/* JADX INFO: renamed from: Z8.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class AbstractC1873j {

    /* JADX INFO: renamed from: Z8.j$a */
    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f16838F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f16839G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f16840H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        boolean f16841I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        /* synthetic */ java.lang.Object f16842J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        int f16843K;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f16842J = obj;
            this.f16843K |= Integer.MIN_VALUE;
            return Z8.AbstractC1873j.d(null, null, false, this);
        }
    }

    public static final Z8.InterfaceC1869f b(Y8.B b6) {
        return new Z8.C1866c(b6, true, null, 0, null, 28, null);
    }

    public static final java.lang.Object c(Z8.InterfaceC1870g interfaceC1870g, Y8.B b6, p127m7.e eVar) {
        java.lang.Object objD = d(interfaceC1870g, b6, true, eVar);
        return objD == p137n7.b.g() ? objD : p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x0072 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0036, B:24:0x0062, B:28:0x0077, B:30:0x007f, B:20:0x0054, B:23:0x005e), top: B:42:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0093 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0091 -> B:14:0x0039). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(Z8.InterfaceC1870g r6, Y8.B r7, boolean r8, p127m7.e r9) {
        /*
            boolean r0 = r9 instanceof Z8.AbstractC1873j.a
            if (r0 == 0) goto L13
            r0 = r9
            Z8.j$a r0 = (Z8.AbstractC1873j.a) r0
            int r1 = r0.f16843K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16843K = r1
            goto L18
        L13:
            Z8.j$a r0 = new Z8.j$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f16842J
            java.lang.Object r1 = p137n7.b.g()
            int r2 = r0.f16843K
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L58
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            boolean r8 = r0.f16841I
            java.lang.Object r6 = r0.f16840H
            Y8.l r6 = (Y8.l) r6
            java.lang.Object r7 = r0.f16839G
            Y8.B r7 = (Y8.B) r7
            java.lang.Object r2 = r0.f16838F
            Z8.g r2 = (Z8.InterfaceC1870g) r2
            p087i7.x.b(r9)     // Catch: java.lang.Throwable -> L3c
        L39:
            r9 = r6
            r6 = r2
            goto L62
        L3c:
            r6 = move-exception
            goto L9d
        L3e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L46:
            boolean r8 = r0.f16841I
            java.lang.Object r6 = r0.f16840H
            Y8.l r6 = (Y8.l) r6
            java.lang.Object r7 = r0.f16839G
            Y8.B r7 = (Y8.B) r7
            java.lang.Object r2 = r0.f16838F
            Z8.g r2 = (Z8.InterfaceC1870g) r2
            p087i7.x.b(r9)     // Catch: java.lang.Throwable -> L3c
            goto L77
        L58:
            p087i7.x.b(r9)
            Z8.AbstractC1871h.s(r6)
            Y8.l r9 = r7.iterator()     // Catch: java.lang.Throwable -> L3c
        L62:
            r0.f16838F = r6     // Catch: java.lang.Throwable -> L3c
            r0.f16839G = r7     // Catch: java.lang.Throwable -> L3c
            r0.f16840H = r9     // Catch: java.lang.Throwable -> L3c
            r0.f16841I = r8     // Catch: java.lang.Throwable -> L3c
            r0.f16843K = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r9.a(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 != r1) goto L73
            return r1
        L73:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L77:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3c
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L94
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L3c
            r0.f16838F = r2     // Catch: java.lang.Throwable -> L3c
            r0.f16839G = r7     // Catch: java.lang.Throwable -> L3c
            r0.f16840H = r6     // Catch: java.lang.Throwable -> L3c
            r0.f16841I = r8     // Catch: java.lang.Throwable -> L3c
            r0.f16843K = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r9 = r2.a(r9, r0)     // Catch: java.lang.Throwable -> L3c
            if (r9 != r1) goto L39
            return r1
        L94:
            if (r8 == 0) goto L9a
            r6 = 0
            Y8.q.a(r7, r6)
        L9a:
            i7.M r6 = p087i7.M.f46721a
            return r6
        L9d:
            throw r6     // Catch: java.lang.Throwable -> L9e
        L9e:
            r9 = move-exception
            if (r8 == 0) goto La4
            Y8.q.a(r7, r6)
        La4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Z8.AbstractC1873j.d(Z8.g, Y8.B, boolean, m7.e):java.lang.Object");
    }

    public static final Z8.InterfaceC1869f e(Y8.B b6) {
        return new Z8.C1866c(b6, false, null, 0, null, 28, null);
    }
}
