package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ft, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3748ft implements com.google.android.gms.internal.ads.WA0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.YJ0 f35465a = new com.google.android.gms.internal.ads.YJ0(true, 65536);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f35466b = 15000000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f35467c = 30000000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f35468d = 2500000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f35469e = 5000000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f35470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f35471g;

    C3748ft() {
    }

    @Override // com.google.android.gms.internal.ads.WA0
    public final boolean a(com.google.android.gms.internal.ads.C3244bE0 c3244bE0) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.WA0
    public final /* synthetic */ boolean b(com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm, com.google.android.gms.internal.ads.LH0 lh0, long j6) {
        com.google.android.gms.internal.ads.AbstractC3586eM.f("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.WA0
    public final void c(com.google.android.gms.internal.ads.VA0 va0, com.google.android.gms.internal.ads.PI0 pi0, com.google.android.gms.internal.ads.IJ0[] ij0Arr) {
        int i6;
        this.f35470f = 0;
        for (com.google.android.gms.internal.ads.IJ0 ij0 : ij0Arr) {
            if (ij0 != null) {
                int i10 = this.f35470f;
                int i11 = ij0.i().f30779c;
                if (i11 == 0) {
                    i6 = 144310272;
                } else if (i11 == 1) {
                    i6 = 13107200;
                } else if (i11 != 2) {
                    i6 = 131072;
                    if (i11 != 3 && i11 != 5 && i11 != 6) {
                        throw new java.lang.IllegalArgumentException();
                    }
                } else {
                    i6 = 131072000;
                }
                this.f35470f = i10 + i6;
            }
        }
        this.f35465a.f(this.f35470f);
    }

    @Override // com.google.android.gms.internal.ads.WA0
    public final boolean d(com.google.android.gms.internal.ads.VA0 va0) {
        char c6;
        long j6 = va0.f32433b;
        boolean z6 = true;
        if (j6 > this.f35467c) {
            c6 = 0;
        } else {
            c6 = j6 < this.f35466b ? (char) 2 : (char) 1;
        }
        int iA = this.f35465a.a();
        int i6 = this.f35470f;
        if (c6 != 2 && (c6 != 1 || !this.f35471g || iA >= i6)) {
            z6 = false;
        }
        this.f35471g = z6;
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.WA0
    public final void e(com.google.android.gms.internal.ads.C3244bE0 c3244bE0) {
        j(false);
    }

    @Override // com.google.android.gms.internal.ads.WA0
    public final long f(com.google.android.gms.internal.ads.C3244bE0 c3244bE0) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.WA0
    public final void g(com.google.android.gms.internal.ads.C3244bE0 c3244bE0) {
        j(true);
    }

    @Override // com.google.android.gms.internal.ads.WA0
    public final boolean h(com.google.android.gms.internal.ads.VA0 va0) {
        long j6 = va0.f32435d ? this.f35469e : this.f35468d;
        return j6 <= 0 || va0.f32433b >= j6;
    }

    @Override // com.google.android.gms.internal.ads.WA0
    public final void i(com.google.android.gms.internal.ads.C3244bE0 c3244bE0) {
        j(true);
    }

    final void j(boolean z6) {
        this.f35470f = 0;
        this.f35471g = false;
        if (z6) {
            this.f35465a.e();
        }
    }

    @Override // com.google.android.gms.internal.ads.WA0
    public final com.google.android.gms.internal.ads.YJ0 k() {
        return this.f35465a;
    }

    public final synchronized void l(int i6) {
        this.f35468d = ((long) i6) * 1000;
    }

    public final synchronized void m(int i6) {
        this.f35469e = ((long) i6) * 1000;
    }

    public final synchronized void n(int i6) {
        this.f35467c = ((long) i6) * 1000;
    }

    public final synchronized void o(int i6) {
        this.f35466b = ((long) i6) * 1000;
    }
}
