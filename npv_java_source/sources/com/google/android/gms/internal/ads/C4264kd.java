package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4264kd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3036Yc f36990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f36991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.content.Context f36992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.Object f36993d = new java.lang.Object();

    C4264kd(android.content.Context context) {
        this.f36992c = context;
    }

    static /* bridge */ /* synthetic */ void e(com.google.android.gms.internal.ads.C4264kd c4264kd) {
        synchronized (c4264kd.f36993d) {
            try {
                com.google.android.gms.internal.ads.C3036Yc c3036Yc = c4264kd.f36990a;
                if (c3036Yc == null) {
                    return;
                }
                c3036Yc.h();
                c4264kd.f36990a = null;
                android.os.Binder.flushPendingCommands();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    final java.util.concurrent.Future c(com.google.android.gms.internal.ads.C3072Zc c3072Zc) {
        com.google.android.gms.internal.ads.C3497dd c3497dd = new com.google.android.gms.internal.ads.C3497dd(this);
        com.google.android.gms.internal.ads.C4046id c4046id = new com.google.android.gms.internal.ads.C4046id(this, c3072Zc, c3497dd);
        com.google.android.gms.internal.ads.C4154jd c4154jd = new com.google.android.gms.internal.ads.C4154jd(this, c3497dd);
        synchronized (this.f36993d) {
            com.google.android.gms.internal.ads.C3036Yc c3036Yc = new com.google.android.gms.internal.ads.C3036Yc(this.f36992c, p174r3.v.x().b(), c4046id, c4154jd);
            this.f36990a = c3036Yc;
            c3036Yc.q();
        }
        return c3497dd;
    }
}
