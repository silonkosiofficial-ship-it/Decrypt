.class public final Lcom/google/android/gms/internal/ads/LI;
.super Lcom/google/android/gms/internal/ads/kh;
.source "SourceFile"


# instance fields
.field private final C:Lcom/google/android/gms/internal/ads/eJ;

.field private D:LX3/a;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/eJ;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/kh;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/LI;->C:Lcom/google/android/gms/internal/ads/eJ;

    return-void
.end method

.method private static o6(LX3/a;)F
    .locals 2

    .prologue
    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/drawable/Drawable;

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p0

    int-to-float p0, p0

    div-float/2addr v0, p0

    return v0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final c0(LX3/a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/LI;->D:LX3/a;

    return-void
.end method

.method public final d()F
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/LI;->C:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->O()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/LI;->C:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->O()F

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/LI;->C:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->W()Ls3/Y0;

    move-result-object v0

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/LI;->C:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->W()Ls3/Y0;

    move-result-object v0

    invoke-interface {v0}, Ls3/Y0;->d()F

    move-result v1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v2, "Remote exception getting video controller aspect ratio."

    invoke-static {v2, v0}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/LI;->D:LX3/a;

    if-eqz v0, :cond_2

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LI;->o6(LX3/a;)F

    move-result v1

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/LI;->C:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->Z()Lcom/google/android/gms/internal/ads/oh;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/oh;->f()I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_4

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/oh;->c()I

    move-result v2

    if-eq v2, v3, :cond_4

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/oh;->f()I

    move-result v2

    int-to-float v2, v2

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/oh;->c()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    goto :goto_0

    :cond_4
    move v2, v1

    :goto_0
    cmpl-float v1, v2, v1

    if-nez v1, :cond_5

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/oh;->e()LX3/a;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LI;->o6(LX3/a;)F

    move-result v0

    return v0

    :cond_5
    move v1, v2

    :goto_1
    return v1
.end method

.method public final e()F
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/LI;->C:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->W()Ls3/Y0;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/LI;->C:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->W()Ls3/Y0;

    move-result-object v0

    invoke-interface {v0}, Ls3/Y0;->e()F

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final g()Ls3/Y0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/LI;->C:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->W()Ls3/Y0;

    move-result-object v0

    return-object v0
.end method

.method public final h()LX3/a;
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/LI;->D:LX3/a;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/LI;->C:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->Z()Lcom/google/android/gms/internal/ads/oh;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/oh;->e()LX3/a;

    move-result-object v0

    return-object v0
.end method

.method public final i()F
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/LI;->C:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->W()Ls3/Y0;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/LI;->C:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->W()Ls3/Y0;

    move-result-object v0

    invoke-interface {v0}, Ls3/Y0;->i()F

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final k()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/LI;->C:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->G()Z

    move-result v0

    return v0
.end method

.method public final l()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/LI;->C:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->W()Ls3/Y0;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final q3(Lcom/google/android/gms/internal/ads/Wh;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/LI;->C:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->W()Ls3/Y0;

    move-result-object v0

    instance-of v0, v0, Lcom/google/android/gms/internal/ads/tu;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/LI;->C:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->W()Ls3/Y0;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/tu;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/tu;->u6(Lcom/google/android/gms/internal/ads/Wh;)V

    :cond_0
    return-void
.end method
