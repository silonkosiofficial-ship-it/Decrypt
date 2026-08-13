package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC6193c extends com.google.android.gms.internal.play_billing.AbstractBinderC6211f implements com.google.android.gms.internal.play_billing.InterfaceC6199d {
    public static com.google.android.gms.internal.play_billing.InterfaceC6199d y0(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.play_billing.InterfaceC6199d ? (com.google.android.gms.internal.play_billing.InterfaceC6199d) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.play_billing.C6187b(iBinder);
    }
}
