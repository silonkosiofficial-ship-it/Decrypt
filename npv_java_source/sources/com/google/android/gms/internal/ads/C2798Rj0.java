package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Rj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2798Rj0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final com.google.android.gms.internal.ads.C2798Rj0 f31343b = new com.google.android.gms.internal.ads.C2798Rj0(new com.google.android.gms.internal.ads.C2798Rj0.a("Failure occurred while trying to finish a future."));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.lang.Throwable f31344a;

    /* JADX INFO: renamed from: com.google.android.gms.internal.ads.Rj0$a */
    class a extends java.lang.Throwable {
        a(java.lang.String str) {
            super("Failure occurred while trying to finish a future.");
        }

        @Override // java.lang.Throwable
        public final synchronized java.lang.Throwable fillInStackTrace() {
            return this;
        }
    }

    C2798Rj0(java.lang.Throwable th) {
        th.getClass();
        this.f31344a = th;
    }
}
