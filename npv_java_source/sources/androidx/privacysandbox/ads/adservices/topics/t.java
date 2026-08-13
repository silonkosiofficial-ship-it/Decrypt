package androidx.privacysandbox.ads.adservices.topics;

/* JADX INFO: loaded from: classes.dex */
public abstract class t extends androidx.privacysandbox.ads.adservices.topics.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.adservices.topics.TopicsManager f22896b;

    static final class a extends p147o7.d {

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        java.lang.Object f22897F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        /* synthetic */ java.lang.Object f22898G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        int f22900I;

        a(p127m7.e eVar) {
            super(eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            this.f22898G = obj;
            this.f22900I |= Integer.MIN_VALUE;
            return androidx.privacysandbox.ads.adservices.topics.t.e(androidx.privacysandbox.ads.adservices.topics.t.this, null, this);
        }
    }

    public t(android.adservices.topics.TopicsManager topicsManager) {
        p247y7.AbstractC7350t.f(topicsManager, "mTopicsManager");
        this.f22896b = topicsManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static /* synthetic */ java.lang.Object e(androidx.privacysandbox.ads.adservices.topics.t tVar, androidx.privacysandbox.ads.adservices.topics.a aVar, p127m7.e eVar) {
        androidx.privacysandbox.ads.adservices.topics.t.a aVar2;
        if (eVar instanceof androidx.privacysandbox.ads.adservices.topics.t.a) {
            aVar2 = (androidx.privacysandbox.ads.adservices.topics.t.a) eVar;
            int i6 = aVar2.f22900I;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar2.f22900I = i6 - Integer.MIN_VALUE;
            } else {
                aVar2 = tVar.new a(eVar);
            }
        } else {
            aVar2 = tVar.new a(eVar);
        }
        java.lang.Object objF = aVar2.f22898G;
        java.lang.Object objG = p137n7.b.g();
        int i10 = aVar2.f22900I;
        if (i10 == 0) {
            p087i7.x.b(objF);
            android.adservices.topics.GetTopicsRequest getTopicsRequestC = tVar.c(aVar);
            aVar2.f22897F = tVar;
            aVar2.f22900I = 1;
            objF = tVar.f(getTopicsRequestC, aVar2);
            if (objF == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tVar = (androidx.privacysandbox.ads.adservices.topics.t) aVar2.f22897F;
            p087i7.x.b(objF);
        }
        return tVar.d(androidx.privacysandbox.ads.adservices.topics.m.a(objF));
    }

    private final java.lang.Object f(android.adservices.topics.GetTopicsRequest getTopicsRequest, p127m7.e eVar) {
        W8.C1798n c1798n = new W8.C1798n(p137n7.b.d(eVar), 1);
        c1798n.E();
        this.f22896b.getTopics(getTopicsRequest, new p123m2.m(), androidx.core.os.r.a(c1798n));
        java.lang.Object objX = c1798n.x();
        if (objX == p137n7.b.g()) {
            p147o7.h.c(eVar);
        }
        return objX;
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.d
    public java.lang.Object a(androidx.privacysandbox.ads.adservices.topics.a aVar, p127m7.e eVar) {
        return e(this, aVar, eVar);
    }

    public android.adservices.topics.GetTopicsRequest c(androidx.privacysandbox.ads.adservices.topics.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "request");
        android.adservices.topics.GetTopicsRequest getTopicsRequestBuild = androidx.privacysandbox.ads.adservices.topics.k.a().setAdsSdkName(aVar.a()).build();
        p247y7.AbstractC7350t.e(getTopicsRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return getTopicsRequestBuild;
    }

    public final androidx.privacysandbox.ads.adservices.topics.b d(android.adservices.topics.GetTopicsResponse getTopicsResponse) {
        p247y7.AbstractC7350t.f(getTopicsResponse, "response");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = getTopicsResponse.getTopics().iterator();
        while (it.hasNext()) {
            android.adservices.topics.Topic topicA = androidx.privacysandbox.ads.adservices.topics.o.a(it.next());
            arrayList.add(new androidx.privacysandbox.ads.adservices.topics.c(topicA.getTaxonomyVersion(), topicA.getModelVersion(), topicA.getTopicId()));
        }
        return new androidx.privacysandbox.ads.adservices.topics.b(arrayList);
    }
}
