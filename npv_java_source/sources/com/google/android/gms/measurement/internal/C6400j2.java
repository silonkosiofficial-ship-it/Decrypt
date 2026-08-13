package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6400j2 extends Q3.AbstractC1464c {
    public C6400j2(android.content.Context context, android.os.Looper looper, Q3.AbstractC1464c.a aVar, Q3.AbstractC1464c.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    @Override // Q3.AbstractC1464c
    protected final java.lang.String E() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // Q3.AbstractC1464c
    protected final java.lang.String F() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // Q3.AbstractC1464c, O3.a.f
    public final int l() {
        return 12451000;
    }

    @Override // Q3.AbstractC1464c
    public final /* synthetic */ android.os.IInterface s(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof p085i4.InterfaceC6654f ? (p085i4.InterfaceC6654f) iInterfaceQueryLocalInterface : new com.google.android.gms.measurement.internal.C6365e2(iBinder);
    }
}
