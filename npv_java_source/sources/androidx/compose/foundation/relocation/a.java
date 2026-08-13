package androidx.compose.foundation.relocation;

/* JADX INFO: loaded from: classes.dex */
final class a implements E.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X.b f19449a = new X.b(new androidx.compose.foundation.relocation.e[16], 0);

    /* JADX INFO: renamed from: androidx.compose.foundation.relocation.a$a, reason: collision with other inner class name */
    static final class C0370a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f19450F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f19451G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f19452H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f19453I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        /* synthetic */ java.lang.Object f19454J;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        int f19456L;

        C0370a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f19454J = obj;
            this.f19456L |= Integer.MIN_VALUE;
            return androidx.compose.foundation.relocation.a.this.a(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        if (r8 >= r2) goto L22;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0064 -> B:20:0x0067). Please report as a decompilation issue!!! */
    @Override // E.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(p131n0.i r8, p127m7.e r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.relocation.a.C0370a
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.relocation.a$a r0 = (androidx.compose.foundation.relocation.a.C0370a) r0
            int r1 = r0.f19456L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19456L = r1
            goto L18
        L13:
            androidx.compose.foundation.relocation.a$a r0 = new androidx.compose.foundation.relocation.a$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f19454J
            java.lang.Object r1 = p137n7.b.g()
            int r2 = r0.f19456L
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r8 = r0.f19453I
            int r2 = r0.f19452H
            java.lang.Object r4 = r0.f19451G
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r5 = r0.f19450F
            n0.i r5 = (p131n0.i) r5
            p087i7.x.b(r9)
            r9 = r5
            goto L67
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            p087i7.x.b(r9)
            X.b r9 = r7.f19449a
            int r2 = r9.t()
            if (r2 <= 0) goto L6a
            java.lang.Object[] r9 = r9.s()
            r4 = 0
            r6 = r9
            r9 = r8
            r8 = r4
            r4 = r6
        L52:
            r5 = r4[r8]
            androidx.compose.foundation.relocation.e r5 = (androidx.compose.foundation.relocation.e) r5
            r0.f19450F = r9
            r0.f19451G = r4
            r0.f19452H = r2
            r0.f19453I = r8
            r0.f19456L = r3
            java.lang.Object r5 = E.e.a(r5, r9, r0)
            if (r5 != r1) goto L67
            return r1
        L67:
            int r8 = r8 + r3
            if (r8 < r2) goto L52
        L6a:
            i7.M r8 = p087i7.M.f46721a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.a.a(n0.i, m7.e):java.lang.Object");
    }

    public final X.b b() {
        return this.f19449a;
    }
}
