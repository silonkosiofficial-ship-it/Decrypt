package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class JB0 implements com.google.android.gms.internal.ads.InterfaceC3128aB0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f28648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f28649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f28650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C4930qg f28651d = com.google.android.gms.internal.ads.C4930qg.f38295d;

    public JB0(com.google.android.gms.internal.ads.InterfaceC4447mD interfaceC4447mD) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3128aB0
    public final void Q(com.google.android.gms.internal.ads.C4930qg c4930qg) {
        if (this.f28648a) {
            b(a());
        }
        this.f28651d = c4930qg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3128aB0
    public final long a() {
        long j6 = this.f28649b;
        if (!this.f28648a) {
            return j6;
        }
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f28650c;
        com.google.android.gms.internal.ads.C4930qg c4930qg = this.f28651d;
        return j6 + (c4930qg.f38296a == 1.0f ? com.google.android.gms.internal.ads.EW.K(jElapsedRealtime) : c4930qg.a(jElapsedRealtime));
    }

    public final void b(long j6) {
        this.f28649b = j6;
        if (this.f28648a) {
            this.f28650c = android.os.SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3128aB0
    public final com.google.android.gms.internal.ads.C4930qg c() {
        return this.f28651d;
    }

    public final void d() {
        if (this.f28648a) {
            return;
        }
        this.f28650c = android.os.SystemClock.elapsedRealtime();
        this.f28648a = true;
    }

    public final void e() {
        if (this.f28648a) {
            b(a());
            this.f28648a = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3128aB0
    public final /* synthetic */ boolean j() {
        return false;
    }
}
