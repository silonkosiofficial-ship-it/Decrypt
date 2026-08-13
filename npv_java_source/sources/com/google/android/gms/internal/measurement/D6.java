package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class D6 implements com.google.android.gms.internal.measurement.E6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f40475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f40476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f40477c;

    static {
        com.google.android.gms.internal.measurement.C6121s3 c6121s3E = new com.google.android.gms.internal.measurement.C6121s3(com.google.android.gms.internal.measurement.AbstractC6062l3.a("com.google.android.gms.measurement")).f().e();
        c6121s3E.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f40475a = c6121s3E.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        f40476b = c6121s3E.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f40477c = c6121s3E.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.E6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.E6
    public final boolean b() {
        return ((java.lang.Boolean) f40475a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.E6
    public final boolean c() {
        return ((java.lang.Boolean) f40476b.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.E6
    public final boolean f() {
        return ((java.lang.Boolean) f40477c.f()).booleanValue();
    }
}
