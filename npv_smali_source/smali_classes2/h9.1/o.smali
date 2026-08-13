.class public Lh9/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh9/o$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0a75"
    }
    d2 = {
        "\u0a76",
        "",
        "\u0a77",
        "\u0a78",
        "\u0a79",
        "\u0a7a",
        "\u0a7b",
        "",
        "\u0a7c",
        "\u0a7d",
        "",
        "\u0a7e",
        "\u0a7f",
        "",
        "\u0a80",
        "\u0a81",
        "\u0a82",
        "\u0a83",
        "\u0a84",
        "\u0a85",
        "\u0a86",
        "\u0a87",
        "\u0a88",
        "\u0a89"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
.end annotation


# static fields
.field public static final Companion:Lh9/o$a;

.field private static final b:Lh9/e;


# instance fields
.field private final a:Lj$/time/ZoneId;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lh9/o$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh9/o$a;-><init>(Ly7/k;)V

    sput-object v0, Lh9/o;->Companion:Lh9/o$a;

    new-instance v0, Lh9/r;

    sget-object v1, Lj$/time/ZoneOffset;->UTC:Lj$/time/ZoneOffset;

    const-string v2, "UTC"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lh9/r;-><init>(Lj$/time/ZoneOffset;)V

    invoke-static {v0}, Lh9/u;->a(Lh9/r;)Lh9/e;

    move-result-object v0

    sput-object v0, Lh9/o;->b:Lh9/e;

    return-void
.end method

.method public constructor <init>(Lj$/time/ZoneId;)V
    .locals 1

    const-string v0, "zoneId"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh9/o;->a:Lj$/time/ZoneId;

    return-void
.end method

.method public static final synthetic a()Lh9/e;
    .locals 1

    sget-object v0, Lh9/o;->b:Lh9/e;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lh9/o;->a:Lj$/time/ZoneId;

    invoke-virtual {v0}, Lj$/time/ZoneId;->getId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getId(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final c()Lj$/time/ZoneId;
    .locals 1

    iget-object v0, p0, Lh9/o;->a:Lj$/time/ZoneId;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    if-eq p0, p1, :cond_1

    instance-of v0, p1, Lh9/o;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh9/o;->a:Lj$/time/ZoneId;

    check-cast p1, Lh9/o;

    iget-object p1, p1, Lh9/o;->a:Lj$/time/ZoneId;

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

    iget-object v0, p0, Lh9/o;->a:Lj$/time/ZoneId;

    invoke-virtual {v0}, Lj$/time/ZoneId;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lh9/o;->a:Lj$/time/ZoneId;

    invoke-virtual {v0}, Lj$/time/ZoneId;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
