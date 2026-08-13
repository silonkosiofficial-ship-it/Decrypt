package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class RV implements com.google.android.gms.internal.ads.InterfaceC2505Jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f31278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.U60 f31279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.R60 f31280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ java.lang.String f31281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C2337Fa0 f31282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C3558e70 f31283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.TV f31284g;

    RV(com.google.android.gms.internal.ads.TV tv, long j6, com.google.android.gms.internal.ads.U60 u60, com.google.android.gms.internal.ads.R60 r60, java.lang.String str, com.google.android.gms.internal.ads.C2337Fa0 c2337Fa0, com.google.android.gms.internal.ads.C3558e70 c3558e70) {
        this.f31278a = j6;
        this.f31279b = u60;
        this.f31280c = r60;
        this.f31281d = str;
        this.f31282e = c2337Fa0;
        this.f31283f = c3558e70;
        this.f31284g = tv;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062 A[PHI: r7
  0x0062: PHI (r7v1 int) = (r7v0 int), (r7v3 int), (r7v3 int), (r7v3 int) binds: [B:16:0x002f, B:21:0x004a, B:23:0x004e, B:25:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x006f A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:31:0x0067, B:33:0x006f, B:35:0x007b, B:39:0x0083, B:40:0x008b, B:42:0x009d, B:43:0x00b6, B:45:0x00be, B:47:0x00c0, B:55:0x00fe, B:56:0x0109, B:50:0x00e3, B:52:0x00e7, B:54:0x00f1), top: B:60:0x0067 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x007b A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:31:0x0067, B:33:0x006f, B:35:0x007b, B:39:0x0083, B:40:0x008b, B:42:0x009d, B:43:0x00b6, B:45:0x00be, B:47:0x00c0, B:55:0x00fe, B:56:0x0109, B:50:0x00e3, B:52:0x00e7, B:54:0x00f1), top: B:60:0x0067 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x009d A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:31:0x0067, B:33:0x006f, B:35:0x007b, B:39:0x0083, B:40:0x008b, B:42:0x009d, B:43:0x00b6, B:45:0x00be, B:47:0x00c0, B:55:0x00fe, B:56:0x0109, B:50:0x00e3, B:52:0x00e7, B:54:0x00f1), top: B:60:0x0067 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00be A[Catch: all -> 0x0080, DONT_GENERATE, TryCatch #0 {all -> 0x0080, blocks: (B:31:0x0067, B:33:0x006f, B:35:0x007b, B:39:0x0083, B:40:0x008b, B:42:0x009d, B:43:0x00b6, B:45:0x00be, B:47:0x00c0, B:55:0x00fe, B:56:0x0109, B:50:0x00e3, B:52:0x00e7, B:54:0x00f1), top: B:60:0x0067 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c0 A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:31:0x0067, B:33:0x006f, B:35:0x007b, B:39:0x0083, B:40:0x008b, B:42:0x009d, B:43:0x00b6, B:45:0x00be, B:47:0x00c0, B:55:0x00fe, B:56:0x0109, B:50:0x00e3, B:52:0x00e7, B:54:0x00f1), top: B:60:0x0067 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void a(java.lang.Throwable th) {
        java.lang.Integer numValueOf;
        int i6;
        p184s3.W0 w0B;
        com.google.android.gms.internal.ads.TV tv;
        com.google.android.gms.internal.ads.TV tv2;
        p184s3.W0 w0A;
        int i10;
        p184s3.W0 w6;
        long jC = this.f31284g.f31945a.c() - this.f31278a;
        if (th instanceof java.util.concurrent.TimeoutException) {
            i6 = 2;
        } else if (th instanceof com.google.android.gms.internal.ads.AV) {
            i6 = 3;
        } else {
            if (!(th instanceof java.util.concurrent.CancellationException)) {
                if (th instanceof com.google.android.gms.internal.ads.C5315u70) {
                    i6 = 5;
                } else {
                    int i11 = 6;
                    if (th instanceof com.google.android.gms.internal.ads.C4688oQ) {
                        i11 = com.google.android.gms.internal.ads.P70.a(th).f54145C == 3 ? 1 : 6;
                        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25318K1)).booleanValue() && (th instanceof com.google.android.gms.internal.ads.C3156aU) && (w0B = ((com.google.android.gms.internal.ads.C3156aU) th).b()) != null) {
                            numValueOf = java.lang.Integer.valueOf(w0B.f54145C);
                        } else {
                            numValueOf = null;
                        }
                    } else {
                        numValueOf = null;
                    }
                    i6 = i11;
                }
                synchronized (this.f31284g) {
                    try {
                        tv = this.f31284g;
                        if (tv.f31949e) {
                            tv.f31946b.a(this.f31279b, this.f31280c, i6, th instanceof com.google.android.gms.internal.ads.C3156aU ? (com.google.android.gms.internal.ads.C3156aU) th : null, jC);
                        }
                        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25609k8)).booleanValue()) {
                            com.google.android.gms.internal.ads.C2559La0 c2559La0 = this.f31284g.f31947c;
                            com.google.android.gms.internal.ads.C2337Fa0 c2337Fa0 = this.f31282e;
                            com.google.android.gms.internal.ads.C3558e70 c3558e70 = this.f31283f;
                            com.google.android.gms.internal.ads.R60 r60 = this.f31280c;
                            c2559La0.e(c2337Fa0.c(c3558e70, r60, r60.f31186n), this.f31280c.f31207x0);
                        }
                        tv2 = this.f31284g;
                        if (tv2.f31951g) {
                            return;
                        }
                        java.util.LinkedHashMap linkedHashMap = tv2.f31948d;
                        com.google.android.gms.internal.ads.R60 r61 = this.f31280c;
                        linkedHashMap.put(r61, new com.google.android.gms.internal.ads.SV(this.f31281d, r61.f31171f0, i6, jC, numValueOf));
                        w0A = com.google.android.gms.internal.ads.P70.a(th);
                        i10 = w0A.f54145C;
                        if ((i10 != 3 || i10 == 0) && (w6 = w0A.f54148F) != null && !w6.f54147E.equals("com.google.android.gms.ads")) {
                        }
                        this.f31284g.f31950f.f(this.f31280c, jC, w0A);
                    } catch (java.lang.Throwable th2) {
                        throw th2;
                    }
                }
            }
            i6 = 4;
        }
        numValueOf = null;
        synchronized (this.f31284g) {
            tv = this.f31284g;
            if (tv.f31949e) {
                tv.f31946b.a(this.f31279b, this.f31280c, i6, th instanceof com.google.android.gms.internal.ads.C3156aU ? (com.google.android.gms.internal.ads.C3156aU) th : null, jC);
            }
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25609k8)).booleanValue()) {
                com.google.android.gms.internal.ads.C2559La0 c2559La1 = this.f31284g.f31947c;
                com.google.android.gms.internal.ads.C2337Fa0 c2337Fa1 = this.f31282e;
                com.google.android.gms.internal.ads.C3558e70 c3558e71 = this.f31283f;
                com.google.android.gms.internal.ads.R60 r62 = this.f31280c;
                c2559La1.e(c2337Fa1.c(c3558e71, r62, r62.f31186n), this.f31280c.f31207x0);
            }
            tv2 = this.f31284g;
            if (tv2.f31951g) {
                return;
            }
            java.util.LinkedHashMap linkedHashMap2 = tv2.f31948d;
            com.google.android.gms.internal.ads.R60 r63 = this.f31280c;
            linkedHashMap2.put(r63, new com.google.android.gms.internal.ads.SV(this.f31281d, r63.f31171f0, i6, jC, numValueOf));
            w0A = com.google.android.gms.internal.ads.P70.a(th);
            i10 = w0A.f54145C;
            w0A = i10 != 3 ? com.google.android.gms.internal.ads.P70.a(new com.google.android.gms.internal.ads.C3156aU(13, w0A.f54148F)) : com.google.android.gms.internal.ads.P70.a(new com.google.android.gms.internal.ads.C3156aU(13, w0A.f54148F));
            this.f31284g.f31950f.f(this.f31280c, jC, w0A);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Jk0
    public final void c(java.lang.Object obj) {
        long jC = this.f31284g.f31945a.c() - this.f31278a;
        synchronized (this.f31284g) {
            try {
                com.google.android.gms.internal.ads.TV tv = this.f31284g;
                if (tv.f31949e) {
                    tv.f31946b.a(this.f31279b, this.f31280c, 0, null, jC);
                }
                com.google.android.gms.internal.ads.TV tv2 = this.f31284g;
                if (tv2.f31951g) {
                    return;
                }
                if (tv2.q(this.f31280c)) {
                    ((com.google.android.gms.internal.ads.SV) this.f31284g.f31948d.get(this.f31280c)).f31707d = jC;
                } else {
                    java.util.LinkedHashMap linkedHashMap = this.f31284g.f31948d;
                    com.google.android.gms.internal.ads.R60 r60 = this.f31280c;
                    linkedHashMap.put(r60, new com.google.android.gms.internal.ads.SV(this.f31281d, r60.f31171f0, 0, jC, null));
                }
                this.f31284g.f31950f.g(this.f31280c, jC, null);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
