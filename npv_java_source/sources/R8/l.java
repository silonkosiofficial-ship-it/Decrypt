package R8;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class l {

    public static final class a implements R8.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p237x7.p f9770a;

        public a(p237x7.p pVar) {
            this.f9770a = pVar;
        }

        @Override // R8.h
        public java.util.Iterator iterator() {
            return R8.k.a(this.f9770a);
        }
    }

    public static java.util.Iterator a(p237x7.p pVar) {
        p247y7.AbstractC7350t.f(pVar, "block");
        R8.i iVar = new R8.i();
        iVar.e(p137n7.b.b(pVar, iVar, iVar));
        return iVar;
    }

    public static R8.h b(p237x7.p pVar) {
        p247y7.AbstractC7350t.f(pVar, "block");
        return new R8.l.a(pVar);
    }
}
