package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4643o1 implements com.google.android.gms.internal.ads.InterfaceC4093j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37707c;

    private C4643o1(int i6, int i10, int i11, int i12) {
        this.f37705a = i6;
        this.f37706b = i10;
        this.f37707c = i11;
    }

    public static com.google.android.gms.internal.ads.C4643o1 b(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        int iY = c5128sR.y();
        c5128sR.m(8);
        int iY2 = c5128sR.y();
        int iY3 = c5128sR.y();
        c5128sR.m(4);
        int iY4 = c5128sR.y();
        c5128sR.m(12);
        return new com.google.android.gms.internal.ads.C4643o1(iY, iY2, iY3, iY4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4093j1
    public final int a() {
        return 1751742049;
    }
}
