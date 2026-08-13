package com.napsternetlabs.napsternetv;

/* JADX INFO: loaded from: classes.dex */
public class ProtectedMyApplication$ProtectedMyApplication$VpnPermissionActivity$a {
    public static java.lang.annotation.Annotation[] Beyxd(java.lang.Class cls, java.lang.Class cls2) {
        return E(cls, cls.getDeclaredAnnotationsByType(cls2));
    }

    public static java.lang.annotation.Annotation[] E(java.lang.Class cls, java.lang.annotation.Annotation[] annotationArr) {
        if (annotationArr != null) {
            for (int i6 = 0; i6 < annotationArr.length; i6++) {
                annotationArr[i6] = j(cls, annotationArr[i6]);
            }
        }
        return annotationArr;
    }

    public static java.lang.annotation.Annotation[] Im(java.lang.Class cls) {
        return E(cls, cls.getAnnotations());
    }

    public static java.lang.annotation.Annotation j(java.lang.Class cls, java.lang.annotation.Annotation annotation) {
        return (annotation == null || annotation.annotationType().getAnnotation(com.napsternetlabs.napsternetv.ProtectedMyApplication$VpnPermissionActivity$a.class) == null) ? annotation : (java.lang.annotation.Annotation) java.lang.reflect.Proxy.newProxyInstance(cls.getClassLoader(), new java.lang.Class[]{annotation.annotationType()}, new com.napsternetlabs.napsternetv.ProtectedMyApplication$MyApplication$a.c(annotation));
    }

    public static java.lang.annotation.Annotation[] qdg(java.lang.Class cls) {
        return E(cls, cls.getDeclaredAnnotations());
    }

    public static java.lang.annotation.Annotation[] vl(java.lang.Class cls, java.lang.Class cls2) {
        return E(cls, cls.getAnnotationsByType(cls2));
    }

    public static java.lang.annotation.Annotation wuzl(java.lang.Class cls, java.lang.Class cls2) {
        return j(cls, cls.getAnnotation(cls2));
    }

    public static java.lang.annotation.Annotation ytikc(java.lang.Class cls, java.lang.Class cls2) {
        return j(cls, cls.getDeclaredAnnotation(cls2));
    }
}
