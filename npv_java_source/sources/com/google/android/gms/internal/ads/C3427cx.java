package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3427cx implements com.google.android.gms.internal.ads.InterfaceC3208ax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p214v3.InterfaceC7268s0 f34601a;

    public C3427cx(p214v3.InterfaceC7268s0 interfaceC7268s0) {
        this.f34601a = interfaceC7268s0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3208ax
    public final void a(java.util.Map map) {
        this.f34601a.p(java.lang.Boolean.parseBoolean((java.lang.String) map.get("content_url_opted_out")));
    }
}
