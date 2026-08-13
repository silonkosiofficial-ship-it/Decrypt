package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6164x6 implements com.google.android.gms.internal.measurement.InterfaceC6172y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f41296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f41297b;

    static {
        com.google.android.gms.internal.measurement.C6121s3 c6121s3E = new com.google.android.gms.internal.measurement.C6121s3(com.google.android.gms.internal.measurement.AbstractC6062l3.a("com.google.android.gms.measurement")).f().e();
        c6121s3E.d("measurement.collection.event_safelist", true);
        f41296a = c6121s3E.d("measurement.service.store_null_safelist", true);
        f41297b = c6121s3E.d("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6172y6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6172y6
    public final boolean b() {
        return ((java.lang.Boolean) f41296a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6172y6
    public final boolean c() {
        return ((java.lang.Boolean) f41297b.f()).booleanValue();
    }
}
