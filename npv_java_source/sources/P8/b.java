package P8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    static class a extends P8.b.AbstractC0201b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p237x7.l f8470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean[] f8471b;

        a(p237x7.l lVar, boolean[] zArr) {
            this.f8470a = lVar;
            this.f8471b = zArr;
        }

        @Override // P8.b.d
        public boolean c(java.lang.Object obj) {
            if (((java.lang.Boolean) this.f8470a.l(obj)).booleanValue()) {
                this.f8471b[0] = true;
            }
            return !this.f8471b[0];
        }

        @Override // P8.b.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public java.lang.Boolean a() {
            return java.lang.Boolean.valueOf(this.f8471b[0]);
        }
    }

    /* JADX INFO: renamed from: P8.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0201b implements P8.b.d {
        @Override // P8.b.d
        public void b(java.lang.Object obj) {
        }
    }

    public interface c {
        java.lang.Iterable a(java.lang.Object obj);
    }

    public interface d {
        java.lang.Object a();

        void b(java.lang.Object obj);

        boolean c(java.lang.Object obj);
    }

    public interface e {
        boolean a(java.lang.Object obj);
    }

    public static class f implements P8.b.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.Set f8472a;

        public f() {
            this(new java.util.HashSet());
        }

        public f(java.util.Set set) {
            if (set == null) {
                b(0);
            }
            this.f8472a = set;
        }

        private static /* synthetic */ void b(int i6) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "visited", "kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet", "<init>"));
        }

        @Override // P8.b.e
        public boolean a(java.lang.Object obj) {
            return this.f8472a.add(obj);
        }
    }

    private static /* synthetic */ void a(int i6) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        switch (i6) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i6) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static java.lang.Object b(java.util.Collection collection, P8.b.c cVar, P8.b.d dVar) {
        if (collection == null) {
            a(4);
        }
        if (cVar == null) {
            a(5);
        }
        if (dVar == null) {
            a(6);
        }
        return c(collection, cVar, new P8.b.f(), dVar);
    }

    public static java.lang.Object c(java.util.Collection collection, P8.b.c cVar, P8.b.e eVar, P8.b.d dVar) {
        if (collection == null) {
            a(0);
        }
        if (cVar == null) {
            a(1);
        }
        if (eVar == null) {
            a(2);
        }
        if (dVar == null) {
            a(3);
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            d(it.next(), cVar, eVar, dVar);
        }
        return dVar.a();
    }

    public static void d(java.lang.Object obj, P8.b.c cVar, P8.b.e eVar, P8.b.d dVar) {
        if (obj == null) {
            a(22);
        }
        if (cVar == null) {
            a(23);
        }
        if (eVar == null) {
            a(24);
        }
        if (dVar == null) {
            a(25);
        }
        if (eVar.a(obj) && dVar.c(obj)) {
            java.util.Iterator it = cVar.a(obj).iterator();
            while (it.hasNext()) {
                d(it.next(), cVar, eVar, dVar);
            }
            dVar.b(obj);
        }
    }

    public static java.lang.Boolean e(java.util.Collection collection, P8.b.c cVar, p237x7.l lVar) {
        if (collection == null) {
            a(7);
        }
        if (cVar == null) {
            a(8);
        }
        if (lVar == null) {
            a(9);
        }
        return (java.lang.Boolean) b(collection, cVar, new P8.b.a(lVar, new boolean[1]));
    }
}
