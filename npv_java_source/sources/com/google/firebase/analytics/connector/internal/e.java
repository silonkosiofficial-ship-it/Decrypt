package com.google.firebase.analytics.connector.internal;

/* JADX INFO: loaded from: classes3.dex */
final class e implements p075h4.a.InterfaceC0560a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.google.firebase.analytics.connector.internal.f f43939a;

    public e(com.google.firebase.analytics.connector.internal.f fVar) {
        this.f43939a = fVar;
    }

    @Override // p085i4.t
    public final void a(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j6) {
        if (str == null || !com.google.firebase.analytics.connector.internal.a.i(str2)) {
            return;
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j6);
        bundle2.putBundle("params", bundle);
        this.f43939a.f43940a.a(3, bundle2);
    }
}
