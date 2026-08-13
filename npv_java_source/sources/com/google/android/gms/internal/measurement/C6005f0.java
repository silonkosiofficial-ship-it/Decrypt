package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6005f0 extends com.google.android.gms.internal.measurement.Y implements com.google.android.gms.internal.measurement.InterfaceC5987d0 {
    C6005f0(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5987d0
    public final android.os.Bundle e0(android.os.Bundle bundle) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.d(parcelQ0, bundle);
        android.os.Parcel parcelY0 = y0(1, parcelQ0);
        android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcelY0, android.os.Bundle.CREATOR);
        parcelY0.recycle();
        return bundle2;
    }
}
