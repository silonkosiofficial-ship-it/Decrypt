package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class F7 implements com.google.android.gms.internal.measurement.D7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f40507a;

    static {
        com.google.android.gms.internal.measurement.C6121s3 c6121s3E = new com.google.android.gms.internal.measurement.C6121s3(com.google.android.gms.internal.measurement.AbstractC6062l3.a("com.google.android.gms.measurement")).f().e();
        f40507a = c6121s3E.d("measurement.currency.escape_underscore_fix", true);
        c6121s3E.d("measurement.validation.value_and_currency_params", true);
    }

    @Override // com.google.android.gms.internal.measurement.D7
    public final boolean a() {
        return ((java.lang.Boolean) f40507a.f()).booleanValue();
    }
}
