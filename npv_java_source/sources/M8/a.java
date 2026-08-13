package M8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements java.lang.Iterable, p256z7.a {

    /* JADX INFO: renamed from: M8.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0171a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f7076a;

        public AbstractC0171a(int i6) {
            this.f7076a = i6;
        }

        protected final java.lang.Object c(M8.a aVar) {
            p247y7.AbstractC7350t.f(aVar, "thisRef");
            return aVar.d().get(this.f7076a);
        }
    }

    protected abstract M8.c d();

    protected abstract M8.s e();

    protected final void f(F7.c cVar, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(cVar, "tClass");
        p247y7.AbstractC7350t.f(obj, "value");
        java.lang.String strB = cVar.b();
        p247y7.AbstractC7350t.c(strB);
        g(strB, obj);
    }

    protected abstract void g(java.lang.String str, java.lang.Object obj);

    public final boolean isEmpty() {
        return d().d() == 0;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return d().iterator();
    }
}
