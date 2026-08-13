.class public final Landroidx/compose/ui/semantics/EmptySemanticsElement;
.super LF0/W;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LF0/W;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u09ae"
    }
    d2 = {
        "\u09af",
        "\u09b0",
        "\u09b1",
        "\u09b2",
        "\u09b3",
        "\u09b4",
        "\u09b5",
        "\u09b6",
        "\u09b7",
        "\u09b8",
        "",
        "\u09b9",
        "\u09ba",
        "",
        "\u09bb",
        "",
        "\u09bc",
        "\u09bd",
        "\u09be",
        "\u09bf",
        "\u09c0"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final b:LK0/e;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LK0/e;)V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/semantics/EmptySemanticsElement;->b:LK0/e;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 0

    .prologue
    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/semantics/EmptySemanticsElement;->l()LK0/e;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, LK0/e;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/semantics/EmptySemanticsElement;->m(LK0/e;)V

    return-void
.end method

.method public l()LK0/e;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/semantics/EmptySemanticsElement;->b:LK0/e;

    return-object v0
.end method

.method public m(LK0/e;)V
    .locals 0

    return-void
.end method
