package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Es, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2328Es implements com.google.android.gms.internal.ads.InterfaceC3838gj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.function.Consumer f27133a;

    public C2328Es(java.util.function.Consumer consumer) {
        this.f27133a = consumer;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.util.Map map) {
        java.lang.String str = (java.lang.String) map.get("action");
        if (str == null) {
            p224w3.p.g("Action missing from video GMSG.");
            return;
        }
        if (str.equals("src")) {
            java.lang.String str2 = (java.lang.String) map.get("src");
            if (str2 == null) {
                p224w3.p.g("src missing from video GMSG.");
            } else {
                this.f27133a.accept(str2);
            }
        }
    }
}
