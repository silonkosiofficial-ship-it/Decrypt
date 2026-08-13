package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public abstract class T0 extends com.google.android.gms.internal.measurement.AbstractBinderC5969b0 implements com.google.android.gms.internal.measurement.U0 {
    public T0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC5969b0
    protected final boolean q0(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        if (i6 != 1) {
            return false;
        }
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, android.os.Bundle.CREATOR);
        com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
        e0(bundle);
        parcel2.writeNoException();
        return true;
    }
}
