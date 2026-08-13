package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class t7 implements com.google.android.gms.internal.measurement.q7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f41227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.measurement.AbstractC6053k3 f41228b;

    static {
        com.google.android.gms.internal.measurement.C6121s3 c6121s3E = new com.google.android.gms.internal.measurement.C6121s3(com.google.android.gms.internal.measurement.AbstractC6062l3.a("com.google.android.gms.measurement")).f().e();
        c6121s3E.d("measurement.client.sessions.background_sessions_enabled", true);
        f41227a = c6121s3E.d("measurement.client.sessions.enable_fix_background_engagement", false);
        c6121s3E.d("measurement.client.sessions.immediate_start_enabled_foreground", true);
        f41228b = c6121s3E.d("measurement.client.sessions.enable_pause_engagement_in_background", true);
        c6121s3E.d("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        c6121s3E.d("measurement.client.sessions.session_id_enabled", true);
        c6121s3E.b("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.q7
    public final boolean a() {
        return ((java.lang.Boolean) f41227a.f()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.q7
    public final boolean b() {
        return ((java.lang.Boolean) f41228b.f()).booleanValue();
    }
}
