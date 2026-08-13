.class final Landroidx/compose/ui/draw/PainterElement;
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
        "\u070f"
    }
    d2 = {
        "\u0710",
        "\u0711",
        "\u0712",
        "\u0713",
        "\u0714",
        "",
        "\u0715",
        "\u0716",
        "\u0717",
        "\u0718",
        "\u0719",
        "",
        "\u071a",
        "\u071b",
        "\u071c",
        "\u071d",
        "\u071e",
        "\u071f",
        "\u0720",
        "\u0721",
        "\u0722",
        "\u0723",
        "\u0724",
        "",
        "\u0725",
        "\u0726",
        "",
        "\u0727",
        "\u0728",
        "",
        "\u0729",
        "\u072a",
        "\u072b",
        "\u072c",
        "\u072d",
        "\u072e",
        "\u072f",
        "\u0730",
        "\u0731",
        "\u0732",
        "\u0733",
        "\u0734",
        "\u0735",
        "\u0736",
        "\u0737",
        "\u0738",
        "\u0739",
        "\u073a",
        "\u073b",
        "\u073c",
        "\u073d",
        "\u073e",
        "\u073f",
        "\u0740",
        "\u0741",
        "\u0742",
        "\u0743",
        "\u0744"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final b:Lt0/b;

.field private final c:Z

.field private final d:Lh0/c;

.field private final e:LD0/h;

.field private final f:F

.field private final g:Lo0/z0;


# direct methods
.method public constructor <init>(Lt0/b;ZLh0/c;LD0/h;FLo0/z0;)V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/draw/PainterElement;->b:Lt0/b;

    iput-boolean p2, p0, Landroidx/compose/ui/draw/PainterElement;->c:Z

    iput-object p3, p0, Landroidx/compose/ui/draw/PainterElement;->d:Lh0/c;

    iput-object p4, p0, Landroidx/compose/ui/draw/PainterElement;->e:LD0/h;

    iput p5, p0, Landroidx/compose/ui/draw/PainterElement;->f:F

    iput-object p6, p0, Landroidx/compose/ui/draw/PainterElement;->g:Lo0/z0;

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
    instance-of v1, p1, Landroidx/compose/ui/draw/PainterElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/ui/draw/PainterElement;

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->b:Lt0/b;

    iget-object v3, p1, Landroidx/compose/ui/draw/PainterElement;->b:Lt0/b;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Landroidx/compose/ui/draw/PainterElement;->c:Z

    iget-boolean v3, p1, Landroidx/compose/ui/draw/PainterElement;->c:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->d:Lh0/c;

    iget-object v3, p1, Landroidx/compose/ui/draw/PainterElement;->d:Lh0/c;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->e:LD0/h;

    iget-object v3, p1, Landroidx/compose/ui/draw/PainterElement;->e:LD0/h;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Landroidx/compose/ui/draw/PainterElement;->f:F

    iget v3, p1, Landroidx/compose/ui/draw/PainterElement;->f:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->g:Lo0/z0;

    iget-object p1, p1, Landroidx/compose/ui/draw/PainterElement;->g:Lo0/z0;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/draw/PainterElement;->l()Landroidx/compose/ui/draw/e;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/draw/PainterElement;->b:Lt0/b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Landroidx/compose/ui/draw/PainterElement;->c:Z

    invoke-static {v1}, Lt/h;->a(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->d:Lh0/c;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->e:LD0/h;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Landroidx/compose/ui/draw/PainterElement;->f:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->g:Lo0/z0;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, Landroidx/compose/ui/draw/e;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/draw/PainterElement;->m(Landroidx/compose/ui/draw/e;)V

    return-void
.end method

.method public l()Landroidx/compose/ui/draw/e;
    .locals 8

    new-instance v7, Landroidx/compose/ui/draw/e;

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->b:Lt0/b;

    iget-boolean v2, p0, Landroidx/compose/ui/draw/PainterElement;->c:Z

    iget-object v3, p0, Landroidx/compose/ui/draw/PainterElement;->d:Lh0/c;

    iget-object v4, p0, Landroidx/compose/ui/draw/PainterElement;->e:LD0/h;

    iget v5, p0, Landroidx/compose/ui/draw/PainterElement;->f:F

    iget-object v6, p0, Landroidx/compose/ui/draw/PainterElement;->g:Lo0/z0;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Landroidx/compose/ui/draw/e;-><init>(Lt0/b;ZLh0/c;LD0/h;FLo0/z0;)V

    return-object v7
.end method

.method public m(Landroidx/compose/ui/draw/e;)V
    .locals 4

    .prologue
    invoke-virtual {p1}, Landroidx/compose/ui/draw/e;->V1()Z

    move-result v0

    iget-boolean v1, p0, Landroidx/compose/ui/draw/PainterElement;->c:Z

    if-ne v0, v1, :cond_1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroidx/compose/ui/draw/e;->U1()Lt0/b;

    move-result-object v0

    invoke-virtual {v0}, Lt0/b;->h()J

    move-result-wide v0

    iget-object v2, p0, Landroidx/compose/ui/draw/PainterElement;->b:Lt0/b;

    invoke-virtual {v2}, Lt0/b;->h()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ln0/m;->f(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->b:Lt0/b;

    invoke-virtual {p1, v1}, Landroidx/compose/ui/draw/e;->d2(Lt0/b;)V

    iget-boolean v1, p0, Landroidx/compose/ui/draw/PainterElement;->c:Z

    invoke-virtual {p1, v1}, Landroidx/compose/ui/draw/e;->e2(Z)V

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->d:Lh0/c;

    invoke-virtual {p1, v1}, Landroidx/compose/ui/draw/e;->a2(Lh0/c;)V

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->e:LD0/h;

    invoke-virtual {p1, v1}, Landroidx/compose/ui/draw/e;->c2(LD0/h;)V

    iget v1, p0, Landroidx/compose/ui/draw/PainterElement;->f:F

    invoke-virtual {p1, v1}, Landroidx/compose/ui/draw/e;->b(F)V

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->g:Lo0/z0;

    invoke-virtual {p1, v1}, Landroidx/compose/ui/draw/e;->b2(Lo0/z0;)V

    if-eqz v0, :cond_2

    invoke-static {p1}, LF0/H;->b(LF0/E;)V

    :cond_2
    invoke-static {p1}, LF0/t;->a(LF0/s;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PainterElement(painter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->b:Lt0/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sizeToIntrinsics="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Landroidx/compose/ui/draw/PainterElement;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", alignment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->d:Lh0/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", contentScale="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->e:LD0/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", alpha="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/ui/draw/PainterElement;->f:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", colorFilter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/draw/PainterElement;->g:Lo0/z0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
