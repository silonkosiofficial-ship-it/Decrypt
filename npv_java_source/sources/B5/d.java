package B5;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements A5.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final z5.d f792e = new z5.d() { // from class: B5.a
        @Override // z5.d
        public final void a(java.lang.Object obj, java.lang.Object obj2) {
            B5.d.l(obj, (z5.e) obj2);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final z5.f f793f = new z5.f() { // from class: B5.b
        @Override // z5.f
        public final void a(java.lang.Object obj, java.lang.Object obj2) {
            ((z5.g) obj2).e((java.lang.String) obj);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final z5.f f794g = new z5.f() { // from class: B5.c
        @Override // z5.f
        public final void a(java.lang.Object obj, java.lang.Object obj2) {
            B5.d.n((java.lang.Boolean) obj, (z5.g) obj2);
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final B5.d.b f795h = new B5.d.b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f796a = new java.util.HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f797b = new java.util.HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private z5.d f798c = f792e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f799d = false;

    class a implements z5.a {
        a() {
        }

        @Override // z5.a
        public void a(java.lang.Object obj, java.io.Writer writer) {
            B5.e eVar = new B5.e(writer, B5.d.this.f796a, B5.d.this.f797b, B5.d.this.f798c, B5.d.this.f799d);
            eVar.k(obj, false);
            eVar.u();
        }

        @Override // z5.a
        public java.lang.String b(java.lang.Object obj) {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            try {
                a(obj, stringWriter);
            } catch (java.io.IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    private static final class b implements z5.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final java.text.DateFormat f801a;

        static {
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", java.util.Locale.US);
            f801a = simpleDateFormat;
            simpleDateFormat.setTimeZone(j$.util.DesugarTimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        /* synthetic */ b(B5.d.a aVar) {
            this();
        }

        @Override // z5.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(java.util.Date date, z5.g gVar) {
            gVar.e(f801a.format(date));
        }
    }

    public d() {
        p(java.lang.String.class, f793f);
        p(java.lang.Boolean.class, f794g);
        p(java.util.Date.class, f795h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(java.lang.Object obj, z5.e eVar) {
        throw new z5.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(java.lang.Boolean bool, z5.g gVar) {
        gVar.f(bool.booleanValue());
    }

    public z5.a i() {
        return new B5.d.a();
    }

    public B5.d j(A5.a aVar) {
        aVar.a(this);
        return this;
    }

    public B5.d k(boolean z6) {
        this.f799d = z6;
        return this;
    }

    @Override // A5.b
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public B5.d a(java.lang.Class cls, z5.d dVar) {
        this.f796a.put(cls, dVar);
        this.f797b.remove(cls);
        return this;
    }

    public B5.d p(java.lang.Class cls, z5.f fVar) {
        this.f797b.put(cls, fVar);
        this.f796a.remove(cls);
        return this;
    }
}
