package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4170jl implements com.google.android.gms.internal.ads.InterfaceC2171Ak, com.google.android.gms.internal.ads.InterfaceC4061il {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4061il f36728C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.HashSet f36729D = new java.util.HashSet();

    public C4170jl(com.google.android.gms.internal.ads.InterfaceC4061il interfaceC4061il) {
        this.f36728C = interfaceC4061il;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2541Kk
    public final /* synthetic */ void G0(java.lang.String str, org.json.JSONObject jSONObject) {
        com.google.android.gms.internal.ads.AbstractC5927zk.d(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5817yk
    public final /* synthetic */ void O(java.lang.String str, java.util.Map map) {
        com.google.android.gms.internal.ads.AbstractC5927zk.a(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061il
    public final void W(java.lang.String str, com.google.android.gms.internal.ads.InterfaceC3838gj interfaceC3838gj) {
        this.f36728C.W(str, interfaceC3838gj);
        this.f36729D.add(new java.util.AbstractMap.SimpleEntry(str, interfaceC3838gj));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2171Ak, com.google.android.gms.internal.ads.InterfaceC5817yk
    public final /* synthetic */ void a(java.lang.String str, org.json.JSONObject jSONObject) {
        com.google.android.gms.internal.ads.AbstractC5927zk.b(this, str, jSONObject);
    }

    public final void c() {
        for (java.util.AbstractMap.SimpleEntry simpleEntry : this.f36729D) {
            p214v3.AbstractC7265q0.k("Unregistering eventhandler: ".concat(java.lang.String.valueOf(((com.google.android.gms.internal.ads.InterfaceC3838gj) simpleEntry.getValue()).toString())));
            this.f36728C.q0((java.lang.String) simpleEntry.getKey(), (com.google.android.gms.internal.ads.InterfaceC3838gj) simpleEntry.getValue());
        }
        this.f36729D.clear();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2171Ak, com.google.android.gms.internal.ads.InterfaceC2541Kk
    public final void o(java.lang.String str) {
        this.f36728C.o(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2171Ak, com.google.android.gms.internal.ads.InterfaceC2541Kk
    public final /* synthetic */ void q(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.AbstractC5927zk.c(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4061il
    public final void q0(java.lang.String str, com.google.android.gms.internal.ads.InterfaceC3838gj interfaceC3838gj) {
        this.f36728C.q0(str, interfaceC3838gj);
        this.f36729D.remove(new java.util.AbstractMap.SimpleEntry(str, interfaceC3838gj));
    }
}
