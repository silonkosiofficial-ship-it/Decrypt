package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3388cd0 implements Q3.AbstractC1464c.a, Q3.AbstractC1464c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.google.android.gms.internal.ads.C2269Dd0 f34546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f34547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f34548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.concurrent.LinkedBlockingQueue f34549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final android.os.HandlerThread f34550e;

    public C3388cd0(android.content.Context context, java.lang.String str, java.lang.String str2) {
        this.f34547b = str;
        this.f34548c = str2;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("GassClient");
        this.f34550e = handlerThread;
        handlerThread.start();
        com.google.android.gms.internal.ads.C2269Dd0 c2269Dd0 = new com.google.android.gms.internal.ads.C2269Dd0(context, handlerThread.getLooper(), this, this, 9200000);
        this.f34546a = c2269Dd0;
        this.f34549d = new java.util.concurrent.LinkedBlockingQueue();
        c2269Dd0.q();
    }

    static com.google.android.gms.internal.ads.Q8 a() {
        com.google.android.gms.internal.ads.C5316u8 c5316u8B0 = com.google.android.gms.internal.ads.Q8.B0();
        c5316u8B0.C(32768L);
        return (com.google.android.gms.internal.ads.Q8) c5316u8B0.u();
    }

    @Override // Q3.AbstractC1464c.a
    public final void L0(android.os.Bundle bundle) {
        com.google.android.gms.internal.ads.C2454Id0 c2454Id0D = d();
        if (c2454Id0D != null) {
            try {
                try {
                    this.f34549d.put(c2454Id0D.d2(new com.google.android.gms.internal.ads.C2306Ed0(this.f34547b, this.f34548c)).e());
                } catch (java.lang.Throwable unused) {
                    this.f34549d.put(a());
                }
            } catch (java.lang.InterruptedException unused2) {
            } finally {
                c();
                this.f34550e.quit();
            }
        }
    }

    public final com.google.android.gms.internal.ads.Q8 b(int i6) {
        com.google.android.gms.internal.ads.Q8 q10;
        try {
            q10 = (com.google.android.gms.internal.ads.Q8) this.f34549d.poll(5000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException unused) {
            q10 = null;
        }
        return q10 == null ? a() : q10;
    }

    public final void c() {
        com.google.android.gms.internal.ads.C2269Dd0 c2269Dd0 = this.f34546a;
        if (c2269Dd0 != null) {
            if (c2269Dd0.j() || this.f34546a.e()) {
                this.f34546a.h();
            }
        }
    }

    protected final com.google.android.gms.internal.ads.C2454Id0 d() {
        try {
            return this.f34546a.j0();
        } catch (android.os.DeadObjectException | java.lang.IllegalStateException unused) {
            return null;
        }
    }

    @Override // Q3.AbstractC1464c.b
    public final void q0(N3.C1389b c1389b) {
        try {
            this.f34549d.put(a());
        } catch (java.lang.InterruptedException unused) {
        }
    }

    @Override // Q3.AbstractC1464c.a
    public final void y0(int i6) {
        try {
            this.f34549d.put(a());
        } catch (java.lang.InterruptedException unused) {
        }
    }
}
