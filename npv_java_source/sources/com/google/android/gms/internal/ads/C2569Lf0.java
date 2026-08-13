package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Lf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2569Lf0 extends com.google.android.gms.internal.ads.AbstractC2493Je0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private android.net.Uri f29539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f29540f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f29541g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f29542h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f29543i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4269kf0 f29544j;

    public C2569Lf0(byte[] bArr) {
        com.google.android.gms.internal.ads.C4269kf0 c4269kf0 = new com.google.android.gms.internal.ads.C4269kf0(bArr);
        super(false);
        this.f29544j = c4269kf0;
        com.google.android.gms.internal.ads.LC.d(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4884qB0
    public final int H(byte[] bArr, int i6, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.f29542h;
        if (i11 == 0) {
            return -1;
        }
        int iMin = java.lang.Math.min(i10, i11);
        byte[] bArr2 = this.f29540f;
        com.google.android.gms.internal.ads.LC.b(bArr2);
        java.lang.System.arraycopy(bArr2, this.f29541g, bArr, i6, iMin);
        this.f29541g += iMin;
        this.f29542h -= iMin;
        D(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final long a(com.google.android.gms.internal.ads.C3843gl0 c3843gl0) throws com.google.android.gms.internal.ads.C2722Pi0 {
        h(c3843gl0);
        this.f29539e = c3843gl0.f35675a;
        byte[] bArr = this.f29544j.f36995a;
        this.f29540f = bArr;
        long j6 = c3843gl0.f35679e;
        int length = bArr.length;
        if (j6 > length) {
            throw new com.google.android.gms.internal.ads.C2722Pi0(2008);
        }
        int i6 = (int) j6;
        this.f29541g = i6;
        int i10 = length - i6;
        this.f29542h = i10;
        long j10 = c3843gl0.f35680f;
        if (j10 != -1) {
            this.f29542h = (int) java.lang.Math.min(i10, j10);
        }
        this.f29543i = true;
        i(c3843gl0);
        long j11 = c3843gl0.f35680f;
        return j11 != -1 ? j11 : this.f29542h;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final android.net.Uri c() {
        return this.f29539e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4825pi0
    public final void f() {
        if (this.f29543i) {
            this.f29543i = false;
            g();
        }
        this.f29539e = null;
        this.f29540f = null;
    }
}
