package N7;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N7.l f7902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.Set f7903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.Set f7904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.util.Set f7905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final java.util.Set f7906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final java.util.Set f7907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final java.util.Set f7908g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final java.util.Set f7909h;

    static {
        N7.l lVar = new N7.l();
        f7902a = lVar;
        p068g8.A a6 = p068g8.A.f45591a;
        f7903b = p097j7.Z.k(a6.f("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        f7904c = p097j7.Z.j(p097j7.Z.j(p097j7.Z.j(p097j7.Z.j(p097j7.Z.j(p097j7.Z.j(lVar.b(), a6.f("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), a6.e("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), a6.e("Double", "isInfinite()Z", "isNaN()Z")), a6.e("Float", "isInfinite()Z", "isNaN()Z")), a6.e("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), a6.e("CharSequence", "isEmpty()Z"));
        f7905d = a6.f("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        f7906e = p097j7.Z.j(p097j7.Z.j(p097j7.Z.j(p097j7.Z.j(p097j7.Z.j(p097j7.Z.j(a6.e("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), a6.f("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), a6.e("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), a6.e("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), a6.f("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), a6.f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), a6.f("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f7907f = p097j7.Z.j(p097j7.Z.j(a6.f("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), a6.f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), a6.f("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        java.util.Set setA = lVar.a();
        java.lang.String[] strArrB = a6.b("D");
        java.util.Set setJ = p097j7.Z.j(setA, a6.e("Float", (java.lang.String[]) java.util.Arrays.copyOf(strArrB, strArrB.length)));
        java.lang.String[] strArrB2 = a6.b("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f7908g = p097j7.Z.j(setJ, a6.e("String", (java.lang.String[]) java.util.Arrays.copyOf(strArrB2, strArrB2.length)));
        java.lang.String[] strArrB3 = a6.b("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f7909h = a6.e("Throwable", (java.lang.String[]) java.util.Arrays.copyOf(strArrB3, strArrB3.length));
    }

    private l() {
    }

    private final java.util.Set a() {
        p068g8.A a6 = p068g8.A.f45591a;
        p228w8.e eVar = p228w8.e.BYTE;
        java.util.List listP = p097j7.AbstractC6879v.p(p228w8.e.BOOLEAN, eVar, p228w8.e.DOUBLE, p228w8.e.FLOAT, eVar, p228w8.e.INT, p228w8.e.LONG, p228w8.e.SHORT);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator it = listP.iterator();
        while (it.hasNext()) {
            java.lang.String strG = ((p228w8.e) it.next()).q().g().g();
            p247y7.AbstractC7350t.e(strG, "asString(...)");
            java.lang.String[] strArrB = a6.b("Ljava/lang/String;");
            p097j7.AbstractC6879v.C(linkedHashSet, a6.e(strG, (java.lang.String[]) java.util.Arrays.copyOf(strArrB, strArrB.length)));
        }
        return linkedHashSet;
    }

    private final java.util.Set b() {
        p068g8.A a6 = p068g8.A.f45591a;
        java.util.List<p228w8.e> listP = p097j7.AbstractC6879v.p(p228w8.e.BOOLEAN, p228w8.e.CHAR);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (p228w8.e eVar : listP) {
            java.lang.String strG = eVar.q().g().g();
            p247y7.AbstractC7350t.e(strG, "asString(...)");
            p097j7.AbstractC6879v.C(linkedHashSet, a6.e(strG, eVar.n() + "Value()" + eVar.m()));
        }
        return linkedHashSet;
    }

    public final java.util.Set c() {
        return f7905d;
    }

    public final java.util.Set d() {
        return f7903b;
    }

    public final java.util.Set e() {
        return f7908g;
    }

    public final java.util.Set f() {
        return f7904c;
    }

    public final java.util.Set g() {
        return f7907f;
    }

    public final java.util.Set h() {
        return f7909h;
    }

    public final java.util.Set i() {
        return f7906e;
    }

    public final boolean j(p138n8.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "fqName");
        return p247y7.AbstractC7350t.b(dVar, L7.j.a.f6381i) || L7.j.e(dVar);
    }

    public final boolean k(p138n8.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "fqName");
        if (j(dVar)) {
            return true;
        }
        p138n8.b bVarN = N7.c.f7820a.n(dVar);
        if (bVarN == null) {
            return false;
        }
        try {
            return java.io.Serializable.class.isAssignableFrom(java.lang.Class.forName(bVarN.b().b()));
        } catch (java.lang.ClassNotFoundException unused) {
            return false;
        }
    }
}
