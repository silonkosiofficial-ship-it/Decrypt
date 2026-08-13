.class final Landroidx/compose/animation/EnterExitTransitionElement;
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
        "\u00ed"
    }
    d2 = {
        "\u00ee",
        "\u00ef",
        "\u00f0",
        "\u00f1",
        "\u00f2",
        "\u00f3",
        "\u00f4",
        "\u00f5",
        "\u00f6",
        "\u00f7",
        "\u00f8",
        "\u00f9",
        "\u00fa",
        "\u00fb",
        "\u00fc",
        "\u00fd",
        "\u00fe",
        "\u00ff",
        "",
        "\u0100",
        "\u0101",
        "\u0102",
        "\u0103",
        "\u0104",
        "\u0105",
        "\u0106",
        "\u0107",
        "\u0108",
        "\u0109",
        "\u010a",
        "",
        "\u010b",
        "\u010c",
        "",
        "\u010d",
        "\u010e",
        "",
        "\u010f",
        "\u0110",
        "\u0111",
        "\u0112",
        "\u0113",
        "\u0114",
        "\u0115",
        "\u0116",
        "\u0117",
        "\u0118",
        "\u0119",
        "\u011a",
        "\u011b",
        "\u011c",
        "\u011d",
        "\u011e",
        "\u011f",
        "\u0120",
        "\u0121",
        "\u0122",
        "\u0123",
        "\u0124",
        "\u0125",
        "\u0126",
        "\u0127",
        "\u0128",
        "\u0129",
        "\u012a",
        "\u012b",
        "\u012c",
        "\u012d",
        "\u012e",
        "\u012f",
        "\u0130",
        "\u0131",
        "\u0132",
        "\u0133",
        "\u0134",
        "\u0135",
        "\u0136",
        "\u0137",
        "\u0138",
        "\u0139"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final b:Lu/s0;

.field private c:Lu/s0$a;

.field private d:Lu/s0$a;

.field private e:Lu/s0$a;

.field private f:Landroidx/compose/animation/h;

.field private g:Landroidx/compose/animation/j;

.field private h:Lx7/a;

.field private i:Lt/r;


# direct methods
.method public constructor <init>(Lu/s0;Lu/s0$a;Lu/s0$a;Lu/s0$a;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lx7/a;Lt/r;)V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    iput-object p1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->b:Lu/s0;

    iput-object p2, p0, Landroidx/compose/animation/EnterExitTransitionElement;->c:Lu/s0$a;

    iput-object p3, p0, Landroidx/compose/animation/EnterExitTransitionElement;->d:Lu/s0$a;

    iput-object p4, p0, Landroidx/compose/animation/EnterExitTransitionElement;->e:Lu/s0$a;

    iput-object p5, p0, Landroidx/compose/animation/EnterExitTransitionElement;->f:Landroidx/compose/animation/h;

    iput-object p6, p0, Landroidx/compose/animation/EnterExitTransitionElement;->g:Landroidx/compose/animation/j;

    iput-object p7, p0, Landroidx/compose/animation/EnterExitTransitionElement;->h:Lx7/a;

    iput-object p8, p0, Landroidx/compose/animation/EnterExitTransitionElement;->i:Lt/r;

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
    instance-of v1, p1, Landroidx/compose/animation/EnterExitTransitionElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/animation/EnterExitTransitionElement;

    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->b:Lu/s0;

    iget-object v3, p1, Landroidx/compose/animation/EnterExitTransitionElement;->b:Lu/s0;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->c:Lu/s0$a;

    iget-object v3, p1, Landroidx/compose/animation/EnterExitTransitionElement;->c:Lu/s0$a;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->d:Lu/s0$a;

    iget-object v3, p1, Landroidx/compose/animation/EnterExitTransitionElement;->d:Lu/s0$a;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->e:Lu/s0$a;

    iget-object v3, p1, Landroidx/compose/animation/EnterExitTransitionElement;->e:Lu/s0$a;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->f:Landroidx/compose/animation/h;

    iget-object v3, p1, Landroidx/compose/animation/EnterExitTransitionElement;->f:Landroidx/compose/animation/h;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->g:Landroidx/compose/animation/j;

    iget-object v3, p1, Landroidx/compose/animation/EnterExitTransitionElement;->g:Landroidx/compose/animation/j;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->h:Lx7/a;

    iget-object v3, p1, Landroidx/compose/animation/EnterExitTransitionElement;->h:Lx7/a;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->i:Lt/r;

    iget-object p1, p1, Landroidx/compose/animation/EnterExitTransitionElement;->i:Lt/r;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/animation/EnterExitTransitionElement;->l()Landroidx/compose/animation/g;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/compose/animation/EnterExitTransitionElement;->b:Lu/s0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->c:Lu/s0$a;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->d:Lu/s0$a;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->e:Lu/s0$a;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->f:Landroidx/compose/animation/h;

    invoke-virtual {v1}, Landroidx/compose/animation/h;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->g:Landroidx/compose/animation/j;

    invoke-virtual {v1}, Landroidx/compose/animation/j;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->h:Lx7/a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->i:Lt/r;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, Landroidx/compose/animation/g;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/EnterExitTransitionElement;->m(Landroidx/compose/animation/g;)V

    return-void
.end method

.method public l()Landroidx/compose/animation/g;
    .locals 10

    new-instance v9, Landroidx/compose/animation/g;

    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->b:Lu/s0;

    iget-object v2, p0, Landroidx/compose/animation/EnterExitTransitionElement;->c:Lu/s0$a;

    iget-object v3, p0, Landroidx/compose/animation/EnterExitTransitionElement;->d:Lu/s0$a;

    iget-object v4, p0, Landroidx/compose/animation/EnterExitTransitionElement;->e:Lu/s0$a;

    iget-object v5, p0, Landroidx/compose/animation/EnterExitTransitionElement;->f:Landroidx/compose/animation/h;

    iget-object v6, p0, Landroidx/compose/animation/EnterExitTransitionElement;->g:Landroidx/compose/animation/j;

    iget-object v7, p0, Landroidx/compose/animation/EnterExitTransitionElement;->h:Lx7/a;

    iget-object v8, p0, Landroidx/compose/animation/EnterExitTransitionElement;->i:Lt/r;

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Landroidx/compose/animation/g;-><init>(Lu/s0;Lu/s0$a;Lu/s0$a;Lu/s0$a;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lx7/a;Lt/r;)V

    return-object v9
.end method

.method public m(Landroidx/compose/animation/g;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/animation/EnterExitTransitionElement;->b:Lu/s0;

    invoke-virtual {p1, v0}, Landroidx/compose/animation/g;->e2(Lu/s0;)V

    iget-object v0, p0, Landroidx/compose/animation/EnterExitTransitionElement;->c:Lu/s0$a;

    invoke-virtual {p1, v0}, Landroidx/compose/animation/g;->c2(Lu/s0$a;)V

    iget-object v0, p0, Landroidx/compose/animation/EnterExitTransitionElement;->d:Lu/s0$a;

    invoke-virtual {p1, v0}, Landroidx/compose/animation/g;->b2(Lu/s0$a;)V

    iget-object v0, p0, Landroidx/compose/animation/EnterExitTransitionElement;->e:Lu/s0$a;

    invoke-virtual {p1, v0}, Landroidx/compose/animation/g;->d2(Lu/s0$a;)V

    iget-object v0, p0, Landroidx/compose/animation/EnterExitTransitionElement;->f:Landroidx/compose/animation/h;

    invoke-virtual {p1, v0}, Landroidx/compose/animation/g;->X1(Landroidx/compose/animation/h;)V

    iget-object v0, p0, Landroidx/compose/animation/EnterExitTransitionElement;->g:Landroidx/compose/animation/j;

    invoke-virtual {p1, v0}, Landroidx/compose/animation/g;->Y1(Landroidx/compose/animation/j;)V

    iget-object v0, p0, Landroidx/compose/animation/EnterExitTransitionElement;->h:Lx7/a;

    invoke-virtual {p1, v0}, Landroidx/compose/animation/g;->W1(Lx7/a;)V

    iget-object v0, p0, Landroidx/compose/animation/EnterExitTransitionElement;->i:Lt/r;

    invoke-virtual {p1, v0}, Landroidx/compose/animation/g;->Z1(Lt/r;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "EnterExitTransitionElement(transition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->b:Lu/s0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sizeAnimation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->c:Lu/s0$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", offsetAnimation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->d:Lu/s0$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", slideAnimation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->e:Lu/s0$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", enter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->f:Landroidx/compose/animation/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", exit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->g:Landroidx/compose/animation/j;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->h:Lx7/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", graphicsLayerBlock="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/animation/EnterExitTransitionElement;->i:Lt/r;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
