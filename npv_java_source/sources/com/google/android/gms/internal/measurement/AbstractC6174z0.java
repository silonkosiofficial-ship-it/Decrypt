package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6174z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.ThreadLocal f41309a = new com.google.android.gms.internal.measurement.C6166y0();

    public static android.content.SharedPreferences a(android.content.Context context, java.lang.String str, int i6, com.google.android.gms.internal.measurement.AbstractC6110r0 abstractC6110r0) {
        com.google.android.gms.internal.measurement.SharedPreferencesC6134u0 sharedPreferencesC6134u0 = com.google.android.gms.internal.measurement.AbstractC6050k0.a().a(str, abstractC6110r0, com.google.android.gms.internal.measurement.EnumC6086o0.SHARED_PREFS_TYPE).equals("") ? new com.google.android.gms.internal.measurement.SharedPreferencesC6134u0() : null;
        if (sharedPreferencesC6134u0 != null) {
            return sharedPreferencesC6134u0;
        }
        java.lang.ThreadLocal threadLocal = f41309a;
        M4.h.d(((java.lang.Boolean) threadLocal.get()).booleanValue());
        threadLocal.set(java.lang.Boolean.FALSE);
        try {
            return context.getSharedPreferences(str, 0);
        } finally {
            f41309a.set(java.lang.Boolean.TRUE);
        }
    }
}
