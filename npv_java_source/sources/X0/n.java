package X0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class n {

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ X0.o f15644D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(X0.o oVar) {
            super(0);
            this.f15644D = oVar;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Float b() {
            return java.lang.Float.valueOf(this.f15644D.a());
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ X0.o f15645D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(X0.o oVar) {
            super(0);
            this.f15645D = oVar;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X0.o b() {
            return this.f15645D;
        }
    }

    public static X0.o a(X0.o oVar, X0.o oVar2) {
        boolean z6 = oVar2 instanceof X0.c;
        if (z6 && (oVar instanceof X0.c)) {
            return new X0.c(((X0.c) oVar2).b(), X0.m.d(oVar2.a(), new X0.n.a(oVar)));
        }
        if (!z6 || (oVar instanceof X0.c)) {
            return (z6 || !(oVar instanceof X0.c)) ? oVar2.d(new X0.n.b(oVar)) : oVar;
        }
        return oVar2;
    }

    public static X0.o b(X0.o oVar, p237x7.a aVar) {
        return !p247y7.AbstractC7350t.b(oVar, X0.o.b.f15648b) ? oVar : (X0.o) aVar.b();
    }
}
