.class public final LV/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LV/o$a;,
        LV/o$b;
    }
.end annotation


# instance fields
.field private A:I

.field private B:I

.field private C:I

.field private D:Z

.field private final E:LV/o$c;

.field private final F:LV/F1;

.field private G:Z

.field private H:Z

.field private I:LV/g1;

.field private J:LV/h1;

.field private K:LV/k1;

.field private L:Z

.field private M:LV/H0;

.field private N:LW/a;

.field private final O:LW/b;

.field private P:LV/d;

.field private Q:LW/c;

.field private R:Z

.field private S:I

.field private final b:LV/g;

.field private final c:LV/s;

.field private final d:LV/h1;

.field private final e:Ljava/util/Set;

.field private f:LW/a;

.field private g:LW/a;

.field private final h:LV/G;

.field private final i:LV/F1;

.field private j:LV/F0;

.field private k:I

.field private l:I

.field private m:I

.field private final n:LV/X;

.field private o:[I

.field private p:Lr/A;

.field private q:Z

.field private r:Z

.field private s:Z

.field private final t:Ljava/util/List;

.field private final u:LV/X;

.field private v:LV/H0;

.field private w:LX/a;

.field private x:Z

.field private final y:LV/X;

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LV/g;LV/s;LV/h1;Ljava/util/Set;LW/a;LW/a;LV/G;)V
    .locals 0

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV/o;->b:LV/g;

    iput-object p2, p0, LV/o;->c:LV/s;

    iput-object p3, p0, LV/o;->d:LV/h1;

    iput-object p4, p0, LV/o;->e:Ljava/util/Set;

    iput-object p5, p0, LV/o;->f:LW/a;

    iput-object p6, p0, LV/o;->g:LW/a;

    iput-object p7, p0, LV/o;->h:LV/G;

    new-instance p1, LV/F1;

    invoke-direct {p1}, LV/F1;-><init>()V

    iput-object p1, p0, LV/o;->i:LV/F1;

    new-instance p1, LV/X;

    invoke-direct {p1}, LV/X;-><init>()V

    iput-object p1, p0, LV/o;->n:LV/X;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LV/o;->t:Ljava/util/List;

    new-instance p1, LV/X;

    invoke-direct {p1}, LV/X;-><init>()V

    iput-object p1, p0, LV/o;->u:LV/X;

    invoke-static {}, Ld0/f;->a()Ld0/e;

    move-result-object p1

    iput-object p1, p0, LV/o;->v:LV/H0;

    new-instance p1, LV/X;

    invoke-direct {p1}, LV/X;-><init>()V

    iput-object p1, p0, LV/o;->y:LV/X;

    const/4 p1, -0x1

    iput p1, p0, LV/o;->A:I

    invoke-virtual {p2}, LV/s;->e()Z

    move-result p1

    const/4 p4, 0x1

    const/4 p5, 0x0

    if-nez p1, :cond_1

    invoke-virtual {p2}, LV/s;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move p1, p5

    goto :goto_1

    :cond_1
    :goto_0
    move p1, p4

    :goto_1
    iput-boolean p1, p0, LV/o;->D:Z

    new-instance p1, LV/o$c;

    invoke-direct {p1, p0}, LV/o$c;-><init>(LV/o;)V

    iput-object p1, p0, LV/o;->E:LV/o$c;

    new-instance p1, LV/F1;

    invoke-direct {p1}, LV/F1;-><init>()V

    iput-object p1, p0, LV/o;->F:LV/F1;

    invoke-virtual {p3}, LV/h1;->U()LV/g1;

    move-result-object p1

    invoke-virtual {p1}, LV/g1;->d()V

    iput-object p1, p0, LV/o;->I:LV/g1;

    new-instance p1, LV/h1;

    invoke-direct {p1}, LV/h1;-><init>()V

    invoke-virtual {p2}, LV/s;->e()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-virtual {p1}, LV/h1;->s()V

    :cond_2
    invoke-virtual {p2}, LV/s;->c()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p1}, LV/h1;->o()V

    :cond_3
    iput-object p1, p0, LV/o;->J:LV/h1;

    invoke-virtual {p1}, LV/h1;->V()LV/k1;

    move-result-object p1

    invoke-virtual {p1, p4}, LV/k1;->L(Z)V

    iput-object p1, p0, LV/o;->K:LV/k1;

    new-instance p1, LW/b;

    iget-object p2, p0, LV/o;->f:LW/a;

    invoke-direct {p1, p0, p2}, LW/b;-><init>(LV/o;LW/a;)V

    iput-object p1, p0, LV/o;->O:LW/b;

    iget-object p1, p0, LV/o;->J:LV/h1;

    invoke-virtual {p1}, LV/h1;->U()LV/g1;

    move-result-object p1

    :try_start_0
    invoke-virtual {p1, p5}, LV/g1;->a(I)LV/d;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, LV/g1;->d()V

    iput-object p2, p0, LV/o;->P:LV/d;

    new-instance p1, LW/c;

    invoke-direct {p1}, LW/c;-><init>()V

    iput-object p1, p0, LV/o;->Q:LW/c;

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, LV/g1;->d()V

    throw p2
.end method

.method private final A0()V
    .locals 2

    .prologue
    new-instance v0, LV/h1;

    invoke-direct {v0}, LV/h1;-><init>()V

    iget-boolean v1, p0, LV/o;->D:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, LV/h1;->s()V

    :cond_0
    iget-object v1, p0, LV/o;->c:LV/s;

    invoke-virtual {v1}, LV/s;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, LV/h1;->o()V

    :cond_1
    iput-object v0, p0, LV/o;->J:LV/h1;

    invoke-virtual {v0}, LV/h1;->V()LV/k1;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LV/k1;->L(Z)V

    iput-object v0, p0, LV/o;->K:LV/k1;

    return-void
.end method

.method private final F0(LV/g1;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p1}, LV/g1;->u()I

    move-result v0

    invoke-virtual {p1, v0}, LV/g1;->L(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final H0(LV/g1;I)I
    .locals 2

    .prologue
    invoke-virtual {p1, p2}, LV/g1;->G(I)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1, p2}, LV/g1;->D(I)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    instance-of p2, p1, Ljava/lang/Enum;

    if-eqz p2, :cond_0

    check-cast p1, Ljava/lang/Enum;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    invoke-virtual {p1, p2}, LV/g1;->C(I)I

    move-result v0

    const/16 v1, 0xcf

    if-ne v0, v1, :cond_4

    invoke-virtual {p1, p2}, LV/g1;->z(I)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_4

    sget-object p2, LV/n;->a:LV/n$a;

    invoke-virtual {p2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :cond_4
    :goto_0
    move p1, v0

    :goto_1
    return p1
.end method

.method private final I0(Ljava/util/List;)V
    .locals 25

    .prologue
    move-object/from16 v9, p0

    const/4 v0, 0x1

    iget-object v10, v9, LV/o;->O:LW/b;

    iget-object v1, v9, LV/o;->g:LW/a;

    invoke-virtual {v10}, LW/b;->n()LW/a;

    move-result-object v11

    :try_start_0
    invoke-virtual {v10, v1}, LW/b;->R(LW/a;)V

    iget-object v1, v9, LV/o;->O:LW/b;

    invoke-virtual {v1}, LW/b;->P()V

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v13, 0x0

    move v14, v13

    :goto_0
    if-ge v14, v12, :cond_3

    move-object/from16 v15, p1

    :try_start_1
    invoke-interface {v15, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li7/u;

    invoke-virtual {v1}, Li7/u;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LV/o0;

    invoke-virtual {v1}, Li7/u;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LV/o0;

    invoke-virtual {v2}, LV/o0;->a()LV/d;

    move-result-object v3

    invoke-virtual {v2}, LV/o0;->g()LV/h1;

    move-result-object v4

    invoke-virtual {v4, v3}, LV/h1;->e(LV/d;)I

    move-result v4

    new-instance v8, Ld0/d;

    const/4 v5, 0x0

    invoke-direct {v8, v13, v0, v5}, Ld0/d;-><init>(IILy7/k;)V

    iget-object v6, v9, LV/o;->O:LW/b;

    invoke-virtual {v6, v8, v3}, LW/b;->e(Ld0/d;LV/d;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_c

    if-nez v1, :cond_1

    :try_start_2
    invoke-virtual {v2}, LV/o0;->g()LV/h1;

    move-result-object v1

    iget-object v3, v9, LV/o;->J:LV/h1;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct/range {p0 .. p0}, LV/o;->l0()V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v1, v10

    move-object v2, v11

    goto/16 :goto_9

    :cond_0
    :goto_1
    invoke-virtual {v2}, LV/o0;->g()LV/h1;

    move-result-object v1

    invoke-virtual {v1}, LV/h1;->U()LV/g1;

    move-result-object v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {v7, v4}, LV/g1;->Q(I)V

    iget-object v1, v9, LV/o;->O:LW/b;

    invoke-virtual {v1, v4}, LW/b;->y(I)V

    new-instance v6, LW/a;

    invoke-direct {v6}, LW/a;-><init>()V

    new-instance v5, LV/o$d;

    invoke-direct {v5, v9, v6, v7, v2}, LV/o$d;-><init>(LV/o;LW/a;LV/g1;LV/o0;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    const/16 v16, 0xf

    const/16 v17, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v18, 0x0

    move-object/from16 v1, p0

    move-object/from16 v19, v5

    move-object/from16 v5, v18

    move-object v13, v6

    move-object/from16 v6, v19

    move-object/from16 v19, v7

    move/from16 v7, v16

    move-object v0, v8

    move-object/from16 v8, v17

    :try_start_4
    invoke-static/range {v1 .. v8}, LV/o;->V0(LV/o;LV/G;LV/G;Ljava/lang/Integer;Ljava/util/List;Lx7/a;ILjava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v9, LV/o;->O:LW/b;

    invoke-virtual {v1, v13, v0}, LW/b;->r(LW/a;Ld0/d;)V

    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    invoke-virtual/range {v19 .. v19}, LV/g1;->d()V

    move-object/from16 v24, v10

    move-object/from16 v19, v11

    move/from16 v17, v12

    move/from16 v20, v14

    goto/16 :goto_3

    :catchall_1
    move-exception v0

    goto :goto_2

    :catchall_2
    move-exception v0

    move-object/from16 v19, v7

    :goto_2
    invoke-virtual/range {v19 .. v19}, LV/g1;->d()V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :cond_1
    move-object v0, v8

    :try_start_6
    iget-object v4, v9, LV/o;->c:LV/s;

    invoke-virtual {v4, v1}, LV/s;->l(LV/o0;)LV/n0;

    move-result-object v4

    invoke-virtual {v1}, LV/o0;->g()LV/h1;

    move-result-object v6

    invoke-virtual {v1}, LV/o0;->a()LV/d;

    move-result-object v7

    invoke-static {v6, v7}, LV/q;->e(LV/h1;LV/d;)Ljava/util/List;

    move-result-object v8

    move-object v13, v8

    check-cast v13, Ljava/util/Collection;

    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    move-result v13
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_c

    const/16 v16, 0x1

    xor-int/lit8 v13, v13, 0x1

    if-eqz v13, :cond_2

    :try_start_7
    iget-object v13, v9, LV/o;->O:LW/b;

    invoke-virtual {v13, v8, v0}, LW/b;->b(Ljava/util/List;Ld0/d;)V

    invoke-virtual {v2}, LV/o0;->g()LV/h1;

    move-result-object v13

    iget-object v5, v9, LV/o;->d:LV/h1;

    invoke-static {v13, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    iget-object v5, v9, LV/o;->d:LV/h1;

    invoke-virtual {v5, v3}, LV/h1;->e(LV/d;)I

    move-result v3

    invoke-direct {v9, v3}, LV/o;->w1(I)I

    move-result v5

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    add-int/2addr v5, v8

    invoke-direct {v9, v3, v5}, LV/o;->r1(II)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :cond_2
    :try_start_8
    iget-object v3, v9, LV/o;->O:LW/b;

    iget-object v5, v9, LV/o;->c:LV/s;

    invoke-virtual {v3, v4, v5, v1, v2}, LW/b;->c(LV/n0;LV/s;LV/o0;LV/o0;)V

    invoke-virtual {v6}, LV/h1;->U()LV/g1;

    move-result-object v8
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_c

    :try_start_9
    invoke-virtual/range {p0 .. p0}, LV/o;->G0()LV/g1;

    move-result-object v13

    invoke-static/range {p0 .. p0}, LV/o;->X(LV/o;)[I

    move-result-object v5

    invoke-static/range {p0 .. p0}, LV/o;->Z(LV/o;)LX/a;

    move-result-object v4

    const/4 v3, 0x0

    invoke-static {v9, v3}, LV/o;->d0(LV/o;[I)V

    invoke-static {v9, v3}, LV/o;->e0(LV/o;LX/a;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_b

    :try_start_a
    invoke-virtual {v9, v8}, LV/o;->f1(LV/g1;)V

    invoke-virtual {v6, v7}, LV/h1;->e(LV/d;)I

    move-result v3

    invoke-virtual {v8, v3}, LV/g1;->Q(I)V

    iget-object v6, v9, LV/o;->O:LW/b;

    invoke-virtual {v6, v3}, LW/b;->y(I)V

    new-instance v7, LW/a;

    invoke-direct {v7}, LW/a;-><init>()V

    iget-object v6, v9, LV/o;->O:LW/b;

    invoke-virtual {v6}, LW/b;->n()LW/a;

    move-result-object v3
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    :try_start_b
    invoke-virtual {v6, v7}, LW/b;->R(LW/a;)V

    move/from16 v17, v12

    iget-object v12, v9, LV/o;->O:LW/b;

    invoke-virtual {v12}, LW/b;->o()Z

    move-result v15
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    move-object/from16 v19, v3

    const/4 v3, 0x0

    :try_start_c
    invoke-virtual {v12, v3}, LW/b;->S(Z)V

    invoke-virtual {v1}, LV/o0;->b()LV/G;

    move-result-object v3

    invoke-virtual {v2}, LV/o0;->b()LV/G;

    move-result-object v20

    invoke-virtual {v8}, LV/g1;->k()I

    move-result v21

    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v21

    invoke-virtual {v1}, LV/o0;->d()Ljava/util/List;

    move-result-object v22

    new-instance v1, LV/o$e;

    invoke-direct {v1, v9, v2}, LV/o$e;-><init>(LV/o;LV/o0;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    move-object/from16 v23, v1

    move-object/from16 v1, p0

    move-object v2, v3

    move-object/from16 v24, v10

    move-object/from16 v10, v19

    move-object/from16 v3, v20

    move-object/from16 v19, v11

    move-object v11, v4

    move-object/from16 v4, v21

    move/from16 v20, v14

    move-object v14, v5

    move-object/from16 v5, v22

    move-object/from16 v21, v8

    move-object v8, v6

    move-object/from16 v6, v23

    :try_start_d
    invoke-direct/range {v1 .. v6}, LV/o;->U0(LV/G;LV/G;Ljava/lang/Integer;Ljava/util/List;Lx7/a;)Ljava/lang/Object;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    :try_start_e
    invoke-virtual {v12, v15}, LW/b;->S(Z)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    :try_start_f
    invoke-virtual {v8, v10}, LW/b;->R(LW/a;)V

    iget-object v1, v9, LV/o;->O:LW/b;

    invoke-virtual {v1, v7, v0}, LW/b;->r(LW/a;Ld0/d;)V

    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    :try_start_10
    invoke-virtual {v9, v13}, LV/o;->f1(LV/g1;)V

    invoke-static {v9, v14}, LV/o;->d0(LV/o;[I)V

    invoke-static {v9, v11}, LV/o;->e0(LV/o;LX/a;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    :try_start_11
    invoke-virtual/range {v21 .. v21}, LV/g1;->d()V

    :goto_3
    iget-object v0, v9, LV/o;->O:LW/b;

    invoke-virtual {v0}, LW/b;->U()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_3

    const/4 v0, 0x1

    add-int/lit8 v14, v20, 0x1

    move/from16 v12, v17

    move-object/from16 v11, v19

    move-object/from16 v10, v24

    const/4 v13, 0x0

    goto/16 :goto_0

    :catchall_3
    move-exception v0

    :goto_4
    move-object/from16 v2, v19

    move-object/from16 v1, v24

    goto/16 :goto_9

    :catchall_4
    move-exception v0

    goto :goto_8

    :catchall_5
    move-exception v0

    goto :goto_7

    :catchall_6
    move-exception v0

    goto :goto_6

    :catchall_7
    move-exception v0

    goto :goto_5

    :catchall_8
    move-exception v0

    move-object v14, v5

    move-object/from16 v21, v8

    move-object/from16 v24, v10

    move-object/from16 v10, v19

    move-object v8, v6

    move-object/from16 v19, v11

    move-object v11, v4

    :goto_5
    :try_start_12
    invoke-virtual {v12, v15}, LW/b;->S(Z)V

    throw v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_6

    :catchall_9
    move-exception v0

    move-object v14, v5

    move-object/from16 v21, v8

    move-object/from16 v24, v10

    move-object/from16 v19, v11

    move-object v10, v3

    move-object v11, v4

    move-object v8, v6

    :goto_6
    :try_start_13
    invoke-virtual {v8, v10}, LW/b;->R(LW/a;)V

    throw v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_5

    :catchall_a
    move-exception v0

    move-object v14, v5

    move-object/from16 v21, v8

    move-object/from16 v24, v10

    move-object/from16 v19, v11

    move-object v11, v4

    :goto_7
    :try_start_14
    invoke-virtual {v9, v13}, LV/o;->f1(LV/g1;)V

    invoke-static {v9, v14}, LV/o;->d0(LV/o;[I)V

    invoke-static {v9, v11}, LV/o;->e0(LV/o;LX/a;)V

    throw v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_4

    :catchall_b
    move-exception v0

    move-object/from16 v21, v8

    move-object/from16 v24, v10

    move-object/from16 v19, v11

    :goto_8
    :try_start_15
    invoke-virtual/range {v21 .. v21}, LV/g1;->d()V

    throw v0

    :catchall_c
    move-exception v0

    move-object/from16 v24, v10

    move-object/from16 v19, v11

    goto :goto_4

    :cond_3
    move-object/from16 v24, v10

    move-object/from16 v19, v11

    iget-object v0, v9, LV/o;->O:LW/b;

    invoke-virtual {v0}, LW/b;->h()V

    iget-object v0, v9, LV/o;->O:LW/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LW/b;->y(I)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_3

    move-object/from16 v2, v19

    move-object/from16 v1, v24

    invoke-virtual {v1, v2}, LW/b;->R(LW/a;)V

    return-void

    :goto_9
    invoke-virtual {v1, v2}, LW/b;->R(LW/a;)V

    throw v0
.end method

.method private final K0(I)I
    .locals 0

    rsub-int/lit8 p1, p1, -0x2

    return p1
.end method

.method private final L0(LV/m0;LV/H0;Ljava/lang/Object;Z)V
    .locals 11

    .prologue
    const v0, 0x78cc281

    invoke-virtual {p0, v0, p1}, LV/o;->s(ILjava/lang/Object;)V

    invoke-direct {p0, p3}, LV/o;->u1(Ljava/lang/Object;)V

    invoke-virtual {p0}, LV/o;->L()I

    move-result v1

    const/4 v2, 0x0

    :try_start_0
    iput v0, p0, LV/o;->S:I

    invoke-virtual {p0}, LV/o;->o()Z

    move-result v0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, LV/o;->K:LV/k1;

    invoke-static {v0, v3, v4, v2}, LV/k1;->t0(LV/k1;IILjava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_0
    :goto_0
    invoke-virtual {p0}, LV/o;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-virtual {v0}, LV/g1;->l()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    move v3, v4

    :cond_2
    :goto_1
    if-eqz v3, :cond_3

    invoke-direct {p0, p2}, LV/o;->Z0(LV/H0;)V

    :cond_3
    invoke-static {}, LV/q;->y()Ljava/lang/Object;

    move-result-object v0

    sget-object v5, LV/V;->a:LV/V$a;

    invoke-virtual {v5}, LV/V$a;->a()I

    move-result v5

    const/16 v6, 0xca

    invoke-direct {p0, v6, v0, v5, p2}, LV/o;->j1(ILjava/lang/Object;ILjava/lang/Object;)V

    iput-object v2, p0, LV/o;->M:LV/H0;

    invoke-virtual {p0}, LV/o;->o()Z

    move-result p2

    if-eqz p2, :cond_4

    if-nez p4, :cond_4

    iput-boolean v4, p0, LV/o;->L:Z

    iget-object p2, p0, LV/o;->K:LV/k1;

    invoke-virtual {p2}, LV/k1;->c0()I

    move-result p4

    invoke-virtual {p2, p4}, LV/k1;->E0(I)I

    move-result p4

    invoke-virtual {p2, p4}, LV/k1;->E(I)LV/d;

    move-result-object v8

    new-instance p2, LV/o0;

    invoke-virtual {p0}, LV/o;->C0()LV/G;

    move-result-object v6

    iget-object v7, p0, LV/o;->J:LV/h1;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v9

    invoke-direct {p0}, LV/o;->m0()LV/H0;

    move-result-object v10

    move-object v3, p2

    move-object v4, p1

    move-object v5, p3

    invoke-direct/range {v3 .. v10}, LV/o0;-><init>(LV/m0;Ljava/lang/Object;LV/G;LV/h1;LV/d;Ljava/util/List;LV/H0;)V

    iget-object p1, p0, LV/o;->c:LV/s;

    invoke-virtual {p1, p2}, LV/s;->j(LV/o0;)V

    goto :goto_2

    :cond_4
    iget-boolean p2, p0, LV/o;->x:Z

    iput-boolean v3, p0, LV/o;->x:Z

    new-instance p4, LV/o$f;

    invoke-direct {p4, p1, p3}, LV/o$f;-><init>(LV/m0;Ljava/lang/Object;)V

    const p1, 0x12d6006f

    invoke-static {p1, v4, p4}, Ld0/c;->c(IZLjava/lang/Object;)Ld0/a;

    move-result-object p1

    invoke-static {p0, p1}, LV/c;->d(LV/n;Lx7/p;)V

    iput-boolean p2, p0, LV/o;->x:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    invoke-direct {p0}, LV/o;->t0()V

    iput-object v2, p0, LV/o;->M:LV/H0;

    iput v1, p0, LV/o;->S:I

    invoke-virtual {p0}, LV/o;->N()V

    return-void

    :goto_3
    invoke-direct {p0}, LV/o;->t0()V

    iput-object v2, p0, LV/o;->M:LV/H0;

    iput v1, p0, LV/o;->S:I

    invoke-virtual {p0}, LV/o;->N()V

    throw p1
.end method

.method private final P0(LV/g1;I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p1, p2}, LV/g1;->L(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final Q0(IIII)I
    .locals 2

    .prologue
    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-virtual {v0, p2}, LV/g1;->P(I)I

    move-result v0

    :goto_0
    if-eq v0, p3, :cond_0

    iget-object v1, p0, LV/o;->I:LV/g1;

    invoke-virtual {v1, v0}, LV/g1;->J(I)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, LV/o;->I:LV/g1;

    invoke-virtual {v1, v0}, LV/g1;->P(I)I

    move-result v0

    goto :goto_0

    :cond_0
    iget-object p3, p0, LV/o;->I:LV/g1;

    invoke-virtual {p3, v0}, LV/g1;->J(I)Z

    move-result p3

    if-eqz p3, :cond_1

    const/4 p4, 0x0

    :cond_1
    if-ne v0, p2, :cond_2

    return p4

    :cond_2
    invoke-direct {p0, v0}, LV/o;->w1(I)I

    move-result p3

    iget-object v1, p0, LV/o;->I:LV/g1;

    invoke-virtual {v1, p2}, LV/g1;->N(I)I

    move-result p2

    sub-int/2addr p3, p2

    add-int/2addr p3, p4

    :cond_3
    if-ge p4, p3, :cond_5

    if-eq v0, p1, :cond_5

    add-int/lit8 v0, v0, 0x1

    :goto_1
    if-ge v0, p1, :cond_5

    iget-object p2, p0, LV/o;->I:LV/g1;

    invoke-virtual {p2, v0}, LV/g1;->E(I)I

    move-result p2

    add-int/2addr p2, v0

    if-lt p1, p2, :cond_3

    iget-object v1, p0, LV/o;->I:LV/g1;

    invoke-virtual {v1, v0}, LV/g1;->J(I)Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v0, 0x1

    goto :goto_2

    :cond_4
    invoke-direct {p0, v0}, LV/o;->w1(I)I

    move-result v0

    :goto_2
    add-int/2addr p4, v0

    move v0, p2

    goto :goto_1

    :cond_5
    return p4
.end method

.method private final S0(I)I
    .locals 3

    .prologue
    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-virtual {v0, p1}, LV/g1;->P(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    :goto_0
    if-ge v0, p1, :cond_1

    iget-object v2, p0, LV/o;->I:LV/g1;

    invoke-virtual {v2, v0}, LV/g1;->G(I)Z

    move-result v2

    if-nez v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    :cond_0
    iget-object v2, p0, LV/o;->I:LV/g1;

    invoke-virtual {v2, v0}, LV/g1;->E(I)I

    move-result v2

    add-int/2addr v0, v2

    goto :goto_0

    :cond_1
    return v1
.end method

.method private final U()V
    .locals 1

    .prologue
    invoke-direct {p0}, LV/o;->h0()V

    iget-object v0, p0, LV/o;->i:LV/F1;

    invoke-virtual {v0}, LV/F1;->a()V

    iget-object v0, p0, LV/o;->n:LV/X;

    invoke-virtual {v0}, LV/X;->a()V

    iget-object v0, p0, LV/o;->u:LV/X;

    invoke-virtual {v0}, LV/X;->a()V

    iget-object v0, p0, LV/o;->y:LV/X;

    invoke-virtual {v0}, LV/X;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, LV/o;->w:LX/a;

    iget-object v0, p0, LV/o;->Q:LW/c;

    invoke-virtual {v0}, LW/c;->a()V

    const/4 v0, 0x0

    iput v0, p0, LV/o;->S:I

    iput v0, p0, LV/o;->B:I

    iput-boolean v0, p0, LV/o;->s:Z

    iput-boolean v0, p0, LV/o;->R:Z

    iput-boolean v0, p0, LV/o;->z:Z

    iput-boolean v0, p0, LV/o;->G:Z

    iput-boolean v0, p0, LV/o;->r:Z

    const/4 v0, -0x1

    iput v0, p0, LV/o;->A:I

    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-virtual {v0}, LV/g1;->i()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-virtual {v0}, LV/g1;->d()V

    :cond_0
    iget-object v0, p0, LV/o;->K:LV/k1;

    invoke-virtual {v0}, LV/k1;->Z()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, LV/o;->A0()V

    :cond_1
    return-void
.end method

.method private final U0(LV/G;LV/G;Ljava/lang/Integer;Ljava/util/List;Lx7/a;)Ljava/lang/Object;
    .locals 6

    .prologue
    iget-boolean v0, p0, LV/o;->G:Z

    iget v1, p0, LV/o;->k:I

    const/4 v2, 0x1

    :try_start_0
    iput-boolean v2, p0, LV/o;->G:Z

    const/4 v2, 0x0

    iput v2, p0, LV/o;->k:I

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v3

    :goto_0
    if-ge v2, v3, :cond_1

    invoke-interface {p4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li7/u;

    invoke-virtual {v4}, Li7/u;->a()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LV/R0;

    invoke-virtual {v4}, Li7/u;->b()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {p0, v5, v4}, LV/o;->p1(LV/R0;Ljava/lang/Object;)Z

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_0
    const/4 v4, 0x0

    invoke-virtual {p0, v5, v4}, LV/o;->p1(LV/R0;Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_3

    if-eqz p3, :cond_2

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    goto :goto_2

    :cond_2
    const/4 p3, -0x1

    :goto_2
    invoke-interface {p1, p2, p3, p5}, LV/G;->z(LV/G;ILx7/a;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_4

    :cond_3
    invoke-interface {p5}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    iput-boolean v0, p0, LV/o;->G:Z

    iput v1, p0, LV/o;->k:I

    return-object p1

    :goto_3
    iput-boolean v0, p0, LV/o;->G:Z

    iput v1, p0, LV/o;->k:I

    throw p1
.end method

.method public static final synthetic V(LV/o;)LW/b;
    .locals 0

    iget-object p0, p0, LV/o;->O:LW/b;

    return-object p0
.end method

.method static synthetic V0(LV/o;LV/G;LV/G;Ljava/lang/Integer;Ljava/util/List;Lx7/a;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .prologue
    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object v2, v0

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    move-object v3, v0

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    move-object v4, v0

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p4

    :cond_3
    move-object v5, p4

    move-object v1, p0

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, LV/o;->U0(LV/G;LV/G;Ljava/lang/Integer;Ljava/util/List;Lx7/a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic W(LV/o;)I
    .locals 0

    iget p0, p0, LV/o;->B:I

    return p0
.end method

.method private final W0()V
    .locals 13

    .prologue
    iget-boolean v0, p0, LV/o;->G:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, LV/o;->G:Z

    iget-object v2, p0, LV/o;->I:LV/g1;

    invoke-virtual {v2}, LV/g1;->u()I

    move-result v2

    iget-object v3, p0, LV/o;->I:LV/g1;

    invoke-virtual {v3, v2}, LV/g1;->E(I)I

    move-result v3

    add-int/2addr v3, v2

    iget v4, p0, LV/o;->k:I

    invoke-virtual {p0}, LV/o;->L()I

    move-result v5

    iget v6, p0, LV/o;->l:I

    iget v7, p0, LV/o;->m:I

    iget-object v8, p0, LV/o;->t:Ljava/util/List;

    iget-object v9, p0, LV/o;->I:LV/g1;

    invoke-virtual {v9}, LV/g1;->k()I

    move-result v9

    invoke-static {v8, v9, v3}, LV/q;->f(Ljava/util/List;II)LV/Z;

    move-result-object v8

    const/4 v9, 0x0

    move v10, v2

    :goto_0
    if-eqz v8, :cond_1

    invoke-virtual {v8}, LV/Z;->b()I

    move-result v11

    iget-object v12, p0, LV/o;->t:Ljava/util/List;

    invoke-static {v12, v11}, LV/q;->l(Ljava/util/List;I)LV/Z;

    invoke-virtual {v8}, LV/Z;->d()Z

    move-result v12

    if-eqz v12, :cond_0

    iget-object v9, p0, LV/o;->I:LV/g1;

    invoke-virtual {v9, v11}, LV/g1;->Q(I)V

    iget-object v9, p0, LV/o;->I:LV/g1;

    invoke-virtual {v9}, LV/g1;->k()I

    move-result v9

    invoke-direct {p0, v10, v9, v2}, LV/o;->a1(III)V

    invoke-direct {p0, v11, v9, v2, v4}, LV/o;->Q0(IIII)I

    move-result v10

    iput v10, p0, LV/o;->k:I

    invoke-direct {p0, v9}, LV/o;->S0(I)I

    move-result v10

    iput v10, p0, LV/o;->m:I

    iget-object v10, p0, LV/o;->I:LV/g1;

    invoke-virtual {v10, v9}, LV/g1;->P(I)I

    move-result v10

    invoke-direct {p0, v10}, LV/o;->S0(I)I

    move-result v11

    invoke-direct {p0, v10, v11, v2, v5}, LV/o;->k0(IIII)I

    move-result v10

    iput v10, p0, LV/o;->S:I

    const/4 v10, 0x0

    iput-object v10, p0, LV/o;->M:LV/H0;

    invoke-virtual {v8}, LV/Z;->c()LV/R0;

    move-result-object v8

    invoke-virtual {v8, p0}, LV/R0;->g(LV/n;)V

    iput-object v10, p0, LV/o;->M:LV/H0;

    iget-object v8, p0, LV/o;->I:LV/g1;

    invoke-virtual {v8, v2}, LV/g1;->R(I)V

    move v10, v9

    move v9, v1

    goto :goto_1

    :cond_0
    iget-object v11, p0, LV/o;->F:LV/F1;

    invoke-virtual {v8}, LV/Z;->c()LV/R0;

    move-result-object v12

    invoke-virtual {v11, v12}, LV/F1;->h(Ljava/lang/Object;)Z

    invoke-virtual {v8}, LV/Z;->c()LV/R0;

    move-result-object v8

    invoke-virtual {v8}, LV/R0;->y()V

    iget-object v8, p0, LV/o;->F:LV/F1;

    invoke-virtual {v8}, LV/F1;->g()Ljava/lang/Object;

    :goto_1
    iget-object v8, p0, LV/o;->t:Ljava/util/List;

    iget-object v11, p0, LV/o;->I:LV/g1;

    invoke-virtual {v11}, LV/g1;->k()I

    move-result v11

    invoke-static {v8, v11, v3}, LV/q;->f(Ljava/util/List;II)LV/Z;

    move-result-object v8

    goto :goto_0

    :cond_1
    if-eqz v9, :cond_2

    invoke-direct {p0, v10, v2, v2}, LV/o;->a1(III)V

    iget-object v1, p0, LV/o;->I:LV/g1;

    invoke-virtual {v1}, LV/g1;->T()V

    invoke-direct {p0, v2}, LV/o;->w1(I)I

    move-result v1

    add-int/2addr v4, v1

    iput v4, p0, LV/o;->k:I

    add-int/2addr v6, v1

    iput v6, p0, LV/o;->l:I

    iput v7, p0, LV/o;->m:I

    goto :goto_2

    :cond_2
    invoke-direct {p0}, LV/o;->i1()V

    :goto_2
    iput v5, p0, LV/o;->S:I

    iput-boolean v0, p0, LV/o;->G:Z

    return-void
.end method

.method public static final synthetic X(LV/o;)[I
    .locals 0

    iget-object p0, p0, LV/o;->o:[I

    return-object p0
.end method

.method private final X0()V
    .locals 1

    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-virtual {v0}, LV/g1;->k()I

    move-result v0

    invoke-direct {p0, v0}, LV/o;->d1(I)V

    iget-object v0, p0, LV/o;->O:LW/b;

    invoke-virtual {v0}, LW/b;->N()V

    return-void
.end method

.method public static final synthetic Y(LV/o;)LV/s;
    .locals 0

    iget-object p0, p0, LV/o;->c:LV/s;

    return-object p0
.end method

.method private final Y0(LV/d;)V
    .locals 3

    .prologue
    iget-object v0, p0, LV/o;->Q:LW/c;

    invoke-virtual {v0}, LW/c;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LV/o;->O:LW/b;

    iget-object v1, p0, LV/o;->J:LV/h1;

    invoke-virtual {v0, p1, v1}, LW/b;->s(LV/d;LV/h1;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LV/o;->O:LW/b;

    iget-object v1, p0, LV/o;->J:LV/h1;

    iget-object v2, p0, LV/o;->Q:LW/c;

    invoke-virtual {v0, p1, v1, v2}, LW/b;->t(LV/d;LV/h1;LW/c;)V

    new-instance p1, LW/c;

    invoke-direct {p1}, LW/c;-><init>()V

    iput-object p1, p0, LV/o;->Q:LW/c;

    :goto_0
    return-void
.end method

.method public static final synthetic Z(LV/o;)LX/a;
    .locals 0

    iget-object p0, p0, LV/o;->w:LX/a;

    return-object p0
.end method

.method private final Z0(LV/H0;)V
    .locals 4

    .prologue
    iget-object v0, p0, LV/o;->w:LX/a;

    if-nez v0, :cond_0

    new-instance v0, LX/a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, LX/a;-><init>(IILy7/k;)V

    iput-object v0, p0, LV/o;->w:LX/a;

    :cond_0
    iget-object v1, p0, LV/o;->I:LV/g1;

    invoke-virtual {v1}, LV/g1;->k()I

    move-result v1

    invoke-virtual {v0, v1, p1}, LX/a;->b(ILjava/lang/Object;)V

    return-void
.end method

.method public static final synthetic a0(LV/o;)LV/h1;
    .locals 0

    iget-object p0, p0, LV/o;->d:LV/h1;

    return-object p0
.end method

.method private final a1(III)V
    .locals 2

    .prologue
    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-static {v0, p1, p2, p3}, LV/q;->k(LV/g1;III)I

    move-result p3

    :goto_0
    if-lez p1, :cond_1

    if-eq p1, p3, :cond_1

    invoke-virtual {v0, p1}, LV/g1;->J(I)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, LV/o;->O:LW/b;

    invoke-virtual {v1}, LW/b;->z()V

    :cond_0
    invoke-virtual {v0, p1}, LV/g1;->P(I)I

    move-result p1

    goto :goto_0

    :cond_1
    invoke-direct {p0, p2, p3}, LV/o;->r0(II)V

    return-void
.end method

.method public static final synthetic b0(LV/o;LV/m0;LV/H0;Ljava/lang/Object;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LV/o;->L0(LV/m0;LV/H0;Ljava/lang/Object;Z)V

    return-void
.end method

.method private final b1()LV/d;
    .locals 4

    .prologue
    invoke-virtual {p0}, LV/o;->o()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, LV/o;->K:LV/k1;

    invoke-static {v0}, LV/q;->G(LV/k1;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, LV/o;->K:LV/k1;

    invoke-virtual {v0}, LV/k1;->a0()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    iget-object v1, p0, LV/o;->K:LV/k1;

    invoke-virtual {v1, v0}, LV/k1;->E0(I)I

    move-result v1

    move v3, v1

    move v1, v0

    move v0, v3

    iget-object v2, p0, LV/o;->K:LV/k1;

    invoke-virtual {v2}, LV/k1;->c0()I

    move-result v2

    if-eq v0, v2, :cond_0

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LV/o;->K:LV/k1;

    invoke-virtual {v0, v1}, LV/k1;->E(I)LV/d;

    move-result-object v1

    goto :goto_2

    :cond_1
    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-static {v0}, LV/q;->F(LV/g1;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-virtual {v0}, LV/g1;->k()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_1
    iget-object v1, p0, LV/o;->I:LV/g1;

    invoke-virtual {v1, v0}, LV/g1;->P(I)I

    move-result v1

    move v3, v1

    move v1, v0

    move v0, v3

    iget-object v2, p0, LV/o;->I:LV/g1;

    invoke-virtual {v2}, LV/g1;->u()I

    move-result v2

    if-eq v0, v2, :cond_2

    if-ltz v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-virtual {v0, v1}, LV/g1;->a(I)LV/d;

    move-result-object v1

    :cond_3
    :goto_2
    return-object v1
.end method

.method public static final synthetic c0(LV/o;I)V
    .locals 0

    iput p1, p0, LV/o;->B:I

    return-void
.end method

.method private final c1()V
    .locals 4

    .prologue
    iget-object v0, p0, LV/o;->d:LV/h1;

    invoke-virtual {v0}, LV/h1;->C()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LW/a;

    invoke-direct {v0}, LW/a;-><init>()V

    iput-object v0, p0, LV/o;->N:LW/a;

    iget-object v1, p0, LV/o;->d:LV/h1;

    invoke-virtual {v1}, LV/h1;->U()LV/g1;

    move-result-object v1

    :try_start_0
    iput-object v1, p0, LV/o;->I:LV/g1;

    iget-object v2, p0, LV/o;->O:LW/b;

    invoke-virtual {v2}, LW/b;->n()LW/a;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v2, v0}, LW/b;->R(LW/a;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LV/o;->d1(I)V

    iget-object v0, p0, LV/o;->O:LW/b;

    invoke-virtual {v0}, LW/b;->L()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v2, v3}, LW/b;->R(LW/a;)V

    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {v1}, LV/g1;->d()V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_3
    invoke-virtual {v2, v3}, LW/b;->R(LW/a;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_0
    invoke-virtual {v1}, LV/g1;->d()V

    throw v0

    :cond_0
    :goto_1
    return-void
.end method

.method public static final synthetic d0(LV/o;[I)V
    .locals 0

    iput-object p1, p0, LV/o;->o:[I

    return-void
.end method

.method private final d1(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0, v0}, LV/o;->e1(LV/o;IZI)I

    iget-object p1, p0, LV/o;->O:LW/b;

    invoke-virtual {p1}, LW/b;->i()V

    return-void
.end method

.method public static final synthetic e0(LV/o;LX/a;)V
    .locals 0

    iput-object p1, p0, LV/o;->w:LX/a;

    return-void
.end method

.method private static final e1(LV/o;IZI)I
    .locals 9

    .prologue
    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-virtual {v0, p1}, LV/g1;->F(I)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    invoke-virtual {v0, p1}, LV/g1;->C(I)I

    move-result p2

    invoke-virtual {v0, p1}, LV/g1;->D(I)Ljava/lang/Object;

    move-result-object p3

    const/16 v1, 0xce

    if-ne p2, v1, :cond_2

    invoke-static {}, LV/q;->D()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p3, p2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {v0, p1, v2}, LV/g1;->B(II)Ljava/lang/Object;

    move-result-object p2

    instance-of p3, p2, LV/o$a;

    if-eqz p3, :cond_0

    check-cast p2, LV/o$a;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, LV/o$a;->a()LV/o$b;

    move-result-object p2

    invoke-virtual {p2}, LV/o$b;->t()Ljava/util/Set;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LV/o;

    invoke-direct {p3}, LV/o;->c1()V

    iget-object v1, p0, LV/o;->c:LV/s;

    invoke-virtual {p3}, LV/o;->C0()LV/G;

    move-result-object p3

    invoke-virtual {v1, p3}, LV/s;->o(LV/G;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, p1}, LV/g1;->N(I)I

    move-result v3

    goto/16 :goto_6

    :cond_2
    invoke-virtual {v0, p1}, LV/g1;->J(I)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_6

    :cond_3
    invoke-virtual {v0, p1}, LV/g1;->e(I)Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-virtual {v0, p1}, LV/g1;->E(I)I

    move-result v1

    add-int/2addr v1, p1

    add-int/lit8 v4, p1, 0x1

    move v5, v2

    :goto_2
    if-ge v4, v1, :cond_9

    invoke-virtual {v0, v4}, LV/g1;->J(I)Z

    move-result v6

    if-eqz v6, :cond_4

    iget-object v7, p0, LV/o;->O:LW/b;

    invoke-virtual {v7}, LW/b;->i()V

    iget-object v7, p0, LV/o;->O:LW/b;

    invoke-virtual {v0, v4}, LV/g1;->L(I)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v7, v8}, LW/b;->v(Ljava/lang/Object;)V

    :cond_4
    if-nez v6, :cond_6

    if-eqz p2, :cond_5

    goto :goto_3

    :cond_5
    move v7, v2

    goto :goto_4

    :cond_6
    :goto_3
    move v7, v3

    :goto_4
    if-eqz v6, :cond_7

    move v8, v2

    goto :goto_5

    :cond_7
    add-int v8, p3, v5

    :goto_5
    invoke-static {p0, v4, v7, v8}, LV/o;->e1(LV/o;IZI)I

    move-result v7

    add-int/2addr v5, v7

    if-eqz v6, :cond_8

    iget-object v6, p0, LV/o;->O:LW/b;

    invoke-virtual {v6}, LW/b;->i()V

    iget-object v6, p0, LV/o;->O:LW/b;

    invoke-virtual {v6}, LW/b;->z()V

    :cond_8
    invoke-virtual {v0, v4}, LV/g1;->E(I)I

    move-result v6

    add-int/2addr v4, v6

    goto :goto_2

    :cond_9
    invoke-virtual {v0, p1}, LV/g1;->J(I)Z

    move-result p0

    if-eqz p0, :cond_a

    goto :goto_6

    :cond_a
    move v3, v5

    goto :goto_6

    :cond_b
    invoke-virtual {v0, p1}, LV/g1;->J(I)Z

    move-result p0

    if-eqz p0, :cond_1

    :goto_6
    return v3
.end method

.method private final f0()V
    .locals 4

    .prologue
    invoke-virtual {p0}, LV/o;->o()Z

    move-result v0

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl"

    if-eqz v0, :cond_0

    new-instance v0, LV/R0;

    invoke-virtual {p0}, LV/o;->C0()LV/G;

    move-result-object v2

    invoke-static {v2, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, LV/u;

    invoke-direct {v0, v2}, LV/R0;-><init>(LV/T0;)V

    iget-object v1, p0, LV/o;->F:LV/F1;

    invoke-virtual {v1, v0}, LV/F1;->h(Ljava/lang/Object;)Z

    invoke-virtual {p0, v0}, LV/o;->v1(Ljava/lang/Object;)V

    iget v1, p0, LV/o;->C:I

    invoke-virtual {v0, v1}, LV/R0;->I(I)V

    goto :goto_1

    :cond_0
    iget-object v0, p0, LV/o;->t:Ljava/util/List;

    iget-object v2, p0, LV/o;->I:LV/g1;

    invoke-virtual {v2}, LV/g1;->u()I

    move-result v2

    invoke-static {v0, v2}, LV/q;->l(Ljava/util/List;I)LV/Z;

    move-result-object v0

    iget-object v2, p0, LV/o;->I:LV/g1;

    invoke-virtual {v2}, LV/g1;->K()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, LV/n;->a:LV/n$a;

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    new-instance v2, LV/R0;

    invoke-virtual {p0}, LV/o;->C0()LV/G;

    move-result-object v3

    invoke-static {v3, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, LV/u;

    invoke-direct {v2, v3}, LV/R0;-><init>(LV/T0;)V

    invoke-virtual {p0, v2}, LV/o;->v1(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"

    invoke-static {v2, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, LV/R0;

    :goto_0
    if-nez v0, :cond_3

    invoke-virtual {v2}, LV/R0;->m()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v2, v1}, LV/R0;->D(Z)V

    :cond_2
    if-eqz v0, :cond_4

    :cond_3
    const/4 v1, 0x1

    :cond_4
    invoke-virtual {v2, v1}, LV/R0;->E(Z)V

    iget-object v0, p0, LV/o;->F:LV/F1;

    invoke-virtual {v0, v2}, LV/F1;->h(Ljava/lang/Object;)Z

    iget v0, p0, LV/o;->C:I

    invoke-virtual {v2, v0}, LV/R0;->I(I)V

    :goto_1
    return-void
.end method

.method private final h0()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LV/o;->j:LV/F0;

    const/4 v0, 0x0

    iput v0, p0, LV/o;->k:I

    iput v0, p0, LV/o;->l:I

    iput v0, p0, LV/o;->S:I

    iput-boolean v0, p0, LV/o;->s:Z

    iget-object v0, p0, LV/o;->O:LW/b;

    invoke-virtual {v0}, LW/b;->Q()V

    iget-object v0, p0, LV/o;->F:LV/F1;

    invoke-virtual {v0}, LV/F1;->a()V

    invoke-direct {p0}, LV/o;->i0()V

    return-void
.end method

.method private final h1()V
    .locals 2

    iget v0, p0, LV/o;->l:I

    iget-object v1, p0, LV/o;->I:LV/g1;

    invoke-virtual {v1}, LV/g1;->S()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, LV/o;->l:I

    return-void
.end method

.method private final i0()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LV/o;->o:[I

    iput-object v0, p0, LV/o;->p:Lr/A;

    return-void
.end method

.method private final i1()V
    .locals 1

    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-virtual {v0}, LV/g1;->v()I

    move-result v0

    iput v0, p0, LV/o;->l:I

    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-virtual {v0}, LV/g1;->T()V

    return-void
.end method

.method private final j1(ILjava/lang/Object;ILjava/lang/Object;)V
    .locals 13

    .prologue
    move-object v0, p0

    move v2, p1

    move-object v1, p2

    move/from16 v3, p3

    move-object/from16 v4, p4

    invoke-direct {p0}, LV/o;->y1()V

    iget v5, v0, LV/o;->m:I

    const/4 v6, 0x3

    if-nez v1, :cond_1

    if-eqz v4, :cond_0

    const/16 v7, 0xcf

    if-ne v2, v7, :cond_0

    sget-object v7, LV/n;->a:LV/n$a;

    invoke-virtual {v7}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v4, v7}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_0

    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->hashCode()I

    move-result v7

    invoke-virtual {p0}, LV/o;->L()I

    move-result v8

    invoke-static {v8, v6}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v8

    xor-int/2addr v7, v8

    :goto_0
    invoke-static {v7, v6}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v6

    xor-int/2addr v5, v6

    :goto_1
    iput v5, v0, LV/o;->S:I

    goto :goto_3

    :cond_0
    invoke-virtual {p0}, LV/o;->L()I

    move-result v7

    invoke-static {v7, v6}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v7

    xor-int/2addr v7, v2

    goto :goto_0

    :cond_1
    instance-of v5, v1, Ljava/lang/Enum;

    if-eqz v5, :cond_2

    move-object v5, v1

    check-cast v5, Ljava/lang/Enum;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    :goto_2
    invoke-virtual {p0}, LV/o;->L()I

    move-result v7

    invoke-static {v7, v6}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v7

    xor-int/2addr v5, v7

    invoke-static {v5, v6}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v5

    goto :goto_1

    :cond_2
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result v5

    goto :goto_2

    :goto_3
    const/4 v5, 0x1

    if-nez v1, :cond_3

    iget v6, v0, LV/o;->m:I

    add-int/2addr v6, v5

    iput v6, v0, LV/o;->m:I

    :cond_3
    sget-object v6, LV/V;->a:LV/V$a;

    invoke-virtual {v6}, LV/V$a;->a()I

    move-result v7

    const/4 v8, 0x0

    if-eq v3, v7, :cond_4

    move v7, v5

    goto :goto_4

    :cond_4
    move v7, v8

    :goto_4
    invoke-virtual {p0}, LV/o;->o()Z

    move-result v9

    const/4 v10, -0x1

    const/4 v11, 0x0

    if-eqz v9, :cond_a

    iget-object v3, v0, LV/o;->I:LV/g1;

    invoke-virtual {v3}, LV/g1;->c()V

    iget-object v3, v0, LV/o;->K:LV/k1;

    invoke-virtual {v3}, LV/k1;->a0()I

    move-result v3

    if-eqz v7, :cond_5

    iget-object v1, v0, LV/o;->K:LV/k1;

    sget-object v4, LV/n;->a:LV/n$a;

    invoke-virtual {v4}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, p1, v4}, LV/k1;->j1(ILjava/lang/Object;)V

    goto :goto_5

    :cond_5
    if-eqz v4, :cond_7

    iget-object v5, v0, LV/o;->K:LV/k1;

    if-nez v1, :cond_6

    sget-object v1, LV/n;->a:LV/n$a;

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    :cond_6
    invoke-virtual {v5, p1, v1, v4}, LV/k1;->f1(ILjava/lang/Object;Ljava/lang/Object;)V

    goto :goto_5

    :cond_7
    iget-object v4, v0, LV/o;->K:LV/k1;

    if-nez v1, :cond_8

    sget-object v1, LV/n;->a:LV/n$a;

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    :cond_8
    invoke-virtual {v4, p1, v1}, LV/k1;->h1(ILjava/lang/Object;)V

    :goto_5
    iget-object v8, v0, LV/o;->j:LV/F0;

    if-eqz v8, :cond_9

    new-instance v9, LV/c0;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {p0, v3}, LV/o;->K0(I)I

    move-result v5

    const/4 v6, -0x1

    const/4 v10, 0x0

    move-object v1, v9

    move v2, p1

    move-object v3, v4

    move v4, v5

    move v5, v6

    move v6, v10

    invoke-direct/range {v1 .. v6}, LV/c0;-><init>(ILjava/lang/Object;III)V

    iget v1, v0, LV/o;->k:I

    invoke-virtual {v8}, LV/F0;->e()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {v8, v9, v1}, LV/F0;->i(LV/c0;I)V

    invoke-virtual {v8, v9}, LV/F0;->h(LV/c0;)Z

    :cond_9
    invoke-direct {p0, v7, v11}, LV/o;->x0(ZLV/F0;)V

    return-void

    :cond_a
    invoke-virtual {v6}, LV/V$a;->b()I

    move-result v6

    if-eq v3, v6, :cond_b

    goto :goto_6

    :cond_b
    iget-boolean v3, v0, LV/o;->z:Z

    if-eqz v3, :cond_c

    move v3, v5

    goto :goto_7

    :cond_c
    :goto_6
    move v3, v8

    :goto_7
    iget-object v6, v0, LV/o;->j:LV/F0;

    if-nez v6, :cond_e

    iget-object v6, v0, LV/o;->I:LV/g1;

    invoke-virtual {v6}, LV/g1;->n()I

    move-result v6

    if-nez v3, :cond_d

    if-ne v6, v2, :cond_d

    iget-object v6, v0, LV/o;->I:LV/g1;

    invoke-virtual {v6}, LV/g1;->o()Ljava/lang/Object;

    move-result-object v6

    invoke-static {p2, v6}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-direct {p0, v7, v4}, LV/o;->m1(ZLjava/lang/Object;)V

    goto :goto_8

    :cond_d
    new-instance v6, LV/F0;

    iget-object v9, v0, LV/o;->I:LV/g1;

    invoke-virtual {v9}, LV/g1;->h()Ljava/util/List;

    move-result-object v9

    iget v12, v0, LV/o;->k:I

    invoke-direct {v6, v9, v12}, LV/F0;-><init>(Ljava/util/List;I)V

    iput-object v6, v0, LV/o;->j:LV/F0;

    :cond_e
    :goto_8
    iget-object v9, v0, LV/o;->j:LV/F0;

    if-eqz v9, :cond_16

    invoke-virtual {v9, p1, p2}, LV/F0;->d(ILjava/lang/Object;)LV/c0;

    move-result-object v6

    if-nez v3, :cond_10

    if-eqz v6, :cond_10

    invoke-virtual {v9, v6}, LV/F0;->h(LV/c0;)Z

    invoke-virtual {v6}, LV/c0;->b()I

    move-result v1

    invoke-virtual {v9, v6}, LV/F0;->g(LV/c0;)I

    move-result v2

    invoke-virtual {v9}, LV/F0;->e()I

    move-result v3

    add-int/2addr v2, v3

    iput v2, v0, LV/o;->k:I

    invoke-virtual {v9, v6}, LV/F0;->m(LV/c0;)I

    move-result v2

    invoke-virtual {v9}, LV/F0;->a()I

    move-result v3

    sub-int v3, v2, v3

    invoke-virtual {v9}, LV/F0;->a()I

    move-result v5

    invoke-virtual {v9, v2, v5}, LV/F0;->k(II)V

    iget-object v2, v0, LV/o;->O:LW/b;

    invoke-virtual {v2, v1}, LW/b;->x(I)V

    iget-object v2, v0, LV/o;->I:LV/g1;

    invoke-virtual {v2, v1}, LV/g1;->Q(I)V

    if-lez v3, :cond_f

    iget-object v1, v0, LV/o;->O:LW/b;

    invoke-virtual {v1, v3}, LW/b;->u(I)V

    :cond_f
    invoke-direct {p0, v7, v4}, LV/o;->m1(ZLjava/lang/Object;)V

    goto/16 :goto_b

    :cond_10
    iget-object v3, v0, LV/o;->I:LV/g1;

    invoke-virtual {v3}, LV/g1;->c()V

    iput-boolean v5, v0, LV/o;->R:Z

    iput-object v11, v0, LV/o;->M:LV/H0;

    invoke-direct {p0}, LV/o;->w0()V

    iget-object v3, v0, LV/o;->K:LV/k1;

    invoke-virtual {v3}, LV/k1;->I()V

    iget-object v3, v0, LV/o;->K:LV/k1;

    invoke-virtual {v3}, LV/k1;->a0()I

    move-result v3

    if-eqz v7, :cond_11

    iget-object v1, v0, LV/o;->K:LV/k1;

    sget-object v4, LV/n;->a:LV/n$a;

    invoke-virtual {v4}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, p1, v4}, LV/k1;->j1(ILjava/lang/Object;)V

    goto :goto_9

    :cond_11
    if-eqz v4, :cond_13

    iget-object v5, v0, LV/o;->K:LV/k1;

    if-nez v1, :cond_12

    sget-object v1, LV/n;->a:LV/n$a;

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    :cond_12
    invoke-virtual {v5, p1, v1, v4}, LV/k1;->f1(ILjava/lang/Object;Ljava/lang/Object;)V

    goto :goto_9

    :cond_13
    iget-object v4, v0, LV/o;->K:LV/k1;

    if-nez v1, :cond_14

    sget-object v1, LV/n;->a:LV/n$a;

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    :cond_14
    invoke-virtual {v4, p1, v1}, LV/k1;->h1(ILjava/lang/Object;)V

    :goto_9
    iget-object v1, v0, LV/o;->K:LV/k1;

    invoke-virtual {v1, v3}, LV/k1;->E(I)LV/d;

    move-result-object v1

    iput-object v1, v0, LV/o;->P:LV/d;

    new-instance v11, LV/c0;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {p0, v3}, LV/o;->K0(I)I

    move-result v5

    const/4 v6, -0x1

    const/4 v10, 0x0

    move-object v1, v11

    move v2, p1

    move-object v3, v4

    move v4, v5

    move v5, v6

    move v6, v10

    invoke-direct/range {v1 .. v6}, LV/c0;-><init>(ILjava/lang/Object;III)V

    iget v1, v0, LV/o;->k:I

    invoke-virtual {v9}, LV/F0;->e()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {v9, v11, v1}, LV/F0;->i(LV/c0;I)V

    invoke-virtual {v9, v11}, LV/F0;->h(LV/c0;)Z

    new-instance v11, LV/F0;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    if-eqz v7, :cond_15

    goto :goto_a

    :cond_15
    iget v8, v0, LV/o;->k:I

    :goto_a
    invoke-direct {v11, v1, v8}, LV/F0;-><init>(Ljava/util/List;I)V

    :cond_16
    :goto_b
    invoke-direct {p0, v7, v11}, LV/o;->x0(ZLV/F0;)V

    return-void
.end method

.method private final k0(IIII)I
    .locals 3

    .prologue
    if-ne p1, p3, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-direct {p0, v0, p1}, LV/o;->H0(LV/g1;I)I

    move-result v0

    const v1, 0x78cc281

    if-ne v0, v1, :cond_1

    move p4, v0

    goto :goto_1

    :cond_1
    iget-object v1, p0, LV/o;->I:LV/g1;

    invoke-virtual {v1, p1}, LV/g1;->P(I)I

    move-result v1

    if-ne v1, p3, :cond_2

    goto :goto_0

    :cond_2
    invoke-direct {p0, v1}, LV/o;->S0(I)I

    move-result v2

    invoke-direct {p0, v1, v2, p3, p4}, LV/o;->k0(IIII)I

    move-result p4

    :goto_0
    iget-object p3, p0, LV/o;->I:LV/g1;

    invoke-virtual {p3, p1}, LV/g1;->G(I)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p2, 0x0

    :cond_3
    const/4 p1, 0x3

    invoke-static {p4, p1}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result p3

    xor-int/2addr p3, v0

    invoke-static {p3, p1}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result p1

    xor-int/2addr p1, p2

    move p4, p1

    :goto_1
    return p4
.end method

.method private final k1(I)V
    .locals 2

    sget-object v0, LV/V;->a:LV/V$a;

    invoke-virtual {v0}, LV/V$a;->a()I

    move-result v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0, v1}, LV/o;->j1(ILjava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private final l0()V
    .locals 1

    iget-object v0, p0, LV/o;->K:LV/k1;

    invoke-virtual {v0}, LV/k1;->Z()Z

    move-result v0

    invoke-static {v0}, LV/q;->O(Z)V

    invoke-direct {p0}, LV/o;->A0()V

    return-void
.end method

.method private final l1(ILjava/lang/Object;)V
    .locals 2

    sget-object v0, LV/V;->a:LV/V$a;

    invoke-virtual {v0}, LV/V$a;->a()I

    move-result v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, LV/o;->j1(ILjava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private final m0()LV/H0;
    .locals 1

    .prologue
    iget-object v0, p0, LV/o;->M:LV/H0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-virtual {v0}, LV/g1;->u()I

    move-result v0

    invoke-direct {p0, v0}, LV/o;->n0(I)LV/H0;

    move-result-object v0

    return-object v0
.end method

.method private final m1(ZLjava/lang/Object;)V
    .locals 0

    .prologue
    if-eqz p1, :cond_0

    iget-object p1, p0, LV/o;->I:LV/g1;

    invoke-virtual {p1}, LV/g1;->V()V

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    iget-object p1, p0, LV/o;->I:LV/g1;

    invoke-virtual {p1}, LV/g1;->l()Ljava/lang/Object;

    move-result-object p1

    if-eq p1, p2, :cond_1

    iget-object p1, p0, LV/o;->O:LW/b;

    invoke-virtual {p1, p2}, LW/b;->X(Ljava/lang/Object;)V

    :cond_1
    iget-object p1, p0, LV/o;->I:LV/g1;

    invoke-virtual {p1}, LV/g1;->U()V

    :goto_0
    return-void
.end method

.method private final n0(I)LV/H0;
    .locals 5

    .prologue
    invoke-virtual {p0}, LV/o;->o()Z

    move-result v0

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"

    const/16 v2, 0xca

    if-eqz v0, :cond_1

    iget-boolean v0, p0, LV/o;->L:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, LV/o;->K:LV/k1;

    invoke-virtual {v0}, LV/k1;->c0()I

    move-result v0

    :goto_0
    if-lez v0, :cond_1

    iget-object v3, p0, LV/o;->K:LV/k1;

    invoke-virtual {v3, v0}, LV/k1;->i0(I)I

    move-result v3

    if-ne v3, v2, :cond_0

    iget-object v3, p0, LV/o;->K:LV/k1;

    invoke-virtual {v3, v0}, LV/k1;->j0(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {}, LV/q;->y()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object p1, p0, LV/o;->K:LV/k1;

    invoke-virtual {p1, v0}, LV/k1;->g0(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LV/H0;

    :goto_1
    iput-object p1, p0, LV/o;->M:LV/H0;

    return-object p1

    :cond_0
    iget-object v3, p0, LV/o;->K:LV/k1;

    invoke-virtual {v3, v0}, LV/k1;->E0(I)I

    move-result v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-virtual {v0}, LV/g1;->x()I

    move-result v0

    if-lez v0, :cond_5

    :goto_2
    if-lez p1, :cond_5

    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-virtual {v0, p1}, LV/g1;->C(I)I

    move-result v0

    if-ne v0, v2, :cond_4

    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-virtual {v0, p1}, LV/g1;->D(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LV/q;->y()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, LV/o;->w:LX/a;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, LX/a;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LV/H0;

    if-nez v0, :cond_3

    :cond_2
    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-virtual {v0, p1}, LV/g1;->z(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, LV/H0;

    :cond_3
    iput-object v0, p0, LV/o;->M:LV/H0;

    return-object v0

    :cond_4
    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-virtual {v0, p1}, LV/g1;->P(I)I

    move-result p1

    goto :goto_2

    :cond_5
    iget-object p1, p0, LV/o;->v:LV/H0;

    goto :goto_1
.end method

.method private final o1()V
    .locals 2

    .prologue
    const/4 v0, 0x0

    iput v0, p0, LV/o;->m:I

    iget-object v0, p0, LV/o;->d:LV/h1;

    invoke-virtual {v0}, LV/h1;->U()LV/g1;

    move-result-object v0

    iput-object v0, p0, LV/o;->I:LV/g1;

    const/16 v0, 0x64

    invoke-direct {p0, v0}, LV/o;->k1(I)V

    iget-object v0, p0, LV/o;->c:LV/s;

    invoke-virtual {v0}, LV/s;->p()V

    iget-object v0, p0, LV/o;->c:LV/s;

    invoke-virtual {v0}, LV/s;->f()LV/H0;

    move-result-object v0

    iput-object v0, p0, LV/o;->v:LV/H0;

    iget-object v0, p0, LV/o;->y:LV/X;

    iget-boolean v1, p0, LV/o;->x:Z

    invoke-static {v1}, LV/q;->d(Z)I

    move-result v1

    invoke-virtual {v0, v1}, LV/X;->j(I)V

    iget-object v0, p0, LV/o;->v:LV/H0;

    invoke-virtual {p0, v0}, LV/o;->S(Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p0, LV/o;->x:Z

    const/4 v0, 0x0

    iput-object v0, p0, LV/o;->M:LV/H0;

    iget-boolean v0, p0, LV/o;->q:Z

    if-nez v0, :cond_0

    iget-object v0, p0, LV/o;->c:LV/s;

    invoke-virtual {v0}, LV/s;->d()Z

    move-result v0

    iput-boolean v0, p0, LV/o;->q:Z

    :cond_0
    iget-boolean v0, p0, LV/o;->D:Z

    if-nez v0, :cond_1

    iget-object v0, p0, LV/o;->c:LV/s;

    invoke-virtual {v0}, LV/s;->e()Z

    move-result v0

    iput-boolean v0, p0, LV/o;->D:Z

    :cond_1
    iget-object v0, p0, LV/o;->v:LV/H0;

    invoke-static {}, Lg0/d;->a()LV/O0;

    move-result-object v1

    invoke-static {v0, v1}, LV/A;->b(LV/H0;LV/w;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    if-eqz v0, :cond_2

    iget-object v1, p0, LV/o;->d:LV/h1;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, LV/o;->c:LV/s;

    invoke-virtual {v1, v0}, LV/s;->m(Ljava/util/Set;)V

    :cond_2
    iget-object v0, p0, LV/o;->c:LV/s;

    invoke-virtual {v0}, LV/s;->g()I

    move-result v0

    invoke-direct {p0, v0}, LV/o;->k1(I)V

    return-void
.end method

.method private final q0(LX/f;Lx7/p;)V
    .locals 21

    .prologue
    move-object/from16 v1, p0

    move-object/from16 v0, p2

    const/4 v2, 0x1

    iget-boolean v3, v1, LV/o;->G:Z

    xor-int/2addr v3, v2

    if-nez v3, :cond_0

    const-string v3, "Reentrant composition is not supported"

    invoke-static {v3}, LV/q;->r(Ljava/lang/String;)V

    :cond_0
    const-string v3, "Compose:recompose"

    sget-object v4, LV/K1;->a:LV/K1;

    invoke-virtual {v4, v3}, LV/K1;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    :try_start_0
    invoke-static {}, Lf0/p;->H()Lf0/k;

    move-result-object v4

    invoke-virtual {v4}, Lf0/k;->f()I

    move-result v4

    iput v4, v1, LV/o;->C:I

    const/4 v4, 0x0

    iput-object v4, v1, LV/o;->w:LX/a;

    invoke-virtual/range {p1 .. p1}, LX/f;->d()Lr/K;

    move-result-object v5

    iget-object v6, v5, Lr/U;->b:[Ljava/lang/Object;

    iget-object v7, v5, Lr/U;->c:[Ljava/lang/Object;

    iget-object v5, v5, Lr/U;->a:[J

    array-length v8, v5

    const/4 v9, 0x2

    sub-int/2addr v8, v9

    if-ltz v8, :cond_6

    const/4 v11, 0x0

    :goto_0
    aget-wide v12, v5, v11

    not-long v14, v12

    const/16 v16, 0x7

    shl-long v14, v14, v16

    and-long/2addr v14, v12

    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v14, v14, v16

    cmp-long v14, v14, v16

    if-eqz v14, :cond_5

    sub-int v14, v11, v8

    not-int v14, v14

    ushr-int/lit8 v14, v14, 0x1f

    const/16 v15, 0x8

    rsub-int/lit8 v14, v14, 0x8

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v14, :cond_4

    const-wide/16 v17, 0xff

    and-long v17, v12, v17

    const-wide/16 v19, 0x80

    cmp-long v17, v17, v19

    if-gez v17, :cond_3

    shl-int/lit8 v17, v11, 0x3

    add-int v17, v17, v4

    aget-object v9, v6, v17

    aget-object v10, v7, v17

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"

    invoke-static {v9, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v9

    check-cast v2, LV/R0;

    move-object v2, v9

    check-cast v2, LV/R0;

    invoke-virtual {v2}, LV/R0;->i()LV/d;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, LV/d;->a()I

    move-result v2

    iget-object v15, v1, LV/o;->t:Ljava/util/List;

    check-cast v9, LV/R0;

    move-object/from16 v20, v5

    sget-object v5, LV/d1;->a:LV/d1;

    if-ne v10, v5, :cond_1

    const/4 v10, 0x0

    :cond_1
    new-instance v5, LV/Z;

    invoke-direct {v5, v9, v2, v10}, LV/Z;-><init>(LV/R0;ILjava/lang/Object;)V

    invoke-interface {v15, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_a

    :cond_2
    move-object/from16 v20, v5

    :goto_2
    const/16 v2, 0x8

    goto :goto_3

    :cond_3
    move-object/from16 v20, v5

    move v2, v15

    :goto_3
    shr-long/2addr v12, v2

    const/4 v5, 0x1

    add-int/2addr v4, v5

    move v15, v2

    move v2, v5

    move-object/from16 v5, v20

    const/4 v9, 0x2

    goto :goto_1

    :cond_4
    move-object/from16 v20, v5

    move v5, v2

    move v2, v15

    if-ne v14, v2, :cond_6

    goto :goto_4

    :cond_5
    move-object/from16 v20, v5

    move v5, v2

    :goto_4
    if-eq v11, v8, :cond_6

    add-int/2addr v11, v5

    move v2, v5

    move-object/from16 v5, v20

    const/4 v4, 0x0

    const/4 v9, 0x2

    goto/16 :goto_0

    :cond_6
    iget-object v2, v1, LV/o;->t:Ljava/util/List;

    invoke-static {}, LV/q;->g()Ljava/util/Comparator;

    move-result-object v4

    invoke-static {v2, v4}, Lj7/v;->B(Ljava/util/List;Ljava/util/Comparator;)V

    const/4 v2, 0x0

    iput v2, v1, LV/o;->k:I

    const/4 v2, 0x1

    iput-boolean v2, v1, LV/o;->G:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-direct/range {p0 .. p0}, LV/o;->o1()V

    invoke-virtual/range {p0 .. p0}, LV/o;->N0()Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v0, :cond_7

    if-eqz v0, :cond_7

    invoke-virtual {v1, v0}, LV/o;->v1(Ljava/lang/Object;)V

    goto :goto_5

    :catchall_1
    move-exception v0

    const/4 v2, 0x0

    goto :goto_9

    :cond_7
    :goto_5
    iget-object v4, v1, LV/o;->E:LV/o$c;

    invoke-static {}, LV/v1;->c()LX/b;

    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v5, v4}, LX/b;->d(Ljava/lang/Object;)Z

    const/16 v4, 0xc8

    if-eqz v0, :cond_8

    invoke-static {}, LV/q;->z()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v1, v4, v2}, LV/o;->l1(ILjava/lang/Object;)V

    invoke-static {v1, v0}, LV/c;->d(LV/n;Lx7/p;)V

    :goto_6
    invoke-direct/range {p0 .. p0}, LV/o;->t0()V

    goto :goto_7

    :catchall_2
    move-exception v0

    goto :goto_8

    :cond_8
    iget-boolean v0, v1, LV/o;->r:Z

    if-nez v0, :cond_9

    iget-boolean v0, v1, LV/o;->x:Z

    if-eqz v0, :cond_a

    :cond_9
    if-eqz v2, :cond_a

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    invoke-static {}, LV/q;->z()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {v1, v4, v0}, LV/o;->l1(ILjava/lang/Object;)V

    const/4 v0, 0x2

    invoke-static {v2, v0}, Ly7/W;->f(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx7/p;

    invoke-static {v1, v0}, LV/c;->d(LV/n;Lx7/p;)V

    goto :goto_6

    :cond_a
    invoke-virtual/range {p0 .. p0}, LV/o;->g1()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :goto_7
    :try_start_3
    invoke-virtual {v5}, LX/b;->t()I

    move-result v0

    const/4 v2, 0x1

    sub-int/2addr v0, v2

    invoke-virtual {v5, v0}, LX/b;->D(I)Ljava/lang/Object;

    invoke-direct/range {p0 .. p0}, LV/o;->v0()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const/4 v2, 0x0

    :try_start_4
    iput-boolean v2, v1, LV/o;->G:Z

    iget-object v0, v1, LV/o;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-direct/range {p0 .. p0}, LV/o;->l0()V

    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    sget-object v0, LV/K1;->a:LV/K1;

    invoke-virtual {v0, v3}, LV/K1;->b(Ljava/lang/Object;)V

    return-void

    :goto_8
    :try_start_5
    invoke-virtual {v5}, LX/b;->t()I

    move-result v2

    const/4 v4, 0x1

    sub-int/2addr v2, v4

    invoke-virtual {v5, v2}, LX/b;->D(I)Ljava/lang/Object;

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_9
    :try_start_6
    iput-boolean v2, v1, LV/o;->G:Z

    iget-object v2, v1, LV/o;->t:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    invoke-direct/range {p0 .. p0}, LV/o;->U()V

    invoke-direct/range {p0 .. p0}, LV/o;->l0()V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_a
    sget-object v2, LV/K1;->a:LV/K1;

    invoke-virtual {v2, v3}, LV/K1;->b(Ljava/lang/Object;)V

    throw v0
.end method

.method private final r0(II)V
    .locals 1

    .prologue
    if-lez p1, :cond_0

    if-eq p1, p2, :cond_0

    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-virtual {v0, p1}, LV/g1;->P(I)I

    move-result v0

    invoke-direct {p0, v0, p2}, LV/o;->r0(II)V

    iget-object p2, p0, LV/o;->I:LV/g1;

    invoke-virtual {p2, p1}, LV/g1;->J(I)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, LV/o;->O:LW/b;

    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-direct {p0, v0, p1}, LV/o;->P0(LV/g1;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, p1}, LW/b;->v(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private final r1(II)V
    .locals 7

    .prologue
    invoke-direct {p0, p1}, LV/o;->w1(I)I

    move-result v0

    if-eq v0, p2, :cond_3

    if-gez p1, :cond_1

    iget-object v0, p0, LV/o;->p:Lr/A;

    if-nez v0, :cond_0

    new-instance v0, Lr/A;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lr/A;-><init>(IILy7/k;)V

    iput-object v0, p0, LV/o;->p:Lr/A;

    :cond_0
    invoke-virtual {v0, p1, p2}, Lr/A;->q(II)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, LV/o;->o:[I

    if-nez v0, :cond_2

    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-virtual {v0}, LV/g1;->x()I

    move-result v0

    new-array v0, v0, [I

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v0

    invoke-static/range {v1 .. v6}, Lj7/n;->z([IIIIILjava/lang/Object;)V

    iput-object v0, p0, LV/o;->o:[I

    :cond_2
    aput p2, v0, p1

    :cond_3
    :goto_0
    return-void
.end method

.method private final s0(Z)V
    .locals 20

    .prologue
    move-object/from16 v0, p0

    iget-object v1, v0, LV/o;->n:LV/X;

    invoke-virtual {v1}, LV/X;->g()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-virtual/range {p0 .. p0}, LV/o;->o()Z

    move-result v3

    const/16 v4, 0xcf

    const/4 v5, 0x3

    if-eqz v3, :cond_3

    iget-object v3, v0, LV/o;->K:LV/k1;

    invoke-virtual {v3}, LV/k1;->c0()I

    move-result v3

    iget-object v6, v0, LV/o;->K:LV/k1;

    invoke-virtual {v6, v3}, LV/k1;->i0(I)I

    move-result v6

    iget-object v7, v0, LV/o;->K:LV/k1;

    invoke-virtual {v7, v3}, LV/k1;->j0(I)Ljava/lang/Object;

    move-result-object v7

    iget-object v8, v0, LV/o;->K:LV/k1;

    invoke-virtual {v8, v3}, LV/k1;->g0(I)Ljava/lang/Object;

    move-result-object v3

    if-nez v7, :cond_1

    if-eqz v3, :cond_0

    if-ne v6, v4, :cond_0

    sget-object v4, LV/n;->a:LV/n$a;

    invoke-virtual {v4}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    :goto_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, LV/o;->L()I

    move-result v4

    xor-int/2addr v1, v4

    invoke-static {v1, v5}, Ljava/lang/Integer;->rotateRight(II)I

    move-result v1

    xor-int/2addr v1, v3

    :goto_1
    invoke-static {v1, v5}, Ljava/lang/Integer;->rotateRight(II)I

    move-result v1

    iput v1, v0, LV/o;->S:I

    goto :goto_4

    :cond_0
    invoke-virtual/range {p0 .. p0}, LV/o;->L()I

    move-result v3

    xor-int/2addr v1, v3

    invoke-static {v1, v5}, Ljava/lang/Integer;->rotateRight(II)I

    move-result v1

    xor-int/2addr v1, v6

    goto :goto_1

    :cond_1
    instance-of v1, v7, Ljava/lang/Enum;

    if-eqz v1, :cond_2

    :goto_2
    check-cast v7, Ljava/lang/Enum;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    :goto_3
    invoke-virtual/range {p0 .. p0}, LV/o;->L()I

    move-result v3

    invoke-static {v3, v5}, Ljava/lang/Integer;->rotateRight(II)I

    move-result v3

    xor-int/2addr v1, v3

    goto :goto_1

    :cond_2
    invoke-virtual {v7}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_3

    :cond_3
    iget-object v3, v0, LV/o;->I:LV/g1;

    invoke-virtual {v3}, LV/g1;->u()I

    move-result v3

    iget-object v6, v0, LV/o;->I:LV/g1;

    invoke-virtual {v6, v3}, LV/g1;->C(I)I

    move-result v6

    iget-object v7, v0, LV/o;->I:LV/g1;

    invoke-virtual {v7, v3}, LV/g1;->D(I)Ljava/lang/Object;

    move-result-object v7

    iget-object v8, v0, LV/o;->I:LV/g1;

    invoke-virtual {v8, v3}, LV/g1;->z(I)Ljava/lang/Object;

    move-result-object v3

    if-nez v7, :cond_4

    if-eqz v3, :cond_0

    if-ne v6, v4, :cond_0

    sget-object v4, LV/n;->a:LV/n$a;

    invoke-virtual {v4}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_4
    instance-of v1, v7, Ljava/lang/Enum;

    if-eqz v1, :cond_2

    goto :goto_2

    :goto_4
    iget v1, v0, LV/o;->l:I

    iget-object v3, v0, LV/o;->j:LV/F0;

    if-eqz v3, :cond_b

    invoke-virtual {v3}, LV/F0;->b()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-lez v5, :cond_b

    invoke-virtual {v3}, LV/F0;->b()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v3}, LV/F0;->f()Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, Lf0/b;->e(Ljava/util/List;)Ljava/util/Set;

    move-result-object v7

    new-instance v8, Ljava/util/LinkedHashSet;

    invoke-direct {v8}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v9

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_5
    if-ge v11, v10, :cond_a

    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LV/c0;

    invoke-interface {v7, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_6

    invoke-virtual {v3, v14}, LV/F0;->g(LV/c0;)I

    move-result v15

    iget-object v2, v0, LV/o;->O:LW/b;

    invoke-virtual {v3}, LV/F0;->e()I

    move-result v16

    add-int v15, v15, v16

    invoke-virtual {v14}, LV/c0;->c()I

    move-result v4

    invoke-virtual {v2, v15, v4}, LW/b;->O(II)V

    invoke-virtual {v14}, LV/c0;->b()I

    move-result v2

    const/4 v4, 0x0

    invoke-virtual {v3, v2, v4}, LV/F0;->n(II)Z

    iget-object v2, v0, LV/o;->O:LW/b;

    invoke-virtual {v14}, LV/c0;->b()I

    move-result v4

    invoke-virtual {v2, v4}, LW/b;->x(I)V

    iget-object v2, v0, LV/o;->I:LV/g1;

    invoke-virtual {v14}, LV/c0;->b()I

    move-result v4

    invoke-virtual {v2, v4}, LV/g1;->Q(I)V

    invoke-direct/range {p0 .. p0}, LV/o;->X0()V

    iget-object v2, v0, LV/o;->I:LV/g1;

    invoke-virtual {v2}, LV/g1;->S()I

    iget-object v2, v0, LV/o;->t:Ljava/util/List;

    invoke-virtual {v14}, LV/c0;->b()I

    move-result v4

    invoke-virtual {v14}, LV/c0;->b()I

    move-result v15

    move-object/from16 v17, v7

    iget-object v7, v0, LV/o;->I:LV/g1;

    invoke-virtual {v14}, LV/c0;->b()I

    move-result v14

    invoke-virtual {v7, v14}, LV/g1;->E(I)I

    move-result v7

    add-int/2addr v15, v7

    invoke-static {v2, v4, v15}, LV/q;->m(Ljava/util/List;II)V

    :goto_6
    add-int/lit8 v11, v11, 0x1

    :cond_5
    move-object/from16 v7, v17

    :goto_7
    const/4 v2, 0x1

    goto :goto_5

    :cond_6
    move-object/from16 v17, v7

    invoke-interface {v8, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_6

    :cond_7
    if-ge v12, v9, :cond_5

    invoke-interface {v6, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LV/c0;

    if-eq v2, v14, :cond_9

    invoke-virtual {v3, v2}, LV/F0;->g(LV/c0;)I

    move-result v4

    invoke-interface {v8, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    if-eq v4, v13, :cond_8

    invoke-virtual {v3, v2}, LV/F0;->o(LV/c0;)I

    move-result v7

    iget-object v14, v0, LV/o;->O:LW/b;

    invoke-virtual {v3}, LV/F0;->e()I

    move-result v15

    add-int/2addr v15, v4

    invoke-virtual {v3}, LV/F0;->e()I

    move-result v18

    move-object/from16 v19, v6

    add-int v6, v13, v18

    invoke-virtual {v14, v15, v6, v7}, LW/b;->w(III)V

    invoke-virtual {v3, v4, v13, v7}, LV/F0;->j(III)V

    goto :goto_8

    :cond_8
    move-object/from16 v19, v6

    goto :goto_8

    :cond_9
    move-object/from16 v19, v6

    add-int/lit8 v11, v11, 0x1

    :goto_8
    add-int/lit8 v12, v12, 0x1

    invoke-virtual {v3, v2}, LV/F0;->o(LV/c0;)I

    move-result v2

    add-int/2addr v13, v2

    move-object/from16 v7, v17

    move-object/from16 v6, v19

    goto :goto_7

    :cond_a
    iget-object v2, v0, LV/o;->O:LW/b;

    invoke-virtual {v2}, LW/b;->i()V

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_b

    iget-object v2, v0, LV/o;->O:LW/b;

    iget-object v3, v0, LV/o;->I:LV/g1;

    invoke-virtual {v3}, LV/g1;->m()I

    move-result v3

    invoke-virtual {v2, v3}, LW/b;->x(I)V

    iget-object v2, v0, LV/o;->I:LV/g1;

    invoke-virtual {v2}, LV/g1;->T()V

    :cond_b
    iget v2, v0, LV/o;->k:I

    :goto_9
    iget-object v3, v0, LV/o;->I:LV/g1;

    invoke-virtual {v3}, LV/g1;->H()Z

    move-result v3

    if-nez v3, :cond_c

    iget-object v3, v0, LV/o;->I:LV/g1;

    invoke-virtual {v3}, LV/g1;->k()I

    move-result v3

    invoke-direct/range {p0 .. p0}, LV/o;->X0()V

    iget-object v4, v0, LV/o;->I:LV/g1;

    invoke-virtual {v4}, LV/g1;->S()I

    move-result v4

    iget-object v5, v0, LV/o;->O:LW/b;

    invoke-virtual {v5, v2, v4}, LW/b;->O(II)V

    iget-object v4, v0, LV/o;->t:Ljava/util/List;

    iget-object v5, v0, LV/o;->I:LV/g1;

    invoke-virtual {v5}, LV/g1;->k()I

    move-result v5

    invoke-static {v4, v3, v5}, LV/q;->m(Ljava/util/List;II)V

    goto :goto_9

    :cond_c
    invoke-virtual/range {p0 .. p0}, LV/o;->o()Z

    move-result v2

    if-eqz v2, :cond_e

    if-eqz p1, :cond_d

    iget-object v1, v0, LV/o;->Q:LW/c;

    invoke-virtual {v1}, LW/c;->c()V

    const/4 v1, 0x1

    :cond_d
    iget-object v3, v0, LV/o;->I:LV/g1;

    invoke-virtual {v3}, LV/g1;->f()V

    iget-object v3, v0, LV/o;->K:LV/k1;

    invoke-virtual {v3}, LV/k1;->c0()I

    move-result v3

    iget-object v4, v0, LV/o;->K:LV/k1;

    invoke-virtual {v4}, LV/k1;->T()I

    iget-object v4, v0, LV/o;->I:LV/g1;

    invoke-virtual {v4}, LV/g1;->t()Z

    move-result v4

    if-nez v4, :cond_13

    invoke-direct {v0, v3}, LV/o;->K0(I)I

    move-result v3

    iget-object v4, v0, LV/o;->K:LV/k1;

    invoke-virtual {v4}, LV/k1;->U()V

    iget-object v4, v0, LV/o;->K:LV/k1;

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, LV/k1;->L(Z)V

    iget-object v4, v0, LV/o;->P:LV/d;

    invoke-direct {v0, v4}, LV/o;->Y0(LV/d;)V

    const/4 v4, 0x0

    iput-boolean v4, v0, LV/o;->R:Z

    iget-object v5, v0, LV/o;->d:LV/h1;

    invoke-virtual {v5}, LV/h1;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_13

    invoke-direct {v0, v3, v4}, LV/o;->r1(II)V

    invoke-direct {v0, v3, v1}, LV/o;->s1(II)V

    goto :goto_a

    :cond_e
    const/4 v5, 0x1

    if-eqz p1, :cond_f

    iget-object v3, v0, LV/o;->O:LW/b;

    invoke-virtual {v3}, LW/b;->z()V

    :cond_f
    iget-object v3, v0, LV/o;->I:LV/g1;

    invoke-virtual {v3}, LV/g1;->w()I

    move-result v3

    if-lez v3, :cond_10

    iget-object v4, v0, LV/o;->O:LW/b;

    invoke-virtual {v4, v3}, LW/b;->V(I)V

    :cond_10
    iget-object v3, v0, LV/o;->O:LW/b;

    invoke-virtual {v3}, LW/b;->g()V

    iget-object v3, v0, LV/o;->I:LV/g1;

    invoke-virtual {v3}, LV/g1;->u()I

    move-result v3

    invoke-direct {v0, v3}, LV/o;->w1(I)I

    move-result v4

    if-eq v1, v4, :cond_11

    invoke-direct {v0, v3, v1}, LV/o;->s1(II)V

    :cond_11
    if-eqz p1, :cond_12

    move v1, v5

    :cond_12
    iget-object v3, v0, LV/o;->I:LV/g1;

    invoke-virtual {v3}, LV/g1;->g()V

    iget-object v3, v0, LV/o;->O:LW/b;

    invoke-virtual {v3}, LW/b;->i()V

    :cond_13
    :goto_a
    invoke-direct {v0, v1, v2}, LV/o;->y0(IZ)V

    return-void
.end method

.method private final s1(II)V
    .locals 5

    .prologue
    invoke-direct {p0, p1}, LV/o;->w1(I)I

    move-result v0

    if-eq v0, p2, :cond_3

    sub-int/2addr p2, v0

    iget-object v0, p0, LV/o;->i:LV/F1;

    invoke-virtual {v0}, LV/F1;->b()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    const/4 v1, -0x1

    if-eq p1, v1, :cond_3

    invoke-direct {p0, p1}, LV/o;->w1(I)I

    move-result v2

    add-int/2addr v2, p2

    invoke-direct {p0, p1, v2}, LV/o;->r1(II)V

    move v3, v0

    :goto_1
    if-ge v1, v3, :cond_1

    iget-object v4, p0, LV/o;->i:LV/F1;

    invoke-virtual {v4, v3}, LV/F1;->f(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LV/F0;

    if-eqz v4, :cond_0

    invoke-virtual {v4, p1, v2}, LV/F0;->n(II)Z

    move-result v4

    if-eqz v4, :cond_0

    add-int/lit8 v3, v3, -0x1

    move v0, v3

    goto :goto_2

    :cond_0
    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    :cond_1
    :goto_2
    if-gez p1, :cond_2

    iget-object p1, p0, LV/o;->I:LV/g1;

    invoke-virtual {p1}, LV/g1;->u()I

    move-result p1

    goto :goto_0

    :cond_2
    iget-object v1, p0, LV/o;->I:LV/g1;

    invoke-virtual {v1, p1}, LV/g1;->J(I)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, LV/o;->I:LV/g1;

    invoke-virtual {v1, p1}, LV/g1;->P(I)I

    move-result p1

    goto :goto_0

    :cond_3
    return-void
.end method

.method private final t0()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LV/o;->s0(Z)V

    return-void
.end method

.method private final t1(LV/H0;LV/H0;)LV/H0;
    .locals 2

    invoke-interface {p1}, LV/H0;->builder()LV/H0$a;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    invoke-interface {p1}, LV/H0$a;->i()LV/H0;

    move-result-object p1

    const/16 v0, 0xcc

    invoke-static {}, LV/q;->C()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p0, v0, v1}, LV/o;->l1(ILjava/lang/Object;)V

    invoke-direct {p0, p1}, LV/o;->u1(Ljava/lang/Object;)V

    invoke-direct {p0, p2}, LV/o;->u1(Ljava/lang/Object;)V

    invoke-direct {p0}, LV/o;->t0()V

    return-object p1
.end method

.method private final u1(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0}, LV/o;->N0()Ljava/lang/Object;

    invoke-virtual {p0, p1}, LV/o;->v1(Ljava/lang/Object;)V

    return-void
.end method

.method private final v0()V
    .locals 1

    invoke-direct {p0}, LV/o;->t0()V

    iget-object v0, p0, LV/o;->c:LV/s;

    invoke-virtual {v0}, LV/s;->b()V

    invoke-direct {p0}, LV/o;->t0()V

    iget-object v0, p0, LV/o;->O:LW/b;

    invoke-virtual {v0}, LW/b;->j()V

    invoke-direct {p0}, LV/o;->z0()V

    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-virtual {v0}, LV/g1;->d()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LV/o;->r:Z

    iget-object v0, p0, LV/o;->y:LV/X;

    invoke-virtual {v0}, LV/X;->i()I

    move-result v0

    invoke-static {v0}, LV/q;->c(I)Z

    move-result v0

    iput-boolean v0, p0, LV/o;->x:Z

    return-void
.end method

.method private final w0()V
    .locals 1

    .prologue
    iget-object v0, p0, LV/o;->K:LV/k1;

    invoke-virtual {v0}, LV/k1;->Z()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LV/o;->J:LV/h1;

    invoke-virtual {v0}, LV/h1;->V()LV/k1;

    move-result-object v0

    iput-object v0, p0, LV/o;->K:LV/k1;

    invoke-virtual {v0}, LV/k1;->W0()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LV/o;->L:Z

    const/4 v0, 0x0

    iput-object v0, p0, LV/o;->M:LV/H0;

    :cond_0
    return-void
.end method

.method private final w1(I)I
    .locals 3

    .prologue
    if-gez p1, :cond_1

    iget-object v0, p0, LV/o;->p:Lr/A;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lr/k;->a(I)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, p1}, Lr/k;->c(I)I

    move-result v1

    :cond_0
    return v1

    :cond_1
    iget-object v0, p0, LV/o;->o:[I

    if-eqz v0, :cond_2

    aget v0, v0, p1

    if-ltz v0, :cond_2

    return v0

    :cond_2
    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-virtual {v0, p1}, LV/g1;->N(I)I

    move-result p1

    return p1
.end method

.method private final x0(ZLV/F0;)V
    .locals 2

    .prologue
    iget-object v0, p0, LV/o;->i:LV/F1;

    iget-object v1, p0, LV/o;->j:LV/F0;

    invoke-virtual {v0, v1}, LV/F1;->h(Ljava/lang/Object;)Z

    iput-object p2, p0, LV/o;->j:LV/F0;

    iget-object p2, p0, LV/o;->n:LV/X;

    iget v0, p0, LV/o;->l:I

    invoke-virtual {p2, v0}, LV/X;->j(I)V

    iget-object p2, p0, LV/o;->n:LV/X;

    iget v0, p0, LV/o;->m:I

    invoke-virtual {p2, v0}, LV/X;->j(I)V

    iget-object p2, p0, LV/o;->n:LV/X;

    iget v0, p0, LV/o;->k:I

    invoke-virtual {p2, v0}, LV/X;->j(I)V

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    iput p2, p0, LV/o;->k:I

    :cond_0
    iput p2, p0, LV/o;->l:I

    iput p2, p0, LV/o;->m:I

    return-void
.end method

.method private final x1()V
    .locals 1

    .prologue
    iget-boolean v0, p0, LV/o;->s:Z

    if-nez v0, :cond_0

    const-string v0, "A call to createNode(), emitNode() or useNode() expected was not expected"

    invoke-static {v0}, LV/q;->r(Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, LV/o;->s:Z

    return-void
.end method

.method private final y0(IZ)V
    .locals 1

    .prologue
    iget-object v0, p0, LV/o;->i:LV/F1;

    invoke-virtual {v0}, LV/F1;->g()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LV/F0;

    if-eqz v0, :cond_0

    if-nez p2, :cond_0

    invoke-virtual {v0}, LV/F0;->a()I

    move-result p2

    add-int/lit8 p2, p2, 0x1

    invoke-virtual {v0, p2}, LV/F0;->l(I)V

    :cond_0
    iput-object v0, p0, LV/o;->j:LV/F0;

    iget-object p2, p0, LV/o;->n:LV/X;

    invoke-virtual {p2}, LV/X;->i()I

    move-result p2

    add-int/2addr p2, p1

    iput p2, p0, LV/o;->k:I

    iget-object p2, p0, LV/o;->n:LV/X;

    invoke-virtual {p2}, LV/X;->i()I

    move-result p2

    iput p2, p0, LV/o;->m:I

    iget-object p2, p0, LV/o;->n:LV/X;

    invoke-virtual {p2}, LV/X;->i()I

    move-result p2

    add-int/2addr p2, p1

    iput p2, p0, LV/o;->l:I

    return-void
.end method

.method private final y1()V
    .locals 1

    .prologue
    iget-boolean v0, p0, LV/o;->s:Z

    xor-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_0

    const-string v0, "A call to createNode(), emitNode() or useNode() expected"

    invoke-static {v0}, LV/q;->r(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private final z0()V
    .locals 1

    .prologue
    iget-object v0, p0, LV/o;->O:LW/b;

    invoke-virtual {v0}, LW/b;->m()V

    iget-object v0, p0, LV/o;->i:LV/F1;

    invoke-virtual {v0}, LV/F1;->c()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Start/end imbalance"

    invoke-static {v0}, LV/q;->r(Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0}, LV/o;->h0()V

    return-void
.end method


# virtual methods
.method public A()V
    .locals 1

    .prologue
    iget v0, p0, LV/o;->l:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-string v0, "No nodes can be emitted before calling skipAndEndGroup"

    invoke-static {v0}, LV/q;->r(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p0}, LV/o;->D0()LV/R0;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LV/R0;->z()V

    :cond_2
    iget-object v0, p0, LV/o;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0}, LV/o;->i1()V

    goto :goto_1

    :cond_3
    invoke-direct {p0}, LV/o;->W0()V

    :goto_1
    return-void
.end method

.method public B(Lx7/a;)V
    .locals 3

    .prologue
    invoke-direct {p0}, LV/o;->x1()V

    invoke-virtual {p0}, LV/o;->o()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "createNode() can only be called when inserting"

    invoke-static {v0}, LV/q;->r(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, LV/o;->n:LV/X;

    invoke-virtual {v0}, LV/X;->e()I

    move-result v0

    iget-object v1, p0, LV/o;->K:LV/k1;

    invoke-virtual {v1}, LV/k1;->c0()I

    move-result v2

    invoke-virtual {v1, v2}, LV/k1;->E(I)LV/d;

    move-result-object v1

    iget v2, p0, LV/o;->l:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, LV/o;->l:I

    iget-object v2, p0, LV/o;->Q:LW/c;

    invoke-virtual {v2, p1, v0, v1}, LW/c;->b(Lx7/a;ILV/d;)V

    return-void
.end method

.method public final B0()Z
    .locals 1

    .prologue
    iget v0, p0, LV/o;->B:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public C()Lm7/i;
    .locals 1

    iget-object v0, p0, LV/o;->c:LV/s;

    invoke-virtual {v0}, LV/s;->h()Lm7/i;

    move-result-object v0

    return-object v0
.end method

.method public C0()LV/G;
    .locals 1

    iget-object v0, p0, LV/o;->h:LV/G;

    return-object v0
.end method

.method public D(Ljava/lang/Object;Lx7/p;)V
    .locals 1

    .prologue
    invoke-virtual {p0}, LV/o;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LV/o;->Q:LW/c;

    invoke-virtual {v0, p1, p2}, LW/c;->f(Ljava/lang/Object;Lx7/p;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LV/o;->O:LW/b;

    invoke-virtual {v0, p1, p2}, LW/b;->Y(Ljava/lang/Object;Lx7/p;)V

    :goto_0
    return-void
.end method

.method public final D0()LV/R0;
    .locals 2

    .prologue
    iget-object v0, p0, LV/o;->F:LV/F1;

    iget v1, p0, LV/o;->B:I

    if-nez v1, :cond_0

    invoke-virtual {v0}, LV/F1;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, LV/F1;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LV/R0;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public E()V
    .locals 1

    invoke-direct {p0}, LV/o;->t0()V

    invoke-direct {p0}, LV/o;->t0()V

    iget-object v0, p0, LV/o;->y:LV/X;

    invoke-virtual {v0}, LV/X;->i()I

    move-result v0

    invoke-static {v0}, LV/q;->c(I)Z

    move-result v0

    iput-boolean v0, p0, LV/o;->x:Z

    const/4 v0, 0x0

    iput-object v0, p0, LV/o;->M:LV/H0;

    return-void
.end method

.method public final E0()LW/a;
    .locals 1

    iget-object v0, p0, LV/o;->N:LW/a;

    return-object v0
.end method

.method public F()LV/z;
    .locals 1

    invoke-direct {p0}, LV/o;->m0()LV/H0;

    move-result-object v0

    return-object v0
.end method

.method public G()Z
    .locals 2

    .prologue
    invoke-virtual {p0}, LV/o;->u()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-boolean v0, p0, LV/o;->x:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, LV/o;->D0()LV/R0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LV/R0;->l()Z

    move-result v0

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method

.method public final G0()LV/g1;
    .locals 1

    iget-object v0, p0, LV/o;->I:LV/g1;

    return-object v0
.end method

.method public H()V
    .locals 2

    .prologue
    invoke-direct {p0}, LV/o;->x1()V

    invoke-virtual {p0}, LV/o;->o()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_0

    const-string v0, "useNode() called while inserting"

    invoke-static {v0}, LV/q;->r(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-direct {p0, v0}, LV/o;->F0(LV/g1;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LV/o;->O:LW/b;

    invoke-virtual {v1, v0}, LW/b;->v(Ljava/lang/Object;)V

    iget-boolean v1, p0, LV/o;->z:Z

    if-eqz v1, :cond_1

    instance-of v1, v0, LV/l;

    if-eqz v1, :cond_1

    iget-object v1, p0, LV/o;->O:LW/b;

    invoke-virtual {v1, v0}, LW/b;->a0(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public I([LV/P0;)V
    .locals 6

    .prologue
    invoke-direct {p0}, LV/o;->m0()LV/H0;

    move-result-object v0

    const/16 v1, 0xc9

    invoke-static {}, LV/q;->B()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {p0, v1, v2}, LV/o;->l1(ILjava/lang/Object;)V

    invoke-virtual {p0}, LV/o;->o()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    const/4 v4, 0x0

    invoke-static {p1, v0, v4, v1, v4}, LV/A;->d([LV/P0;LV/H0;LV/H0;ILjava/lang/Object;)LV/H0;

    move-result-object p1

    invoke-direct {p0, v0, p1}, LV/o;->t1(LV/H0;LV/H0;)LV/H0;

    move-result-object p1

    iput-boolean v2, p0, LV/o;->L:Z

    goto :goto_2

    :cond_0
    iget-object v1, p0, LV/o;->I:LV/g1;

    invoke-virtual {v1, v3}, LV/g1;->A(I)Ljava/lang/Object;

    move-result-object v1

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"

    invoke-static {v1, v4}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LV/H0;

    iget-object v5, p0, LV/o;->I:LV/g1;

    invoke-virtual {v5, v2}, LV/g1;->A(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, v4}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, LV/H0;

    invoke-static {p1, v0, v5}, LV/A;->c([LV/P0;LV/H0;LV/H0;)LV/H0;

    move-result-object p1

    invoke-virtual {p0}, LV/o;->u()Z

    move-result v4

    if-eqz v4, :cond_2

    iget-boolean v4, p0, LV/o;->z:Z

    if-nez v4, :cond_2

    invoke-static {v5, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    invoke-direct {p0}, LV/o;->h1()V

    move-object p1, v1

    goto :goto_2

    :cond_2
    :goto_0
    invoke-direct {p0, v0, p1}, LV/o;->t1(LV/H0;LV/H0;)LV/H0;

    move-result-object p1

    iget-boolean v0, p0, LV/o;->z:Z

    if-nez v0, :cond_4

    invoke-static {p1, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    move v2, v3

    :cond_4
    :goto_1
    move v3, v2

    :goto_2
    if-eqz v3, :cond_5

    invoke-virtual {p0}, LV/o;->o()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-direct {p0, p1}, LV/o;->Z0(LV/H0;)V

    :cond_5
    iget-object v0, p0, LV/o;->y:LV/X;

    iget-boolean v1, p0, LV/o;->x:Z

    invoke-static {v1}, LV/q;->d(Z)I

    move-result v1

    invoke-virtual {v0, v1}, LV/X;->j(I)V

    iput-boolean v3, p0, LV/o;->x:Z

    iput-object p1, p0, LV/o;->M:LV/H0;

    invoke-static {}, LV/q;->y()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LV/V;->a:LV/V$a;

    invoke-virtual {v1}, LV/V$a;->a()I

    move-result v1

    const/16 v2, 0xca

    invoke-direct {p0, v2, v0, v1, p1}, LV/o;->j1(ILjava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method public J()V
    .locals 0

    invoke-direct {p0}, LV/o;->t0()V

    return-void
.end method

.method public J0(Ljava/util/List;)V
    .locals 0

    .prologue
    :try_start_0
    invoke-direct {p0, p1}, LV/o;->I0(Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-direct {p0}, LV/o;->h0()V

    return-void

    :catchall_0
    move-exception p1

    invoke-direct {p0}, LV/o;->U()V

    throw p1
.end method

.method public K(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, LV/o;->q1(Ljava/lang/Object;)V

    return-void
.end method

.method public L()I
    .locals 1

    iget v0, p0, LV/o;->S:I

    return v0
.end method

.method public M()LV/s;
    .locals 9

    .prologue
    const/16 v0, 0xce

    invoke-static {}, LV/q;->D()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p0, v0, v1}, LV/o;->l1(ILjava/lang/Object;)V

    invoke-virtual {p0}, LV/o;->o()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, LV/o;->K:LV/k1;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1}, LV/k1;->t0(LV/k1;IILjava/lang/Object;)V

    :cond_0
    invoke-virtual {p0}, LV/o;->N0()Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, LV/o$a;

    if-eqz v2, :cond_1

    check-cast v0, LV/o$a;

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_4

    new-instance v0, LV/o$a;

    new-instance v8, LV/o$b;

    invoke-virtual {p0}, LV/o;->L()I

    move-result v4

    iget-boolean v5, p0, LV/o;->q:Z

    iget-boolean v6, p0, LV/o;->D:Z

    invoke-virtual {p0}, LV/o;->C0()LV/G;

    move-result-object v2

    instance-of v3, v2, LV/u;

    if-eqz v3, :cond_2

    check-cast v2, LV/u;

    goto :goto_1

    :cond_2
    move-object v2, v1

    :goto_1
    if-eqz v2, :cond_3

    invoke-virtual {v2}, LV/u;->G()LV/B;

    move-result-object v1

    :cond_3
    move-object v7, v1

    move-object v2, v8

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, LV/o$b;-><init>(LV/o;IZZLV/B;)V

    invoke-direct {v0, v8}, LV/o$a;-><init>(LV/o$b;)V

    invoke-virtual {p0, v0}, LV/o;->v1(Ljava/lang/Object;)V

    :cond_4
    invoke-virtual {v0}, LV/o$a;->a()LV/o$b;

    move-result-object v1

    invoke-direct {p0}, LV/o;->m0()LV/H0;

    move-result-object v2

    invoke-virtual {v1, v2}, LV/o$b;->w(LV/H0;)V

    invoke-direct {p0}, LV/o;->t0()V

    invoke-virtual {v0}, LV/o$a;->a()LV/o$b;

    move-result-object v0

    return-object v0
.end method

.method public final M0()Z
    .locals 1

    iget-boolean v0, p0, LV/o;->G:Z

    return v0
.end method

.method public N()V
    .locals 0

    invoke-direct {p0}, LV/o;->t0()V

    return-void
.end method

.method public final N0()Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-virtual {p0}, LV/o;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LV/o;->y1()V

    :goto_0
    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-virtual {v0}, LV/g1;->K()Ljava/lang/Object;

    move-result-object v0

    iget-boolean v1, p0, LV/o;->z:Z

    if-eqz v1, :cond_1

    instance-of v1, v0, LV/c1;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    return-object v0
.end method

.method public O()V
    .locals 1

    invoke-direct {p0}, LV/o;->t0()V

    invoke-direct {p0}, LV/o;->t0()V

    iget-object v0, p0, LV/o;->y:LV/X;

    invoke-virtual {v0}, LV/X;->i()I

    move-result v0

    invoke-static {v0}, LV/q;->c(I)Z

    move-result v0

    iput-boolean v0, p0, LV/o;->x:Z

    const/4 v0, 0x0

    iput-object v0, p0, LV/o;->M:LV/H0;

    return-void
.end method

.method public final O0()Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-virtual {p0}, LV/o;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LV/o;->y1()V

    :goto_0
    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-virtual {v0}, LV/g1;->K()Ljava/lang/Object;

    move-result-object v0

    iget-boolean v1, p0, LV/o;->z:Z

    if-eqz v1, :cond_1

    instance-of v1, v0, LV/c1;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    instance-of v1, v0, LV/a1;

    if-eqz v1, :cond_2

    check-cast v0, LV/a1;

    invoke-virtual {v0}, LV/a1;->b()LV/Z0;

    move-result-object v0

    :cond_2
    :goto_1
    return-object v0
.end method

.method public P()V
    .locals 0

    invoke-direct {p0}, LV/o;->t0()V

    return-void
.end method

.method public Q()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LV/o;->s0(Z)V

    return-void
.end method

.method public R()V
    .locals 2

    .prologue
    invoke-direct {p0}, LV/o;->t0()V

    invoke-virtual {p0}, LV/o;->D0()LV/R0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LV/R0;->q()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LV/R0;->B(Z)V

    :cond_0
    return-void
.end method

.method public final R0(Lx7/a;)V
    .locals 2

    .prologue
    iget-boolean v0, p0, LV/o;->G:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-nez v0, :cond_0

    const-string v0, "Preparing a composition while composing is not supported"

    invoke-static {v0}, LV/q;->r(Ljava/lang/String;)V

    :cond_0
    iput-boolean v1, p0, LV/o;->G:Z

    const/4 v0, 0x0

    :try_start_0
    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v0, p0, LV/o;->G:Z

    return-void

    :catchall_0
    move-exception p1

    iput-boolean v0, p0, LV/o;->G:Z

    throw p1
.end method

.method public S(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    invoke-virtual {p0}, LV/o;->N0()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, LV/o;->v1(Ljava/lang/Object;)V

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public T(I)V
    .locals 8

    .prologue
    iget-object v0, p0, LV/o;->j:LV/F0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v0, LV/V;->a:LV/V$a;

    invoke-virtual {v0}, LV/V$a;->a()I

    move-result v0

    invoke-direct {p0, p1, v1, v0, v1}, LV/o;->j1(ILjava/lang/Object;ILjava/lang/Object;)V

    return-void

    :cond_0
    invoke-direct {p0}, LV/o;->y1()V

    iget v0, p0, LV/o;->m:I

    invoke-virtual {p0}, LV/o;->L()I

    move-result v2

    const/4 v3, 0x3

    invoke-static {v2, v3}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v2

    xor-int/2addr v2, p1

    invoke-static {v2, v3}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v2

    xor-int/2addr v0, v2

    iput v0, p0, LV/o;->S:I

    iget v0, p0, LV/o;->m:I

    const/4 v2, 0x1

    add-int/2addr v0, v2

    iput v0, p0, LV/o;->m:I

    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-virtual {p0}, LV/o;->o()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-virtual {v0}, LV/g1;->c()V

    iget-object v0, p0, LV/o;->K:LV/k1;

    sget-object v2, LV/n;->a:LV/n$a;

    invoke-virtual {v2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, p1, v2}, LV/k1;->h1(ILjava/lang/Object;)V

    invoke-direct {p0, v4, v1}, LV/o;->x0(ZLV/F0;)V

    return-void

    :cond_1
    invoke-virtual {v0}, LV/g1;->n()I

    move-result v3

    if-ne v3, p1, :cond_2

    invoke-virtual {v0}, LV/g1;->s()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v0}, LV/g1;->U()V

    invoke-direct {p0, v4, v1}, LV/o;->x0(ZLV/F0;)V

    return-void

    :cond_2
    invoke-virtual {v0}, LV/g1;->H()Z

    move-result v3

    if-nez v3, :cond_3

    iget v3, p0, LV/o;->k:I

    invoke-virtual {v0}, LV/g1;->k()I

    move-result v5

    invoke-direct {p0}, LV/o;->X0()V

    invoke-virtual {v0}, LV/g1;->S()I

    move-result v6

    iget-object v7, p0, LV/o;->O:LW/b;

    invoke-virtual {v7, v3, v6}, LW/b;->O(II)V

    iget-object v3, p0, LV/o;->t:Ljava/util/List;

    invoke-virtual {v0}, LV/g1;->k()I

    move-result v6

    invoke-static {v3, v5, v6}, LV/q;->m(Ljava/util/List;II)V

    :cond_3
    invoke-virtual {v0}, LV/g1;->c()V

    iput-boolean v2, p0, LV/o;->R:Z

    iput-object v1, p0, LV/o;->M:LV/H0;

    invoke-direct {p0}, LV/o;->w0()V

    iget-object v0, p0, LV/o;->K:LV/k1;

    invoke-virtual {v0}, LV/k1;->I()V

    invoke-virtual {v0}, LV/k1;->a0()I

    move-result v2

    sget-object v3, LV/n;->a:LV/n$a;

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, p1, v3}, LV/k1;->h1(ILjava/lang/Object;)V

    invoke-virtual {v0, v2}, LV/k1;->E(I)LV/d;

    move-result-object p1

    iput-object p1, p0, LV/o;->P:LV/d;

    invoke-direct {p0, v4, v1}, LV/o;->x0(ZLV/F0;)V

    return-void
.end method

.method public final T0(LX/f;)Z
    .locals 1

    .prologue
    iget-object v0, p0, LV/o;->f:LW/a;

    invoke-virtual {v0}, LW/a;->c()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Expected applyChanges() to have been called"

    invoke-static {v0}, LV/q;->r(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p1}, LX/f;->e()I

    move-result v0

    if-gtz v0, :cond_2

    iget-object v0, p0, LV/o;->t:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_2

    iget-boolean v0, p0, LV/o;->r:Z

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_0
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LV/o;->q0(LX/f;Lx7/p;)V

    iget-object p1, p0, LV/o;->f:LW/a;

    invoke-virtual {p1}, LW/a;->d()Z

    move-result p1

    return p1
.end method

.method public a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LV/o;->q:Z

    iput-boolean v0, p0, LV/o;->D:Z

    iget-object v0, p0, LV/o;->d:LV/h1;

    invoke-virtual {v0}, LV/h1;->s()V

    iget-object v0, p0, LV/o;->J:LV/h1;

    invoke-virtual {v0}, LV/h1;->s()V

    iget-object v0, p0, LV/o;->K:LV/k1;

    invoke-virtual {v0}, LV/k1;->v1()V

    return-void
.end method

.method public b()LV/Q0;
    .locals 1

    invoke-virtual {p0}, LV/o;->D0()LV/R0;

    move-result-object v0

    return-object v0
.end method

.method public c(LV/P0;)V
    .locals 8

    .prologue
    invoke-direct {p0}, LV/o;->m0()LV/H0;

    move-result-object v0

    const/16 v1, 0xc9

    invoke-static {}, LV/q;->B()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {p0, v1, v2}, LV/o;->l1(ILjava/lang/Object;)V

    invoke-virtual {p0}, LV/o;->g()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, LV/n;->a:LV/n$a;

    invoke-virtual {v2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>"

    invoke-static {v1, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LV/M1;

    :goto_0
    invoke-virtual {p1}, LV/P0;->b()LV/w;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>"

    invoke-static {v2, v3}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>"

    invoke-static {p1, v3}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p1, v1}, LV/w;->b(LV/P0;LV/M1;)LV/M1;

    move-result-object v3

    invoke-static {v3, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v4, 0x1

    xor-int/2addr v1, v4

    if-eqz v1, :cond_1

    invoke-virtual {p0, v3}, LV/o;->K(Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {p0}, LV/o;->o()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_4

    invoke-virtual {p1}, LV/P0;->a()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-static {v0, v2}, LV/A;->a(LV/H0;LV/w;)Z

    move-result p1

    if-nez p1, :cond_3

    :cond_2
    invoke-interface {v0, v2, v3}, LV/H0;->n(LV/w;LV/M1;)LV/H0;

    move-result-object v0

    :cond_3
    iput-boolean v4, p0, LV/o;->L:Z

    goto :goto_4

    :cond_4
    iget-object v5, p0, LV/o;->I:LV/g1;

    invoke-virtual {v5}, LV/g1;->k()I

    move-result v7

    invoke-virtual {v5, v7}, LV/g1;->z(I)Ljava/lang/Object;

    move-result-object v5

    const-string v7, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"

    invoke-static {v5, v7}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, LV/H0;

    invoke-virtual {p0}, LV/o;->u()Z

    move-result v7

    if-eqz v7, :cond_5

    if-eqz v1, :cond_6

    :cond_5
    invoke-virtual {p1}, LV/P0;->a()Z

    move-result p1

    if-nez p1, :cond_7

    invoke-static {v0, v2}, LV/A;->a(LV/H0;LV/w;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_1

    :cond_6
    move-object v0, v5

    goto :goto_2

    :cond_7
    :goto_1
    invoke-interface {v0, v2, v3}, LV/H0;->n(LV/w;LV/M1;)LV/H0;

    move-result-object p1

    move-object v0, p1

    :goto_2
    iget-boolean p1, p0, LV/o;->z:Z

    if-nez p1, :cond_9

    if-eq v5, v0, :cond_8

    goto :goto_3

    :cond_8
    move v4, v6

    :cond_9
    :goto_3
    move v6, v4

    :goto_4
    if-eqz v6, :cond_a

    invoke-virtual {p0}, LV/o;->o()Z

    move-result p1

    if-nez p1, :cond_a

    invoke-direct {p0, v0}, LV/o;->Z0(LV/H0;)V

    :cond_a
    iget-object p1, p0, LV/o;->y:LV/X;

    iget-boolean v1, p0, LV/o;->x:Z

    invoke-static {v1}, LV/q;->d(Z)I

    move-result v1

    invoke-virtual {p1, v1}, LV/X;->j(I)V

    iput-boolean v6, p0, LV/o;->x:Z

    iput-object v0, p0, LV/o;->M:LV/H0;

    invoke-static {}, LV/q;->y()Ljava/lang/Object;

    move-result-object p1

    sget-object v1, LV/V;->a:LV/V$a;

    invoke-virtual {v1}, LV/V$a;->a()I

    move-result v1

    const/16 v2, 0xca

    invoke-direct {p0, v2, p1, v1, v0}, LV/o;->j1(ILjava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method public d(Z)Z
    .locals 2

    .prologue
    invoke-virtual {p0}, LV/o;->N0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Boolean;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1}, LV/o;->v1(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public e()V
    .locals 3

    .prologue
    iget-boolean v0, p0, LV/o;->z:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-virtual {v0}, LV/g1;->u()I

    move-result v0

    iget v2, p0, LV/o;->A:I

    if-ne v0, v2, :cond_0

    const/4 v0, -0x1

    iput v0, p0, LV/o;->A:I

    iput-boolean v1, p0, LV/o;->z:Z

    :cond_0
    invoke-direct {p0, v1}, LV/o;->s0(Z)V

    return-void
.end method

.method public f(I)V
    .locals 2

    sget-object v0, LV/V;->a:LV/V$a;

    invoke-virtual {v0}, LV/V$a;->a()I

    move-result v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0, v1}, LV/o;->j1(ILjava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method public final f1(LV/g1;)V
    .locals 0

    iput-object p1, p0, LV/o;->I:LV/g1;

    return-void
.end method

.method public g()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LV/o;->O0()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final g0()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LV/o;->w:LX/a;

    return-void
.end method

.method public g1()V
    .locals 9

    .prologue
    iget-object v0, p0, LV/o;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, LV/o;->h1()V

    goto/16 :goto_7

    :cond_0
    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-virtual {v0}, LV/g1;->n()I

    move-result v1

    invoke-virtual {v0}, LV/g1;->o()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0}, LV/g1;->l()Ljava/lang/Object;

    move-result-object v3

    iget v4, p0, LV/o;->m:I

    const/16 v5, 0xcf

    const/4 v6, 0x3

    if-nez v2, :cond_2

    if-eqz v3, :cond_1

    if-ne v1, v5, :cond_1

    sget-object v7, LV/n;->a:LV/n$a;

    invoke-virtual {v7}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v3, v7}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v7

    invoke-virtual {p0}, LV/o;->L()I

    move-result v8

    invoke-static {v8, v6}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v8

    xor-int/2addr v7, v8

    :goto_0
    invoke-static {v7, v6}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v7

    xor-int/2addr v7, v4

    :goto_1
    iput v7, p0, LV/o;->S:I

    goto :goto_3

    :cond_1
    invoke-virtual {p0}, LV/o;->L()I

    move-result v7

    invoke-static {v7, v6}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v7

    xor-int/2addr v7, v1

    goto :goto_0

    :cond_2
    instance-of v7, v2, Ljava/lang/Enum;

    if-eqz v7, :cond_3

    move-object v7, v2

    check-cast v7, Ljava/lang/Enum;

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    :goto_2
    invoke-virtual {p0}, LV/o;->L()I

    move-result v8

    invoke-static {v8, v6}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v8

    xor-int/2addr v7, v8

    invoke-static {v7, v6}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v7

    goto :goto_1

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v7

    goto :goto_2

    :goto_3
    invoke-virtual {v0}, LV/g1;->I()Z

    move-result v7

    const/4 v8, 0x0

    invoke-direct {p0, v7, v8}, LV/o;->m1(ZLjava/lang/Object;)V

    invoke-direct {p0}, LV/o;->W0()V

    invoke-virtual {v0}, LV/g1;->g()V

    if-nez v2, :cond_5

    if-eqz v3, :cond_4

    if-ne v1, v5, :cond_4

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v3, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {p0}, LV/o;->L()I

    move-result v1

    xor-int/2addr v1, v4

    :goto_4
    invoke-static {v1, v6}, Ljava/lang/Integer;->rotateRight(II)I

    move-result v1

    xor-int/2addr v0, v1

    :goto_5
    invoke-static {v0, v6}, Ljava/lang/Integer;->rotateRight(II)I

    move-result v0

    iput v0, p0, LV/o;->S:I

    goto :goto_7

    :cond_4
    invoke-virtual {p0}, LV/o;->L()I

    move-result v0

    xor-int/2addr v0, v4

    invoke-static {v0, v6}, Ljava/lang/Integer;->rotateRight(II)I

    move-result v0

    xor-int/2addr v0, v1

    goto :goto_5

    :cond_5
    instance-of v0, v2, Ljava/lang/Enum;

    if-eqz v0, :cond_6

    check-cast v2, Ljava/lang/Enum;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    :goto_6
    invoke-virtual {p0}, LV/o;->L()I

    move-result v1

    goto :goto_4

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_6

    :goto_7
    return-void
.end method

.method public h(F)Z
    .locals 2

    .prologue
    invoke-virtual {p0}, LV/o;->N0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Float;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    cmpg-float v0, p1, v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p0, p1}, LV/o;->v1(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public i(I)Z
    .locals 2

    .prologue
    invoke-virtual {p0}, LV/o;->N0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, LV/o;->v1(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public j(J)Z
    .locals 2

    .prologue
    invoke-virtual {p0}, LV/o;->N0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Long;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p0, p1}, LV/o;->v1(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final j0(LX/f;Lx7/p;)V
    .locals 1

    .prologue
    iget-object v0, p0, LV/o;->f:LW/a;

    invoke-virtual {v0}, LW/a;->c()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Expected applyChanges() to have been called"

    invoke-static {v0}, LV/q;->r(Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0, p1, p2}, LV/o;->q0(LX/f;Lx7/p;)V

    return-void
.end method

.method public k()Lg0/a;
    .locals 1

    iget-object v0, p0, LV/o;->d:LV/h1;

    return-object v0
.end method

.method public l(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    invoke-virtual {p0}, LV/o;->N0()Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p1, :cond_0

    invoke-virtual {p0, p1}, LV/o;->v1(Ljava/lang/Object;)V

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public m(Lx7/a;)V
    .locals 1

    iget-object v0, p0, LV/o;->O:LW/b;

    invoke-virtual {v0, p1}, LW/b;->T(Lx7/a;)V

    return-void
.end method

.method public n(LV/w;)Ljava/lang/Object;
    .locals 1

    invoke-direct {p0}, LV/o;->m0()LV/H0;

    move-result-object v0

    invoke-static {v0, p1}, LV/A;->b(LV/H0;LV/w;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final n1()V
    .locals 1

    const/16 v0, 0x64

    iput v0, p0, LV/o;->A:I

    const/4 v0, 0x1

    iput-boolean v0, p0, LV/o;->z:Z

    return-void
.end method

.method public o()Z
    .locals 1

    iget-boolean v0, p0, LV/o;->R:Z

    return v0
.end method

.method public final o0()V
    .locals 1

    iget-object v0, p0, LV/o;->F:LV/F1;

    invoke-virtual {v0}, LV/F1;->a()V

    iget-object v0, p0, LV/o;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, LV/o;->f:LW/a;

    invoke-virtual {v0}, LW/a;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, LV/o;->w:LX/a;

    return-void
.end method

.method public p(Z)V
    .locals 2

    .prologue
    iget v0, p0, LV/o;->l:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-string v0, "No nodes can be emitted before calling dactivateToEndGroup"

    invoke-static {v0}, LV/q;->r(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p0}, LV/o;->o()Z

    move-result v0

    if-nez v0, :cond_3

    if-nez p1, :cond_2

    invoke-direct {p0}, LV/o;->i1()V

    return-void

    :cond_2
    iget-object p1, p0, LV/o;->I:LV/g1;

    invoke-virtual {p1}, LV/g1;->k()I

    move-result p1

    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-virtual {v0}, LV/g1;->j()I

    move-result v0

    iget-object v1, p0, LV/o;->O:LW/b;

    invoke-virtual {v1}, LW/b;->d()V

    iget-object v1, p0, LV/o;->t:Ljava/util/List;

    invoke-static {v1, p1, v0}, LV/q;->m(Ljava/util/List;II)V

    iget-object p1, p0, LV/o;->I:LV/g1;

    invoke-virtual {p1}, LV/g1;->T()V

    :cond_3
    return-void
.end method

.method public final p0()V
    .locals 3

    .prologue
    sget-object v0, LV/K1;->a:LV/K1;

    const-string v1, "Compose:Composer.dispose"

    invoke-virtual {v0, v1}, LV/K1;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    :try_start_0
    iget-object v2, p0, LV/o;->c:LV/s;

    invoke-virtual {v2, p0}, LV/s;->q(LV/n;)V

    invoke-virtual {p0}, LV/o;->o0()V

    invoke-virtual {p0}, LV/o;->v()LV/g;

    move-result-object v2

    invoke-interface {v2}, LV/g;->clear()V

    const/4 v2, 0x1

    iput-boolean v2, p0, LV/o;->H:Z

    sget-object v2, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0, v1}, LV/K1;->b(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception v0

    sget-object v2, LV/K1;->a:LV/K1;

    invoke-virtual {v2, v1}, LV/K1;->b(Ljava/lang/Object;)V

    throw v0
.end method

.method public final p1(LV/R0;Ljava/lang/Object;)Z
    .locals 3

    .prologue
    invoke-virtual {p1}, LV/R0;->i()LV/d;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v2, p0, LV/o;->I:LV/g1;

    invoke-virtual {v2}, LV/g1;->y()LV/h1;

    move-result-object v2

    invoke-virtual {v0, v2}, LV/d;->d(LV/h1;)I

    move-result v0

    iget-boolean v2, p0, LV/o;->G:Z

    if-eqz v2, :cond_1

    iget-object v2, p0, LV/o;->I:LV/g1;

    invoke-virtual {v2}, LV/g1;->k()I

    move-result v2

    if-lt v0, v2, :cond_1

    iget-object v1, p0, LV/o;->t:Ljava/util/List;

    invoke-static {v1, v0, p1, p2}, LV/q;->i(Ljava/util/List;ILV/R0;Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public q()V
    .locals 3

    sget-object v0, LV/V;->a:LV/V$a;

    invoke-virtual {v0}, LV/V$a;->a()I

    move-result v0

    const/16 v1, -0x7f

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2, v0, v2}, LV/o;->j1(ILjava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method public final q1(Ljava/lang/Object;)V
    .locals 2

    .prologue
    instance-of v0, p1, LV/Z0;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LV/o;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LV/o;->O:LW/b;

    move-object v1, p1

    check-cast v1, LV/Z0;

    invoke-virtual {v0, v1}, LW/b;->M(LV/Z0;)V

    :cond_0
    iget-object v0, p0, LV/o;->e:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v0, LV/a1;

    check-cast p1, LV/Z0;

    invoke-direct {p0}, LV/o;->b1()LV/d;

    move-result-object v1

    invoke-direct {v0, p1, v1}, LV/a1;-><init>(LV/Z0;LV/d;)V

    move-object p1, v0

    :cond_1
    invoke-virtual {p0, p1}, LV/o;->v1(Ljava/lang/Object;)V

    return-void
.end method

.method public r(I)LV/n;
    .locals 0

    invoke-virtual {p0, p1}, LV/o;->T(I)V

    invoke-direct {p0}, LV/o;->f0()V

    return-object p0
.end method

.method public s(ILjava/lang/Object;)V
    .locals 2

    sget-object v0, LV/V;->a:LV/V$a;

    invoke-virtual {v0}, LV/V$a;->a()I

    move-result v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, LV/o;->j1(ILjava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method public t()V
    .locals 3

    sget-object v0, LV/V;->a:LV/V$a;

    invoke-virtual {v0}, LV/V$a;->c()I

    move-result v0

    const/16 v1, 0x7d

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2, v0, v2}, LV/o;->j1(ILjava/lang/Object;ILjava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, LV/o;->s:Z

    return-void
.end method

.method public u()Z
    .locals 1

    .prologue
    invoke-virtual {p0}, LV/o;->o()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, LV/o;->z:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, LV/o;->x:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, LV/o;->D0()LV/R0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LV/R0;->n()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, LV/o;->r:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final u0()V
    .locals 3

    .prologue
    iget-boolean v0, p0, LV/o;->G:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget v0, p0, LV/o;->A:I

    const/16 v2, 0x64

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez v0, :cond_1

    const-string v0, "Cannot disable reuse from root if it was caused by other groups"

    invoke-static {v0}, LV/I0;->a(Ljava/lang/String;)V

    :cond_1
    const/4 v0, -0x1

    iput v0, p0, LV/o;->A:I

    iput-boolean v1, p0, LV/o;->z:Z

    return-void
.end method

.method public v()LV/g;
    .locals 1

    iget-object v0, p0, LV/o;->b:LV/g;

    return-object v0
.end method

.method public final v1(Ljava/lang/Object;)V
    .locals 4

    .prologue
    invoke-virtual {p0}, LV/o;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LV/o;->K:LV/k1;

    invoke-virtual {v0, p1}, LV/k1;->m1(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-virtual {v0}, LV/g1;->r()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-virtual {v0}, LV/g1;->q()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iget-object v1, p0, LV/o;->O:LW/b;

    invoke-virtual {v1}, LW/b;->p()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, LV/o;->O:LW/b;

    iget-object v2, p0, LV/o;->I:LV/g1;

    invoke-virtual {v2}, LV/g1;->u()I

    move-result v3

    invoke-virtual {v2, v3}, LV/g1;->a(I)LV/d;

    move-result-object v2

    invoke-virtual {v1, p1, v2, v0}, LW/b;->W(Ljava/lang/Object;LV/d;I)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, LV/o;->O:LW/b;

    invoke-virtual {v1, p1, v0}, LW/b;->Z(Ljava/lang/Object;I)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, LV/o;->O:LW/b;

    iget-object v1, p0, LV/o;->I:LV/g1;

    invoke-virtual {v1}, LV/g1;->u()I

    move-result v2

    invoke-virtual {v1, v2}, LV/g1;->a(I)LV/d;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, LW/b;->a(LV/d;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public w(ILjava/lang/Object;)V
    .locals 2

    .prologue
    invoke-virtual {p0}, LV/o;->o()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-virtual {v0}, LV/g1;->n()I

    move-result v0

    if-ne v0, p1, :cond_0

    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-virtual {v0}, LV/g1;->l()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, LV/o;->A:I

    if-gez v0, :cond_0

    iget-object v0, p0, LV/o;->I:LV/g1;

    invoke-virtual {v0}, LV/g1;->k()I

    move-result v0

    iput v0, p0, LV/o;->A:I

    const/4 v0, 0x1

    iput-boolean v0, p0, LV/o;->z:Z

    :cond_0
    sget-object v0, LV/V;->a:LV/V$a;

    invoke-virtual {v0}, LV/V$a;->a()I

    move-result v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0, p2}, LV/o;->j1(ILjava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method public x()LV/e1;
    .locals 6

    .prologue
    iget-object v0, p0, LV/o;->F:LV/F1;

    invoke-virtual {v0}, LV/F1;->d()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, LV/o;->F:LV/F1;

    invoke-virtual {v0}, LV/F1;->g()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LV/R0;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v2}, LV/R0;->E(Z)V

    :goto_1
    if-eqz v0, :cond_2

    iget v3, p0, LV/o;->C:I

    invoke-virtual {v0, v3}, LV/R0;->h(I)Lx7/l;

    move-result-object v3

    if-eqz v3, :cond_2

    iget-object v4, p0, LV/o;->O:LW/b;

    invoke-virtual {p0}, LV/o;->C0()LV/G;

    move-result-object v5

    invoke-virtual {v4, v3, v5}, LW/b;->f(Lx7/l;LV/r;)V

    :cond_2
    if-eqz v0, :cond_6

    invoke-virtual {v0}, LV/R0;->p()Z

    move-result v3

    if-nez v3, :cond_6

    invoke-virtual {v0}, LV/R0;->q()Z

    move-result v3

    if-nez v3, :cond_3

    iget-boolean v3, p0, LV/o;->q:Z

    if-eqz v3, :cond_6

    :cond_3
    invoke-virtual {v0}, LV/R0;->i()LV/d;

    move-result-object v1

    if-nez v1, :cond_5

    invoke-virtual {p0}, LV/o;->o()Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, LV/o;->K:LV/k1;

    invoke-virtual {v1}, LV/k1;->c0()I

    move-result v3

    invoke-virtual {v1, v3}, LV/k1;->E(I)LV/d;

    move-result-object v1

    goto :goto_2

    :cond_4
    iget-object v1, p0, LV/o;->I:LV/g1;

    invoke-virtual {v1}, LV/g1;->u()I

    move-result v3

    invoke-virtual {v1, v3}, LV/g1;->a(I)LV/d;

    move-result-object v1

    :goto_2
    invoke-virtual {v0, v1}, LV/R0;->A(LV/d;)V

    :cond_5
    invoke-virtual {v0, v2}, LV/R0;->C(Z)V

    move-object v1, v0

    :cond_6
    invoke-direct {p0, v2}, LV/o;->s0(Z)V

    return-object v1
.end method

.method public y()V
    .locals 3

    sget-object v0, LV/V;->a:LV/V$a;

    invoke-virtual {v0}, LV/V$a;->b()I

    move-result v0

    const/16 v1, 0x7d

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2, v0, v2}, LV/o;->j1(ILjava/lang/Object;ILjava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, LV/o;->s:Z

    return-void
.end method

.method public z(LV/Q0;)V
    .locals 1

    .prologue
    instance-of v0, p1, LV/R0;

    if-eqz v0, :cond_0

    check-cast p1, LV/R0;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LV/R0;->H(Z)V

    :goto_1
    return-void
.end method
