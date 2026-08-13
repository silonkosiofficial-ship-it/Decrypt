package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6101p6 implements com.google.android.gms.internal.measurement.InterfaceC6074m6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f41147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f41148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f41149c;

    static {
        com.google.android.gms.internal.measurement.C6121s3 c6121s3E = new com.google.android.gms.internal.measurement.C6121s3(com.google.android.gms.internal.measurement.AbstractC6062l3.a("com.google.android.gms.measurement")).f().e();
        f41147a = c6121s3E.d("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        f41148b = c6121s3E.d("measurement.defensively_copy_bundles_validate_default_params", true);
        f41149c = c6121s3E.d("measurement.set_default_event_parameters_with_backfill.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6074m6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6074m6
    public final boolean b() {
        return ((java.lang.Boolean) f41147a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6074m6
    public final boolean c() {
        return ((java.lang.Boolean) f41148b.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6074m6
    public final boolean f() {
        return ((java.lang.Boolean) f41149c.f()).booleanValue();
    }
}
