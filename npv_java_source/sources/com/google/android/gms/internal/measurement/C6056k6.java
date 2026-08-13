package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6056k6 implements com.google.android.gms.internal.measurement.InterfaceC6065l6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f41016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f41017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f41018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f41019d;

    static {
        com.google.android.gms.internal.measurement.C6121s3 c6121s3E = new com.google.android.gms.internal.measurement.C6121s3(com.google.android.gms.internal.measurement.AbstractC6062l3.a("com.google.android.gms.measurement")).f().e();
        f41016a = c6121s3E.d("measurement.consent.stop_reset_on_storage_denied.client", true);
        f41017b = c6121s3E.d("measurement.consent.stop_reset_on_storage_denied.service", true);
        f41018c = c6121s3E.d("measurement.consent.scrub_audience_data_analytics_consent", true);
        f41019d = c6121s3E.d("measurement.consent.fix_first_open_count_from_snapshot", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6065l6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6065l6
    public final boolean b() {
        return ((java.lang.Boolean) f41016a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6065l6
    public final boolean c() {
        return ((java.lang.Boolean) f41017b.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6065l6
    public final boolean d() {
        return ((java.lang.Boolean) f41019d.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6065l6
    public final boolean f() {
        return ((java.lang.Boolean) f41018c.f()).booleanValue();
    }
}
