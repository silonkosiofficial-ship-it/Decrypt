package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Bj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2206Bj implements com.google.android.gms.internal.ads.InterfaceC3838gj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.KP f26012a;

    public C2206Bj(com.google.android.gms.internal.ads.KP kp) {
        Q3.AbstractC1477p.m(kp, "The Inspector Manager must not be null");
        this.f26012a = kp;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final void a(java.lang.Object obj, java.util.Map map) {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        long j6 = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j6 = java.lang.Long.parseLong((java.lang.String) map.get("expires"));
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        this.f26012a.j((java.lang.String) map.get("extras"), j6);
    }
}
