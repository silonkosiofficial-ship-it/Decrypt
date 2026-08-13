.class public final Ln1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln1/e$a;
    }
.end annotation


# static fields
.field public static final j:Ln1/e$a;

.field public static final k:I


# instance fields
.field private final a:Lm1/f;

.field private b:Z

.field private c:Z

.field private final d:Lm1/f;

.field private final e:Ljava/util/ArrayList;

.field private final f:Ljava/util/ArrayList;

.field private g:Ln1/b$c;

.field private final h:Ln1/b$b;

.field private i:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln1/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ln1/e$a;-><init>(Ly7/k;)V

    sput-object v0, Ln1/e;->j:Ln1/e$a;

    const/16 v0, 0x8

    sput v0, Ln1/e;->k:I

    return-void
.end method

.method public constructor <init>(Lm1/f;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln1/e;->a:Lm1/f;

    const/4 v0, 0x1

    iput-boolean v0, p0, Ln1/e;->b:Z

    iput-boolean v0, p0, Ln1/e;->c:Z

    iput-object p1, p0, Ln1/e;->d:Lm1/f;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ln1/e;->e:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ln1/e;->f:Ljava/util/ArrayList;

    new-instance p1, Ln1/b$b;

    invoke-direct {p1}, Ln1/b$b;-><init>()V

    iput-object p1, p0, Ln1/e;->h:Ln1/b$b;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ln1/e;->i:Ljava/util/ArrayList;

    return-void
.end method

.method private final a(Ln1/f;IILn1/f;Ljava/util/ArrayList;Ln1/m;)V
    .locals 8

    .prologue
    invoke-virtual {p1}, Ln1/f;->f()Ln1/p;

    move-result-object p1

    invoke-virtual {p1}, Ln1/p;->l()Ln1/m;

    move-result-object v0

    if-nez v0, :cond_c

    iget-object v0, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {v0}, Lm1/e;->K()Ln1/l;

    move-result-object v0

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    iget-object v0, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {v0}, Lm1/e;->e0()Ln1/n;

    move-result-object v0

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_6

    :cond_0
    if-nez p6, :cond_1

    new-instance p6, Ln1/m;

    invoke-direct {p6, p1, p3}, Ln1/m;-><init>(Ln1/p;I)V

    invoke-virtual {p5, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {p1, p6}, Ln1/p;->y(Ln1/m;)V

    invoke-virtual {p6, p1}, Ln1/m;->b(Ln1/p;)V

    invoke-virtual {p1}, Ln1/p;->q()Ln1/f;

    move-result-object p3

    invoke-virtual {p3}, Ln1/f;->d()Ljava/util/ArrayList;

    move-result-object p3

    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_2
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln1/d;

    instance-of v1, v0, Ln1/f;

    if-eqz v1, :cond_2

    move-object v1, v0

    check-cast v1, Ln1/f;

    const/4 v3, 0x0

    move-object v0, p0

    move v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Ln1/e;->a(Ln1/f;IILn1/f;Ljava/util/ArrayList;Ln1/m;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Ln1/p;->g()Ln1/f;

    move-result-object p3

    invoke-virtual {p3}, Ln1/f;->d()Ljava/util/ArrayList;

    move-result-object p3

    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_4
    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln1/d;

    instance-of v1, v0, Ln1/f;

    if-eqz v1, :cond_4

    move-object v1, v0

    check-cast v1, Ln1/f;

    const/4 v3, 0x1

    move-object v0, p0

    move v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Ln1/e;->a(Ln1/f;IILn1/f;Ljava/util/ArrayList;Ln1/m;)V

    goto :goto_1

    :cond_5
    const/4 p3, 0x1

    if-ne p2, p3, :cond_7

    instance-of v0, p1, Ln1/n;

    if-eqz v0, :cond_7

    move-object v0, p1

    check-cast v0, Ln1/n;

    invoke-virtual {v0}, Ln1/n;->H()Ln1/f;

    move-result-object v0

    invoke-virtual {v0}, Ln1/f;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_6
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln1/d;

    instance-of v1, v0, Ln1/f;

    if-eqz v1, :cond_6

    move-object v1, v0

    check-cast v1, Ln1/f;

    const/4 v3, 0x2

    move-object v0, p0

    move v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Ln1/e;->a(Ln1/f;IILn1/f;Ljava/util/ArrayList;Ln1/m;)V

    goto :goto_2

    :cond_7
    invoke-virtual {p1}, Ln1/p;->q()Ln1/f;

    move-result-object v0

    invoke-virtual {v0}, Ln1/f;->g()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ln1/f;

    invoke-static {v1, p4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p6, p3}, Ln1/m;->d(Z)V

    :cond_8
    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v3, 0x0

    move-object v0, p0

    move v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Ln1/e;->a(Ln1/f;IILn1/f;Ljava/util/ArrayList;Ln1/m;)V

    goto :goto_3

    :cond_9
    invoke-virtual {p1}, Ln1/p;->g()Ln1/f;

    move-result-object v0

    invoke-virtual {v0}, Ln1/f;->g()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ln1/f;

    invoke-static {v1, p4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {p6, p3}, Ln1/m;->d(Z)V

    :cond_a
    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v3, 0x1

    move-object v0, p0

    move v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Ln1/e;->a(Ln1/f;IILn1/f;Ljava/util/ArrayList;Ln1/m;)V

    goto :goto_4

    :cond_b
    if-ne p2, p3, :cond_c

    instance-of p3, p1, Ln1/n;

    if-eqz p3, :cond_c

    check-cast p1, Ln1/n;

    invoke-virtual {p1}, Ln1/n;->H()Ln1/f;

    move-result-object p1

    invoke-virtual {p1}, Ln1/f;->g()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    move-object v1, p3

    check-cast v1, Ln1/f;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v3, 0x2

    move-object v0, p0

    move v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    :try_start_0
    invoke-direct/range {v0 .. v6}, Ln1/e;->a(Ln1/f;IILn1/f;Ljava/util/ArrayList;Ln1/m;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_5

    :catchall_0
    move-exception p1

    throw p1

    :cond_c
    :goto_6
    return-void
.end method

.method private final b(Lm1/f;)Z
    .locals 14

    .prologue
    invoke-virtual {p1}, Lm1/m;->d2()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_25

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm1/e;

    invoke-virtual {v1}, Lm1/e;->N()[Lm1/e$b;

    move-result-object v3

    aget-object v3, v3, v2

    invoke-virtual {v1}, Lm1/e;->N()[Lm1/e$b;

    move-result-object v4

    const/4 v9, 0x1

    aget-object v4, v4, v9

    invoke-virtual {v1}, Lm1/e;->A0()I

    move-result v5

    const/16 v6, 0x8

    if-ne v5, v6, :cond_1

    :goto_1
    invoke-virtual {v1, v9}, Lm1/e;->F1(Z)V

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lm1/e;->W()F

    move-result v5

    const/high16 v10, 0x3f800000    # 1.0f

    cmpg-float v5, v5, v10

    const/4 v6, 0x2

    if-gez v5, :cond_2

    sget-object v5, Lm1/e$b;->E:Lm1/e$b;

    if-ne v3, v5, :cond_2

    invoke-virtual {v1, v6}, Lm1/e;->y1(I)V

    :cond_2
    invoke-virtual {v1}, Lm1/e;->V()F

    move-result v5

    cmpg-float v5, v5, v10

    if-gez v5, :cond_3

    sget-object v5, Lm1/e$b;->E:Lm1/e$b;

    if-ne v4, v5, :cond_3

    invoke-virtual {v1, v6}, Lm1/e;->x1(I)V

    :cond_3
    invoke-virtual {v1}, Lm1/e;->s()F

    move-result v5

    const/4 v7, 0x0

    cmpl-float v5, v5, v7

    const/4 v7, 0x3

    if-lez v5, :cond_9

    sget-object v5, Lm1/e$b;->E:Lm1/e$b;

    if-ne v3, v5, :cond_5

    sget-object v8, Lm1/e$b;->D:Lm1/e$b;

    if-eq v4, v8, :cond_4

    sget-object v8, Lm1/e$b;->C:Lm1/e$b;

    if-ne v4, v8, :cond_5

    :cond_4
    invoke-virtual {v1, v7}, Lm1/e;->y1(I)V

    goto :goto_3

    :cond_5
    if-ne v4, v5, :cond_7

    sget-object v8, Lm1/e$b;->D:Lm1/e$b;

    if-eq v3, v8, :cond_6

    sget-object v8, Lm1/e$b;->C:Lm1/e$b;

    if-ne v3, v8, :cond_7

    :cond_6
    :goto_2
    invoke-virtual {v1, v7}, Lm1/e;->x1(I)V

    goto :goto_3

    :cond_7
    if-ne v3, v5, :cond_9

    if-ne v4, v5, :cond_9

    invoke-virtual {v1}, Lm1/e;->Q()I

    move-result v5

    if-nez v5, :cond_8

    invoke-virtual {v1, v7}, Lm1/e;->y1(I)V

    :cond_8
    invoke-virtual {v1}, Lm1/e;->P()I

    move-result v5

    if-nez v5, :cond_9

    goto :goto_2

    :cond_9
    :goto_3
    sget-object v5, Lm1/e$b;->E:Lm1/e$b;

    if-ne v3, v5, :cond_b

    invoke-virtual {v1}, Lm1/e;->Q()I

    move-result v8

    if-ne v8, v9, :cond_b

    invoke-virtual {v1}, Lm1/e;->L()Lm1/d;

    move-result-object v8

    invoke-virtual {v8}, Lm1/d;->i()Lm1/d;

    move-result-object v8

    if-eqz v8, :cond_a

    invoke-virtual {v1}, Lm1/e;->b0()Lm1/d;

    move-result-object v8

    invoke-virtual {v8}, Lm1/d;->i()Lm1/d;

    move-result-object v8

    if-nez v8, :cond_b

    :cond_a
    sget-object v3, Lm1/e$b;->D:Lm1/e$b;

    :cond_b
    move-object v8, v3

    if-ne v4, v5, :cond_d

    invoke-virtual {v1}, Lm1/e;->P()I

    move-result v3

    if-ne v3, v9, :cond_d

    invoke-virtual {v1}, Lm1/e;->c0()Lm1/d;

    move-result-object v3

    invoke-virtual {v3}, Lm1/d;->i()Lm1/d;

    move-result-object v3

    if-eqz v3, :cond_c

    invoke-virtual {v1}, Lm1/e;->G()Lm1/d;

    move-result-object v3

    invoke-virtual {v3}, Lm1/d;->i()Lm1/d;

    move-result-object v3

    if-nez v3, :cond_d

    :cond_c
    sget-object v3, Lm1/e$b;->D:Lm1/e$b;

    move-object v11, v3

    goto :goto_4

    :cond_d
    move-object v11, v4

    :goto_4
    invoke-virtual {v1}, Lm1/e;->K()Ln1/l;

    move-result-object v3

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v3, v8}, Ln1/p;->w(Lm1/e$b;)V

    invoke-virtual {v1}, Lm1/e;->K()Ln1/l;

    move-result-object v3

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lm1/e;->Q()I

    move-result v4

    invoke-virtual {v3, v4}, Ln1/p;->B(I)V

    invoke-virtual {v1}, Lm1/e;->e0()Ln1/n;

    move-result-object v3

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v3, v11}, Ln1/p;->w(Lm1/e$b;)V

    invoke-virtual {v1}, Lm1/e;->e0()Ln1/n;

    move-result-object v3

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lm1/e;->P()I

    move-result v4

    invoke-virtual {v3, v4}, Ln1/p;->B(I)V

    sget-object v3, Lm1/e$b;->F:Lm1/e$b;

    if-eq v8, v3, :cond_e

    sget-object v4, Lm1/e$b;->C:Lm1/e$b;

    if-eq v8, v4, :cond_e

    sget-object v4, Lm1/e$b;->D:Lm1/e$b;

    if-ne v8, v4, :cond_f

    :cond_e
    if-eq v11, v3, :cond_22

    sget-object v4, Lm1/e$b;->C:Lm1/e$b;

    if-eq v11, v4, :cond_22

    sget-object v4, Lm1/e$b;->D:Lm1/e$b;

    if-ne v11, v4, :cond_f

    goto/16 :goto_d

    :cond_f
    const/high16 v12, 0x3f000000    # 0.5f

    if-ne v8, v5, :cond_17

    sget-object v13, Lm1/e$b;->D:Lm1/e$b;

    if-eq v11, v13, :cond_10

    sget-object v4, Lm1/e$b;->C:Lm1/e$b;

    if-ne v11, v4, :cond_17

    :cond_10
    invoke-virtual {v1}, Lm1/e;->Q()I

    move-result v4

    if-ne v4, v7, :cond_12

    if-ne v11, v13, :cond_11

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v3, p0

    move-object v4, v1

    move-object v5, v13

    move-object v7, v13

    invoke-direct/range {v3 .. v8}, Ln1/e;->k(Lm1/e;Lm1/e$b;ILm1/e$b;I)V

    :cond_11
    invoke-virtual {v1}, Lm1/e;->w()I

    move-result v8

    int-to-float v2, v8

    invoke-virtual {v1}, Lm1/e;->I()F

    move-result v3

    mul-float/2addr v2, v3

    add-float/2addr v2, v12

    float-to-int v6, v2

    :goto_5
    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    sget-object v7, Lm1/e$b;->C:Lm1/e$b;

    :goto_6
    move-object v3, p0

    move-object v4, v1

    move-object v5, v7

    :goto_7
    invoke-direct/range {v3 .. v8}, Ln1/e;->k(Lm1/e;Lm1/e$b;ILm1/e$b;I)V

    invoke-virtual {v1}, Lm1/e;->K()Ln1/l;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ln1/p;->i()Ln1/g;

    move-result-object v2

    invoke-virtual {v1}, Lm1/e;->B0()I

    move-result v3

    invoke-virtual {v2, v3}, Ln1/g;->k(I)V

    invoke-virtual {v1}, Lm1/e;->e0()Ln1/n;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ln1/p;->i()Ln1/g;

    move-result-object v2

    invoke-virtual {v1}, Lm1/e;->w()I

    move-result v3

    invoke-virtual {v2, v3}, Ln1/g;->k(I)V

    goto/16 :goto_1

    :cond_12
    invoke-virtual {v1}, Lm1/e;->Q()I

    move-result v4

    if-ne v4, v9, :cond_13

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v3, p0

    move-object v4, v1

    move-object v5, v13

    move-object v7, v11

    invoke-direct/range {v3 .. v8}, Ln1/e;->k(Lm1/e;Lm1/e$b;ILm1/e$b;I)V

    invoke-virtual {v1}, Lm1/e;->K()Ln1/l;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ln1/p;->i()Ln1/g;

    move-result-object v2

    invoke-virtual {v1}, Lm1/e;->B0()I

    move-result v1

    :goto_8
    invoke-virtual {v2, v1}, Ln1/g;->v(I)V

    goto/16 :goto_0

    :cond_13
    invoke-virtual {v1}, Lm1/e;->Q()I

    move-result v4

    if-ne v4, v6, :cond_15

    invoke-virtual {p1}, Lm1/e;->N()[Lm1/e$b;

    move-result-object v4

    aget-object v4, v4, v2

    sget-object v13, Lm1/e$b;->C:Lm1/e$b;

    if-eq v4, v13, :cond_14

    invoke-virtual {p1}, Lm1/e;->N()[Lm1/e$b;

    move-result-object v4

    aget-object v4, v4, v2

    if-ne v4, v3, :cond_17

    :cond_14
    invoke-virtual {v1}, Lm1/e;->W()F

    move-result v2

    invoke-virtual {p1}, Lm1/e;->B0()I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v2, v3

    add-float/2addr v2, v12

    float-to-int v6, v2

    invoke-virtual {v1}, Lm1/e;->w()I

    move-result v8

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    :goto_9
    move-object v3, p0

    move-object v4, v1

    move-object v5, v13

    move-object v7, v11

    goto :goto_7

    :cond_15
    invoke-virtual {v1}, Lm1/e;->M()[Lm1/d;

    move-result-object v4

    aget-object v4, v4, v2

    invoke-virtual {v4}, Lm1/d;->i()Lm1/d;

    move-result-object v4

    if-eqz v4, :cond_16

    invoke-virtual {v1}, Lm1/e;->M()[Lm1/d;

    move-result-object v4

    aget-object v4, v4, v9

    invoke-virtual {v4}, Lm1/d;->i()Lm1/d;

    move-result-object v4

    if-nez v4, :cond_17

    :cond_16
    :goto_a
    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v6, 0x0

    const/4 v8, 0x0

    goto :goto_9

    :cond_17
    if-ne v11, v5, :cond_1f

    sget-object v13, Lm1/e$b;->D:Lm1/e$b;

    if-eq v8, v13, :cond_18

    sget-object v4, Lm1/e$b;->C:Lm1/e$b;

    if-ne v8, v4, :cond_1f

    :cond_18
    invoke-virtual {v1}, Lm1/e;->P()I

    move-result v4

    if-ne v4, v7, :cond_1b

    if-ne v8, v13, :cond_19

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v3, p0

    move-object v4, v1

    move-object v5, v13

    move-object v7, v13

    invoke-direct/range {v3 .. v8}, Ln1/e;->k(Lm1/e;Lm1/e$b;ILm1/e$b;I)V

    :cond_19
    invoke-virtual {v1}, Lm1/e;->B0()I

    move-result v6

    invoke-virtual {v1}, Lm1/e;->I()F

    move-result v2

    invoke-virtual {v1}, Lm1/e;->t()I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_1a

    div-float v2, v10, v2

    :cond_1a
    int-to-float v3, v6

    mul-float/2addr v3, v2

    add-float/2addr v3, v12

    float-to-int v8, v3

    goto/16 :goto_5

    :cond_1b
    invoke-virtual {v1}, Lm1/e;->P()I

    move-result v4

    if-ne v4, v9, :cond_1c

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v6, 0x0

    const/4 v2, 0x0

    move-object v3, p0

    move-object v4, v1

    move-object v5, v8

    move-object v7, v13

    move v8, v2

    invoke-direct/range {v3 .. v8}, Ln1/e;->k(Lm1/e;Lm1/e$b;ILm1/e$b;I)V

    :goto_b
    invoke-virtual {v1}, Lm1/e;->e0()Ln1/n;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ln1/p;->i()Ln1/g;

    move-result-object v2

    invoke-virtual {v1}, Lm1/e;->w()I

    move-result v1

    goto/16 :goto_8

    :cond_1c
    invoke-virtual {v1}, Lm1/e;->P()I

    move-result v4

    if-ne v4, v6, :cond_1e

    invoke-virtual {p1}, Lm1/e;->N()[Lm1/e$b;

    move-result-object v4

    aget-object v4, v4, v9

    sget-object v7, Lm1/e$b;->C:Lm1/e$b;

    if-eq v4, v7, :cond_1d

    invoke-virtual {p1}, Lm1/e;->N()[Lm1/e$b;

    move-result-object v4

    aget-object v4, v4, v9

    if-ne v4, v3, :cond_1f

    :cond_1d
    invoke-virtual {v1}, Lm1/e;->V()F

    move-result v2

    invoke-virtual {v1}, Lm1/e;->B0()I

    move-result v6

    invoke-virtual {p1}, Lm1/e;->w()I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v2, v3

    add-float/2addr v2, v12

    float-to-int v2, v2

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    move-object v3, p0

    move-object v4, v1

    move-object v5, v8

    move v8, v2

    goto/16 :goto_7

    :cond_1e
    invoke-virtual {v1}, Lm1/e;->M()[Lm1/d;

    move-result-object v3

    aget-object v3, v3, v6

    invoke-virtual {v3}, Lm1/d;->i()Lm1/d;

    move-result-object v3

    if-eqz v3, :cond_16

    invoke-virtual {v1}, Lm1/e;->M()[Lm1/d;

    move-result-object v3

    aget-object v3, v3, v7

    invoke-virtual {v3}, Lm1/d;->i()Lm1/d;

    move-result-object v3

    if-nez v3, :cond_1f

    goto/16 :goto_a

    :cond_1f
    if-ne v8, v5, :cond_0

    if-ne v11, v5, :cond_0

    invoke-virtual {v1}, Lm1/e;->Q()I

    move-result v3

    if-eq v3, v9, :cond_21

    invoke-virtual {v1}, Lm1/e;->P()I

    move-result v3

    if-ne v3, v9, :cond_20

    goto :goto_c

    :cond_20
    invoke-virtual {v1}, Lm1/e;->P()I

    move-result v3

    if-ne v3, v6, :cond_0

    invoke-virtual {v1}, Lm1/e;->Q()I

    move-result v3

    if-ne v3, v6, :cond_0

    invoke-virtual {p1}, Lm1/e;->N()[Lm1/e$b;

    move-result-object v3

    aget-object v2, v3, v2

    sget-object v7, Lm1/e$b;->C:Lm1/e$b;

    if-ne v2, v7, :cond_0

    invoke-virtual {p1}, Lm1/e;->N()[Lm1/e$b;

    move-result-object v2

    aget-object v2, v2, v9

    if-ne v2, v7, :cond_0

    invoke-virtual {v1}, Lm1/e;->W()F

    move-result v2

    invoke-virtual {v1}, Lm1/e;->V()F

    move-result v3

    invoke-virtual {p1}, Lm1/e;->B0()I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr v2, v4

    add-float/2addr v2, v12

    float-to-int v6, v2

    invoke-virtual {p1}, Lm1/e;->w()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v3, v2

    add-float/2addr v3, v12

    float-to-int v8, v3

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_21
    :goto_c
    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    sget-object v7, Lm1/e$b;->D:Lm1/e$b;

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v3, p0

    move-object v4, v1

    move-object v5, v7

    invoke-direct/range {v3 .. v8}, Ln1/e;->k(Lm1/e;Lm1/e$b;ILm1/e$b;I)V

    invoke-virtual {v1}, Lm1/e;->K()Ln1/l;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ln1/p;->i()Ln1/g;

    move-result-object v2

    invoke-virtual {v1}, Lm1/e;->B0()I

    move-result v3

    invoke-virtual {v2, v3}, Ln1/g;->v(I)V

    goto/16 :goto_b

    :cond_22
    :goto_d
    invoke-virtual {v1}, Lm1/e;->B0()I

    move-result v2

    if-ne v8, v3, :cond_23

    invoke-virtual {p1}, Lm1/e;->B0()I

    move-result v2

    invoke-virtual {v1}, Lm1/e;->L()Lm1/d;

    move-result-object v4

    invoke-virtual {v4}, Lm1/d;->f()I

    move-result v4

    sub-int/2addr v2, v4

    invoke-virtual {v1}, Lm1/e;->b0()Lm1/d;

    move-result-object v4

    invoke-virtual {v4}, Lm1/d;->f()I

    move-result v4

    sub-int/2addr v2, v4

    sget-object v4, Lm1/e$b;->C:Lm1/e$b;

    move v6, v2

    move-object v5, v4

    goto :goto_e

    :cond_23
    move v6, v2

    move-object v5, v8

    :goto_e
    invoke-virtual {v1}, Lm1/e;->w()I

    move-result v2

    if-ne v11, v3, :cond_24

    invoke-virtual {p1}, Lm1/e;->w()I

    move-result v2

    invoke-virtual {v1}, Lm1/e;->c0()Lm1/d;

    move-result-object v3

    invoke-virtual {v3}, Lm1/d;->f()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {v1}, Lm1/e;->G()Lm1/d;

    move-result-object v3

    invoke-virtual {v3}, Lm1/d;->f()I

    move-result v3

    sub-int/2addr v2, v3

    sget-object v3, Lm1/e$b;->C:Lm1/e$b;

    move v8, v2

    move-object v7, v3

    goto :goto_f

    :cond_24
    move v8, v2

    move-object v7, v11

    :goto_f
    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    move-object v3, p0

    move-object v4, v1

    goto/16 :goto_7

    :cond_25
    return v2
.end method

.method private final e(Lm1/f;I)I
    .locals 6

    .prologue
    iget-object v0, p0, Ln1/e;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    iget-object v4, p0, Ln1/e;->i:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    const-string v5, "get(...)"

    invoke-static {v4, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ln1/m;

    invoke-virtual {v4, p1, p2}, Ln1/m;->c(Lm1/f;I)J

    move-result-wide v4

    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    long-to-int p1, v1

    return p1
.end method

.method private final i(Ln1/p;ILjava/util/ArrayList;)V
    .locals 10

    .prologue
    invoke-virtual {p1}, Ln1/p;->q()Ln1/f;

    move-result-object v0

    invoke-virtual {v0}, Ln1/f;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln1/d;

    instance-of v2, v1, Ln1/f;

    if-eqz v2, :cond_1

    move-object v4, v1

    check-cast v4, Ln1/f;

    invoke-virtual {p1}, Ln1/p;->g()Ln1/f;

    move-result-object v7

    const/4 v9, 0x0

    const/4 v6, 0x0

    move-object v3, p0

    move v5, p2

    move-object v8, p3

    invoke-direct/range {v3 .. v9}, Ln1/e;->a(Ln1/f;IILn1/f;Ljava/util/ArrayList;Ln1/m;)V

    goto :goto_0

    :cond_1
    instance-of v2, v1, Ln1/p;

    if-eqz v2, :cond_0

    check-cast v1, Ln1/p;

    invoke-virtual {v1}, Ln1/p;->q()Ln1/f;

    move-result-object v3

    invoke-virtual {p1}, Ln1/p;->g()Ln1/f;

    move-result-object v6

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    move v4, p2

    move-object v7, p3

    invoke-direct/range {v2 .. v8}, Ln1/e;->a(Ln1/f;IILn1/f;Ljava/util/ArrayList;Ln1/m;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Ln1/p;->g()Ln1/f;

    move-result-object v0

    invoke-virtual {v0}, Ln1/f;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln1/d;

    instance-of v2, v1, Ln1/f;

    if-eqz v2, :cond_4

    move-object v4, v1

    check-cast v4, Ln1/f;

    invoke-virtual {p1}, Ln1/p;->q()Ln1/f;

    move-result-object v7

    const/4 v9, 0x0

    const/4 v6, 0x1

    move-object v3, p0

    move v5, p2

    move-object v8, p3

    invoke-direct/range {v3 .. v9}, Ln1/e;->a(Ln1/f;IILn1/f;Ljava/util/ArrayList;Ln1/m;)V

    goto :goto_1

    :cond_4
    instance-of v2, v1, Ln1/p;

    if-eqz v2, :cond_3

    check-cast v1, Ln1/p;

    invoke-virtual {v1}, Ln1/p;->g()Ln1/f;

    move-result-object v3

    invoke-virtual {p1}, Ln1/p;->q()Ln1/f;

    move-result-object v6

    const/4 v8, 0x0

    const/4 v5, 0x1

    move-object v2, p0

    move v4, p2

    move-object v7, p3

    invoke-direct/range {v2 .. v8}, Ln1/e;->a(Ln1/f;IILn1/f;Ljava/util/ArrayList;Ln1/m;)V

    goto :goto_1

    :cond_5
    const/4 v0, 0x1

    if-ne p2, v0, :cond_7

    const-string v0, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ln1/n;

    invoke-virtual {p1}, Ln1/n;->H()Ln1/f;

    move-result-object p1

    invoke-virtual {p1}, Ln1/f;->d()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln1/d;

    instance-of v1, v0, Ln1/f;

    if-eqz v1, :cond_6

    move-object v3, v0

    check-cast v3, Ln1/f;

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v5, 0x2

    move-object v2, p0

    move v4, p2

    move-object v7, p3

    invoke-direct/range {v2 .. v8}, Ln1/e;->a(Ln1/f;IILn1/f;Ljava/util/ArrayList;Ln1/m;)V

    goto :goto_2

    :cond_7
    return-void
.end method

.method private final k(Lm1/e;Lm1/e$b;ILm1/e$b;I)V
    .locals 1

    iget-object v0, p0, Ln1/e;->h:Ln1/b$b;

    invoke-virtual {v0, p2}, Ln1/b$b;->n(Lm1/e$b;)V

    iget-object p2, p0, Ln1/e;->h:Ln1/b$b;

    invoke-virtual {p2, p4}, Ln1/b$b;->v(Lm1/e$b;)V

    iget-object p2, p0, Ln1/e;->h:Ln1/b$b;

    invoke-virtual {p2, p3}, Ln1/b$b;->o(I)V

    iget-object p2, p0, Ln1/e;->h:Ln1/b$b;

    invoke-virtual {p2, p5}, Ln1/b$b;->w(I)V

    iget-object p2, p0, Ln1/e;->g:Ln1/b$c;

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object p3, p0, Ln1/e;->h:Ln1/b$b;

    invoke-interface {p2, p1, p3}, Ln1/b$c;->b(Lm1/e;Ln1/b$b;)V

    iget-object p2, p0, Ln1/e;->h:Ln1/b$b;

    invoke-virtual {p2}, Ln1/b$b;->k()I

    move-result p2

    invoke-virtual {p1, p2}, Lm1/e;->U1(I)V

    iget-object p2, p0, Ln1/e;->h:Ln1/b$b;

    invoke-virtual {p2}, Ln1/b$b;->i()I

    move-result p2

    invoke-virtual {p1, p2}, Lm1/e;->m1(I)V

    iget-object p2, p0, Ln1/e;->h:Ln1/b$b;

    invoke-virtual {p2}, Ln1/b$b;->h()Z

    move-result p2

    invoke-virtual {p1, p2}, Lm1/e;->l1(Z)V

    iget-object p2, p0, Ln1/e;->h:Ln1/b$b;

    invoke-virtual {p2}, Ln1/b$b;->g()I

    move-result p2

    invoke-virtual {p1, p2}, Lm1/e;->a1(I)V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 4

    iget-object v0, p0, Ln1/e;->e:Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, Ln1/e;->d(Ljava/util/ArrayList;)V

    iget-object v0, p0, Ln1/e;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    sget-object v0, Ln1/m;->g:Ln1/m$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ln1/m$a;->a(I)V

    iget-object v0, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {v0}, Lm1/e;->K()Ln1/l;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v2, p0, Ln1/e;->i:Ljava/util/ArrayList;

    invoke-direct {p0, v0, v1, v2}, Ln1/e;->i(Ln1/p;ILjava/util/ArrayList;)V

    iget-object v0, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {v0}, Lm1/e;->e0()Ln1/n;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v2, 0x1

    iget-object v3, p0, Ln1/e;->i:Ljava/util/ArrayList;

    invoke-direct {p0, v0, v2, v3}, Ln1/e;->i(Ln1/p;ILjava/util/ArrayList;)V

    iput-boolean v1, p0, Ln1/e;->b:Z

    return-void
.end method

.method public final d(Ljava/util/ArrayList;)V
    .locals 5

    .prologue
    const-string v0, "runs"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Ln1/e;->d:Lm1/f;

    invoke-virtual {v0}, Lm1/e;->K()Ln1/l;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ln1/l;->f()V

    iget-object v0, p0, Ln1/e;->d:Lm1/f;

    invoke-virtual {v0}, Lm1/e;->e0()Ln1/n;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ln1/n;->f()V

    iget-object v0, p0, Ln1/e;->d:Lm1/f;

    invoke-virtual {v0}, Lm1/e;->K()Ln1/l;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ln1/e;->d:Lm1/f;

    invoke-virtual {v0}, Lm1/e;->e0()Ln1/n;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ln1/e;->d:Lm1/f;

    invoke-virtual {v0}, Lm1/m;->d2()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm1/e;

    instance-of v3, v2, Lm1/h;

    if-eqz v3, :cond_1

    new-instance v3, Ln1/j;

    invoke-direct {v3, v2}, Ln1/j;-><init>(Lm1/e;)V

    :goto_1
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Lm1/e;->M0()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v2}, Lm1/e;->y()Ln1/c;

    move-result-object v3

    if-nez v3, :cond_2

    new-instance v3, Ln1/c;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v4, 0x0

    invoke-direct {v3, v2, v4}, Ln1/c;-><init>(Lm1/e;I)V

    invoke-virtual {v2, v3}, Lm1/e;->o1(Ln1/c;)V

    :cond_2
    if-nez v1, :cond_3

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    :cond_3
    invoke-virtual {v2}, Lm1/e;->y()Ln1/c;

    move-result-object v3

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    invoke-virtual {v2}, Lm1/e;->K()Ln1/l;

    move-result-object v3

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    invoke-virtual {v2}, Lm1/e;->N0()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v2}, Lm1/e;->w0()Ln1/c;

    move-result-object v3

    if-nez v3, :cond_5

    new-instance v3, Ln1/c;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v4, 0x1

    invoke-direct {v3, v2, v4}, Ln1/c;-><init>(Lm1/e;I)V

    invoke-virtual {v2, v3}, Lm1/e;->M1(Ln1/c;)V

    :cond_5
    if-nez v1, :cond_6

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    :cond_6
    invoke-virtual {v2}, Lm1/e;->w0()Ln1/c;

    move-result-object v3

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    invoke-virtual {v2}, Lm1/e;->e0()Ln1/n;

    move-result-object v3

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_3
    instance-of v3, v2, Lm1/j;

    if-eqz v3, :cond_0

    new-instance v3, Ln1/k;

    invoke-direct {v3, v2}, Ln1/k;-><init>(Lm1/e;)V

    goto :goto_1

    :cond_8
    if-eqz v1, :cond_9

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_9
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln1/p;

    invoke-virtual {v1}, Ln1/p;->f()V

    goto :goto_4

    :cond_a
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln1/p;

    invoke-virtual {v0}, Ln1/p;->n()Lm1/e;

    move-result-object v1

    iget-object v2, p0, Ln1/e;->d:Lm1/f;

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    goto :goto_5

    :cond_b
    invoke-virtual {v0}, Ln1/p;->d()V

    goto :goto_5

    :cond_c
    return-void
.end method

.method public final f(Z)Z
    .locals 8

    .prologue
    iget-boolean v0, p0, Ln1/e;->b:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ln1/e;->c:Z

    if-eqz v0, :cond_2

    :cond_0
    iget-object v0, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {v0}, Lm1/m;->d2()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm1/e;

    invoke-virtual {v2}, Lm1/e;->k()V

    invoke-virtual {v2, v1}, Lm1/e;->F1(Z)V

    invoke-virtual {v2}, Lm1/e;->K()Ln1/l;

    move-result-object v3

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ln1/l;->I()V

    invoke-virtual {v2}, Lm1/e;->e0()Ln1/n;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ln1/n;->J()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {v0}, Lm1/e;->k()V

    iget-object v0, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {v0, v1}, Lm1/e;->F1(Z)V

    iget-object v0, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {v0}, Lm1/e;->K()Ln1/l;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ln1/l;->I()V

    iget-object v0, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {v0}, Lm1/e;->e0()Ln1/n;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ln1/n;->J()V

    iput-boolean v1, p0, Ln1/e;->c:Z

    :cond_2
    iget-object v0, p0, Ln1/e;->d:Lm1/f;

    invoke-direct {p0, v0}, Ln1/e;->b(Lm1/f;)Z

    move-result v0

    if-eqz v0, :cond_3

    return v1

    :cond_3
    iget-object v0, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {v0, v1}, Lm1/e;->V1(I)V

    iget-object v0, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {v0, v1}, Lm1/e;->W1(I)V

    iget-object v0, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {v0, v1}, Lm1/e;->r(I)Lm1/e$b;

    move-result-object v0

    iget-object v2, p0, Ln1/e;->a:Lm1/f;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lm1/e;->r(I)Lm1/e$b;

    move-result-object v2

    iget-boolean v4, p0, Ln1/e;->b:Z

    if-eqz v4, :cond_4

    invoke-virtual {p0}, Ln1/e;->c()V

    :cond_4
    iget-object v4, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {v4}, Lm1/e;->C0()I

    move-result v4

    iget-object v5, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {v5}, Lm1/e;->D0()I

    move-result v5

    iget-object v6, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {v6}, Lm1/e;->K()Ln1/l;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v6}, Ln1/p;->q()Ln1/f;

    move-result-object v6

    invoke-virtual {v6, v4}, Ln1/f;->k(I)V

    iget-object v6, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {v6}, Lm1/e;->e0()Ln1/n;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v6}, Ln1/p;->q()Ln1/f;

    move-result-object v6

    invoke-virtual {v6, v5}, Ln1/f;->k(I)V

    invoke-virtual {p0}, Ln1/e;->l()V

    sget-object v6, Lm1/e$b;->D:Lm1/e$b;

    if-eq v0, v6, :cond_5

    if-ne v2, v6, :cond_9

    :cond_5
    if-eqz p1, :cond_7

    iget-object v6, p0, Ln1/e;->e:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ln1/p;

    invoke-virtual {v7}, Ln1/p;->D()Z

    move-result v7

    if-nez v7, :cond_6

    move p1, v1

    :cond_7
    if-eqz p1, :cond_8

    sget-object v6, Lm1/e$b;->D:Lm1/e$b;

    if-ne v0, v6, :cond_8

    iget-object v6, p0, Ln1/e;->a:Lm1/f;

    sget-object v7, Lm1/e$b;->C:Lm1/e$b;

    invoke-virtual {v6, v7}, Lm1/e;->r1(Lm1/e$b;)V

    iget-object v6, p0, Ln1/e;->a:Lm1/f;

    invoke-direct {p0, v6, v1}, Ln1/e;->e(Lm1/f;I)I

    move-result v7

    invoke-virtual {v6, v7}, Lm1/e;->U1(I)V

    iget-object v6, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {v6}, Lm1/e;->K()Ln1/l;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v6}, Ln1/p;->i()Ln1/g;

    move-result-object v6

    iget-object v7, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {v7}, Lm1/e;->B0()I

    move-result v7

    invoke-virtual {v6, v7}, Ln1/g;->k(I)V

    :cond_8
    if-eqz p1, :cond_9

    sget-object p1, Lm1/e$b;->D:Lm1/e$b;

    if-ne v2, p1, :cond_9

    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    sget-object v6, Lm1/e$b;->C:Lm1/e$b;

    invoke-virtual {p1, v6}, Lm1/e;->P1(Lm1/e$b;)V

    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    invoke-direct {p0, p1, v3}, Ln1/e;->e(Lm1/f;I)I

    move-result v6

    invoke-virtual {p1, v6}, Lm1/e;->m1(I)V

    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {p1}, Lm1/e;->e0()Ln1/n;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ln1/p;->i()Ln1/g;

    move-result-object p1

    iget-object v6, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {v6}, Lm1/e;->w()I

    move-result v6

    invoke-virtual {p1, v6}, Ln1/g;->k(I)V

    :cond_9
    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {p1}, Lm1/e;->N()[Lm1/e$b;

    move-result-object p1

    aget-object p1, p1, v1

    sget-object v6, Lm1/e$b;->C:Lm1/e$b;

    if-eq p1, v6, :cond_b

    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {p1}, Lm1/e;->N()[Lm1/e$b;

    move-result-object p1

    aget-object p1, p1, v1

    sget-object v7, Lm1/e$b;->F:Lm1/e$b;

    if-ne p1, v7, :cond_a

    goto :goto_1

    :cond_a
    move p1, v1

    goto :goto_2

    :cond_b
    :goto_1
    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {p1}, Lm1/e;->B0()I

    move-result p1

    add-int/2addr p1, v4

    iget-object v7, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {v7}, Lm1/e;->K()Ln1/l;

    move-result-object v7

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v7}, Ln1/p;->g()Ln1/f;

    move-result-object v7

    invoke-virtual {v7, p1}, Ln1/f;->k(I)V

    iget-object v7, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {v7}, Lm1/e;->K()Ln1/l;

    move-result-object v7

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v7}, Ln1/p;->i()Ln1/g;

    move-result-object v7

    sub-int/2addr p1, v4

    invoke-virtual {v7, p1}, Ln1/g;->k(I)V

    invoke-virtual {p0}, Ln1/e;->l()V

    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {p1}, Lm1/e;->N()[Lm1/e$b;

    move-result-object p1

    aget-object p1, p1, v3

    if-eq p1, v6, :cond_c

    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {p1}, Lm1/e;->N()[Lm1/e$b;

    move-result-object p1

    aget-object p1, p1, v3

    sget-object v4, Lm1/e$b;->F:Lm1/e$b;

    if-ne p1, v4, :cond_d

    :cond_c
    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {p1}, Lm1/e;->w()I

    move-result p1

    add-int/2addr p1, v5

    iget-object v4, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {v4}, Lm1/e;->e0()Ln1/n;

    move-result-object v4

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ln1/p;->g()Ln1/f;

    move-result-object v4

    invoke-virtual {v4, p1}, Ln1/f;->k(I)V

    iget-object v4, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {v4}, Lm1/e;->e0()Ln1/n;

    move-result-object v4

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ln1/p;->i()Ln1/g;

    move-result-object v4

    sub-int/2addr p1, v5

    invoke-virtual {v4, p1}, Ln1/g;->k(I)V

    :cond_d
    invoke-virtual {p0}, Ln1/e;->l()V

    move p1, v3

    :goto_2
    iget-object v4, p0, Ln1/e;->e:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_f

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ln1/p;

    invoke-virtual {v5}, Ln1/p;->n()Lm1/e;

    move-result-object v6

    iget-object v7, p0, Ln1/e;->a:Lm1/f;

    invoke-static {v6, v7}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-virtual {v5}, Ln1/p;->k()Z

    move-result v6

    if-nez v6, :cond_e

    goto :goto_3

    :cond_e
    invoke-virtual {v5}, Ln1/p;->e()V

    goto :goto_3

    :cond_f
    iget-object v4, p0, Ln1/e;->e:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_10
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_14

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ln1/p;

    if-nez p1, :cond_11

    invoke-virtual {v5}, Ln1/p;->n()Lm1/e;

    move-result-object v6

    iget-object v7, p0, Ln1/e;->a:Lm1/f;

    invoke-static {v6, v7}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_11

    goto :goto_4

    :cond_11
    invoke-virtual {v5}, Ln1/p;->q()Ln1/f;

    move-result-object v6

    invoke-virtual {v6}, Ln1/f;->i()Z

    move-result v6

    if-nez v6, :cond_12

    goto :goto_5

    :cond_12
    invoke-virtual {v5}, Ln1/p;->g()Ln1/f;

    move-result-object v6

    invoke-virtual {v6}, Ln1/f;->i()Z

    move-result v6

    if-nez v6, :cond_13

    instance-of v6, v5, Ln1/j;

    if-nez v6, :cond_13

    goto :goto_5

    :cond_13
    invoke-virtual {v5}, Ln1/p;->i()Ln1/g;

    move-result-object v6

    invoke-virtual {v6}, Ln1/f;->i()Z

    move-result v6

    if-nez v6, :cond_10

    instance-of v6, v5, Ln1/c;

    if-nez v6, :cond_10

    instance-of v5, v5, Ln1/j;

    if-nez v5, :cond_10

    goto :goto_5

    :cond_14
    move v1, v3

    :goto_5
    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lm1/e;->r1(Lm1/e$b;)V

    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, v2}, Lm1/e;->P1(Lm1/e$b;)V

    return v1
.end method

.method public final g(Z)Z
    .locals 3

    .prologue
    iget-boolean p1, p0, Ln1/e;->b:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {p1}, Lm1/m;->d2()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm1/e;

    invoke-virtual {v1}, Lm1/e;->k()V

    invoke-virtual {v1, v0}, Lm1/e;->F1(Z)V

    invoke-virtual {v1}, Lm1/e;->K()Ln1/l;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ln1/p;->i()Ln1/g;

    move-result-object v2

    invoke-virtual {v2, v0}, Ln1/f;->r(Z)V

    invoke-virtual {v1}, Lm1/e;->K()Ln1/l;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2, v0}, Ln1/p;->x(Z)V

    invoke-virtual {v1}, Lm1/e;->K()Ln1/l;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ln1/l;->I()V

    invoke-virtual {v1}, Lm1/e;->e0()Ln1/n;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ln1/p;->i()Ln1/g;

    move-result-object v2

    invoke-virtual {v2, v0}, Ln1/f;->r(Z)V

    invoke-virtual {v1}, Lm1/e;->e0()Ln1/n;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2, v0}, Ln1/p;->x(Z)V

    invoke-virtual {v1}, Lm1/e;->e0()Ln1/n;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ln1/n;->J()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {p1}, Lm1/e;->k()V

    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {p1, v0}, Lm1/e;->F1(Z)V

    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {p1}, Lm1/e;->K()Ln1/l;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ln1/p;->i()Ln1/g;

    move-result-object p1

    invoke-virtual {p1, v0}, Ln1/f;->r(Z)V

    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {p1}, Lm1/e;->K()Ln1/l;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Ln1/p;->x(Z)V

    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {p1}, Lm1/e;->K()Ln1/l;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ln1/l;->I()V

    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {p1}, Lm1/e;->e0()Ln1/n;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ln1/p;->i()Ln1/g;

    move-result-object p1

    invoke-virtual {p1, v0}, Ln1/f;->r(Z)V

    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {p1}, Lm1/e;->e0()Ln1/n;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Ln1/p;->x(Z)V

    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {p1}, Lm1/e;->e0()Ln1/n;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ln1/n;->J()V

    invoke-virtual {p0}, Ln1/e;->c()V

    :cond_1
    iget-object p1, p0, Ln1/e;->d:Lm1/f;

    invoke-direct {p0, p1}, Ln1/e;->b(Lm1/f;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {p1, v0}, Lm1/e;->V1(I)V

    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {p1, v0}, Lm1/e;->W1(I)V

    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {p1}, Lm1/e;->K()Ln1/l;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ln1/p;->q()Ln1/f;

    move-result-object p1

    invoke-virtual {p1, v0}, Ln1/f;->k(I)V

    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {p1}, Lm1/e;->e0()Ln1/n;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ln1/p;->q()Ln1/f;

    move-result-object p1

    invoke-virtual {p1, v0}, Ln1/f;->k(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public final h(ZI)Z
    .locals 9

    .prologue
    iget-object v0, p0, Ln1/e;->a:Lm1/f;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lm1/e;->r(I)Lm1/e$b;

    move-result-object v0

    iget-object v2, p0, Ln1/e;->a:Lm1/f;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lm1/e;->r(I)Lm1/e$b;

    move-result-object v2

    iget-object v4, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {v4}, Lm1/e;->C0()I

    move-result v4

    iget-object v5, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {v5}, Lm1/e;->D0()I

    move-result v5

    if-eqz p1, :cond_4

    sget-object v6, Lm1/e$b;->D:Lm1/e$b;

    if-eq v0, v6, :cond_0

    if-ne v2, v6, :cond_4

    :cond_0
    iget-object v6, p0, Ln1/e;->e:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ln1/p;

    invoke-virtual {v7}, Ln1/p;->p()I

    move-result v8

    if-ne v8, p2, :cond_1

    invoke-virtual {v7}, Ln1/p;->D()Z

    move-result v7

    if-nez v7, :cond_1

    move p1, v1

    :cond_2
    if-nez p2, :cond_3

    if-eqz p1, :cond_4

    sget-object p1, Lm1/e$b;->D:Lm1/e$b;

    if-ne v0, p1, :cond_4

    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    sget-object v6, Lm1/e$b;->C:Lm1/e$b;

    invoke-virtual {p1, v6}, Lm1/e;->r1(Lm1/e$b;)V

    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    invoke-direct {p0, p1, v1}, Ln1/e;->e(Lm1/f;I)I

    move-result v6

    invoke-virtual {p1, v6}, Lm1/e;->U1(I)V

    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {p1}, Lm1/e;->K()Ln1/l;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ln1/p;->i()Ln1/g;

    move-result-object p1

    iget-object v6, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {v6}, Lm1/e;->B0()I

    move-result v6

    :goto_0
    invoke-virtual {p1, v6}, Ln1/g;->k(I)V

    goto :goto_1

    :cond_3
    if-eqz p1, :cond_4

    sget-object p1, Lm1/e$b;->D:Lm1/e$b;

    if-ne v2, p1, :cond_4

    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    sget-object v6, Lm1/e$b;->C:Lm1/e$b;

    invoke-virtual {p1, v6}, Lm1/e;->P1(Lm1/e$b;)V

    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    invoke-direct {p0, p1, v3}, Ln1/e;->e(Lm1/f;I)I

    move-result v6

    invoke-virtual {p1, v6}, Lm1/e;->m1(I)V

    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {p1}, Lm1/e;->e0()Ln1/n;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ln1/p;->i()Ln1/g;

    move-result-object p1

    iget-object v6, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {v6}, Lm1/e;->w()I

    move-result v6

    goto :goto_0

    :cond_4
    :goto_1
    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {p1}, Lm1/e;->N()[Lm1/e$b;

    move-result-object p1

    if-nez p2, :cond_6

    aget-object p1, p1, v1

    sget-object v5, Lm1/e$b;->C:Lm1/e$b;

    if-eq p1, v5, :cond_5

    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {p1}, Lm1/e;->N()[Lm1/e$b;

    move-result-object p1

    aget-object p1, p1, v1

    sget-object v5, Lm1/e$b;->F:Lm1/e$b;

    if-ne p1, v5, :cond_7

    :cond_5
    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {p1}, Lm1/e;->B0()I

    move-result p1

    add-int/2addr p1, v4

    iget-object v5, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {v5}, Lm1/e;->K()Ln1/l;

    move-result-object v5

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v5}, Ln1/p;->g()Ln1/f;

    move-result-object v5

    invoke-virtual {v5, p1}, Ln1/f;->k(I)V

    iget-object v5, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {v5}, Lm1/e;->K()Ln1/l;

    move-result-object v5

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v5}, Ln1/p;->i()Ln1/g;

    move-result-object v5

    sub-int/2addr p1, v4

    invoke-virtual {v5, p1}, Ln1/g;->k(I)V

    :goto_2
    move p1, v3

    goto :goto_4

    :cond_6
    aget-object p1, p1, v3

    sget-object v4, Lm1/e$b;->C:Lm1/e$b;

    if-eq p1, v4, :cond_8

    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {p1}, Lm1/e;->N()[Lm1/e$b;

    move-result-object p1

    aget-object p1, p1, v3

    sget-object v4, Lm1/e$b;->F:Lm1/e$b;

    if-ne p1, v4, :cond_7

    goto :goto_3

    :cond_7
    move p1, v1

    goto :goto_4

    :cond_8
    :goto_3
    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {p1}, Lm1/e;->w()I

    move-result p1

    add-int/2addr p1, v5

    iget-object v4, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {v4}, Lm1/e;->e0()Ln1/n;

    move-result-object v4

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ln1/p;->g()Ln1/f;

    move-result-object v4

    invoke-virtual {v4, p1}, Ln1/f;->k(I)V

    iget-object v4, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {v4}, Lm1/e;->e0()Ln1/n;

    move-result-object v4

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ln1/p;->i()Ln1/g;

    move-result-object v4

    sub-int/2addr p1, v5

    invoke-virtual {v4, p1}, Ln1/g;->k(I)V

    goto :goto_2

    :goto_4
    invoke-virtual {p0}, Ln1/e;->l()V

    iget-object v4, p0, Ln1/e;->e:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ln1/p;

    invoke-virtual {v5}, Ln1/p;->p()I

    move-result v6

    if-eq v6, p2, :cond_9

    goto :goto_5

    :cond_9
    invoke-virtual {v5}, Ln1/p;->n()Lm1/e;

    move-result-object v6

    iget-object v7, p0, Ln1/e;->a:Lm1/f;

    invoke-static {v6, v7}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-virtual {v5}, Ln1/p;->k()Z

    move-result v6

    if-nez v6, :cond_a

    goto :goto_5

    :cond_a
    invoke-virtual {v5}, Ln1/p;->e()V

    goto :goto_5

    :cond_b
    iget-object v4, p0, Ln1/e;->e:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_c
    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ln1/p;

    invoke-virtual {v5}, Ln1/p;->p()I

    move-result v6

    if-eq v6, p2, :cond_d

    goto :goto_6

    :cond_d
    if-nez p1, :cond_e

    invoke-virtual {v5}, Ln1/p;->n()Lm1/e;

    move-result-object v6

    iget-object v7, p0, Ln1/e;->a:Lm1/f;

    invoke-static {v6, v7}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e

    goto :goto_6

    :cond_e
    invoke-virtual {v5}, Ln1/p;->q()Ln1/f;

    move-result-object v6

    invoke-virtual {v6}, Ln1/f;->i()Z

    move-result v6

    if-nez v6, :cond_f

    goto :goto_7

    :cond_f
    invoke-virtual {v5}, Ln1/p;->g()Ln1/f;

    move-result-object v6

    invoke-virtual {v6}, Ln1/f;->i()Z

    move-result v6

    if-nez v6, :cond_10

    goto :goto_7

    :cond_10
    instance-of v6, v5, Ln1/c;

    if-nez v6, :cond_c

    invoke-virtual {v5}, Ln1/p;->i()Ln1/g;

    move-result-object v5

    invoke-virtual {v5}, Ln1/f;->i()Z

    move-result v5

    if-nez v5, :cond_c

    goto :goto_7

    :cond_11
    move v1, v3

    :goto_7
    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lm1/e;->r1(Lm1/e$b;)V

    iget-object p1, p0, Ln1/e;->a:Lm1/f;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, v2}, Lm1/e;->P1(Lm1/e$b;)V

    return v1
.end method

.method public final j()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ln1/e;->b:Z

    return-void
.end method

.method public final l()V
    .locals 11

    .prologue
    iget-object v0, p0, Ln1/e;->a:Lm1/f;

    invoke-virtual {v0}, Lm1/m;->d2()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm1/e;

    invoke-virtual {v1}, Lm1/e;->k0()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lm1/e;->N()[Lm1/e$b;

    move-result-object v2

    const/4 v3, 0x0

    aget-object v8, v2, v3

    invoke-virtual {v1}, Lm1/e;->N()[Lm1/e$b;

    move-result-object v2

    const/4 v9, 0x1

    aget-object v10, v2, v9

    invoke-virtual {v1}, Lm1/e;->Q()I

    move-result v2

    invoke-virtual {v1}, Lm1/e;->P()I

    move-result v4

    sget-object v6, Lm1/e$b;->D:Lm1/e$b;

    if-eq v8, v6, :cond_3

    sget-object v5, Lm1/e$b;->E:Lm1/e$b;

    if-ne v8, v5, :cond_2

    if-ne v2, v9, :cond_2

    goto :goto_1

    :cond_2
    move v2, v3

    goto :goto_2

    :cond_3
    :goto_1
    move v2, v9

    :goto_2
    if-eq v10, v6, :cond_4

    sget-object v5, Lm1/e$b;->E:Lm1/e$b;

    if-ne v10, v5, :cond_5

    if-ne v4, v9, :cond_5

    :cond_4
    move v3, v9

    :cond_5
    invoke-virtual {v1}, Lm1/e;->K()Ln1/l;

    move-result-object v4

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ln1/p;->i()Ln1/g;

    move-result-object v4

    invoke-virtual {v4}, Ln1/f;->i()Z

    move-result v4

    invoke-virtual {v1}, Lm1/e;->e0()Ln1/n;

    move-result-object v5

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v5}, Ln1/p;->i()Ln1/g;

    move-result-object v5

    invoke-virtual {v5}, Ln1/f;->i()Z

    move-result v5

    if-eqz v4, :cond_6

    if-eqz v5, :cond_6

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    sget-object v6, Lm1/e$b;->C:Lm1/e$b;

    invoke-virtual {v1}, Lm1/e;->K()Ln1/l;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ln1/p;->i()Ln1/g;

    move-result-object v2

    invoke-virtual {v2}, Ln1/f;->j()I

    move-result v5

    invoke-virtual {v1}, Lm1/e;->e0()Ln1/n;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ln1/p;->i()Ln1/g;

    move-result-object v2

    invoke-virtual {v2}, Ln1/f;->j()I

    move-result v7

    move-object v2, p0

    move-object v3, v1

    move-object v4, v6

    invoke-direct/range {v2 .. v7}, Ln1/e;->k(Lm1/e;Lm1/e$b;ILm1/e$b;I)V

    :goto_3
    invoke-virtual {v1, v9}, Lm1/e;->F1(Z)V

    goto/16 :goto_6

    :cond_6
    if-eqz v4, :cond_8

    if-eqz v3, :cond_8

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    sget-object v4, Lm1/e$b;->C:Lm1/e$b;

    invoke-virtual {v1}, Lm1/e;->K()Ln1/l;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ln1/p;->i()Ln1/g;

    move-result-object v2

    invoke-virtual {v2}, Ln1/f;->j()I

    move-result v5

    invoke-virtual {v1}, Lm1/e;->e0()Ln1/n;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ln1/p;->i()Ln1/g;

    move-result-object v2

    invoke-virtual {v2}, Ln1/f;->j()I

    move-result v7

    move-object v2, p0

    move-object v3, v1

    invoke-direct/range {v2 .. v7}, Ln1/e;->k(Lm1/e;Lm1/e$b;ILm1/e$b;I)V

    sget-object v2, Lm1/e$b;->E:Lm1/e$b;

    if-ne v10, v2, :cond_7

    invoke-virtual {v1}, Lm1/e;->e0()Ln1/n;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ln1/p;->i()Ln1/g;

    move-result-object v2

    invoke-virtual {v1}, Lm1/e;->w()I

    move-result v3

    :goto_4
    invoke-virtual {v2, v3}, Ln1/g;->v(I)V

    goto :goto_6

    :cond_7
    invoke-virtual {v1}, Lm1/e;->e0()Ln1/n;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ln1/p;->i()Ln1/g;

    move-result-object v2

    invoke-virtual {v1}, Lm1/e;->w()I

    move-result v3

    :goto_5
    invoke-virtual {v2, v3}, Ln1/g;->k(I)V

    goto :goto_3

    :cond_8
    if-eqz v5, :cond_a

    if-eqz v2, :cond_a

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lm1/e;->K()Ln1/l;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ln1/p;->i()Ln1/g;

    move-result-object v2

    invoke-virtual {v2}, Ln1/f;->j()I

    move-result v5

    sget-object v7, Lm1/e$b;->C:Lm1/e$b;

    invoke-virtual {v1}, Lm1/e;->e0()Ln1/n;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ln1/p;->i()Ln1/g;

    move-result-object v2

    invoke-virtual {v2}, Ln1/f;->j()I

    move-result v10

    move-object v2, p0

    move-object v3, v1

    move-object v4, v6

    move-object v6, v7

    move v7, v10

    invoke-direct/range {v2 .. v7}, Ln1/e;->k(Lm1/e;Lm1/e$b;ILm1/e$b;I)V

    sget-object v2, Lm1/e$b;->E:Lm1/e$b;

    if-ne v8, v2, :cond_9

    invoke-virtual {v1}, Lm1/e;->K()Ln1/l;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ln1/p;->i()Ln1/g;

    move-result-object v2

    invoke-virtual {v1}, Lm1/e;->B0()I

    move-result v3

    goto :goto_4

    :cond_9
    invoke-virtual {v1}, Lm1/e;->K()Ln1/l;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ln1/p;->i()Ln1/g;

    move-result-object v2

    invoke-virtual {v1}, Lm1/e;->B0()I

    move-result v3

    goto :goto_5

    :cond_a
    :goto_6
    invoke-virtual {v1}, Lm1/e;->k0()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lm1/e;->e0()Ln1/n;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ln1/n;->I()Ln1/g;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lm1/e;->e0()Ln1/n;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ln1/n;->I()Ln1/g;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lm1/e;->m()I

    move-result v1

    invoke-virtual {v2, v1}, Ln1/g;->k(I)V

    goto/16 :goto_0

    :cond_b
    return-void
.end method

.method public final m(Ln1/b$c;)V
    .locals 0

    iput-object p1, p0, Ln1/e;->g:Ln1/b$c;

    return-void
.end method
