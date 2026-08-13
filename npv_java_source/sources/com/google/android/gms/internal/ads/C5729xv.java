package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5729xv implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f39937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f39938b;

    public C5729xv(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1) {
        this.f39937a = interfaceC5078rz0;
        this.f39938b = interfaceC5078rz1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.AbstractC2509Jo b() {
        android.content.Context contextA = ((com.google.android.gms.internal.ads.C3204av) this.f39937a).a();
        com.google.android.gms.internal.ads.T90 t90 = (com.google.android.gms.internal.ads.T90) this.f39938b.b();
        com.google.android.gms.internal.ads.C5599wl c5599wlB = p174r3.v.j().b(contextA, p224w3.a.e(), t90);
        com.google.android.gms.internal.ads.InterfaceC4940ql interfaceC4940ql = com.google.android.gms.internal.ads.AbstractC5269tl.f39020b;
        c5599wlB.a("google.afma.request.getAdDictionary", interfaceC4940ql, interfaceC4940ql);
        return new com.google.android.gms.internal.ads.C2583Lo(contextA, p174r3.v.j().b(contextA, p224w3.a.e(), t90).a("google.afma.sdkConstants.getSdkConstants", interfaceC4940ql, interfaceC4940ql), p224w3.a.e());
    }
}
