package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4097j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f36541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f36542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f36543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f36544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f36545h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f36546i;

    public C4097j3(com.google.android.gms.internal.ads.C5128sR c5128sR, com.google.android.gms.internal.ads.C5128sR c5128sR2, boolean z6) throws com.google.android.gms.internal.ads.C4708of {
        this.f36544g = c5128sR;
        this.f36543f = c5128sR2;
        this.f36542e = z6;
        c5128sR2.l(12);
        this.f36538a = c5128sR2.F();
        c5128sR.l(12);
        this.f36546i = c5128sR.F();
        com.google.android.gms.internal.ads.AbstractC5630x0.b(c5128sR.w() == 1, "first_chunk must be 1");
        this.f36539b = -1;
    }

    public final boolean a() {
        int i6 = this.f36539b + 1;
        this.f36539b = i6;
        if (i6 == this.f36538a) {
            return false;
        }
        this.f36541d = this.f36542e ? this.f36543f.M() : this.f36543f.K();
        if (this.f36539b == this.f36545h) {
            this.f36540c = this.f36544g.F();
            this.f36544g.m(4);
            int i10 = this.f36546i - 1;
            this.f36546i = i10;
            this.f36545h = i10 > 0 ? (-1) + this.f36544g.F() : -1;
        }
        return true;
    }
}
