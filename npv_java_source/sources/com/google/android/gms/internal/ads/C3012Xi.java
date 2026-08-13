package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3012Xi implements com.google.android.gms.internal.ads.InterfaceC3838gj {
    C3012Xi() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3838gj
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.util.Map map) {
        com.google.android.gms.internal.ads.InterfaceC2698Ot interfaceC2698Ot = (com.google.android.gms.internal.ads.InterfaceC2698Ot) obj;
        if (interfaceC2698Ot.l0() != null) {
            interfaceC2698Ot.l0().a();
        }
        p204u3.x xVarP = interfaceC2698Ot.P();
        if (xVarP != null) {
            xVarP.b();
            return;
        }
        p204u3.x xVarR = interfaceC2698Ot.R();
        if (xVarR != null) {
            xVarR.b();
        } else {
            p224w3.p.g("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
