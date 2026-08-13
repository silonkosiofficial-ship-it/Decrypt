package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6223h extends com.google.android.gms.internal.play_billing.AbstractC6205e implements com.google.android.gms.internal.play_billing.InterfaceC6235j {
    C6223h(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC6235j
    public final void N1(java.lang.String str, java.lang.String str2, com.google.android.gms.internal.play_billing.InterfaceC6247l interfaceC6247l) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeString(str);
        parcelQ0.writeString(str2);
        int i6 = com.google.android.gms.internal.play_billing.AbstractC6217g.f41555a;
        parcelQ0.writeStrongBinder(interfaceC6247l);
        L0(1, parcelQ0);
    }
}
