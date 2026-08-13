package p003a2;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final V.O0 f17033a;

    /* JADX INFO: renamed from: a2.a$a, reason: collision with other inner class name */
    static final class C0325a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final p003a2.a.C0325a f17034D = new p003a2.a.C0325a();

        C0325a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.r b() {
            throw new java.lang.IllegalStateException("CompositionLocal LocalLifecycleOwner not present".toString());
        }
    }

    static {
        java.lang.Object objB;
        V.O0 o6;
        try {
            i7.w.a aVar = p087i7.w.f46751D;
            java.lang.ClassLoader classLoader = androidx.lifecycle.r.class.getClassLoader();
            p247y7.AbstractC7350t.c(classLoader);
            java.lang.reflect.Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            java.lang.annotation.Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    java.lang.Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof V.O0) {
                        o6 = (V.O0) objInvoke;
                        break;
                    }
                } else if (!(annotations[i6] instanceof p087i7.InterfaceC6659e)) {
                    i6++;
                }
                o6 = null;
                break;
            }
            objB = p087i7.w.b(o6);
        } catch (java.lang.Throwable th) {
            i7.w.a aVar2 = p087i7.w.f46751D;
            objB = p087i7.w.b(p087i7.x.a(th));
        }
        V.O0 o0F = (V.O0) (p087i7.w.g(objB) ? null : objB);
        if (o0F == null) {
            o0F = V.AbstractC1756y.f(p003a2.a.C0325a.f17034D);
        }
        f17033a = o0F;
    }

    public static final V.O0 a() {
        return f17033a;
    }
}
