package j$.time.format;

/* JADX INFO: renamed from: j$.time.format.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6704b extends j$.time.format.A {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ j$.time.format.z f47829e;

    C6704b(j$.time.format.z zVar) {
        this.f47829e = zVar;
    }

    @Override // j$.time.format.A
    public final java.lang.String d(j$.time.chrono.Chronology chronology, j$.time.temporal.s sVar, long j6, j$.time.format.TextStyle textStyle, java.util.Locale locale) {
        return this.f47829e.a(j6, textStyle);
    }

    @Override // j$.time.format.A
    public final java.lang.String e(j$.time.temporal.s sVar, long j6, j$.time.format.TextStyle textStyle, java.util.Locale locale) {
        return this.f47829e.a(j6, textStyle);
    }

    @Override // j$.time.format.A
    public final java.util.Iterator f(j$.time.chrono.Chronology chronology, j$.time.temporal.s sVar, j$.time.format.TextStyle textStyle, java.util.Locale locale) {
        return this.f47829e.b(textStyle);
    }

    @Override // j$.time.format.A
    public final java.util.Iterator g(j$.time.temporal.s sVar, j$.time.format.TextStyle textStyle, java.util.Locale locale) {
        return this.f47829e.b(textStyle);
    }
}
