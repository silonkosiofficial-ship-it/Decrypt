package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC6229i extends com.google.android.gms.internal.play_billing.AbstractBinderC6211f implements com.google.android.gms.internal.play_billing.InterfaceC6235j {
    public static com.google.android.gms.internal.play_billing.InterfaceC6235j y0(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.play_billing.InterfaceC6235j ? (com.google.android.gms.internal.play_billing.InterfaceC6235j) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.play_billing.C6223h(iBinder);
    }
}
