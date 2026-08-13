.class abstract synthetic Lh9/q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Lj$/time/ZoneId;)Z
    .locals 0

    invoke-static {p0}, Lh9/q;->b(Lj$/time/ZoneId;)Z

    move-result p0

    return p0
.end method

.method private static final b(Lj$/time/ZoneId;)Z
    .locals 0

    .prologue
    :try_start_0
    invoke-virtual {p0}, Lj$/time/ZoneId;->getRules()Lj$/time/zone/ZoneRules;

    move-result-object p0

    invoke-virtual {p0}, Lj$/time/zone/ZoneRules;->isFixedOffset()Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final c(Lh9/j;Lh9/o;)Lh9/g;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeZone"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lh9/j;->o()Lj$/time/LocalDateTime;

    move-result-object p0

    invoke-virtual {p1}, Lh9/o;->c()Lj$/time/ZoneId;

    move-result-object p1

    invoke-virtual {p0, p1}, Lj$/time/LocalDateTime;->atZone(Lj$/time/ZoneId;)Lj$/time/ZonedDateTime;

    move-result-object p0

    invoke-interface {p0}, Lj$/time/chrono/ChronoZonedDateTime;->toInstant()Lj$/time/Instant;

    move-result-object p0

    new-instance p1, Lh9/g;

    invoke-direct {p1, p0}, Lh9/g;-><init>(Lj$/time/Instant;)V

    return-object p1
.end method

.method public static final d(Lh9/g;Lh9/o;)Lh9/j;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeZone"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0}, Lh9/g;->n()Lj$/time/Instant;

    move-result-object p0

    invoke-virtual {p1}, Lh9/o;->c()Lj$/time/ZoneId;

    move-result-object p1

    invoke-static {p0, p1}, Lj$/time/LocalDateTime;->ofInstant(Lj$/time/Instant;Lj$/time/ZoneId;)Lj$/time/LocalDateTime;

    move-result-object p0

    new-instance p1, Lh9/j;

    invoke-direct {p1, p0}, Lh9/j;-><init>(Lj$/time/LocalDateTime;)V
    :try_end_0
    .catch Lj$/time/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p0

    new-instance p1, Lh9/b;

    invoke-direct {p1, p0}, Lh9/b;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method
