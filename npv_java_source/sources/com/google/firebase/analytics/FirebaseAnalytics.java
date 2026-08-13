package com.google.firebase.analytics;

/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile com.google.firebase.analytics.FirebaseAnalytics f43925b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.C5997e1 f43926a;

    private FirebaseAnalytics(com.google.android.gms.internal.measurement.C5997e1 c5997e1) {
        Q3.AbstractC1477p.l(c5997e1);
        this.f43926a = c5997e1;
    }

    @androidx.annotation.Keep
    public static com.google.firebase.analytics.FirebaseAnalytics getInstance(android.content.Context context) {
        if (f43925b == null) {
            synchronized (com.google.firebase.analytics.FirebaseAnalytics.class) {
                try {
                    if (f43925b == null) {
                        f43925b = new com.google.firebase.analytics.FirebaseAnalytics(com.google.android.gms.internal.measurement.C5997e1.f(context));
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return f43925b;
    }

    @androidx.annotation.Keep
    public static p085i4.z getScionFrontendApiImplementation(android.content.Context context, android.os.Bundle bundle) {
        com.google.android.gms.internal.measurement.C5997e1 c5997e1G = com.google.android.gms.internal.measurement.C5997e1.g(context, null, null, null, bundle);
        if (c5997e1G == null) {
            return null;
        }
        return new com.google.firebase.analytics.a(c5997e1G);
    }

    @androidx.annotation.Keep
    public final java.lang.String getFirebaseInstanceId() {
        try {
            return (java.lang.String) p115l4.AbstractC6934o.b(com.google.firebase.installations.c.q().a(), 30000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException e6) {
            throw new java.lang.IllegalStateException(e6);
        } catch (java.util.concurrent.ExecutionException e10) {
            throw new java.lang.IllegalStateException(e10.getCause());
        } catch (java.util.concurrent.TimeoutException unused) {
            throw new java.lang.IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @androidx.annotation.Keep
    @java.lang.Deprecated
    public final void setCurrentScreen(android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        this.f43926a.k(activity, str, str2);
    }
}
