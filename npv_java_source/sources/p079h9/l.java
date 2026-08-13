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
@kotlin.Metadata(d1 = {"\u0a54"}, d2 = {"\u0a55", "", "\u0a56", "\u0a57", "\u0a58", "ਖ਼", "", "ਗ਼", "ਜ਼", "ੜ", "\u0a5d", "ਫ਼", "\u0a5f", "\u0a60", "", "\u0a61", "", "\u0a62", "\u0a63", "\u0a64", "", "\u0a65", "੦", "੧", "੨", "੩", "੪", "੫", "੬", "੭", "੮", "੯", "ੰ", "ੱ", "ੲ", "ੳ", "ੴ"}, k = 1, mv = {1, 9, 0})
public final class l implements java.lang.Comparable<p079h9.l> {
    public static final h9.l.a Companion = new h9.l.a(null);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final p079h9.l f46565D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final p079h9.l f46566E;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final j$.time.LocalTime f46567C;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public static /* synthetic */ p079h9.l b(h9.l.a aVar, java.lang.CharSequence charSequence, p089i9.InterfaceC6683n interfaceC6683n, int i6, java.lang.Object obj) {
            if ((i6 & 2) != 0) {
                interfaceC6683n = p079h9.m.a();
            }
            return aVar.a(charSequence, interfaceC6683n);
        }

        public final p079h9.l a(java.lang.CharSequence charSequence, p089i9.InterfaceC6683n interfaceC6683n) {
            p247y7.AbstractC7350t.f(charSequence, "input");
            p247y7.AbstractC7350t.f(interfaceC6683n, "format");
            if (interfaceC6683n != h9.l.b.f46568a.a()) {
                return (p079h9.l) interfaceC6683n.b(charSequence);
            }
            try {
                return new p079h9.l(j$.time.LocalTime.parse(charSequence));
            } catch (j$.time.format.DateTimeParseException e6) {
                throw new p079h9.c(e6);
            }
        }

        public final p199t9.b serializer() {
            return p139n9.e.f52082a;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h9.l.b f46568a = new h9.l.b();

        private b() {
        }

        public final p089i9.InterfaceC6683n a() {
            return p089i9.E.b();
        }
    }

    static {
        j$.time.LocalTime localTime = j$.time.LocalTime.MIN;
        p247y7.AbstractC7350t.e(localTime, "MIN");
        f46565D = new p079h9.l(localTime);
        j$.time.LocalTime localTime2 = j$.time.LocalTime.MAX;
        p247y7.AbstractC7350t.e(localTime2, "MAX");
        f46566E = new p079h9.l(localTime2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l(int i6, int i10, int i11, int i12) {
        try {
            j$.time.LocalTime localTimeOf = j$.time.LocalTime.of(i6, i10, i11, i12);
            p247y7.AbstractC7350t.c(localTimeOf);
            this(localTimeOf);
        } catch (j$.time.DateTimeException e6) {
            throw new java.lang.IllegalArgumentException(e6);
        }
    }

    public l(j$.time.LocalTime localTime) {
        p247y7.AbstractC7350t.f(localTime, "value");
        this.f46567C = localTime;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(p079h9.l lVar) {
        p247y7.AbstractC7350t.f(lVar, "other");
        return this.f46567C.compareTo(lVar.f46567C);
    }

    public boolean equals(java.lang.Object obj) {
        return this == obj || ((obj instanceof p079h9.l) && p247y7.AbstractC7350t.b(this.f46567C, ((p079h9.l) obj).f46567C));
    }

    public final int g() {
        return this.f46567C.getHour();
    }

    public int hashCode() {
        return this.f46567C.hashCode();
    }

    public final int i() {
        return this.f46567C.getMinute();
    }

    public final int m() {
        return this.f46567C.getNano();
    }

    public final int n() {
        return this.f46567C.getSecond();
    }

    public final j$.time.LocalTime o() {
        return this.f46567C;
    }

    public final int q() {
        return this.f46567C.toSecondOfDay();
    }

    public java.lang.String toString() {
        java.lang.String string = this.f46567C.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }
}
