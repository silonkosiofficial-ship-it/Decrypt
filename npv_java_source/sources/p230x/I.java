package p230x;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final x.I.a f56424f = new x.I.a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f56425g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final p200u.C7183n f56426h = new p200u.C7183n(0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p200u.B0 f56427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f56428b = Long.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p200u.C7183n f56429c = f56426h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f56430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f56431e;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p200u.C7183n a() {
            return p230x.I.f56426h;
        }

        public final boolean b(float f6) {
            return java.lang.Math.abs(f6) < 0.01f;
        }
    }

    static final class b extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f56432F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f56433G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f56434H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        float f56435I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        /* synthetic */ java.lang.Object f56436J;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        int f56438L;

        b(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f56436J = obj;
            this.f56438L |= Integer.MIN_VALUE;
            return p230x.I.this.h(null, null, this);
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ float f56440E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ p237x7.l f56441F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(float f6, p237x7.l lVar) {
            super(1);
            this.f56440E = f6;
            this.f56441F = lVar;
        }

        public final void a(long j6) {
            if (p230x.I.this.f56428b == Long.MIN_VALUE) {
                p230x.I.this.f56428b = j6;
            }
            p200u.C7183n c7183n = new p200u.C7183n(p230x.I.this.i());
            long jE = this.f56440E == 0.0f ? p230x.I.this.f56427a.e(new p200u.C7183n(p230x.I.this.i()), p230x.I.f56424f.a(), p230x.I.this.f56429c) : A7.a.f((j6 - p230x.I.this.f56428b) / this.f56440E);
            float f6 = ((p200u.C7183n) p230x.I.this.f56427a.c(jE, c7183n, p230x.I.f56424f.a(), p230x.I.this.f56429c)).f();
            p230x.I i6 = p230x.I.this;
            i6.f56429c = (p200u.C7183n) i6.f56427a.b(jE, c7183n, p230x.I.f56424f.a(), p230x.I.this.f56429c);
            p230x.I.this.f56428b = j6;
            float fI = p230x.I.this.i() - f6;
            p230x.I.this.j(f6);
            this.f56441F.l(java.lang.Float.valueOf(fI));
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a(((java.lang.Number) obj).longValue());
            return p087i7.M.f46721a;
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p237x7.l f56443E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(p237x7.l lVar) {
            super(1);
            this.f56443E = lVar;
        }

        public final void a(long j6) {
            float fI = p230x.I.this.i();
            p230x.I.this.j(0.0f);
            this.f56443E.l(java.lang.Float.valueOf(fI));
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a(((java.lang.Number) obj).longValue());
            return p087i7.M.f46721a;
        }
    }

    public I(p200u.InterfaceC7175j interfaceC7175j) {
        this.f56427a = interfaceC7175j.a(p200u.z0.i(p247y7.C7344m.f57303a));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0083 A[Catch: all -> 0x00af, PHI: r0 r2 r13 r14 r15
  0x0083: PHI (r0v9 ??) = (r0v3 ??), (r0v15 ??) binds: [B:30:0x007c, B:38:0x00a8] A[DONT_GENERATE, DONT_INLINE]
  0x0083: PHI (r2v4 x.I$b) = (r2v2 x.I$b), (r2v5 x.I$b) binds: [B:30:0x007c, B:38:0x00a8] A[DONT_GENERATE, DONT_INLINE]
  0x0083: PHI (r13v6 float) = (r13v4 float), (r13v7 float) binds: [B:30:0x007c, B:38:0x00a8] A[DONT_GENERATE, DONT_INLINE]
  0x0083: PHI (r14v8 x7.l) = (r14v5 x7.l), (r14v9 x7.l) binds: [B:30:0x007c, B:38:0x00a8] A[DONT_GENERATE, DONT_INLINE]
  0x0083: PHI (r15v16 x.I) = (r15v10 x.I), (r15v17 x.I) binds: [B:30:0x007c, B:38:0x00a8] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {all -> 0x00af, blocks: (B:36:0x00a3, B:31:0x0083, B:33:0x008d), top: B:59:0x00a3 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x008d A[Catch: all -> 0x00af, TryCatch #2 {all -> 0x00af, blocks: (B:36:0x00a3, B:31:0x0083, B:33:0x008d), top: B:59:0x00a3 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [x7.a] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v11, types: [x7.a] */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [x7.a] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [x.I] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2, types: [x.I] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a0 -> B:59:0x00a3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object h(p237x7.l r13, p237x7.a r14, p127m7.e r15) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p230x.I.h(x7.l, x7.a, m7.e):java.lang.Object");
    }

    public final float i() {
        return this.f56431e;
    }

    public final void j(float f6) {
        this.f56431e = f6;
    }
}
