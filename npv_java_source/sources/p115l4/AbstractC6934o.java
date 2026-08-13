package p115l4;

/* JADX INFO: renamed from: l4.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6934o {
    public static java.lang.Object a(p115l4.AbstractC6931l abstractC6931l) throws java.lang.InterruptedException {
        Q3.AbstractC1477p.j();
        Q3.AbstractC1477p.h();
        Q3.AbstractC1477p.m(abstractC6931l, "Task must not be null");
        if (abstractC6931l.n()) {
            return k(abstractC6931l);
        }
        p115l4.s sVar = new p115l4.s(null);
        l(abstractC6931l, sVar);
        sVar.c();
        return k(abstractC6931l);
    }

    public static java.lang.Object b(p115l4.AbstractC6931l abstractC6931l, long j6, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.TimeoutException {
        Q3.AbstractC1477p.j();
        Q3.AbstractC1477p.h();
        Q3.AbstractC1477p.m(abstractC6931l, "Task must not be null");
        Q3.AbstractC1477p.m(timeUnit, "TimeUnit must not be null");
        if (abstractC6931l.n()) {
            return k(abstractC6931l);
        }
        p115l4.s sVar = new p115l4.s(null);
        l(abstractC6931l, sVar);
        if (sVar.e(j6, timeUnit)) {
            return k(abstractC6931l);
        }
        throw new java.util.concurrent.TimeoutException("Timed out waiting for Task");
    }

    public static p115l4.AbstractC6931l c(java.util.concurrent.Executor executor, java.util.concurrent.Callable callable) {
        Q3.AbstractC1477p.m(executor, "Executor must not be null");
        Q3.AbstractC1477p.m(callable, "Callback must not be null");
        p115l4.P p6 = new p115l4.P();
        executor.execute(new p115l4.Q(p6, callable));
        return p6;
    }

    public static p115l4.AbstractC6931l d(java.lang.Exception exc) {
        p115l4.P p6 = new p115l4.P();
        p6.r(exc);
        return p6;
    }

    public static p115l4.AbstractC6931l e(java.lang.Object obj) {
        p115l4.P p6 = new p115l4.P();
        p6.s(obj);
        return p6;
    }

    public static p115l4.AbstractC6931l f(java.util.Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return e(null);
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((p115l4.AbstractC6931l) it.next()) == null) {
                throw new java.lang.NullPointerException("null tasks are not accepted");
            }
        }
        p115l4.P p6 = new p115l4.P();
        p115l4.u uVar = new p115l4.u(collection.size(), p6);
        java.util.Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            l((p115l4.AbstractC6931l) it2.next(), uVar);
        }
        return p6;
    }

    public static p115l4.AbstractC6931l g(p115l4.AbstractC6931l... abstractC6931lArr) {
        return (abstractC6931lArr == null || abstractC6931lArr.length == 0) ? e(null) : f(java.util.Arrays.asList(abstractC6931lArr));
    }

    public static p115l4.AbstractC6931l h(java.util.Collection collection) {
        return i(p115l4.AbstractC6933n.f50027a, collection);
    }

    public static p115l4.AbstractC6931l i(java.util.concurrent.Executor executor, java.util.Collection collection) {
        return (collection == null || collection.isEmpty()) ? e(java.util.Collections.emptyList()) : f(collection).i(executor, new p115l4.C6936q(collection));
    }

    public static p115l4.AbstractC6931l j(p115l4.AbstractC6931l... abstractC6931lArr) {
        return (abstractC6931lArr == null || abstractC6931lArr.length == 0) ? e(java.util.Collections.emptyList()) : h(java.util.Arrays.asList(abstractC6931lArr));
    }

    private static java.lang.Object k(p115l4.AbstractC6931l abstractC6931l) throws java.util.concurrent.ExecutionException {
        if (abstractC6931l.o()) {
            return abstractC6931l.l();
        }
        if (abstractC6931l.m()) {
            throw new java.util.concurrent.CancellationException("Task is already canceled");
        }
        throw new java.util.concurrent.ExecutionException(abstractC6931l.k());
    }

    private static void l(p115l4.AbstractC6931l abstractC6931l, p115l4.t tVar) {
        java.util.concurrent.Executor executor = p115l4.AbstractC6933n.f50028b;
        abstractC6931l.f(executor, tVar);
        abstractC6931l.d(executor, tVar);
        abstractC6931l.a(executor, tVar);
    }
}
