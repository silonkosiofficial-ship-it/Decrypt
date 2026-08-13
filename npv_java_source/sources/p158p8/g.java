package p158p8;

/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p158p8.g f52791b = new p158p8.g(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f52792a;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.Object f52793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f52794b;

        a(java.lang.Object obj, int i6) {
            this.f52793a = obj;
            this.f52794b = i6;
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof p8.g.a)) {
                return false;
            }
            p8.g.a aVar = (p8.g.a) obj;
            return this.f52793a == aVar.f52793a && this.f52794b == aVar.f52794b;
        }

        public int hashCode() {
            return (java.lang.System.identityHashCode(this.f52793a) * 65535) + this.f52794b;
        }
    }

    g() {
        this.f52792a = new java.util.HashMap();
    }

    private g(boolean z6) {
        this.f52792a = java.util.Collections.emptyMap();
    }

    public static p158p8.g c() {
        return f52791b;
    }

    public static p158p8.g d() {
        return new p158p8.g();
    }

    public final void a(p8.i.f fVar) {
        this.f52792a.put(new p8.g.a(fVar.b(), fVar.d()), fVar);
    }

    public p8.i.f b(p158p8.p pVar, int i6) {
        return (p8.i.f) this.f52792a.get(new p8.g.a(pVar, i6));
    }
}
