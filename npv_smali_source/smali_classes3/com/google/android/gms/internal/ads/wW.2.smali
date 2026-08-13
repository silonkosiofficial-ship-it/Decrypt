.class final Lcom/google/android/gms/internal/ads/wW;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/ZH;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/ads/BM;

.field private final c:Lcom/google/android/gms/internal/ads/n70;

.field private final d:Lw3/a;

.field private final e:Lcom/google/android/gms/internal/ads/R60;

.field private final f:LP4/d;

.field private final g:Lcom/google/android/gms/internal/ads/Ot;

.field private final h:Lcom/google/android/gms/internal/ads/jj;

.field private final i:Z

.field private final j:Lcom/google/android/gms/internal/ads/tT;

.field private final k:Lcom/google/android/gms/internal/ads/YN;

.field private final l:Lcom/google/android/gms/internal/ads/eO;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/BM;Lcom/google/android/gms/internal/ads/n70;Lw3/a;Lcom/google/android/gms/internal/ads/R60;LP4/d;Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/jj;ZLcom/google/android/gms/internal/ads/tT;Lcom/google/android/gms/internal/ads/YN;Lcom/google/android/gms/internal/ads/eO;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/wW;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/wW;->b:Lcom/google/android/gms/internal/ads/BM;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/wW;->c:Lcom/google/android/gms/internal/ads/n70;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/wW;->d:Lw3/a;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/wW;->e:Lcom/google/android/gms/internal/ads/R60;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/wW;->f:LP4/d;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/wW;->g:Lcom/google/android/gms/internal/ads/Ot;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/wW;->h:Lcom/google/android/gms/internal/ads/jj;

    iput-boolean p9, p0, Lcom/google/android/gms/internal/ads/wW;->i:Z

    iput-object p10, p0, Lcom/google/android/gms/internal/ads/wW;->j:Lcom/google/android/gms/internal/ads/tT;

    iput-object p11, p0, Lcom/google/android/gms/internal/ads/wW;->k:Lcom/google/android/gms/internal/ads/YN;

    iput-object p12, p0, Lcom/google/android/gms/internal/ads/wW;->l:Lcom/google/android/gms/internal/ads/eO;

    return-void
.end method


# virtual methods
.method public final a(ZLandroid/content/Context;Lcom/google/android/gms/internal/ads/SC;)V
    .locals 22

    .prologue
    move-object/from16 v1, p0

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/wW;->f:LP4/d;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->q(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/gM;

    :try_start_0
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/wW;->e:Lcom/google/android/gms/internal/ads/R60;

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/wW;->g:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/Ot;->j1()Z

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v3, :cond_0

    :goto_0
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/wW;->g:Lcom/google/android/gms/internal/ads/Ot;

    move-object v11, v2

    goto :goto_2

    :catch_0
    move-exception v0

    goto/16 :goto_7

    :cond_0
    sget-object v3, Lcom/google/android/gms/internal/ads/Af;->X0:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v6

    invoke-virtual {v6, v3}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/wW;->b:Lcom/google/android/gms/internal/ads/BM;

    iget-object v6, v1, Lcom/google/android/gms/internal/ads/wW;->c:Lcom/google/android/gms/internal/ads/n70;

    iget-object v6, v6, Lcom/google/android/gms/internal/ads/n70;->e:Ls3/c2;

    invoke-virtual {v3, v6, v5, v5}, Lcom/google/android/gms/internal/ads/BM;->a(Ls3/c2;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/U60;)Lcom/google/android/gms/internal/ads/Ot;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/gM;->i()Lcom/google/android/gms/internal/ads/WG;

    move-result-object v6

    invoke-static {v3, v6}, Lcom/google/android/gms/internal/ads/zj;->b(Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/yj;)V

    new-instance v6, Lcom/google/android/gms/internal/ads/GM;

    invoke-direct {v6}, Lcom/google/android/gms/internal/ads/GM;-><init>()V

    iget-object v7, v1, Lcom/google/android/gms/internal/ads/wW;->a:Landroid/content/Context;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/Ot;->N()Landroid/view/View;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lcom/google/android/gms/internal/ads/GM;->a(Landroid/content/Context;Landroid/view/View;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/gM;->l()Lcom/google/android/gms/internal/ads/AM;

    move-result-object v7

    iget-boolean v8, v1, Lcom/google/android/gms/internal/ads/wW;->i:Z

    if-eqz v8, :cond_2

    iget-object v8, v1, Lcom/google/android/gms/internal/ads/wW;->h:Lcom/google/android/gms/internal/ads/jj;

    goto :goto_1

    :cond_2
    move-object v8, v5

    :goto_1
    iget-object v9, v1, Lcom/google/android/gms/internal/ads/wW;->k:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/YN;->a()Landroid/os/Bundle;

    move-result-object v9

    invoke-virtual {v7, v3, v4, v8, v9}, Lcom/google/android/gms/internal/ads/AM;->i(Lcom/google/android/gms/internal/ads/Ot;ZLcom/google/android/gms/internal/ads/jj;Landroid/os/Bundle;)V

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/Ot;->M()Lcom/google/android/gms/internal/ads/Ku;

    move-result-object v7

    new-instance v8, Lcom/google/android/gms/internal/ads/uW;

    invoke-direct {v8, v6, v3}, Lcom/google/android/gms/internal/ads/uW;-><init>(Lcom/google/android/gms/internal/ads/GM;Lcom/google/android/gms/internal/ads/Ot;)V

    invoke-interface {v7, v8}, Lcom/google/android/gms/internal/ads/Ku;->D(Lcom/google/android/gms/internal/ads/Iu;)V

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/Ot;->M()Lcom/google/android/gms/internal/ads/Ku;

    move-result-object v6

    new-instance v7, Lcom/google/android/gms/internal/ads/vW;

    invoke-direct {v7, v3}, Lcom/google/android/gms/internal/ads/vW;-><init>(Lcom/google/android/gms/internal/ads/Ot;)V

    invoke-interface {v6, v7}, Lcom/google/android/gms/internal/ads/Ku;->K(Lcom/google/android/gms/internal/ads/Ju;)V

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/R60;->s:Lcom/google/android/gms/internal/ads/W60;

    iget-object v6, v2, Lcom/google/android/gms/internal/ads/W60;->b:Ljava/lang/String;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/W60;->a:Ljava/lang/String;

    invoke-interface {v3, v6, v2, v5}, Lcom/google/android/gms/internal/ads/Ot;->d1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/du; {:try_start_0 .. :try_end_0} :catch_0

    move-object v11, v3

    :goto_2
    invoke-interface {v11, v4}, Lcom/google/android/gms/internal/ads/Ot;->f1(Z)V

    iget-boolean v2, v1, Lcom/google/android/gms/internal/ads/wW;->i:Z

    new-instance v3, Lr3/l;

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/wW;->h:Lcom/google/android/gms/internal/ads/jj;

    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/jj;->e(Z)Z

    move-result v2

    move v13, v2

    goto :goto_3

    :cond_3
    move v13, v6

    :goto_3
    invoke-static {}, Lr3/v;->t()Lv3/E0;

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/wW;->a:Landroid/content/Context;

    iget-boolean v7, v1, Lcom/google/android/gms/internal/ads/wW;->i:Z

    invoke-static {v2}, Lv3/E0;->j(Landroid/content/Context;)Z

    move-result v14

    if-eqz v7, :cond_4

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/wW;->h:Lcom/google/android/gms/internal/ads/jj;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/jj;->d()Z

    move-result v2

    move v15, v2

    goto :goto_4

    :cond_4
    move v15, v6

    :goto_4
    iget-boolean v2, v1, Lcom/google/android/gms/internal/ads/wW;->i:Z

    if-eqz v2, :cond_5

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/wW;->h:Lcom/google/android/gms/internal/ads/jj;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/jj;->a()F

    move-result v2

    :goto_5
    move/from16 v16, v2

    goto :goto_6

    :cond_5
    const/4 v2, 0x0

    goto :goto_5

    :goto_6
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/wW;->e:Lcom/google/android/gms/internal/ads/R60;

    iget-boolean v6, v2, Lcom/google/android/gms/internal/ads/R60;->O:Z

    iget-boolean v2, v2, Lcom/google/android/gms/internal/ads/R60;->P:Z

    const/16 v17, -0x1

    move-object v12, v3

    move/from16 v18, p1

    move/from16 v19, v6

    move/from16 v20, v2

    invoke-direct/range {v12 .. v20}, Lr3/l;-><init>(ZZZFIZZZ)V

    if-eqz p3, :cond_6

    invoke-virtual/range {p3 .. p3}, Lcom/google/android/gms/internal/ads/SC;->e()V

    :cond_6
    invoke-static {}, Lr3/v;->m()Lu3/y;

    new-instance v2, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/gM;->j()Lcom/google/android/gms/internal/ads/NH;

    move-result-object v9

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/wW;->e:Lcom/google/android/gms/internal/ads/R60;

    iget-object v13, v1, Lcom/google/android/gms/internal/ads/wW;->d:Lw3/a;

    iget v12, v0, Lcom/google/android/gms/internal/ads/R60;->Q:I

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/R60;->B:Ljava/lang/String;

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/R60;->s:Lcom/google/android/gms/internal/ads/W60;

    iget-object v15, v6, Lcom/google/android/gms/internal/ads/W60;->b:Ljava/lang/String;

    iget-object v6, v6, Lcom/google/android/gms/internal/ads/W60;->a:Ljava/lang/String;

    iget-object v7, v1, Lcom/google/android/gms/internal/ads/wW;->c:Lcom/google/android/gms/internal/ads/n70;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/R60;->b()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v5, v1, Lcom/google/android/gms/internal/ads/wW;->j:Lcom/google/android/gms/internal/ads/tT;

    :cond_7
    move-object/from16 v20, v5

    iget-object v0, v7, Lcom/google/android/gms/internal/ads/n70;->f:Ljava/lang/String;

    invoke-interface {v11}, Lcom/google/android/gms/internal/ads/fs;->t()Ljava/lang/String;

    move-result-object v21

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object v7, v2

    move-object v5, v15

    move-object v15, v3

    move-object/from16 v16, v5

    move-object/from16 v17, v6

    move-object/from16 v18, v0

    move-object/from16 v19, p3

    invoke-direct/range {v7 .. v21}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Ls3/a;Lu3/z;Lu3/d;Lcom/google/android/gms/internal/ads/Ot;ILw3/a;Ljava/lang/String;Lr3/l;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/SC;Lcom/google/android/gms/internal/ads/En;Ljava/lang/String;)V

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/wW;->l:Lcom/google/android/gms/internal/ads/eO;

    move-object/from16 v3, p2

    invoke-static {v3, v2, v4, v0}, Lu3/y;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;ZLcom/google/android/gms/internal/ads/eO;)V

    return-void

    :goto_7
    const-string v2, ""

    invoke-static {v2, v0}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
