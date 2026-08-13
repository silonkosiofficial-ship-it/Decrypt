package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class W0 extends com.google.android.gms.internal.measurement.Y implements com.google.android.gms.internal.measurement.U0 {
    W0(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.U0
    public final void e0(android.os.Bundle bundle) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.d(parcelQ0, bundle);
        L0(1, parcelQ0);
    }
}
