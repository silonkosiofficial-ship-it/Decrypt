package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Dd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2269Dd0 extends p174r3.c {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int f26754F;

    public C2269Dd0(android.content.Context context, android.os.Looper looper, Q3.AbstractC1464c.a aVar, Q3.AbstractC1464c.b bVar, int i6) {
        super(context, looper, 116, aVar, bVar, null);
        this.f26754F = i6;
    }

    @Override // Q3.AbstractC1464c
    protected final java.lang.String E() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // Q3.AbstractC1464c
    protected final java.lang.String F() {
        return "com.google.android.gms.gass.START";
    }

    public final com.google.android.gms.internal.ads.C2454Id0 j0() {
        return (com.google.android.gms.internal.ads.C2454Id0) super.D();
    }

    @Override // Q3.AbstractC1464c, O3.a.f
    public final int l() {
        return this.f26754F;
    }

    @Override // Q3.AbstractC1464c
    protected final /* synthetic */ android.os.IInterface s(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.C2454Id0 ? (com.google.android.gms.internal.ads.C2454Id0) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C2454Id0(iBinder);
    }
}
