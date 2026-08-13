package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5843yx implements com.google.android.gms.internal.ads.InterfaceC3208ax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.KP f40182a;

    C5843yx(com.google.android.gms.internal.ads.KP kp) {
        this.f40182a = kp;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3208ax
    public final void a(java.util.Map map) {
        java.lang.String str = (java.lang.String) map.get("test_mode_enabled");
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.f40182a.p(str.equals("true"));
    }
}
