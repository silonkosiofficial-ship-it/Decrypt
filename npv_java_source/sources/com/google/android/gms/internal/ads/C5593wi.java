package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5593wi implements com.google.android.gms.internal.ads.InterfaceC3838gj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5703xi f39661a;

    public C5593wi(com.google.android.gms.internal.ads.InterfaceC5703xi interfaceC5703xi) {
        this.f39661a = interfaceC5703xi;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final void a(java.lang.Object obj, java.util.Map map) {
        java.lang.String str = (java.lang.String) map.get("name");
        if (str == null) {
            p224w3.p.g("App event with no name parameter.");
        } else {
            this.f39661a.q(str, (java.lang.String) map.get("info"));
        }
    }
}
