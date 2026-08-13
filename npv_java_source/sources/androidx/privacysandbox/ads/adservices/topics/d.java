package androidx.privacysandbox.ads.adservices.topics;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.privacysandbox.ads.adservices.topics.d.a f22895a = new androidx.privacysandbox.ads.adservices.topics.d.a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final androidx.privacysandbox.ads.adservices.topics.d a(android.content.Context context) {
            p247y7.AbstractC7350t.f(context, "context");
            p083i2.b bVar = p083i2.b.f46656a;
            if (bVar.a() >= 5) {
                return new androidx.privacysandbox.ads.adservices.topics.l(context);
            }
            if (bVar.a() == 4) {
                return new androidx.privacysandbox.ads.adservices.topics.g(context);
            }
            return null;
        }
    }

    public abstract java.lang.Object a(androidx.privacysandbox.ads.adservices.topics.a aVar, p127m7.e eVar);
}
