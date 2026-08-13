package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2079k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.concurrent.atomic.AtomicReference f22820a = new java.util.concurrent.atomic.AtomicReference(null);

    /* JADX INFO: renamed from: androidx.lifecycle.k$a */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static final androidx.lifecycle.AbstractC2079k.a.C0429a Companion = new androidx.lifecycle.AbstractC2079k.a.C0429a(null);

        /* JADX INFO: renamed from: androidx.lifecycle.k$a$a, reason: collision with other inner class name */
        public static final class C0429a {

            /* JADX INFO: renamed from: androidx.lifecycle.k$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0430a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f22821a;

                static {
                    int[] iArr = new int[androidx.lifecycle.AbstractC2079k.b.values().length];
                    try {
                        iArr[androidx.lifecycle.AbstractC2079k.b.CREATED.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    try {
                        iArr[androidx.lifecycle.AbstractC2079k.b.STARTED.ordinal()] = 2;
                    } catch (java.lang.NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[androidx.lifecycle.AbstractC2079k.b.RESUMED.ordinal()] = 3;
                    } catch (java.lang.NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[androidx.lifecycle.AbstractC2079k.b.DESTROYED.ordinal()] = 4;
                    } catch (java.lang.NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[androidx.lifecycle.AbstractC2079k.b.INITIALIZED.ordinal()] = 5;
                    } catch (java.lang.NoSuchFieldError unused5) {
                    }
                    f22821a = iArr;
                }
            }

            private C0429a() {
            }

            public /* synthetic */ C0429a(p247y7.AbstractC7342k abstractC7342k) {
                this();
            }

            public final androidx.lifecycle.AbstractC2079k.a a(androidx.lifecycle.AbstractC2079k.b bVar) {
                p247y7.AbstractC7350t.f(bVar, "state");
                int i6 = androidx.lifecycle.AbstractC2079k.a.C0429a.C0430a.f22821a[bVar.ordinal()];
                if (i6 == 1) {
                    return androidx.lifecycle.AbstractC2079k.a.ON_DESTROY;
                }
                if (i6 == 2) {
                    return androidx.lifecycle.AbstractC2079k.a.ON_STOP;
                }
                if (i6 != 3) {
                    return null;
                }
                return androidx.lifecycle.AbstractC2079k.a.ON_PAUSE;
            }

            public final androidx.lifecycle.AbstractC2079k.a b(androidx.lifecycle.AbstractC2079k.b bVar) {
                p247y7.AbstractC7350t.f(bVar, "state");
                int i6 = androidx.lifecycle.AbstractC2079k.a.C0429a.C0430a.f22821a[bVar.ordinal()];
                if (i6 == 1) {
                    return androidx.lifecycle.AbstractC2079k.a.ON_START;
                }
                if (i6 == 2) {
                    return androidx.lifecycle.AbstractC2079k.a.ON_RESUME;
                }
                if (i6 != 5) {
                    return null;
                }
                return androidx.lifecycle.AbstractC2079k.a.ON_CREATE;
            }
        }

        /* JADX INFO: renamed from: androidx.lifecycle.k$a$b */
        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f22822a;

            static {
                int[] iArr = new int[androidx.lifecycle.AbstractC2079k.a.values().length];
                try {
                    iArr[androidx.lifecycle.AbstractC2079k.a.ON_CREATE.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[androidx.lifecycle.AbstractC2079k.a.ON_STOP.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[androidx.lifecycle.AbstractC2079k.a.ON_START.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[androidx.lifecycle.AbstractC2079k.a.ON_PAUSE.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[androidx.lifecycle.AbstractC2079k.a.ON_RESUME.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                try {
                    iArr[androidx.lifecycle.AbstractC2079k.a.ON_DESTROY.ordinal()] = 6;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                try {
                    iArr[androidx.lifecycle.AbstractC2079k.a.ON_ANY.ordinal()] = 7;
                } catch (java.lang.NoSuchFieldError unused7) {
                }
                f22822a = iArr;
            }
        }

        public final androidx.lifecycle.AbstractC2079k.b g() {
            switch (androidx.lifecycle.AbstractC2079k.a.b.f22822a[ordinal()]) {
                case 1:
                case 2:
                    return androidx.lifecycle.AbstractC2079k.b.CREATED;
                case 3:
                case 4:
                    return androidx.lifecycle.AbstractC2079k.b.STARTED;
                case 5:
                    return androidx.lifecycle.AbstractC2079k.b.RESUMED;
                case 6:
                    return androidx.lifecycle.AbstractC2079k.b.DESTROYED;
                default:
                    throw new java.lang.IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.k$b */
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean g(androidx.lifecycle.AbstractC2079k.b bVar) {
            p247y7.AbstractC7350t.f(bVar, "state");
            return compareTo(bVar) >= 0;
        }
    }

    public abstract void a(androidx.lifecycle.InterfaceC2085q interfaceC2085q);

    public abstract androidx.lifecycle.AbstractC2079k.b b();

    public final java.util.concurrent.atomic.AtomicReference c() {
        return this.f22820a;
    }

    public abstract void d(androidx.lifecycle.InterfaceC2085q interfaceC2085q);
}
