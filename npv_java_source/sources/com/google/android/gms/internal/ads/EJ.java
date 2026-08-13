package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class EJ implements com.google.android.gms.internal.ads.InterfaceC3395ch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK f27008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ android.view.ViewGroup f27009b;

    EJ(com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC3583eK interfaceViewOnClickListenerC3583eK, android.view.ViewGroup viewGroup) {
        this.f27008a = interfaceViewOnClickListenerC3583eK;
        this.f27009b = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3395ch
    public final org.json.JSONObject a() {
        return this.f27008a.p();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3395ch
    public final org.json.JSONObject b() {
        return this.f27008a.q();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3395ch
    public final void c() {
        com.google.android.gms.internal.ads.AbstractC3398ci0 abstractC3398ci0 = com.google.android.gms.internal.ads.BJ.f25923Q;
        java.util.Map mapM = this.f27008a.m();
        if (mapM == null) {
            return;
        }
        int size = abstractC3398ci0.size();
        int i6 = 0;
        while (i6 < size) {
            java.lang.Object obj = mapM.get((java.lang.String) abstractC3398ci0.get(i6));
            i6++;
            if (obj != null) {
                this.f27008a.onClick(this.f27009b);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3395ch
    public final void d(android.view.MotionEvent motionEvent) {
        this.f27008a.onTouch(null, motionEvent);
    }
}
