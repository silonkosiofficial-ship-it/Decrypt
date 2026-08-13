package p113l2;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l2.a.b f49983a = new l2.a.b(null);

    /* JADX INFO: renamed from: l2.a$a, reason: collision with other inner class name */
    private static final class C0632a extends p113l2.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.privacysandbox.ads.adservices.topics.d f49984b;

        /* JADX INFO: renamed from: l2.a$a$a, reason: collision with other inner class name */
        static final class C0633a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f49985G;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ androidx.privacysandbox.ads.adservices.topics.a f49987I;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0633a(androidx.privacysandbox.ads.adservices.topics.a aVar, p127m7.e eVar) {
                super(2, eVar);
                this.f49987I = aVar;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f49985G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    androidx.privacysandbox.ads.adservices.topics.d dVar = p113l2.a.C0632a.this.f49984b;
                    androidx.privacysandbox.ads.adservices.topics.a aVar = this.f49987I;
                    this.f49985G = 1;
                    obj = dVar.a(aVar, this);
                    if (obj == objG) {
                        return objG;
                    }
                } else {
                    if (i6 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj);
                }
                return obj;
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
                return ((p113l2.a.C0632a.C0633a) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return p113l2.a.C0632a.this.new C0633a(this.f49987I, eVar);
            }
        }

        public C0632a(androidx.privacysandbox.ads.adservices.topics.d dVar) {
            p247y7.AbstractC7350t.f(dVar, "mTopicsManager");
            this.f49984b = dVar;
        }

        @Override // p113l2.a
        public P4.d b(androidx.privacysandbox.ads.adservices.topics.a aVar) {
            p247y7.AbstractC7350t.f(aVar, "request");
            return p093j2.b.c(W8.AbstractC1788i.b(W8.O.a(W8.C1779d0.c()), null, null, new p113l2.a.C0632a.C0633a(aVar, null), 3, null), null, 1, null);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p113l2.a a(android.content.Context context) {
            p247y7.AbstractC7350t.f(context, "context");
            androidx.privacysandbox.ads.adservices.topics.d dVarA = androidx.privacysandbox.ads.adservices.topics.d.f22895a.a(context);
            if (dVarA != null) {
                return new p113l2.a.C0632a(dVarA);
            }
            return null;
        }
    }

    public static final p113l2.a a(android.content.Context context) {
        return f49983a.a(context);
    }

    public abstract P4.d b(androidx.privacysandbox.ads.adservices.topics.a aVar);
}
