package p056f5;

/* JADX INFO: loaded from: classes3.dex */
final class k implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final java.util.logging.Logger f45268H = java.util.logging.Logger.getLogger(p056f5.k.class.getName());

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.concurrent.Executor f45269C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.Deque f45270D = new java.util.ArrayDeque();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private f5.k.c f45271E = f5.k.c.IDLE;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private long f45272F = 0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final f5.k.b f45273G = new f5.k.b(this, null);

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ java.lang.Runnable f45274C;

        a(java.lang.Runnable runnable) {
            this.f45274C = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f45274C.run();
        }

        public java.lang.String toString() {
            return this.f45274C.toString();
        }
    }

    private final class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        java.lang.Runnable f45276C;

        private b() {
        }

        /* synthetic */ b(p056f5.k kVar, f5.k.a aVar) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        
            if (r1 == false) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
        
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        
            r8.f45276C.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
        
            p056f5.k.f45268H.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f45276C, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
        
            r8.f45276C = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void a() {
            /*
                r8 = this;
                r0 = 0
                r1 = r0
            L2:
                f5.k r2 = p056f5.k.this     // Catch: java.lang.Throwable -> L5e
                java.util.Deque r2 = p056f5.k.b(r2)     // Catch: java.lang.Throwable -> L5e
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L5e
                if (r0 != 0) goto L2d
                f5.k r0 = p056f5.k.this     // Catch: java.lang.Throwable -> L20
                f5.k$c r0 = p056f5.k.c(r0)     // Catch: java.lang.Throwable -> L20
                f5.k$c r3 = f5.k.c.RUNNING     // Catch: java.lang.Throwable -> L20
                if (r0 != r3) goto L22
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L1f
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1f:
                return
            L20:
                r0 = move-exception
                goto L83
            L22:
                f5.k r0 = p056f5.k.this     // Catch: java.lang.Throwable -> L20
                p056f5.k.e(r0)     // Catch: java.lang.Throwable -> L20
                f5.k r0 = p056f5.k.this     // Catch: java.lang.Throwable -> L20
                p056f5.k.d(r0, r3)     // Catch: java.lang.Throwable -> L20
                r0 = 1
            L2d:
                f5.k r3 = p056f5.k.this     // Catch: java.lang.Throwable -> L20
                java.util.Deque r3 = p056f5.k.b(r3)     // Catch: java.lang.Throwable -> L20
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
                r8.f45276C = r3     // Catch: java.lang.Throwable -> L20
                if (r3 != 0) goto L4f
                f5.k r0 = p056f5.k.this     // Catch: java.lang.Throwable -> L20
                f5.k$c r3 = f5.k.c.IDLE     // Catch: java.lang.Throwable -> L20
                p056f5.k.d(r0, r3)     // Catch: java.lang.Throwable -> L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L4e
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L4e:
                return
            L4f:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L5e
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.f45276C     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
                r3.run()     // Catch: java.lang.Throwable -> L60 java.lang.RuntimeException -> L62
            L5b:
                r8.f45276C = r2     // Catch: java.lang.Throwable -> L5e
                goto L2
            L5e:
                r0 = move-exception
                goto L85
            L60:
                r0 = move-exception
                goto L80
            L62:
                r3 = move-exception
                java.util.logging.Logger r4 = p056f5.k.f()     // Catch: java.lang.Throwable -> L60
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L60
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
                r6.<init>()     // Catch: java.lang.Throwable -> L60
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L60
                java.lang.Runnable r7 = r8.f45276C     // Catch: java.lang.Throwable -> L60
                r6.append(r7)     // Catch: java.lang.Throwable -> L60
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L60
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L60
                goto L5b
            L80:
                r8.f45276C = r2     // Catch: java.lang.Throwable -> L5e
                throw r0     // Catch: java.lang.Throwable -> L5e
            L83:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                throw r0     // Catch: java.lang.Throwable -> L5e
            L85:
                if (r1 == 0) goto L8e
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L8e:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: f5.k.b.a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (java.lang.Error e6) {
                synchronized (p056f5.k.this.f45270D) {
                    p056f5.k.this.f45271E = f5.k.c.IDLE;
                    throw e6;
                }
            }
        }

        public java.lang.String toString() {
            java.lang.Runnable runnable = this.f45276C;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + p056f5.k.this.f45271E + "}";
        }
    }

    enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    k(java.util.concurrent.Executor executor) {
        this.f45269C = (java.util.concurrent.Executor) Q3.AbstractC1477p.l(executor);
    }

    static /* synthetic */ long e(p056f5.k kVar) {
        long j6 = kVar.f45272F;
        kVar.f45272F = 1 + j6;
        return j6;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        f5.k.c cVar;
        boolean z6;
        Q3.AbstractC1477p.l(runnable);
        synchronized (this.f45270D) {
            f5.k.c cVar2 = this.f45271E;
            if (cVar2 != f5.k.c.RUNNING && cVar2 != (cVar = f5.k.c.QUEUED)) {
                long j6 = this.f45272F;
                f5.k.a aVar = new f5.k.a(runnable);
                this.f45270D.add(aVar);
                f5.k.c cVar3 = f5.k.c.QUEUING;
                this.f45271E = cVar3;
                try {
                    this.f45269C.execute(this.f45273G);
                    if (this.f45271E != cVar3) {
                        return;
                    }
                    synchronized (this.f45270D) {
                        try {
                            if (this.f45272F == j6 && this.f45271E == cVar3) {
                                this.f45271E = cVar;
                            }
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (java.lang.Error | java.lang.RuntimeException e6) {
                    synchronized (this.f45270D) {
                        try {
                            f5.k.c cVar4 = this.f45271E;
                            if (cVar4 != f5.k.c.IDLE && cVar4 != f5.k.c.QUEUING) {
                                z6 = false;
                            } else if (this.f45270D.removeLastOccurrence(aVar)) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (!(e6 instanceof java.util.concurrent.RejectedExecutionException) || z6) {
                                throw e6;
                            }
                        } catch (java.lang.Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
            }
            this.f45270D.add(runnable);
        }
    }

    public java.lang.String toString() {
        return "SequentialExecutor@" + java.lang.System.identityHashCode(this) + "{" + this.f45269C + "}";
    }
}
