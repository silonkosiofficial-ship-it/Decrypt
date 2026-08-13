package p019b9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p019b9.D f24335a = new p019b9.D("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p237x7.p f24336b = new p237x7.p() { // from class: b9.H
        @Override // p237x7.p
        public final java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            return p019b9.K.d(obj, (m7.i.b) obj2);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p237x7.p f24337c = new p237x7.p() { // from class: b9.I
        @Override // p237x7.p
        public final java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            return p019b9.K.e((W8.V0) obj, (m7.i.b) obj2);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p237x7.p f24338d = new p237x7.p() { // from class: b9.J
        @Override // p237x7.p
        public final java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            return p019b9.K.h((p019b9.Q) obj, (m7.i.b) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object d(java.lang.Object obj, m7.i.b bVar) {
        if (!(bVar instanceof W8.V0)) {
            return obj;
        }
        java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? bVar : java.lang.Integer.valueOf(iIntValue + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final W8.V0 e(W8.V0 v6, m7.i.b bVar) {
        if (v6 != null) {
            return v6;
        }
        if (bVar instanceof W8.V0) {
            return (W8.V0) bVar;
        }
        return null;
    }

    public static final void f(p127m7.i iVar, java.lang.Object obj) {
        if (obj == f24335a) {
            return;
        }
        if (obj instanceof p019b9.Q) {
            ((p019b9.Q) obj).b(iVar);
            return;
        }
        java.lang.Object objD = iVar.D(null, f24337c);
        p247y7.AbstractC7350t.d(objD, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((W8.V0) objD).c1(iVar, obj);
    }

    public static final java.lang.Object g(p127m7.i iVar) {
        java.lang.Object objD = iVar.D(0, f24336b);
        p247y7.AbstractC7350t.c(objD);
        return objD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p019b9.Q h(p019b9.Q q6, m7.i.b bVar) {
        if (bVar instanceof W8.V0) {
            W8.V0 v6 = (W8.V0) bVar;
            q6.a(v6, v6.P0(q6.f24345a));
        }
        return q6;
    }

    public static final java.lang.Object i(p127m7.i iVar, java.lang.Object obj) {
        if (obj == null) {
            obj = g(iVar);
        }
        if (obj == 0) {
            return f24335a;
        }
        if (obj instanceof java.lang.Integer) {
            return iVar.D(new p019b9.Q(iVar, ((java.lang.Number) obj).intValue()), f24338d);
        }
        p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((W8.V0) obj).P0(iVar);
    }
}
