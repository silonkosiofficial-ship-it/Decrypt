package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class GW implements com.google.android.gms.internal.ads.XT {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4365lX f27821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.SM f27822b;

    GW(com.google.android.gms.internal.ads.C4365lX c4365lX, com.google.android.gms.internal.ads.SM sm) {
        this.f27821a = c4365lX;
        this.f27822b = sm;
    }

    @Override // com.google.android.gms.internal.ads.XT
    public final com.google.android.gms.internal.ads.YT a(java.lang.String str, org.json.JSONObject jSONObject) {
        com.google.android.gms.internal.ads.InterfaceC2874Tm interfaceC2874TmB;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25340M1)).booleanValue()) {
            try {
                interfaceC2874TmB = this.f27822b.b(str);
            } catch (android.os.RemoteException e6) {
                p224w3.p.e("Coundn't create RTB adapter: ", e6);
                interfaceC2874TmB = null;
            }
        } else {
            interfaceC2874TmB = this.f27821a.a(str);
        }
        if (interfaceC2874TmB == null) {
            return null;
        }
        return new com.google.android.gms.internal.ads.YT(interfaceC2874TmB, new com.google.android.gms.internal.ads.TU(), str);
    }
}
