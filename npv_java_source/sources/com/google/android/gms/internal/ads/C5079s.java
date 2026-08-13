package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5079s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5781yK0 f38583a = new com.google.android.gms.internal.ads.C5781yK0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4860q f38584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.r f38585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f38586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private android.view.Surface f38587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f38588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f38589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f38590h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f38591i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f38592j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f38593k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f38594l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f38595m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f38596n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f38597o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f38598p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f38599q;

    public C5079s(android.content.Context context) {
        android.hardware.display.DisplayManager displayManager;
        com.google.android.gms.internal.ads.C4860q c4860q = (context == null || (displayManager = (android.hardware.display.DisplayManager) context.getSystemService("display")) == null) ? null : new com.google.android.gms.internal.ads.C4860q(this, displayManager);
        this.f38584b = c4860q;
        this.f38585c = c4860q != null ? com.google.android.gms.internal.ads.r.a() : null;
        this.f38593k = -9223372036854775807L;
        this.f38594l = -9223372036854775807L;
        this.f38588f = -1.0f;
        this.f38591i = 1.0f;
        this.f38592j = 0;
    }

    static /* bridge */ /* synthetic */ void b(com.google.android.gms.internal.ads.C5079s c5079s, android.view.Display display) {
        long j6;
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            c5079s.f38593k = refreshRate;
            j6 = (refreshRate * 80) / 100;
        } else {
            com.google.android.gms.internal.ads.AbstractC3586eM.f("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j6 = -9223372036854775807L;
            c5079s.f38593k = -9223372036854775807L;
        }
        c5079s.f38594l = j6;
    }

    private final void k() {
        android.view.Surface surface;
        if (com.google.android.gms.internal.ads.EW.f27061a < 30 || (surface = this.f38587e) == null || this.f38592j == Integer.MIN_VALUE || this.f38590h == 0.0f) {
            return;
        }
        this.f38590h = 0.0f;
        com.google.android.gms.internal.ads.AbstractC4750p.a(surface, 0.0f);
    }

    private final void l() {
        this.f38595m = 0L;
        this.f38598p = -1L;
        this.f38596n = -1L;
    }

    private final void m() {
        if (com.google.android.gms.internal.ads.EW.f27061a < 30 || this.f38587e == null) {
            return;
        }
        float fA = this.f38583a.g() ? this.f38583a.a() : this.f38588f;
        float f6 = this.f38589g;
        if (fA != f6) {
            if (fA != -1.0f && f6 != -1.0f) {
                float f10 = 1.0f;
                if (this.f38583a.g() && this.f38583a.d() >= 5000000000L) {
                    f10 = 0.02f;
                }
                if (java.lang.Math.abs(fA - this.f38589g) < f10) {
                    return;
                }
            } else if (fA == -1.0f && this.f38583a.b() < 30) {
                return;
            }
            this.f38589g = fA;
            n(false);
        }
    }

    private final void n(boolean z6) {
        android.view.Surface surface;
        if (com.google.android.gms.internal.ads.EW.f27061a < 30 || (surface = this.f38587e) == null || this.f38592j == Integer.MIN_VALUE) {
            return;
        }
        float f6 = 0.0f;
        if (this.f38586d) {
            float f10 = this.f38589g;
            if (f10 != -1.0f) {
                f6 = this.f38591i * f10;
            }
        }
        if (z6 || this.f38590h != f6) {
            this.f38590h = f6;
            com.google.android.gms.internal.ads.AbstractC4750p.a(surface, f6);
        }
    }

    public final long a(long j6) {
        long j10;
        if (this.f38598p != -1 && this.f38583a.g()) {
            long jC = this.f38599q + ((long) ((this.f38583a.c() * (this.f38595m - this.f38598p)) / this.f38591i));
            if (java.lang.Math.abs(j6 - jC) > 20000000) {
                l();
            } else {
                j6 = jC;
            }
        }
        this.f38596n = this.f38595m;
        this.f38597o = j6;
        com.google.android.gms.internal.ads.r rVar = this.f38585c;
        if (rVar != null && this.f38593k != -9223372036854775807L) {
            long j11 = rVar.f38412C;
            if (j11 != -9223372036854775807L) {
                long j12 = this.f38593k;
                long j13 = j11 + (((j6 - j11) / j12) * j12);
                if (j6 <= j13) {
                    j10 = j13 - j12;
                } else {
                    j13 = j12 + j13;
                    j10 = j13;
                }
                long j14 = this.f38594l;
                if (j13 - j6 >= j6 - j10) {
                    j13 = j10;
                }
                return j13 - j14;
            }
        }
        return j6;
    }

    public final void c(float f6) {
        this.f38588f = f6;
        this.f38583a.f();
        m();
    }

    public final void d(long j6) {
        long j10 = this.f38596n;
        if (j10 != -1) {
            this.f38598p = j10;
            this.f38599q = this.f38597o;
        }
        this.f38595m++;
        this.f38583a.e(j6 * 1000);
        m();
    }

    public final void e(float f6) {
        this.f38591i = f6;
        l();
        n(false);
    }

    public final void f() {
        l();
    }

    public final void g() {
        this.f38586d = true;
        l();
        if (this.f38584b != null) {
            com.google.android.gms.internal.ads.r rVar = this.f38585c;
            rVar.getClass();
            rVar.b();
            this.f38584b.a();
        }
        n(false);
    }

    public final void h() {
        this.f38586d = false;
        com.google.android.gms.internal.ads.C4860q c4860q = this.f38584b;
        if (c4860q != null) {
            c4860q.b();
            com.google.android.gms.internal.ads.r rVar = this.f38585c;
            rVar.getClass();
            rVar.c();
        }
        k();
    }

    public final void i(android.view.Surface surface) {
        if (this.f38587e == surface) {
            return;
        }
        k();
        this.f38587e = surface;
        n(true);
    }

    public final void j(int i6) {
        if (this.f38592j == i6) {
            return;
        }
        this.f38592j = i6;
        n(true);
    }
}
