package p093j2;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.concurrent.futures.c.a f49259D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ W8.V f49260E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.concurrent.futures.c.a aVar, W8.V v6) {
            super(1);
            this.f49259D = aVar;
            this.f49260E = v6;
        }

        public final void a(java.lang.Throwable th) {
            if (th == null) {
                this.f49259D.b(this.f49260E.y());
            } else if (th instanceof java.util.concurrent.CancellationException) {
                this.f49259D.c();
            } else {
                this.f49259D.e(th);
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((java.lang.Throwable) obj);
            return p087i7.M.f46721a;
        }
    }

    public static final P4.d b(final W8.V v6, final java.lang.Object obj) {
        p247y7.AbstractC7350t.f(v6, "<this>");
        P4.d dVarA = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0397c() { // from class: j2.a
            @Override // androidx.concurrent.futures.c.InterfaceC0397c
            public final java.lang.Object a(androidx.concurrent.futures.c.a aVar) {
                return p093j2.b.d(v6, obj, aVar);
            }
        });
        p247y7.AbstractC7350t.e(dVarA, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return dVarA;
    }

    public static /* synthetic */ P4.d c(W8.V v6, java.lang.Object obj, int i6, java.lang.Object obj2) {
        if ((i6 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(v6, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object d(W8.V v6, java.lang.Object obj, androidx.concurrent.futures.c.a aVar) {
        p247y7.AbstractC7350t.f(v6, "$this_asListenableFuture");
        p247y7.AbstractC7350t.f(aVar, "completer");
        v6.e1(new j2.b.a(aVar, v6));
        return obj;
    }
}
