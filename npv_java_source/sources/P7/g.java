package P7;

/* JADX INFO: loaded from: classes2.dex */
public interface g extends java.lang.Iterable, p256z7.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final P7.g.a f8385d = P7.g.a.f8386a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ P7.g.a f8386a = new P7.g.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final P7.g f8387b = new P7.g.a.C0200a();

        /* JADX INFO: renamed from: P7.g$a$a, reason: collision with other inner class name */
        public static final class C0200a implements P7.g {
            C0200a() {
            }

            @Override // P7.g
            public boolean H(p138n8.c cVar) {
                return P7.g.b.b(this, cVar);
            }

            public java.lang.Void d(p138n8.c cVar) {
                p247y7.AbstractC7350t.f(cVar, "fqName");
                return null;
            }

            @Override // P7.g
            public boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public java.util.Iterator iterator() {
                return p097j7.AbstractC6879v.m().iterator();
            }

            @Override // P7.g
            public /* bridge */ /* synthetic */ P7.c j(p138n8.c cVar) {
                return (P7.c) d(cVar);
            }

            public java.lang.String toString() {
                return "EMPTY";
            }
        }

        private a() {
        }

        public final P7.g a(java.util.List list) {
            p247y7.AbstractC7350t.f(list, "annotations");
            return list.isEmpty() ? f8387b : new P7.h(list);
        }

        public final P7.g b() {
            return f8387b;
        }
    }

    public static final class b {
        public static P7.c a(P7.g gVar, p138n8.c cVar) {
            java.lang.Object next;
            p247y7.AbstractC7350t.f(cVar, "fqName");
            java.util.Iterator it = gVar.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (p247y7.AbstractC7350t.b(((P7.c) next).e(), cVar)) {
                    return (P7.c) next;
                }
            }
            next = null;
            return (P7.c) next;
        }

        public static boolean b(P7.g gVar, p138n8.c cVar) {
            p247y7.AbstractC7350t.f(cVar, "fqName");
            return gVar.j(cVar) != null;
        }
    }

    boolean H(p138n8.c cVar);

    boolean isEmpty();

    P7.c j(p138n8.c cVar);
}
