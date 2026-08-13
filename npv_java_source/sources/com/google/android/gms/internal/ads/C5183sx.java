package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5183sx implements com.google.android.gms.internal.ads.InterfaceC3208ax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Q60 f38825a;

    public C5183sx(com.google.android.gms.internal.ads.Q60 q60) {
        this.f38825a = q60;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3208ax
    public final void a(java.util.Map map) {
        java.lang.String str = (java.lang.String) map.get("render_in_browser");
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f38825a.b(java.lang.Boolean.parseBoolean(str));
        } catch (java.lang.Exception e6) {
            throw new java.lang.IllegalStateException("Invalid render_in_browser state", e6);
        }
    }
}
