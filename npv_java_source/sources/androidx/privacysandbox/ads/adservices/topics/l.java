package androidx.privacysandbox.ads.adservices.topics;

/* JADX INFO: loaded from: classes.dex */
public final class l extends androidx.privacysandbox.ads.adservices.topics.t {
    /* JADX WARN: Illegal instructions before constructor call */
    public l(android.content.Context context) {
        p247y7.AbstractC7350t.f(context, "context");
        java.lang.Object systemService = context.getSystemService((java.lang.Class<java.lang.Object>) androidx.privacysandbox.ads.adservices.topics.e.a());
        p247y7.AbstractC7350t.e(systemService, "context.getSystemService…opicsManager::class.java)");
        super(androidx.privacysandbox.ads.adservices.topics.f.a(systemService));
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.t
    public android.adservices.topics.GetTopicsRequest c(androidx.privacysandbox.ads.adservices.topics.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "request");
        android.adservices.topics.GetTopicsRequest getTopicsRequestBuild = androidx.privacysandbox.ads.adservices.topics.k.a().setAdsSdkName(aVar.a()).setShouldRecordObservation(aVar.b()).build();
        p247y7.AbstractC7350t.e(getTopicsRequestBuild, "Builder()\n            .s…ion)\n            .build()");
        return getTopicsRequestBuild;
    }
}
