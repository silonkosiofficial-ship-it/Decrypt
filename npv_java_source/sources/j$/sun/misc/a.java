package j$.sun.misc;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final j$.sun.misc.a f47675b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sun.misc.Unsafe f47676a;

    static {
        java.lang.reflect.Field fieldI = i();
        fieldI.setAccessible(true);
        try {
            f47675b = new j$.sun.misc.a((sun.misc.Unsafe) fieldI.get(null));
        } catch (java.lang.IllegalAccessException e6) {
            throw new java.lang.AssertionError("Couldn't get the Unsafe", e6);
        }
    }

    a(sun.misc.Unsafe unsafe) {
        this.f47676a = unsafe;
    }

    public static j$.sun.misc.a h() {
        return f47675b;
    }

    private static java.lang.reflect.Field i() {
        try {
            return sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        } catch (java.lang.NoSuchFieldException e6) {
            for (java.lang.reflect.Field field : sun.misc.Unsafe.class.getDeclaredFields()) {
                if (java.lang.reflect.Modifier.isStatic(field.getModifiers()) && sun.misc.Unsafe.class.isAssignableFrom(field.getType())) {
                    return field;
                }
            }
            throw new java.lang.AssertionError("Couldn't find the Unsafe", e6);
        }
    }

    public final int a(java.lang.Class cls) {
        return this.f47676a.arrayBaseOffset(cls);
    }

    public final int b(java.lang.Class cls) {
        return this.f47676a.arrayIndexScale(cls);
    }

    public final boolean c(java.lang.Object obj, long j6, int i6, int i10) {
        return this.f47676a.compareAndSwapInt(obj, j6, i6, i10);
    }

    public final boolean d(java.lang.Object obj, long j6, long j10, long j11) {
        return this.f47676a.compareAndSwapLong(obj, j6, j10, j11);
    }

    public final boolean e(java.lang.Object obj, long j6, java.lang.Object obj2) {
        return j$.com.android.tools.r8.a.j(this.f47676a, obj, j6, obj2);
    }

    public final int f(java.lang.Object obj, long j6) {
        int intVolatile;
        do {
            intVolatile = this.f47676a.getIntVolatile(obj, j6);
        } while (!this.f47676a.compareAndSwapInt(obj, j6, intVolatile, intVolatile - 4));
        return intVolatile;
    }

    public final java.lang.Object g(java.lang.Object obj, long j6) {
        return this.f47676a.getObjectVolatile(obj, j6);
    }

    public final long j(java.lang.Class cls, java.lang.String str) {
        try {
            return k(cls.getDeclaredField(str));
        } catch (java.lang.NoSuchFieldException e6) {
            throw new java.lang.AssertionError("Cannot find field:", e6);
        }
    }

    public final long k(java.lang.reflect.Field field) {
        return this.f47676a.objectFieldOffset(field);
    }

    public final void l(java.lang.Object obj, long j6, java.lang.Object obj2) {
        this.f47676a.putObjectVolatile(obj, j6, obj2);
    }
}
