package p149o9;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements p149o9.h {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p149o9.q f52567C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p149o9.a f52568D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private p149o9.k f52569E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f52570F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f52571G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private long f52572H;

    public f(p149o9.q qVar) {
        p247y7.AbstractC7350t.f(qVar, "upstream");
        this.f52567C = qVar;
        p149o9.a aVarD = qVar.d();
        this.f52568D = aVarD;
        this.f52569E = aVarD.o();
        p149o9.k kVarO = aVarD.o();
        this.f52570F = kVarO != null ? kVarO.f() : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r3 == r4.f()) goto L15;
     */
    @Override // p149o9.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long I0(p149o9.a r7, long r8) {
        /*
            r6 = this;
            java.lang.String r0 = "sink"
            p247y7.AbstractC7350t.f(r7, r0)
            boolean r0 = r6.f52571G
            r0 = r0 ^ 1
            if (r0 == 0) goto Lae
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 < 0) goto L8e
            o9.k r3 = r6.f52569E
            if (r3 == 0) goto L3b
            o9.a r4 = r6.f52568D
            o9.k r4 = r4.o()
            if (r3 != r4) goto L2f
            int r3 = r6.f52570F
            o9.a r4 = r6.f52568D
            o9.k r4 = r4.o()
            p247y7.AbstractC7350t.c(r4)
            int r4 = r4.f()
            if (r3 != r4) goto L2f
            goto L3b
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Peek source is invalid because upstream source was used"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L3b:
            if (r2 != 0) goto L3e
            return r0
        L3e:
            o9.q r0 = r6.f52567C
            long r1 = r6.f52572H
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.G0(r1)
            if (r0 != 0) goto L4e
            r7 = -1
            return r7
        L4e:
            o9.k r0 = r6.f52569E
            if (r0 != 0) goto L71
            o9.a r0 = r6.f52568D
            o9.k r0 = r0.o()
            if (r0 == 0) goto L71
            o9.a r0 = r6.f52568D
            o9.k r0 = r0.o()
            r6.f52569E = r0
            o9.a r0 = r6.f52568D
            o9.k r0 = r0.o()
            p247y7.AbstractC7350t.c(r0)
            int r0 = r0.f()
            r6.f52570F = r0
        L71:
            o9.a r0 = r6.f52568D
            long r0 = r0.r()
            long r2 = r6.f52572H
            long r0 = r0 - r2
            long r8 = java.lang.Math.min(r8, r0)
            o9.a r0 = r6.f52568D
            long r2 = r6.f52572H
            long r4 = r2 + r8
            r1 = r7
            r0.i(r1, r2, r4)
            long r0 = r6.f52572H
            long r0 = r0 + r8
            r6.f52572H = r0
            return r8
        L8e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "byteCount ("
            r7.append(r0)
            r7.append(r8)
            java.lang.String r8 = ") < 0"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        Lae:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Source is closed."
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p149o9.f.I0(o9.a, long):long");
    }

    @Override // p149o9.h, java.lang.AutoCloseable, p149o9.g
    public void close() {
        this.f52571G = true;
    }
}
