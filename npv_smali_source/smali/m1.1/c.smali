.class public final Lm1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm1/c$a;
    }
.end annotation


# static fields
.field public static final w:Lm1/c$a;

.field public static final x:I


# instance fields
.field private a:Lm1/e;

.field private b:Lm1/e;

.field private c:Lm1/e;

.field private d:Lm1/e;

.field private e:Lm1/e;

.field private f:Lm1/e;

.field private g:Lm1/e;

.field private h:Ljava/util/ArrayList;

.field private i:I

.field private j:I

.field private k:F

.field private l:I

.field private m:I

.field private n:I

.field private o:Z

.field private p:I

.field private q:Z

.field private r:Z

.field private s:Z

.field private t:Z

.field private u:Z

.field private v:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm1/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm1/c$a;-><init>(Ly7/k;)V

    sput-object v0, Lm1/c;->w:Lm1/c$a;

    const/16 v0, 0x8

    sput v0, Lm1/c;->x:I

    return-void
.end method

.method public constructor <init>(Lm1/e;IZ)V
    .locals 1

    const-string v0, "first"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/c;->a:Lm1/e;

    iput p2, p0, Lm1/c;->p:I

    iput-boolean p3, p0, Lm1/c;->q:Z

    return-void
.end method

.method private final b()V
    .locals 14

    .prologue
    iget v0, p0, Lm1/c;->p:I

    const/4 v1, 0x2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lm1/c;->a:Lm1/e;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v3, 0x1

    iput-boolean v3, p0, Lm1/c;->o:Z

    iget-object v4, p0, Lm1/c;->a:Lm1/e;

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v5, 0x0

    move v6, v5

    move-object v13, v4

    move-object v4, v2

    move-object v2, v13

    :goto_0
    if-nez v6, :cond_15

    iget v7, p0, Lm1/c;->i:I

    add-int/2addr v7, v3

    iput v7, p0, Lm1/c;->i:I

    invoke-virtual {v2}, Lm1/e;->Z()[Lm1/e;

    move-result-object v7

    iget v8, p0, Lm1/c;->p:I

    const/4 v9, 0x0

    aput-object v9, v7, v8

    invoke-virtual {v2}, Lm1/e;->O()[Lm1/e;

    move-result-object v7

    iget v8, p0, Lm1/c;->p:I

    aput-object v9, v7, v8

    invoke-virtual {v2}, Lm1/e;->A0()I

    move-result v7

    const/16 v8, 0x8

    if-eq v7, v8, :cond_10

    iget v7, p0, Lm1/c;->l:I

    add-int/2addr v7, v3

    iput v7, p0, Lm1/c;->l:I

    iget v7, p0, Lm1/c;->p:I

    invoke-virtual {v2, v7}, Lm1/e;->r(I)Lm1/e$b;

    move-result-object v7

    sget-object v8, Lm1/e$b;->E:Lm1/e$b;

    if-eq v7, v8, :cond_0

    iget v7, p0, Lm1/c;->m:I

    iget v10, p0, Lm1/c;->p:I

    invoke-virtual {v2, v10}, Lm1/e;->D(I)I

    move-result v10

    add-int/2addr v7, v10

    iput v7, p0, Lm1/c;->m:I

    :cond_0
    iget v7, p0, Lm1/c;->m:I

    invoke-virtual {v2}, Lm1/e;->M()[Lm1/d;

    move-result-object v10

    aget-object v10, v10, v0

    invoke-virtual {v10}, Lm1/d;->k()I

    move-result v10

    add-int/2addr v7, v10

    iput v7, p0, Lm1/c;->m:I

    invoke-virtual {v2}, Lm1/e;->M()[Lm1/d;

    move-result-object v10

    add-int/lit8 v11, v0, 0x1

    aget-object v10, v10, v11

    invoke-virtual {v10}, Lm1/d;->k()I

    move-result v10

    add-int/2addr v7, v10

    iput v7, p0, Lm1/c;->m:I

    iget v7, p0, Lm1/c;->n:I

    invoke-virtual {v2}, Lm1/e;->M()[Lm1/d;

    move-result-object v10

    aget-object v10, v10, v0

    invoke-virtual {v10}, Lm1/d;->k()I

    move-result v10

    add-int/2addr v7, v10

    iput v7, p0, Lm1/c;->n:I

    invoke-virtual {v2}, Lm1/e;->M()[Lm1/d;

    move-result-object v10

    aget-object v10, v10, v11

    invoke-virtual {v10}, Lm1/d;->k()I

    move-result v10

    add-int/2addr v7, v10

    iput v7, p0, Lm1/c;->n:I

    iget-object v7, p0, Lm1/c;->b:Lm1/e;

    if-nez v7, :cond_1

    iput-object v2, p0, Lm1/c;->b:Lm1/e;

    :cond_1
    iput-object v2, p0, Lm1/c;->d:Lm1/e;

    invoke-virtual {v2}, Lm1/e;->N()[Lm1/e$b;

    move-result-object v7

    iget v10, p0, Lm1/c;->p:I

    aget-object v7, v7, v10

    if-ne v7, v8, :cond_10

    invoke-virtual {v2}, Lm1/e;->a0()[I

    move-result-object v7

    iget v8, p0, Lm1/c;->p:I

    aget v7, v7, v8

    const/4 v8, 0x0

    if-eqz v7, :cond_2

    invoke-virtual {v2}, Lm1/e;->a0()[I

    move-result-object v7

    iget v10, p0, Lm1/c;->p:I

    aget v7, v7, v10

    const/4 v10, 0x3

    if-eq v7, v10, :cond_2

    invoke-virtual {v2}, Lm1/e;->a0()[I

    move-result-object v7

    iget v10, p0, Lm1/c;->p:I

    aget v7, v7, v10

    if-ne v7, v1, :cond_9

    :cond_2
    iget v7, p0, Lm1/c;->j:I

    add-int/2addr v7, v3

    iput v7, p0, Lm1/c;->j:I

    invoke-virtual {v2}, Lm1/e;->f0()[F

    move-result-object v7

    iget v10, p0, Lm1/c;->p:I

    aget v7, v7, v10

    cmpl-float v10, v7, v8

    if-lez v10, :cond_3

    iget v10, p0, Lm1/c;->k:F

    invoke-virtual {v2}, Lm1/e;->f0()[F

    move-result-object v11

    iget v12, p0, Lm1/c;->p:I

    aget v11, v11, v12

    add-float/2addr v10, v11

    iput v10, p0, Lm1/c;->k:F

    :cond_3
    sget-object v10, Lm1/c;->w:Lm1/c$a;

    iget v11, p0, Lm1/c;->p:I

    invoke-static {v10, v2, v11}, Lm1/c$a;->a(Lm1/c$a;Lm1/e;I)Z

    move-result v10

    if-eqz v10, :cond_6

    cmpg-float v7, v7, v8

    if-gez v7, :cond_4

    iput-boolean v3, p0, Lm1/c;->r:Z

    goto :goto_1

    :cond_4
    iput-boolean v3, p0, Lm1/c;->s:Z

    :goto_1
    iget-object v7, p0, Lm1/c;->h:Ljava/util/ArrayList;

    if-nez v7, :cond_5

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p0, Lm1/c;->h:Ljava/util/ArrayList;

    :cond_5
    iget-object v7, p0, Lm1/c;->h:Ljava/util/ArrayList;

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    iget-object v7, p0, Lm1/c;->f:Lm1/e;

    if-nez v7, :cond_7

    iput-object v2, p0, Lm1/c;->f:Lm1/e;

    :cond_7
    iget-object v7, p0, Lm1/c;->g:Lm1/e;

    if-eqz v7, :cond_8

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v7}, Lm1/e;->O()[Lm1/e;

    move-result-object v7

    iget v10, p0, Lm1/c;->p:I

    aput-object v2, v7, v10

    :cond_8
    iput-object v2, p0, Lm1/c;->g:Lm1/e;

    :cond_9
    iget v7, p0, Lm1/c;->p:I

    if-nez v7, :cond_c

    invoke-virtual {v2}, Lm1/e;->Q()I

    move-result v7

    if-eqz v7, :cond_b

    :cond_a
    :goto_2
    iput-boolean v5, p0, Lm1/c;->o:Z

    goto :goto_3

    :cond_b
    invoke-virtual {v2}, Lm1/e;->U()I

    move-result v7

    if-nez v7, :cond_a

    invoke-virtual {v2}, Lm1/e;->S()I

    move-result v7

    if-eqz v7, :cond_e

    goto :goto_2

    :cond_c
    invoke-virtual {v2}, Lm1/e;->P()I

    move-result v7

    if-eqz v7, :cond_d

    goto :goto_2

    :cond_d
    invoke-virtual {v2}, Lm1/e;->T()I

    move-result v7

    if-nez v7, :cond_a

    invoke-virtual {v2}, Lm1/e;->R()I

    move-result v7

    if-eqz v7, :cond_e

    goto :goto_2

    :cond_e
    :goto_3
    invoke-virtual {v2}, Lm1/e;->I()F

    move-result v7

    cmpg-float v7, v7, v8

    if-nez v7, :cond_f

    goto :goto_4

    :cond_f
    iput-boolean v5, p0, Lm1/c;->o:Z

    iput-boolean v3, p0, Lm1/c;->u:Z

    :cond_10
    :goto_4
    invoke-static {v4, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_11

    invoke-virtual {v4}, Lm1/e;->Z()[Lm1/e;

    move-result-object v4

    iget v7, p0, Lm1/c;->p:I

    aput-object v2, v4, v7

    :cond_11
    invoke-virtual {v2}, Lm1/e;->M()[Lm1/d;

    move-result-object v4

    add-int/lit8 v7, v0, 0x1

    aget-object v4, v4, v7

    invoke-virtual {v4}, Lm1/d;->i()Lm1/d;

    move-result-object v4

    if-eqz v4, :cond_13

    invoke-virtual {v4}, Lm1/d;->g()Lm1/e;

    move-result-object v4

    invoke-virtual {v4}, Lm1/e;->M()[Lm1/d;

    move-result-object v7

    aget-object v7, v7, v0

    invoke-virtual {v7}, Lm1/d;->i()Lm1/d;

    move-result-object v7

    if-eqz v7, :cond_13

    invoke-virtual {v4}, Lm1/e;->M()[Lm1/d;

    move-result-object v7

    aget-object v7, v7, v0

    invoke-virtual {v7}, Lm1/d;->i()Lm1/d;

    move-result-object v7

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v7}, Lm1/d;->g()Lm1/e;

    move-result-object v7

    invoke-static {v7, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_12

    goto :goto_5

    :cond_12
    move-object v9, v4

    :cond_13
    :goto_5
    move-object v4, v2

    if-eqz v9, :cond_14

    move-object v2, v9

    goto/16 :goto_0

    :cond_14
    move v6, v3

    goto/16 :goto_0

    :cond_15
    iget-object v1, p0, Lm1/c;->b:Lm1/e;

    if-eqz v1, :cond_16

    iget v4, p0, Lm1/c;->m:I

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lm1/e;->M()[Lm1/d;

    move-result-object v1

    aget-object v1, v1, v0

    invoke-virtual {v1}, Lm1/d;->k()I

    move-result v1

    sub-int/2addr v4, v1

    iput v4, p0, Lm1/c;->m:I

    :cond_16
    iget-object v1, p0, Lm1/c;->d:Lm1/e;

    if-eqz v1, :cond_17

    iget v4, p0, Lm1/c;->m:I

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lm1/e;->M()[Lm1/d;

    move-result-object v1

    add-int/2addr v0, v3

    aget-object v0, v1, v0

    invoke-virtual {v0}, Lm1/d;->k()I

    move-result v0

    sub-int/2addr v4, v0

    iput v4, p0, Lm1/c;->m:I

    :cond_17
    iput-object v2, p0, Lm1/c;->c:Lm1/e;

    iget v0, p0, Lm1/c;->p:I

    if-nez v0, :cond_18

    iget-boolean v0, p0, Lm1/c;->q:Z

    if-eqz v0, :cond_18

    goto :goto_6

    :cond_18
    iget-object v2, p0, Lm1/c;->a:Lm1/e;

    :goto_6
    iput-object v2, p0, Lm1/c;->e:Lm1/e;

    iget-boolean v0, p0, Lm1/c;->s:Z

    if-eqz v0, :cond_19

    iget-boolean v0, p0, Lm1/c;->r:Z

    if-eqz v0, :cond_19

    goto :goto_7

    :cond_19
    move v3, v5

    :goto_7
    iput-boolean v3, p0, Lm1/c;->t:Z

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    iget-boolean v0, p0, Lm1/c;->v:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Lm1/c;->b()V

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lm1/c;->v:Z

    return-void
.end method

.method public final c()Lm1/e;
    .locals 1

    iget-object v0, p0, Lm1/c;->a:Lm1/e;

    return-object v0
.end method

.method public final d()Lm1/e;
    .locals 1

    iget-object v0, p0, Lm1/c;->f:Lm1/e;

    return-object v0
.end method

.method public final e()Lm1/e;
    .locals 1

    iget-object v0, p0, Lm1/c;->b:Lm1/e;

    return-object v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lm1/c;->t:Z

    return v0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lm1/c;->r:Z

    return v0
.end method

.method public final h()Lm1/e;
    .locals 1

    iget-object v0, p0, Lm1/c;->e:Lm1/e;

    return-object v0
.end method

.method public final i()Lm1/e;
    .locals 1

    iget-object v0, p0, Lm1/c;->c:Lm1/e;

    return-object v0
.end method

.method public final j()Lm1/e;
    .locals 1

    iget-object v0, p0, Lm1/c;->g:Lm1/e;

    return-object v0
.end method

.method public final k()Lm1/e;
    .locals 1

    iget-object v0, p0, Lm1/c;->d:Lm1/e;

    return-object v0
.end method

.method public final l()F
    .locals 1

    iget v0, p0, Lm1/c;->k:F

    return v0
.end method

.method public final m()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lm1/c;->h:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final n()I
    .locals 1

    iget v0, p0, Lm1/c;->i:I

    return v0
.end method

.method public final o()I
    .locals 1

    iget v0, p0, Lm1/c;->j:I

    return v0
.end method
