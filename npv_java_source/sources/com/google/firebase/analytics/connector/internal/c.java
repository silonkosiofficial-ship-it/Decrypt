package com.google.firebase.analytics.connector.internal;

/* JADX INFO: loaded from: classes3.dex */
final class c implements p075h4.a.InterfaceC0560a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.google.firebase.analytics.connector.internal.d f43934a;

    public c(com.google.firebase.analytics.connector.internal.d dVar) {
        this.f43934a = dVar;
    }

    @Override // p085i4.t
    public final void a(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j6) {
        if (this.f43934a.f43935a.contains(str2)) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("events", com.google.firebase.analytics.connector.internal.a.c(str2));
            this.f43934a.f43936b.a(2, bundle2);
        }
    }
}
