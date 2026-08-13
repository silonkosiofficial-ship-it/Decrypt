package R8;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class r extends R8.m {

    public static final class a implements R8.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.util.Iterator f9773a;

        public a(java.util.Iterator it) {
            this.f9773a = it;
        }

        @Override // R8.h
        public java.util.Iterator iterator() {
            return this.f9773a;
        }
    }

    public static R8.h g(java.util.Iterator it) {
        p247y7.AbstractC7350t.f(it, "<this>");
        return h(new R8.r.a(it));
    }

    public static final R8.h h(R8.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "<this>");
        return hVar instanceof R8.a ? hVar : new R8.a(hVar);
    }

    public static R8.h i() {
        return R8.d.f9746a;
    }

    public static final R8.h j(R8.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "<this>");
        return k(hVar, new p237x7.l() { // from class: R8.p
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return R8.r.l((R8.h) obj);
            }
        });
    }

    private static final R8.h k(R8.h hVar, p237x7.l lVar) {
        return hVar instanceof R8.w ? ((R8.w) hVar).d(lVar) : new R8.f(hVar, new p237x7.l() { // from class: R8.q
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return R8.r.m(obj);
            }
        }, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Iterator l(R8.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "it");
        return hVar.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object m(java.lang.Object obj) {
        return obj;
    }

    public static R8.h n(final java.lang.Object obj, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(lVar, "nextFunction");
        return obj == null ? R8.d.f9746a : new R8.g(new p237x7.a() { // from class: R8.n
            @Override // p237x7.a
            public final java.lang.Object b() {
                return R8.r.q(obj);
            }
        }, lVar);
    }

    public static R8.h o(final p237x7.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "nextFunction");
        return h(new R8.g(aVar, new p237x7.l() { // from class: R8.o
            @Override // p237x7.l
            public final java.lang.Object l(java.lang.Object obj) {
                return R8.r.p(aVar, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object p(p237x7.a aVar, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(obj, "it");
        return aVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object q(java.lang.Object obj) {
        return obj;
    }

    public static final R8.h r(java.lang.Object... objArr) {
        p247y7.AbstractC7350t.f(objArr, "elements");
        return p097j7.AbstractC6872n.O(objArr);
    }
}
