package p079h9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ p157p7.a f46548a = p157p7.b.a(j$.time.DayOfWeek.values());
    }

    public static final j$.time.DayOfWeek a(int i6) {
        if (1 <= i6 && i6 < 8) {
            return (j$.time.DayOfWeek) h9.d.a.f46548a.get(i6 - 1);
        }
        throw new java.lang.IllegalArgumentException(("Expected ISO day-of-week number in 1..7, got " + i6).toString());
    }

    public static final int b(j$.time.DayOfWeek dayOfWeek) {
        p247y7.AbstractC7350t.f(dayOfWeek, "<this>");
        return dayOfWeek.ordinal() + 1;
    }
}
