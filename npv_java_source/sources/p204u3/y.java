package p204u3;

/* JADX INFO: loaded from: classes.dex */
public final class y {
    public static final void a(android.content.Context context, com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel, boolean z6, com.google.android.gms.internal.ads.C3588eO c3588eO) {
        if (adOverlayInfoParcel.f24720M == 4 && adOverlayInfoParcel.f24712E == null) {
            p184s3.InterfaceC7076a interfaceC7076a = adOverlayInfoParcel.f24711D;
            if (interfaceC7076a != null) {
                interfaceC7076a.e0();
            }
            com.google.android.gms.internal.ads.MG mg = adOverlayInfoParcel.f24730W;
            if (mg != null) {
                mg.p0();
            }
            android.app.Activity activityH = adOverlayInfoParcel.f24713F.h();
            p204u3.l lVar = adOverlayInfoParcel.f24710C;
            android.content.Context context2 = (lVar == null || !lVar.f55500L || activityH == null) ? context : activityH;
            p174r3.v.l();
            p204u3.l lVar2 = adOverlayInfoParcel.f24710C;
            p204u3.C7199a.b(context2, lVar2, adOverlayInfoParcel.f24718K, lVar2 != null ? lVar2.f55499K : null, c3588eO, adOverlayInfoParcel.f24726S);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f24722O.f56220F);
        intent.putExtra("shouldCallOnOverlayOpened", z6);
        android.os.Bundle bundle = new android.os.Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!V3.n.f()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        boolean zBooleanValue = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Vc)).booleanValue();
        p174r3.v.t();
        if (zBooleanValue) {
            p214v3.E0.x(context, intent, c3588eO, adOverlayInfoParcel.f24726S);
        } else {
            p214v3.E0.t(context, intent);
        }
    }
}
