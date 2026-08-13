.class public final synthetic Lcom/google/android/gms/internal/ads/au;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Tg0;


# instance fields
.field public final synthetic C:Landroid/content/Context;

.field public final synthetic D:Lcom/google/android/gms/internal/ads/Mu;

.field public final synthetic E:Ljava/lang/String;

.field public final synthetic F:Z

.field public final synthetic G:Z

.field public final synthetic H:Lcom/google/android/gms/internal/ads/Z9;

.field public final synthetic I:Lcom/google/android/gms/internal/ads/ig;

.field public final synthetic J:Lw3/a;

.field public final synthetic K:Lr3/n;

.field public final synthetic L:Lr3/a;

.field public final synthetic M:Lcom/google/android/gms/internal/ads/od;

.field public final synthetic N:Lcom/google/android/gms/internal/ads/R60;

.field public final synthetic O:Lcom/google/android/gms/internal/ads/U60;

.field public final synthetic P:Lcom/google/android/gms/internal/ads/r70;

.field public final synthetic Q:Lcom/google/android/gms/internal/ads/tT;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/Mu;Ljava/lang/String;ZZLcom/google/android/gms/internal/ads/Z9;Lcom/google/android/gms/internal/ads/ig;Lw3/a;Lcom/google/android/gms/internal/ads/Qf;Lr3/n;Lr3/a;Lcom/google/android/gms/internal/ads/od;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/U60;Lcom/google/android/gms/internal/ads/r70;Lcom/google/android/gms/internal/ads/tT;)V
    .locals 2

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/au;->C:Landroid/content/Context;

    move-object v1, p2

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/au;->D:Lcom/google/android/gms/internal/ads/Mu;

    move-object v1, p3

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/au;->E:Ljava/lang/String;

    move v1, p4

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/au;->F:Z

    move v1, p5

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/au;->G:Z

    move-object v1, p6

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/au;->H:Lcom/google/android/gms/internal/ads/Z9;

    move-object v1, p7

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/au;->I:Lcom/google/android/gms/internal/ads/ig;

    move-object v1, p8

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/au;->J:Lw3/a;

    move-object v1, p10

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/au;->K:Lr3/n;

    move-object v1, p11

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/au;->L:Lr3/a;

    move-object v1, p12

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/au;->M:Lcom/google/android/gms/internal/ads/od;

    move-object v1, p13

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/au;->N:Lcom/google/android/gms/internal/ads/R60;

    move-object/from16 v1, p14

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/au;->O:Lcom/google/android/gms/internal/ads/U60;

    move-object/from16 v1, p15

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/au;->P:Lcom/google/android/gms/internal/ads/r70;

    move-object/from16 v1, p16

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/au;->Q:Lcom/google/android/gms/internal/ads/tT;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 22

    .prologue
    move-object/from16 v1, p0

    iget-object v4, v1, Lcom/google/android/gms/internal/ads/au;->D:Lcom/google/android/gms/internal/ads/Mu;

    iget-object v5, v1, Lcom/google/android/gms/internal/ads/au;->E:Ljava/lang/String;

    iget-boolean v6, v1, Lcom/google/android/gms/internal/ads/au;->F:Z

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/au;->M:Lcom/google/android/gms/internal/ads/od;

    iget-boolean v15, v1, Lcom/google/android/gms/internal/ads/au;->G:Z

    iget-object v8, v1, Lcom/google/android/gms/internal/ads/au;->H:Lcom/google/android/gms/internal/ads/Z9;

    iget-object v14, v1, Lcom/google/android/gms/internal/ads/au;->N:Lcom/google/android/gms/internal/ads/R60;

    iget-object v9, v1, Lcom/google/android/gms/internal/ads/au;->I:Lcom/google/android/gms/internal/ads/ig;

    iget-object v12, v1, Lcom/google/android/gms/internal/ads/au;->K:Lr3/n;

    iget-object v13, v1, Lcom/google/android/gms/internal/ads/au;->O:Lcom/google/android/gms/internal/ads/U60;

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/au;->C:Landroid/content/Context;

    iget-object v10, v1, Lcom/google/android/gms/internal/ads/au;->J:Lw3/a;

    iget-object v11, v1, Lcom/google/android/gms/internal/ads/au;->L:Lr3/a;

    iget-object v7, v1, Lcom/google/android/gms/internal/ads/au;->P:Lcom/google/android/gms/internal/ads/r70;

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/au;->Q:Lcom/google/android/gms/internal/ads/tT;

    const/16 v16, 0x108

    :try_start_0
    invoke-static/range {v16 .. v16}, Landroid/net/TrafficStats;->setThreadStatsTag(I)V

    move-object/from16 v16, v11

    new-instance v11, Lcom/google/android/gms/internal/ads/ju;

    sget v17, Lcom/google/android/gms/internal/ads/qu;->D0:I

    new-instance v1, Lcom/google/android/gms/internal/ads/Lu;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/Lu;-><init>(Landroid/content/Context;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/qu;

    const/16 v17, 0x0

    move-object/from16 v18, v2

    move-object/from16 v19, v3

    move-object v3, v1

    move-object v1, v7

    move v7, v15

    move-object/from16 v20, v11

    move-object/from16 v11, v17

    move-object/from16 v17, v13

    move-object/from16 v13, v16

    move-object/from16 v16, v14

    move-object v14, v0

    move/from16 v21, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v1

    invoke-direct/range {v2 .. v17}, Lcom/google/android/gms/internal/ads/qu;-><init>(Lcom/google/android/gms/internal/ads/Lu;Lcom/google/android/gms/internal/ads/Mu;Ljava/lang/String;ZZLcom/google/android/gms/internal/ads/Z9;Lcom/google/android/gms/internal/ads/ig;Lw3/a;Lcom/google/android/gms/internal/ads/Qf;Lr3/n;Lr3/a;Lcom/google/android/gms/internal/ads/od;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/U60;Lcom/google/android/gms/internal/ads/r70;)V

    move-object/from16 v1, v20

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/ju;-><init>(Lcom/google/android/gms/internal/ads/Ot;)V

    invoke-static {}, Lr3/v;->u()Lv3/b;

    move-result-object v2

    move-object/from16 v4, v19

    move/from16 v3, v21

    invoke-virtual {v2, v1, v0, v3, v4}, Lv3/b;->c(Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/od;ZLcom/google/android/gms/internal/ads/tT;)Lcom/google/android/gms/internal/ads/Zt;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/Ot;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/Nt;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/Nt;-><init>(Lcom/google/android/gms/internal/ads/Ot;)V

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/Ot;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    return-object v1

    :catchall_0
    move-exception v0

    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    throw v0
.end method
