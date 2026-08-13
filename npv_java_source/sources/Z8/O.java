package Z8;

/* JADX INFO: loaded from: classes2.dex */
final class O extends p009a9.AbstractC1885b implements Z8.y, Z8.InterfaceC1869f, p009a9.q {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f16781H = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(Z8.O.class, java.lang.Object.class, "_state$volatile");

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f16782G;
    private volatile /* synthetic */ java.lang.Object _state$volatile;

    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f16783F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f16784G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f16785H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        java.lang.Object f16786I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        java.lang.Object f16787J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        /* synthetic */ java.lang.Object f16788K;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        int f16790M;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f16788K = obj;
            this.f16790M |= Integer.MIN_VALUE;
            return Z8.O.this.b(null, this);
        }
    }

    public O(java.lang.Object obj) {
        this._state$volatile = obj;
    }

    private final boolean t(java.lang.Object obj, java.lang.Object obj2) {
        int i6;
        p009a9.d[] dVarArrO;
        synchronized (this) {
            java.lang.Object obj3 = f16781H.get(this);
            if (obj != null && !p247y7.AbstractC7350t.b(obj3, obj)) {
                return false;
            }
            if (p247y7.AbstractC7350t.b(obj3, obj2)) {
                return true;
            }
            f16781H.set(this, obj2);
            int i10 = this.f16782G;
            if ((i10 & 1) != 0) {
                this.f16782G = i10 + 2;
                return true;
            }
            int i11 = i10 + 1;
            this.f16782G = i11;
            p009a9.d[] dVarArrO2 = o();
            p087i7.M m6 = p087i7.M.f46721a;
            while (true) {
                Z8.Q[] qArr = (Z8.Q[]) dVarArrO2;
                if (qArr != null) {
                    for (Z8.Q q6 : qArr) {
                        if (q6 != null) {
                            q6.g();
                        }
                    }
                }
                synchronized (this) {
                    i6 = this.f16782G;
                    if (i6 == i11) {
                        this.f16782G = i11 + 1;
                        return true;
                    }
                    dVarArrO = o();
                    p087i7.M m10 = p087i7.M.f46721a;
                }
                dVarArrO2 = dVarArrO;
                i11 = i6;
            }
        }
    }

    @Override // Z8.x, Z8.InterfaceC1870g
    public java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
        setValue(obj);
        return p087i7.M.f46721a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b5 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ab, B:38:0x00b5, B:40:0x00ba, B:50:0x00db, B:52:0x00e1, B:42:0x00c0, B:46:0x00c7, B:21:0x0060, B:24:0x0073, B:35:0x009c), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ba A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ab, B:38:0x00b5, B:40:0x00ba, B:50:0x00db, B:52:0x00e1, B:42:0x00c0, B:46:0x00c7, B:21:0x0060, B:24:0x0073, B:35:0x009c), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c0 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ab, B:38:0x00b5, B:40:0x00ba, B:50:0x00db, B:52:0x00e1, B:42:0x00c0, B:46:0x00c7, B:21:0x0060, B:24:0x0073, B:35:0x009c), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x00da  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e1 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ab, B:38:0x00b5, B:40:0x00ba, B:50:0x00db, B:52:0x00e1, B:42:0x00c0, B:46:0x00c7, B:21:0x0060, B:24:0x0073, B:35:0x009c), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [a9.d] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6, types: [Z8.Q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [a9.b] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00df -> B:36:0x00ab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00f1 -> B:36:0x00ab). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:40:0x00ba
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // Z8.C, Z8.InterfaceC1869f
    public java.lang.Object b(Z8.InterfaceC1870g r11, p127m7.e r12) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z8.O.b(Z8.g, m7.e):java.lang.Object");
    }

    @Override // Z8.C
    public java.util.List c() {
        return p097j7.AbstractC6879v.e(getValue());
    }

    @Override // p009a9.q
    public Z8.InterfaceC1869f d(p127m7.i iVar, int i6, Y8.EnumC1863d enumC1863d) {
        return Z8.P.d(this, iVar, i6, enumC1863d);
    }

    @Override // Z8.y
    public boolean g(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            obj = p009a9.t.f17223a;
        }
        if (obj2 == null) {
            obj2 = p009a9.t.f17223a;
        }
        return t(obj, obj2);
    }

    @Override // Z8.y, Z8.N
    public java.lang.Object getValue() {
        p019b9.D d6 = p009a9.t.f17223a;
        java.lang.Object obj = f16781H.get(this);
        if (obj == d6) {
            return null;
        }
        return obj;
    }

    @Override // Z8.x
    public void m() {
        throw new java.lang.UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // Z8.x
    public boolean n(java.lang.Object obj) {
        setValue(obj);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p009a9.AbstractC1885b
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Z8.Q i() {
        return new Z8.Q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p009a9.AbstractC1885b
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Z8.Q[] j(int i6) {
        return new Z8.Q[i6];
    }

    @Override // Z8.y
    public void setValue(java.lang.Object obj) {
        if (obj == null) {
            obj = p009a9.t.f17223a;
        }
        t(null, obj);
    }
}
