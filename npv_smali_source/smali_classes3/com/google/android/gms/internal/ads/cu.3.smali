.class public final synthetic Lcom/google/android/gms/internal/ads/cu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/sk0;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/Z9;

.field public final synthetic c:Lw3/a;

.field public final synthetic d:Lr3/a;

.field public final synthetic e:Lcom/google/android/gms/internal/ads/tT;

.field public final synthetic f:Lcom/google/android/gms/internal/ads/r70;

.field public final synthetic g:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/Z9;Lw3/a;Lr3/a;Lcom/google/android/gms/internal/ads/tT;Lcom/google/android/gms/internal/ads/r70;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/cu;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/cu;->b:Lcom/google/android/gms/internal/ads/Z9;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/cu;->c:Lw3/a;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/cu;->d:Lr3/a;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/cu;->e:Lcom/google/android/gms/internal/ads/tT;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/cu;->f:Lcom/google/android/gms/internal/ads/r70;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/cu;->g:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()LP4/d;
    .locals 18

    move-object/from16 v0, p0

    invoke-static {}, Lr3/v;->a()Lcom/google/android/gms/internal/ads/eu;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/cu;->a:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/internal/ads/Mu;->a()Lcom/google/android/gms/internal/ads/Mu;

    move-result-object v2

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/cu;->b:Lcom/google/android/gms/internal/ads/Z9;

    iget-object v15, v0, Lcom/google/android/gms/internal/ads/cu;->e:Lcom/google/android/gms/internal/ads/tT;

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/cu;->d:Lr3/a;

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/cu;->c:Lw3/a;

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/cu;->f:Lcom/google/android/gms/internal/ads/r70;

    invoke-static {}, Lcom/google/android/gms/internal/ads/od;->a()Lcom/google/android/gms/internal/ads/od;

    move-result-object v12

    const/4 v13, 0x0

    const/16 v16, 0x0

    const-string v3, ""

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v17, v14

    move-object/from16 v14, v16

    move-object/from16 v16, v17

    invoke-static/range {v1 .. v16}, Lcom/google/android/gms/internal/ads/eu;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/Mu;Ljava/lang/String;ZZLcom/google/android/gms/internal/ads/Z9;Lcom/google/android/gms/internal/ads/ig;Lw3/a;Lcom/google/android/gms/internal/ads/Qf;Lr3/n;Lr3/a;Lcom/google/android/gms/internal/ads/od;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/U60;Lcom/google/android/gms/internal/ads/tT;Lcom/google/android/gms/internal/ads/r70;)Lcom/google/android/gms/internal/ads/Ot;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/lr;->f(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/lr;

    move-result-object v2

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/Ot;->M()Lcom/google/android/gms/internal/ads/Ku;

    move-result-object v3

    new-instance v4, Lcom/google/android/gms/internal/ads/bu;

    invoke-direct {v4, v2}, Lcom/google/android/gms/internal/ads/bu;-><init>(Lcom/google/android/gms/internal/ads/lr;)V

    invoke-interface {v3, v4}, Lcom/google/android/gms/internal/ads/Ku;->D(Lcom/google/android/gms/internal/ads/Iu;)V

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/cu;->g:Ljava/lang/String;

    invoke-interface {v1, v3}, Lcom/google/android/gms/internal/ads/Ot;->loadUrl(Ljava/lang/String;)V

    return-object v2
.end method
