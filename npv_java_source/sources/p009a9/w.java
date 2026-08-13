package p009a9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p237x7.q f17231a;

    /* synthetic */ class a extends p247y7.C7348q implements p237x7.q {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final a9.w.a f17232L = new a9.w.a();

        a() {
            super(3, Z8.InterfaceC1870g.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // p237x7.q
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object j(Z8.InterfaceC1870g interfaceC1870g, java.lang.Object obj, p127m7.e eVar) {
            return interfaceC1870g.a(obj, eVar);
        }
    }

    static {
        a9.w.a aVar = a9.w.a.f17232L;
        p247y7.AbstractC7350t.d(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f17231a = (p237x7.q) p247y7.W.f(aVar, 3);
    }
}
