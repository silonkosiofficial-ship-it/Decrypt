package androidx.work;

/* JADX INFO: loaded from: classes.dex */
public abstract class ListenableWorker {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private android.content.Context f23798C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private androidx.work.WorkerParameters f23799D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private volatile boolean f23800E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f23801F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f23802G;

    public static abstract class a {

        /* JADX INFO: renamed from: androidx.work.ListenableWorker$a$a, reason: collision with other inner class name */
        public static final class C0452a extends androidx.work.ListenableWorker.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final androidx.work.b f23803a;

            public C0452a() {
                this(androidx.work.b.f23846c);
            }

            public C0452a(androidx.work.b bVar) {
                this.f23803a = bVar;
            }

            public androidx.work.b e() {
                return this.f23803a;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || androidx.work.ListenableWorker.a.C0452a.class != obj.getClass()) {
                    return false;
                }
                return this.f23803a.equals(((androidx.work.ListenableWorker.a.C0452a) obj).f23803a);
            }

            public int hashCode() {
                return (androidx.work.ListenableWorker.a.C0452a.class.getName().hashCode() * 31) + this.f23803a.hashCode();
            }

            public java.lang.String toString() {
                return "Failure {mOutputData=" + this.f23803a + '}';
            }
        }

        public static final class b extends androidx.work.ListenableWorker.a {
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && androidx.work.ListenableWorker.a.b.class == obj.getClass();
            }

            public int hashCode() {
                return androidx.work.ListenableWorker.a.b.class.getName().hashCode();
            }

            public java.lang.String toString() {
                return "Retry";
            }
        }

        public static final class c extends androidx.work.ListenableWorker.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final androidx.work.b f23804a;

            public c() {
                this(androidx.work.b.f23846c);
            }

            public c(androidx.work.b bVar) {
                this.f23804a = bVar;
            }

            public androidx.work.b e() {
                return this.f23804a;
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || androidx.work.ListenableWorker.a.c.class != obj.getClass()) {
                    return false;
                }
                return this.f23804a.equals(((androidx.work.ListenableWorker.a.c) obj).f23804a);
            }

            public int hashCode() {
                return (androidx.work.ListenableWorker.a.c.class.getName().hashCode() * 31) + this.f23804a.hashCode();
            }

            public java.lang.String toString() {
                return "Success {mOutputData=" + this.f23804a + '}';
            }
        }

        a() {
        }

        public static androidx.work.ListenableWorker.a a() {
            return new androidx.work.ListenableWorker.a.C0452a();
        }

        public static androidx.work.ListenableWorker.a b() {
            return new androidx.work.ListenableWorker.a.b();
        }

        public static androidx.work.ListenableWorker.a c() {
            return new androidx.work.ListenableWorker.a.c();
        }

        public static androidx.work.ListenableWorker.a d(androidx.work.b bVar) {
            return new androidx.work.ListenableWorker.a.c(bVar);
        }
    }

    @androidx.annotation.Keep
    @android.annotation.SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new java.lang.IllegalArgumentException("WorkerParameters is null");
        }
        this.f23798C = context;
        this.f23799D = workerParameters;
    }

    public final android.content.Context getApplicationContext() {
        return this.f23798C;
    }

    public java.util.concurrent.Executor getBackgroundExecutor() {
        return this.f23799D.a();
    }

    public P4.d getForegroundInfoAsync() {
        androidx.work.impl.utils.futures.c cVarU = androidx.work.impl.utils.futures.c.u();
        cVarU.r(new java.lang.IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return cVarU;
    }

    public final java.util.UUID getId() {
        return this.f23799D.c();
    }

    public final androidx.work.b getInputData() {
        return this.f23799D.d();
    }

    public final android.net.Network getNetwork() {
        return this.f23799D.e();
    }

    public final int getRunAttemptCount() {
        return this.f23799D.g();
    }

    public final java.util.Set<java.lang.String> getTags() {
        return this.f23799D.h();
    }

    public S2.a getTaskExecutor() {
        return this.f23799D.i();
    }

    public final java.util.List<java.lang.String> getTriggeredContentAuthorities() {
        return this.f23799D.j();
    }

    public final java.util.List<android.net.Uri> getTriggeredContentUris() {
        return this.f23799D.k();
    }

    public I2.v getWorkerFactory() {
        return this.f23799D.l();
    }

    public boolean isRunInForeground() {
        return this.f23802G;
    }

    public final boolean isStopped() {
        return this.f23800E;
    }

    public final boolean isUsed() {
        return this.f23801F;
    }

    public void onStopped() {
    }

    public final P4.d setForegroundAsync(I2.e eVar) {
        this.f23802G = true;
        return this.f23799D.b().a(getApplicationContext(), getId(), eVar);
    }

    public P4.d setProgressAsync(androidx.work.b bVar) {
        return this.f23799D.f().a(getApplicationContext(), getId(), bVar);
    }

    public void setRunInForeground(boolean z6) {
        this.f23802G = z6;
    }

    public final void setUsed() {
        this.f23801F = true;
    }

    public abstract P4.d startWork();

    public final void stop() {
        this.f23800E = true;
        onStopped();
    }
}
