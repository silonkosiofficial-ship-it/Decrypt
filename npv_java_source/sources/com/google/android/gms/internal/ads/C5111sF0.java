package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sF0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5111sF0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.Exception f38706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f38707b = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f38708c = -9223372036854775807L;

    public final void a() {
        this.f38706a = null;
        this.f38707b = -9223372036854775807L;
        this.f38708c = -9223372036854775807L;
    }

    public final void b(java.lang.Exception exc) {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (this.f38706a == null) {
            this.f38706a = exc;
        }
        if (this.f38707b == -9223372036854775807L && !com.google.android.gms.internal.ads.EF0.H()) {
            this.f38707b = 200 + jElapsedRealtime;
        }
        long j6 = this.f38707b;
        if (j6 == -9223372036854775807L || jElapsedRealtime < j6) {
            this.f38708c = jElapsedRealtime + 50;
            return;
        }
        java.lang.Exception exc2 = this.f38706a;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        java.lang.Exception exc3 = this.f38706a;
        a();
        throw exc3;
    }

    public final boolean c() {
        if (this.f38706a == null) {
            return false;
        }
        return com.google.android.gms.internal.ads.EF0.H() || android.os.SystemClock.elapsedRealtime() < this.f38708c;
    }
}
