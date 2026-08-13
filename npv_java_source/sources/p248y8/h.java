package p248y8;

/* JADX INFO: loaded from: classes2.dex */
public interface h extends p248y8.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y8.h.a f57352a = y8.h.a.f57353a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ y8.h.a f57353a = new y8.h.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final p237x7.l f57354b = y8.h.a.C0759a.f57355D;

        /* JADX INFO: renamed from: y8.h$a$a, reason: collision with other inner class name */
        static final class C0759a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final y8.h.a.C0759a f57355D = new y8.h.a.C0759a();

            C0759a() {
                super(1);
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean l(p138n8.f fVar) {
                p247y7.AbstractC7350t.f(fVar, "it");
                return java.lang.Boolean.TRUE;
            }
        }

        private a() {
        }

        public final p237x7.l a() {
            return f57354b;
        }
    }

    public static final class b extends p248y8.i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final y8.h.b f57356b = new y8.h.b();

        private b() {
        }

        @Override // p248y8.i, p248y8.h
        public java.util.Set a() {
            return p097j7.Z.d();
        }

        @Override // p248y8.i, p248y8.h
        public java.util.Set d() {
            return p097j7.Z.d();
        }

        @Override // p248y8.i, p248y8.h
        public java.util.Set f() {
            return p097j7.Z.d();
        }
    }

    java.util.Set a();

    java.util.Collection b(p138n8.f fVar, W7.b bVar);

    java.util.Collection c(p138n8.f fVar, W7.b bVar);

    java.util.Set d();

    java.util.Set f();
}
