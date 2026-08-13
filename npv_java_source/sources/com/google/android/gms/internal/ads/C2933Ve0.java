package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ve0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2933Ve0 extends com.google.android.gms.internal.ads.AbstractC2264Db implements com.google.android.gms.internal.ads.InterfaceC3005Xe0 {
    C2933Ve0(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3005Xe0
    public final void Z3(android.os.Bundle bundle, com.google.android.gms.internal.ads.InterfaceC3077Ze0 interfaceC3077Ze0) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, bundle);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC3077Ze0);
        c2(2, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3005Xe0
    public final void e5(java.lang.String str, android.os.Bundle bundle, com.google.android.gms.internal.ads.InterfaceC3077Ze0 interfaceC3077Ze0) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeString(str);
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, bundle);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC3077Ze0);
        c2(1, parcelQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3005Xe0
    public final void v2(android.os.Bundle bundle, com.google.android.gms.internal.ads.InterfaceC3077Ze0 interfaceC3077Ze0) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, bundle);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC3077Ze0);
        c2(3, parcelQ0);
    }
}
