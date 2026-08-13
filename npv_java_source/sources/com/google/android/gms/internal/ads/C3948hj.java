package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3948hj implements com.google.android.gms.internal.ads.InterfaceC3838gj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.KP f36115a;

    public C3948hj(com.google.android.gms.internal.ads.KP kp) {
        Q3.AbstractC1477p.m(kp, "The Inspector Manager must not be null");
        this.f36115a = kp;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final void a(java.lang.Object obj, java.util.Map map) {
        if (map == null || !map.containsKey("persistentData") || android.text.TextUtils.isEmpty((java.lang.CharSequence) map.get("persistentData"))) {
            return;
        }
        this.f36115a.k((java.lang.String) map.get("persistentData"));
    }
}
