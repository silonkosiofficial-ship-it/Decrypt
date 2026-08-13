package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4746oy implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f37889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f37890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f37891c;

    public C4746oy(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz2) {
        this.f37889a = interfaceC5078rz0;
        this.f37890b = interfaceC5078rz1;
        this.f37891c = interfaceC5078rz2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        p224w3.a aVarA = ((com.google.android.gms.internal.ads.C4740ov) this.f37889a).a();
        org.json.JSONObject jSONObject = (org.json.JSONObject) this.f37890b.b();
        java.lang.String str = (java.lang.String) this.f37891c.b();
        boolean zEquals = "native".equals(str);
        p174r3.v.t();
        return new com.google.android.gms.internal.ads.C2486Jb(java.util.UUID.randomUUID().toString(), aVarA, str, jSONObject, false, zEquals);
    }
}
