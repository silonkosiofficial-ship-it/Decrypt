.class public final Lh9/e;
.super Lh9/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh9/e$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0adc"
    }
    d2 = {
        "\u0add",
        "\u0ade",
        "\u0adf",
        "\u0ae0",
        "\u0ae1",
        "\u0ae2",
        "\u0ae3",
        "\u0ae4",
        "\u0ae5",
        "\u0ae6",
        "\u0ae7",
        "\u0ae8",
        "\u0ae9",
        "\u0aea",
        "\u0aeb",
        "\u0aec"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
.end annotation


# static fields
.field public static final Companion:Lh9/e$a;


# instance fields
.field private final c:Lh9/r;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh9/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh9/e$a;-><init>(Ly7/k;)V

    sput-object v0, Lh9/e;->Companion:Lh9/e$a;

    return-void
.end method

.method public constructor <init>(Lh9/r;)V
    .locals 1

    const-string v0, "offset"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lh9/r;->b()Lj$/time/ZoneOffset;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lh9/e;-><init>(Lh9/r;Lj$/time/ZoneId;)V

    return-void
.end method

.method public constructor <init>(Lh9/r;Lj$/time/ZoneId;)V
    .locals 1

    const-string v0, "offset"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "zoneId"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, Lh9/o;-><init>(Lj$/time/ZoneId;)V

    iput-object p1, p0, Lh9/e;->c:Lh9/r;

    return-void
.end method
