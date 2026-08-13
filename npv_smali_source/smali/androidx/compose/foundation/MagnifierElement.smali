.class public final Landroidx/compose/foundation/MagnifierElement;
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
        "\u021c"
    }
    d2 = {
        "\u021d",
        "\u021e",
        "\u021f",
        "\u0220",
        "\u0221",
        "\u0222",
        "\u0223",
        "\u0224",
        "\u0225",
        "\u0226",
        "\u0227",
        "",
        "\u0228",
        "",
        "\u0229",
        "\u022a",
        "\u022b",
        "\u022c",
        "\u022d",
        "\u022e",
        "\u022f",
        "\u0230",
        "\u0231",
        "\u0232",
        "\u0233",
        "\u0234",
        "\u0235",
        "\u0236",
        "\u0237",
        "",
        "\u0238",
        "\u0239",
        "\u023a",
        "",
        "\u023b",
        "\u023c",
        "\u023d",
        "\u023e",
        "\u023f",
        "\u0240",
        "\u0241",
        "\u0242",
        "\u0243",
        "\u0244",
        "\u0245",
        "\u0246",
        "\u0247",
        "\u0248",
        "\u0249",
        "\u024a",
        "\u024b",
        "\u024c"
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

.field private final c:Lx7/l;

.field private final d:Lx7/l;

.field private final e:F

.field private final f:Z

.field private final g:J

.field private final h:F

.field private final i:F

.field private final j:Z

.field private final k:Lv/W;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lx7/l;Lx7/l;Lx7/l;FZJFFZLv/W;)V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/MagnifierElement;->b:Lx7/l;

    iput-object p2, p0, Landroidx/compose/foundation/MagnifierElement;->c:Lx7/l;

    iput-object p3, p0, Landroidx/compose/foundation/MagnifierElement;->d:Lx7/l;

    iput p4, p0, Landroidx/compose/foundation/MagnifierElement;->e:F

    iput-boolean p5, p0, Landroidx/compose/foundation/MagnifierElement;->f:Z

    iput-wide p6, p0, Landroidx/compose/foundation/MagnifierElement;->g:J

    iput p8, p0, Landroidx/compose/foundation/MagnifierElement;->h:F

    iput p9, p0, Landroidx/compose/foundation/MagnifierElement;->i:F

    iput-boolean p10, p0, Landroidx/compose/foundation/MagnifierElement;->j:Z

    iput-object p11, p0, Landroidx/compose/foundation/MagnifierElement;->k:Lv/W;

    return-void
.end method

.method public synthetic constructor <init>(Lx7/l;Lx7/l;Lx7/l;FZJFFZLv/W;Ly7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p11}, Landroidx/compose/foundation/MagnifierElement;-><init>(Lx7/l;Lx7/l;Lx7/l;FZJFFZLv/W;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/foundation/MagnifierElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, Landroidx/compose/foundation/MagnifierElement;->b:Lx7/l;

    check-cast p1, Landroidx/compose/foundation/MagnifierElement;

    iget-object v3, p1, Landroidx/compose/foundation/MagnifierElement;->b:Lx7/l;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Landroidx/compose/foundation/MagnifierElement;->c:Lx7/l;

    iget-object v3, p1, Landroidx/compose/foundation/MagnifierElement;->c:Lx7/l;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Landroidx/compose/foundation/MagnifierElement;->e:F

    iget v3, p1, Landroidx/compose/foundation/MagnifierElement;->e:F

    cmpg-float v1, v1, v3

    if-nez v1, :cond_b

    iget-boolean v1, p0, Landroidx/compose/foundation/MagnifierElement;->f:Z

    iget-boolean v3, p1, Landroidx/compose/foundation/MagnifierElement;->f:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Landroidx/compose/foundation/MagnifierElement;->g:J

    iget-wide v5, p1, Landroidx/compose/foundation/MagnifierElement;->g:J

    invoke-static {v3, v4, v5, v6}, LY0/l;->f(JJ)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Landroidx/compose/foundation/MagnifierElement;->h:F

    iget v3, p1, Landroidx/compose/foundation/MagnifierElement;->h:F

    invoke-static {v1, v3}, LY0/i;->s(FF)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Landroidx/compose/foundation/MagnifierElement;->i:F

    iget v3, p1, Landroidx/compose/foundation/MagnifierElement;->i:F

    invoke-static {v1, v3}, LY0/i;->s(FF)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Landroidx/compose/foundation/MagnifierElement;->j:Z

    iget-boolean v3, p1, Landroidx/compose/foundation/MagnifierElement;->j:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Landroidx/compose/foundation/MagnifierElement;->d:Lx7/l;

    iget-object v3, p1, Landroidx/compose/foundation/MagnifierElement;->d:Lx7/l;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Landroidx/compose/foundation/MagnifierElement;->k:Lv/W;

    iget-object p1, p1, Landroidx/compose/foundation/MagnifierElement;->k:Lv/W;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0

    :cond_b
    return v2
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/MagnifierElement;->l()Lv/J;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/MagnifierElement;->b:Lx7/l;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/MagnifierElement;->c:Lx7/l;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Landroidx/compose/foundation/MagnifierElement;->e:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Landroidx/compose/foundation/MagnifierElement;->f:Z

    invoke-static {v1}, Lt/h;->a(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Landroidx/compose/foundation/MagnifierElement;->g:J

    invoke-static {v3, v4}, LY0/l;->i(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Landroidx/compose/foundation/MagnifierElement;->h:F

    invoke-static {v1}, LY0/i;->t(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Landroidx/compose/foundation/MagnifierElement;->i:F

    invoke-static {v1}, LY0/i;->t(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Landroidx/compose/foundation/MagnifierElement;->j:Z

    invoke-static {v1}, Lt/h;->a(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/MagnifierElement;->d:Lx7/l;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/MagnifierElement;->k:Lv/W;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, Lv/J;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/MagnifierElement;->m(Lv/J;)V

    return-void
.end method

.method public l()Lv/J;
    .locals 14

    iget-object v1, p0, Landroidx/compose/foundation/MagnifierElement;->b:Lx7/l;

    iget-object v2, p0, Landroidx/compose/foundation/MagnifierElement;->c:Lx7/l;

    iget v4, p0, Landroidx/compose/foundation/MagnifierElement;->e:F

    iget-boolean v5, p0, Landroidx/compose/foundation/MagnifierElement;->f:Z

    iget-wide v6, p0, Landroidx/compose/foundation/MagnifierElement;->g:J

    iget v8, p0, Landroidx/compose/foundation/MagnifierElement;->h:F

    iget v9, p0, Landroidx/compose/foundation/MagnifierElement;->i:F

    iget-boolean v10, p0, Landroidx/compose/foundation/MagnifierElement;->j:Z

    iget-object v3, p0, Landroidx/compose/foundation/MagnifierElement;->d:Lx7/l;

    iget-object v11, p0, Landroidx/compose/foundation/MagnifierElement;->k:Lv/W;

    new-instance v13, Lv/J;

    const/4 v12, 0x0

    move-object v0, v13

    invoke-direct/range {v0 .. v12}, Lv/J;-><init>(Lx7/l;Lx7/l;Lx7/l;FZJFFZLv/W;Ly7/k;)V

    return-object v13
.end method

.method public m(Lv/J;)V
    .locals 12

    iget-object v1, p0, Landroidx/compose/foundation/MagnifierElement;->b:Lx7/l;

    iget-object v2, p0, Landroidx/compose/foundation/MagnifierElement;->c:Lx7/l;

    iget v3, p0, Landroidx/compose/foundation/MagnifierElement;->e:F

    iget-boolean v4, p0, Landroidx/compose/foundation/MagnifierElement;->f:Z

    iget-wide v5, p0, Landroidx/compose/foundation/MagnifierElement;->g:J

    iget v7, p0, Landroidx/compose/foundation/MagnifierElement;->h:F

    iget v8, p0, Landroidx/compose/foundation/MagnifierElement;->i:F

    iget-boolean v9, p0, Landroidx/compose/foundation/MagnifierElement;->j:Z

    iget-object v10, p0, Landroidx/compose/foundation/MagnifierElement;->d:Lx7/l;

    iget-object v11, p0, Landroidx/compose/foundation/MagnifierElement;->k:Lv/W;

    move-object v0, p1

    invoke-virtual/range {v0 .. v11}, Lv/J;->b2(Lx7/l;Lx7/l;FZJFFZLx7/l;Lv/W;)V

    return-void
.end method
