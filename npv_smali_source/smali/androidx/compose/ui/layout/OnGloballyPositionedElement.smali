.class final Landroidx/compose/ui/layout/OnGloballyPositionedElement;
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
        "\u0929"
    }
    d2 = {
        "\u092a",
        "\u092b",
        "\u092c",
        "\u092d",
        "\u092e",
        "\u092f",
        "\u0930",
        "\u0931",
        "\u0932",
        "\u0933",
        "\u0934",
        "",
        "\u0935",
        "",
        "\u0936",
        "\u0937",
        "",
        "\u0938",
        "\u0939",
        "\u093a",
        "\u093b",
        "\u093c",
        "\u093d",
        "\u093e",
        "\u093f",
        "\u0940",
        "\u0941"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final b:Lx7/l;


# direct methods
.method public constructor <init>(Lx7/l;)V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/layout/OnGloballyPositionedElement;->b:Lx7/l;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/ui/layout/OnGloballyPositionedElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, Landroidx/compose/ui/layout/OnGloballyPositionedElement;->b:Lx7/l;

    check-cast p1, Landroidx/compose/ui/layout/OnGloballyPositionedElement;

    iget-object p1, p1, Landroidx/compose/ui/layout/OnGloballyPositionedElement;->b:Lx7/l;

    if-ne v1, p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/layout/OnGloballyPositionedElement;->l()Landroidx/compose/ui/layout/d;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/OnGloballyPositionedElement;->b:Lx7/l;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, Landroidx/compose/ui/layout/d;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/layout/OnGloballyPositionedElement;->m(Landroidx/compose/ui/layout/d;)V

    return-void
.end method

.method public l()Landroidx/compose/ui/layout/d;
    .locals 2

    new-instance v0, Landroidx/compose/ui/layout/d;

    iget-object v1, p0, Landroidx/compose/ui/layout/OnGloballyPositionedElement;->b:Lx7/l;

    invoke-direct {v0, v1}, Landroidx/compose/ui/layout/d;-><init>(Lx7/l;)V

    return-object v0
.end method

.method public m(Landroidx/compose/ui/layout/d;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/OnGloballyPositionedElement;->b:Lx7/l;

    invoke-virtual {p1, v0}, Landroidx/compose/ui/layout/d;->T1(Lx7/l;)V

    return-void
.end method
