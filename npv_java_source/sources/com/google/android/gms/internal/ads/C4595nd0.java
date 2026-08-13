package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4595nd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4483mc0 f37627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicLong f37628b = new java.util.concurrent.atomic.AtomicLong();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.ArrayDeque f37629c = new java.util.ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.PriorityQueue f37630d = new java.util.PriorityQueue();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f37631e = -1;

    public C4595nd0(com.google.android.gms.internal.ads.InterfaceC4483mc0 interfaceC4483mc0) {
        this.f37627a = interfaceC4483mc0;
    }

    private final void e(int i6) {
        while (this.f37630d.size() > i6) {
            com.google.android.gms.internal.ads.C2599Mc0 c2599Mc0 = (com.google.android.gms.internal.ads.C2599Mc0) this.f37630d.poll();
            int i10 = com.google.android.gms.internal.ads.EW.f27061a;
            this.f37627a.a(c2599Mc0.f29807D, c2599Mc0.f29806C);
            this.f37629c.push(c2599Mc0);
        }
    }

    public final int a() {
        return this.f37631e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r9 < r0.f29807D) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(long r9, com.google.android.gms.internal.ads.C5128sR r11) {
        /*
            r8 = this;
            int r0 = r8.f37631e
            if (r0 == 0) goto L53
            r1 = -1
            if (r0 == r1) goto L24
            java.util.PriorityQueue r0 = r8.f37630d
            int r0 = r0.size()
            int r2 = r8.f37631e
            if (r0 < r2) goto L24
            java.util.PriorityQueue r0 = r8.f37630d
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.Mc0 r0 = (com.google.android.gms.internal.ads.C2599Mc0) r0
            int r2 = com.google.android.gms.internal.ads.EW.f27061a
            long r2 = com.google.android.gms.internal.ads.C2599Mc0.e(r0)
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 >= 0) goto L24
            goto L53
        L24:
            java.util.ArrayDeque r0 = r8.f37629c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L32
            com.google.android.gms.internal.ads.Mc0 r0 = new com.google.android.gms.internal.ads.Mc0
            r0.<init>()
            goto L3a
        L32:
            java.util.ArrayDeque r0 = r8.f37629c
            java.lang.Object r0 = r0.poll()
            com.google.android.gms.internal.ads.Mc0 r0 = (com.google.android.gms.internal.ads.C2599Mc0) r0
        L3a:
            java.util.concurrent.atomic.AtomicLong r2 = r8.f37628b
            long r5 = r2.getAndIncrement()
            r2 = r0
            r3 = r9
            r7 = r11
            r2.i(r3, r5, r7)
            java.util.PriorityQueue r9 = r8.f37630d
            r9.add(r0)
            int r9 = r8.f37631e
            if (r9 == r1) goto L52
            r8.e(r9)
        L52:
            return
        L53:
            com.google.android.gms.internal.ads.mc0 r0 = r8.f37627a
            r0.a(r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4595nd0.b(long, com.google.android.gms.internal.ads.sR):void");
    }

    public final void c() {
        e(0);
    }

    public final void d(int i6) {
        com.google.android.gms.internal.ads.LC.f(i6 >= 0);
        this.f37631e = i6;
        e(i6);
    }
}
