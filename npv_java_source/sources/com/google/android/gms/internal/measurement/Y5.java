package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class Y5 implements com.google.android.gms.internal.measurement.Z5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f40711a;

    static {
        com.google.android.gms.internal.measurement.C6121s3 c6121s3E = new com.google.android.gms.internal.measurement.C6121s3(com.google.android.gms.internal.measurement.AbstractC6062l3.a("com.google.android.gms.measurement")).f().e();
        f40711a = c6121s3E.d("measurement.service.ad_impression.convert_value_to_double", true);
        c6121s3E.d("measurement.client.ad_impression", true);
        c6121s3E.d("measurement.service.separate_public_internal_event_blacklisting", true);
        c6121s3E.d("measurement.service.ad_impression", true);
    }

    @Override // com.google.android.gms.internal.measurement.Z5
    public final boolean a() {
        return ((java.lang.Boolean) f40711a.f()).booleanValue();
    }
}
