package C5;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f1321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f1322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z5.d f1323c;

    public static final class a implements A5.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final z5.d f1324d = new z5.d() { // from class: C5.g
            @Override // z5.d
            public final void a(java.lang.Object obj, java.lang.Object obj2) {
                C5.h.a.e(obj, (z5.e) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.Map f1325a = new java.util.HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.util.Map f1326b = new java.util.HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private z5.d f1327c = f1324d;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void e(java.lang.Object obj, z5.e eVar) {
            throw new z5.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public C5.h c() {
            return new C5.h(new java.util.HashMap(this.f1325a), new java.util.HashMap(this.f1326b), this.f1327c);
        }

        public C5.h.a d(A5.a aVar) {
            aVar.a(this);
            return this;
        }

        @Override // A5.b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public C5.h.a a(java.lang.Class cls, z5.d dVar) {
            this.f1325a.put(cls, dVar);
            this.f1326b.remove(cls);
            return this;
        }
    }

    h(java.util.Map map, java.util.Map map2, z5.d dVar) {
        this.f1321a = map;
        this.f1322b = map2;
        this.f1323c = dVar;
    }

    public static C5.h.a a() {
        return new C5.h.a();
    }

    public void b(java.lang.Object obj, java.io.OutputStream outputStream) {
        new C5.f(outputStream, this.f1321a, this.f1322b, this.f1323c).t(obj);
    }

    public byte[] c(java.lang.Object obj) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (java.io.IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
