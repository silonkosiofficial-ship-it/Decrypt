.class public final Lh9/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh9/r$a;,
        Lh9/r$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0a8a"
    }
    d2 = {
        "\u0a8b",
        "",
        "\u0a8c",
        "\u0a8d",
        "\u0a8e",
        "\u0a8f",
        "",
        "\u0a90",
        "\u0a91",
        "\u0a92",
        "",
        "\u0a93",
        "\u0a94",
        "",
        "\u0a95",
        "\u0a96",
        "\u0a97",
        "\u0a98",
        "\u0a99",
        "\u0a9a",
        "\u0a9b",
        "\u0a9c",
        "\u0a9d"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
.end annotation


# static fields
.field public static final Companion:Lh9/r$a;

.field private static final b:Lh9/r;


# instance fields
.field private final a:Lj$/time/ZoneOffset;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lh9/r$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh9/r$a;-><init>(Ly7/k;)V

    sput-object v0, Lh9/r;->Companion:Lh9/r$a;

    new-instance v0, Lh9/r;

    sget-object v1, Lj$/time/ZoneOffset;->UTC:Lj$/time/ZoneOffset;

    const-string v2, "UTC"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lh9/r;-><init>(Lj$/time/ZoneOffset;)V

    sput-object v0, Lh9/r;->b:Lh9/r;

    return-void
.end method

.method public constructor <init>(Lj$/time/ZoneOffset;)V
    .locals 1

    const-string v0, "zoneOffset"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh9/r;->a:Lj$/time/ZoneOffset;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Lh9/r;->a:Lj$/time/ZoneOffset;

    invoke-virtual {v0}, Lj$/time/ZoneOffset;->getTotalSeconds()I

    move-result v0

    return v0
.end method

.method public final b()Lj$/time/ZoneOffset;
    .locals 1

    iget-object v0, p0, Lh9/r;->a:Lj$/time/ZoneOffset;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    instance-of v0, p1, Lh9/r;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh9/r;->a:Lj$/time/ZoneOffset;

    check-cast p1, Lh9/r;

    iget-object p1, p1, Lh9/r;->a:Lj$/time/ZoneOffset;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lh9/r;->a:Lj$/time/ZoneOffset;

    invoke-virtual {v0}, Lj$/time/ZoneOffset;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lh9/r;->a:Lj$/time/ZoneOffset;

    invoke-virtual {v0}, Lj$/time/ZoneOffset;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
