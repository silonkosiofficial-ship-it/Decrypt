package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Y0 extends com.google.android.gms.internal.measurement.AbstractBinderC5969b0 implements com.google.android.gms.internal.measurement.V0 {
    public Y0() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC5969b0
    protected final boolean q0(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        if (i6 == 1) {
            java.lang.String string = parcel.readString();
            java.lang.String string2 = parcel.readString();
            android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcel, android.os.Bundle.CREATOR);
            long j6 = parcel.readLong();
            com.google.android.gms.internal.measurement.AbstractC5960a0.f(parcel);
            d4(string, string2, bundle, j6);
            parcel2.writeNoException();
        } else {
            if (i6 != 2) {
                return false;
            }
            int iA = a();
            parcel2.writeNoException();
            parcel2.writeInt(iA);
        }
        return true;
    }
}
