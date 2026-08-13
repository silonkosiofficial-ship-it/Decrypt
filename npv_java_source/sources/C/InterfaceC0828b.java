package C;

/* JADX INFO: renamed from: C.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0828b {

    /* JADX INFO: renamed from: C.b$a */
    public static final class a implements C.InterfaceC0828b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f1062a;

        public a(int i6) {
            this.f1062a = i6;
            if (i6 > 0) {
                return;
            }
            throw new java.lang.IllegalArgumentException(("Provided count " + i6 + " should be larger than zero").toString());
        }

        @Override // C.InterfaceC0828b
        public java.util.List a(Y0.e eVar, int i6, int i10) {
            return C.AbstractC0834h.c(i6, this.f1062a, i10);
        }

        public boolean equals(java.lang.Object obj) {
            return (obj instanceof C.InterfaceC0828b.a) && this.f1062a == ((C.InterfaceC0828b.a) obj).f1062a;
        }

        public int hashCode() {
            return -this.f1062a;
        }
    }

    java.util.List a(Y0.e eVar, int i6, int i10);
}
