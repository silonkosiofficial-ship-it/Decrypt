package p014b3;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p014b3.d f24159c = new b3.d.a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f24160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f24161b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f24162a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.util.List f24163b = new java.util.ArrayList();

        a() {
        }

        public p014b3.d a() {
            return new p014b3.d(this.f24162a, j$.util.DesugarCollections.unmodifiableList(this.f24163b));
        }

        public b3.d.a b(java.util.List list) {
            this.f24163b = list;
            return this;
        }

        public b3.d.a c(java.lang.String str) {
            this.f24162a = str;
            return this;
        }
    }

    d(java.lang.String str, java.util.List list) {
        this.f24160a = str;
        this.f24161b = list;
    }

    public static b3.d.a c() {
        return new b3.d.a();
    }

    public java.util.List a() {
        return this.f24161b;
    }

    public java.lang.String b() {
        return this.f24160a;
    }
}
