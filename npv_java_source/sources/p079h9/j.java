package p079h9;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: java.lang.NullPointerException: parseDelimitedFrom(...) must not be null
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"ਤ"}, d2 = {"ਥ", "", "ਦ", "ਧ", "ਨ", "\u0a29", "", "ਪ", "ਫ", "ਬ", "ਭ", "ਮ", "ਯ", "ਰ", "\u0a31", "ਲ", "ਲ਼", "\u0a34", "ਵ", "ਸ਼", "\u0a37", "ਸ", "ਹ", "\u0a3a", "", "\u0a3b", "", "਼", "\u0a3d", "ਾ", "ਿ", "", "ੀ", "ੁ", "ੂ", "\u0a43", "\u0a44", "\u0a45", "\u0a46", "ੇ", "ੈ", "\u0a49", "\u0a4a", "ੋ", "ੌ", "੍", "\u0a4e", "\u0a4f", "\u0a50", "ੑ", "\u0a52", "\u0a53"}, k = 1, mv = {1, 9, 0})
public final class j implements java.lang.Comparable<p079h9.j> {
    public static final h9.j.a Companion = new h9.j.a(null);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final p079h9.j f46560D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final p079h9.j f46561E;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final j$.time.LocalDateTime f46562C;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public static /* synthetic */ p079h9.j c(h9.j.a aVar, java.lang.CharSequence charSequence, p089i9.InterfaceC6683n interfaceC6683n, int i6, java.lang.Object obj) {
            if ((i6 & 2) != 0) {
                interfaceC6683n = p079h9.k.b();
            }
            return aVar.b(charSequence, interfaceC6683n);
        }

        public final p089i9.InterfaceC6683n a(p237x7.l lVar) {
            p247y7.AbstractC7350t.f(lVar, "builder");
            return p089i9.B.f47328b.a(lVar);
        }

        public final p079h9.j b(java.lang.CharSequence charSequence, p089i9.InterfaceC6683n interfaceC6683n) {
            p247y7.AbstractC7350t.f(charSequence, "input");
            p247y7.AbstractC7350t.f(interfaceC6683n, "format");
            if (interfaceC6683n != h9.j.b.f46563a.a()) {
                return (p079h9.j) interfaceC6683n.b(charSequence);
            }
            try {
                return new p079h9.j(j$.time.LocalDateTime.parse(charSequence));
            } catch (j$.time.format.DateTimeParseException e6) {
                throw new p079h9.c(e6);
            }
        }

        public final p199t9.b serializer() {
            return p139n9.d.f52080a;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h9.j.b f46563a = new h9.j.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final p089i9.InterfaceC6683n f46564b = p089i9.C.b();

        private b() {
        }

        public final p089i9.InterfaceC6683n a() {
            return f46564b;
        }
    }

    static {
        j$.time.LocalDateTime localDateTime = j$.time.LocalDateTime.MIN;
        p247y7.AbstractC7350t.e(localDateTime, "MIN");
        f46560D = new p079h9.j(localDateTime);
        j$.time.LocalDateTime localDateTime2 = j$.time.LocalDateTime.MAX;
        p247y7.AbstractC7350t.e(localDateTime2, "MAX");
        f46561E = new p079h9.j(localDateTime2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j(int i6, int i10, int i11, int i12, int i13, int i14, int i15) {
        try {
            j$.time.LocalDateTime localDateTimeOf = j$.time.LocalDateTime.of(i6, i10, i11, i12, i13, i14, i15);
            p247y7.AbstractC7350t.c(localDateTimeOf);
            this(localDateTimeOf);
        } catch (j$.time.DateTimeException e6) {
            throw new java.lang.IllegalArgumentException(e6);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(int i6, j$.time.Month month, int i10, int i11, int i12, int i13, int i14) {
        this(i6, p079h9.n.a(month), i10, i11, i12, i13, i14);
        p247y7.AbstractC7350t.f(month, "month");
    }

    public /* synthetic */ j(int i6, j$.time.Month month, int i10, int i11, int i12, int i13, int i14, int i15, p247y7.AbstractC7342k abstractC7342k) {
        this(i6, month, i10, i11, i12, (i15 & 32) != 0 ? 0 : i13, (i15 & 64) != 0 ? 0 : i14);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j(p079h9.h hVar, p079h9.l lVar) {
        p247y7.AbstractC7350t.f(hVar, "date");
        p247y7.AbstractC7350t.f(lVar, "time");
        j$.time.LocalDateTime localDateTimeOf = j$.time.LocalDateTime.of(hVar.n(), lVar.o());
        p247y7.AbstractC7350t.e(localDateTimeOf, "of(...)");
        this(localDateTimeOf);
    }

    public j(j$.time.LocalDateTime localDateTime) {
        p247y7.AbstractC7350t.f(localDateTime, "value");
        this.f46562C = localDateTime;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(p079h9.j jVar) {
        p247y7.AbstractC7350t.f(jVar, "other");
        return this.f46562C.compareTo((j$.time.chrono.ChronoLocalDateTime<?>) jVar.f46562C);
    }

    public boolean equals(java.lang.Object obj) {
        return this == obj || ((obj instanceof p079h9.j) && p247y7.AbstractC7350t.b(this.f46562C, ((p079h9.j) obj).f46562C));
    }

    public final p079h9.h g() {
        j$.time.LocalDate localDateB = this.f46562C.b();
        p247y7.AbstractC7350t.e(localDateB, "toLocalDate(...)");
        return new p079h9.h(localDateB);
    }

    public int hashCode() {
        return this.f46562C.hashCode();
    }

    public final int i() {
        return this.f46562C.getDayOfMonth();
    }

    public final j$.time.Month m() {
        j$.time.Month month = this.f46562C.getMonth();
        p247y7.AbstractC7350t.e(month, "getMonth(...)");
        return month;
    }

    public final p079h9.l n() {
        j$.time.LocalTime localTime = this.f46562C.toLocalTime();
        p247y7.AbstractC7350t.e(localTime, "toLocalTime(...)");
        return new p079h9.l(localTime);
    }

    public final j$.time.LocalDateTime o() {
        return this.f46562C;
    }

    public final int q() {
        return this.f46562C.getYear();
    }

    public java.lang.String toString() {
        java.lang.String string = this.f46562C.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }
}
