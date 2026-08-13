.class public final Lcom/google/android/gms/internal/ads/Sz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/uD;
.implements Lcom/google/android/gms/internal/ads/ZC;


# instance fields
.field private final C:Landroid/content/Context;

.field private final D:Lcom/google/android/gms/internal/ads/Ot;

.field private final E:Lcom/google/android/gms/internal/ads/R60;

.field private final F:Lw3/a;

.field private G:Lcom/google/android/gms/internal/ads/QT;

.field private H:Z

.field private final I:Lcom/google/android/gms/internal/ads/OT;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/Ot;Lcom/google/android/gms/internal/ads/R60;Lw3/a;Lcom/google/android/gms/internal/ads/OT;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Sz;->C:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Sz;->D:Lcom/google/android/gms/internal/ads/Ot;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Sz;->E:Lcom/google/android/gms/internal/ads/R60;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/Sz;->F:Lw3/a;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/Sz;->I:Lcom/google/android/gms/internal/ads/OT;

    return-void
.end method

.method private final declared-synchronized a()V
    .locals 12

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Sz;->E:Lcom/google/android/gms/internal/ads/R60;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/R60;->T:Z

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Sz;->D:Lcom/google/android/gms/internal/ads/Ot;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Sz;->C:Landroid/content/Context;

    invoke-static {}, Lr3/v;->b()Lcom/google/android/gms/internal/ads/LT;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/LT;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Sz;->F:Lw3/a;

    iget v1, v0, Lw3/a;->D:I

    iget v0, v0, Lw3/a;->E:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Sz;->E:Lcom/google/android/gms/internal/ads/R60;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/R60;->V:Lcom/google/android/gms/internal/ads/q70;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/q70;->a()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/q70;->c()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/ads/MT;->F:Lcom/google/android/gms/internal/ads/MT;

    sget-object v2, Lcom/google/android/gms/internal/ads/NT;->E:Lcom/google/android/gms/internal/ads/NT;

    move-object v10, v0

    move-object v9, v2

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Sz;->E:Lcom/google/android/gms/internal/ads/R60;

    sget-object v2, Lcom/google/android/gms/internal/ads/MT;->D:Lcom/google/android/gms/internal/ads/MT;

    iget v0, v0, Lcom/google/android/gms/internal/ads/R60;->e:I

    if-ne v0, v1, :cond_2

    sget-object v0, Lcom/google/android/gms/internal/ads/NT;->F:Lcom/google/android/gms/internal/ads/NT;

    :goto_0
    move-object v9, v0

    move-object v10, v2

    goto :goto_1

    :cond_2
    sget-object v0, Lcom/google/android/gms/internal/ads/NT;->D:Lcom/google/android/gms/internal/ads/NT;

    goto :goto_0

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Sz;->D:Lcom/google/android/gms/internal/ads/Ot;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Sz;->E:Lcom/google/android/gms/internal/ads/R60;

    invoke-static {}, Lr3/v;->b()Lcom/google/android/gms/internal/ads/LT;

    move-result-object v3

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->i0()Landroid/webkit/WebView;

    move-result-object v5

    iget-object v11, v2, Lcom/google/android/gms/internal/ads/R60;->l0:Ljava/lang/String;

    const-string v6, ""

    const-string v7, "javascript"

    invoke-interface/range {v3 .. v11}, Lcom/google/android/gms/internal/ads/LT;->k(Ljava/lang/String;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/NT;Lcom/google/android/gms/internal/ads/MT;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/QT;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Sz;->G:Lcom/google/android/gms/internal/ads/QT;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Sz;->D:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->N()Landroid/view/View;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Sz;->G:Lcom/google/android/gms/internal/ads/QT;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/QT;->a()Lcom/google/android/gms/internal/ads/Bb0;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/ads/Af;->e5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Sz;->D:Lcom/google/android/gms/internal/ads/Ot;

    invoke-static {}, Lr3/v;->b()Lcom/google/android/gms/internal/ads/LT;

    move-result-object v3

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->i0()Landroid/webkit/WebView;

    move-result-object v0

    invoke-interface {v3, v2, v0}, Lcom/google/android/gms/internal/ads/LT;->c(Lcom/google/android/gms/internal/ads/Bb0;Landroid/view/View;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Sz;->D:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->X0()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-static {}, Lr3/v;->b()Lcom/google/android/gms/internal/ads/LT;

    move-result-object v4

    invoke-interface {v4, v2, v3}, Lcom/google/android/gms/internal/ads/LT;->d(Lcom/google/android/gms/internal/ads/Bb0;Landroid/view/View;)V

    goto :goto_2

    :cond_3
    invoke-static {}, Lr3/v;->b()Lcom/google/android/gms/internal/ads/LT;

    move-result-object v3

    invoke-interface {v3, v2, v0}, Lcom/google/android/gms/internal/ads/LT;->c(Lcom/google/android/gms/internal/ads/Bb0;Landroid/view/View;)V

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Sz;->D:Lcom/google/android/gms/internal/ads/Ot;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Sz;->G:Lcom/google/android/gms/internal/ads/QT;

    invoke-interface {v0, v3}, Lcom/google/android/gms/internal/ads/Ot;->n1(Lcom/google/android/gms/internal/ads/QT;)V

    invoke-static {}, Lr3/v;->b()Lcom/google/android/gms/internal/ads/LT;

    move-result-object v0

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/LT;->e(Lcom/google/android/gms/internal/ads/Bb0;)V

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/Sz;->H:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Sz;->D:Lcom/google/android/gms/internal/ads/Ot;

    new-instance v1, Lr/a;

    invoke-direct {v1}, Lr/a;-><init>()V

    const-string v2, "onSdkLoaded"

    invoke-interface {v0, v2, v1}, Lcom/google/android/gms/internal/ads/yk;->O(Ljava/lang/String;Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_5
    :goto_3
    monitor-exit p0

    return-void

    :goto_4
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private final b()Z
    .locals 2

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->f5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Sz;->I:Lcom/google/android/gms/internal/ads/OT;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/OT;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final declared-synchronized t()V
    .locals 3

    .prologue
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Sz;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Sz;->I:Lcom/google/android/gms/internal/ads/OT;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/OT;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    :try_start_1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/Sz;->H:Z

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Sz;->a()V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Sz;->E:Lcom/google/android/gms/internal/ads/R60;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/R60;->T:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Sz;->G:Lcom/google/android/gms/internal/ads/QT;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Sz;->D:Lcom/google/android/gms/internal/ads/Ot;

    if-eqz v0, :cond_2

    new-instance v1, Lr/a;

    invoke-direct {v1}, Lr/a;-><init>()V

    const-string v2, "onSdkImpression"

    invoke-interface {v0, v2, v1}, Lcom/google/android/gms/internal/ads/yk;->O(Ljava/lang/String;Ljava/util/Map;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :cond_2
    monitor-exit p0

    return-void

    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final declared-synchronized u()V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Sz;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Sz;->I:Lcom/google/android/gms/internal/ads/OT;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/OT;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    :try_start_1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/Sz;->H:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_1

    monitor-exit p0

    return-void

    :cond_1
    :try_start_2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Sz;->a()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :goto_0
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method
