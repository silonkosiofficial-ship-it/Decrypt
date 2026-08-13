package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5985c7 implements com.google.android.gms.internal.measurement.InterfaceC5994d7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f40822a;

    static {
        com.google.android.gms.internal.measurement.C6121s3 c6121s3E = new com.google.android.gms.internal.measurement.C6121s3(com.google.android.gms.internal.measurement.AbstractC6062l3.a("com.google.android.gms.measurement")).f().e();
        c6121s3E.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        c6121s3E.d("measurement.sdk.collection.last_deep_link_referrer2", true);
        f40822a = c6121s3E.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        c6121s3E.b("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5994d7
    public final boolean a() {
        return ((java.lang.Boolean) f40822a.f()).booleanValue();
    }
}
