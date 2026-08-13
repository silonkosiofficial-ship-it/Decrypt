package I7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class J {

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final I7.J.a f5336D = new I7.J.a();

        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.CharSequence l(java.lang.Class cls) {
            p247y7.AbstractC7350t.c(cls);
            return U7.d.b(cls);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String b(java.lang.reflect.Method method) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(method.getName());
        java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
        p247y7.AbstractC7350t.e(parameterTypes, "getParameterTypes(...)");
        sb.append(p097j7.AbstractC6872n.w0(parameterTypes, "", "(", ")", 0, null, I7.J.a.f5336D, 24, null));
        java.lang.Class<?> returnType = method.getReturnType();
        p247y7.AbstractC7350t.e(returnType, "getReturnType(...)");
        sb.append(U7.d.b(returnType));
        return sb.toString();
    }
}
