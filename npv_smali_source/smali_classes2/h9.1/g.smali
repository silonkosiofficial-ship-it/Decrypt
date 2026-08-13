.class public final Lh9/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh9/g$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lh9/g;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u09e6"
    }
    d2 = {
        "\u09e7",
        "",
        "\u09e8",
        "\u09e9",
        "\u09ea",
        "\u09eb",
        "",
        "\u09ec",
        "\u09ed",
        "\u09ee",
        "",
        "\u09ef",
        "\u09f0",
        "",
        "",
        "\u09f1",
        "\u09f2",
        "\u09f3",
        "\u09f4",
        "",
        "\u09f5",
        "\u09f6",
        "\u09f7",
        "\u09f8",
        "\u09f9",
        "\u09fa",
        "\u09fb",
        "\u09fc",
        "\u09fd",
        "\u09fe",
        "\u09ff"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
.end annotation


# static fields
.field public static final Companion:Lh9/g$a;

.field private static final D:Lh9/g;

.field private static final E:Lh9/g;

.field private static final F:Lh9/g;

.field private static final G:Lh9/g;


# instance fields
.field private final C:Lj$/time/Instant;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lh9/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh9/g$a;-><init>(Ly7/k;)V

    sput-object v0, Lh9/g;->Companion:Lh9/g$a;

    new-instance v0, Lh9/g;

    const-wide v1, -0x2ed378be301L

    const-wide/32 v3, 0x3b9ac9ff

    invoke-static {v1, v2, v3, v4}, Lj$/time/Instant;->ofEpochSecond(JJ)Lj$/time/Instant;

    move-result-object v1

    const-string v2, "ofEpochSecond(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lh9/g;-><init>(Lj$/time/Instant;)V

    sput-object v0, Lh9/g;->D:Lh9/g;

    new-instance v0, Lh9/g;

    const-wide v3, 0x2d044a2eb00L

    const-wide/16 v5, 0x0

    invoke-static {v3, v4, v5, v6}, Lj$/time/Instant;->ofEpochSecond(JJ)Lj$/time/Instant;

    move-result-object v1

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lh9/g;-><init>(Lj$/time/Instant;)V

    sput-object v0, Lh9/g;->E:Lh9/g;

    new-instance v0, Lh9/g;

    sget-object v1, Lj$/time/Instant;->MIN:Lj$/time/Instant;

    const-string v2, "MIN"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lh9/g;-><init>(Lj$/time/Instant;)V

    sput-object v0, Lh9/g;->F:Lh9/g;

    new-instance v0, Lh9/g;

    sget-object v1, Lj$/time/Instant;->MAX:Lj$/time/Instant;

    const-string v2, "MAX"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lh9/g;-><init>(Lj$/time/Instant;)V

    sput-object v0, Lh9/g;->G:Lh9/g;

    return-void
.end method

.method public constructor <init>(Lj$/time/Instant;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh9/g;->C:Lj$/time/Instant;

    return-void
.end method

.method public static final synthetic e()Lh9/g;
    .locals 1

    sget-object v0, Lh9/g;->G:Lh9/g;

    return-object v0
.end method

.method public static final synthetic g()Lh9/g;
    .locals 1

    sget-object v0, Lh9/g;->F:Lh9/g;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lh9/g;

    invoke-virtual {p0, p1}, Lh9/g;->i(Lh9/g;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    if-eq p0, p1, :cond_1

    instance-of v0, p1, Lh9/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh9/g;->C:Lj$/time/Instant;

    check-cast p1, Lh9/g;

    iget-object p1, p1, Lh9/g;->C:Lj$/time/Instant;

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

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lh9/g;->C:Lj$/time/Instant;

    invoke-virtual {v0}, Lj$/time/Instant;->hashCode()I

    move-result v0

    return v0
.end method

.method public i(Lh9/g;)I
    .locals 1

    const-string v0, "other"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh9/g;->C:Lj$/time/Instant;

    iget-object p1, p1, Lh9/g;->C:Lj$/time/Instant;

    invoke-virtual {v0, p1}, Lj$/time/Instant;->compareTo(Lj$/time/Instant;)I

    move-result p1

    return p1
.end method

.method public final m()J
    .locals 2

    iget-object v0, p0, Lh9/g;->C:Lj$/time/Instant;

    invoke-virtual {v0}, Lj$/time/Instant;->getEpochSecond()J

    move-result-wide v0

    return-wide v0
.end method

.method public final n()Lj$/time/Instant;
    .locals 1

    iget-object v0, p0, Lh9/g;->C:Lj$/time/Instant;

    return-object v0
.end method

.method public final o()J
    .locals 2

    .prologue
    :try_start_0
    iget-object v0, p0, Lh9/g;->C:Lj$/time/Instant;

    invoke-virtual {v0}, Lj$/time/Instant;->toEpochMilli()J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-object v0, p0, Lh9/g;->C:Lj$/time/Instant;

    sget-object v1, Lj$/time/Instant;->EPOCH:Lj$/time/Instant;

    invoke-virtual {v0, v1}, Lj$/time/Instant;->isAfter(Lj$/time/Instant;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide v0, 0x7fffffffffffffffL

    goto :goto_0

    :cond_0
    const-wide/high16 v0, -0x8000000000000000L

    :goto_0
    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lh9/g;->C:Lj$/time/Instant;

    invoke-virtual {v0}, Lj$/time/Instant;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
