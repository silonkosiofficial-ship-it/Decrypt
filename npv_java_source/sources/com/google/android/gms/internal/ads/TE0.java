package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class TE0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.SE0 f31905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f31907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f31908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f31909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f31910f;

    public TE0(android.media.AudioTrack audioTrack) {
        this.f31905a = new com.google.android.gms.internal.ads.SE0(audioTrack);
        h(0);
    }

    private final void h(int i6) {
        this.f31906b = i6;
        long j6 = 10000;
        if (i6 == 0) {
            this.f31909e = 0L;
            this.f31910f = -1L;
            this.f31907c = java.lang.System.nanoTime() / 1000;
        } else {
            if (i6 == 1) {
                this.f31908d = 10000L;
                return;
            }
            j6 = (i6 == 2 || i6 == 3) ? 10000000L : 500000L;
        }
        this.f31908d = j6;
    }

    public final long a() {
        return this.f31905a.a();
    }

    public final long b() {
        return this.f31905a.b();
    }

    public final void c() {
        if (this.f31906b == 4) {
            h(0);
        }
    }

    public final void d() {
        h(4);
    }

    public final void e() {
        h(0);
    }

    public final boolean f() {
        return this.f31906b == 2;
    }

    public final boolean g(long j6) {
        if (j6 - this.f31909e < this.f31908d) {
            return false;
        }
        this.f31909e = j6;
        boolean zC = this.f31905a.c();
        int i6 = this.f31906b;
        if (i6 == 0) {
            if (!zC) {
                if (j6 - this.f31907c <= 500000) {
                    return false;
                }
                h(3);
                return false;
            }
            if (this.f31905a.b() < this.f31907c) {
                return false;
            }
            this.f31910f = this.f31905a.a();
            h(1);
            return true;
        }
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    return zC;
                }
                if (!zC) {
                    return false;
                }
                h(0);
                return true;
            }
            if (!zC) {
                h(0);
                return false;
            }
        } else {
            if (!zC) {
                h(0);
                return false;
            }
            if (this.f31905a.a() > this.f31910f) {
                h(2);
                return true;
            }
        }
        return true;
    }
}
