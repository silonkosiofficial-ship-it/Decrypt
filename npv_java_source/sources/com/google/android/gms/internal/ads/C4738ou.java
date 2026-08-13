package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ou, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4738ou implements com.google.android.gms.internal.ads.InterfaceC3838gj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC4958qu f37884a;

    C4738ou(com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC4958qu viewTreeObserverOnGlobalLayoutListenerC4958qu) {
        this.f37884a = viewTreeObserverOnGlobalLayoutListenerC4958qu;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.util.Map map) {
        if (map != null) {
            java.lang.String str = (java.lang.String) map.get("height");
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i6 = java.lang.Integer.parseInt(str);
                synchronized (this.f37884a) {
                    try {
                        com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC4958qu viewTreeObserverOnGlobalLayoutListenerC4958qu = this.f37884a;
                        if (viewTreeObserverOnGlobalLayoutListenerC4958qu.f38381m0 != i6) {
                            viewTreeObserverOnGlobalLayoutListenerC4958qu.f38381m0 = i6;
                            this.f37884a.requestLayout();
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            } catch (java.lang.Exception e6) {
                p224w3.p.h("Exception occurred while getting webview content height", e6);
            }
        }
    }
}
