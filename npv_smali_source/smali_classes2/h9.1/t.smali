.class public abstract Lh9/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Li7/n;

.field private static final b:Li7/n;

.field private static final c:Li7/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lh9/t$c;->D:Lh9/t$c;

    invoke-static {v0}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object v0

    sput-object v0, Lh9/t;->a:Li7/n;

    sget-object v0, Lh9/t$b;->D:Lh9/t$b;

    invoke-static {v0}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object v0

    sput-object v0, Lh9/t;->b:Li7/n;

    sget-object v0, Lh9/t$a;->D:Lh9/t$a;

    invoke-static {v0}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object v0

    sput-object v0, Lh9/t;->c:Li7/n;

    return-void
.end method

.method public static final a(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lh9/r;
    .locals 3

    .prologue
    const-string v0, "ofHoursMinutesSeconds(...)"

    const/4 v1, 0x0

    if-eqz p0, :cond_2

    :try_start_0
    new-instance v2, Lh9/r;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :catch_0
    move-exception p0

    goto :goto_2

    :cond_0
    move p1, v1

    :goto_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :cond_1
    invoke-static {p0, p1, v1}, Lj$/time/ZoneOffset;->ofHoursMinutesSeconds(III)Lj$/time/ZoneOffset;

    move-result-object p0

    invoke-static {p0, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, p0}, Lh9/r;-><init>(Lj$/time/ZoneOffset;)V

    goto :goto_1

    :cond_2
    if-eqz p1, :cond_4

    new-instance v2, Lh9/r;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    div-int/lit8 p0, p0, 0x3c

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    rem-int/lit8 p1, p1, 0x3c

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :cond_3
    invoke-static {p0, p1, v1}, Lj$/time/ZoneOffset;->ofHoursMinutesSeconds(III)Lj$/time/ZoneOffset;

    move-result-object p0

    invoke-static {p0, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, p0}, Lh9/r;-><init>(Lj$/time/ZoneOffset;)V

    goto :goto_1

    :cond_4
    new-instance v2, Lh9/r;

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :cond_5
    invoke-static {v1}, Lj$/time/ZoneOffset;->ofTotalSeconds(I)Lj$/time/ZoneOffset;

    move-result-object p0

    const-string p1, "ofTotalSeconds(...)"

    invoke-static {p0, p1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, p0}, Lh9/r;-><init>(Lj$/time/ZoneOffset;)V
    :try_end_0
    .catch Lj$/time/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    return-object v2

    :goto_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static final synthetic b()Lj$/time/format/DateTimeFormatter;
    .locals 1

    invoke-static {}, Lh9/t;->f()Lj$/time/format/DateTimeFormatter;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic c()Lj$/time/format/DateTimeFormatter;
    .locals 1

    invoke-static {}, Lh9/t;->g()Lj$/time/format/DateTimeFormatter;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic d()Lj$/time/format/DateTimeFormatter;
    .locals 1

    invoke-static {}, Lh9/t;->h()Lj$/time/format/DateTimeFormatter;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic e(Ljava/lang/CharSequence;Lj$/time/format/DateTimeFormatter;)Lh9/r;
    .locals 0

    invoke-static {p0, p1}, Lh9/t;->i(Ljava/lang/CharSequence;Lj$/time/format/DateTimeFormatter;)Lh9/r;

    move-result-object p0

    return-object p0
.end method

.method private static final f()Lj$/time/format/DateTimeFormatter;
    .locals 1

    sget-object v0, Lh9/t;->c:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj$/time/format/DateTimeFormatter;

    return-object v0
.end method

.method private static final g()Lj$/time/format/DateTimeFormatter;
    .locals 1

    sget-object v0, Lh9/t;->b:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj$/time/format/DateTimeFormatter;

    return-object v0
.end method

.method private static final h()Lj$/time/format/DateTimeFormatter;
    .locals 1

    sget-object v0, Lh9/t;->a:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj$/time/format/DateTimeFormatter;

    return-object v0
.end method

.method private static final i(Ljava/lang/CharSequence;Lj$/time/format/DateTimeFormatter;)Lh9/r;
    .locals 1

    .prologue
    :try_start_0
    new-instance v0, Lh9/s;

    invoke-direct {v0}, Lh9/s;-><init>()V

    invoke-virtual {p1, p0, v0}, Lj$/time/format/DateTimeFormatter;->parse(Ljava/lang/CharSequence;Lj$/time/temporal/TemporalQuery;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lj$/time/ZoneOffset;

    new-instance p1, Lh9/r;

    invoke-direct {p1, p0}, Lh9/r;-><init>(Lj$/time/ZoneOffset;)V
    :try_end_0
    .catch Lj$/time/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p0

    new-instance p1, Lh9/c;

    invoke-direct {p1, p0}, Lh9/c;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method
