package E0;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F0.o0 f2093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final X.b f2094b = new X.b(new F0.C0911c[16], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X.b f2095c = new X.b(new E0.c[16], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final X.b f2096d = new X.b(new F0.J[16], 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final X.b f2097e = new X.b(new E0.c[16], 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f2098f;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        public final void a() {
            E0.f.this.e();
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            a();
            return p087i7.M.f46721a;
        }
    }

    public f(F0.o0 o0Var) {
        this.f2093a = o0Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX WARN: Code duplicated, block: B:14:0x004d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    /* JADX WARN: Code duplicated, block: B:18:0x0057  */
    /* JADX WARN: Code duplicated, block: B:20:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x002d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[LOOP:0: B:10:0x0034->B:58:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00c6 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [X.b] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [X.b] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004b -> B:8:0x002d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004e -> B:8:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final void c(androidx.compose.ui.d.c r13, E0.c r14, java.util.Set r15) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.f.c(androidx.compose.ui.d$c, E0.c, java.util.Set):void");
    }

    public final void a(F0.C0911c c0911c, E0.c cVar) {
        this.f2094b.d(c0911c);
        this.f2095c.d(cVar);
        b();
    }

    public final void b() {
        if (this.f2098f) {
            return;
        }
        this.f2098f = true;
        this.f2093a.x(new E0.f.a());
    }

    public final void d(F0.C0911c c0911c, E0.c cVar) {
        this.f2096d.d(F0.AbstractC0925k.m(c0911c));
        this.f2097e.d(cVar);
        b();
    }

    public final void e() {
        int i6 = 0;
        this.f2098f = false;
        java.util.HashSet hashSet = new java.util.HashSet();
        X.b bVar = this.f2096d;
        int iT = bVar.t();
        if (iT > 0) {
            java.lang.Object[] objArrS = bVar.s();
            int i10 = 0;
            do {
                F0.J j6 = (F0.J) objArrS[i10];
                E0.c cVar = (E0.c) this.f2097e.s()[i10];
                if (j6.k0().k().A1()) {
                    c(j6.k0().k(), cVar, hashSet);
                }
                i10++;
            } while (i10 < iT);
        }
        this.f2096d.j();
        this.f2097e.j();
        X.b bVar2 = this.f2094b;
        int iT2 = bVar2.t();
        if (iT2 > 0) {
            java.lang.Object[] objArrS2 = bVar2.s();
            do {
                F0.C0911c c0911c = (F0.C0911c) objArrS2[i6];
                E0.c cVar2 = (E0.c) this.f2095c.s()[i6];
                if (c0911c.A1()) {
                    c(c0911c, cVar2, hashSet);
                }
                i6++;
            } while (i6 < iT2);
        }
        this.f2094b.j();
        this.f2095c.j();
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((F0.C0911c) it.next()).Z1();
        }
    }

    public final void f(F0.C0911c c0911c, E0.c cVar) {
        this.f2094b.d(c0911c);
        this.f2095c.d(cVar);
        b();
    }
}
