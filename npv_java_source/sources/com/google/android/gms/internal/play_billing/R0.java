package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
final class R0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final com.google.android.gms.internal.play_billing.R0 f41450b = new com.google.android.gms.internal.play_billing.R0(new com.google.android.gms.internal.play_billing.R0.a("Failure occurred while trying to finish a future."));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.lang.Throwable f41451a;

    class a extends java.lang.Throwable {
        a(java.lang.String str) {
            super("Failure occurred while trying to finish a future.");
        }

        @Override // java.lang.Throwable
        public final synchronized java.lang.Throwable fillInStackTrace() {
            return this;
        }
    }

    R0(java.lang.Throwable th) {
        th.getClass();
        this.f41451a = th;
    }
}
