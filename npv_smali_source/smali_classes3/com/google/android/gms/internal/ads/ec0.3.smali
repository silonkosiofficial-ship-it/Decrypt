.class public final Lcom/google/android/gms/internal/ads/ec0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Xb0;


# static fields
.field private static d:Lcom/google/android/gms/internal/ads/ec0;


# instance fields
.field private a:F

.field private b:Lcom/google/android/gms/internal/ads/Sb0;

.field private c:Lcom/google/android/gms/internal/ads/Wb0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/Tb0;Lcom/google/android/gms/internal/ads/Rb0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, Lcom/google/android/gms/internal/ads/ec0;->a:F

    return-void
.end method

.method public static c()Lcom/google/android/gms/internal/ads/ec0;
    .locals 3

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/ec0;->d:Lcom/google/android/gms/internal/ads/ec0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/Rb0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Rb0;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/ads/Tb0;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/Tb0;-><init>()V

    new-instance v2, Lcom/google/android/gms/internal/ads/ec0;

    invoke-direct {v2, v1, v0}, Lcom/google/android/gms/internal/ads/ec0;-><init>(Lcom/google/android/gms/internal/ads/Tb0;Lcom/google/android/gms/internal/ads/Rb0;)V

    sput-object v2, Lcom/google/android/gms/internal/ads/ec0;->d:Lcom/google/android/gms/internal/ads/ec0;

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/ec0;->d:Lcom/google/android/gms/internal/ads/ec0;

    return-object v0
.end method


# virtual methods
.method public final a(Z)V
    .locals 0

    .prologue
    if-eqz p1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/Gc0;->d()Lcom/google/android/gms/internal/ads/Gc0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Gc0;->i()V

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/Gc0;->d()Lcom/google/android/gms/internal/ads/Gc0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Gc0;->h()V

    return-void
.end method

.method public final b()F
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/ec0;->a:F

    return v0
.end method

.method public final d(Landroid/content/Context;)V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/Qb0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Qb0;-><init>()V

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    new-instance v2, Lcom/google/android/gms/internal/ads/Sb0;

    invoke-direct {v2, v1, p1, v0, p0}, Lcom/google/android/gms/internal/ads/Sb0;-><init>(Landroid/os/Handler;Landroid/content/Context;Lcom/google/android/gms/internal/ads/Qb0;Lcom/google/android/gms/internal/ads/ec0;)V

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/ec0;->b:Lcom/google/android/gms/internal/ads/Sb0;

    return-void
.end method

.method public final e(F)V
    .locals 2

    .prologue
    iput p1, p0, Lcom/google/android/gms/internal/ads/ec0;->a:F

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ec0;->c:Lcom/google/android/gms/internal/ads/Wb0;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/Wb0;->a()Lcom/google/android/gms/internal/ads/Wb0;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ec0;->c:Lcom/google/android/gms/internal/ads/Wb0;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ec0;->c:Lcom/google/android/gms/internal/ads/Wb0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Wb0;->b()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/Fb0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Fb0;->g()Lcom/google/android/gms/internal/ads/nc0;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/nc0;->l(F)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final f()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/Vb0;->i()Lcom/google/android/gms/internal/ads/Vb0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/Yb0;->e(Lcom/google/android/gms/internal/ads/Xb0;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/Vb0;->i()Lcom/google/android/gms/internal/ads/Vb0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Yb0;->f()V

    invoke-static {}, Lcom/google/android/gms/internal/ads/Gc0;->d()Lcom/google/android/gms/internal/ads/Gc0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Gc0;->i()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ec0;->b:Lcom/google/android/gms/internal/ads/Sb0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Sb0;->a()V

    return-void
.end method

.method public final g()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/Gc0;->d()Lcom/google/android/gms/internal/ads/Gc0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Gc0;->j()V

    invoke-static {}, Lcom/google/android/gms/internal/ads/Vb0;->i()Lcom/google/android/gms/internal/ads/Vb0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Yb0;->g()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ec0;->b:Lcom/google/android/gms/internal/ads/Sb0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Sb0;->b()V

    return-void
.end method
