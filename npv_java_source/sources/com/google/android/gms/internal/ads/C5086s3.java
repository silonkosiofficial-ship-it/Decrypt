package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5086s3 implements com.google.android.gms.internal.ads.InterfaceC4647o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f38627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f38628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f38629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f38630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f38631e;

    public C5086s3(com.google.android.gms.internal.ads.LZ lz) {
        com.google.android.gms.internal.ads.C5128sR c5128sR = lz.f29519b;
        this.f38627a = c5128sR;
        c5128sR.l(12);
        this.f38629c = c5128sR.F() & 255;
        this.f38628b = c5128sR.F();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4647o3
    public final int a() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4647o3
    public final int b() {
        return this.f38628b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4647o3
    public final int c() {
        int i6 = this.f38629c;
        if (i6 == 8) {
            return this.f38627a.C();
        }
        if (i6 == 16) {
            return this.f38627a.G();
        }
        int i10 = this.f38630d;
        this.f38630d = i10 + 1;
        if (i10 % 2 != 0) {
            return this.f38631e & 15;
        }
        int iC = this.f38627a.C();
        this.f38631e = iC;
        return (iC & 240) >> 4;
    }
}
