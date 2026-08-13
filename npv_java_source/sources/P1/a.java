package P1;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: P1.a$a, reason: collision with other inner class name */
    public static final class C0199a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final P1.a.C0199a f8273D = new P1.a.C0199a();

        C0199a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.List l(android.content.Context context) {
            p247y7.AbstractC7350t.f(context, "it");
            return p097j7.AbstractC6879v.m();
        }
    }

    public static final B7.c a(java.lang.String str, N1.b bVar, p237x7.l lVar, W8.N n6) {
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(lVar, "produceMigrations");
        p247y7.AbstractC7350t.f(n6, "scope");
        return new P1.c(str, bVar, lVar, n6);
    }

    public static /* synthetic */ B7.c b(java.lang.String str, N1.b bVar, p237x7.l lVar, W8.N n6, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            bVar = null;
        }
        if ((i6 & 4) != 0) {
            lVar = P1.a.C0199a.f8273D;
        }
        if ((i6 & 8) != 0) {
            n6 = W8.O.a(W8.C1779d0.b().o0(W8.U0.b(null, 1, null)));
        }
        return a(str, bVar, lVar, n6);
    }
}
