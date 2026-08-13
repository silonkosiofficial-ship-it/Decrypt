.class public final Lh9/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh9/h$a;,
        Lh9/h$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lh9/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0a00"
    }
    d2 = {
        "\u0a01",
        "",
        "\u0a02",
        "\u0a03",
        "\u0a04",
        "\u0a05",
        "",
        "\u0a06",
        "\u0a07",
        "\u0a08",
        "\u0a09",
        "",
        "\u0a0a",
        "",
        "\u0a0b",
        "\u0a0c",
        "\u0a0d",
        "\u0a0e",
        "",
        "\u0a0f",
        "\u0a10",
        "\u0a11",
        "\u0a12",
        "\u0a13",
        "\u0a14",
        "\u0a15",
        "\u0a16",
        "\u0a17",
        "\u0a18",
        "\u0a19",
        "\u0a1a",
        "\u0a1b",
        "\u0a1c",
        "\u0a1d",
        "\u0a1e",
        "\u0a1f",
        "\u0a20",
        "\u0a21",
        "\u0a22",
        "\u0a23"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
.end annotation


# static fields
.field public static final Companion:Lh9/h$a;

.field private static final D:Lh9/h;

.field private static final E:Lh9/h;


# instance fields
.field private final C:Lj$/time/LocalDate;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lh9/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh9/h$a;-><init>(Ly7/k;)V

    sput-object v0, Lh9/h;->Companion:Lh9/h$a;

    new-instance v0, Lh9/h;

    sget-object v1, Lj$/time/LocalDate;->MIN:Lj$/time/LocalDate;

    const-string v2, "MIN"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lh9/h;-><init>(Lj$/time/LocalDate;)V

    sput-object v0, Lh9/h;->D:Lh9/h;

    new-instance v0, Lh9/h;

    sget-object v1, Lj$/time/LocalDate;->MAX:Lj$/time/LocalDate;

    const-string v2, "MAX"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lh9/h;-><init>(Lj$/time/LocalDate;)V

    sput-object v0, Lh9/h;->E:Lh9/h;

    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    .prologue
    :try_start_0
    invoke-static {p1, p2, p3}, Lj$/time/LocalDate;->of(III)Lj$/time/LocalDate;

    move-result-object p1
    :try_end_0
    .catch Lj$/time/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lh9/h;-><init>(Lj$/time/LocalDate;)V

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public constructor <init>(Lj$/time/LocalDate;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh9/h;->C:Lj$/time/LocalDate;

    return-void
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lh9/h;

    invoke-virtual {p0, p1}, Lh9/h;->e(Lh9/h;)I

    move-result p1

    return p1
.end method

.method public e(Lh9/h;)I
    .locals 1

    const-string v0, "other"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh9/h;->C:Lj$/time/LocalDate;

    iget-object p1, p1, Lh9/h;->C:Lj$/time/LocalDate;

    invoke-virtual {v0, p1}, Lj$/time/LocalDate;->compareTo(Lj$/time/chrono/ChronoLocalDate;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    if-eq p0, p1, :cond_1

    instance-of v0, p1, Lh9/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh9/h;->C:Lj$/time/LocalDate;

    check-cast p1, Lh9/h;

    iget-object p1, p1, Lh9/h;->C:Lj$/time/LocalDate;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final g()I
    .locals 1

    iget-object v0, p0, Lh9/h;->C:Lj$/time/LocalDate;

    invoke-virtual {v0}, Lj$/time/LocalDate;->getDayOfMonth()I

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lh9/h;->C:Lj$/time/LocalDate;

    invoke-virtual {v0}, Lj$/time/LocalDate;->hashCode()I

    move-result v0

    return v0
.end method

.method public final i()Lj$/time/DayOfWeek;
    .locals 2

    iget-object v0, p0, Lh9/h;->C:Lj$/time/LocalDate;

    invoke-virtual {v0}, Lj$/time/LocalDate;->getDayOfWeek()Lj$/time/DayOfWeek;

    move-result-object v0

    const-string v1, "getDayOfWeek(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final m()I
    .locals 1

    iget-object v0, p0, Lh9/h;->C:Lj$/time/LocalDate;

    invoke-virtual {v0}, Lj$/time/LocalDate;->getMonthValue()I

    move-result v0

    return v0
.end method

.method public final n()Lj$/time/LocalDate;
    .locals 1

    iget-object v0, p0, Lh9/h;->C:Lj$/time/LocalDate;

    return-object v0
.end method

.method public final o()I
    .locals 1

    iget-object v0, p0, Lh9/h;->C:Lj$/time/LocalDate;

    invoke-virtual {v0}, Lj$/time/LocalDate;->getYear()I

    move-result v0

    return v0
.end method

.method public final q()I
    .locals 2

    iget-object v0, p0, Lh9/h;->C:Lj$/time/LocalDate;

    invoke-virtual {v0}, Lj$/time/LocalDate;->toEpochDay()J

    move-result-wide v0

    invoke-static {v0, v1}, Lj9/e;->a(J)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lh9/h;->C:Lj$/time/LocalDate;

    invoke-virtual {v0}, Lj$/time/LocalDate;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
