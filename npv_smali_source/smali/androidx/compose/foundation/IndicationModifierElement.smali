.class final Landroidx/compose/foundation/IndicationModifierElement;
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
        "\u0202"
    }
    d2 = {
        "\u0203",
        "\u0204",
        "\u0205",
        "\u0206",
        "\u0207",
        "\u0208",
        "\u0209",
        "\u020a",
        "\u020b",
        "\u020c",
        "\u020d",
        "\u020e",
        "\u020f",
        "\u0210",
        "\u0211",
        "",
        "\u0212",
        "",
        "\u0213",
        "\u0214",
        "",
        "\u0215",
        "\u0216",
        "\u0217",
        "\u0218",
        "\u0219",
        "\u021a",
        "\u021b"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final b:Lz/j;

.field private final c:Lv/I;


# direct methods
.method public constructor <init>(Lz/j;Lv/I;)V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/IndicationModifierElement;->b:Lz/j;

    iput-object p2, p0, Landroidx/compose/foundation/IndicationModifierElement;->c:Lv/I;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/foundation/IndicationModifierElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, Landroidx/compose/foundation/IndicationModifierElement;->b:Lz/j;

    check-cast p1, Landroidx/compose/foundation/IndicationModifierElement;

    iget-object v3, p1, Landroidx/compose/foundation/IndicationModifierElement;->b:Lz/j;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Landroidx/compose/foundation/IndicationModifierElement;->c:Lv/I;

    iget-object p1, p1, Landroidx/compose/foundation/IndicationModifierElement;->c:Lv/I;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/IndicationModifierElement;->l()Landroidx/compose/foundation/j;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/IndicationModifierElement;->b:Lz/j;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/IndicationModifierElement;->c:Lv/I;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, Landroidx/compose/foundation/j;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/IndicationModifierElement;->m(Landroidx/compose/foundation/j;)V

    return-void
.end method

.method public l()Landroidx/compose/foundation/j;
    .locals 3

    new-instance v0, Landroidx/compose/foundation/j;

    iget-object v1, p0, Landroidx/compose/foundation/IndicationModifierElement;->c:Lv/I;

    iget-object v2, p0, Landroidx/compose/foundation/IndicationModifierElement;->b:Lz/j;

    invoke-interface {v1, v2}, Lv/I;->a(Lz/j;)LF0/j;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/compose/foundation/j;-><init>(LF0/j;)V

    return-object v0
.end method

.method public m(Landroidx/compose/foundation/j;)V
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/IndicationModifierElement;->c:Lv/I;

    iget-object v1, p0, Landroidx/compose/foundation/IndicationModifierElement;->b:Lz/j;

    invoke-interface {v0, v1}, Lv/I;->a(Lz/j;)LF0/j;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/j;->Z1(LF0/j;)V

    return-void
.end method
