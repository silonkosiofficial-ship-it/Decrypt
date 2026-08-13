.class final Lm1/g$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private a:I

.field private b:Lm1/e;

.field private c:I

.field private d:Lm1/d;

.field private e:Lm1/d;

.field private f:Lm1/d;

.field private g:Lm1/d;

.field private h:I

.field private i:I

.field private j:I

.field private k:I

.field private l:I

.field private m:I

.field private n:I

.field private o:I

.field private p:I

.field private q:I

.field final synthetic r:Lm1/g;


# direct methods
.method public constructor <init>(Lm1/g;ILm1/d;Lm1/d;Lm1/d;Lm1/d;I)V
    .locals 1

    const-string v0, "left"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "top"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "right"

    invoke-static {p5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bottom"

    invoke-static {p6, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lm1/g$b;->r:Lm1/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lm1/g$b;->a:I

    iput-object p3, p0, Lm1/g$b;->d:Lm1/d;

    iput-object p4, p0, Lm1/g$b;->e:Lm1/d;

    iput-object p5, p0, Lm1/g$b;->f:Lm1/d;

    iput-object p6, p0, Lm1/g$b;->g:Lm1/d;

    invoke-virtual {p1}, Lm1/l;->j2()I

    move-result p2

    iput p2, p0, Lm1/g$b;->h:I

    invoke-virtual {p1}, Lm1/l;->l2()I

    move-result p2

    iput p2, p0, Lm1/g$b;->i:I

    invoke-virtual {p1}, Lm1/l;->k2()I

    move-result p2

    iput p2, p0, Lm1/g$b;->j:I

    invoke-virtual {p1}, Lm1/l;->i2()I

    move-result p1

    iput p1, p0, Lm1/g$b;->k:I

    iput p7, p0, Lm1/g$b;->q:I

    return-void
.end method

.method private final h()V
    .locals 10

    .prologue
    const/4 v0, 0x0

    iput v0, p0, Lm1/g$b;->l:I

    iput v0, p0, Lm1/g$b;->m:I

    const/4 v1, 0x0

    iput-object v1, p0, Lm1/g$b;->b:Lm1/e;

    iput v0, p0, Lm1/g$b;->c:I

    iget v2, p0, Lm1/g$b;->o:I

    move v3, v0

    :goto_0
    if-ge v3, v2, :cond_8

    iget v4, p0, Lm1/g$b;->n:I

    add-int/2addr v4, v3

    iget-object v5, p0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v5}, Lm1/g;->x2(Lm1/g;)I

    move-result v5

    if-lt v4, v5, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object v4, p0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v4}, Lm1/g;->w2(Lm1/g;)[Lm1/e;

    move-result-object v4

    if-eqz v4, :cond_1

    iget v5, p0, Lm1/g$b;->n:I

    add-int/2addr v5, v3

    aget-object v4, v4, v5

    goto :goto_1

    :cond_1
    move-object v4, v1

    :goto_1
    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v5, p0, Lm1/g$b;->a:I

    const/16 v6, 0x8

    if-nez v5, :cond_4

    invoke-virtual {v4}, Lm1/e;->B0()I

    move-result v5

    iget-object v7, p0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v7}, Lm1/g;->E2(Lm1/g;)I

    move-result v7

    invoke-virtual {v4}, Lm1/e;->A0()I

    move-result v8

    if-ne v8, v6, :cond_2

    move v7, v0

    :cond_2
    iget v6, p0, Lm1/g$b;->l:I

    add-int/2addr v5, v7

    add-int/2addr v6, v5

    iput v6, p0, Lm1/g$b;->l:I

    iget-object v5, p0, Lm1/g$b;->r:Lm1/g;

    iget v6, p0, Lm1/g$b;->q:I

    invoke-static {v5, v4, v6}, Lm1/g;->O2(Lm1/g;Lm1/e;I)I

    move-result v5

    iget-object v6, p0, Lm1/g$b;->b:Lm1/e;

    if-eqz v6, :cond_3

    iget v6, p0, Lm1/g$b;->c:I

    if-ge v6, v5, :cond_7

    :cond_3
    iput-object v4, p0, Lm1/g$b;->b:Lm1/e;

    iput v5, p0, Lm1/g$b;->c:I

    iput v5, p0, Lm1/g$b;->m:I

    goto :goto_2

    :cond_4
    iget-object v5, p0, Lm1/g$b;->r:Lm1/g;

    iget v7, p0, Lm1/g$b;->q:I

    invoke-static {v5, v4, v7}, Lm1/g;->P2(Lm1/g;Lm1/e;I)I

    move-result v5

    iget-object v7, p0, Lm1/g$b;->r:Lm1/g;

    iget v8, p0, Lm1/g$b;->q:I

    invoke-static {v7, v4, v8}, Lm1/g;->O2(Lm1/g;Lm1/e;I)I

    move-result v7

    iget-object v8, p0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v8}, Lm1/g;->M2(Lm1/g;)I

    move-result v8

    invoke-virtual {v4}, Lm1/e;->A0()I

    move-result v9

    if-ne v9, v6, :cond_5

    move v8, v0

    :cond_5
    iget v6, p0, Lm1/g$b;->m:I

    add-int/2addr v7, v8

    add-int/2addr v6, v7

    iput v6, p0, Lm1/g$b;->m:I

    iget-object v6, p0, Lm1/g$b;->b:Lm1/e;

    if-eqz v6, :cond_6

    iget v6, p0, Lm1/g$b;->c:I

    if-ge v6, v5, :cond_7

    :cond_6
    iput-object v4, p0, Lm1/g$b;->b:Lm1/e;

    iput v5, p0, Lm1/g$b;->c:I

    iput v5, p0, Lm1/g$b;->l:I

    :cond_7
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_8
    :goto_3
    return-void
.end method


# virtual methods
.method public final a(Lm1/e;)V
    .locals 6

    .prologue
    const-string v0, "widget"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lm1/g$b;->a:I

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-nez v0, :cond_3

    iget-object v0, p0, Lm1/g$b;->r:Lm1/g;

    iget v3, p0, Lm1/g$b;->q:I

    invoke-static {v0, p1, v3}, Lm1/g;->P2(Lm1/g;Lm1/e;I)I

    move-result v0

    invoke-virtual {p1}, Lm1/e;->A()Lm1/e$b;

    move-result-object v3

    sget-object v4, Lm1/e$b;->E:Lm1/e$b;

    if-ne v3, v4, :cond_0

    iget v0, p0, Lm1/g$b;->p:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lm1/g$b;->p:I

    move v0, v2

    :cond_0
    iget-object v3, p0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v3}, Lm1/g;->E2(Lm1/g;)I

    move-result v3

    invoke-virtual {p1}, Lm1/e;->A0()I

    move-result v4

    if-ne v4, v1, :cond_1

    goto :goto_0

    :cond_1
    move v2, v3

    :goto_0
    iget v1, p0, Lm1/g$b;->l:I

    add-int/2addr v0, v2

    add-int/2addr v1, v0

    iput v1, p0, Lm1/g$b;->l:I

    iget-object v0, p0, Lm1/g$b;->r:Lm1/g;

    iget v1, p0, Lm1/g$b;->q:I

    invoke-static {v0, p1, v1}, Lm1/g;->O2(Lm1/g;Lm1/e;I)I

    move-result v0

    iget-object v1, p0, Lm1/g$b;->b:Lm1/e;

    if-eqz v1, :cond_2

    iget v1, p0, Lm1/g$b;->c:I

    if-ge v1, v0, :cond_7

    :cond_2
    iput-object p1, p0, Lm1/g$b;->b:Lm1/e;

    iput v0, p0, Lm1/g$b;->c:I

    iput v0, p0, Lm1/g$b;->m:I

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lm1/g$b;->r:Lm1/g;

    iget v3, p0, Lm1/g$b;->q:I

    invoke-static {v0, p1, v3}, Lm1/g;->P2(Lm1/g;Lm1/e;I)I

    move-result v0

    iget-object v3, p0, Lm1/g$b;->r:Lm1/g;

    iget v4, p0, Lm1/g$b;->q:I

    invoke-static {v3, p1, v4}, Lm1/g;->O2(Lm1/g;Lm1/e;I)I

    move-result v3

    invoke-virtual {p1}, Lm1/e;->y0()Lm1/e$b;

    move-result-object v4

    sget-object v5, Lm1/e$b;->E:Lm1/e$b;

    if-ne v4, v5, :cond_4

    iget v3, p0, Lm1/g$b;->p:I

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Lm1/g$b;->p:I

    move v3, v2

    :cond_4
    iget-object v4, p0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v4}, Lm1/g;->M2(Lm1/g;)I

    move-result v4

    invoke-virtual {p1}, Lm1/e;->A0()I

    move-result v5

    if-ne v5, v1, :cond_5

    goto :goto_1

    :cond_5
    move v2, v4

    :goto_1
    iget v1, p0, Lm1/g$b;->m:I

    add-int/2addr v3, v2

    add-int/2addr v1, v3

    iput v1, p0, Lm1/g$b;->m:I

    iget-object v1, p0, Lm1/g$b;->b:Lm1/e;

    if-eqz v1, :cond_6

    iget v1, p0, Lm1/g$b;->c:I

    if-ge v1, v0, :cond_7

    :cond_6
    iput-object p1, p0, Lm1/g$b;->b:Lm1/e;

    iput v0, p0, Lm1/g$b;->c:I

    iput v0, p0, Lm1/g$b;->l:I

    :cond_7
    :goto_2
    iget p1, p0, Lm1/g$b;->o:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lm1/g$b;->o:I

    return-void
.end method

.method public final b()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lm1/g$b;->c:I

    const/4 v1, 0x0

    iput-object v1, p0, Lm1/g$b;->b:Lm1/e;

    iput v0, p0, Lm1/g$b;->l:I

    iput v0, p0, Lm1/g$b;->m:I

    iput v0, p0, Lm1/g$b;->n:I

    iput v0, p0, Lm1/g$b;->o:I

    iput v0, p0, Lm1/g$b;->p:I

    return-void
.end method

.method public final c(ZIZ)V
    .locals 16

    .prologue
    move-object/from16 v0, p0

    iget v1, v0, Lm1/g$b;->o:I

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const/4 v4, 0x0

    if-ge v3, v1, :cond_3

    iget v5, v0, Lm1/g$b;->n:I

    add-int/2addr v5, v3

    iget-object v6, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v6}, Lm1/g;->x2(Lm1/g;)I

    move-result v6

    if-lt v5, v6, :cond_0

    goto :goto_1

    :cond_0
    iget-object v5, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v5}, Lm1/g;->w2(Lm1/g;)[Lm1/e;

    move-result-object v5

    if-eqz v5, :cond_1

    iget v4, v0, Lm1/g$b;->n:I

    add-int/2addr v4, v3

    aget-object v4, v5, v4

    :cond_1
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lm1/e;->X0()V

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    if-eqz v1, :cond_3f

    iget-object v3, v0, Lm1/g$b;->b:Lm1/e;

    if-nez v3, :cond_4

    goto/16 :goto_21

    :cond_4
    const/4 v3, 0x1

    if-eqz p3, :cond_5

    if-nez p2, :cond_5

    move v5, v3

    goto :goto_2

    :cond_5
    move v5, v2

    :goto_2
    const/4 v6, -0x1

    move v7, v2

    move v8, v6

    move v9, v8

    :goto_3
    if-ge v7, v1, :cond_b

    if-eqz p1, :cond_6

    add-int/lit8 v10, v1, -0x1

    sub-int/2addr v10, v7

    goto :goto_4

    :cond_6
    move v10, v7

    :goto_4
    iget v11, v0, Lm1/g$b;->n:I

    add-int/2addr v11, v10

    iget-object v12, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v12}, Lm1/g;->x2(Lm1/g;)I

    move-result v12

    if-lt v11, v12, :cond_7

    goto :goto_6

    :cond_7
    iget-object v11, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v11}, Lm1/g;->w2(Lm1/g;)[Lm1/e;

    move-result-object v11

    if-eqz v11, :cond_8

    iget v12, v0, Lm1/g$b;->n:I

    add-int/2addr v12, v10

    aget-object v10, v11, v12

    goto :goto_5

    :cond_8
    move-object v10, v4

    :goto_5
    if-eqz v10, :cond_a

    invoke-virtual {v10}, Lm1/e;->A0()I

    move-result v10

    if-nez v10, :cond_a

    if-ne v8, v6, :cond_9

    move v8, v7

    :cond_9
    move v9, v7

    :cond_a
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_b
    :goto_6
    iget v7, v0, Lm1/g$b;->a:I

    if-nez v7, :cond_27

    iget-object v7, v0, Lm1/g$b;->b:Lm1/e;

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v11, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v11}, Lm1/g;->N2(Lm1/g;)I

    move-result v11

    invoke-virtual {v7, v11}, Lm1/e;->N1(I)V

    iget v11, v0, Lm1/g$b;->i:I

    if-lez p2, :cond_c

    iget-object v12, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v12}, Lm1/g;->M2(Lm1/g;)I

    move-result v12

    add-int/2addr v11, v12

    :cond_c
    invoke-virtual {v7}, Lm1/e;->c0()Lm1/d;

    move-result-object v12

    iget-object v13, v0, Lm1/g$b;->e:Lm1/d;

    invoke-virtual {v12, v13, v11}, Lm1/d;->a(Lm1/d;I)Z

    if-eqz p3, :cond_d

    invoke-virtual {v7}, Lm1/e;->G()Lm1/d;

    move-result-object v11

    iget-object v12, v0, Lm1/g$b;->g:Lm1/d;

    iget v13, v0, Lm1/g$b;->k:I

    invoke-virtual {v11, v12, v13}, Lm1/d;->a(Lm1/d;I)Z

    :cond_d
    if-lez p2, :cond_e

    iget-object v11, v0, Lm1/g$b;->e:Lm1/d;

    invoke-static {v11}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v11}, Lm1/d;->g()Lm1/e;

    move-result-object v11

    invoke-virtual {v11}, Lm1/e;->G()Lm1/d;

    move-result-object v11

    invoke-virtual {v7}, Lm1/e;->c0()Lm1/d;

    move-result-object v12

    invoke-virtual {v11, v12, v2}, Lm1/d;->a(Lm1/d;I)Z

    :cond_e
    iget-object v11, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v11}, Lm1/g;->K2(Lm1/g;)I

    move-result v11

    const/4 v12, 0x3

    if-ne v11, v12, :cond_12

    invoke-virtual {v7}, Lm1/e;->v()Z

    move-result v11

    if-nez v11, :cond_12

    move v11, v2

    :goto_7
    if-ge v11, v1, :cond_12

    if-eqz p1, :cond_f

    add-int/lit8 v13, v1, -0x1

    sub-int/2addr v13, v11

    goto :goto_8

    :cond_f
    move v13, v11

    :goto_8
    iget v14, v0, Lm1/g$b;->n:I

    add-int/2addr v14, v13

    iget-object v15, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v15}, Lm1/g;->x2(Lm1/g;)I

    move-result v15

    if-lt v14, v15, :cond_10

    goto :goto_9

    :cond_10
    iget-object v14, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v14}, Lm1/g;->w2(Lm1/g;)[Lm1/e;

    move-result-object v14

    invoke-static {v14}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v15, v0, Lm1/g$b;->n:I

    add-int/2addr v15, v13

    aget-object v13, v14, v15

    invoke-static {v13}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v13}, Lm1/e;->v()Z

    move-result v14

    if-eqz v14, :cond_11

    goto :goto_a

    :cond_11
    add-int/lit8 v11, v11, 0x1

    goto :goto_7

    :cond_12
    :goto_9
    move-object v13, v7

    :goto_a
    move v11, v2

    :goto_b
    if-ge v11, v1, :cond_3f

    if-eqz p1, :cond_13

    add-int/lit8 v14, v1, -0x1

    sub-int/2addr v14, v11

    goto :goto_c

    :cond_13
    move v14, v11

    :goto_c
    iget v15, v0, Lm1/g$b;->n:I

    add-int/2addr v15, v14

    iget-object v10, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v10}, Lm1/g;->x2(Lm1/g;)I

    move-result v10

    if-lt v15, v10, :cond_14

    goto/16 :goto_21

    :cond_14
    iget-object v10, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v10}, Lm1/g;->w2(Lm1/g;)[Lm1/e;

    move-result-object v10

    if-eqz v10, :cond_26

    iget v15, v0, Lm1/g$b;->n:I

    add-int/2addr v15, v14

    aget-object v10, v10, v15

    if-nez v10, :cond_15

    goto/16 :goto_14

    :cond_15
    if-nez v11, :cond_16

    invoke-virtual {v10}, Lm1/e;->L()Lm1/d;

    move-result-object v15

    iget-object v12, v0, Lm1/g$b;->d:Lm1/d;

    invoke-static {v12}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v2, v0, Lm1/g$b;->h:I

    invoke-virtual {v10, v15, v12, v2}, Lm1/e;->h(Lm1/d;Lm1/d;I)V

    :cond_16
    if-nez v14, :cond_1c

    iget-object v2, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v2}, Lm1/g;->F2(Lm1/g;)I

    move-result v2

    if-eqz p1, :cond_17

    int-to-float v12, v3

    iget-object v14, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v14}, Lm1/g;->D2(Lm1/g;)F

    move-result v14

    sub-float/2addr v12, v14

    goto :goto_d

    :cond_17
    iget-object v12, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v12}, Lm1/g;->D2(Lm1/g;)F

    move-result v12

    :goto_d
    iget v14, v0, Lm1/g$b;->n:I

    if-nez v14, :cond_19

    iget-object v14, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v14}, Lm1/g;->z2(Lm1/g;)I

    move-result v14

    if-eq v14, v6, :cond_19

    iget-object v2, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v2}, Lm1/g;->z2(Lm1/g;)I

    move-result v2

    if-eqz p1, :cond_18

    int-to-float v12, v3

    iget-object v14, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v14}, Lm1/g;->y2(Lm1/g;)F

    move-result v14

    :goto_e
    sub-float/2addr v12, v14

    goto :goto_f

    :cond_18
    iget-object v12, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v12}, Lm1/g;->y2(Lm1/g;)F

    move-result v12

    goto :goto_f

    :cond_19
    if-eqz p3, :cond_1b

    iget-object v14, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v14}, Lm1/g;->H2(Lm1/g;)I

    move-result v14

    if-eq v14, v6, :cond_1b

    iget-object v2, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v2}, Lm1/g;->H2(Lm1/g;)I

    move-result v2

    if-eqz p1, :cond_1a

    int-to-float v12, v3

    iget-object v14, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v14}, Lm1/g;->G2(Lm1/g;)F

    move-result v14

    goto :goto_e

    :cond_1a
    iget-object v12, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v12}, Lm1/g;->G2(Lm1/g;)F

    move-result v12

    :cond_1b
    :goto_f
    invoke-virtual {v10, v2}, Lm1/e;->p1(I)V

    invoke-virtual {v10, v12}, Lm1/e;->n1(F)V

    :cond_1c
    add-int/lit8 v2, v1, -0x1

    if-ne v11, v2, :cond_1d

    invoke-virtual {v10}, Lm1/e;->b0()Lm1/d;

    move-result-object v2

    iget-object v12, v0, Lm1/g$b;->f:Lm1/d;

    invoke-static {v12}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v14, v0, Lm1/g$b;->j:I

    invoke-virtual {v10, v2, v12, v14}, Lm1/e;->h(Lm1/d;Lm1/d;I)V

    :cond_1d
    if-eqz v4, :cond_1f

    invoke-virtual {v10}, Lm1/e;->L()Lm1/d;

    move-result-object v2

    invoke-virtual {v4}, Lm1/e;->b0()Lm1/d;

    move-result-object v12

    iget-object v14, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v14}, Lm1/g;->E2(Lm1/g;)I

    move-result v14

    invoke-virtual {v2, v12, v14}, Lm1/d;->a(Lm1/d;I)Z

    if-ne v11, v8, :cond_1e

    invoke-virtual {v10}, Lm1/e;->L()Lm1/d;

    move-result-object v2

    iget v12, v0, Lm1/g$b;->h:I

    invoke-virtual {v2, v12}, Lm1/d;->z(I)V

    :cond_1e
    invoke-virtual {v4}, Lm1/e;->b0()Lm1/d;

    move-result-object v2

    invoke-virtual {v10}, Lm1/e;->L()Lm1/d;

    move-result-object v12

    const/4 v14, 0x0

    invoke-virtual {v2, v12, v14}, Lm1/d;->a(Lm1/d;I)Z

    add-int/lit8 v2, v9, 0x1

    if-ne v11, v2, :cond_1f

    invoke-virtual {v4}, Lm1/e;->b0()Lm1/d;

    move-result-object v2

    iget v4, v0, Lm1/g$b;->j:I

    invoke-virtual {v2, v4}, Lm1/d;->z(I)V

    :cond_1f
    invoke-static {v10, v7}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_25

    iget-object v2, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v2}, Lm1/g;->K2(Lm1/g;)I

    move-result v2

    const/4 v12, 0x3

    if-ne v2, v12, :cond_20

    invoke-virtual {v13}, Lm1/e;->v()Z

    move-result v2

    if-eqz v2, :cond_20

    invoke-static {v10, v13}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_20

    invoke-virtual {v10}, Lm1/e;->v()Z

    move-result v2

    if-eqz v2, :cond_20

    invoke-virtual {v10}, Lm1/e;->F()Lm1/d;

    move-result-object v2

    invoke-virtual {v13}, Lm1/e;->F()Lm1/d;

    move-result-object v4

    const/4 v14, 0x0

    :goto_10
    invoke-virtual {v2, v4, v14}, Lm1/d;->a(Lm1/d;I)Z

    goto :goto_13

    :cond_20
    iget-object v2, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v2}, Lm1/g;->K2(Lm1/g;)I

    move-result v2

    if-eqz v2, :cond_24

    if-eq v2, v3, :cond_23

    const/4 v4, 0x2

    if-eq v2, v4, :cond_22

    if-eqz v5, :cond_21

    :goto_11
    invoke-virtual {v10}, Lm1/e;->c0()Lm1/d;

    move-result-object v2

    iget-object v4, v0, Lm1/g$b;->e:Lm1/d;

    iget v14, v0, Lm1/g$b;->i:I

    invoke-virtual {v2, v4, v14}, Lm1/d;->a(Lm1/d;I)Z

    invoke-virtual {v10}, Lm1/e;->G()Lm1/d;

    move-result-object v2

    iget-object v4, v0, Lm1/g$b;->g:Lm1/d;

    iget v14, v0, Lm1/g$b;->k:I

    goto :goto_10

    :cond_21
    invoke-virtual {v10}, Lm1/e;->c0()Lm1/d;

    move-result-object v2

    invoke-virtual {v7}, Lm1/e;->c0()Lm1/d;

    move-result-object v4

    const/4 v14, 0x0

    invoke-virtual {v2, v4, v14}, Lm1/d;->a(Lm1/d;I)Z

    :goto_12
    invoke-virtual {v10}, Lm1/e;->G()Lm1/d;

    move-result-object v2

    invoke-virtual {v7}, Lm1/e;->G()Lm1/d;

    move-result-object v4

    goto :goto_10

    :cond_22
    if-eqz v5, :cond_21

    goto :goto_11

    :cond_23
    const/4 v14, 0x0

    goto :goto_12

    :cond_24
    const/4 v14, 0x0

    invoke-virtual {v10}, Lm1/e;->c0()Lm1/d;

    move-result-object v2

    invoke-virtual {v7}, Lm1/e;->c0()Lm1/d;

    move-result-object v4

    goto :goto_10

    :cond_25
    const/4 v12, 0x3

    :goto_13
    move-object v4, v10

    :cond_26
    :goto_14
    add-int/lit8 v11, v11, 0x1

    const/4 v2, 0x0

    goto/16 :goto_b

    :cond_27
    iget-object v2, v0, Lm1/g$b;->b:Lm1/e;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v7, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v7}, Lm1/g;->F2(Lm1/g;)I

    move-result v7

    invoke-virtual {v2, v7}, Lm1/e;->p1(I)V

    iget v7, v0, Lm1/g$b;->h:I

    if-lez p2, :cond_28

    iget-object v10, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v10}, Lm1/g;->E2(Lm1/g;)I

    move-result v10

    add-int/2addr v7, v10

    :cond_28
    if-eqz p1, :cond_2a

    invoke-virtual {v2}, Lm1/e;->b0()Lm1/d;

    move-result-object v10

    iget-object v11, v0, Lm1/g$b;->f:Lm1/d;

    invoke-virtual {v10, v11, v7}, Lm1/d;->a(Lm1/d;I)Z

    if-eqz p3, :cond_29

    invoke-virtual {v2}, Lm1/e;->L()Lm1/d;

    move-result-object v7

    iget-object v10, v0, Lm1/g$b;->d:Lm1/d;

    iget v11, v0, Lm1/g$b;->j:I

    invoke-virtual {v7, v10, v11}, Lm1/d;->a(Lm1/d;I)Z

    :cond_29
    if-lez p2, :cond_2c

    iget-object v7, v0, Lm1/g$b;->f:Lm1/d;

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v7}, Lm1/d;->g()Lm1/e;

    move-result-object v7

    invoke-virtual {v7}, Lm1/e;->L()Lm1/d;

    move-result-object v7

    invoke-virtual {v2}, Lm1/e;->b0()Lm1/d;

    move-result-object v10

    :goto_15
    const/4 v11, 0x0

    invoke-virtual {v7, v10, v11}, Lm1/d;->a(Lm1/d;I)Z

    goto :goto_16

    :cond_2a
    invoke-virtual {v2}, Lm1/e;->L()Lm1/d;

    move-result-object v10

    iget-object v11, v0, Lm1/g$b;->d:Lm1/d;

    invoke-virtual {v10, v11, v7}, Lm1/d;->a(Lm1/d;I)Z

    if-eqz p3, :cond_2b

    invoke-virtual {v2}, Lm1/e;->b0()Lm1/d;

    move-result-object v7

    iget-object v10, v0, Lm1/g$b;->f:Lm1/d;

    iget v11, v0, Lm1/g$b;->j:I

    invoke-virtual {v7, v10, v11}, Lm1/d;->a(Lm1/d;I)Z

    :cond_2b
    if-lez p2, :cond_2c

    iget-object v7, v0, Lm1/g$b;->d:Lm1/d;

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v7}, Lm1/d;->g()Lm1/e;

    move-result-object v7

    invoke-virtual {v7}, Lm1/e;->b0()Lm1/d;

    move-result-object v7

    invoke-virtual {v2}, Lm1/e;->L()Lm1/d;

    move-result-object v10

    goto :goto_15

    :cond_2c
    :goto_16
    const/4 v14, 0x0

    :goto_17
    if-ge v14, v1, :cond_3f

    iget v7, v0, Lm1/g$b;->n:I

    add-int/2addr v7, v14

    iget-object v10, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v10}, Lm1/g;->x2(Lm1/g;)I

    move-result v10

    if-lt v7, v10, :cond_2d

    goto/16 :goto_21

    :cond_2d
    iget-object v7, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v7}, Lm1/g;->w2(Lm1/g;)[Lm1/e;

    move-result-object v7

    if-eqz v7, :cond_2e

    iget v10, v0, Lm1/g$b;->n:I

    add-int/2addr v10, v14

    aget-object v7, v7, v10

    if-nez v7, :cond_2f

    :cond_2e
    const/4 v10, 0x2

    const/4 v12, 0x0

    goto/16 :goto_20

    :cond_2f
    if-nez v14, :cond_32

    invoke-virtual {v7}, Lm1/e;->c0()Lm1/d;

    move-result-object v10

    iget-object v11, v0, Lm1/g$b;->e:Lm1/d;

    invoke-static {v11}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v12, v0, Lm1/g$b;->i:I

    invoke-virtual {v7, v10, v11, v12}, Lm1/e;->h(Lm1/d;Lm1/d;I)V

    iget-object v10, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v10}, Lm1/g;->N2(Lm1/g;)I

    move-result v10

    iget-object v11, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v11}, Lm1/g;->L2(Lm1/g;)F

    move-result v11

    iget v12, v0, Lm1/g$b;->n:I

    if-nez v12, :cond_30

    iget-object v12, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v12}, Lm1/g;->B2(Lm1/g;)I

    move-result v12

    if-eq v12, v6, :cond_30

    iget-object v10, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v10}, Lm1/g;->B2(Lm1/g;)I

    move-result v10

    iget-object v11, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v11}, Lm1/g;->A2(Lm1/g;)F

    move-result v11

    goto :goto_18

    :cond_30
    if-eqz p3, :cond_31

    iget-object v12, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v12}, Lm1/g;->J2(Lm1/g;)I

    move-result v12

    if-eq v12, v6, :cond_31

    iget-object v10, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v10}, Lm1/g;->J2(Lm1/g;)I

    move-result v10

    iget-object v11, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v11}, Lm1/g;->I2(Lm1/g;)F

    move-result v11

    :cond_31
    :goto_18
    invoke-virtual {v7, v10}, Lm1/e;->N1(I)V

    invoke-virtual {v7, v11}, Lm1/e;->L1(F)V

    :cond_32
    add-int/lit8 v10, v1, -0x1

    if-ne v14, v10, :cond_33

    invoke-virtual {v7}, Lm1/e;->G()Lm1/d;

    move-result-object v10

    iget-object v11, v0, Lm1/g$b;->g:Lm1/d;

    invoke-static {v11}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v12, v0, Lm1/g$b;->k:I

    invoke-virtual {v7, v10, v11, v12}, Lm1/e;->h(Lm1/d;Lm1/d;I)V

    :cond_33
    if-eqz v4, :cond_35

    invoke-virtual {v7}, Lm1/e;->c0()Lm1/d;

    move-result-object v10

    invoke-virtual {v4}, Lm1/e;->G()Lm1/d;

    move-result-object v11

    iget-object v12, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v12}, Lm1/g;->M2(Lm1/g;)I

    move-result v12

    invoke-virtual {v10, v11, v12}, Lm1/d;->a(Lm1/d;I)Z

    if-ne v14, v8, :cond_34

    invoke-virtual {v7}, Lm1/e;->c0()Lm1/d;

    move-result-object v10

    iget v11, v0, Lm1/g$b;->i:I

    invoke-virtual {v10, v11}, Lm1/d;->z(I)V

    :cond_34
    invoke-virtual {v4}, Lm1/e;->G()Lm1/d;

    move-result-object v10

    invoke-virtual {v7}, Lm1/e;->c0()Lm1/d;

    move-result-object v11

    const/4 v12, 0x0

    invoke-virtual {v10, v11, v12}, Lm1/d;->a(Lm1/d;I)Z

    add-int/lit8 v10, v9, 0x1

    if-ne v14, v10, :cond_35

    invoke-virtual {v4}, Lm1/e;->G()Lm1/d;

    move-result-object v4

    iget v10, v0, Lm1/g$b;->k:I

    invoke-virtual {v4, v10}, Lm1/d;->z(I)V

    :cond_35
    invoke-static {v7, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3e

    iget-object v4, v0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v4}, Lm1/g;->C2(Lm1/g;)I

    move-result v4

    if-eqz p1, :cond_39

    if-eqz v4, :cond_38

    if-eq v4, v3, :cond_37

    const/4 v10, 0x2

    if-eq v4, v10, :cond_36

    const/4 v11, 0x0

    goto :goto_1b

    :cond_36
    invoke-virtual {v7}, Lm1/e;->L()Lm1/d;

    move-result-object v4

    invoke-virtual {v2}, Lm1/e;->L()Lm1/d;

    move-result-object v10

    const/4 v11, 0x0

    invoke-virtual {v4, v10, v11}, Lm1/d;->a(Lm1/d;I)Z

    :goto_19
    invoke-virtual {v7}, Lm1/e;->b0()Lm1/d;

    move-result-object v4

    invoke-virtual {v2}, Lm1/e;->b0()Lm1/d;

    move-result-object v10

    :goto_1a
    invoke-virtual {v4, v10, v11}, Lm1/d;->a(Lm1/d;I)Z

    :goto_1b
    move v12, v11

    const/4 v10, 0x2

    goto :goto_1f

    :cond_37
    const/4 v11, 0x0

    invoke-virtual {v7}, Lm1/e;->L()Lm1/d;

    move-result-object v4

    invoke-virtual {v2}, Lm1/e;->L()Lm1/d;

    move-result-object v10

    goto :goto_1a

    :cond_38
    const/4 v11, 0x0

    goto :goto_19

    :cond_39
    const/4 v10, 0x2

    if-eqz v4, :cond_3d

    if-eq v4, v3, :cond_3c

    if-eq v4, v10, :cond_3a

    :goto_1c
    const/4 v12, 0x0

    goto :goto_1f

    :cond_3a
    invoke-virtual {v7}, Lm1/e;->L()Lm1/d;

    move-result-object v4

    if-eqz v5, :cond_3b

    iget-object v11, v0, Lm1/g$b;->d:Lm1/d;

    iget v12, v0, Lm1/g$b;->h:I

    invoke-virtual {v4, v11, v12}, Lm1/d;->a(Lm1/d;I)Z

    invoke-virtual {v7}, Lm1/e;->b0()Lm1/d;

    move-result-object v4

    iget-object v11, v0, Lm1/g$b;->f:Lm1/d;

    iget v12, v0, Lm1/g$b;->j:I

    invoke-virtual {v4, v11, v12}, Lm1/d;->a(Lm1/d;I)Z

    goto :goto_1c

    :cond_3b
    invoke-virtual {v2}, Lm1/e;->L()Lm1/d;

    move-result-object v11

    const/4 v12, 0x0

    invoke-virtual {v4, v11, v12}, Lm1/d;->a(Lm1/d;I)Z

    :goto_1d
    invoke-virtual {v7}, Lm1/e;->b0()Lm1/d;

    move-result-object v4

    invoke-virtual {v2}, Lm1/e;->b0()Lm1/d;

    move-result-object v11

    :goto_1e
    invoke-virtual {v4, v11, v12}, Lm1/d;->a(Lm1/d;I)Z

    goto :goto_1f

    :cond_3c
    const/4 v12, 0x0

    goto :goto_1d

    :cond_3d
    const/4 v12, 0x0

    invoke-virtual {v7}, Lm1/e;->L()Lm1/d;

    move-result-object v4

    invoke-virtual {v2}, Lm1/e;->L()Lm1/d;

    move-result-object v11

    goto :goto_1e

    :cond_3e
    const/4 v10, 0x2

    goto :goto_1c

    :goto_1f
    move-object v4, v7

    :goto_20
    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_17

    :cond_3f
    :goto_21
    return-void
.end method

.method public final d()I
    .locals 2

    .prologue
    iget v0, p0, Lm1/g$b;->a:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget v0, p0, Lm1/g$b;->m:I

    iget-object v1, p0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v1}, Lm1/g;->M2(Lm1/g;)I

    move-result v1

    sub-int/2addr v0, v1

    goto :goto_0

    :cond_0
    iget v0, p0, Lm1/g$b;->m:I

    :goto_0
    return v0
.end method

.method public final e()Lm1/e;
    .locals 1

    iget-object v0, p0, Lm1/g$b;->b:Lm1/e;

    return-object v0
.end method

.method public final f()I
    .locals 2

    .prologue
    iget v0, p0, Lm1/g$b;->a:I

    if-nez v0, :cond_0

    iget v0, p0, Lm1/g$b;->l:I

    iget-object v1, p0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v1}, Lm1/g;->E2(Lm1/g;)I

    move-result v1

    sub-int/2addr v0, v1

    goto :goto_0

    :cond_0
    iget v0, p0, Lm1/g$b;->l:I

    :goto_0
    return v0
.end method

.method public final g(I)V
    .locals 8

    .prologue
    iget v0, p0, Lm1/g$b;->p:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v1, p0, Lm1/g$b;->o:I

    div-int/2addr p1, v0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_5

    iget v2, p0, Lm1/g$b;->n:I

    add-int/2addr v2, v0

    iget-object v3, p0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v3}, Lm1/g;->x2(Lm1/g;)I

    move-result v3

    if-lt v2, v3, :cond_1

    goto :goto_5

    :cond_1
    iget-object v2, p0, Lm1/g$b;->r:Lm1/g;

    invoke-static {v2}, Lm1/g;->w2(Lm1/g;)[Lm1/e;

    move-result-object v2

    if-eqz v2, :cond_2

    iget v3, p0, Lm1/g$b;->n:I

    add-int/2addr v3, v0

    aget-object v2, v2, v3

    :goto_1
    move-object v3, v2

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    goto :goto_1

    :goto_2
    iget v2, p0, Lm1/g$b;->a:I

    if-nez v2, :cond_3

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lm1/e;->A()Lm1/e$b;

    move-result-object v2

    sget-object v4, Lm1/e$b;->E:Lm1/e$b;

    if-ne v2, v4, :cond_4

    invoke-virtual {v3}, Lm1/e;->Q()I

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, p0, Lm1/g$b;->r:Lm1/g;

    sget-object v4, Lm1/e$b;->C:Lm1/e$b;

    invoke-virtual {v3}, Lm1/e;->y0()Lm1/e$b;

    move-result-object v6

    invoke-virtual {v3}, Lm1/e;->w()I

    move-result v7

    move v5, p1

    :goto_3
    invoke-virtual/range {v2 .. v7}, Lm1/l;->n2(Lm1/e;Lm1/e$b;ILm1/e$b;I)V

    goto :goto_4

    :cond_3
    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lm1/e;->y0()Lm1/e$b;

    move-result-object v2

    sget-object v4, Lm1/e$b;->E:Lm1/e$b;

    if-ne v2, v4, :cond_4

    invoke-virtual {v3}, Lm1/e;->P()I

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, p0, Lm1/g$b;->r:Lm1/g;

    invoke-virtual {v3}, Lm1/e;->A()Lm1/e$b;

    move-result-object v4

    invoke-virtual {v3}, Lm1/e;->B0()I

    move-result v5

    sget-object v6, Lm1/e$b;->C:Lm1/e$b;

    move v7, p1

    goto :goto_3

    :cond_4
    :goto_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    :goto_5
    invoke-direct {p0}, Lm1/g$b;->h()V

    return-void
.end method

.method public final i(I)V
    .locals 0

    iput p1, p0, Lm1/g$b;->n:I

    return-void
.end method

.method public final j(ILm1/d;Lm1/d;Lm1/d;Lm1/d;IIIII)V
    .locals 1

    const-string v0, "left"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "top"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "right"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bottom"

    invoke-static {p5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput p1, p0, Lm1/g$b;->a:I

    iput-object p2, p0, Lm1/g$b;->d:Lm1/d;

    iput-object p3, p0, Lm1/g$b;->e:Lm1/d;

    iput-object p4, p0, Lm1/g$b;->f:Lm1/d;

    iput-object p5, p0, Lm1/g$b;->g:Lm1/d;

    iput p6, p0, Lm1/g$b;->h:I

    iput p7, p0, Lm1/g$b;->i:I

    iput p8, p0, Lm1/g$b;->j:I

    iput p9, p0, Lm1/g$b;->k:I

    iput p10, p0, Lm1/g$b;->q:I

    return-void
.end method
