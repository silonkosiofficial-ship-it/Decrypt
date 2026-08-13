.class final Landroidx/compose/foundation/layout/SizeElement;
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
        "\u043b"
    }
    d2 = {
        "\u043c",
        "\u043d",
        "\u043e",
        "\u043f",
        "\u0440",
        "\u0441",
        "\u0442",
        "\u0443",
        "",
        "\u0444",
        "\u0445",
        "\u0446",
        "\u0447",
        "\u0448",
        "\u0449",
        "\u044a",
        "\u044b",
        "\u044c",
        "\u044d",
        "\u044e",
        "\u044f",
        "",
        "\u0450",
        "\u0451",
        "\u0452",
        "",
        "\u0453",
        "\u0454",
        "\u0455",
        "\u0456",
        "\u0457",
        "\u0458",
        "\u0459",
        "\u045a",
        "\u045b",
        "\u045c",
        "\u045d",
        "\u045e"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final b:F

.field private final c:F

.field private final d:F

.field private final e:F

.field private final f:Z

.field private final g:Lx7/l;


# direct methods
.method private constructor <init>(FFFFZLx7/l;)V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    iput p1, p0, Landroidx/compose/foundation/layout/SizeElement;->b:F

    iput p2, p0, Landroidx/compose/foundation/layout/SizeElement;->c:F

    iput p3, p0, Landroidx/compose/foundation/layout/SizeElement;->d:F

    iput p4, p0, Landroidx/compose/foundation/layout/SizeElement;->e:F

    iput-boolean p5, p0, Landroidx/compose/foundation/layout/SizeElement;->f:Z

    iput-object p6, p0, Landroidx/compose/foundation/layout/SizeElement;->g:Lx7/l;

    return-void
.end method

.method public synthetic constructor <init>(FFFFZLx7/l;ILy7/k;)V
    .locals 9

    .prologue
    and-int/lit8 v0, p7, 0x1

    if-eqz v0, :cond_0

    sget-object v0, LY0/i;->D:LY0/i$a;

    invoke-virtual {v0}, LY0/i$a;->c()F

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, p1

    :goto_0
    and-int/lit8 v0, p7, 0x2

    if-eqz v0, :cond_1

    sget-object v0, LY0/i;->D:LY0/i$a;

    invoke-virtual {v0}, LY0/i$a;->c()F

    move-result v0

    move v3, v0

    goto :goto_1

    :cond_1
    move v3, p2

    :goto_1
    and-int/lit8 v0, p7, 0x4

    if-eqz v0, :cond_2

    sget-object v0, LY0/i;->D:LY0/i$a;

    invoke-virtual {v0}, LY0/i$a;->c()F

    move-result v0

    move v4, v0

    goto :goto_2

    :cond_2
    move v4, p3

    :goto_2
    and-int/lit8 v0, p7, 0x8

    if-eqz v0, :cond_3

    sget-object v0, LY0/i;->D:LY0/i$a;

    invoke-virtual {v0}, LY0/i$a;->c()F

    move-result v0

    move v5, v0

    goto :goto_3

    :cond_3
    move v5, p4

    :goto_3
    const/4 v8, 0x0

    move-object v1, p0

    move v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v8}, Landroidx/compose/foundation/layout/SizeElement;-><init>(FFFFZLx7/l;Ly7/k;)V

    return-void
.end method

.method public synthetic constructor <init>(FFFFZLx7/l;Ly7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Landroidx/compose/foundation/layout/SizeElement;-><init>(FFFFZLx7/l;)V

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
    instance-of v1, p1, Landroidx/compose/foundation/layout/SizeElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget v1, p0, Landroidx/compose/foundation/layout/SizeElement;->b:F

    check-cast p1, Landroidx/compose/foundation/layout/SizeElement;

    iget v3, p1, Landroidx/compose/foundation/layout/SizeElement;->b:F

    invoke-static {v1, v3}, LY0/i;->s(FF)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Landroidx/compose/foundation/layout/SizeElement;->c:F

    iget v3, p1, Landroidx/compose/foundation/layout/SizeElement;->c:F

    invoke-static {v1, v3}, LY0/i;->s(FF)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Landroidx/compose/foundation/layout/SizeElement;->d:F

    iget v3, p1, Landroidx/compose/foundation/layout/SizeElement;->d:F

    invoke-static {v1, v3}, LY0/i;->s(FF)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Landroidx/compose/foundation/layout/SizeElement;->e:F

    iget v3, p1, Landroidx/compose/foundation/layout/SizeElement;->e:F

    invoke-static {v1, v3}, LY0/i;->s(FF)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Landroidx/compose/foundation/layout/SizeElement;->f:Z

    iget-boolean p1, p1, Landroidx/compose/foundation/layout/SizeElement;->f:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/layout/SizeElement;->l()Landroidx/compose/foundation/layout/q;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Landroidx/compose/foundation/layout/SizeElement;->b:F

    invoke-static {v0}, LY0/i;->t(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Landroidx/compose/foundation/layout/SizeElement;->c:F

    invoke-static {v1}, LY0/i;->t(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Landroidx/compose/foundation/layout/SizeElement;->d:F

    invoke-static {v1}, LY0/i;->t(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Landroidx/compose/foundation/layout/SizeElement;->e:F

    invoke-static {v1}, LY0/i;->t(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Landroidx/compose/foundation/layout/SizeElement;->f:Z

    invoke-static {v1}, Lt/h;->a(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, Landroidx/compose/foundation/layout/q;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/SizeElement;->m(Landroidx/compose/foundation/layout/q;)V

    return-void
.end method

.method public l()Landroidx/compose/foundation/layout/q;
    .locals 8

    new-instance v7, Landroidx/compose/foundation/layout/q;

    iget v1, p0, Landroidx/compose/foundation/layout/SizeElement;->b:F

    iget v2, p0, Landroidx/compose/foundation/layout/SizeElement;->c:F

    iget v3, p0, Landroidx/compose/foundation/layout/SizeElement;->d:F

    iget v4, p0, Landroidx/compose/foundation/layout/SizeElement;->e:F

    iget-boolean v5, p0, Landroidx/compose/foundation/layout/SizeElement;->f:Z

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/layout/q;-><init>(FFFFZLy7/k;)V

    return-object v7
.end method

.method public m(Landroidx/compose/foundation/layout/q;)V
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/layout/SizeElement;->b:F

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/layout/q;->Y1(F)V

    iget v0, p0, Landroidx/compose/foundation/layout/SizeElement;->c:F

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/layout/q;->X1(F)V

    iget v0, p0, Landroidx/compose/foundation/layout/SizeElement;->d:F

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/layout/q;->W1(F)V

    iget v0, p0, Landroidx/compose/foundation/layout/SizeElement;->e:F

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/layout/q;->V1(F)V

    iget-boolean v0, p0, Landroidx/compose/foundation/layout/SizeElement;->f:Z

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/layout/q;->U1(Z)V

    return-void
.end method
