.class public final Lcom/google/android/gms/internal/ads/gC;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/v90;

.field private final b:Lw3/a;

.field private final c:Landroid/content/pm/ApplicationInfo;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/util/List;

.field private final f:Landroid/content/pm/PackageInfo;

.field private final g:Lcom/google/android/gms/internal/ads/Uy0;

.field private final h:Ljava/lang/String;

.field private final i:Lcom/google/android/gms/internal/ads/O20;

.field private final j:Lv3/s0;

.field private final k:Lcom/google/android/gms/internal/ads/n70;

.field private final l:I

.field private final m:Lcom/google/android/gms/internal/ads/wF;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/v90;Lw3/a;Landroid/content/pm/ApplicationInfo;Ljava/lang/String;Ljava/util/List;Landroid/content/pm/PackageInfo;Lcom/google/android/gms/internal/ads/Uy0;Lv3/s0;Ljava/lang/String;Lcom/google/android/gms/internal/ads/O20;Lcom/google/android/gms/internal/ads/n70;Lcom/google/android/gms/internal/ads/wF;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/gC;->a:Lcom/google/android/gms/internal/ads/v90;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/gC;->b:Lw3/a;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/gC;->c:Landroid/content/pm/ApplicationInfo;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/gC;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/gC;->e:Ljava/util/List;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/gC;->f:Landroid/content/pm/PackageInfo;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/gC;->g:Lcom/google/android/gms/internal/ads/Uy0;

    iput-object p9, p0, Lcom/google/android/gms/internal/ads/gC;->h:Ljava/lang/String;

    iput-object p10, p0, Lcom/google/android/gms/internal/ads/gC;->i:Lcom/google/android/gms/internal/ads/O20;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/gC;->j:Lv3/s0;

    iput-object p11, p0, Lcom/google/android/gms/internal/ads/gC;->k:Lcom/google/android/gms/internal/ads/n70;

    iput-object p12, p0, Lcom/google/android/gms/internal/ads/gC;->m:Lcom/google/android/gms/internal/ads/wF;

    iput p13, p0, Lcom/google/android/gms/internal/ads/gC;->l:I

    return-void
.end method


# virtual methods
.method final synthetic a(LP4/d;Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/Po;
    .locals 18

    .prologue
    move-object/from16 v0, p0

    invoke-interface/range {p1 .. p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/fC;

    new-instance v17, Lcom/google/android/gms/internal/ads/Po;

    iget-object v3, v1, Lcom/google/android/gms/internal/ads/fC;->a:Landroid/os/Bundle;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/gC;->g:Lcom/google/android/gms/internal/ads/Uy0;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/Uy0;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LP4/d;

    invoke-interface {v2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Ljava/lang/String;

    sget-object v2, Lcom/google/android/gms/internal/ads/Af;->Q6:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v4

    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/gC;->j:Lv3/s0;

    invoke-interface {v2}, Lv3/s0;->M()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    move v13, v2

    goto :goto_0

    :cond_0
    move v13, v4

    :goto_0
    iget-object v10, v0, Lcom/google/android/gms/internal/ads/gC;->h:Ljava/lang/String;

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/gC;->f:Landroid/content/pm/PackageInfo;

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/gC;->e:Ljava/util/List;

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/gC;->d:Ljava/lang/String;

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/gC;->c:Landroid/content/pm/ApplicationInfo;

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/gC;->b:Lw3/a;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/gC;->k:Lcom/google/android/gms/internal/ads/n70;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/n70;->b()Z

    move-result v14

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/fC;->b:Landroid/os/Bundle;

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v2, v17

    move-object/from16 v15, p2

    move-object/from16 v16, v1

    invoke-direct/range {v2 .. v16}, Lcom/google/android/gms/internal/ads/Po;-><init>(Landroid/os/Bundle;Lw3/a;Landroid/content/pm/ApplicationInfo;Ljava/lang/String;Ljava/util/List;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/j80;Ljava/lang/String;ZZLandroid/os/Bundle;Landroid/os/Bundle;)V

    return-object v17
.end method

.method public final b(Landroid/os/Bundle;)LP4/d;
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gC;->m:Lcom/google/android/gms/internal/ads/wF;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/wF;->a()V

    sget-object v0, Lcom/google/android/gms/internal/ads/p90;->D:Lcom/google/android/gms/internal/ads/p90;

    new-instance v1, Lcom/google/android/gms/internal/ads/fC;

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/internal/ads/fC;-><init>(Landroid/os/Bundle;Landroid/os/Bundle;)V

    iget v2, p0, Lcom/google/android/gms/internal/ads/gC;->l:I

    const/4 v3, 0x2

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/gC;->i:Lcom/google/android/gms/internal/ads/O20;

    invoke-virtual {v3, v1, p1, v2}, Lcom/google/android/gms/internal/ads/O20;->a(Ljava/lang/Object;Landroid/os/Bundle;Z)LP4/d;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/gC;->a:Lcom/google/android/gms/internal/ads/v90;

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/e90;->c(LP4/d;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/n90;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/l90;->a()Lcom/google/android/gms/internal/ads/a90;

    move-result-object p1

    return-object p1
.end method

.method public final c()LP4/d;
    .locals 7

    .prologue
    const/4 v0, 0x0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    sget-object v2, Lcom/google/android/gms/internal/ads/Af;->k2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/gC;->k:Lcom/google/android/gms/internal/ads/n70;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/n70;->s:Landroid/os/Bundle;

    if-eqz v2, :cond_0

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_0
    const-string v2, "ls"

    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_1
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/gC;->b(Landroid/os/Bundle;)LP4/d;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/gC;->a:Lcom/google/android/gms/internal/ads/v90;

    sget-object v4, Lcom/google/android/gms/internal/ads/p90;->E:Lcom/google/android/gms/internal/ads/p90;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/gC;->g:Lcom/google/android/gms/internal/ads/Uy0;

    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/Uy0;->b()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LP4/d;

    const/4 v6, 0x2

    new-array v6, v6, [LP4/d;

    aput-object v2, v6, v0

    const/4 v0, 0x1

    aput-object v5, v6, v0

    invoke-virtual {v3, v4, v6}, Lcom/google/android/gms/internal/ads/n90;->a(Ljava/lang/Object;[LP4/d;)Lcom/google/android/gms/internal/ads/c90;

    move-result-object v0

    new-instance v3, Lcom/google/android/gms/internal/ads/eC;

    invoke-direct {v3, p0, v2, v1}, Lcom/google/android/gms/internal/ads/eC;-><init>(Lcom/google/android/gms/internal/ads/gC;LP4/d;Landroid/os/Bundle;)V

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/c90;->a(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/l90;->a()Lcom/google/android/gms/internal/ads/a90;

    move-result-object v0

    return-object v0
.end method
