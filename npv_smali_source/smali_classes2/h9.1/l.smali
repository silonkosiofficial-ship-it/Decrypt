.class public final Lh9/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh9/l$a;,
        Lh9/l$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lh9/l;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0a54"
    }
    d2 = {
        "\u0a55",
        "",
        "\u0a56",
        "\u0a57",
        "\u0a58",
        "\u0a59",
        "",
        "\u0a5a",
        "\u0a5b",
        "\u0a5c",
        "\u0a5d",
        "\u0a5e",
        "\u0a5f",
        "\u0a60",
        "",
        "\u0a61",
        "",
        "\u0a62",
        "\u0a63",
        "\u0a64",
        "",
        "\u0a65",
        "\u0a66",
        "\u0a67",
        "\u0a68",
        "\u0a69",
        "\u0a6a",
        "\u0a6b",
        "\u0a6c",
        "\u0a6d",
        "\u0a6e",
        "\u0a6f",
        "\u0a70",
        "\u0a71",
        "\u0a72",
        "\u0a73",
        "\u0a74"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
.end annotation


# static fields
.field public static final Companion:Lh9/l$a;

.field private static final D:Lh9/l;

.field private static final E:Lh9/l;


# instance fields
.field private final C:Lj$/time/LocalTime;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lh9/l$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh9/l$a;-><init>(Ly7/k;)V

    sput-object v0, Lh9/l;->Companion:Lh9/l$a;

    new-instance v0, Lh9/l;

    sget-object v1, Lj$/time/LocalTime;->MIN:Lj$/time/LocalTime;

    const-string v2, "MIN"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lh9/l;-><init>(Lj$/time/LocalTime;)V

    sput-object v0, Lh9/l;->D:Lh9/l;

    new-instance v0, Lh9/l;

    sget-object v1, Lj$/time/LocalTime;->MAX:Lj$/time/LocalTime;

    const-string v2, "MAX"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lh9/l;-><init>(Lj$/time/LocalTime;)V

    sput-object v0, Lh9/l;->E:Lh9/l;

    return-void
.end method

.method public constructor <init>(IIII)V
    .locals 0

    .prologue
    :try_start_0
    invoke-static {p1, p2, p3, p4}, Lj$/time/LocalTime;->of(IIII)Lj$/time/LocalTime;

    move-result-object p1
    :try_end_0
    .catch Lj$/time/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lh9/l;-><init>(Lj$/time/LocalTime;)V

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public constructor <init>(Lj$/time/LocalTime;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh9/l;->C:Lj$/time/LocalTime;

    return-void
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lh9/l;

    invoke-virtual {p0, p1}, Lh9/l;->e(Lh9/l;)I

    move-result p1

    return p1
.end method

.method public e(Lh9/l;)I
    .locals 1

    const-string v0, "other"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh9/l;->C:Lj$/time/LocalTime;

    iget-object p1, p1, Lh9/l;->C:Lj$/time/LocalTime;

    invoke-virtual {v0, p1}, Lj$/time/LocalTime;->compareTo(Lj$/time/LocalTime;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    if-eq p0, p1, :cond_1

    instance-of v0, p1, Lh9/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh9/l;->C:Lj$/time/LocalTime;

    check-cast p1, Lh9/l;

    iget-object p1, p1, Lh9/l;->C:Lj$/time/LocalTime;

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

    iget-object v0, p0, Lh9/l;->C:Lj$/time/LocalTime;

    invoke-virtual {v0}, Lj$/time/LocalTime;->getHour()I

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lh9/l;->C:Lj$/time/LocalTime;

    invoke-virtual {v0}, Lj$/time/LocalTime;->hashCode()I

    move-result v0

    return v0
.end method

.method public final i()I
    .locals 1

    iget-object v0, p0, Lh9/l;->C:Lj$/time/LocalTime;

    invoke-virtual {v0}, Lj$/time/LocalTime;->getMinute()I

    move-result v0

    return v0
.end method

.method public final m()I
    .locals 1

    iget-object v0, p0, Lh9/l;->C:Lj$/time/LocalTime;

    invoke-virtual {v0}, Lj$/time/LocalTime;->getNano()I

    move-result v0

    return v0
.end method

.method public final n()I
    .locals 1

    iget-object v0, p0, Lh9/l;->C:Lj$/time/LocalTime;

    invoke-virtual {v0}, Lj$/time/LocalTime;->getSecond()I

    move-result v0

    return v0
.end method

.method public final o()Lj$/time/LocalTime;
    .locals 1

    iget-object v0, p0, Lh9/l;->C:Lj$/time/LocalTime;

    return-object v0
.end method

.method public final q()I
    .locals 1

    iget-object v0, p0, Lh9/l;->C:Lj$/time/LocalTime;

    invoke-virtual {v0}, Lj$/time/LocalTime;->toSecondOfDay()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lh9/l;->C:Lj$/time/LocalTime;

    invoke-virtual {v0}, Lj$/time/LocalTime;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
