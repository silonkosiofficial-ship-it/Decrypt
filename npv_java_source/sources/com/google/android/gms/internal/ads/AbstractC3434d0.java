package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3434d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.google.android.gms.internal.ads.X f34621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final com.google.android.gms.internal.ads.InterfaceC3324c0 f34622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected com.google.android.gms.internal.ads.Z f34623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f34624d;

    protected AbstractC3434d0(com.google.android.gms.internal.ads.InterfaceC3105a0 interfaceC3105a0, com.google.android.gms.internal.ads.InterfaceC3324c0 interfaceC3324c0, long j6, long j10, long j11, long j12, long j13, long j14, int i6) {
        this.f34622b = interfaceC3324c0;
        this.f34624d = i6;
        this.f34621a = new com.google.android.gms.internal.ads.X(interfaceC3105a0, j6, 0L, j11, j12, j13, j14);
    }

    protected static final int f(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, long j6, com.google.android.gms.internal.ads.Q0 q6) {
        if (j6 == interfaceC5300u0.e()) {
            return 0;
        }
        q6.f30855a = j6;
        return 1;
    }

    protected static final boolean g(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, long j6) {
        long jE = j6 - interfaceC5300u0.e();
        if (jE < 0 || jE > 262144) {
            return false;
        }
        interfaceC5300u0.I((int) jE);
        return true;
    }

    public final int a(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, com.google.android.gms.internal.ads.Q0 q6) {
        while (true) {
            com.google.android.gms.internal.ads.Z z6 = this.f34623c;
            com.google.android.gms.internal.ads.LC.b(z6);
            long j6 = z6.f33444f;
            long j10 = z6.f33445g;
            long j11 = z6.f33446h;
            if (j10 - j6 <= this.f34624d) {
                c(false, j6);
                return f(interfaceC5300u0, j6, q6);
            }
            if (!g(interfaceC5300u0, j11)) {
                return f(interfaceC5300u0, j11, q6);
            }
            interfaceC5300u0.j();
            com.google.android.gms.internal.ads.C3215b0 c3215b0A = this.f34622b.a(interfaceC5300u0, z6.f33440b);
            int i6 = c3215b0A.f34183a;
            if (i6 == -3) {
                c(false, j11);
                return f(interfaceC5300u0, j11, q6);
            }
            if (i6 == -2) {
                com.google.android.gms.internal.ads.Z.h(z6, c3215b0A.f34184b, c3215b0A.f34185c);
            } else {
                if (i6 != -1) {
                    g(interfaceC5300u0, c3215b0A.f34185c);
                    c(true, c3215b0A.f34185c);
                    return f(interfaceC5300u0, c3215b0A.f34185c, q6);
                }
                com.google.android.gms.internal.ads.Z.g(z6, c3215b0A.f34184b, c3215b0A.f34185c);
            }
        }
    }

    public final com.google.android.gms.internal.ads.T0 b() {
        return this.f34621a;
    }

    protected final void c(boolean z6, long j6) {
        this.f34623c = null;
        this.f34622b.b();
    }

    public final void d(long j6) {
        com.google.android.gms.internal.ads.Z z6 = this.f34623c;
        if (z6 == null || z6.f33439a != j6) {
            com.google.android.gms.internal.ads.X x6 = this.f34621a;
            this.f34623c = new com.google.android.gms.internal.ads.Z(j6, x6.k(j6), 0L, x6.f32964c, x6.f32965d, x6.f32966e, x6.f32967f);
        }
    }

    public final boolean e() {
        return this.f34623c != null;
    }
}
