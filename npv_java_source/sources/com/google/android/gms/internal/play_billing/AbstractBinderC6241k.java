package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC6241k extends com.google.android.gms.internal.play_billing.AbstractBinderC6211f implements com.google.android.gms.internal.play_billing.InterfaceC6247l {
    public AbstractBinderC6241k() {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractBinderC6211f
    protected final boolean q0(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        if (i6 != 1) {
            return false;
        }
        int i11 = parcel.readInt();
        com.google.android.gms.internal.play_billing.AbstractC6217g.b(parcel);
        r(i11);
        return true;
    }
}
