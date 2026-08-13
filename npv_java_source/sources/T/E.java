package T;

/* JADX INFO: loaded from: classes.dex */
public final class E extends p247y7.AbstractC7352v implements p237x7.q {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final T.E f12777D = new T.E();

    public E() {
        super(3);
    }

    public final p200u.I a(u.s0.b bVar, V.InterfaceC1734n interfaceC1734n, int i6) {
        p200u.I iK;
        interfaceC1734n.T(-1154662212);
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.Q(-1154662212, i6, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:367)");
        }
        T.p pVar = T.p.Focused;
        T.p pVar2 = T.p.UnfocusedEmpty;
        if (bVar.c(pVar, pVar2)) {
            iK = p200u.AbstractC7177k.l(67, 0, p200u.H.e(), 2, null);
        } else {
            iK = (bVar.c(pVar2, pVar) || bVar.c(T.p.UnfocusedNotEmpty, pVar2)) ? p200u.AbstractC7177k.k(83, 67, p200u.H.e()) : p200u.AbstractC7177k.j(0.0f, 0.0f, null, 7, null);
        }
        if (V.AbstractC1741q.H()) {
            V.AbstractC1741q.P();
        }
        interfaceC1734n.J();
        return iK;
    }

    @Override // p237x7.q
    public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return a((u.s0.b) obj, (V.InterfaceC1734n) obj2, ((java.lang.Number) obj3).intValue());
    }
}
