.class public final Lcom/google/android/gms/internal/ads/Vb0;
.super Lcom/google/android/gms/internal/ads/Yb0;
.source "SourceFile"


# static fields
.field private static final F:Lcom/google/android/gms/internal/ads/Vb0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/Vb0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Vb0;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/Vb0;->F:Lcom/google/android/gms/internal/ads/Vb0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Yb0;-><init>()V

    return-void
.end method

.method public static i()Lcom/google/android/gms/internal/ads/Vb0;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/Vb0;->F:Lcom/google/android/gms/internal/ads/Vb0;

    return-object v0
.end method


# virtual methods
.method public final b(Z)V
    .locals 2

    .prologue
    invoke-static {}, Lcom/google/android/gms/internal/ads/Wb0;->a()Lcom/google/android/gms/internal/ads/Wb0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Wb0;->c()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/Fb0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Fb0;->g()Lcom/google/android/gms/internal/ads/nc0;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/nc0;->k(Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final c()Z
    .locals 2

    .prologue
    invoke-static {}, Lcom/google/android/gms/internal/ads/Wb0;->a()Lcom/google/android/gms/internal/ads/Wb0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Wb0;->b()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/Fb0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Fb0;->f()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->hasWindowFocus()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method
