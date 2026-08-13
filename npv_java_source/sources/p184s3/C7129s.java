package p184s3;

/* JADX INFO: renamed from: s3.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C7129s extends p184s3.AbstractC7144x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ android.content.Context f54322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ p184s3.C7141w f54323c;

    C7129s(p184s3.C7141w c7141w, android.content.Context context) {
        this.f54322b = context;
        this.f54323c = c7141w;
    }

    @Override // p184s3.AbstractC7144x
    protected final /* bridge */ /* synthetic */ java.lang.Object a() {
        p184s3.C7141w.q(this.f54322b, "mobile_ads_settings");
        return new p184s3.D1();
    }

    @Override // p184s3.AbstractC7144x
    public final /* bridge */ /* synthetic */ java.lang.Object b(p184s3.InterfaceC7110l0 interfaceC7110l0) {
        return interfaceC7110l0.E3(X3.b.c2(this.f54322b), 244410000);
    }

    @Override // p184s3.AbstractC7144x
    public final /* bridge */ /* synthetic */ java.lang.Object c() {
        com.google.android.gms.internal.ads.AbstractC2161Af.a(this.f54322b);
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Ba)).booleanValue()) {
            return this.f54323c.f54337c.c(this.f54322b);
        }
        try {
            android.os.IBinder iBinderD2 = ((p184s3.C7145x0) p224w3.t.b(this.f54322b, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", new p224w3.r() { // from class: s3.r
                @Override // p224w3.r
                public final java.lang.Object b(java.lang.Object obj) {
                    android.os.IBinder iBinder = (android.os.IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    return iInterfaceQueryLocalInterface instanceof p184s3.C7145x0 ? (p184s3.C7145x0) iInterfaceQueryLocalInterface : new p184s3.C7145x0(iBinder);
                }
            })).d2(X3.b.c2(this.f54322b), 244410000);
            if (iBinderD2 == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinderD2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof p184s3.InterfaceC7139v0 ? (p184s3.InterfaceC7139v0) iInterfaceQueryLocalInterface : new p184s3.C7133t0(iBinderD2);
        } catch (android.os.RemoteException e6) {
            e = e6;
            this.f54323c.f54341g = com.google.android.gms.internal.ads.C4396lo.c(this.f54322b);
            this.f54323c.f54341g.a(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (java.lang.NullPointerException e10) {
            e = e10;
            this.f54323c.f54341g = com.google.android.gms.internal.ads.C4396lo.c(this.f54322b);
            this.f54323c.f54341g.a(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (p224w3.s e11) {
            e = e11;
            this.f54323c.f54341g = com.google.android.gms.internal.ads.C4396lo.c(this.f54322b);
            this.f54323c.f54341g.a(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }
}
