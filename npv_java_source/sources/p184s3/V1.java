package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class V1 extends X3.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC4616no f54144c;

    public V1() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // X3.c
    protected final /* synthetic */ java.lang.Object a(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof p184s3.W ? (p184s3.W) iInterfaceQueryLocalInterface : new p184s3.W(iBinder);
    }

    public final p184s3.V c(android.content.Context context, p184s3.c2 c2Var, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl, int i6) {
        com.google.android.gms.internal.ads.AbstractC2161Af.a(context);
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Ba)).booleanValue()) {
            try {
                android.os.IBinder iBinderD2 = ((p184s3.W) b(context)).d2(X3.b.c2(context), c2Var, str, interfaceC2945Vl, 244410000, i6);
                if (iBinderD2 == null) {
                    return null;
                }
                android.os.IInterface iInterfaceQueryLocalInterface = iBinderD2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return iInterfaceQueryLocalInterface instanceof p184s3.V ? (p184s3.V) iInterfaceQueryLocalInterface : new p184s3.T(iBinderD2);
            } catch (X3.c.a e6) {
                e = e6;
                p224w3.p.c("Could not create remote AdManager.", e);
                return null;
            } catch (android.os.RemoteException e10) {
                e = e10;
                p224w3.p.c("Could not create remote AdManager.", e);
                return null;
            }
        }
        try {
            android.os.IBinder iBinderD3 = ((p184s3.W) p224w3.t.b(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new p224w3.r() { // from class: s3.U1
                @Override // p224w3.r
                public final java.lang.Object b(java.lang.Object obj) {
                    android.os.IBinder iBinder = (android.os.IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    android.os.IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    return iInterfaceQueryLocalInterface2 instanceof p184s3.W ? (p184s3.W) iInterfaceQueryLocalInterface2 : new p184s3.W(iBinder);
                }
            })).d2(X3.b.c2(context), c2Var, str, interfaceC2945Vl, 244410000, i6);
            if (iBinderD3 == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface2 = iBinderD3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return iInterfaceQueryLocalInterface2 instanceof p184s3.V ? (p184s3.V) iInterfaceQueryLocalInterface2 : new p184s3.T(iBinderD3);
        } catch (android.os.RemoteException e11) {
            e = e11;
            com.google.android.gms.internal.ads.InterfaceC4616no interfaceC4616noC = com.google.android.gms.internal.ads.C4396lo.c(context);
            this.f54144c = interfaceC4616noC;
            interfaceC4616noC.a(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
            p224w3.p.i("#007 Could not call remote method.", e);
            return null;
        } catch (java.lang.NullPointerException e12) {
            e = e12;
            com.google.android.gms.internal.ads.InterfaceC4616no interfaceC4616noC2 = com.google.android.gms.internal.ads.C4396lo.c(context);
            this.f54144c = interfaceC4616noC2;
            interfaceC4616noC2.a(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
            p224w3.p.i("#007 Could not call remote method.", e);
            return null;
        } catch (p224w3.s e13) {
            e = e13;
            com.google.android.gms.internal.ads.InterfaceC4616no interfaceC4616noC3 = com.google.android.gms.internal.ads.C4396lo.c(context);
            this.f54144c = interfaceC4616noC3;
            interfaceC4616noC3.a(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
            p224w3.p.i("#007 Could not call remote method.", e);
            return null;
        }
    }
}
