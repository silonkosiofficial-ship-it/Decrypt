package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class CN implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f26217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f26218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f26219c;

    public CN(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz2, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz3) {
        this.f26217a = interfaceC5078rz0;
        this.f26218b = interfaceC5078rz1;
        this.f26219c = interfaceC5078rz3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        java.util.Set setEmptySet;
        final java.lang.String strA = ((com.google.android.gms.internal.ads.C3114a40) this.f26217a).a();
        android.content.Context contextA = ((com.google.android.gms.internal.ads.C3204av) this.f26218b).a();
        com.google.android.gms.internal.ads.Yk0 yk0C = com.google.android.gms.internal.ads.O80.c();
        java.util.Map mapB = ((com.google.android.gms.internal.ads.C3651ez0) this.f26219c).b();
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25453W4)).booleanValue()) {
            com.google.android.gms.internal.ads.C4704od c4704od = new com.google.android.gms.internal.ads.C4704od(new com.google.android.gms.internal.ads.C5363ud(contextA));
            c4704od.b(new com.google.android.gms.internal.ads.InterfaceC4594nd() { // from class: com.google.android.gms.internal.ads.DN
                @Override // com.google.android.gms.internal.ads.InterfaceC4594nd
                public final void a(com.google.android.gms.internal.ads.C3004Xe c3004Xe) {
                    c3004Xe.C(strA);
                }
            });
            setEmptySet = java.util.Collections.singleton(new com.google.android.gms.internal.ads.EG(new com.google.android.gms.internal.ads.FN(c4704od, mapB), yk0C));
        } else {
            setEmptySet = java.util.Collections.emptySet();
        }
        com.google.android.gms.internal.ads.AbstractC4089iz0.b(setEmptySet);
        return setEmptySet;
    }
}
