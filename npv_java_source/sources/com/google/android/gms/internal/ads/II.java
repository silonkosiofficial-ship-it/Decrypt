package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class II implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f28437a;

    public II(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1) {
        this.f28437a = interfaceC5078rz0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* synthetic */ java.lang.Object b() {
        p224w3.a aVarA = ((com.google.android.gms.internal.ads.C4740ov) this.f28437a).a();
        p174r3.v.t();
        return new com.google.android.gms.internal.ads.C2486Jb(java.util.UUID.randomUUID().toString(), aVarA, "native", new org.json.JSONObject(), false, true);
    }
}
