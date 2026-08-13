.class public final Lcom/google/android/gms/internal/ads/wL;
.super Lcom/google/android/gms/internal/ads/Gh;
.source "SourceFile"


# instance fields
.field private final C:Landroid/content/Context;

.field private final D:Lcom/google/android/gms/internal/ads/eJ;

.field private E:Lcom/google/android/gms/internal/ads/FJ;

.field private F:Lcom/google/android/gms/internal/ads/ZI;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/eJ;Lcom/google/android/gms/internal/ads/FJ;Lcom/google/android/gms/internal/ads/ZI;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Gh;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/wL;->C:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/wL;->D:Lcom/google/android/gms/internal/ads/eJ;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/wL;->E:Lcom/google/android/gms/internal/ads/FJ;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/wL;->F:Lcom/google/android/gms/internal/ads/ZI;

    return-void
.end method

.method static bridge synthetic p6(Lcom/google/android/gms/internal/ads/wL;)Lcom/google/android/gms/internal/ads/ZI;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/wL;->F:Lcom/google/android/gms/internal/ads/ZI;

    return-object p0
.end method


# virtual methods
.method public final C0(LX3/a;)Z
    .locals 2

    .prologue
    invoke-static {p1}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Landroid/view/ViewGroup;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wL;->E:Lcom/google/android/gms/internal/ads/FJ;

    if-eqz v0, :cond_1

    check-cast p1, Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/FJ;->g(Landroid/view/ViewGroup;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wL;->D:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/eJ;->f0()Lcom/google/android/gms/internal/ads/Ot;

    move-result-object p1

    new-instance v0, Lcom/google/android/gms/internal/ads/vL;

    const-string v1, "_videoMediaView"

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/vL;-><init>(Lcom/google/android/gms/internal/ads/wL;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/Ot;->b1(Lcom/google/android/gms/internal/ads/ch;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final G0(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wL;->D:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->V()Lr/Y;

    move-result-object v0

    invoke-virtual {v0, p1}, Lr/Y;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final S(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oh;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wL;->D:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->U()Lr/Y;

    move-result-object v0

    invoke-virtual {v0, p1}, Lr/Y;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/oh;

    return-object p1
.end method

.method public final a1(LX3/a;)V
    .locals 1

    .prologue
    invoke-static {p1}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Landroid/view/View;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wL;->D:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->h0()Lcom/google/android/gms/internal/ads/QT;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wL;->F:Lcom/google/android/gms/internal/ads/ZI;

    if-eqz v0, :cond_1

    check-cast p1, Landroid/view/View;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/ZI;->s(Landroid/view/View;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final d()Ls3/Y0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wL;->D:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->W()Ls3/Y0;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/google/android/gms/internal/ads/lh;
    .locals 3

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wL;->F:Lcom/google/android/gms/internal/ads/ZI;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ZI;->Q()Lcom/google/android/gms/internal/ads/bJ;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bJ;->a()Lcom/google/android/gms/internal/ads/lh;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "InternalNativeCustomTemplateAdShim.getMediaContent"

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/ads/Uq;->x(Ljava/lang/Throwable;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final g()LX3/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wL;->C:Landroid/content/Context;

    invoke-static {v0}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v0

    return-object v0
.end method

.method public final g0(LX3/a;)Z
    .locals 2

    .prologue
    invoke-static {p1}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Landroid/view/ViewGroup;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wL;->E:Lcom/google/android/gms/internal/ads/FJ;

    if-eqz v0, :cond_1

    check-cast p1, Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/FJ;->f(Landroid/view/ViewGroup;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wL;->D:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/eJ;->d0()Lcom/google/android/gms/internal/ads/Ot;

    move-result-object p1

    new-instance v0, Lcom/google/android/gms/internal/ads/vL;

    const-string v1, "_videoMediaView"

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/vL;-><init>(Lcom/google/android/gms/internal/ads/wL;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/Ot;->b1(Lcom/google/android/gms/internal/ads/ch;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wL;->D:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final k()Ljava/util/List;
    .locals 7

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wL;->D:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->U()Lr/Y;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wL;->D:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/eJ;->V()Lr/Y;

    move-result-object v1

    invoke-virtual {v0}, Lr/Y;->size()I

    move-result v2

    invoke-virtual {v1}, Lr/Y;->size()I

    move-result v3

    add-int/2addr v2, v3

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_0
    invoke-virtual {v0}, Lr/Y;->size()I

    move-result v6

    if-ge v4, v6, :cond_0

    invoke-virtual {v0, v4}, Lr/Y;->f(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    aput-object v6, v2, v5

    add-int/lit8 v5, v5, 0x1

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_0
    :goto_1
    invoke-virtual {v1}, Lr/Y;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    invoke-virtual {v1, v3}, Lr/Y;->f(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    aput-object v0, v2, v5

    add-int/lit8 v5, v5, 0x1

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :goto_2
    const-string v1, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames"

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/ads/Uq;->x(Ljava/lang/Throwable;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public final l()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wL;->F:Lcom/google/android/gms/internal/ads/ZI;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fA;->a()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/wL;->F:Lcom/google/android/gms/internal/ads/ZI;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/wL;->E:Lcom/google/android/gms/internal/ads/FJ;

    return-void
.end method

.method public final m()V
    .locals 3

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wL;->D:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->c()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Google"

    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v0, "Illegal argument specified for omid partner name."

    invoke-static {v0}, Lw3/p;->g(Ljava/lang/String;)V

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v0, "Not starting OMID session. OM partner name has not been configured."

    invoke-static {v0}, Lw3/p;->g(Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wL;->F:Lcom/google/android/gms/internal/ads/ZI;

    if-eqz v1, :cond_2

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/ZI;->T(Ljava/lang/String;Z)Lcom/google/android/gms/internal/ads/QT;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    return-void

    :goto_0
    const-string v1, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement"

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/ads/Uq;->x(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method public final p()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wL;->F:Lcom/google/android/gms/internal/ads/ZI;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ZI;->r()V

    :cond_0
    return-void
.end method

.method public final p0(Ljava/lang/String;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wL;->F:Lcom/google/android/gms/internal/ads/ZI;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/ZI;->n(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final s()Z
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wL;->F:Lcom/google/android/gms/internal/ads/ZI;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ZI;->G()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wL;->D:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->e0()Lcom/google/android/gms/internal/ads/Ot;

    move-result-object v0

    if-nez v0, :cond_2

    return v1

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wL;->D:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->f0()Lcom/google/android/gms/internal/ads/Ot;

    move-result-object v0

    if-eqz v0, :cond_3

    return v1

    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method public final w()Z
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wL;->D:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->h0()Lcom/google/android/gms/internal/ads/QT;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Lr3/v;->b()Lcom/google/android/gms/internal/ads/LT;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/QT;->a()Lcom/google/android/gms/internal/ads/Bb0;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/LT;->e(Lcom/google/android/gms/internal/ads/Bb0;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wL;->D:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->e0()Lcom/google/android/gms/internal/ads/Ot;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wL;->D:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->e0()Lcom/google/android/gms/internal/ads/Ot;

    move-result-object v0

    new-instance v1, Lr/a;

    invoke-direct {v1}, Lr/a;-><init>()V

    const-string v2, "onSdkLoaded"

    invoke-interface {v0, v2, v1}, Lcom/google/android/gms/internal/ads/yk;->O(Ljava/lang/String;Ljava/util/Map;)V

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const-string v0, "Trying to start OMID session before creation."

    invoke-static {v0}, Lw3/p;->g(Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0
.end method
