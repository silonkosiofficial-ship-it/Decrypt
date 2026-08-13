package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ji0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2501Ji0 extends com.google.android.gms.internal.ads.AbstractC3396ch0 {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    final transient com.google.android.gms.internal.ads.InterfaceC2865Tg0 f28741H;

    C2501Ji0(java.util.Map map, com.google.android.gms.internal.ads.InterfaceC2865Tg0 interfaceC2865Tg0) {
        super(map);
        this.f28741H = interfaceC2865Tg0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5702xh0
    final java.util.Map e() {
        return n();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5702xh0
    final java.util.Set f() {
        return o();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5372uh0
    protected final /* bridge */ /* synthetic */ java.util.Collection h() {
        return (java.util.List) this.f28741H.a();
    }
}
