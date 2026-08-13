.class final Landroidx/compose/foundation/ScrollSemanticsElement;
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
        "\u024d"
    }
    d2 = {
        "\u024e",
        "\u024f",
        "\u0250",
        "\u0251",
        "\u0252",
        "",
        "\u0253",
        "\u0254",
        "\u0255",
        "\u0256",
        "\u0257",
        "\u0258",
        "\u0259",
        "\u025a",
        "\u025b",
        "\u025c",
        "\u025d",
        "\u025e",
        "\u025f",
        "",
        "\u0260",
        "\u0261",
        "",
        "\u0262",
        "\u0263",
        "",
        "\u0264",
        "\u0265",
        "\u0266",
        "\u0267",
        "\u0268",
        "\u0269",
        "\u026a",
        "\u026b",
        "\u026c",
        "\u026d",
        "\u026e",
        "\u026f",
        "\u0270",
        "\u0271",
        "\u0272",
        "\u0273",
        "\u0274",
        "\u0275"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final b:Landroidx/compose/foundation/m;

.field private final c:Z

.field private final d:Lx/p;

.field private final e:Z

.field private final f:Z


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/m;ZLx/p;ZZ)V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/ScrollSemanticsElement;->b:Landroidx/compose/foundation/m;

    iput-boolean p2, p0, Landroidx/compose/foundation/ScrollSemanticsElement;->c:Z

    iput-object p3, p0, Landroidx/compose/foundation/ScrollSemanticsElement;->d:Lx/p;

    iput-boolean p4, p0, Landroidx/compose/foundation/ScrollSemanticsElement;->e:Z

    iput-boolean p5, p0, Landroidx/compose/foundation/ScrollSemanticsElement;->f:Z

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
    instance-of v1, p1, Landroidx/compose/foundation/ScrollSemanticsElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/foundation/ScrollSemanticsElement;

    iget-object v1, p0, Landroidx/compose/foundation/ScrollSemanticsElement;->b:Landroidx/compose/foundation/m;

    iget-object v3, p1, Landroidx/compose/foundation/ScrollSemanticsElement;->b:Landroidx/compose/foundation/m;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Landroidx/compose/foundation/ScrollSemanticsElement;->c:Z

    iget-boolean v3, p1, Landroidx/compose/foundation/ScrollSemanticsElement;->c:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Landroidx/compose/foundation/ScrollSemanticsElement;->d:Lx/p;

    iget-object v3, p1, Landroidx/compose/foundation/ScrollSemanticsElement;->d:Lx/p;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Landroidx/compose/foundation/ScrollSemanticsElement;->e:Z

    iget-boolean v3, p1, Landroidx/compose/foundation/ScrollSemanticsElement;->e:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Landroidx/compose/foundation/ScrollSemanticsElement;->f:Z

    iget-boolean p1, p1, Landroidx/compose/foundation/ScrollSemanticsElement;->f:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/ScrollSemanticsElement;->l()Landroidx/compose/foundation/l;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/ScrollSemanticsElement;->b:Landroidx/compose/foundation/m;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Landroidx/compose/foundation/ScrollSemanticsElement;->c:Z

    invoke-static {v1}, Lt/h;->a(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/ScrollSemanticsElement;->d:Lx/p;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Landroidx/compose/foundation/ScrollSemanticsElement;->e:Z

    invoke-static {v1}, Lt/h;->a(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Landroidx/compose/foundation/ScrollSemanticsElement;->f:Z

    invoke-static {v1}, Lt/h;->a(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, Landroidx/compose/foundation/l;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/ScrollSemanticsElement;->m(Landroidx/compose/foundation/l;)V

    return-void
.end method

.method public l()Landroidx/compose/foundation/l;
    .locals 7

    new-instance v6, Landroidx/compose/foundation/l;

    iget-object v1, p0, Landroidx/compose/foundation/ScrollSemanticsElement;->b:Landroidx/compose/foundation/m;

    iget-boolean v2, p0, Landroidx/compose/foundation/ScrollSemanticsElement;->c:Z

    iget-object v3, p0, Landroidx/compose/foundation/ScrollSemanticsElement;->d:Lx/p;

    iget-boolean v4, p0, Landroidx/compose/foundation/ScrollSemanticsElement;->e:Z

    iget-boolean v5, p0, Landroidx/compose/foundation/ScrollSemanticsElement;->f:Z

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/l;-><init>(Landroidx/compose/foundation/m;ZLx/p;ZZ)V

    return-object v6
.end method

.method public m(Landroidx/compose/foundation/l;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/ScrollSemanticsElement;->b:Landroidx/compose/foundation/m;

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/l;->X1(Landroidx/compose/foundation/m;)V

    iget-boolean v0, p0, Landroidx/compose/foundation/ScrollSemanticsElement;->c:Z

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/l;->V1(Z)V

    iget-object v0, p0, Landroidx/compose/foundation/ScrollSemanticsElement;->d:Lx/p;

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/l;->U1(Lx/p;)V

    iget-boolean v0, p0, Landroidx/compose/foundation/ScrollSemanticsElement;->e:Z

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/l;->W1(Z)V

    iget-boolean v0, p0, Landroidx/compose/foundation/ScrollSemanticsElement;->f:Z

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/l;->Y1(Z)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ScrollSemanticsElement(state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/ScrollSemanticsElement;->b:Landroidx/compose/foundation/m;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", reverseScrolling="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Landroidx/compose/foundation/ScrollSemanticsElement;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", flingBehavior="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/ScrollSemanticsElement;->d:Lx/p;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isScrollable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Landroidx/compose/foundation/ScrollSemanticsElement;->e:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isVertical="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Landroidx/compose/foundation/ScrollSemanticsElement;->f:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
