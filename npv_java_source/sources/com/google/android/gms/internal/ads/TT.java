package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class TT {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f31942a;

    TT(android.content.Context context) {
        this.f31942a = context;
    }

    public final P4.d a(boolean z6) {
        try {
            androidx.privacysandbox.ads.adservices.topics.a aVarA = new androidx.privacysandbox.ads.adservices.topics.a.C0433a().b("com.google.android.gms.ads").c(z6).a();
            p113l2.a aVarA2 = p113l2.a.a(this.f31942a);
            return aVarA2 != null ? aVarA2.b(aVarA) : com.google.android.gms.internal.ads.AbstractC2652Nk0.g(new java.lang.IllegalStateException());
        } catch (java.lang.Exception e6) {
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.g(e6);
        }
    }
}
