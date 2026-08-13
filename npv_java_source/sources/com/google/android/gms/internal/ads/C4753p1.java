package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4753p1 implements com.google.android.gms.internal.ads.InterfaceC4093j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f37900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f37901e;

    private C4753p1(int i6, int i10, int i11, int i12, int i13, int i14) {
        this.f37897a = i6;
        this.f37898b = i11;
        this.f37899c = i12;
        this.f37900d = i13;
        this.f37901e = i14;
    }

    public static com.google.android.gms.internal.ads.C4753p1 b(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        int iY = c5128sR.y();
        c5128sR.m(12);
        int iY2 = c5128sR.y();
        int iY3 = c5128sR.y();
        int iY4 = c5128sR.y();
        c5128sR.m(4);
        int iY5 = c5128sR.y();
        int iY6 = c5128sR.y();
        c5128sR.m(8);
        return new com.google.android.gms.internal.ads.C4753p1(iY, iY2, iY3, iY4, iY5, iY6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4093j1
    public final int a() {
        return 1752331379;
    }
}
