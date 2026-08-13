.class public final Li8/c;
.super Lp8/i$d;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li8/c$b;,
        Li8/c$c;
    }
.end annotation


# static fields
.field private static final m0:Li8/c;

.field public static n0:Lp8/r;


# instance fields
.field private final E:Lp8/d;

.field private F:I

.field private G:I

.field private H:I

.field private I:I

.field private J:Ljava/util/List;

.field private K:Ljava/util/List;

.field private L:Ljava/util/List;

.field private M:I

.field private N:Ljava/util/List;

.field private O:I

.field private P:Ljava/util/List;

.field private Q:Ljava/util/List;

.field private R:I

.field private S:Ljava/util/List;

.field private T:Ljava/util/List;

.field private U:Ljava/util/List;

.field private V:Ljava/util/List;

.field private W:Ljava/util/List;

.field private X:Ljava/util/List;

.field private Y:I

.field private Z:I

.field private a0:Li8/q;

.field private b0:I

.field private c0:Ljava/util/List;

.field private d0:I

.field private e0:Ljava/util/List;

.field private f0:Ljava/util/List;

.field private g0:I

.field private h0:Li8/t;

.field private i0:Ljava/util/List;

.field private j0:Li8/w;

.field private k0:B

.field private l0:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li8/c$a;

    invoke-direct {v0}, Li8/c$a;-><init>()V

    sput-object v0, Li8/c;->n0:Lp8/r;

    new-instance v0, Li8/c;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Li8/c;-><init>(Z)V

    sput-object v0, Li8/c;->m0:Li8/c;

    invoke-direct {v0}, Li8/c;->t1()V

    return-void
.end method

.method private constructor <init>(Lp8/e;Lp8/g;)V
    .locals 17

    .prologue
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    invoke-direct/range {p0 .. p0}, Lp8/i$d;-><init>()V

    const/4 v4, -0x1

    iput v4, v1, Li8/c;->M:I

    iput v4, v1, Li8/c;->O:I

    iput v4, v1, Li8/c;->R:I

    iput v4, v1, Li8/c;->Y:I

    iput v4, v1, Li8/c;->d0:I

    iput v4, v1, Li8/c;->g0:I

    iput-byte v4, v1, Li8/c;->k0:B

    iput v4, v1, Li8/c;->l0:I

    invoke-direct/range {p0 .. p0}, Li8/c;->t1()V

    invoke-static {}, Lp8/d;->M()Lp8/d$b;

    move-result-object v4

    const/4 v5, 0x1

    invoke-static {v4, v5}, Lp8/f;->I(Ljava/io/OutputStream;I)Lp8/f;

    move-result-object v6

    const/4 v7, 0x0

    move v8, v7

    :goto_0
    const/high16 v14, 0x80000

    const/high16 v11, 0x40000

    const/high16 v12, 0x100000

    const/high16 v13, 0x400000

    const/16 v5, 0x80

    const/16 v9, 0x40

    if-nez v7, :cond_30

    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lp8/e;->J()I

    move-result v15

    const/16 v16, 0x0

    sparse-switch v15, :sswitch_data_0

    invoke-virtual {v1, v2, v6, v3, v15}, Lp8/i$d;->p(Lp8/e;Lp8/f;Lp8/g;I)Z

    move-result v5

    if-nez v5, :cond_0

    const/4 v7, 0x1

    :cond_0
    :goto_1
    const/4 v10, 0x1

    goto/16 :goto_a

    :catchall_0
    move-exception v0

    move-object v2, v0

    goto/16 :goto_d

    :catch_0
    move-exception v0

    move-object v2, v0

    goto/16 :goto_b

    :catch_1
    move-exception v0

    move-object v2, v0

    goto/16 :goto_c

    :sswitch_0
    iget v15, v1, Li8/c;->F:I

    and-int/2addr v15, v5

    if-ne v15, v5, :cond_1

    iget-object v15, v1, Li8/c;->j0:Li8/w;

    invoke-virtual {v15}, Li8/w;->B()Li8/w$b;

    move-result-object v16

    :cond_1
    move-object/from16 v15, v16

    sget-object v10, Li8/w;->I:Lp8/r;

    invoke-virtual {v2, v10, v3}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v10

    check-cast v10, Li8/w;

    iput-object v10, v1, Li8/c;->j0:Li8/w;

    if-eqz v15, :cond_2

    invoke-virtual {v15, v10}, Li8/w$b;->w(Li8/w;)Li8/w$b;

    invoke-virtual {v15}, Li8/w$b;->q()Li8/w;

    move-result-object v10

    iput-object v10, v1, Li8/c;->j0:Li8/w;

    :cond_2
    iget v10, v1, Li8/c;->F:I

    or-int/2addr v10, v5

    iput v10, v1, Li8/c;->F:I

    goto :goto_1

    :sswitch_1
    invoke-virtual/range {p1 .. p1}, Lp8/e;->z()I

    move-result v10

    invoke-virtual {v2, v10}, Lp8/e;->i(I)I

    move-result v10

    and-int v15, v8, v13

    if-eq v15, v13, :cond_3

    invoke-virtual/range {p1 .. p1}, Lp8/e;->e()I

    move-result v15

    if-lez v15, :cond_3

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    iput-object v15, v1, Li8/c;->i0:Ljava/util/List;

    or-int/2addr v8, v13

    :cond_3
    :goto_2
    invoke-virtual/range {p1 .. p1}, Lp8/e;->e()I

    move-result v15

    if-lez v15, :cond_4

    iget-object v15, v1, Li8/c;->i0:Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, Lp8/e;->r()I

    move-result v16

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v15, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/16 v5, 0x80

    goto :goto_2

    :cond_4
    invoke-virtual {v2, v10}, Lp8/e;->h(I)V

    goto :goto_1

    :sswitch_2
    and-int v5, v8, v13

    if-eq v5, v13, :cond_5

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, v1, Li8/c;->i0:Ljava/util/List;

    or-int/2addr v8, v13

    :cond_5
    iget-object v5, v1, Li8/c;->i0:Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, Lp8/e;->r()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    :goto_3
    invoke-interface {v5, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :sswitch_3
    iget v5, v1, Li8/c;->F:I

    and-int/2addr v5, v9

    if-ne v5, v9, :cond_6

    iget-object v5, v1, Li8/c;->h0:Li8/t;

    invoke-virtual {v5}, Li8/t;->G()Li8/t$b;

    move-result-object v16

    :cond_6
    move-object/from16 v5, v16

    sget-object v10, Li8/t;->K:Lp8/r;

    invoke-virtual {v2, v10, v3}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v10

    check-cast v10, Li8/t;

    iput-object v10, v1, Li8/c;->h0:Li8/t;

    if-eqz v5, :cond_7

    invoke-virtual {v5, v10}, Li8/t$b;->w(Li8/t;)Li8/t$b;

    invoke-virtual {v5}, Li8/t$b;->q()Li8/t;

    move-result-object v5

    iput-object v5, v1, Li8/c;->h0:Li8/t;

    :cond_7
    iget v5, v1, Li8/c;->F:I

    or-int/2addr v5, v9

    iput v5, v1, Li8/c;->F:I

    goto/16 :goto_1

    :sswitch_4
    invoke-virtual/range {p1 .. p1}, Lp8/e;->z()I

    move-result v5

    invoke-virtual {v2, v5}, Lp8/e;->i(I)I

    move-result v5

    and-int v10, v8, v12

    if-eq v10, v12, :cond_8

    invoke-virtual/range {p1 .. p1}, Lp8/e;->e()I

    move-result v10

    if-lez v10, :cond_8

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iput-object v10, v1, Li8/c;->f0:Ljava/util/List;

    or-int/2addr v8, v12

    :cond_8
    :goto_4
    invoke-virtual/range {p1 .. p1}, Lp8/e;->e()I

    move-result v10

    if-lez v10, :cond_9

    iget-object v10, v1, Li8/c;->f0:Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, Lp8/e;->r()I

    move-result v15

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-interface {v10, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_9
    invoke-virtual {v2, v5}, Lp8/e;->h(I)V

    goto/16 :goto_1

    :sswitch_5
    and-int v5, v8, v12

    if-eq v5, v12, :cond_a

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, v1, Li8/c;->f0:Ljava/util/List;

    or-int/2addr v8, v12

    :cond_a
    iget-object v5, v1, Li8/c;->f0:Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, Lp8/e;->r()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    goto :goto_3

    :sswitch_6
    and-int v5, v8, v14

    if-eq v5, v14, :cond_b

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, v1, Li8/c;->e0:Ljava/util/List;

    or-int/2addr v8, v14

    :cond_b
    iget-object v5, v1, Li8/c;->e0:Ljava/util/List;

    sget-object v10, Li8/q;->X:Lp8/r;

    invoke-virtual {v2, v10, v3}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v10

    goto/16 :goto_3

    :sswitch_7
    invoke-virtual/range {p1 .. p1}, Lp8/e;->z()I

    move-result v5

    invoke-virtual {v2, v5}, Lp8/e;->i(I)I

    move-result v5

    and-int v10, v8, v11

    if-eq v10, v11, :cond_c

    invoke-virtual/range {p1 .. p1}, Lp8/e;->e()I

    move-result v10

    if-lez v10, :cond_c

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iput-object v10, v1, Li8/c;->c0:Ljava/util/List;

    or-int/2addr v8, v11

    :cond_c
    :goto_5
    invoke-virtual/range {p1 .. p1}, Lp8/e;->e()I

    move-result v10

    if-lez v10, :cond_9

    iget-object v10, v1, Li8/c;->c0:Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, Lp8/e;->r()I

    move-result v15

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-interface {v10, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :sswitch_8
    and-int v5, v8, v11

    if-eq v5, v11, :cond_d

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, v1, Li8/c;->c0:Ljava/util/List;

    or-int/2addr v8, v11

    :cond_d
    iget-object v5, v1, Li8/c;->c0:Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, Lp8/e;->r()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    goto/16 :goto_3

    :sswitch_9
    invoke-virtual/range {p1 .. p1}, Lp8/e;->z()I

    move-result v5

    invoke-virtual {v2, v5}, Lp8/e;->i(I)I

    move-result v5

    and-int/lit16 v10, v8, 0x100

    const/16 v15, 0x100

    if-eq v10, v15, :cond_e

    invoke-virtual/range {p1 .. p1}, Lp8/e;->e()I

    move-result v10

    if-lez v10, :cond_e

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iput-object v10, v1, Li8/c;->Q:Ljava/util/List;

    or-int/lit16 v8, v8, 0x100

    :cond_e
    :goto_6
    invoke-virtual/range {p1 .. p1}, Lp8/e;->e()I

    move-result v10

    if-lez v10, :cond_9

    iget-object v10, v1, Li8/c;->Q:Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, Lp8/e;->r()I

    move-result v15

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-interface {v10, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :sswitch_a
    and-int/lit16 v5, v8, 0x100

    const/16 v10, 0x100

    if-eq v5, v10, :cond_f

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, v1, Li8/c;->Q:Ljava/util/List;

    or-int/lit16 v8, v8, 0x100

    :cond_f
    iget-object v5, v1, Li8/c;->Q:Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, Lp8/e;->r()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    goto/16 :goto_3

    :sswitch_b
    and-int/lit16 v5, v8, 0x80

    const/16 v10, 0x80

    if-eq v5, v10, :cond_10

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, v1, Li8/c;->P:Ljava/util/List;

    or-int/lit16 v8, v8, 0x80

    :cond_10
    iget-object v5, v1, Li8/c;->P:Ljava/util/List;

    sget-object v10, Li8/q;->X:Lp8/r;

    invoke-virtual {v2, v10, v3}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v10

    goto/16 :goto_3

    :sswitch_c
    iget v5, v1, Li8/c;->F:I

    const/16 v10, 0x20

    or-int/2addr v5, v10

    iput v5, v1, Li8/c;->F:I

    invoke-virtual/range {p1 .. p1}, Lp8/e;->r()I

    move-result v5

    iput v5, v1, Li8/c;->b0:I

    goto/16 :goto_1

    :sswitch_d
    iget v5, v1, Li8/c;->F:I

    const/16 v10, 0x10

    and-int/2addr v5, v10

    if-ne v5, v10, :cond_11

    iget-object v5, v1, Li8/c;->a0:Li8/q;

    invoke-virtual {v5}, Li8/q;->B0()Li8/q$c;

    move-result-object v16

    :cond_11
    move-object/from16 v5, v16

    sget-object v10, Li8/q;->X:Lp8/r;

    invoke-virtual {v2, v10, v3}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v10

    check-cast v10, Li8/q;

    iput-object v10, v1, Li8/c;->a0:Li8/q;

    if-eqz v5, :cond_12

    invoke-virtual {v5, v10}, Li8/q$c;->C(Li8/q;)Li8/q$c;

    invoke-virtual {v5}, Li8/q$c;->v()Li8/q;

    move-result-object v5

    iput-object v5, v1, Li8/c;->a0:Li8/q;

    :cond_12
    iget v5, v1, Li8/c;->F:I

    const/16 v10, 0x10

    or-int/2addr v5, v10

    iput v5, v1, Li8/c;->F:I

    goto/16 :goto_1

    :sswitch_e
    iget v5, v1, Li8/c;->F:I

    const/16 v10, 0x8

    or-int/2addr v5, v10

    iput v5, v1, Li8/c;->F:I

    invoke-virtual/range {p1 .. p1}, Lp8/e;->r()I

    move-result v5

    iput v5, v1, Li8/c;->Z:I

    goto/16 :goto_1

    :sswitch_f
    invoke-virtual/range {p1 .. p1}, Lp8/e;->z()I

    move-result v5

    invoke-virtual {v2, v5}, Lp8/e;->i(I)I

    move-result v5

    and-int/lit16 v10, v8, 0x4000

    const/16 v15, 0x4000

    if-eq v10, v15, :cond_13

    invoke-virtual/range {p1 .. p1}, Lp8/e;->e()I

    move-result v10

    if-lez v10, :cond_13

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iput-object v10, v1, Li8/c;->X:Ljava/util/List;

    or-int/lit16 v8, v8, 0x4000

    :cond_13
    :goto_7
    invoke-virtual/range {p1 .. p1}, Lp8/e;->e()I

    move-result v10

    if-lez v10, :cond_9

    iget-object v10, v1, Li8/c;->X:Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, Lp8/e;->r()I

    move-result v15

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-interface {v10, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :sswitch_10
    and-int/lit16 v5, v8, 0x4000

    const/16 v10, 0x4000

    if-eq v5, v10, :cond_14

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, v1, Li8/c;->X:Ljava/util/List;

    or-int/lit16 v8, v8, 0x4000

    :cond_14
    iget-object v5, v1, Li8/c;->X:Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, Lp8/e;->r()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    goto/16 :goto_3

    :sswitch_11
    and-int/lit16 v5, v8, 0x2000

    const/16 v10, 0x2000

    if-eq v5, v10, :cond_15

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, v1, Li8/c;->W:Ljava/util/List;

    or-int/lit16 v8, v8, 0x2000

    :cond_15
    iget-object v5, v1, Li8/c;->W:Ljava/util/List;

    sget-object v10, Li8/g;->K:Lp8/r;

    invoke-virtual {v2, v10, v3}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v10

    goto/16 :goto_3

    :sswitch_12
    and-int/lit16 v5, v8, 0x1000

    const/16 v10, 0x1000

    if-eq v5, v10, :cond_16

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, v1, Li8/c;->V:Ljava/util/List;

    or-int/lit16 v8, v8, 0x1000

    :cond_16
    iget-object v5, v1, Li8/c;->V:Ljava/util/List;

    sget-object v10, Li8/r;->S:Lp8/r;

    invoke-virtual {v2, v10, v3}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v10

    goto/16 :goto_3

    :sswitch_13
    and-int/lit16 v5, v8, 0x800

    const/16 v10, 0x800

    if-eq v5, v10, :cond_17

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, v1, Li8/c;->U:Ljava/util/List;

    or-int/lit16 v8, v8, 0x800

    :cond_17
    iget-object v5, v1, Li8/c;->U:Ljava/util/List;

    sget-object v10, Li8/n;->Y:Lp8/r;

    invoke-virtual {v2, v10, v3}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v10

    goto/16 :goto_3

    :sswitch_14
    and-int/lit16 v5, v8, 0x400

    const/16 v10, 0x400

    if-eq v5, v10, :cond_18

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, v1, Li8/c;->T:Ljava/util/List;

    or-int/lit16 v8, v8, 0x400

    :cond_18
    iget-object v5, v1, Li8/c;->T:Ljava/util/List;

    sget-object v10, Li8/i;->Y:Lp8/r;

    invoke-virtual {v2, v10, v3}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v10

    goto/16 :goto_3

    :sswitch_15
    and-int/lit16 v5, v8, 0x200

    const/16 v10, 0x200

    if-eq v5, v10, :cond_19

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, v1, Li8/c;->S:Ljava/util/List;

    or-int/lit16 v8, v8, 0x200

    :cond_19
    iget-object v5, v1, Li8/c;->S:Ljava/util/List;

    sget-object v10, Li8/d;->M:Lp8/r;

    invoke-virtual {v2, v10, v3}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v10

    goto/16 :goto_3

    :sswitch_16
    invoke-virtual/range {p1 .. p1}, Lp8/e;->z()I

    move-result v5

    invoke-virtual {v2, v5}, Lp8/e;->i(I)I

    move-result v5

    and-int/lit8 v10, v8, 0x40

    if-eq v10, v9, :cond_1a

    invoke-virtual/range {p1 .. p1}, Lp8/e;->e()I

    move-result v10

    if-lez v10, :cond_1a

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iput-object v10, v1, Li8/c;->N:Ljava/util/List;

    or-int/lit8 v8, v8, 0x40

    :cond_1a
    :goto_8
    invoke-virtual/range {p1 .. p1}, Lp8/e;->e()I

    move-result v10

    if-lez v10, :cond_9

    iget-object v10, v1, Li8/c;->N:Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, Lp8/e;->r()I

    move-result v15

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-interface {v10, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :sswitch_17
    and-int/lit8 v5, v8, 0x40

    if-eq v5, v9, :cond_1b

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, v1, Li8/c;->N:Ljava/util/List;

    or-int/lit8 v8, v8, 0x40

    :cond_1b
    iget-object v5, v1, Li8/c;->N:Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, Lp8/e;->r()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    goto/16 :goto_3

    :sswitch_18
    and-int/lit8 v5, v8, 0x10

    const/16 v10, 0x10

    if-eq v5, v10, :cond_1c

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, v1, Li8/c;->K:Ljava/util/List;

    or-int/lit8 v8, v8, 0x10

    :cond_1c
    iget-object v5, v1, Li8/c;->K:Ljava/util/List;

    sget-object v10, Li8/q;->X:Lp8/r;

    invoke-virtual {v2, v10, v3}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v10

    goto/16 :goto_3

    :sswitch_19
    and-int/lit8 v5, v8, 0x8

    const/16 v10, 0x8

    if-eq v5, v10, :cond_1d

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, v1, Li8/c;->J:Ljava/util/List;

    or-int/lit8 v8, v8, 0x8

    :cond_1d
    iget-object v5, v1, Li8/c;->J:Ljava/util/List;

    sget-object v10, Li8/s;->Q:Lp8/r;

    invoke-virtual {v2, v10, v3}, Lp8/e;->t(Lp8/r;Lp8/g;)Lp8/p;

    move-result-object v10

    goto/16 :goto_3

    :sswitch_1a
    iget v5, v1, Li8/c;->F:I

    or-int/lit8 v5, v5, 0x4

    iput v5, v1, Li8/c;->F:I

    invoke-virtual/range {p1 .. p1}, Lp8/e;->r()I

    move-result v5

    iput v5, v1, Li8/c;->I:I

    goto/16 :goto_1

    :sswitch_1b
    iget v5, v1, Li8/c;->F:I

    or-int/lit8 v5, v5, 0x2

    iput v5, v1, Li8/c;->F:I

    invoke-virtual/range {p1 .. p1}, Lp8/e;->r()I

    move-result v5

    iput v5, v1, Li8/c;->H:I

    goto/16 :goto_1

    :sswitch_1c
    invoke-virtual/range {p1 .. p1}, Lp8/e;->z()I

    move-result v5

    invoke-virtual {v2, v5}, Lp8/e;->i(I)I

    move-result v5

    and-int/lit8 v10, v8, 0x20

    const/16 v15, 0x20

    if-eq v10, v15, :cond_1e

    invoke-virtual/range {p1 .. p1}, Lp8/e;->e()I

    move-result v10

    if-lez v10, :cond_1e

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iput-object v10, v1, Li8/c;->L:Ljava/util/List;

    or-int/lit8 v8, v8, 0x20

    :cond_1e
    :goto_9
    invoke-virtual/range {p1 .. p1}, Lp8/e;->e()I

    move-result v10

    if-lez v10, :cond_9

    iget-object v10, v1, Li8/c;->L:Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, Lp8/e;->r()I

    move-result v15

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-interface {v10, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :sswitch_1d
    and-int/lit8 v5, v8, 0x20

    const/16 v10, 0x20

    if-eq v5, v10, :cond_1f

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, v1, Li8/c;->L:Ljava/util/List;

    or-int/lit8 v8, v8, 0x20

    :cond_1f
    iget-object v5, v1, Li8/c;->L:Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, Lp8/e;->r()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    goto/16 :goto_3

    :sswitch_1e
    iget v5, v1, Li8/c;->F:I

    const/4 v10, 0x1

    or-int/2addr v5, v10

    iput v5, v1, Li8/c;->F:I

    invoke-virtual/range {p1 .. p1}, Lp8/e;->r()I

    move-result v5

    iput v5, v1, Li8/c;->G:I
    :try_end_0
    .catch Lp8/k; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_a

    :sswitch_1f
    const/4 v10, 0x1

    move v7, v10

    :goto_a
    move v5, v10

    goto/16 :goto_0

    :goto_b
    :try_start_1
    new-instance v3, Lp8/k;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Lp8/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Lp8/k;->i(Lp8/p;)Lp8/k;

    move-result-object v2

    throw v2

    :goto_c
    invoke-virtual {v2, v1}, Lp8/k;->i(Lp8/p;)Lp8/k;

    move-result-object v2

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_d
    and-int/lit8 v3, v8, 0x20

    const/16 v5, 0x20

    if-ne v3, v5, :cond_20

    iget-object v3, v1, Li8/c;->L:Ljava/util/List;

    invoke-static {v3}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v1, Li8/c;->L:Ljava/util/List;

    :cond_20
    and-int/lit8 v3, v8, 0x8

    const/16 v5, 0x8

    if-ne v3, v5, :cond_21

    iget-object v3, v1, Li8/c;->J:Ljava/util/List;

    invoke-static {v3}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v1, Li8/c;->J:Ljava/util/List;

    :cond_21
    and-int/lit8 v3, v8, 0x10

    const/16 v5, 0x10

    if-ne v3, v5, :cond_22

    iget-object v3, v1, Li8/c;->K:Ljava/util/List;

    invoke-static {v3}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v1, Li8/c;->K:Ljava/util/List;

    :cond_22
    and-int/lit8 v3, v8, 0x40

    if-ne v3, v9, :cond_23

    iget-object v3, v1, Li8/c;->N:Ljava/util/List;

    invoke-static {v3}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v1, Li8/c;->N:Ljava/util/List;

    :cond_23
    and-int/lit16 v3, v8, 0x200

    const/16 v5, 0x200

    if-ne v3, v5, :cond_24

    iget-object v3, v1, Li8/c;->S:Ljava/util/List;

    invoke-static {v3}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v1, Li8/c;->S:Ljava/util/List;

    :cond_24
    and-int/lit16 v3, v8, 0x400

    const/16 v5, 0x400

    if-ne v3, v5, :cond_25

    iget-object v3, v1, Li8/c;->T:Ljava/util/List;

    invoke-static {v3}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v1, Li8/c;->T:Ljava/util/List;

    :cond_25
    and-int/lit16 v3, v8, 0x800

    const/16 v5, 0x800

    if-ne v3, v5, :cond_26

    iget-object v3, v1, Li8/c;->U:Ljava/util/List;

    invoke-static {v3}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v1, Li8/c;->U:Ljava/util/List;

    :cond_26
    and-int/lit16 v3, v8, 0x1000

    const/16 v5, 0x1000

    if-ne v3, v5, :cond_27

    iget-object v3, v1, Li8/c;->V:Ljava/util/List;

    invoke-static {v3}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v1, Li8/c;->V:Ljava/util/List;

    :cond_27
    and-int/lit16 v3, v8, 0x2000

    const/16 v5, 0x2000

    if-ne v3, v5, :cond_28

    iget-object v3, v1, Li8/c;->W:Ljava/util/List;

    invoke-static {v3}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v1, Li8/c;->W:Ljava/util/List;

    :cond_28
    and-int/lit16 v3, v8, 0x4000

    const/16 v5, 0x4000

    if-ne v3, v5, :cond_29

    iget-object v3, v1, Li8/c;->X:Ljava/util/List;

    invoke-static {v3}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v1, Li8/c;->X:Ljava/util/List;

    :cond_29
    and-int/lit16 v3, v8, 0x80

    const/16 v5, 0x80

    if-ne v3, v5, :cond_2a

    iget-object v3, v1, Li8/c;->P:Ljava/util/List;

    invoke-static {v3}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v1, Li8/c;->P:Ljava/util/List;

    :cond_2a
    and-int/lit16 v3, v8, 0x100

    const/16 v5, 0x100

    if-ne v3, v5, :cond_2b

    iget-object v3, v1, Li8/c;->Q:Ljava/util/List;

    invoke-static {v3}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v1, Li8/c;->Q:Ljava/util/List;

    :cond_2b
    and-int v3, v8, v11

    if-ne v3, v11, :cond_2c

    iget-object v3, v1, Li8/c;->c0:Ljava/util/List;

    invoke-static {v3}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v1, Li8/c;->c0:Ljava/util/List;

    :cond_2c
    and-int v3, v8, v14

    if-ne v3, v14, :cond_2d

    iget-object v3, v1, Li8/c;->e0:Ljava/util/List;

    invoke-static {v3}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v1, Li8/c;->e0:Ljava/util/List;

    :cond_2d
    and-int v3, v8, v12

    if-ne v3, v12, :cond_2e

    iget-object v3, v1, Li8/c;->f0:Ljava/util/List;

    invoke-static {v3}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v1, Li8/c;->f0:Ljava/util/List;

    :cond_2e
    and-int v3, v8, v13

    if-ne v3, v13, :cond_2f

    iget-object v3, v1, Li8/c;->i0:Ljava/util/List;

    invoke-static {v3}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v1, Li8/c;->i0:Ljava/util/List;

    :cond_2f
    :try_start_2
    invoke-virtual {v6}, Lp8/f;->H()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catch_2
    invoke-virtual {v4}, Lp8/d$b;->o()Lp8/d;

    move-result-object v3

    iput-object v3, v1, Li8/c;->E:Lp8/d;

    goto :goto_e

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v4}, Lp8/d$b;->o()Lp8/d;

    move-result-object v3

    iput-object v3, v1, Li8/c;->E:Lp8/d;

    throw v2

    :goto_e
    invoke-virtual/range {p0 .. p0}, Lp8/i$d;->m()V

    throw v2

    :cond_30
    and-int/lit8 v2, v8, 0x20

    const/16 v3, 0x20

    if-ne v2, v3, :cond_31

    iget-object v2, v1, Li8/c;->L:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Li8/c;->L:Ljava/util/List;

    :cond_31
    and-int/lit8 v2, v8, 0x8

    const/16 v3, 0x8

    if-ne v2, v3, :cond_32

    iget-object v2, v1, Li8/c;->J:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Li8/c;->J:Ljava/util/List;

    :cond_32
    and-int/lit8 v2, v8, 0x10

    const/16 v3, 0x10

    if-ne v2, v3, :cond_33

    iget-object v2, v1, Li8/c;->K:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Li8/c;->K:Ljava/util/List;

    :cond_33
    and-int/lit8 v2, v8, 0x40

    if-ne v2, v9, :cond_34

    iget-object v2, v1, Li8/c;->N:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Li8/c;->N:Ljava/util/List;

    :cond_34
    and-int/lit16 v2, v8, 0x200

    const/16 v3, 0x200

    if-ne v2, v3, :cond_35

    iget-object v2, v1, Li8/c;->S:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Li8/c;->S:Ljava/util/List;

    :cond_35
    and-int/lit16 v2, v8, 0x400

    const/16 v3, 0x400

    if-ne v2, v3, :cond_36

    iget-object v2, v1, Li8/c;->T:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Li8/c;->T:Ljava/util/List;

    :cond_36
    and-int/lit16 v2, v8, 0x800

    const/16 v3, 0x800

    if-ne v2, v3, :cond_37

    iget-object v2, v1, Li8/c;->U:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Li8/c;->U:Ljava/util/List;

    :cond_37
    and-int/lit16 v2, v8, 0x1000

    const/16 v3, 0x1000

    if-ne v2, v3, :cond_38

    iget-object v2, v1, Li8/c;->V:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Li8/c;->V:Ljava/util/List;

    :cond_38
    and-int/lit16 v2, v8, 0x2000

    const/16 v3, 0x2000

    if-ne v2, v3, :cond_39

    iget-object v2, v1, Li8/c;->W:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Li8/c;->W:Ljava/util/List;

    :cond_39
    and-int/lit16 v2, v8, 0x4000

    const/16 v3, 0x4000

    if-ne v2, v3, :cond_3a

    iget-object v2, v1, Li8/c;->X:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Li8/c;->X:Ljava/util/List;

    :cond_3a
    and-int/lit16 v2, v8, 0x80

    const/16 v3, 0x80

    if-ne v2, v3, :cond_3b

    iget-object v2, v1, Li8/c;->P:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Li8/c;->P:Ljava/util/List;

    :cond_3b
    and-int/lit16 v2, v8, 0x100

    const/16 v3, 0x100

    if-ne v2, v3, :cond_3c

    iget-object v2, v1, Li8/c;->Q:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Li8/c;->Q:Ljava/util/List;

    :cond_3c
    and-int v2, v8, v11

    if-ne v2, v11, :cond_3d

    iget-object v2, v1, Li8/c;->c0:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Li8/c;->c0:Ljava/util/List;

    :cond_3d
    and-int v2, v8, v14

    if-ne v2, v14, :cond_3e

    iget-object v2, v1, Li8/c;->e0:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Li8/c;->e0:Ljava/util/List;

    :cond_3e
    and-int v2, v8, v12

    if-ne v2, v12, :cond_3f

    iget-object v2, v1, Li8/c;->f0:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Li8/c;->f0:Ljava/util/List;

    :cond_3f
    and-int v2, v8, v13

    if-ne v2, v13, :cond_40

    iget-object v2, v1, Li8/c;->i0:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Li8/c;->i0:Ljava/util/List;

    :cond_40
    :try_start_3
    invoke-virtual {v6}, Lp8/f;->H()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catch_3
    invoke-virtual {v4}, Lp8/d$b;->o()Lp8/d;

    move-result-object v2

    iput-object v2, v1, Li8/c;->E:Lp8/d;

    goto :goto_f

    :catchall_2
    move-exception v0

    move-object v2, v0

    invoke-virtual {v4}, Lp8/d$b;->o()Lp8/d;

    move-result-object v3

    iput-object v3, v1, Li8/c;->E:Lp8/d;

    throw v2

    :goto_f
    invoke-virtual/range {p0 .. p0}, Lp8/i$d;->m()V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1f
        0x8 -> :sswitch_1e
        0x10 -> :sswitch_1d
        0x12 -> :sswitch_1c
        0x18 -> :sswitch_1b
        0x20 -> :sswitch_1a
        0x2a -> :sswitch_19
        0x32 -> :sswitch_18
        0x38 -> :sswitch_17
        0x3a -> :sswitch_16
        0x42 -> :sswitch_15
        0x4a -> :sswitch_14
        0x52 -> :sswitch_13
        0x5a -> :sswitch_12
        0x6a -> :sswitch_11
        0x80 -> :sswitch_10
        0x82 -> :sswitch_f
        0x88 -> :sswitch_e
        0x92 -> :sswitch_d
        0x98 -> :sswitch_c
        0xa2 -> :sswitch_b
        0xa8 -> :sswitch_a
        0xaa -> :sswitch_9
        0xb0 -> :sswitch_8
        0xb2 -> :sswitch_7
        0xba -> :sswitch_6
        0xc0 -> :sswitch_5
        0xc2 -> :sswitch_4
        0xf2 -> :sswitch_3
        0xf8 -> :sswitch_2
        0xfa -> :sswitch_1
        0x102 -> :sswitch_0
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lp8/e;Lp8/g;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Li8/c;-><init>(Lp8/e;Lp8/g;)V

    return-void
.end method

.method private constructor <init>(Lp8/i$c;)V
    .locals 1

    invoke-direct {p0, p1}, Lp8/i$d;-><init>(Lp8/i$c;)V

    const/4 v0, -0x1

    iput v0, p0, Li8/c;->M:I

    iput v0, p0, Li8/c;->O:I

    iput v0, p0, Li8/c;->R:I

    iput v0, p0, Li8/c;->Y:I

    iput v0, p0, Li8/c;->d0:I

    iput v0, p0, Li8/c;->g0:I

    iput-byte v0, p0, Li8/c;->k0:B

    iput v0, p0, Li8/c;->l0:I

    invoke-virtual {p1}, Lp8/i$b;->k()Lp8/d;

    move-result-object p1

    iput-object p1, p0, Li8/c;->E:Lp8/d;

    return-void
.end method

.method synthetic constructor <init>(Lp8/i$c;Li8/a;)V
    .locals 0

    invoke-direct {p0, p1}, Li8/c;-><init>(Lp8/i$c;)V

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Lp8/i$d;-><init>()V

    const/4 p1, -0x1

    iput p1, p0, Li8/c;->M:I

    iput p1, p0, Li8/c;->O:I

    iput p1, p0, Li8/c;->R:I

    iput p1, p0, Li8/c;->Y:I

    iput p1, p0, Li8/c;->d0:I

    iput p1, p0, Li8/c;->g0:I

    iput-byte p1, p0, Li8/c;->k0:B

    iput p1, p0, Li8/c;->l0:I

    sget-object p1, Lp8/d;->C:Lp8/d;

    iput-object p1, p0, Li8/c;->E:Lp8/d;

    return-void
.end method

.method static synthetic A(Li8/c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/c;->U:Ljava/util/List;

    return-object p0
.end method

.method static synthetic B(Li8/c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/c;->U:Ljava/util/List;

    return-object p1
.end method

.method static synthetic C(Li8/c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/c;->V:Ljava/util/List;

    return-object p0
.end method

.method static synthetic D(Li8/c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/c;->V:Ljava/util/List;

    return-object p1
.end method

.method static synthetic E(Li8/c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/c;->W:Ljava/util/List;

    return-object p0
.end method

.method static synthetic F(Li8/c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/c;->W:Ljava/util/List;

    return-object p1
.end method

.method static synthetic G(Li8/c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/c;->X:Ljava/util/List;

    return-object p0
.end method

.method static synthetic H(Li8/c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/c;->X:Ljava/util/List;

    return-object p1
.end method

.method static synthetic I(Li8/c;I)I
    .locals 0

    iput p1, p0, Li8/c;->Z:I

    return p1
.end method

.method static synthetic J(Li8/c;Li8/q;)Li8/q;
    .locals 0

    iput-object p1, p0, Li8/c;->a0:Li8/q;

    return-object p1
.end method

.method static synthetic K(Li8/c;I)I
    .locals 0

    iput p1, p0, Li8/c;->b0:I

    return p1
.end method

.method static synthetic L(Li8/c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/c;->c0:Ljava/util/List;

    return-object p0
.end method

.method static synthetic M(Li8/c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/c;->c0:Ljava/util/List;

    return-object p1
.end method

.method static synthetic N(Li8/c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/c;->e0:Ljava/util/List;

    return-object p0
.end method

.method static synthetic O(Li8/c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/c;->e0:Ljava/util/List;

    return-object p1
.end method

.method static synthetic P(Li8/c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/c;->f0:Ljava/util/List;

    return-object p0
.end method

.method static synthetic Q(Li8/c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/c;->f0:Ljava/util/List;

    return-object p1
.end method

.method static synthetic R(Li8/c;Li8/t;)Li8/t;
    .locals 0

    iput-object p1, p0, Li8/c;->h0:Li8/t;

    return-object p1
.end method

.method static synthetic S(Li8/c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/c;->i0:Ljava/util/List;

    return-object p0
.end method

.method static synthetic T(Li8/c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/c;->i0:Ljava/util/List;

    return-object p1
.end method

.method static synthetic U(Li8/c;Li8/w;)Li8/w;
    .locals 0

    iput-object p1, p0, Li8/c;->j0:Li8/w;

    return-object p1
.end method

.method static synthetic V(Li8/c;I)I
    .locals 0

    iput p1, p0, Li8/c;->F:I

    return p1
.end method

.method static synthetic W(Li8/c;)Lp8/d;
    .locals 0

    iget-object p0, p0, Li8/c;->E:Lp8/d;

    return-object p0
.end method

.method static synthetic X(Li8/c;I)I
    .locals 0

    iput p1, p0, Li8/c;->G:I

    return p1
.end method

.method static synthetic Y(Li8/c;I)I
    .locals 0

    iput p1, p0, Li8/c;->H:I

    return p1
.end method

.method static synthetic Z(Li8/c;I)I
    .locals 0

    iput p1, p0, Li8/c;->I:I

    return p1
.end method

.method static synthetic a0(Li8/c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/c;->J:Ljava/util/List;

    return-object p0
.end method

.method static synthetic b0(Li8/c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/c;->J:Ljava/util/List;

    return-object p1
.end method

.method static synthetic c0(Li8/c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/c;->K:Ljava/util/List;

    return-object p0
.end method

.method static synthetic d0(Li8/c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/c;->K:Ljava/util/List;

    return-object p1
.end method

.method static synthetic e0(Li8/c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/c;->L:Ljava/util/List;

    return-object p0
.end method

.method static synthetic f0(Li8/c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/c;->L:Ljava/util/List;

    return-object p1
.end method

.method static synthetic h0(Li8/c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/c;->N:Ljava/util/List;

    return-object p0
.end method

.method static synthetic i0(Li8/c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/c;->N:Ljava/util/List;

    return-object p1
.end method

.method static synthetic j0(Li8/c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/c;->P:Ljava/util/List;

    return-object p0
.end method

.method static synthetic k0(Li8/c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/c;->P:Ljava/util/List;

    return-object p1
.end method

.method static synthetic l0(Li8/c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/c;->Q:Ljava/util/List;

    return-object p0
.end method

.method static synthetic m0(Li8/c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/c;->Q:Ljava/util/List;

    return-object p1
.end method

.method static synthetic n0(Li8/c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/c;->S:Ljava/util/List;

    return-object p0
.end method

.method static synthetic o0(Li8/c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/c;->S:Ljava/util/List;

    return-object p1
.end method

.method static synthetic p0(Li8/c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li8/c;->T:Ljava/util/List;

    return-object p0
.end method

.method static synthetic q0(Li8/c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Li8/c;->T:Ljava/util/List;

    return-object p1
.end method

.method private t1()V
    .locals 2

    const/4 v0, 0x6

    iput v0, p0, Li8/c;->G:I

    const/4 v0, 0x0

    iput v0, p0, Li8/c;->H:I

    iput v0, p0, Li8/c;->I:I

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Li8/c;->J:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Li8/c;->K:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Li8/c;->L:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Li8/c;->N:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Li8/c;->P:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Li8/c;->Q:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Li8/c;->S:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Li8/c;->T:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Li8/c;->U:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Li8/c;->V:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Li8/c;->W:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Li8/c;->X:Ljava/util/List;

    iput v0, p0, Li8/c;->Z:I

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v1

    iput-object v1, p0, Li8/c;->a0:Li8/q;

    iput v0, p0, Li8/c;->b0:I

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/c;->c0:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/c;->e0:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/c;->f0:Ljava/util/List;

    invoke-static {}, Li8/t;->w()Li8/t;

    move-result-object v0

    iput-object v0, p0, Li8/c;->h0:Li8/t;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/c;->i0:Ljava/util/List;

    invoke-static {}, Li8/w;->u()Li8/w;

    move-result-object v0

    iput-object v0, p0, Li8/c;->j0:Li8/w;

    return-void
.end method

.method public static u1()Li8/c$b;
    .locals 1

    invoke-static {}, Li8/c$b;->t()Li8/c$b;

    move-result-object v0

    return-object v0
.end method

.method public static v1(Li8/c;)Li8/c$b;
    .locals 1

    invoke-static {}, Li8/c;->u1()Li8/c$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Li8/c$b;->S(Li8/c;)Li8/c$b;

    move-result-object p0

    return-object p0
.end method

.method public static x1(Ljava/io/InputStream;Lp8/g;)Li8/c;
    .locals 1

    sget-object v0, Li8/c;->n0:Lp8/r;

    invoke-interface {v0, p0, p1}, Lp8/r;->c(Ljava/io/InputStream;Lp8/g;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Li8/c;

    return-object p0
.end method

.method public static z0()Li8/c;
    .locals 1

    sget-object v0, Li8/c;->m0:Li8/c;

    return-object v0
.end method


# virtual methods
.method public A0()Li8/c;
    .locals 1

    sget-object v0, Li8/c;->m0:Li8/c;

    return-object v0
.end method

.method public B0(I)Li8/g;
    .locals 1

    iget-object v0, p0, Li8/c;->W:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/g;

    return-object p1
.end method

.method public C0()I
    .locals 1

    iget-object v0, p0, Li8/c;->W:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public D0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/c;->W:Ljava/util/List;

    return-object v0
.end method

.method public E0()I
    .locals 1

    iget v0, p0, Li8/c;->G:I

    return v0
.end method

.method public F0()I
    .locals 1

    iget v0, p0, Li8/c;->H:I

    return v0
.end method

.method public G0(I)Li8/i;
    .locals 1

    iget-object v0, p0, Li8/c;->T:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/i;

    return-object p1
.end method

.method public H0()I
    .locals 1

    iget-object v0, p0, Li8/c;->T:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public I0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/c;->T:Ljava/util/List;

    return-object v0
.end method

.method public J0()I
    .locals 1

    iget v0, p0, Li8/c;->Z:I

    return v0
.end method

.method public K0()Li8/q;
    .locals 1

    iget-object v0, p0, Li8/c;->a0:Li8/q;

    return-object v0
.end method

.method public L0()I
    .locals 1

    iget v0, p0, Li8/c;->b0:I

    return v0
.end method

.method public M0()I
    .locals 1

    iget-object v0, p0, Li8/c;->c0:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public N0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/c;->c0:Ljava/util/List;

    return-object v0
.end method

.method public O0(I)Li8/q;
    .locals 1

    iget-object v0, p0, Li8/c;->e0:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/q;

    return-object p1
.end method

.method public P0()I
    .locals 1

    iget-object v0, p0, Li8/c;->e0:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public Q0()I
    .locals 1

    iget-object v0, p0, Li8/c;->f0:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public R0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/c;->f0:Ljava/util/List;

    return-object v0
.end method

.method public S0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/c;->e0:Ljava/util/List;

    return-object v0
.end method

.method public T0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/c;->N:Ljava/util/List;

    return-object v0
.end method

.method public U0(I)Li8/n;
    .locals 1

    iget-object v0, p0, Li8/c;->U:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/n;

    return-object p1
.end method

.method public V0()I
    .locals 1

    iget-object v0, p0, Li8/c;->U:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public W0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/c;->U:Ljava/util/List;

    return-object v0
.end method

.method public X0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/c;->X:Ljava/util/List;

    return-object v0
.end method

.method public Y0(I)Li8/q;
    .locals 1

    iget-object v0, p0, Li8/c;->K:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/q;

    return-object p1
.end method

.method public Z0()I
    .locals 1

    iget-object v0, p0, Li8/c;->K:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic a()Lp8/p;
    .locals 1

    invoke-virtual {p0}, Li8/c;->A0()Li8/c;

    move-result-object v0

    return-object v0
.end method

.method public a1()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/c;->L:Ljava/util/List;

    return-object v0
.end method

.method public b()I
    .locals 7

    .prologue
    iget v0, p0, Li8/c;->l0:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, Li8/c;->F:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    iget v0, p0, Li8/c;->G:I

    invoke-static {v1, v0}, Lp8/f;->o(II)I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    move v1, v2

    move v3, v1

    :goto_1
    iget-object v4, p0, Li8/c;->L:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v1, v4, :cond_2

    iget-object v4, p0, Li8/c;->L:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v4}, Lp8/f;->p(I)I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    add-int/2addr v0, v3

    invoke-virtual {p0}, Li8/c;->a1()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    add-int/lit8 v0, v0, 0x1

    invoke-static {v3}, Lp8/f;->p(I)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    iput v3, p0, Li8/c;->M:I

    iget v1, p0, Li8/c;->F:I

    const/4 v3, 0x2

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_4

    const/4 v1, 0x3

    iget v4, p0, Li8/c;->H:I

    invoke-static {v1, v4}, Lp8/f;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget v1, p0, Li8/c;->F:I

    const/4 v4, 0x4

    and-int/2addr v1, v4

    if-ne v1, v4, :cond_5

    iget v1, p0, Li8/c;->I:I

    invoke-static {v4, v1}, Lp8/f;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_5
    move v1, v2

    :goto_2
    iget-object v4, p0, Li8/c;->J:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v1, v4, :cond_6

    iget-object v4, p0, Li8/c;->J:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp8/p;

    const/4 v5, 0x5

    invoke-static {v5, v4}, Lp8/f;->r(ILp8/p;)I

    move-result v4

    add-int/2addr v0, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_6
    move v1, v2

    :goto_3
    iget-object v4, p0, Li8/c;->K:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v1, v4, :cond_7

    iget-object v4, p0, Li8/c;->K:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp8/p;

    const/4 v5, 0x6

    invoke-static {v5, v4}, Lp8/f;->r(ILp8/p;)I

    move-result v4

    add-int/2addr v0, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_7
    move v1, v2

    move v4, v1

    :goto_4
    iget-object v5, p0, Li8/c;->N:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-ge v1, v5, :cond_8

    iget-object v5, p0, Li8/c;->N:Ljava/util/List;

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static {v5}, Lp8/f;->p(I)I

    move-result v5

    add-int/2addr v4, v5

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_8
    add-int/2addr v0, v4

    invoke-virtual {p0}, Li8/c;->T0()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_9

    add-int/lit8 v0, v0, 0x1

    invoke-static {v4}, Lp8/f;->p(I)I

    move-result v1

    add-int/2addr v0, v1

    :cond_9
    iput v4, p0, Li8/c;->O:I

    move v1, v2

    :goto_5
    iget-object v4, p0, Li8/c;->S:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    const/16 v5, 0x8

    if-ge v1, v4, :cond_a

    iget-object v4, p0, Li8/c;->S:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp8/p;

    invoke-static {v5, v4}, Lp8/f;->r(ILp8/p;)I

    move-result v4

    add-int/2addr v0, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_a
    move v1, v2

    :goto_6
    iget-object v4, p0, Li8/c;->T:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v1, v4, :cond_b

    iget-object v4, p0, Li8/c;->T:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp8/p;

    const/16 v6, 0x9

    invoke-static {v6, v4}, Lp8/f;->r(ILp8/p;)I

    move-result v4

    add-int/2addr v0, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_b
    move v1, v2

    :goto_7
    iget-object v4, p0, Li8/c;->U:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v1, v4, :cond_c

    iget-object v4, p0, Li8/c;->U:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp8/p;

    const/16 v6, 0xa

    invoke-static {v6, v4}, Lp8/f;->r(ILp8/p;)I

    move-result v4

    add-int/2addr v0, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_c
    move v1, v2

    :goto_8
    iget-object v4, p0, Li8/c;->V:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v1, v4, :cond_d

    iget-object v4, p0, Li8/c;->V:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp8/p;

    const/16 v6, 0xb

    invoke-static {v6, v4}, Lp8/f;->r(ILp8/p;)I

    move-result v4

    add-int/2addr v0, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    :cond_d
    move v1, v2

    :goto_9
    iget-object v4, p0, Li8/c;->W:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v1, v4, :cond_e

    iget-object v4, p0, Li8/c;->W:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp8/p;

    const/16 v6, 0xd

    invoke-static {v6, v4}, Lp8/f;->r(ILp8/p;)I

    move-result v4

    add-int/2addr v0, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    :cond_e
    move v1, v2

    move v4, v1

    :goto_a
    iget-object v6, p0, Li8/c;->X:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v1, v6, :cond_f

    iget-object v6, p0, Li8/c;->X:Ljava/util/List;

    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static {v6}, Lp8/f;->p(I)I

    move-result v6

    add-int/2addr v4, v6

    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    :cond_f
    add-int/2addr v0, v4

    invoke-virtual {p0}, Li8/c;->X0()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_10

    add-int/lit8 v0, v0, 0x2

    invoke-static {v4}, Lp8/f;->p(I)I

    move-result v1

    add-int/2addr v0, v1

    :cond_10
    iput v4, p0, Li8/c;->Y:I

    iget v1, p0, Li8/c;->F:I

    and-int/2addr v1, v5

    if-ne v1, v5, :cond_11

    const/16 v1, 0x11

    iget v4, p0, Li8/c;->Z:I

    invoke-static {v1, v4}, Lp8/f;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_11
    iget v1, p0, Li8/c;->F:I

    const/16 v4, 0x10

    and-int/2addr v1, v4

    if-ne v1, v4, :cond_12

    const/16 v1, 0x12

    iget-object v4, p0, Li8/c;->a0:Li8/q;

    invoke-static {v1, v4}, Lp8/f;->r(ILp8/p;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_12
    iget v1, p0, Li8/c;->F:I

    const/16 v4, 0x20

    and-int/2addr v1, v4

    if-ne v1, v4, :cond_13

    const/16 v1, 0x13

    iget v5, p0, Li8/c;->b0:I

    invoke-static {v1, v5}, Lp8/f;->o(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_13
    move v1, v2

    :goto_b
    iget-object v5, p0, Li8/c;->P:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-ge v1, v5, :cond_14

    iget-object v5, p0, Li8/c;->P:Ljava/util/List;

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lp8/p;

    const/16 v6, 0x14

    invoke-static {v6, v5}, Lp8/f;->r(ILp8/p;)I

    move-result v5

    add-int/2addr v0, v5

    add-int/lit8 v1, v1, 0x1

    goto :goto_b

    :cond_14
    move v1, v2

    move v5, v1

    :goto_c
    iget-object v6, p0, Li8/c;->Q:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v1, v6, :cond_15

    iget-object v6, p0, Li8/c;->Q:Ljava/util/List;

    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static {v6}, Lp8/f;->p(I)I

    move-result v6

    add-int/2addr v5, v6

    add-int/lit8 v1, v1, 0x1

    goto :goto_c

    :cond_15
    add-int/2addr v0, v5

    invoke-virtual {p0}, Li8/c;->x0()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_16

    add-int/lit8 v0, v0, 0x2

    invoke-static {v5}, Lp8/f;->p(I)I

    move-result v1

    add-int/2addr v0, v1

    :cond_16
    iput v5, p0, Li8/c;->R:I

    move v1, v2

    move v5, v1

    :goto_d
    iget-object v6, p0, Li8/c;->c0:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v1, v6, :cond_17

    iget-object v6, p0, Li8/c;->c0:Ljava/util/List;

    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static {v6}, Lp8/f;->p(I)I

    move-result v6

    add-int/2addr v5, v6

    add-int/lit8 v1, v1, 0x1

    goto :goto_d

    :cond_17
    add-int/2addr v0, v5

    invoke-virtual {p0}, Li8/c;->N0()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_18

    add-int/lit8 v0, v0, 0x2

    invoke-static {v5}, Lp8/f;->p(I)I

    move-result v1

    add-int/2addr v0, v1

    :cond_18
    iput v5, p0, Li8/c;->d0:I

    move v1, v2

    :goto_e
    iget-object v5, p0, Li8/c;->e0:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-ge v1, v5, :cond_19

    iget-object v5, p0, Li8/c;->e0:Ljava/util/List;

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lp8/p;

    const/16 v6, 0x17

    invoke-static {v6, v5}, Lp8/f;->r(ILp8/p;)I

    move-result v5

    add-int/2addr v0, v5

    add-int/lit8 v1, v1, 0x1

    goto :goto_e

    :cond_19
    move v1, v2

    move v5, v1

    :goto_f
    iget-object v6, p0, Li8/c;->f0:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v1, v6, :cond_1a

    iget-object v6, p0, Li8/c;->f0:Ljava/util/List;

    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static {v6}, Lp8/f;->p(I)I

    move-result v6

    add-int/2addr v5, v6

    add-int/lit8 v1, v1, 0x1

    goto :goto_f

    :cond_1a
    add-int/2addr v0, v5

    invoke-virtual {p0}, Li8/c;->R0()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1b

    add-int/lit8 v0, v0, 0x2

    invoke-static {v5}, Lp8/f;->p(I)I

    move-result v1

    add-int/2addr v0, v1

    :cond_1b
    iput v5, p0, Li8/c;->g0:I

    iget v1, p0, Li8/c;->F:I

    const/16 v5, 0x40

    and-int/2addr v1, v5

    if-ne v1, v5, :cond_1c

    const/16 v1, 0x1e

    iget-object v5, p0, Li8/c;->h0:Li8/t;

    invoke-static {v1, v5}, Lp8/f;->r(ILp8/p;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_1c
    move v1, v2

    :goto_10
    iget-object v5, p0, Li8/c;->i0:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-ge v2, v5, :cond_1d

    iget-object v5, p0, Li8/c;->i0:Ljava/util/List;

    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static {v5}, Lp8/f;->p(I)I

    move-result v5

    add-int/2addr v1, v5

    add-int/lit8 v2, v2, 0x1

    goto :goto_10

    :cond_1d
    add-int/2addr v0, v1

    invoke-virtual {p0}, Li8/c;->j1()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    mul-int/2addr v1, v3

    add-int/2addr v0, v1

    iget v1, p0, Li8/c;->F:I

    const/16 v2, 0x80

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_1e

    iget-object v1, p0, Li8/c;->j0:Li8/w;

    invoke-static {v4, v1}, Lp8/f;->r(ILp8/p;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_1e
    invoke-virtual {p0}, Lp8/i$d;->t()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Li8/c;->E:Lp8/d;

    invoke-virtual {v1}, Lp8/d;->size()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Li8/c;->l0:I

    return v0
.end method

.method public b1()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/c;->K:Ljava/util/List;

    return-object v0
.end method

.method public bridge synthetic c()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/c;->w1()Li8/c$b;

    move-result-object v0

    return-object v0
.end method

.method public c1(I)Li8/r;
    .locals 1

    iget-object v0, p0, Li8/c;->V:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/r;

    return-object p1
.end method

.method public final d()Z
    .locals 4

    .prologue
    iget-byte v0, p0, Li8/c;->k0:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Li8/c;->n1()Z

    move-result v0

    if-nez v0, :cond_2

    iput-byte v2, p0, Li8/c;->k0:B

    return v2

    :cond_2
    move v0, v2

    :goto_0
    invoke-virtual {p0}, Li8/c;->g1()I

    move-result v3

    if-ge v0, v3, :cond_4

    invoke-virtual {p0, v0}, Li8/c;->f1(I)Li8/s;

    move-result-object v3

    invoke-virtual {v3}, Li8/s;->d()Z

    move-result v3

    if-nez v3, :cond_3

    iput-byte v2, p0, Li8/c;->k0:B

    return v2

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    move v0, v2

    :goto_1
    invoke-virtual {p0}, Li8/c;->Z0()I

    move-result v3

    if-ge v0, v3, :cond_6

    invoke-virtual {p0, v0}, Li8/c;->Y0(I)Li8/q;

    move-result-object v3

    invoke-virtual {v3}, Li8/q;->d()Z

    move-result v3

    if-nez v3, :cond_5

    iput-byte v2, p0, Li8/c;->k0:B

    return v2

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_6
    move v0, v2

    :goto_2
    invoke-virtual {p0}, Li8/c;->w0()I

    move-result v3

    if-ge v0, v3, :cond_8

    invoke-virtual {p0, v0}, Li8/c;->v0(I)Li8/q;

    move-result-object v3

    invoke-virtual {v3}, Li8/q;->d()Z

    move-result v3

    if-nez v3, :cond_7

    iput-byte v2, p0, Li8/c;->k0:B

    return v2

    :cond_7
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_8
    move v0, v2

    :goto_3
    invoke-virtual {p0}, Li8/c;->t0()I

    move-result v3

    if-ge v0, v3, :cond_a

    invoke-virtual {p0, v0}, Li8/c;->s0(I)Li8/d;

    move-result-object v3

    invoke-virtual {v3}, Li8/d;->d()Z

    move-result v3

    if-nez v3, :cond_9

    iput-byte v2, p0, Li8/c;->k0:B

    return v2

    :cond_9
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_a
    move v0, v2

    :goto_4
    invoke-virtual {p0}, Li8/c;->H0()I

    move-result v3

    if-ge v0, v3, :cond_c

    invoke-virtual {p0, v0}, Li8/c;->G0(I)Li8/i;

    move-result-object v3

    invoke-virtual {v3}, Li8/i;->d()Z

    move-result v3

    if-nez v3, :cond_b

    iput-byte v2, p0, Li8/c;->k0:B

    return v2

    :cond_b
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_c
    move v0, v2

    :goto_5
    invoke-virtual {p0}, Li8/c;->V0()I

    move-result v3

    if-ge v0, v3, :cond_e

    invoke-virtual {p0, v0}, Li8/c;->U0(I)Li8/n;

    move-result-object v3

    invoke-virtual {v3}, Li8/n;->d()Z

    move-result v3

    if-nez v3, :cond_d

    iput-byte v2, p0, Li8/c;->k0:B

    return v2

    :cond_d
    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_e
    move v0, v2

    :goto_6
    invoke-virtual {p0}, Li8/c;->d1()I

    move-result v3

    if-ge v0, v3, :cond_10

    invoke-virtual {p0, v0}, Li8/c;->c1(I)Li8/r;

    move-result-object v3

    invoke-virtual {v3}, Li8/r;->d()Z

    move-result v3

    if-nez v3, :cond_f

    iput-byte v2, p0, Li8/c;->k0:B

    return v2

    :cond_f
    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_10
    move v0, v2

    :goto_7
    invoke-virtual {p0}, Li8/c;->C0()I

    move-result v3

    if-ge v0, v3, :cond_12

    invoke-virtual {p0, v0}, Li8/c;->B0(I)Li8/g;

    move-result-object v3

    invoke-virtual {v3}, Li8/g;->d()Z

    move-result v3

    if-nez v3, :cond_11

    iput-byte v2, p0, Li8/c;->k0:B

    return v2

    :cond_11
    add-int/lit8 v0, v0, 0x1

    goto :goto_7

    :cond_12
    invoke-virtual {p0}, Li8/c;->p1()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-virtual {p0}, Li8/c;->K0()Li8/q;

    move-result-object v0

    invoke-virtual {v0}, Li8/q;->d()Z

    move-result v0

    if-nez v0, :cond_13

    iput-byte v2, p0, Li8/c;->k0:B

    return v2

    :cond_13
    move v0, v2

    :goto_8
    invoke-virtual {p0}, Li8/c;->P0()I

    move-result v3

    if-ge v0, v3, :cond_15

    invoke-virtual {p0, v0}, Li8/c;->O0(I)Li8/q;

    move-result-object v3

    invoke-virtual {v3}, Li8/q;->d()Z

    move-result v3

    if-nez v3, :cond_14

    iput-byte v2, p0, Li8/c;->k0:B

    return v2

    :cond_14
    add-int/lit8 v0, v0, 0x1

    goto :goto_8

    :cond_15
    invoke-virtual {p0}, Li8/c;->r1()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-virtual {p0}, Li8/c;->i1()Li8/t;

    move-result-object v0

    invoke-virtual {v0}, Li8/t;->d()Z

    move-result v0

    if-nez v0, :cond_16

    iput-byte v2, p0, Li8/c;->k0:B

    return v2

    :cond_16
    invoke-virtual {p0}, Lp8/i$d;->s()Z

    move-result v0

    if-nez v0, :cond_17

    iput-byte v2, p0, Li8/c;->k0:B

    return v2

    :cond_17
    iput-byte v1, p0, Li8/c;->k0:B

    return v1
.end method

.method public d1()I
    .locals 1

    iget-object v0, p0, Li8/c;->V:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic e()Lp8/p$a;
    .locals 1

    invoke-virtual {p0}, Li8/c;->y1()Li8/c$b;

    move-result-object v0

    return-object v0
.end method

.method public e1()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/c;->V:Ljava/util/List;

    return-object v0
.end method

.method public f1(I)Li8/s;
    .locals 1

    iget-object v0, p0, Li8/c;->J:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/s;

    return-object p1
.end method

.method public g1()I
    .locals 1

    iget-object v0, p0, Li8/c;->J:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public h(Lp8/f;)V
    .locals 7

    .prologue
    invoke-virtual {p0}, Li8/c;->b()I

    invoke-virtual {p0}, Lp8/i$d;->y()Lp8/i$d$a;

    move-result-object v0

    iget v1, p0, Li8/c;->F:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_0

    iget v1, p0, Li8/c;->G:I

    invoke-virtual {p1, v2, v1}, Lp8/f;->Z(II)V

    :cond_0
    invoke-virtual {p0}, Li8/c;->a1()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/16 v2, 0x12

    if-lez v1, :cond_1

    invoke-virtual {p1, v2}, Lp8/f;->n0(I)V

    iget v1, p0, Li8/c;->M:I

    invoke-virtual {p1, v1}, Lp8/f;->n0(I)V

    :cond_1
    const/4 v1, 0x0

    move v3, v1

    :goto_0
    iget-object v4, p0, Li8/c;->L:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_2

    iget-object v4, p0, Li8/c;->L:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {p1, v4}, Lp8/f;->a0(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    iget v3, p0, Li8/c;->F:I

    const/4 v4, 0x2

    and-int/2addr v3, v4

    if-ne v3, v4, :cond_3

    const/4 v3, 0x3

    iget v4, p0, Li8/c;->H:I

    invoke-virtual {p1, v3, v4}, Lp8/f;->Z(II)V

    :cond_3
    iget v3, p0, Li8/c;->F:I

    const/4 v4, 0x4

    and-int/2addr v3, v4

    if-ne v3, v4, :cond_4

    iget v3, p0, Li8/c;->I:I

    invoke-virtual {p1, v4, v3}, Lp8/f;->Z(II)V

    :cond_4
    move v3, v1

    :goto_1
    iget-object v4, p0, Li8/c;->J:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_5

    iget-object v4, p0, Li8/c;->J:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp8/p;

    const/4 v5, 0x5

    invoke-virtual {p1, v5, v4}, Lp8/f;->c0(ILp8/p;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_5
    move v3, v1

    :goto_2
    iget-object v4, p0, Li8/c;->K:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_6

    iget-object v4, p0, Li8/c;->K:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp8/p;

    const/4 v5, 0x6

    invoke-virtual {p1, v5, v4}, Lp8/f;->c0(ILp8/p;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_6
    invoke-virtual {p0}, Li8/c;->T0()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_7

    const/16 v3, 0x3a

    invoke-virtual {p1, v3}, Lp8/f;->n0(I)V

    iget v3, p0, Li8/c;->O:I

    invoke-virtual {p1, v3}, Lp8/f;->n0(I)V

    :cond_7
    move v3, v1

    :goto_3
    iget-object v4, p0, Li8/c;->N:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_8

    iget-object v4, p0, Li8/c;->N:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {p1, v4}, Lp8/f;->a0(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_8
    move v3, v1

    :goto_4
    iget-object v4, p0, Li8/c;->S:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    const/16 v5, 0x8

    if-ge v3, v4, :cond_9

    iget-object v4, p0, Li8/c;->S:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp8/p;

    invoke-virtual {p1, v5, v4}, Lp8/f;->c0(ILp8/p;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_9
    move v3, v1

    :goto_5
    iget-object v4, p0, Li8/c;->T:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_a

    iget-object v4, p0, Li8/c;->T:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp8/p;

    const/16 v6, 0x9

    invoke-virtual {p1, v6, v4}, Lp8/f;->c0(ILp8/p;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_a
    move v3, v1

    :goto_6
    iget-object v4, p0, Li8/c;->U:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_b

    iget-object v4, p0, Li8/c;->U:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp8/p;

    const/16 v6, 0xa

    invoke-virtual {p1, v6, v4}, Lp8/f;->c0(ILp8/p;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    :cond_b
    move v3, v1

    :goto_7
    iget-object v4, p0, Li8/c;->V:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_c

    iget-object v4, p0, Li8/c;->V:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp8/p;

    const/16 v6, 0xb

    invoke-virtual {p1, v6, v4}, Lp8/f;->c0(ILp8/p;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    :cond_c
    move v3, v1

    :goto_8
    iget-object v4, p0, Li8/c;->W:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_d

    iget-object v4, p0, Li8/c;->W:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp8/p;

    const/16 v6, 0xd

    invoke-virtual {p1, v6, v4}, Lp8/f;->c0(ILp8/p;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_8

    :cond_d
    invoke-virtual {p0}, Li8/c;->X0()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_e

    const/16 v3, 0x82

    invoke-virtual {p1, v3}, Lp8/f;->n0(I)V

    iget v3, p0, Li8/c;->Y:I

    invoke-virtual {p1, v3}, Lp8/f;->n0(I)V

    :cond_e
    move v3, v1

    :goto_9
    iget-object v4, p0, Li8/c;->X:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_f

    iget-object v4, p0, Li8/c;->X:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {p1, v4}, Lp8/f;->a0(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_9

    :cond_f
    iget v3, p0, Li8/c;->F:I

    and-int/2addr v3, v5

    if-ne v3, v5, :cond_10

    const/16 v3, 0x11

    iget v4, p0, Li8/c;->Z:I

    invoke-virtual {p1, v3, v4}, Lp8/f;->Z(II)V

    :cond_10
    iget v3, p0, Li8/c;->F:I

    const/16 v4, 0x10

    and-int/2addr v3, v4

    if-ne v3, v4, :cond_11

    iget-object v3, p0, Li8/c;->a0:Li8/q;

    invoke-virtual {p1, v2, v3}, Lp8/f;->c0(ILp8/p;)V

    :cond_11
    iget v2, p0, Li8/c;->F:I

    const/16 v3, 0x20

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_12

    const/16 v2, 0x13

    iget v4, p0, Li8/c;->b0:I

    invoke-virtual {p1, v2, v4}, Lp8/f;->Z(II)V

    :cond_12
    move v2, v1

    :goto_a
    iget-object v4, p0, Li8/c;->P:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v2, v4, :cond_13

    iget-object v4, p0, Li8/c;->P:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp8/p;

    const/16 v5, 0x14

    invoke-virtual {p1, v5, v4}, Lp8/f;->c0(ILp8/p;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_a

    :cond_13
    invoke-virtual {p0}, Li8/c;->x0()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_14

    const/16 v2, 0xaa

    invoke-virtual {p1, v2}, Lp8/f;->n0(I)V

    iget v2, p0, Li8/c;->R:I

    invoke-virtual {p1, v2}, Lp8/f;->n0(I)V

    :cond_14
    move v2, v1

    :goto_b
    iget-object v4, p0, Li8/c;->Q:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v2, v4, :cond_15

    iget-object v4, p0, Li8/c;->Q:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {p1, v4}, Lp8/f;->a0(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_b

    :cond_15
    invoke-virtual {p0}, Li8/c;->N0()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_16

    const/16 v2, 0xb2

    invoke-virtual {p1, v2}, Lp8/f;->n0(I)V

    iget v2, p0, Li8/c;->d0:I

    invoke-virtual {p1, v2}, Lp8/f;->n0(I)V

    :cond_16
    move v2, v1

    :goto_c
    iget-object v4, p0, Li8/c;->c0:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v2, v4, :cond_17

    iget-object v4, p0, Li8/c;->c0:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {p1, v4}, Lp8/f;->a0(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_c

    :cond_17
    move v2, v1

    :goto_d
    iget-object v4, p0, Li8/c;->e0:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v2, v4, :cond_18

    iget-object v4, p0, Li8/c;->e0:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp8/p;

    const/16 v5, 0x17

    invoke-virtual {p1, v5, v4}, Lp8/f;->c0(ILp8/p;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_d

    :cond_18
    invoke-virtual {p0}, Li8/c;->R0()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_19

    const/16 v2, 0xc2

    invoke-virtual {p1, v2}, Lp8/f;->n0(I)V

    iget v2, p0, Li8/c;->g0:I

    invoke-virtual {p1, v2}, Lp8/f;->n0(I)V

    :cond_19
    move v2, v1

    :goto_e
    iget-object v4, p0, Li8/c;->f0:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v2, v4, :cond_1a

    iget-object v4, p0, Li8/c;->f0:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {p1, v4}, Lp8/f;->a0(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_e

    :cond_1a
    iget v2, p0, Li8/c;->F:I

    const/16 v4, 0x40

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_1b

    const/16 v2, 0x1e

    iget-object v4, p0, Li8/c;->h0:Li8/t;

    invoke-virtual {p1, v2, v4}, Lp8/f;->c0(ILp8/p;)V

    :cond_1b
    :goto_f
    iget-object v2, p0, Li8/c;->i0:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1c

    iget-object v2, p0, Li8/c;->i0:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v4, 0x1f

    invoke-virtual {p1, v4, v2}, Lp8/f;->Z(II)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_f

    :cond_1c
    iget v1, p0, Li8/c;->F:I

    const/16 v2, 0x80

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_1d

    iget-object v1, p0, Li8/c;->j0:Li8/w;

    invoke-virtual {p1, v3, v1}, Lp8/f;->c0(ILp8/p;)V

    :cond_1d
    const/16 v1, 0x4a38

    invoke-virtual {v0, v1, p1}, Lp8/i$d$a;->a(ILp8/f;)V

    iget-object v0, p0, Li8/c;->E:Lp8/d;

    invoke-virtual {p1, v0}, Lp8/f;->h0(Lp8/d;)V

    return-void
.end method

.method public h1()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/c;->J:Ljava/util/List;

    return-object v0
.end method

.method public i1()Li8/t;
    .locals 1

    iget-object v0, p0, Li8/c;->h0:Li8/t;

    return-object v0
.end method

.method public j1()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/c;->i0:Ljava/util/List;

    return-object v0
.end method

.method public k1()Li8/w;
    .locals 1

    iget-object v0, p0, Li8/c;->j0:Li8/w;

    return-object v0
.end method

.method public l1()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/c;->F:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public m1()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/c;->F:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public n1()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/c;->F:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public o1()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/c;->F:I

    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public p1()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/c;->F:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public q1()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/c;->F:I

    const/16 v1, 0x20

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public r0()I
    .locals 1

    iget v0, p0, Li8/c;->I:I

    return v0
.end method

.method public r1()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/c;->F:I

    const/16 v1, 0x40

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public s0(I)Li8/d;
    .locals 1

    iget-object v0, p0, Li8/c;->S:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/d;

    return-object p1
.end method

.method public s1()Z
    .locals 2

    .prologue
    iget v0, p0, Li8/c;->F:I

    const/16 v1, 0x80

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public t0()I
    .locals 1

    iget-object v0, p0, Li8/c;->S:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public u0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/c;->S:Ljava/util/List;

    return-object v0
.end method

.method public v0(I)Li8/q;
    .locals 1

    iget-object v0, p0, Li8/c;->P:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/q;

    return-object p1
.end method

.method public w0()I
    .locals 1

    iget-object v0, p0, Li8/c;->P:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public w1()Li8/c$b;
    .locals 1

    invoke-static {}, Li8/c;->u1()Li8/c$b;

    move-result-object v0

    return-object v0
.end method

.method public x0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/c;->Q:Ljava/util/List;

    return-object v0
.end method

.method public y0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Li8/c;->P:Ljava/util/List;

    return-object v0
.end method

.method public y1()Li8/c$b;
    .locals 1

    invoke-static {p0}, Li8/c;->v1(Li8/c;)Li8/c$b;

    move-result-object v0

    return-object v0
.end method
