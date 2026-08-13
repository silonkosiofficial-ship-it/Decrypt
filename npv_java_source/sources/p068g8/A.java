package p068g8;

/* JADX INFO: loaded from: classes2.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p068g8.A f45591a = new p068g8.A();

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final g8.A.a f45592D = new g8.A.a();

        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.CharSequence l(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "it");
            return p068g8.A.f45591a.c(str);
        }
    }

    private A() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String c(java.lang.String str) {
        if (str.length() <= 1) {
            return str;
        }
        return 'L' + str + ';';
    }

    public final java.lang.String[] b(java.lang.String... strArr) {
        p247y7.AbstractC7350t.f(strArr, "signatures");
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }

    public final java.util.Set d(java.lang.String str, java.lang.String... strArr) {
        p247y7.AbstractC7350t.f(str, "internalName");
        p247y7.AbstractC7350t.f(strArr, "signatures");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.lang.String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    public final java.util.Set e(java.lang.String str, java.lang.String... strArr) {
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(strArr, "signatures");
        return d(h(str), (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public final java.util.Set f(java.lang.String str, java.lang.String... strArr) {
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(strArr, "signatures");
        return d(i(str), (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public final java.lang.String g(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "name");
        return "java/util/function/" + str;
    }

    public final java.lang.String h(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "name");
        return "java/lang/" + str;
    }

    public final java.lang.String i(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "name");
        return "java/util/" + str;
    }

    public final java.lang.String j(java.lang.String str, java.util.List list, java.lang.String str2) {
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(list, "parameters");
        p247y7.AbstractC7350t.f(str2, "ret");
        return str + '(' + p097j7.AbstractC6879v.r0(list, "", null, null, 0, null, g8.A.a.f45592D, 30, null) + ')' + c(str2);
    }

    public final java.lang.String k(java.lang.String str, java.lang.String str2) {
        p247y7.AbstractC7350t.f(str, "internalName");
        p247y7.AbstractC7350t.f(str2, "jvmDescriptor");
        return str + '.' + str2;
    }
}
