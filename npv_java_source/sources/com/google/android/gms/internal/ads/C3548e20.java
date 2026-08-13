package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.e20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3548e20 implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f34870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f34871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4546n70 f34872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p224w3.a f34873d;

    C3548e20(android.content.Context context, com.google.android.gms.internal.ads.Yk0 yk0, com.google.android.gms.internal.ads.C4546n70 c4546n70, p224w3.a aVar) {
        this.f34870a = context;
        this.f34871b = yk0;
        this.f34872c = c4546n70;
        this.f34873d = aVar;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 53;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        return this.f34871b.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.d20
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f34630a.c();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x0047 A[Catch: IOException -> 0x002e, TryCatch #0 {IOException -> 0x002e, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:10:0x0033, B:15:0x0059, B:16:0x007d, B:18:0x008f, B:20:0x00a5, B:22:0x00ae, B:27:0x00d4, B:29:0x00f2, B:30:0x0116, B:32:0x0121, B:25:0x00c2, B:13:0x0047), top: B:36:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0059 A[Catch: IOException -> 0x002e, TryCatch #0 {IOException -> 0x002e, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:10:0x0033, B:15:0x0059, B:16:0x007d, B:18:0x008f, B:20:0x00a5, B:22:0x00ae, B:27:0x00d4, B:29:0x00f2, B:30:0x0116, B:32:0x0121, B:25:0x00c2, B:13:0x0047), top: B:36:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x00c2 A[Catch: IOException -> 0x002e, TryCatch #0 {IOException -> 0x002e, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:10:0x0033, B:15:0x0059, B:16:0x007d, B:18:0x008f, B:20:0x00a5, B:22:0x00ae, B:27:0x00d4, B:29:0x00f2, B:30:0x0116, B:32:0x0121, B:25:0x00c2, B:13:0x0047), top: B:36:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00d4 A[Catch: IOException -> 0x002e, TryCatch #0 {IOException -> 0x002e, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:10:0x0033, B:15:0x0059, B:16:0x007d, B:18:0x008f, B:20:0x00a5, B:22:0x00ae, B:27:0x00d4, B:29:0x00f2, B:30:0x0116, B:32:0x0121, B:25:0x00c2, B:13:0x0047), top: B:36:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00f2 A[Catch: IOException -> 0x002e, TryCatch #0 {IOException -> 0x002e, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:10:0x0033, B:15:0x0059, B:16:0x007d, B:18:0x008f, B:20:0x00a5, B:22:0x00ae, B:27:0x00d4, B:29:0x00f2, B:30:0x0116, B:32:0x0121, B:25:0x00c2, B:13:0x0047), top: B:36:0x0000 }] */
    final /* synthetic */ com.google.android.gms.internal.ads.C3658f20 c() {
        com.google.android.gms.internal.ads.C2530Ke0 c2530Ke0;
        boolean z6;
        boolean zE;
        com.google.android.gms.internal.ads.C2714Pe0 c2714Pe0J;
        com.google.android.gms.internal.ads.C2567Le0 c2567Le0A;
        try {
            android.content.Context context = this.f34870a;
            boolean zB = this.f34872c.b();
            com.google.android.gms.internal.ads.C2530Ke0 c2530Ke1 = new com.google.android.gms.internal.ads.C2530Ke0();
            com.google.android.gms.internal.ads.C2530Ke0 c2530Ke2 = new com.google.android.gms.internal.ads.C2530Ke0();
            boolean zD = true;
            if (zB) {
                if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25583i3)).booleanValue()) {
                    return new com.google.android.gms.internal.ads.C3658f20(true);
                }
            }
            if (!zB) {
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25539e3)).booleanValue()) {
                    c2530Ke1 = com.google.android.gms.internal.ads.C2677Oe0.k(context).i(((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25655p3)).longValue(), p174r3.v.s().j().M());
                } else if (zB) {
                    if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25561g3)).booleanValue()) {
                        c2530Ke1 = com.google.android.gms.internal.ads.C2677Oe0.k(context).i(((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25655p3)).longValue(), p174r3.v.s().j().M());
                    }
                }
            } else if (zB) {
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25561g3)).booleanValue()) {
                    c2530Ke1 = com.google.android.gms.internal.ads.C2677Oe0.k(context).i(((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25655p3)).longValue(), p174r3.v.s().j().M());
                }
            }
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25625m3)).booleanValue()) {
                if (this.f34873d.f56219E < ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25615l3)).intValue()) {
                    com.google.android.gms.internal.ads.C2714Pe0.j(context).k();
                }
            }
            if (zB) {
                if (zB) {
                    if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25572h3)).booleanValue()) {
                        c2714Pe0J = com.google.android.gms.internal.ads.C2714Pe0.j(context);
                        c2567Le0A = com.google.android.gms.internal.ads.C2567Le0.a(context);
                        if (this.f34873d.f56219E >= ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25615l3)).intValue()) {
                            c2530Ke2 = c2714Pe0J.i(((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25665q3)).longValue(), p174r3.v.s().j().M());
                            zD = c2567Le0A.d();
                        }
                        zE = c2567Le0A.e();
                        c2530Ke0 = c2530Ke2;
                        z6 = zD;
                    }
                }
                c2530Ke0 = c2530Ke2;
                z6 = true;
                zE = true;
            } else {
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25550f3)).booleanValue()) {
                    c2714Pe0J = com.google.android.gms.internal.ads.C2714Pe0.j(context);
                    c2567Le0A = com.google.android.gms.internal.ads.C2567Le0.a(context);
                    if (this.f34873d.f56219E >= ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25615l3)).intValue()) {
                        c2530Ke2 = c2714Pe0J.i(((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25665q3)).longValue(), p174r3.v.s().j().M());
                        zD = c2567Le0A.d();
                    }
                    zE = c2567Le0A.e();
                    c2530Ke0 = c2530Ke2;
                    z6 = zD;
                } else {
                    if (zB) {
                        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25572h3)).booleanValue()) {
                            c2714Pe0J = com.google.android.gms.internal.ads.C2714Pe0.j(context);
                            c2567Le0A = com.google.android.gms.internal.ads.C2567Le0.a(context);
                            if (this.f34873d.f56219E >= ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25615l3)).intValue()) {
                                c2530Ke2 = c2714Pe0J.i(((java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25665q3)).longValue(), p174r3.v.s().j().M());
                                zD = c2567Le0A.d();
                            }
                            zE = c2567Le0A.e();
                            c2530Ke0 = c2530Ke2;
                            z6 = zD;
                        }
                    }
                    c2530Ke0 = c2530Ke2;
                    z6 = true;
                    zE = true;
                }
            }
            return new com.google.android.gms.internal.ads.C3658f20(c2530Ke1, c2530Ke0, z6, zE, zB);
        } catch (java.io.IOException e6) {
            p174r3.v.s().x(e6, "PerAppIdSignal");
            return new com.google.android.gms.internal.ads.C3658f20(this.f34872c.b());
        }
    }
}
