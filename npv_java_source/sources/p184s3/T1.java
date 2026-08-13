package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class T1 extends X3.c {
    public T1() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    @Override // X3.c
    protected final /* synthetic */ java.lang.Object a(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return iInterfaceQueryLocalInterface instanceof p184s3.S ? (p184s3.S) iInterfaceQueryLocalInterface : new p184s3.S(iBinder);
    }

    public final p184s3.Q c(android.content.Context context, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl) {
        try {
            android.os.IBinder iBinderD2 = ((p184s3.S) b(context)).d2(X3.b.c2(context), str, interfaceC2945Vl, 244410000);
            if (iBinderD2 == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinderD2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof p184s3.Q ? (p184s3.Q) iInterfaceQueryLocalInterface : new p184s3.O(iBinderD2);
        } catch (X3.c.a e6) {
            e = e6;
            p224w3.p.h("Could not create remote builder for AdLoader.", e);
            return null;
        } catch (android.os.RemoteException e10) {
            e = e10;
            p224w3.p.h("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }
}
