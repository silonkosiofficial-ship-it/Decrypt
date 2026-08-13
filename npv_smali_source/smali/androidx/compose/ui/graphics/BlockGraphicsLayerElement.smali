.class final Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;
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
        "\u07e8"
    }
    d2 = {
        "\u07e9",
        "\u07ea",
        "\u07eb",
        "\u07ec",
        "\u07ed",
        "\u07ee",
        "\u07ef",
        "\u07f0",
        "\u07f1",
        "\u07f2",
        "\u07f3",
        "\u07f4",
        "\u07f5",
        "\u07f6",
        "",
        "\u07f7",
        "\u07f8",
        "",
        "\u07f9",
        "\u07fa",
        "",
        "\u07fb",
        "",
        "\u07fc",
        "\u07fd",
        "\u07fe",
        "\u07ff",
        "\u0800",
        "\u0801",
        "\u0802"
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

    iput-object p1, p0, Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;->b:Lx7/l;

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
    instance-of v1, p1, Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;

    iget-object v1, p0, Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;->b:Lx7/l;

    iget-object p1, p1, Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;->b:Lx7/l;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;->l()Lo0/m0;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;->b:Lx7/l;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, Lo0/m0;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;->m(Lo0/m0;)V

    return-void
.end method

.method public l()Lo0/m0;
    .locals 2

    new-instance v0, Lo0/m0;

    iget-object v1, p0, Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;->b:Lx7/l;

    invoke-direct {v0, v1}, Lo0/m0;-><init>(Lx7/l;)V

    return-object v0
.end method

.method public m(Lo0/m0;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;->b:Lx7/l;

    invoke-virtual {p1, v0}, Lo0/m0;->V1(Lx7/l;)V

    invoke-virtual {p1}, Lo0/m0;->U1()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BlockGraphicsLayerElement(block="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;->b:Lx7/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
