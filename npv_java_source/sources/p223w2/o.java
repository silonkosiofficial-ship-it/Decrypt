package p223w2;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final w2.o.b f56194e = new w2.o.b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f56195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.Map f56196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.Set f56197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.Set f56198d;

    public static final class a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final w2.o.a.C0742a f56199h = new w2.o.a.C0742a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.String f56200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final java.lang.String f56201b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f56202c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f56203d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final java.lang.String f56204e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f56205f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f56206g;

        /* JADX INFO: renamed from: w2.o$a$a, reason: collision with other inner class name */
        public static final class C0742a {
            private C0742a() {
            }

            public /* synthetic */ C0742a(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }
        }

        public a(java.lang.String str, java.lang.String str2, boolean z6, int i6, java.lang.String str3, int i10) {
            p247y7.AbstractC7350t.f(str, "name");
            p247y7.AbstractC7350t.f(str2, "type");
            this.f56200a = str;
            this.f56201b = str2;
            this.f56202c = z6;
            this.f56203d = i6;
            this.f56204e = str3;
            this.f56205f = i10;
            this.f56206g = p223w2.m.a(str2);
        }

        public final boolean a() {
            return this.f56203d > 0;
        }

        public boolean equals(java.lang.Object obj) {
            return p223w2.p.c(this, obj);
        }

        public int hashCode() {
            return p223w2.p.h(this);
        }

        public java.lang.String toString() {
            return p223w2.p.n(this);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p223w2.o a(p243y2.b bVar, java.lang.String str) {
            p247y7.AbstractC7350t.f(bVar, "connection");
            p247y7.AbstractC7350t.f(str, "tableName");
            return p223w2.m.g(bVar, str);
        }

        public final p223w2.o b(p253z2.d dVar, java.lang.String str) {
            p247y7.AbstractC7350t.f(dVar, "database");
            p247y7.AbstractC7350t.f(str, "tableName");
            return a(new p173r2.a(dVar), str);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.String f56207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final java.lang.String f56208b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final java.lang.String f56209c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final java.util.List f56210d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final java.util.List f56211e;

        public c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, java.util.List list2) {
            p247y7.AbstractC7350t.f(str, "referenceTable");
            p247y7.AbstractC7350t.f(str2, "onDelete");
            p247y7.AbstractC7350t.f(str3, "onUpdate");
            p247y7.AbstractC7350t.f(list, "columnNames");
            p247y7.AbstractC7350t.f(list2, "referenceColumnNames");
            this.f56207a = str;
            this.f56208b = str2;
            this.f56209c = str3;
            this.f56210d = list;
            this.f56211e = list2;
        }

        public boolean equals(java.lang.Object obj) {
            return p223w2.p.d(this, obj);
        }

        public int hashCode() {
            return p223w2.p.i(this);
        }

        public java.lang.String toString() {
            return p223w2.p.o(this);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final w2.o.d.a f56212e = new w2.o.d.a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.String f56213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f56214b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final java.util.List f56215c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public java.util.List f56216d;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }
        }

        public d(java.lang.String str, boolean z6, java.util.List list) {
            p247y7.AbstractC7350t.f(str, "name");
            p247y7.AbstractC7350t.f(list, "columns");
            int size = list.size();
            java.util.ArrayList arrayList = new java.util.ArrayList(size);
            for (int i6 = 0; i6 < size; i6++) {
                arrayList.add("ASC");
            }
            this(str, z6, list, arrayList);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        public d(java.lang.String str, boolean z6, java.util.List list, java.util.List list2) {
            p247y7.AbstractC7350t.f(str, "name");
            p247y7.AbstractC7350t.f(list, "columns");
            p247y7.AbstractC7350t.f(list2, "orders");
            this.f56213a = str;
            this.f56214b = z6;
            this.f56215c = list;
            this.f56216d = list2;
            java.util.List arrayList = list2;
            if (arrayList.isEmpty()) {
                int size = list.size();
                arrayList = new java.util.ArrayList(size);
                for (int i6 = 0; i6 < size; i6++) {
                    arrayList.add("ASC");
                }
            }
            this.f56216d = (java.util.List) arrayList;
        }

        public boolean equals(java.lang.Object obj) {
            return p223w2.p.e(this, obj);
        }

        public int hashCode() {
            return p223w2.p.j(this);
        }

        public java.lang.String toString() {
            return p223w2.p.p(this);
        }
    }

    public o(java.lang.String str, java.util.Map map, java.util.Set set, java.util.Set set2) {
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(map, "columns");
        p247y7.AbstractC7350t.f(set, "foreignKeys");
        this.f56195a = str;
        this.f56196b = map;
        this.f56197c = set;
        this.f56198d = set2;
    }

    public static final p223w2.o a(p253z2.d dVar, java.lang.String str) {
        return f56194e.b(dVar, str);
    }

    public boolean equals(java.lang.Object obj) {
        return p223w2.p.f(this, obj);
    }

    public int hashCode() {
        return p223w2.p.k(this);
    }

    public java.lang.String toString() {
        return p223w2.p.q(this);
    }
}
