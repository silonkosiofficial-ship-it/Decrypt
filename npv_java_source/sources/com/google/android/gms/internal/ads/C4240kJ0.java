package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4240kJ0 extends com.google.android.gms.internal.ads.BJ0 implements java.lang.Comparable {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final int f36934G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final int f36935H;

    public C4240kJ0(int i6, com.google.android.gms.internal.ads.C2728Pm c2728Pm, int i10, com.google.android.gms.internal.ads.C4570nJ0 c4570nJ0, int i11) {
        super(i6, c2728Pm, i10);
        this.f36934G = com.google.android.gms.internal.ads.BB0.a(i11, c4570nJ0.f37577O) ? 1 : 0;
        this.f36935H = this.f25941F.a();
    }

    @Override // com.google.android.gms.internal.ads.BJ0
    public final int e() {
        return this.f36934G;
    }

    @Override // com.google.android.gms.internal.ads.BJ0
    public final /* bridge */ /* synthetic */ boolean g(com.google.android.gms.internal.ads.BJ0 bj0) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final int compareTo(com.google.android.gms.internal.ads.C4240kJ0 c4240kJ0) {
        return java.lang.Integer.compare(this.f36935H, c4240kJ0.f36935H);
    }
}
