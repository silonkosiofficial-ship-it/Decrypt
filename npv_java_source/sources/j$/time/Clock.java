package j$.time;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Clock {
    protected Clock() {
    }

    public static j$.time.Clock c() {
        return new j$.time.a(j$.time.ZoneId.systemDefault());
    }

    public static j$.time.Clock systemUTC() {
        return j$.time.a.f47708b;
    }

    public abstract j$.time.ZoneId a();

    public long b() {
        return instant().toEpochMilli();
    }

    public abstract j$.time.Instant instant();
}
