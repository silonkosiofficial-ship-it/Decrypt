.class public final Lcom/google/android/gms/internal/ads/xW;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/VT;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/ads/BM;

.field private final c:Lcom/google/android/gms/internal/ads/kM;

.field private final d:Lcom/google/android/gms/internal/ads/n70;

.field private final e:Ljava/util/concurrent/Executor;

.field private final f:Lw3/a;

.field private final g:Lcom/google/android/gms/internal/ads/jj;

.field private final h:Z

.field private final i:Lcom/google/android/gms/internal/ads/tT;

.field private final j:Lcom/google/android/gms/internal/ads/YN;

.field private final k:Lcom/google/android/gms/internal/ads/eO;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lw3/a;Lcom/google/android/gms/internal/ads/n70;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/kM;Lcom/google/android/gms/internal/ads/BM;Lcom/google/android/gms/internal/ads/jj;Lcom/google/android/gms/internal/ads/tT;Lcom/google/android/gms/internal/ads/YN;Lcom/google/android/gms/internal/ads/eO;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/xW;->a:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/xW;->d:Lcom/google/android/gms/internal/ads/n70;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/xW;->c:Lcom/google/android/gms/internal/ads/kM;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/xW;->e:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/xW;->f:Lw3/a;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/xW;->b:Lcom/google/android/gms/internal/ads/BM;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/xW;->g:Lcom/google/android/gms/internal/ads/jj;

    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->N8:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/xW;->h:Z

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/xW;->i:Lcom/google/android/gms/internal/ads/tT;

    iput-object p9, p0, Lcom/google/android/gms/internal/ads/xW;->j:Lcom/google/android/gms/internal/ads/YN;

    iput-object p10, p0, Lcom/google/android/gms/internal/ads/xW;->k:Lcom/google/android/gms/internal/ads/eO;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;)Z
    .locals 0

    .prologue
    iget-object p1, p2, Lcom/google/android/gms/internal/ads/R60;->s:Lcom/google/android/gms/internal/ads/W60;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/W60;->a:Ljava/lang/String;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;)LP4/d;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/GM;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/GM;-><init>()V

    const/4 v1, 0x0

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/sW;

    invoke-direct {v2, p0, p2, p1, v0}, Lcom/google/android/gms/internal/ads/sW;-><init>(Lcom/google/android/gms/internal/ads/xW;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/GM;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/xW;->e:Ljava/util/concurrent/Executor;

    invoke-static {v1, v2, p1}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/tW;

    invoke-direct {p2, v0}, Lcom/google/android/gms/internal/ads/tW;-><init>(Lcom/google/android/gms/internal/ads/GM;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/xW;->e:Ljava/util/concurrent/Executor;

    invoke-interface {p1, p2, v0}, LP4/d;->e(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object p1
.end method

.method final synthetic c(Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/GM;Ljava/lang/Object;)LP4/d;
    .locals 25

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v14, p1

    move-object/from16 v1, p2

    sget-object v15, Lcom/google/android/gms/internal/ads/Af;->m2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v15}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/xW;->j:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/YN;->a()Landroid/os/Bundle;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/ads/MN;->X:Lcom/google/android/gms/internal/ads/MN;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/MN;->e()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v4

    invoke-interface {v4}, LV3/f;->a()J

    move-result-wide v4

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_0
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/xW;->b:Lcom/google/android/gms/internal/ads/BM;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/xW;->d:Lcom/google/android/gms/internal/ads/n70;

    iget-object v4, v1, Lcom/google/android/gms/internal/ads/e70;->b:Lcom/google/android/gms/internal/ads/c70;

    iget-object v4, v4, Lcom/google/android/gms/internal/ads/c70;->b:Lcom/google/android/gms/internal/ads/U60;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/n70;->e:Ls3/c2;

    invoke-virtual {v2, v3, v14, v4}, Lcom/google/android/gms/internal/ads/BM;->a(Ls3/c2;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/U60;)Lcom/google/android/gms/internal/ads/Ot;

    move-result-object v13

    iget-boolean v2, v14, Lcom/google/android/gms/internal/ads/R60;->W:Z

    invoke-interface {v13, v2}, Lcom/google/android/gms/internal/ads/Ot;->M0(Z)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/xW;->a:Landroid/content/Context;

    invoke-interface {v13}, Lcom/google/android/gms/internal/ads/Ot;->N()Landroid/view/View;

    move-result-object v3

    move-object/from16 v4, p3

    invoke-virtual {v4, v2, v3}, Lcom/google/android/gms/internal/ads/GM;->a(Landroid/content/Context;Landroid/view/View;)V

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v15}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/xW;->j:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/YN;->a()Landroid/os/Bundle;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/ads/MN;->Y:Lcom/google/android/gms/internal/ads/MN;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/MN;->e()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v4

    invoke-interface {v4}, LV3/f;->a()J

    move-result-wide v4

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_1
    new-instance v12, Lcom/google/android/gms/internal/ads/mr;

    invoke-direct {v12}, Lcom/google/android/gms/internal/ads/mr;-><init>()V

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/xW;->c:Lcom/google/android/gms/internal/ads/kM;

    new-instance v10, Lcom/google/android/gms/internal/ads/wA;

    const/4 v9, 0x0

    invoke-direct {v10, v1, v14, v9}, Lcom/google/android/gms/internal/ads/wA;-><init>(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;Ljava/lang/String;)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/xW;->a:Landroid/content/Context;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/xW;->b:Lcom/google/android/gms/internal/ads/BM;

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/xW;->d:Lcom/google/android/gms/internal/ads/n70;

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/xW;->f:Lw3/a;

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/xW;->g:Lcom/google/android/gms/internal/ads/jj;

    iget-boolean v7, v0, Lcom/google/android/gms/internal/ads/xW;->h:Z

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/xW;->i:Lcom/google/android/gms/internal/ads/tT;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/xW;->j:Lcom/google/android/gms/internal/ads/YN;

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/xW;->k:Lcom/google/android/gms/internal/ads/eO;

    new-instance v0, Lcom/google/android/gms/internal/ads/hM;

    move-object/from16 p4, v15

    new-instance v15, Lcom/google/android/gms/internal/ads/wW;

    move-object/from16 v16, v1

    move-object v1, v15

    move-object/from16 v17, v6

    move-object/from16 v6, p1

    move/from16 v18, v7

    move-object v7, v12

    move-object/from16 v19, v8

    move-object v8, v13

    move-object/from16 v20, v9

    move-object/from16 v9, v19

    move-object/from16 v21, v10

    move/from16 v10, v18

    move-object/from16 v22, v11

    move-object/from16 v11, v17

    move-object/from16 v23, v12

    move-object/from16 v12, v16

    move-object/from16 v24, v13

    move-object v13, v14

    invoke-direct/range {v1 .. v13}, Lcom/google/android/gms/internal/ads/wW;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/BM;Lcom/google/android/gms/internal/ads/n70;Lw3/a;Lcom/google/android/gms/internal/ads/R60;LP4/d;Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/jj;ZLcom/google/android/gms/internal/ads/tT;Lcom/google/android/gms/internal/ads/YN;Lcom/google/android/gms/internal/ads/eO;)V

    move-object/from16 v1, v24

    invoke-direct {v0, v15, v1}, Lcom/google/android/gms/internal/ads/hM;-><init>(Lcom/google/android/gms/internal/ads/ZH;Lcom/google/android/gms/internal/ads/Ot;)V

    move-object/from16 v3, v21

    move-object/from16 v2, v22

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/internal/ads/kM;->d(Lcom/google/android/gms/internal/ads/wA;Lcom/google/android/gms/internal/ads/hM;)Lcom/google/android/gms/internal/ads/gM;

    move-result-object v0

    move-object/from16 v2, v23

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/mr;->c(Ljava/lang/Object;)Z

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    move-object/from16 v3, p4

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_2

    move-object/from16 v2, p0

    iget-object v3, v2, Lcom/google/android/gms/internal/ads/xW;->j:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/YN;->a()Landroid/os/Bundle;

    move-result-object v3

    sget-object v4, Lcom/google/android/gms/internal/ads/MN;->Z:Lcom/google/android/gms/internal/ads/MN;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/MN;->e()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v5

    invoke-interface {v5}, LV3/f;->a()J

    move-result-wide v5

    invoke-virtual {v3, v4, v5, v6}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    goto :goto_0

    :cond_2
    move-object/from16 v2, p0

    :goto_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/gM;->i()Lcom/google/android/gms/internal/ads/WG;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/ads/zj;->b(Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/yj;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/hA;->b()Lcom/google/android/gms/internal/ads/XC;

    move-result-object v3

    new-instance v4, Lcom/google/android/gms/internal/ads/qW;

    invoke-direct {v4, v1}, Lcom/google/android/gms/internal/ads/qW;-><init>(Lcom/google/android/gms/internal/ads/Ot;)V

    sget-object v5, Lcom/google/android/gms/internal/ads/dr;->g:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/ads/BF;->F0(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/gM;->l()Lcom/google/android/gms/internal/ads/AM;

    move-result-object v3

    iget-boolean v4, v2, Lcom/google/android/gms/internal/ads/xW;->h:Z

    if-eqz v4, :cond_3

    iget-object v9, v2, Lcom/google/android/gms/internal/ads/xW;->g:Lcom/google/android/gms/internal/ads/jj;

    goto :goto_1

    :cond_3
    move-object/from16 v9, v20

    :goto_1
    iget-object v4, v2, Lcom/google/android/gms/internal/ads/xW;->j:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/YN;->a()Landroid/os/Bundle;

    move-result-object v4

    const/4 v5, 0x1

    invoke-virtual {v3, v1, v5, v9, v4}, Lcom/google/android/gms/internal/ads/AM;->i(Lcom/google/android/gms/internal/ads/Ot;ZLcom/google/android/gms/internal/ads/jj;Landroid/os/Bundle;)V

    move-object/from16 v3, p1

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/R60;->s:Lcom/google/android/gms/internal/ads/W60;

    iget-object v4, v4, Lcom/google/android/gms/internal/ads/W60;->a:Ljava/lang/String;

    sget-object v6, Lcom/google/android/gms/internal/ads/Af;->f5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v7

    invoke-virtual {v7, v6}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/gM;->m()Lcom/google/android/gms/internal/ads/OT;

    move-result-object v6

    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/ads/OT;->e(Z)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/Du;->a(Lcom/google/android/gms/internal/ads/R60;)Ljava/lang/String;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/google/android/gms/internal/ads/Du;->b(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    :cond_4
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/gM;->l()Lcom/google/android/gms/internal/ads/AM;

    iget-object v5, v3, Lcom/google/android/gms/internal/ads/R60;->s:Lcom/google/android/gms/internal/ads/W60;

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/W60;->b:Ljava/lang/String;

    iget-object v6, v2, Lcom/google/android/gms/internal/ads/xW;->j:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/YN;->a()Landroid/os/Bundle;

    move-result-object v6

    invoke-static {v1, v5, v4, v6}, Lcom/google/android/gms/internal/ads/AM;->j(Lcom/google/android/gms/internal/ads/Ot;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)LP4/d;

    move-result-object v4

    new-instance v5, Lcom/google/android/gms/internal/ads/rW;

    invoke-direct {v5, v2, v1, v3, v0}, Lcom/google/android/gms/internal/ads/rW;-><init>(Lcom/google/android/gms/internal/ads/xW;Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/gM;)V

    iget-object v0, v2, Lcom/google/android/gms/internal/ads/xW;->e:Ljava/util/concurrent/Executor;

    invoke-static {v4, v5, v0}, Lcom/google/android/gms/internal/ads/Nk0;->m(LP4/d;Lcom/google/android/gms/internal/ads/pg0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object v0

    return-object v0
.end method
