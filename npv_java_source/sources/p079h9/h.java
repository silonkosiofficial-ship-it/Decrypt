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
@kotlin.Metadata(d1 = {"\u0a00"}, d2 = {"ਁ", "", "ਂ", "ਃ", "\u0a04", "ਅ", "", "ਆ", "ਇ", "ਈ", "ਉ", "", "ਊ", "", "\u0a0b", "\u0a0c", "\u0a0d", "\u0a0e", "", "ਏ", "ਐ", "\u0a11", "\u0a12", "ਓ", "ਔ", "ਕ", "ਖ", "ਗ", "ਘ", "ਙ", "ਚ", "ਛ", "ਜ", "ਝ", "ਞ", "ਟ", "ਠ", "ਡ", "ਢ", "ਣ"}, k = 1, mv = {1, 9, 0})
public final class h implements java.lang.Comparable<p079h9.h> {
    public static final h9.h.a Companion = new h9.h.a(null);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final p079h9.h f46555D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final p079h9.h f46556E;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final j$.time.LocalDate f46557C;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public static /* synthetic */ p079h9.h b(h9.h.a aVar, java.lang.CharSequence charSequence, p089i9.InterfaceC6683n interfaceC6683n, int i6, java.lang.Object obj) {
            if ((i6 & 2) != 0) {
                interfaceC6683n = p079h9.i.a();
            }
            return aVar.a(charSequence, interfaceC6683n);
        }

        public final p079h9.h a(java.lang.CharSequence charSequence, p089i9.InterfaceC6683n interfaceC6683n) {
            p247y7.AbstractC7350t.f(charSequence, "input");
            p247y7.AbstractC7350t.f(interfaceC6683n, "format");
            if (interfaceC6683n != h9.h.b.f46558a.a()) {
                return (p079h9.h) interfaceC6683n.b(charSequence);
            }
            try {
                return new p079h9.h(j$.time.LocalDate.parse(charSequence));
            } catch (j$.time.format.DateTimeParseException e6) {
                throw new p079h9.c(e6);
            }
        }

        public final p199t9.b serializer() {
            return p139n9.c.f52078a;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h9.h.b f46558a = new h9.h.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final p089i9.InterfaceC6683n f46559b = p089i9.A.c();

        private b() {
        }

        public final p089i9.InterfaceC6683n a() {
            return p089i9.A.b();
        }
    }

    static {
        j$.time.LocalDate localDate = j$.time.LocalDate.MIN;
        p247y7.AbstractC7350t.e(localDate, "MIN");
        f46555D = new p079h9.h(localDate);
        j$.time.LocalDate localDate2 = j$.time.LocalDate.MAX;
        p247y7.AbstractC7350t.e(localDate2, "MAX");
        f46556E = new p079h9.h(localDate2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(int i6, int i10, int i11) {
        try {
            j$.time.LocalDate localDateOf = j$.time.LocalDate.of(i6, i10, i11);
            p247y7.AbstractC7350t.c(localDateOf);
            this(localDateOf);
        } catch (j$.time.DateTimeException e6) {
            throw new java.lang.IllegalArgumentException(e6);
        }
    }

    public h(j$.time.LocalDate localDate) {
        p247y7.AbstractC7350t.f(localDate, "value");
        this.f46557C = localDate;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(p079h9.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "other");
        return this.f46557C.compareTo((j$.time.chrono.ChronoLocalDate) hVar.f46557C);
    }

    public boolean equals(java.lang.Object obj) {
        return this == obj || ((obj instanceof p079h9.h) && p247y7.AbstractC7350t.b(this.f46557C, ((p079h9.h) obj).f46557C));
    }

    public final int g() {
        return this.f46557C.getDayOfMonth();
    }

    public int hashCode() {
        return this.f46557C.hashCode();
    }

    public final j$.time.DayOfWeek i() {
        j$.time.DayOfWeek dayOfWeek = this.f46557C.getDayOfWeek();
        p247y7.AbstractC7350t.e(dayOfWeek, "getDayOfWeek(...)");
        return dayOfWeek;
    }

    public final int m() {
        return this.f46557C.getMonthValue();
    }

    public final j$.time.LocalDate n() {
        return this.f46557C;
    }

    public final int o() {
        return this.f46557C.getYear();
    }

    public final int q() {
        return p099j9.e.a(this.f46557C.toEpochDay());
    }

    public java.lang.String toString() {
        java.lang.String string = this.f46557C.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }
}
