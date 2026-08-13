package F1;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F1.f.c f2737a;

    private static final class a implements F1.f.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final android.view.inputmethod.InputContentInfo f2738a;

        a(android.net.Uri uri, android.content.ClipDescription clipDescription, android.net.Uri uri2) {
            this.f2738a = new android.view.inputmethod.InputContentInfo(uri, clipDescription, uri2);
        }

        a(java.lang.Object obj) {
            this.f2738a = (android.view.inputmethod.InputContentInfo) obj;
        }

        @Override // F1.f.c
        public android.net.Uri a() {
            return this.f2738a.getContentUri();
        }

        @Override // F1.f.c
        public void b() {
            this.f2738a.requestPermission();
        }

        @Override // F1.f.c
        public android.net.Uri c() {
            return this.f2738a.getLinkUri();
        }

        @Override // F1.f.c
        public java.lang.Object d() {
            return this.f2738a;
        }

        @Override // F1.f.c
        public android.content.ClipDescription getDescription() {
            return this.f2738a.getDescription();
        }
    }

    private static final class b implements F1.f.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.net.Uri f2739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final android.content.ClipDescription f2740b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final android.net.Uri f2741c;

        b(android.net.Uri uri, android.content.ClipDescription clipDescription, android.net.Uri uri2) {
            this.f2739a = uri;
            this.f2740b = clipDescription;
            this.f2741c = uri2;
        }

        @Override // F1.f.c
        public android.net.Uri a() {
            return this.f2739a;
        }

        @Override // F1.f.c
        public void b() {
        }

        @Override // F1.f.c
        public android.net.Uri c() {
            return this.f2741c;
        }

        @Override // F1.f.c
        public java.lang.Object d() {
            return null;
        }

        @Override // F1.f.c
        public android.content.ClipDescription getDescription() {
            return this.f2740b;
        }
    }

    private interface c {
        android.net.Uri a();

        void b();

        android.net.Uri c();

        java.lang.Object d();

        android.content.ClipDescription getDescription();
    }

    private f(F1.f.c cVar) {
        this.f2737a = cVar;
    }

    public f(android.net.Uri uri, android.content.ClipDescription clipDescription, android.net.Uri uri2) {
        this.f2737a = android.os.Build.VERSION.SDK_INT >= 25 ? new F1.f.a(uri, clipDescription, uri2) : new F1.f.b(uri, clipDescription, uri2);
    }

    public static F1.f f(java.lang.Object obj) {
        if (obj != null && android.os.Build.VERSION.SDK_INT >= 25) {
            return new F1.f(new F1.f.a(obj));
        }
        return null;
    }

    public android.net.Uri a() {
        return this.f2737a.a();
    }

    public android.content.ClipDescription b() {
        return this.f2737a.getDescription();
    }

    public android.net.Uri c() {
        return this.f2737a.c();
    }

    public void d() {
        this.f2737a.b();
    }

    public java.lang.Object e() {
        return this.f2737a.d();
    }
}
