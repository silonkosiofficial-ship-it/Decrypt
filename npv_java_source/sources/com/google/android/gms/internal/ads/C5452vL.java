package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5452vL implements com.google.android.gms.internal.ads.InterfaceC3395ch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ java.lang.String f39384a = "_videoMediaView";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.BinderC5562wL f39385b;

    C5452vL(com.google.android.gms.internal.ads.BinderC5562wL binderC5562wL, java.lang.String str) {
        this.f39385b = binderC5562wL;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3395ch
    public final org.json.JSONObject a() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3395ch
    public final org.json.JSONObject b() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3395ch
    public final void c() {
        com.google.android.gms.internal.ads.BinderC5562wL binderC5562wL = this.f39385b;
        if (binderC5562wL.f39585F != null) {
            binderC5562wL.f39585F.n(this.f39384a);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3395ch
    public final void d(android.view.MotionEvent motionEvent) {
    }
}
