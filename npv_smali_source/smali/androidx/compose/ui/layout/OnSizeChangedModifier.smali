.class final Landroidx/compose/ui/layout/OnSizeChangedModifier;
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
        "\u0942"
    }
    d2 = {
        "\u0943",
        "\u0944",
        "\u0945",
        "\u0946",
        "\u0947",
        "\u0948",
        "\u0949",
        "\u094a",
        "\u094b",
        "\u094c",
        "\u094d",
        "\u094e",
        "\u094f",
        "\u0950",
        "",
        "\u0951",
        "",
        "\u0952",
        "\u0953",
        "",
        "\u0954",
        "\u0955",
        "\u0956",
        "\u0957",
        "\u0958"
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

    iput-object p1, p0, Landroidx/compose/ui/layout/OnSizeChangedModifier;->b:Lx7/l;

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
    instance-of v1, p1, Landroidx/compose/ui/layout/OnSizeChangedModifier;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, Landroidx/compose/ui/layout/OnSizeChangedModifier;->b:Lx7/l;

    check-cast p1, Landroidx/compose/ui/layout/OnSizeChangedModifier;

    iget-object p1, p1, Landroidx/compose/ui/layout/OnSizeChangedModifier;->b:Lx7/l;

    if-ne v1, p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/layout/OnSizeChangedModifier;->l()Landroidx/compose/ui/layout/f;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/OnSizeChangedModifier;->b:Lx7/l;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, Landroidx/compose/ui/layout/f;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/layout/OnSizeChangedModifier;->m(Landroidx/compose/ui/layout/f;)V

    return-void
.end method

.method public l()Landroidx/compose/ui/layout/f;
    .locals 2

    new-instance v0, Landroidx/compose/ui/layout/f;

    iget-object v1, p0, Landroidx/compose/ui/layout/OnSizeChangedModifier;->b:Lx7/l;

    invoke-direct {v0, v1}, Landroidx/compose/ui/layout/f;-><init>(Lx7/l;)V

    return-object v0
.end method

.method public m(Landroidx/compose/ui/layout/f;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/OnSizeChangedModifier;->b:Lx7/l;

    invoke-virtual {p1, v0}, Landroidx/compose/ui/layout/f;->T1(Lx7/l;)V

    return-void
.end method
