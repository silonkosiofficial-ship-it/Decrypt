package p184s3;

/* JADX INFO: renamed from: s3.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7140v1 extends X3.c {
    public C7140v1() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override // X3.c
    protected final /* synthetic */ java.lang.Object a(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return iInterfaceQueryLocalInterface instanceof p184s3.C7145x0 ? (p184s3.C7145x0) iInterfaceQueryLocalInterface : new p184s3.C7145x0(iBinder);
    }

    public final p184s3.InterfaceC7139v0 c(android.content.Context context) {
        try {
            android.os.IBinder iBinderD2 = ((p184s3.C7145x0) b(context)).d2(X3.b.c2(context), 244410000);
            if (iBinderD2 == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinderD2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof p184s3.InterfaceC7139v0 ? (p184s3.InterfaceC7139v0) iInterfaceQueryLocalInterface : new p184s3.C7133t0(iBinderD2);
        } catch (X3.c.a e6) {
            e = e6;
            p224w3.p.h("Could not get remote MobileAdsSettingManager.", e);
            return null;
        } catch (android.os.RemoteException e10) {
            e = e10;
            p224w3.p.h("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }
}
