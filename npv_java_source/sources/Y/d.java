package Y;

/* JADX INFO: loaded from: classes.dex */
public interface d extends java.util.List, Y.b, p256z7.a {

    /* JADX INFO: Access modifiers changed from: private */
    static final class a extends p097j7.AbstractC6862d implements Y.d {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final Y.d f16194D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private final int f16195E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private final int f16196F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private int f16197G;

        public a(Y.d dVar, int i6, int i10) {
            this.f16194D = dVar;
            this.f16195E = i6;
            this.f16196F = i10;
            p021c0.d.c(i6, i10, dVar.size());
            this.f16197G = i10 - i6;
        }

        @Override // p097j7.AbstractC6860b
        public int e() {
            return this.f16197G;
        }

        @Override // p097j7.AbstractC6862d, java.util.List
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Y.d subList(int i6, int i10) {
            p021c0.d.c(i6, i10, this.f16197G);
            Y.d dVar = this.f16194D;
            int i11 = this.f16195E;
            return new Y.d.a(dVar, i6 + i11, i11 + i10);
        }

        @Override // p097j7.AbstractC6862d, java.util.List
        public java.lang.Object get(int i6) {
            p021c0.d.a(i6, this.f16197G);
            return this.f16194D.get(this.f16195E + i6);
        }
    }
}
