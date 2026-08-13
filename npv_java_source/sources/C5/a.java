package C5;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C5.d.a f1303b = C5.d.a.DEFAULT;

    /* JADX INFO: renamed from: C5.a$a, reason: collision with other inner class name */
    private static final class C0021a implements C5.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f1304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C5.d.a f1305b;

        C0021a(int i6, C5.d.a aVar) {
            this.f1304a = i6;
            this.f1305b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public java.lang.Class annotationType() {
            return C5.d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5.d)) {
                return false;
            }
            C5.d dVar = (C5.d) obj;
            return this.f1304a == dVar.tag() && this.f1305b.equals(dVar.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f1304a) + (this.f1305b.hashCode() ^ 2041407134);
        }

        @Override // C5.d
        public C5.d.a intEncoding() {
            return this.f1305b;
        }

        @Override // C5.d
        public int tag() {
            return this.f1304a;
        }

        @Override // java.lang.annotation.Annotation
        public java.lang.String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f1304a + "intEncoding=" + this.f1305b + ')';
        }
    }

    public static C5.a b() {
        return new C5.a();
    }

    public C5.d a() {
        return new C5.a.C0021a(this.f1302a, this.f1303b);
    }

    public C5.a c(int i6) {
        this.f1302a = i6;
        return this;
    }
}
