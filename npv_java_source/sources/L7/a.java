package L7;

/* JADX INFO: loaded from: classes2.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L7.a.C0154a f6239a = L7.a.C0154a.f6240a;

    /* JADX INFO: renamed from: L7.a$a, reason: collision with other inner class name */
    public static final class C0154a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ L7.a.C0154a f6240a = new L7.a.C0154a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final p087i7.InterfaceC6668n f6241b = p087i7.AbstractC6669o.a(p087i7.r.PUBLICATION, L7.a.C0154a.C0155a.f6242D);

        /* JADX INFO: renamed from: L7.a$a$a, reason: collision with other inner class name */
        static final class C0155a extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final L7.a.C0154a.C0155a f6242D = new L7.a.C0154a.C0155a();

            C0155a() {
                super(0);
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final L7.a b() {
                java.util.ServiceLoader serviceLoaderLoad = java.util.ServiceLoader.load(L7.a.class, L7.a.class.getClassLoader());
                p247y7.AbstractC7350t.c(serviceLoaderLoad);
                L7.a aVar = (L7.a) p097j7.AbstractC6879v.j0(serviceLoaderLoad);
                if (aVar != null) {
                    return aVar;
                }
                throw new java.lang.IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            }
        }

        private C0154a() {
        }

        public final L7.a a() {
            return (L7.a) f6241b.getValue();
        }
    }

    O7.L a(E8.n nVar, O7.G g6, java.lang.Iterable iterable, Q7.c cVar, Q7.a aVar, boolean z6);
}
