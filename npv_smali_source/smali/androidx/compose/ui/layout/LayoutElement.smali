.class final Landroidx/compose/ui/layout/LayoutElement;
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
        "\u08f4"
    }
    d2 = {
        "\u08f5",
        "\u08f6",
        "\u08f7",
        "\u08f8",
        "\u08f9",
        "\u08fa",
        "\u08fb",
        "\u08fc",
        "\u08fd",
        "\u08fe",
        "\u08ff",
        "\u0900",
        "\u0901",
        "\u0902",
        "\u0903",
        "\u0904",
        "\u0905",
        "",
        "\u0906",
        "\u0907",
        "",
        "\u0908",
        "\u0909",
        "",
        "\u090a",
        "",
        "\u090b",
        "\u090c",
        "\u090d",
        "\u090e",
        "\u090f",
        "\u0910",
        "\u0911"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final b:Lx7/q;


# direct methods
.method public constructor <init>(Lx7/q;)V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/layout/LayoutElement;->b:Lx7/q;

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
    instance-of v1, p1, Landroidx/compose/ui/layout/LayoutElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/ui/layout/LayoutElement;

    iget-object v1, p0, Landroidx/compose/ui/layout/LayoutElement;->b:Lx7/q;

    iget-object p1, p1, Landroidx/compose/ui/layout/LayoutElement;->b:Lx7/q;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/layout/LayoutElement;->l()LD0/B;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/LayoutElement;->b:Lx7/q;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, LD0/B;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/layout/LayoutElement;->m(LD0/B;)V

    return-void
.end method

.method public l()LD0/B;
    .locals 2

    new-instance v0, LD0/B;

    iget-object v1, p0, Landroidx/compose/ui/layout/LayoutElement;->b:Lx7/q;

    invoke-direct {v0, v1}, LD0/B;-><init>(Lx7/q;)V

    return-object v0
.end method

.method public m(LD0/B;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/LayoutElement;->b:Lx7/q;

    invoke-virtual {p1, v0}, LD0/B;->T1(Lx7/q;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LayoutElement(measure="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/layout/LayoutElement;->b:Lx7/q;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
