package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4186jt implements com.google.android.gms.internal.ads.InterfaceC4825pi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4825pi0 f36761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f36762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4825pi0 f36763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f36764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private android.net.Uri f36765e;

    C4186jt(com.google.android.gms.internal.ads.InterfaceC4825pi0 interfaceC4825pi0, int i6, com.google.android.gms.internal.ads.InterfaceC4825pi0 interfaceC4825pi1) {
        this.f36761a = interfaceC4825pi0;
        this.f36762b = i6;
        this.f36763c = interfaceC4825pi1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4884qB0
    public final int H(byte[] bArr, int i6, int i10) {
        int i11;
        long j6 = this.f36764d;
        long j10 = this.f36762b;
        if (j6 < j10) {
            int iH = this.f36761a.H(bArr, i6, (int) java.lang.Math.min(i10, j10 - j6));
            long j11 = this.f36764d + ((long) iH);
            this.f36764d = j11;
            i11 = iH;
            j6 = j11;
        } else {
            i11 = 0;
        }
        if (j6 < this.f36762b) {
            return i11;
        }
        int iH2 = this.f36763c.H(bArr, i6 + i11, i10 - i11);
        int i12 = i11 + iH2;
        this.f36764d += (long) iH2;
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final long a(com.google.android.gms.internal.ads.C3843gl0 c3843gl0) {
        com.google.android.gms.internal.ads.C3843gl0 c3843gl1;
        this.f36765e = c3843gl0.f35675a;
        long j6 = c3843gl0.f35679e;
        long j10 = this.f36762b;
        com.google.android.gms.internal.ads.C3843gl0 c3843gl2 = null;
        if (j6 >= j10) {
            c3843gl1 = null;
        } else {
            long j11 = c3843gl0.f35680f;
            long jMin = j10 - j6;
            if (j11 != -1) {
                jMin = java.lang.Math.min(j11, jMin);
            }
            c3843gl1 = new com.google.android.gms.internal.ads.C3843gl0(c3843gl0.f35675a, j6, jMin, null);
        }
        long j12 = c3843gl0.f35680f;
        if (j12 == -1 || c3843gl0.f35679e + j12 > this.f36762b) {
            long jMax = java.lang.Math.max(this.f36762b, c3843gl0.f35679e);
            long j13 = c3843gl0.f35680f;
            c3843gl2 = new com.google.android.gms.internal.ads.C3843gl0(c3843gl0.f35675a, jMax, j13 != -1 ? java.lang.Math.min(j13, (c3843gl0.f35679e + j13) - this.f36762b) : -1L, null);
        }
        long jA = c3843gl1 != null ? this.f36761a.a(c3843gl1) : 0L;
        long jA2 = c3843gl2 != null ? this.f36763c.a(c3843gl2) : 0L;
        this.f36764d = c3843gl0.f35679e;
        if (jA == -1 || jA2 == -1) {
            return -1L;
        }
        return jA + jA2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final void b(com.google.android.gms.internal.ads.Pv0 pv0) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final android.net.Uri c() {
        return this.f36765e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final java.util.Map d() {
        return com.google.android.gms.internal.ads.AbstractC3727fi0.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final void f() {
        this.f36761a.f();
        this.f36763c.f();
    }
}
