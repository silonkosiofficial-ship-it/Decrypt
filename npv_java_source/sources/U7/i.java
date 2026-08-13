package U7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i {
    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    public static final U7.e a(java.lang.annotation.Annotation[] annotationArr, p138n8.c cVar) {
        p247y7.AbstractC7350t.f(annotationArr, "<this>");
        p247y7.AbstractC7350t.f(cVar, "fqName");
        for (java.lang.annotation.Annotation annotation : annotationArr) {
            if (p247y7.AbstractC7350t.b(U7.d.a(p227w7.a.b(p227w7.a.a(annotation))).b(), cVar)) {
                if (annotation != null) {
                    return new U7.e(annotation);
                }
                return null;
            }
        }
        annotation = null;
        if (annotation != null) {
            return new U7.e(annotation);
        }
        return null;
    }

    public static final java.util.List b(java.lang.annotation.Annotation[] annotationArr) {
        p247y7.AbstractC7350t.f(annotationArr, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList(annotationArr.length);
        for (java.lang.annotation.Annotation annotation : annotationArr) {
            arrayList.add(new U7.e(annotation));
        }
        return arrayList;
    }
}
