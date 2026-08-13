.class public final Lu/M0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu/F0;


# instance fields
.field private final a:Lr/l;

.field private final b:Lr/n;

.field private final c:I

.field private final d:I

.field private final e:Lu/F;

.field private final f:I

.field private g:[I

.field private h:[F

.field private i:Lu/r;

.field private j:Lu/r;

.field private k:Lu/r;

.field private l:Lu/r;

.field private m:[F

.field private n:[F

.field private o:Lu/v;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lr/l;Lr/n;IILu/F;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu/M0;->a:Lr/l;

    iput-object p2, p0, Lu/M0;->b:Lr/n;

    iput p3, p0, Lu/M0;->c:I

    iput p4, p0, Lu/M0;->d:I

    iput-object p5, p0, Lu/M0;->e:Lu/F;

    iput p6, p0, Lu/M0;->f:I

    return-void
.end method

.method public synthetic constructor <init>(Lr/l;Lr/n;IILu/F;ILy7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lu/M0;-><init>(Lr/l;Lr/n;IILu/F;I)V

    return-void
.end method

.method private final h(I)I
    .locals 6

    .prologue
    iget-object v0, p0, Lu/M0;->a:Lr/l;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v1, p1

    invoke-static/range {v0 .. v5}, Lu/U;->b(Lr/l;IIIILjava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-ge p1, v0, :cond_0

    add-int/lit8 p1, p1, 0x2

    neg-int p1, p1

    :cond_0
    return p1
.end method

.method private final i(I)F
    .locals 2

    invoke-direct {p0, p1}, Lu/M0;->h(I)I

    move-result v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lu/M0;->j(IIZ)F

    move-result p1

    return p1
.end method

.method private final j(IIZ)F
    .locals 4

    .prologue
    iget-object v0, p0, Lu/M0;->a:Lr/l;

    iget v1, v0, Lr/l;->b:I

    add-int/lit8 v1, v1, -0x1

    const-wide/16 v2, 0x3e8

    if-lt p1, v1, :cond_0

    int-to-float p1, p2

    :goto_0
    long-to-float p2, v2

    div-float/2addr p1, p2

    return p1

    :cond_0
    invoke-virtual {v0, p1}, Lr/l;->a(I)I

    move-result v0

    iget-object v1, p0, Lu/M0;->a:Lr/l;

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {v1, p1}, Lr/l;->a(I)I

    move-result p1

    if-ne p2, v0, :cond_1

    int-to-float p1, v0

    goto :goto_0

    :cond_1
    sub-int/2addr p1, v0

    iget-object v1, p0, Lu/M0;->b:Lr/n;

    invoke-virtual {v1, v0}, Lr/n;->c(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu/L0;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lu/L0;->b()Lu/F;

    move-result-object v1

    if-nez v1, :cond_3

    :cond_2
    iget-object v1, p0, Lu/M0;->e:Lu/F;

    :cond_3
    sub-int/2addr p2, v0

    int-to-float p2, p2

    int-to-float p1, p1

    div-float/2addr p2, p1

    invoke-interface {v1, p2}, Lu/F;->a(F)F

    move-result p2

    if-eqz p3, :cond_4

    return p2

    :cond_4
    mul-float/2addr p1, p2

    int-to-float p2, v0

    add-float/2addr p1, p2

    goto :goto_0
.end method

.method private final k(Lu/r;Lu/r;Lu/r;)V
    .locals 9

    .prologue
    iget-object v0, p0, Lu/M0;->o:Lu/v;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object v3, p0, Lu/M0;->i:Lu/r;

    if-nez v3, :cond_5

    invoke-static {p1}, Lu/s;->g(Lu/r;)Lu/r;

    move-result-object v3

    iput-object v3, p0, Lu/M0;->i:Lu/r;

    invoke-static {p3}, Lu/s;->g(Lu/r;)Lu/r;

    move-result-object p3

    iput-object p3, p0, Lu/M0;->j:Lu/r;

    iget-object p3, p0, Lu/M0;->a:Lr/l;

    invoke-virtual {p3}, Lr/l;->b()I

    move-result p3

    new-array v3, p3, [F

    move v4, v1

    :goto_1
    if-ge v4, p3, :cond_1

    iget-object v5, p0, Lu/M0;->a:Lr/l;

    invoke-virtual {v5, v4}, Lr/l;->a(I)I

    move-result v5

    int-to-float v5, v5

    const-wide/16 v6, 0x3e8

    long-to-float v6, v6

    div-float/2addr v5, v6

    aput v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    iput-object v3, p0, Lu/M0;->h:[F

    iget-object p3, p0, Lu/M0;->a:Lr/l;

    invoke-virtual {p3}, Lr/l;->b()I

    move-result p3

    new-array v3, p3, [I

    move v4, v1

    :goto_2
    if-ge v4, p3, :cond_4

    iget-object v5, p0, Lu/M0;->b:Lr/n;

    iget-object v6, p0, Lu/M0;->a:Lr/l;

    invoke-virtual {v6, v4}, Lr/l;->a(I)I

    move-result v6

    invoke-virtual {v5, v6}, Lr/n;->c(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lu/L0;

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Lu/L0;->a()I

    move-result v5

    goto :goto_3

    :cond_2
    iget v5, p0, Lu/M0;->f:I

    :goto_3
    sget-object v6, Lu/u;->a:Lu/u$a;

    invoke-virtual {v6}, Lu/u$a;->a()I

    move-result v6

    invoke-static {v5, v6}, Lu/u;->c(II)Z

    move-result v6

    if-nez v6, :cond_3

    move v0, v2

    :cond_3
    aput v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_4
    iput-object v3, p0, Lu/M0;->g:[I

    :cond_5
    if-nez v0, :cond_6

    return-void

    :cond_6
    iget-object p3, p0, Lu/M0;->o:Lu/v;

    const/4 v0, 0x0

    if-eqz p3, :cond_9

    iget-object p3, p0, Lu/M0;->k:Lu/r;

    if-nez p3, :cond_7

    const-string p3, "lastInitialValue"

    invoke-static {p3}, Ly7/t;->p(Ljava/lang/String;)V

    move-object p3, v0

    :cond_7
    invoke-static {p3, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_9

    iget-object p3, p0, Lu/M0;->l:Lu/r;

    if-nez p3, :cond_8

    const-string p3, "lastTargetValue"

    invoke-static {p3}, Ly7/t;->p(Ljava/lang/String;)V

    move-object p3, v0

    :cond_8
    invoke-static {p3, p2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_13

    :cond_9
    iput-object p1, p0, Lu/M0;->k:Lu/r;

    iput-object p2, p0, Lu/M0;->l:Lu/r;

    invoke-virtual {p1}, Lu/r;->b()I

    move-result p3

    rem-int/lit8 p3, p3, 0x2

    invoke-virtual {p1}, Lu/r;->b()I

    move-result v2

    add-int/2addr p3, v2

    new-array v2, p3, [F

    iput-object v2, p0, Lu/M0;->m:[F

    new-array v2, p3, [F

    iput-object v2, p0, Lu/M0;->n:[F

    iget-object v2, p0, Lu/M0;->a:Lr/l;

    invoke-virtual {v2}, Lr/l;->b()I

    move-result v2

    new-array v3, v2, [[F

    move v4, v1

    :goto_4
    if-ge v4, v2, :cond_10

    iget-object v5, p0, Lu/M0;->a:Lr/l;

    invoke-virtual {v5, v4}, Lr/l;->a(I)I

    move-result v5

    if-nez v5, :cond_c

    iget-object v6, p0, Lu/M0;->b:Lr/n;

    invoke-virtual {v6, v5}, Lr/n;->a(I)Z

    move-result v6

    if-nez v6, :cond_a

    new-array v5, p3, [F

    move v6, v1

    :goto_5
    if-ge v6, p3, :cond_f

    invoke-virtual {p1, v6}, Lu/r;->a(I)F

    move-result v7

    aput v7, v5, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    :cond_a
    new-array v6, p3, [F

    iget-object v7, p0, Lu/M0;->b:Lr/n;

    invoke-virtual {v7, v5}, Lr/n;->c(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast v5, Lu/L0;

    invoke-virtual {v5}, Lu/L0;->c()Lu/r;

    move-result-object v5

    move v7, v1

    :goto_6
    if-ge v7, p3, :cond_b

    invoke-virtual {v5, v7}, Lu/r;->a(I)F

    move-result v8

    aput v8, v6, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_6

    :cond_b
    move-object v5, v6

    goto :goto_a

    :cond_c
    invoke-virtual {p0}, Lu/M0;->f()I

    move-result v6

    if-ne v5, v6, :cond_e

    iget-object v6, p0, Lu/M0;->b:Lr/n;

    invoke-virtual {v6, v5}, Lr/n;->a(I)Z

    move-result v6

    if-nez v6, :cond_d

    new-array v5, p3, [F

    move v6, v1

    :goto_7
    if-ge v6, p3, :cond_f

    invoke-virtual {p2, v6}, Lu/r;->a(I)F

    move-result v7

    aput v7, v5, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_7

    :cond_d
    new-array v6, p3, [F

    iget-object v7, p0, Lu/M0;->b:Lr/n;

    invoke-virtual {v7, v5}, Lr/n;->c(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast v5, Lu/L0;

    invoke-virtual {v5}, Lu/L0;->c()Lu/r;

    move-result-object v5

    move v7, v1

    :goto_8
    if-ge v7, p3, :cond_b

    invoke-virtual {v5, v7}, Lu/r;->a(I)F

    move-result v8

    aput v8, v6, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_8

    :cond_e
    new-array v6, p3, [F

    iget-object v7, p0, Lu/M0;->b:Lr/n;

    invoke-virtual {v7, v5}, Lr/n;->c(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast v5, Lu/L0;

    invoke-virtual {v5}, Lu/L0;->c()Lu/r;

    move-result-object v5

    move v7, v1

    :goto_9
    if-ge v7, p3, :cond_b

    invoke-virtual {v5, v7}, Lu/r;->a(I)F

    move-result v8

    aput v8, v6, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_9

    :cond_f
    :goto_a
    aput-object v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_4

    :cond_10
    new-instance p1, Lu/v;

    iget-object p2, p0, Lu/M0;->g:[I

    if-nez p2, :cond_11

    const-string p2, "modes"

    invoke-static {p2}, Ly7/t;->p(Ljava/lang/String;)V

    move-object p2, v0

    :cond_11
    iget-object p3, p0, Lu/M0;->h:[F

    if-nez p3, :cond_12

    const-string p3, "times"

    invoke-static {p3}, Ly7/t;->p(Ljava/lang/String;)V

    goto :goto_b

    :cond_12
    move-object v0, p3

    :goto_b
    invoke-direct {p1, p2, v0, v3}, Lu/v;-><init>([I[F[[F)V

    iput-object p1, p0, Lu/M0;->o:Lu/v;

    :cond_13
    return-void
.end method


# virtual methods
.method public synthetic a()Z
    .locals 1

    invoke-static {p0}, Lu/G0;->a(Lu/H0;)Z

    move-result v0

    return v0
.end method

.method public b(JLu/r;Lu/r;Lu/r;)Lu/r;
    .locals 16

    .prologue
    move-object/from16 v6, p0

    move-object/from16 v7, p5

    const-wide/32 v0, 0xf4240

    div-long v0, p1, v0

    invoke-static {v6, v0, v1}, Lu/C0;->b(Lu/F0;J)J

    move-result-wide v8

    const-wide/16 v0, 0x0

    cmp-long v0, v8, v0

    if-gez v0, :cond_0

    return-object v7

    :cond_0
    move-object/from16 v10, p3

    move-object/from16 v11, p4

    invoke-direct {v6, v10, v11, v7}, Lu/M0;->k(Lu/r;Lu/r;Lu/r;)V

    iget-object v0, v6, Lu/M0;->o:Lu/v;

    const/4 v12, 0x0

    const-string v13, "velocityVector"

    const/4 v14, 0x0

    if-eqz v0, :cond_8

    long-to-int v0, v8

    invoke-direct {v6, v0}, Lu/M0;->i(I)F

    move-result v0

    iget-object v1, v6, Lu/M0;->o:Lu/v;

    if-nez v1, :cond_1

    const-string v1, "arcSpline"

    invoke-static {v1}, Ly7/t;->p(Ljava/lang/String;)V

    move-object v1, v14

    :cond_1
    iget-object v2, v6, Lu/M0;->n:[F

    const-string v3, "slopeArray"

    if-nez v2, :cond_2

    invoke-static {v3}, Ly7/t;->p(Ljava/lang/String;)V

    move-object v2, v14

    :cond_2
    invoke-virtual {v1, v0, v2}, Lu/v;->b(F[F)V

    iget-object v0, v6, Lu/M0;->n:[F

    if-nez v0, :cond_3

    invoke-static {v3}, Ly7/t;->p(Ljava/lang/String;)V

    move-object v0, v14

    :cond_3
    array-length v0, v0

    :goto_0
    if-ge v12, v0, :cond_6

    iget-object v1, v6, Lu/M0;->j:Lu/r;

    if-nez v1, :cond_4

    invoke-static {v13}, Ly7/t;->p(Ljava/lang/String;)V

    move-object v1, v14

    :cond_4
    iget-object v2, v6, Lu/M0;->n:[F

    if-nez v2, :cond_5

    invoke-static {v3}, Ly7/t;->p(Ljava/lang/String;)V

    move-object v2, v14

    :cond_5
    aget v2, v2, v12

    invoke-virtual {v1, v12, v2}, Lu/r;->e(IF)V

    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    :cond_6
    iget-object v0, v6, Lu/M0;->j:Lu/r;

    if-nez v0, :cond_7

    invoke-static {v13}, Ly7/t;->p(Ljava/lang/String;)V

    goto :goto_1

    :cond_7
    move-object v14, v0

    :goto_1
    return-object v14

    :cond_8
    const-wide/16 v0, 0x1

    sub-long v1, v8, v0

    move-object/from16 v0, p0

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    invoke-static/range {v0 .. v5}, Lu/C0;->d(Lu/B0;JLu/r;Lu/r;Lu/r;)Lu/r;

    move-result-object v15

    move-wide v1, v8

    invoke-static/range {v0 .. v5}, Lu/C0;->d(Lu/B0;JLu/r;Lu/r;Lu/r;)Lu/r;

    move-result-object v0

    invoke-virtual {v15}, Lu/r;->b()I

    move-result v1

    :goto_2
    if-ge v12, v1, :cond_a

    iget-object v2, v6, Lu/M0;->j:Lu/r;

    if-nez v2, :cond_9

    invoke-static {v13}, Ly7/t;->p(Ljava/lang/String;)V

    move-object v2, v14

    :cond_9
    invoke-virtual {v15, v12}, Lu/r;->a(I)F

    move-result v3

    invoke-virtual {v0, v12}, Lu/r;->a(I)F

    move-result v4

    sub-float/2addr v3, v4

    const/high16 v4, 0x447a0000    # 1000.0f

    mul-float/2addr v3, v4

    invoke-virtual {v2, v12, v3}, Lu/r;->e(IF)V

    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    :cond_a
    iget-object v0, v6, Lu/M0;->j:Lu/r;

    if-nez v0, :cond_b

    invoke-static {v13}, Ly7/t;->p(Ljava/lang/String;)V

    goto :goto_3

    :cond_b
    move-object v14, v0

    :goto_3
    return-object v14
.end method

.method public c(JLu/r;Lu/r;Lu/r;)Lu/r;
    .locals 5

    .prologue
    const-wide/32 v0, 0xf4240

    div-long/2addr p1, v0

    invoke-static {p0, p1, p2}, Lu/C0;->b(Lu/F0;J)J

    move-result-wide p1

    long-to-int p1, p1

    iget-object p2, p0, Lu/M0;->b:Lr/n;

    invoke-virtual {p2, p1}, Lr/n;->a(I)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lu/M0;->b:Lr/n;

    invoke-virtual {p2, p1}, Lr/n;->c(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast p1, Lu/L0;

    invoke-virtual {p1}, Lu/L0;->c()Lu/r;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lu/M0;->f()I

    move-result p2

    if-lt p1, p2, :cond_1

    return-object p4

    :cond_1
    if-gtz p1, :cond_2

    return-object p3

    :cond_2
    invoke-direct {p0, p3, p4, p5}, Lu/M0;->k(Lu/r;Lu/r;Lu/r;)V

    iget-object p2, p0, Lu/M0;->o:Lu/v;

    const/4 p5, 0x0

    const-string v0, "valueVector"

    const/4 v1, 0x0

    if-eqz p2, :cond_a

    invoke-direct {p0, p1}, Lu/M0;->i(I)F

    move-result p1

    iget-object p2, p0, Lu/M0;->o:Lu/v;

    if-nez p2, :cond_3

    const-string p2, "arcSpline"

    invoke-static {p2}, Ly7/t;->p(Ljava/lang/String;)V

    move-object p2, v1

    :cond_3
    iget-object p3, p0, Lu/M0;->m:[F

    const-string p4, "posArray"

    if-nez p3, :cond_4

    invoke-static {p4}, Ly7/t;->p(Ljava/lang/String;)V

    move-object p3, v1

    :cond_4
    invoke-virtual {p2, p1, p3}, Lu/v;->a(F[F)V

    iget-object p1, p0, Lu/M0;->m:[F

    if-nez p1, :cond_5

    invoke-static {p4}, Ly7/t;->p(Ljava/lang/String;)V

    move-object p1, v1

    :cond_5
    array-length p1, p1

    :goto_0
    if-ge p5, p1, :cond_8

    iget-object p2, p0, Lu/M0;->i:Lu/r;

    if-nez p2, :cond_6

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    move-object p2, v1

    :cond_6
    iget-object p3, p0, Lu/M0;->m:[F

    if-nez p3, :cond_7

    invoke-static {p4}, Ly7/t;->p(Ljava/lang/String;)V

    move-object p3, v1

    :cond_7
    aget p3, p3, p5

    invoke-virtual {p2, p5, p3}, Lu/r;->e(IF)V

    add-int/lit8 p5, p5, 0x1

    goto :goto_0

    :cond_8
    iget-object p1, p0, Lu/M0;->i:Lu/r;

    if-nez p1, :cond_9

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    goto :goto_1

    :cond_9
    move-object v1, p1

    :goto_1
    return-object v1

    :cond_a
    invoke-direct {p0, p1}, Lu/M0;->h(I)I

    move-result p2

    const/4 v2, 0x1

    invoke-direct {p0, p2, p1, v2}, Lu/M0;->j(IIZ)F

    move-result p1

    iget-object v3, p0, Lu/M0;->a:Lr/l;

    invoke-virtual {v3, p2}, Lr/l;->a(I)I

    move-result v3

    iget-object v4, p0, Lu/M0;->b:Lr/n;

    invoke-virtual {v4, v3}, Lr/n;->a(I)Z

    move-result v4

    if-eqz v4, :cond_b

    iget-object p3, p0, Lu/M0;->b:Lr/n;

    invoke-virtual {p3, v3}, Lr/n;->c(I)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast p3, Lu/L0;

    invoke-virtual {p3}, Lu/L0;->c()Lu/r;

    move-result-object p3

    :cond_b
    iget-object v3, p0, Lu/M0;->a:Lr/l;

    add-int/2addr p2, v2

    invoke-virtual {v3, p2}, Lr/l;->a(I)I

    move-result p2

    iget-object v2, p0, Lu/M0;->b:Lr/n;

    invoke-virtual {v2, p2}, Lr/n;->a(I)Z

    move-result v2

    if-eqz v2, :cond_c

    iget-object p4, p0, Lu/M0;->b:Lr/n;

    invoke-virtual {p4, p2}, Lr/n;->c(I)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast p2, Lu/L0;

    invoke-virtual {p2}, Lu/L0;->c()Lu/r;

    move-result-object p4

    :cond_c
    iget-object p2, p0, Lu/M0;->i:Lu/r;

    if-nez p2, :cond_d

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    move-object p2, v1

    :cond_d
    invoke-virtual {p2}, Lu/r;->b()I

    move-result p2

    :goto_2
    if-ge p5, p2, :cond_f

    iget-object v2, p0, Lu/M0;->i:Lu/r;

    if-nez v2, :cond_e

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    move-object v2, v1

    :cond_e
    invoke-virtual {p3, p5}, Lu/r;->a(I)F

    move-result v3

    invoke-virtual {p4, p5}, Lu/r;->a(I)F

    move-result v4

    invoke-static {v3, v4, p1}, Lu/z0;->k(FFF)F

    move-result v3

    invoke-virtual {v2, p5, v3}, Lu/r;->e(IF)V

    add-int/lit8 p5, p5, 0x1

    goto :goto_2

    :cond_f
    iget-object p1, p0, Lu/M0;->i:Lu/r;

    if-nez p1, :cond_10

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    goto :goto_3

    :cond_10
    move-object v1, p1

    :goto_3
    return-object v1
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lu/M0;->d:I

    return v0
.end method

.method public synthetic e(Lu/r;Lu/r;Lu/r;)J
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lu/E0;->a(Lu/F0;Lu/r;Lu/r;Lu/r;)J

    move-result-wide p1

    return-wide p1
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lu/M0;->c:I

    return v0
.end method

.method public synthetic g(Lu/r;Lu/r;Lu/r;)Lu/r;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lu/A0;->a(Lu/B0;Lu/r;Lu/r;Lu/r;)Lu/r;

    move-result-object p1

    return-object p1
.end method
