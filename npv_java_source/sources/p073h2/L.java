package p073h2;

/* JADX INFO: loaded from: classes.dex */
public abstract class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p073h2.C6639p f45982a = new p073h2.C6639p(h2.L.c.f45998D, null, 2, null);

    public static abstract class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h2.L.a.b f45983c = new h2.L.a.b(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f45984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f45985b;

        /* JADX INFO: renamed from: h2.L$a$a, reason: collision with other inner class name */
        public static final class C0531a extends h2.L.a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final java.lang.Object f45986d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0531a(java.lang.Object obj, int i6, boolean z6) {
                super(i6, z6, null);
                p247y7.AbstractC7350t.f(obj, "key");
                this.f45986d = obj;
            }

            @Override // h2.L.a
            public java.lang.Object a() {
                return this.f45986d;
            }
        }

        public static final class b {

            /* JADX INFO: renamed from: h2.L$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C0532a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f45987a;

                static {
                    int[] iArr = new int[p073h2.EnumC6642t.values().length];
                    try {
                        iArr[p073h2.EnumC6642t.REFRESH.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    try {
                        iArr[p073h2.EnumC6642t.PREPEND.ordinal()] = 2;
                    } catch (java.lang.NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[p073h2.EnumC6642t.APPEND.ordinal()] = 3;
                    } catch (java.lang.NoSuchFieldError unused3) {
                    }
                    f45987a = iArr;
                }
            }

            private b() {
            }

            public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }

            public final h2.L.a a(p073h2.EnumC6642t enumC6642t, java.lang.Object obj, int i6, boolean z6) {
                p247y7.AbstractC7350t.f(enumC6642t, "loadType");
                int i10 = h2.L.a.b.C0532a.f45987a[enumC6642t.ordinal()];
                if (i10 == 1) {
                    return new h2.L.a.d(obj, i6, z6);
                }
                if (i10 == 2) {
                    if (obj != null) {
                        return new h2.L.a.c(obj, i6, z6);
                    }
                    throw new java.lang.IllegalArgumentException("key cannot be null for prepend".toString());
                }
                if (i10 != 3) {
                    throw new p087i7.s();
                }
                if (obj != null) {
                    return new h2.L.a.C0531a(obj, i6, z6);
                }
                throw new java.lang.IllegalArgumentException("key cannot be null for append".toString());
            }
        }

        public static final class c extends h2.L.a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final java.lang.Object f45988d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(java.lang.Object obj, int i6, boolean z6) {
                super(i6, z6, null);
                p247y7.AbstractC7350t.f(obj, "key");
                this.f45988d = obj;
            }

            @Override // h2.L.a
            public java.lang.Object a() {
                return this.f45988d;
            }
        }

        public static final class d extends h2.L.a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final java.lang.Object f45989d;

            public d(java.lang.Object obj, int i6, boolean z6) {
                super(i6, z6, null);
                this.f45989d = obj;
            }

            @Override // h2.L.a
            public java.lang.Object a() {
                return this.f45989d;
            }
        }

        private a(int i6, boolean z6) {
            this.f45984a = i6;
            this.f45985b = z6;
        }

        public /* synthetic */ a(int i6, boolean z6, p247y7.AbstractC7342k abstractC7342k) {
            this(i6, z6);
        }

        public abstract java.lang.Object a();

        public final int b() {
            return this.f45984a;
        }
    }

    public static abstract class b {

        public static final class a extends h2.L.b {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            private final java.lang.Throwable f45990C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(java.lang.Throwable th) {
                super(null);
                p247y7.AbstractC7350t.f(th, "throwable");
                this.f45990C = th;
            }

            public final java.lang.Throwable d() {
                return this.f45990C;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h2.L.b.a) && p247y7.AbstractC7350t.b(this.f45990C, ((h2.L.b.a) obj).f45990C);
            }

            public int hashCode() {
                return this.f45990C.hashCode();
            }

            public java.lang.String toString() {
                return S8.r.q("LoadResult.Error(\n                    |   throwable: " + this.f45990C + "\n                    |) ", null, 1, null);
            }
        }

        /* JADX INFO: renamed from: h2.L$b$b, reason: collision with other inner class name */
        public static final class C0533b extends h2.L.b {
            public C0533b() {
                super(null);
            }

            public java.lang.String toString() {
                return "LoadResult.Invalid";
            }
        }

        public static final class c extends h2.L.b implements java.lang.Iterable, p256z7.a {

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            public static final h2.L.b.c.a f45991H = new h2.L.b.c.a(null);

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            private static final h2.L.b.c f45992I = new h2.L.b.c(p097j7.AbstractC6879v.m(), null, null, 0, 0);

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            private final java.util.List f45993C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            private final java.lang.Object f45994D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            private final java.lang.Object f45995E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            private final int f45996F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            private final int f45997G;

            public static final class a {
                private a() {
                }

                public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
                    this();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(java.util.List list, java.lang.Object obj, java.lang.Object obj2, int i6, int i10) {
                super(null);
                p247y7.AbstractC7350t.f(list, "data");
                this.f45993C = list;
                this.f45994D = obj;
                this.f45995E = obj2;
                this.f45996F = i6;
                this.f45997G = i10;
                if (i6 != Integer.MIN_VALUE && i6 < 0) {
                    throw new java.lang.IllegalArgumentException("itemsBefore cannot be negative".toString());
                }
                if (i10 != Integer.MIN_VALUE && i10 < 0) {
                    throw new java.lang.IllegalArgumentException("itemsAfter cannot be negative".toString());
                }
            }

            public final java.util.List d() {
                return this.f45993C;
            }

            public final int e() {
                return this.f45997G;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h2.L.b.c)) {
                    return false;
                }
                h2.L.b.c cVar = (h2.L.b.c) obj;
                return p247y7.AbstractC7350t.b(this.f45993C, cVar.f45993C) && p247y7.AbstractC7350t.b(this.f45994D, cVar.f45994D) && p247y7.AbstractC7350t.b(this.f45995E, cVar.f45995E) && this.f45996F == cVar.f45996F && this.f45997G == cVar.f45997G;
            }

            public final int f() {
                return this.f45996F;
            }

            public final java.lang.Object g() {
                return this.f45995E;
            }

            public int hashCode() {
                int iHashCode = this.f45993C.hashCode() * 31;
                java.lang.Object obj = this.f45994D;
                int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
                java.lang.Object obj2 = this.f45995E;
                return ((((iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f45996F) * 31) + this.f45997G;
            }

            @Override // java.lang.Iterable
            public java.util.Iterator iterator() {
                return this.f45993C.listIterator();
            }

            public final java.lang.Object o() {
                return this.f45994D;
            }

            public java.lang.String toString() {
                return S8.r.q("LoadResult.Page(\n                    |   data size: " + this.f45993C.size() + "\n                    |   first Item: " + p097j7.AbstractC6879v.k0(this.f45993C) + "\n                    |   last Item: " + p097j7.AbstractC6879v.v0(this.f45993C) + "\n                    |   nextKey: " + this.f45995E + "\n                    |   prevKey: " + this.f45994D + "\n                    |   itemsBefore: " + this.f45996F + "\n                    |   itemsAfter: " + this.f45997G + "\n                    |) ", null, 1, null);
            }
        }

        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final h2.L.c f45998D = new h2.L.c();

        c() {
            super(1);
        }

        public final void a(p237x7.a aVar) {
            p247y7.AbstractC7350t.f(aVar, "it");
            aVar.b();
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p237x7.a) obj);
            return p087i7.M.f46721a;
        }
    }

    public final boolean a() {
        return this.f45982a.a();
    }

    public abstract boolean b();

    public boolean c() {
        return false;
    }

    public abstract java.lang.Object d(p073h2.M m6);

    public final void e() {
        if (this.f45982a.b()) {
            p073h2.K k6 = p073h2.K.f45981a;
            if (k6.a(3)) {
                k6.b(3, "Invalidated PagingSource " + this, null);
            }
        }
    }

    public abstract java.lang.Object f(h2.L.a aVar, p127m7.e eVar);

    public final void g(p237x7.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "onInvalidatedCallback");
        this.f45982a.c(aVar);
    }

    public final void h(p237x7.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "onInvalidatedCallback");
        this.f45982a.d(aVar);
    }
}
