package p106k5;

/* JADX INFO: loaded from: classes3.dex */
class A implements java.lang.Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k5.A.a f49538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p186s5.j f49539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Thread.UncaughtExceptionHandler f49540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p076h5.a f49541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f49542e = new java.util.concurrent.atomic.AtomicBoolean(false);

    interface a {
        void a(p186s5.j jVar, java.lang.Thread thread, java.lang.Throwable th);
    }

    public A(k5.A.a aVar, p186s5.j jVar, java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler, p076h5.a aVar2) {
        this.f49538a = aVar;
        this.f49539b = jVar;
        this.f49540c = uncaughtExceptionHandler;
        this.f49541d = aVar2;
    }

    private boolean b(java.lang.Thread thread, java.lang.Throwable th) {
        if (thread == null) {
            p076h5.g.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th == null) {
            p076h5.g.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.f49541d.c()) {
            return true;
        }
        p076h5.g.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    boolean a() {
        return this.f49542e.get();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:568)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:594)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        this.f49542e.set(true);
        try {
            try {
                if (b(thread, th)) {
                    this.f49538a.a(this.f49539b, thread, th);
                } else {
                    p076h5.g.f().b("Uncaught exception will not be recorded by Crashlytics.");
                }
                if (this.f49540c != null) {
                    p076h5.g.f().b("Completed exception processing. Invoking default exception handler.");
                    this.f49540c.uncaughtException(thread, th);
                } else {
                    p076h5.g.f().b("Completed exception processing, but no default exception handler.");
                    java.lang.System.exit(1);
                }
            } catch (java.lang.Exception e6) {
                p076h5.g.f().e("An error occurred in the uncaught exception handler", e6);
                if (this.f49540c == null) {
                    p076h5.g.f().b("Completed exception processing, but no default exception handler.");
                    java.lang.System.exit(1);
                }
            }
            this.f49542e.set(false);
        } catch (java.lang.Throwable th2) {
            if (this.f49540c != null) {
                p076h5.g.f().b("Completed exception processing. Invoking default exception handler.");
                this.f49540c.uncaughtException(thread, th);
            } else {
                p076h5.g.f().b("Completed exception processing, but no default exception handler.");
                java.lang.System.exit(1);
            }
            this.f49542e.set(false);
            throw th2;
        }
    }
}
