package z5;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f57652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f57653b;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f57654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.util.Map f57655b = null;

        b(java.lang.String str) {
            this.f57654a = str;
        }

        public z5.c a() {
            return new z5.c(this.f57654a, this.f57655b == null ? java.util.Collections.emptyMap() : j$.util.DesugarCollections.unmodifiableMap(new java.util.HashMap(this.f57655b)));
        }

        public z5.c.b b(java.lang.annotation.Annotation annotation) {
            if (this.f57655b == null) {
                this.f57655b = new java.util.HashMap();
            }
            this.f57655b.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    private c(java.lang.String str, java.util.Map map) {
        this.f57652a = str;
        this.f57653b = map;
    }

    public static z5.c.b a(java.lang.String str) {
        return new z5.c.b(str);
    }

    public static z5.c d(java.lang.String str) {
        return new z5.c(str, java.util.Collections.emptyMap());
    }

    public java.lang.String b() {
        return this.f57652a;
    }

    public java.lang.annotation.Annotation c(java.lang.Class cls) {
        return (java.lang.annotation.Annotation) this.f57653b.get(cls);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5.c)) {
            return false;
        }
        z5.c cVar = (z5.c) obj;
        return this.f57652a.equals(cVar.f57652a) && this.f57653b.equals(cVar.f57653b);
    }

    public int hashCode() {
        return (this.f57652a.hashCode() * 31) + this.f57653b.hashCode();
    }

    public java.lang.String toString() {
        return "FieldDescriptor{name=" + this.f57652a + ", properties=" + this.f57653b.values() + "}";
    }
}
