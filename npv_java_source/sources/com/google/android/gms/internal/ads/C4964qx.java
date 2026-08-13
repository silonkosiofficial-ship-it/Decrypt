package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4964qx implements com.google.android.gms.internal.ads.InterfaceC3208ax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f38402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p214v3.InterfaceC7268s0 f38403b = p174r3.v.s().j();

    public C4964qx(android.content.Context context) {
        this.f38402a = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3208ax
    public final void a(java.util.Map map) {
        java.lang.String str;
        if (map.isEmpty() || (str = (java.lang.String) map.get("gad_idless")) == null) {
            return;
        }
        p214v3.InterfaceC7268s0 interfaceC7268s0 = this.f38403b;
        boolean z6 = java.lang.Boolean.parseBoolean(str);
        interfaceC7268s0.H(z6);
        if (z6) {
            p214v3.AbstractC7240e.c(this.f38402a);
        }
    }
}
