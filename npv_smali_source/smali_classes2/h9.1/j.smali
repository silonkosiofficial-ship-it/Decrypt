.class public final Lh9/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh9/j$a;,
        Lh9/j$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lh9/j;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0a24"
    }
    d2 = {
        "\u0a25",
        "",
        "\u0a26",
        "\u0a27",
        "\u0a28",
        "\u0a29",
        "",
        "\u0a2a",
        "\u0a2b",
        "\u0a2c",
        "\u0a2d",
        "\u0a2e",
        "\u0a2f",
        "\u0a30",
        "\u0a31",
        "\u0a32",
        "\u0a33",
        "\u0a34",
        "\u0a35",
        "\u0a36",
        "\u0a37",
        "\u0a38",
        "\u0a39",
        "\u0a3a",
        "",
        "\u0a3b",
        "",
        "\u0a3c",
        "\u0a3d",
        "\u0a3e",
        "\u0a3f",
        "",
        "\u0a40",
        "\u0a41",
        "\u0a42",
        "\u0a43",
        "\u0a44",
        "\u0a45",
        "\u0a46",
        "\u0a47",
        "\u0a48",
        "\u0a49",
        "\u0a4a",
        "\u0a4b",
        "\u0a4c",
        "\u0a4d",
        "\u0a4e",
        "\u0a4f",
        "\u0a50",
        "\u0a51",
        "\u0a52",
        "\u0a53"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
.end annotation


# static fields
.field public static final Companion:Lh9/j$a;

.field private static final D:Lh9/j;

.field private static final E:Lh9/j;


# instance fields
.field private final C:Lj$/time/LocalDateTime;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lh9/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh9/j$a;-><init>(Ly7/k;)V

    sput-object v0, Lh9/j;->Companion:Lh9/j$a;

    new-instance v0, Lh9/j;

    sget-object v1, Lj$/time/LocalDateTime;->MIN:Lj$/time/LocalDateTime;

    const-string v2, "MIN"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lh9/j;-><init>(Lj$/time/LocalDateTime;)V

    sput-object v0, Lh9/j;->D:Lh9/j;

    new-instance v0, Lh9/j;

    sget-object v1, Lj$/time/LocalDateTime;->MAX:Lj$/time/LocalDateTime;

    const-string v2, "MAX"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lh9/j;-><init>(Lj$/time/LocalDateTime;)V

    sput-object v0, Lh9/j;->E:Lh9/j;

    return-void
.end method

.method public constructor <init>(IIIIIII)V
    .locals 0

    .prologue
    :try_start_0
    invoke-static/range {p1 .. p7}, Lj$/time/LocalDateTime;->of(IIIIIII)Lj$/time/LocalDateTime;

    move-result-object p1
    :try_end_0
    .catch Lj$/time/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lh9/j;-><init>(Lj$/time/LocalDateTime;)V

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public constructor <init>(ILj$/time/Month;IIIII)V
    .locals 9

    const-string v0, "month"

    move-object v1, p2

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lh9/n;->a(Lj$/time/Month;)I

    move-result v3

    move-object v1, p0

    move v2, p1

    move v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    move/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lh9/j;-><init>(IIIIIII)V

    return-void
.end method

.method public synthetic constructor <init>(ILj$/time/Month;IIIIIILy7/k;)V
    .locals 10

    .prologue
    and-int/lit8 v0, p8, 0x20

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move v8, v1

    goto :goto_0

    :cond_0
    move/from16 v8, p6

    :goto_0
    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_1

    move v9, v1

    goto :goto_1

    :cond_1
    move/from16 v9, p7

    :goto_1
    move-object v2, p0

    move v3, p1

    move-object v4, p2

    move v5, p3

    move v6, p4

    move v7, p5

    invoke-direct/range {v2 .. v9}, Lh9/j;-><init>(ILj$/time/Month;IIIII)V

    return-void
.end method

.method public constructor <init>(Lh9/h;Lh9/l;)V
    .locals 1

    const-string v0, "date"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "time"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lh9/h;->n()Lj$/time/LocalDate;

    move-result-object p1

    invoke-virtual {p2}, Lh9/l;->o()Lj$/time/LocalTime;

    move-result-object p2

    invoke-static {p1, p2}, Lj$/time/LocalDateTime;->of(Lj$/time/LocalDate;Lj$/time/LocalTime;)Lj$/time/LocalDateTime;

    move-result-object p1

    const-string p2, "of(...)"

    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lh9/j;-><init>(Lj$/time/LocalDateTime;)V

    return-void
.end method

.method public constructor <init>(Lj$/time/LocalDateTime;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh9/j;->C:Lj$/time/LocalDateTime;

    return-void
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lh9/j;

    invoke-virtual {p0, p1}, Lh9/j;->e(Lh9/j;)I

    move-result p1

    return p1
.end method

.method public e(Lh9/j;)I
    .locals 1

    const-string v0, "other"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh9/j;->C:Lj$/time/LocalDateTime;

    iget-object p1, p1, Lh9/j;->C:Lj$/time/LocalDateTime;

    invoke-virtual {v0, p1}, Lj$/time/LocalDateTime;->compareTo(Lj$/time/chrono/ChronoLocalDateTime;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    if-eq p0, p1, :cond_1

    instance-of v0, p1, Lh9/j;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh9/j;->C:Lj$/time/LocalDateTime;

    check-cast p1, Lh9/j;

    iget-object p1, p1, Lh9/j;->C:Lj$/time/LocalDateTime;

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

.method public final g()Lh9/h;
    .locals 3

    new-instance v0, Lh9/h;

    iget-object v1, p0, Lh9/j;->C:Lj$/time/LocalDateTime;

    invoke-virtual {v1}, Lj$/time/LocalDateTime;->toLocalDate()Lj$/time/LocalDate;

    move-result-object v1

    const-string v2, "toLocalDate(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lh9/h;-><init>(Lj$/time/LocalDate;)V

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lh9/j;->C:Lj$/time/LocalDateTime;

    invoke-virtual {v0}, Lj$/time/LocalDateTime;->hashCode()I

    move-result v0

    return v0
.end method

.method public final i()I
    .locals 1

    iget-object v0, p0, Lh9/j;->C:Lj$/time/LocalDateTime;

    invoke-virtual {v0}, Lj$/time/LocalDateTime;->getDayOfMonth()I

    move-result v0

    return v0
.end method

.method public final m()Lj$/time/Month;
    .locals 2

    iget-object v0, p0, Lh9/j;->C:Lj$/time/LocalDateTime;

    invoke-virtual {v0}, Lj$/time/LocalDateTime;->getMonth()Lj$/time/Month;

    move-result-object v0

    const-string v1, "getMonth(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final n()Lh9/l;
    .locals 3

    new-instance v0, Lh9/l;

    iget-object v1, p0, Lh9/j;->C:Lj$/time/LocalDateTime;

    invoke-virtual {v1}, Lj$/time/LocalDateTime;->toLocalTime()Lj$/time/LocalTime;

    move-result-object v1

    const-string v2, "toLocalTime(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lh9/l;-><init>(Lj$/time/LocalTime;)V

    return-object v0
.end method

.method public final o()Lj$/time/LocalDateTime;
    .locals 1

    iget-object v0, p0, Lh9/j;->C:Lj$/time/LocalDateTime;

    return-object v0
.end method

.method public final q()I
    .locals 1

    iget-object v0, p0, Lh9/j;->C:Lj$/time/LocalDateTime;

    invoke-virtual {v0}, Lj$/time/LocalDateTime;->getYear()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lh9/j;->C:Lj$/time/LocalDateTime;

    invoke-virtual {v0}, Lj$/time/LocalDateTime;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
