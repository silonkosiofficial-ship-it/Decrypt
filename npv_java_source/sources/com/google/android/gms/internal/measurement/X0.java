package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class X0 extends com.google.android.gms.internal.measurement.Y implements com.google.android.gms.internal.measurement.V0 {
    X0(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.V0
    public final int a() {
        android.os.Parcel parcelY0 = y0(2, q0());
        int i6 = parcelY0.readInt();
        parcelY0.recycle();
        return i6;
    }

    @Override // com.google.android.gms.internal.measurement.V0
    public final void d4(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j6) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeString(str);
        parcelQ0.writeString(str2);
        com.google.android.gms.internal.measurement.AbstractC5960a0.d(parcelQ0, bundle);
        parcelQ0.writeLong(j6);
        L0(1, parcelQ0);
    }
}
