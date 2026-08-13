package O0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O0.a f7941a = new O0.a();

    /* JADX INFO: renamed from: O0.a$a, reason: collision with other inner class name */
    public static final class C0191a extends android.text.SegmentFinder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ O0.f f7942a;

        C0191a(O0.f fVar) {
            this.f7942a = fVar;
        }

        public int nextEndBoundary(int i6) {
            return this.f7942a.d(i6);
        }

        public int nextStartBoundary(int i6) {
            return this.f7942a.a(i6);
        }

        public int previousEndBoundary(int i6) {
            return this.f7942a.b(i6);
        }

        public int previousStartBoundary(int i6) {
            return this.f7942a.c(i6);
        }
    }

    private a() {
    }

    public final android.text.SegmentFinder a(O0.f fVar) {
        return N0.AbstractC1365c.a(new O0.a.C0191a(fVar));
    }
}
