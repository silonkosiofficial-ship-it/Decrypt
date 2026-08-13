package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5990d3 implements com.google.android.gms.internal.measurement.InterfaceC5981c3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static com.google.android.gms.internal.measurement.C5990d3 f40832c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f40833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.database.ContentObserver f40834b;

    private C5990d3() {
        this.f40833a = null;
        this.f40834b = null;
    }

    private C5990d3(android.content.Context context) {
        this.f40833a = context;
        com.google.android.gms.internal.measurement.C6008f3 c6008f3 = new com.google.android.gms.internal.measurement.C6008f3(this, null);
        this.f40834b = c6008f3;
        context.getContentResolver().registerContentObserver(com.google.android.gms.internal.measurement.I2.f40541a, true, c6008f3);
    }

    static com.google.android.gms.internal.measurement.C5990d3 a(android.content.Context context) {
        com.google.android.gms.internal.measurement.C5990d3 c5990d3;
        synchronized (com.google.android.gms.internal.measurement.C5990d3.class) {
            try {
                if (f40832c == null) {
                    f40832c = androidx.core.content.d.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new com.google.android.gms.internal.measurement.C5990d3(context) : new com.google.android.gms.internal.measurement.C5990d3();
                }
                c5990d3 = f40832c;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return c5990d3;
    }

    static synchronized void b() {
        android.content.Context context;
        try {
            com.google.android.gms.internal.measurement.C5990d3 c5990d3 = f40832c;
            if (c5990d3 != null && (context = c5990d3.f40833a) != null && c5990d3.f40834b != null) {
                context.getContentResolver().unregisterContentObserver(f40832c.f40834b);
            }
            f40832c = null;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.InterfaceC5981c3
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final java.lang.String o(final java.lang.String str) {
        android.content.Context context = this.f40833a;
        if (context != null && !com.google.android.gms.internal.measurement.T2.b(context)) {
            try {
                return (java.lang.String) com.google.android.gms.internal.measurement.AbstractC5972b3.a(new com.google.android.gms.internal.measurement.InterfaceC5999e3() { // from class: com.google.android.gms.internal.measurement.g3
                    @Override // com.google.android.gms.internal.measurement.InterfaceC5999e3
                    public final java.lang.Object a() {
                        return this.f40945a.c(str);
                    }
                });
            } catch (java.lang.IllegalStateException | java.lang.NullPointerException | java.lang.SecurityException e6) {
                java.lang.String str2 = "Unable to read GServices for: " + str;
            }
        }
        return null;
    }

    final /* synthetic */ java.lang.String c(java.lang.String str) {
        return com.google.android.gms.internal.measurement.J2.a(this.f40833a.getContentResolver(), str, null);
    }
}
