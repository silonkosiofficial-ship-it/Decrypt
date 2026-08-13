package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4574nM implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f37585a;

    public C4574nM(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0) {
        this.f37585a = interfaceC5078rz0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        com.google.android.gms.internal.ads.EnumC5473vd enumC5473vd = ((com.google.android.gms.internal.ads.C5434vC) this.f37585a).a().f37522o.f33505a == 3 ? com.google.android.gms.internal.ads.EnumC5473vd.REWARDED_INTERSTITIAL : com.google.android.gms.internal.ads.EnumC5473vd.REWARD_BASED_VIDEO_AD;
        com.google.android.gms.internal.ads.AbstractC4089iz0.b(enumC5473vd);
        return enumC5473vd;
    }
}
