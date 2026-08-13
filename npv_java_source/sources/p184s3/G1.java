package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class G1 extends com.google.android.gms.internal.ads.AbstractBinderC5387up {
    private static void p6(final com.google.android.gms.internal.ads.InterfaceC2251Cp interfaceC2251Cp) {
        p224w3.p.d("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        p224w3.g.f56228b.post(new java.lang.Runnable() { // from class: s3.F1
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.ads.InterfaceC2251Cp interfaceC2251Cp2 = interfaceC2251Cp;
                if (interfaceC2251Cp2 != null) {
                    try {
                        interfaceC2251Cp2.F(1);
                    } catch (android.os.RemoteException e6) {
                        p224w3.p.i("#007 Could not call remote method.", e6);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5497vp
    public final void A2(com.google.android.gms.internal.ads.C2288Dp c2288Dp) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5497vp
    public final void K4(p184s3.X1 x6, com.google.android.gms.internal.ads.InterfaceC2251Cp interfaceC2251Cp) {
        p6(interfaceC2251Cp);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5497vp
    public final void L2(p184s3.K0 k6) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5497vp
    public final void N5(p184s3.N0 n6) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5497vp
    public final void S2(X3.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5497vp
    public final void T3(boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5497vp
    public final android.os.Bundle b() {
        return new android.os.Bundle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5497vp
    public final void b3(com.google.android.gms.internal.ads.C2547Kp c2547Kp) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5497vp
    public final p184s3.U0 c() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5497vp
    public final java.lang.String d() {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5497vp
    public final void d3(com.google.android.gms.internal.ads.InterfaceC5827yp interfaceC5827yp) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5497vp
    public final com.google.android.gms.internal.ads.InterfaceC5167sp f() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5497vp
    public final void m5(p184s3.X1 x6, com.google.android.gms.internal.ads.InterfaceC2251Cp interfaceC2251Cp) {
        p6(interfaceC2251Cp);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5497vp
    public final boolean p() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5497vp
    public final void p2(X3.a aVar, boolean z6) {
    }
}
