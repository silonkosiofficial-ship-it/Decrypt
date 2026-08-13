package P8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.Object f8497a = new P8.h.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f8498b = false;

    static class a {
        a() {
        }

        public java.lang.String toString() {
            return "NULL_VALUE";
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.Throwable f8499a;

        private b(java.lang.Throwable th) {
            if (th == null) {
                a(0);
            }
            this.f8499a = th;
        }

        /* synthetic */ b(java.lang.Throwable th, P8.h.a aVar) {
            this(th);
        }

        private static /* synthetic */ void a(int i6) {
            java.lang.String str = i6 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            java.lang.Object[] objArr = new java.lang.Object[i6 != 1 ? 3 : 2];
            if (i6 != 1) {
                objArr[0] = "throwable";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            if (i6 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            } else {
                objArr[1] = "getThrowable";
            }
            if (i6 != 1) {
                objArr[2] = "<init>";
            }
            java.lang.String str2 = java.lang.String.format(str, objArr);
            if (i6 == 1) {
                throw new java.lang.IllegalStateException(str2);
            }
        }

        public java.lang.Throwable b() {
            java.lang.Throwable th = this.f8499a;
            if (th == null) {
                a(1);
            }
            return th;
        }

        public java.lang.String toString() {
            return this.f8499a.toString();
        }
    }

    public static class c extends java.lang.RuntimeException {
        public c(java.lang.Throwable th) {
            super("Rethrow stored exception", th);
        }
    }

    private static /* synthetic */ void a(int i6) {
        java.lang.String str = (i6 == 1 || i6 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i6 == 1 || i6 == 2) ? 2 : 3];
        if (i6 == 1 || i6 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        } else if (i6 != 3) {
            objArr[0] = "value";
        } else {
            objArr[0] = "throwable";
        }
        if (i6 == 1 || i6 == 2) {
            objArr[1] = "escapeNull";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        }
        if (i6 != 1 && i6 != 2) {
            if (i6 == 3) {
                objArr[2] = "escapeThrowable";
            } else if (i6 != 4) {
                objArr[2] = "unescapeNull";
            } else {
                objArr[2] = "unescapeExceptionOrNull";
            }
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i6 != 1 && i6 != 2) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    public static java.lang.Object b(java.lang.Object obj) {
        if (obj == null && (obj = f8497a) == null) {
            a(1);
        }
        return obj;
    }

    public static java.lang.Object c(java.lang.Throwable th) {
        if (th == null) {
            a(3);
        }
        return new P8.h.b(th, null);
    }

    public static java.lang.Object d(java.lang.Object obj) {
        if (obj == null) {
            a(4);
        }
        return e(f(obj));
    }

    public static java.lang.Object e(java.lang.Object obj) {
        if (obj == null) {
            a(0);
        }
        if (obj == f8497a) {
            return null;
        }
        return obj;
    }

    public static java.lang.Object f(java.lang.Object obj) {
        if (!(obj instanceof P8.h.b)) {
            return obj;
        }
        java.lang.Throwable thB = ((P8.h.b) obj).b();
        if (f8498b && P8.d.a(thB)) {
            throw new P8.h.c(thB);
        }
        throw P8.d.b(thB);
    }
}
