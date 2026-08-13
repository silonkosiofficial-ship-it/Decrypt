package p227w7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final F7.c a(java.lang.annotation.Annotation annotation) {
        p247y7.AbstractC7350t.f(annotation, "<this>");
        java.lang.Class<? extends java.lang.annotation.Annotation> clsAnnotationType = annotation.annotationType();
        p247y7.AbstractC7350t.e(clsAnnotationType, "annotationType(...)");
        F7.c cVarE = e(clsAnnotationType);
        p247y7.AbstractC7350t.d(cVarE, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return cVarE;
    }

    public static final java.lang.Class b(F7.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "<this>");
        java.lang.Class clsE = ((p247y7.InterfaceC7339h) cVar).e();
        p247y7.AbstractC7350t.d(clsE, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsE;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final java.lang.Class c(F7.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "<this>");
        java.lang.Class clsE = ((p247y7.InterfaceC7339h) cVar).e();
        if (!clsE.isPrimitive()) {
            p247y7.AbstractC7350t.d(clsE, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return clsE;
        }
        java.lang.String name = clsE.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    clsE = java.lang.Double.class;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    clsE = java.lang.Integer.class;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    clsE = java.lang.Byte.class;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    clsE = java.lang.Character.class;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    clsE = java.lang.Long.class;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    clsE = java.lang.Void.class;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    clsE = java.lang.Boolean.class;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    clsE = java.lang.Float.class;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    clsE = java.lang.Short.class;
                }
                break;
        }
        p247y7.AbstractC7350t.d(clsE, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return clsE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final java.lang.Class d(F7.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "<this>");
        java.lang.Class clsE = ((p247y7.InterfaceC7339h) cVar).e();
        if (clsE.isPrimitive()) {
            p247y7.AbstractC7350t.d(clsE, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>");
            return clsE;
        }
        java.lang.String name = clsE.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return java.lang.Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return java.lang.Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return java.lang.Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return java.lang.Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return java.lang.Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return java.lang.Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return java.lang.Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return java.lang.Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return java.lang.Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final F7.c e(java.lang.Class cls) {
        p247y7.AbstractC7350t.f(cls, "<this>");
        return p247y7.P.b(cls);
    }
}
