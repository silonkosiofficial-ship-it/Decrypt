package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC5978c0 extends com.google.android.gms.internal.measurement.AbstractBinderC5969b0 implements com.google.android.gms.internal.measurement.InterfaceC5987d0 {
    public static com.google.android.gms.internal.measurement.InterfaceC5987d0 y0(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.measurement.InterfaceC5987d0 ? (com.google.android.gms.internal.measurement.InterfaceC5987d0) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.measurement.C6005f0(iBinder);
    }
}
