package p041e0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: e0.a$a, reason: collision with other inner class name */
    static final class C0492a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.p f44467D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0492a(p237x7.p pVar) {
            super(2);
            this.f44467D = pVar;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(p041e0.l lVar, java.lang.Object obj) {
            java.util.List list = (java.util.List) this.f44467D.u(lVar, obj);
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                java.lang.Object obj2 = list.get(i6);
                if (obj2 != null && !lVar.a(obj2)) {
                    throw new java.lang.IllegalArgumentException("item can't be saved".toString());
                }
            }
            java.util.List list2 = list;
            if (!list2.isEmpty()) {
                return new java.util.ArrayList(list2);
            }
            return null;
        }
    }

    public static final p041e0.j a(p237x7.p pVar, p237x7.l lVar) {
        p041e0.a.C0492a c0492a = new p041e0.a.C0492a(pVar);
        p247y7.AbstractC7350t.d(lVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>");
        return p041e0.k.a(c0492a, (p237x7.l) p247y7.W.f(lVar, 1));
    }
}
