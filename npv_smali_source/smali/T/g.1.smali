.class public final LT/g;
.super LT/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT/g$a;
    }
.end annotation


# static fields
.field public static final e:LT/g$a;

.field public static final f:I

.field private static final g:Lj$/time/ZoneId;


# instance fields
.field private final c:I

.field private final d:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LT/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LT/g$a;-><init>(Ly7/k;)V

    sput-object v0, LT/g;->e:LT/g$a;

    const/16 v0, 0x8

    sput v0, LT/g;->f:I

    const-string v0, "UTC"

    invoke-static {v0}, Lj$/time/ZoneId;->of(Ljava/lang/String;)Lj$/time/ZoneId;

    move-result-object v0

    sput-object v0, LT/g;->g:Lj$/time/ZoneId;

    return-void
.end method

.method public constructor <init>(Ljava/util/Locale;)V
    .locals 7

    .prologue
    invoke-direct {p0, p1}, LT/f;-><init>(Ljava/util/Locale;)V

    invoke-static {p1}, Lj$/time/temporal/WeekFields;->of(Ljava/util/Locale;)Lj$/time/temporal/WeekFields;

    move-result-object v0

    invoke-virtual {v0}, Lj$/time/temporal/WeekFields;->getFirstDayOfWeek()Lj$/time/DayOfWeek;

    move-result-object v0

    invoke-virtual {v0}, Lj$/time/DayOfWeek;->getValue()I

    move-result v0

    iput v0, p0, LT/g;->c:I

    invoke-static {}, Lj$/time/DayOfWeek;->values()[Lj$/time/DayOfWeek;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    sget-object v5, Lj$/time/format/TextStyle;->FULL:Lj$/time/format/TextStyle;

    invoke-virtual {v4, v5, p1}, Lj$/time/DayOfWeek;->getDisplayName(Lj$/time/format/TextStyle;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lj$/time/format/TextStyle;->NARROW:Lj$/time/format/TextStyle;

    invoke-virtual {v4, v6, p1}, Lj$/time/DayOfWeek;->getDisplayName(Lj$/time/format/TextStyle;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v4}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iput-object v1, p0, LT/g;->d:Ljava/util/List;

    return-void
.end method

.method public static final synthetic m()Lj$/time/ZoneId;
    .locals 1

    sget-object v0, LT/g;->g:Lj$/time/ZoneId;

    return-object v0
.end method

.method private final n(Lj$/time/LocalDate;)LT/j;
    .locals 8

    .prologue
    invoke-virtual {p1}, Lj$/time/LocalDate;->getDayOfWeek()Lj$/time/DayOfWeek;

    move-result-object v0

    invoke-virtual {v0}, Lj$/time/DayOfWeek;->getValue()I

    move-result v0

    invoke-virtual {p0}, LT/g;->d()I

    move-result v1

    sub-int/2addr v0, v1

    if-gez v0, :cond_0

    add-int/lit8 v0, v0, 0x7

    :cond_0
    move v5, v0

    sget-object v0, Lj$/time/LocalTime;->MIDNIGHT:Lj$/time/LocalTime;

    invoke-virtual {p1, v0}, Lj$/time/LocalDate;->atTime(Lj$/time/LocalTime;)Lj$/time/LocalDateTime;

    move-result-object v0

    sget-object v1, LT/g;->g:Lj$/time/ZoneId;

    invoke-virtual {v0, v1}, Lj$/time/LocalDateTime;->atZone(Lj$/time/ZoneId;)Lj$/time/ZonedDateTime;

    move-result-object v0

    invoke-interface {v0}, Lj$/time/chrono/ChronoZonedDateTime;->toInstant()Lj$/time/Instant;

    move-result-object v0

    invoke-virtual {v0}, Lj$/time/Instant;->toEpochMilli()J

    move-result-wide v6

    new-instance v0, LT/j;

    invoke-virtual {p1}, Lj$/time/LocalDate;->getYear()I

    move-result v2

    invoke-virtual {p1}, Lj$/time/LocalDate;->getMonthValue()I

    move-result v3

    invoke-virtual {p1}, Lj$/time/LocalDate;->lengthOfMonth()I

    move-result v4

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, LT/j;-><init>(IIIIJ)V

    return-object v0
.end method

.method private final o(LT/j;)Lj$/time/LocalDate;
    .locals 2

    invoke-virtual {p1}, LT/j;->d()J

    move-result-wide v0

    invoke-static {v0, v1}, Lj$/time/Instant;->ofEpochMilli(J)Lj$/time/Instant;

    move-result-object p1

    sget-object v0, LT/g;->g:Lj$/time/ZoneId;

    invoke-virtual {p1, v0}, Lj$/time/Instant;->atZone(Lj$/time/ZoneId;)Lj$/time/ZonedDateTime;

    move-result-object p1

    invoke-virtual {p1}, Lj$/time/ZonedDateTime;->toLocalDate()Lj$/time/LocalDate;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a(JLjava/lang/String;Ljava/util/Locale;)Ljava/lang/String;
    .locals 6

    sget-object v0, LT/g;->e:LT/g$a;

    invoke-virtual {p0}, LT/f;->e()Ljava/util/Map;

    move-result-object v5

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, LT/g$a;->a(JLjava/lang/String;Ljava/util/Locale;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b(J)LT/e;
    .locals 8

    invoke-static {p1, p2}, Lj$/time/Instant;->ofEpochMilli(J)Lj$/time/Instant;

    move-result-object p1

    sget-object p2, LT/g;->g:Lj$/time/ZoneId;

    invoke-virtual {p1, p2}, Lj$/time/Instant;->atZone(Lj$/time/ZoneId;)Lj$/time/ZonedDateTime;

    move-result-object p1

    invoke-virtual {p1}, Lj$/time/ZonedDateTime;->toLocalDate()Lj$/time/LocalDate;

    move-result-object p1

    new-instance p2, LT/e;

    invoke-virtual {p1}, Lj$/time/LocalDate;->getYear()I

    move-result v1

    invoke-virtual {p1}, Lj$/time/LocalDate;->getMonthValue()I

    move-result v2

    invoke-virtual {p1}, Lj$/time/LocalDate;->getDayOfMonth()I

    move-result v3

    invoke-virtual {p1}, Lj$/time/LocalDate;->atStartOfDay()Lj$/time/LocalDateTime;

    move-result-object p1

    sget-object v0, Lj$/time/ZoneOffset;->UTC:Lj$/time/ZoneOffset;

    invoke-interface {p1, v0}, Lj$/time/chrono/ChronoLocalDateTime;->toEpochSecond(Lj$/time/ZoneOffset;)J

    move-result-wide v4

    const/16 p1, 0x3e8

    int-to-long v6, p1

    mul-long/2addr v4, v6

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, LT/e;-><init>(IIIJ)V

    return-object p2
.end method

.method public c(Ljava/util/Locale;)LT/k;
    .locals 3

    sget-object v0, Lj$/time/format/FormatStyle;->SHORT:Lj$/time/format/FormatStyle;

    const/4 v1, 0x0

    invoke-static {p1}, Lj$/time/chrono/Chronology$-CC;->ofLocale(Ljava/util/Locale;)Lj$/time/chrono/Chronology;

    move-result-object v2

    invoke-static {v0, v1, v2, p1}, Lj$/time/format/DateTimeFormatterBuilder;->getLocalizedDateTimePattern(Lj$/time/format/FormatStyle;Lj$/time/format/FormatStyle;Lj$/time/chrono/Chronology;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LT/h;->a(Ljava/lang/String;)LT/k;

    move-result-object p1

    return-object p1
.end method

.method public d()I
    .locals 1

    iget v0, p0, LT/g;->c:I

    return v0
.end method

.method public f(II)LT/j;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p1, p2, v0}, Lj$/time/LocalDate;->of(III)Lj$/time/LocalDate;

    move-result-object p1

    invoke-direct {p0, p1}, LT/g;->n(Lj$/time/LocalDate;)LT/j;

    move-result-object p1

    return-object p1
.end method

.method public g(J)LT/j;
    .locals 0

    invoke-static {p1, p2}, Lj$/time/Instant;->ofEpochMilli(J)Lj$/time/Instant;

    move-result-object p1

    sget-object p2, LT/g;->g:Lj$/time/ZoneId;

    invoke-virtual {p1, p2}, Lj$/time/Instant;->atZone(Lj$/time/ZoneId;)Lj$/time/ZonedDateTime;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lj$/time/ZonedDateTime;->withDayOfMonth(I)Lj$/time/ZonedDateTime;

    move-result-object p1

    invoke-virtual {p1}, Lj$/time/ZonedDateTime;->toLocalDate()Lj$/time/LocalDate;

    move-result-object p1

    invoke-direct {p0, p1}, LT/g;->n(Lj$/time/LocalDate;)LT/j;

    move-result-object p1

    return-object p1
.end method

.method public h(LT/e;)LT/j;
    .locals 2

    invoke-virtual {p1}, LT/e;->m()I

    move-result v0

    invoke-virtual {p1}, LT/e;->g()I

    move-result p1

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Lj$/time/LocalDate;->of(III)Lj$/time/LocalDate;

    move-result-object p1

    invoke-direct {p0, p1}, LT/g;->n(Lj$/time/LocalDate;)LT/j;

    move-result-object p1

    return-object p1
.end method

.method public i()LT/e;
    .locals 8

    invoke-static {}, Lj$/time/LocalDate;->now()Lj$/time/LocalDate;

    move-result-object v0

    new-instance v7, LT/e;

    invoke-virtual {v0}, Lj$/time/LocalDate;->getYear()I

    move-result v2

    invoke-virtual {v0}, Lj$/time/LocalDate;->getMonthValue()I

    move-result v3

    invoke-virtual {v0}, Lj$/time/LocalDate;->getDayOfMonth()I

    move-result v4

    sget-object v1, Lj$/time/LocalTime;->MIDNIGHT:Lj$/time/LocalTime;

    invoke-virtual {v0, v1}, Lj$/time/LocalDate;->atTime(Lj$/time/LocalTime;)Lj$/time/LocalDateTime;

    move-result-object v0

    sget-object v1, LT/g;->g:Lj$/time/ZoneId;

    invoke-virtual {v0, v1}, Lj$/time/LocalDateTime;->atZone(Lj$/time/ZoneId;)Lj$/time/ZonedDateTime;

    move-result-object v0

    invoke-interface {v0}, Lj$/time/chrono/ChronoZonedDateTime;->toInstant()Lj$/time/Instant;

    move-result-object v0

    invoke-virtual {v0}, Lj$/time/Instant;->toEpochMilli()J

    move-result-wide v5

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, LT/e;-><init>(IIIJ)V

    return-object v7
.end method

.method public j()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LT/g;->d:Ljava/util/List;

    return-object v0
.end method

.method public k(Ljava/lang/String;Ljava/lang/String;)LT/e;
    .locals 6

    .prologue
    invoke-static {p2}, Lj$/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Lj$/time/format/DateTimeFormatter;

    move-result-object p2

    :try_start_0
    invoke-static {p1, p2}, Lj$/time/LocalDate;->parse(Ljava/lang/CharSequence;Lj$/time/format/DateTimeFormatter;)Lj$/time/LocalDate;

    move-result-object p1

    new-instance p2, LT/e;

    invoke-virtual {p1}, Lj$/time/LocalDate;->getYear()I

    move-result v1

    invoke-virtual {p1}, Lj$/time/LocalDate;->getMonth()Lj$/time/Month;

    move-result-object v0

    invoke-virtual {v0}, Lj$/time/Month;->getValue()I

    move-result v2

    invoke-virtual {p1}, Lj$/time/LocalDate;->getDayOfMonth()I

    move-result v3

    sget-object v0, Lj$/time/LocalTime;->MIDNIGHT:Lj$/time/LocalTime;

    invoke-virtual {p1, v0}, Lj$/time/LocalDate;->atTime(Lj$/time/LocalTime;)Lj$/time/LocalDateTime;

    move-result-object p1

    sget-object v0, LT/g;->g:Lj$/time/ZoneId;

    invoke-virtual {p1, v0}, Lj$/time/LocalDateTime;->atZone(Lj$/time/ZoneId;)Lj$/time/ZonedDateTime;

    move-result-object p1

    invoke-interface {p1}, Lj$/time/chrono/ChronoZonedDateTime;->toInstant()Lj$/time/Instant;

    move-result-object p1

    invoke-virtual {p1}, Lj$/time/Instant;->toEpochMilli()J

    move-result-wide v4

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, LT/e;-><init>(IIIJ)V
    :try_end_0
    .catch Lj$/time/format/DateTimeParseException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p2, 0x0

    :goto_0
    return-object p2
.end method

.method public l(LT/j;I)LT/j;
    .locals 2

    .prologue
    if-gtz p2, :cond_0

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, LT/g;->o(LT/j;)Lj$/time/LocalDate;

    move-result-object p1

    int-to-long v0, p2

    invoke-virtual {p1, v0, v1}, Lj$/time/LocalDate;->plusMonths(J)Lj$/time/LocalDate;

    move-result-object p1

    invoke-direct {p0, p1}, LT/g;->n(Lj$/time/LocalDate;)LT/j;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "CalendarModel"

    return-object v0
.end method
