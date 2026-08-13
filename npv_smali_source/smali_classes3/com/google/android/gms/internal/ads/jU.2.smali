.class final Lcom/google/android/gms/internal/ads/jU;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/ZH;


# instance fields
.field private final a:Lw3/a;

.field private final b:LP4/d;

.field private final c:Lcom/google/android/gms/internal/ads/R60;

.field private final d:Lcom/google/android/gms/internal/ads/Ot;

.field private final e:Lcom/google/android/gms/internal/ads/n70;

.field private final f:Lcom/google/android/gms/internal/ads/jj;

.field private final g:Z

.field private final h:Lcom/google/android/gms/internal/ads/tT;

.field private final i:Lcom/google/android/gms/internal/ads/eO;


# direct methods
.method constructor <init>(Lw3/a;LP4/d;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/n70;ZLcom/google/android/gms/internal/ads/jj;Lcom/google/android/gms/internal/ads/tT;Lcom/google/android/gms/internal/ads/eO;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/jU;->a:Lw3/a;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/jU;->b:LP4/d;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/jU;->c:Lcom/google/android/gms/internal/ads/R60;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/jU;->d:Lcom/google/android/gms/internal/ads/Ot;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/jU;->e:Lcom/google/android/gms/internal/ads/n70;

    iput-boolean p6, p0, Lcom/google/android/gms/internal/ads/jU;->g:Z

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/jU;->f:Lcom/google/android/gms/internal/ads/jj;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/jU;->h:Lcom/google/android/gms/internal/ads/tT;

    iput-object p9, p0, Lcom/google/android/gms/internal/ads/jU;->i:Lcom/google/android/gms/internal/ads/eO;

    return-void
.end method


# virtual methods
.method public final a(ZLandroid/content/Context;Lcom/google/android/gms/internal/ads/SC;)V
    .locals 19

    .prologue
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/jU;->b:LP4/d;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/Nk0;->q(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/Ay;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/jU;->d:Lcom/google/android/gms/internal/ads/Ot;

    const/4 v3, 0x1

    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/ads/Ot;->f1(Z)V

    new-instance v2, Lr3/l;

    iget-boolean v4, v0, Lcom/google/android/gms/internal/ads/jU;->g:Z

    if-eqz v4, :cond_0

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/jU;->f:Lcom/google/android/gms/internal/ads/jj;

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/jj;->e(Z)Z

    move-result v4

    move v5, v4

    goto :goto_0

    :cond_0
    move v5, v3

    :goto_0
    iget-boolean v4, v0, Lcom/google/android/gms/internal/ads/jU;->g:Z

    if-eqz v4, :cond_1

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/jU;->f:Lcom/google/android/gms/internal/ads/jj;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/jj;->d()Z

    move-result v6

    :goto_1
    move v7, v6

    goto :goto_2

    :cond_1
    const/4 v6, 0x0

    goto :goto_1

    :goto_2
    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/jU;->f:Lcom/google/android/gms/internal/ads/jj;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/jj;->a()F

    move-result v4

    :goto_3
    move v8, v4

    goto :goto_4

    :cond_2
    const/4 v4, 0x0

    goto :goto_3

    :goto_4
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/jU;->c:Lcom/google/android/gms/internal/ads/R60;

    iget-boolean v11, v4, Lcom/google/android/gms/internal/ads/R60;->O:Z

    const/4 v12, 0x0

    const/4 v6, 0x1

    const/4 v9, -0x1

    move-object v4, v2

    move/from16 v10, p1

    invoke-direct/range {v4 .. v12}, Lr3/l;-><init>(ZZZFIZZZ)V

    if-eqz p3, :cond_3

    invoke-virtual/range {p3 .. p3}, Lcom/google/android/gms/internal/ads/SC;->e()V

    :cond_3
    invoke-static {}, Lr3/v;->m()Lu3/y;

    new-instance v15, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Ay;->i()Lcom/google/android/gms/internal/ads/NH;

    move-result-object v6

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/jU;->d:Lcom/google/android/gms/internal/ads/Ot;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/jU;->c:Lcom/google/android/gms/internal/ads/R60;

    iget v1, v1, Lcom/google/android/gms/internal/ads/R60;->Q:I

    const/4 v4, -0x1

    if-eq v1, v4, :cond_4

    :goto_5
    move v9, v1

    goto :goto_6

    :cond_4
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/jU;->e:Lcom/google/android/gms/internal/ads/n70;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/n70;->j:Ls3/i2;

    if-eqz v1, :cond_6

    iget v1, v1, Ls3/i2;->C:I

    if-ne v1, v3, :cond_5

    const/4 v1, 0x7

    goto :goto_5

    :cond_5
    const/4 v4, 0x2

    if-ne v1, v4, :cond_6

    const/4 v1, 0x6

    goto :goto_5

    :cond_6
    const-string v1, "Error setting app open orientation; no targeting orientation available."

    invoke-static {v1}, Lw3/p;->b(Ljava/lang/String;)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/jU;->c:Lcom/google/android/gms/internal/ads/R60;

    iget v1, v1, Lcom/google/android/gms/internal/ads/R60;->Q:I

    goto :goto_5

    :goto_6
    iget-object v10, v0, Lcom/google/android/gms/internal/ads/jU;->a:Lw3/a;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/jU;->c:Lcom/google/android/gms/internal/ads/R60;

    iget-object v11, v1, Lcom/google/android/gms/internal/ads/R60;->B:Ljava/lang/String;

    iget-object v4, v1, Lcom/google/android/gms/internal/ads/R60;->s:Lcom/google/android/gms/internal/ads/W60;

    iget-object v13, v4, Lcom/google/android/gms/internal/ads/W60;->b:Ljava/lang/String;

    iget-object v14, v4, Lcom/google/android/gms/internal/ads/W60;->a:Ljava/lang/String;

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/jU;->e:Lcom/google/android/gms/internal/ads/n70;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/R60;->b()Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/jU;->h:Lcom/google/android/gms/internal/ads/tT;

    :goto_7
    move-object/from16 v17, v1

    goto :goto_8

    :cond_7
    const/4 v1, 0x0

    goto :goto_7

    :goto_8
    iget-object v1, v4, Lcom/google/android/gms/internal/ads/n70;->f:Ljava/lang/String;

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/jU;->d:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v4}, Lcom/google/android/gms/internal/ads/fs;->t()Ljava/lang/String;

    move-result-object v18

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v4, v15

    move-object v12, v2

    move-object v2, v15

    move-object v15, v1

    move-object/from16 v16, p3

    invoke-direct/range {v4 .. v18}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Ls3/a;Lu3/z;Lu3/d;Lcom/google/android/gms/internal/ads/Ot;ILw3/a;Ljava/lang/String;Lr3/l;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/SC;Lcom/google/android/gms/internal/ads/En;Ljava/lang/String;)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/jU;->i:Lcom/google/android/gms/internal/ads/eO;

    move-object/from16 v4, p2

    invoke-static {v4, v2, v3, v1}, Lu3/y;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;ZLcom/google/android/gms/internal/ads/eO;)V

    return-void
.end method
