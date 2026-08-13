.class public final Lcom/google/android/gms/internal/ads/ys;
.super Lcom/google/android/gms/internal/ads/Kr;
.source "SourceFile"

# interfaces
.implements Landroid/view/TextureView$SurfaceTextureListener;
.implements Lcom/google/android/gms/internal/ads/Vr;


# instance fields
.field private final E:Lcom/google/android/gms/internal/ads/fs;

.field private final F:Lcom/google/android/gms/internal/ads/gs;

.field private final G:Lcom/google/android/gms/internal/ads/es;

.field private H:Lcom/google/android/gms/internal/ads/Jr;

.field private I:Landroid/view/Surface;

.field private J:Lcom/google/android/gms/internal/ads/Wr;

.field private K:Ljava/lang/String;

.field private L:[Ljava/lang/String;

.field private M:Z

.field private N:I

.field private O:Lcom/google/android/gms/internal/ads/ds;

.field private final P:Z

.field private Q:Z

.field private R:Z

.field private S:I

.field private T:I

.field private U:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/gs;Lcom/google/android/gms/internal/ads/fs;ZZLcom/google/android/gms/internal/ads/es;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/Kr;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/ys;->N:I

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/ys;->E:Lcom/google/android/gms/internal/ads/fs;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ys;->F:Lcom/google/android/gms/internal/ads/gs;

    iput-boolean p4, p0, Lcom/google/android/gms/internal/ads/ys;->P:Z

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/ys;->G:Lcom/google/android/gms/internal/ads/es;

    invoke-virtual {p0, p0}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/ads/gs;->a(Lcom/google/android/gms/internal/ads/Kr;)V

    return-void
.end method

.method private static T(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "/"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ":"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final U()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->J:Lcom/google/android/gms/internal/ads/Wr;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Wr;->H(Z)V

    :cond_0
    return-void
.end method

.method private final V()V
    .locals 2

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/ys;->Q:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/ys;->Q:Z

    sget-object v0, Lv3/E0;->l:Lcom/google/android/gms/internal/ads/Fe0;

    new-instance v1, Lcom/google/android/gms/internal/ads/xs;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/xs;-><init>(Lcom/google/android/gms/internal/ads/ys;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ys;->n()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->F:Lcom/google/android/gms/internal/ads/gs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/gs;->b()V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/ys;->R:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ys;->o()V

    :cond_1
    :goto_0
    return-void
.end method

.method private final W(ZLjava/lang/Integer;)V
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ys;->J:Lcom/google/android/gms/internal/ads/Wr;

    if-eqz v2, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/ads/Wr;->G(Ljava/lang/Integer;)V

    return-void

    :cond_1
    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/ys;->K:Ljava/lang/String;

    if-eqz v3, :cond_b

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/ys;->I:Landroid/view/Surface;

    if-nez v3, :cond_2

    goto/16 :goto_5

    :cond_2
    if-eqz p1, :cond_4

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ys;->d0()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Wr;->L()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ys;->Y()V

    goto :goto_2

    :cond_3
    const-string p1, "No valid ExoPlayerAdapter exists when switch source."

    :goto_1
    invoke-static {p1}, Lw3/p;->g(Ljava/lang/String;)V

    return-void

    :cond_4
    :goto_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ys;->K:Ljava/lang/String;

    const-string v2, "cache:"

    invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_9

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ys;->E:Lcom/google/android/gms/internal/ads/fs;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ys;->K:Ljava/lang/String;

    invoke-interface {p1, v2}, Lcom/google/android/gms/internal/ads/fs;->v0(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Ts;

    move-result-object p1

    instance-of v2, p1, Lcom/google/android/gms/internal/ads/ct;

    if-eqz v2, :cond_6

    check-cast p1, Lcom/google/android/gms/internal/ads/ct;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ct;->t()Lcom/google/android/gms/internal/ads/Wr;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ys;->J:Lcom/google/android/gms/internal/ads/Wr;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/Wr;->G(Ljava/lang/Integer;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ys;->J:Lcom/google/android/gms/internal/ads/Wr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Wr;->M()Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_4

    :cond_5
    const-string p1, "Precached video player has been released."

    goto :goto_1

    :cond_6
    instance-of v2, p1, Lcom/google/android/gms/internal/ads/Zs;

    if-eqz v2, :cond_8

    check-cast p1, Lcom/google/android/gms/internal/ads/Zs;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ys;->F()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Zs;->w()Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Zs;->C()Z

    move-result v4

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Zs;->u()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_7

    const-string p1, "Stream cache URL is null."

    goto :goto_1

    :cond_7
    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/ads/ys;->E(Ljava/lang/Integer;)Lcom/google/android/gms/internal/ads/Wr;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ys;->J:Lcom/google/android/gms/internal/ads/Wr;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    new-array v0, v0, [Landroid/net/Uri;

    aput-object p1, v0, v1

    invoke-virtual {p2, v0, v2, v3, v4}, Lcom/google/android/gms/internal/ads/Wr;->x([Landroid/net/Uri;Ljava/lang/String;Ljava/nio/ByteBuffer;Z)V

    goto :goto_4

    :cond_8
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ys;->K:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "Stream cache miss: "

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_9
    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/ads/ys;->E(Ljava/lang/Integer;)Lcom/google/android/gms/internal/ads/Wr;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ys;->J:Lcom/google/android/gms/internal/ads/Wr;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ys;->F()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/ys;->L:[Ljava/lang/String;

    array-length p2, p2

    new-array p2, p2, [Landroid/net/Uri;

    move v2, v1

    :goto_3
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/ys;->L:[Ljava/lang/String;

    array-length v4, v3

    if-ge v2, v4, :cond_a

    aget-object v3, v3, v2

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    aput-object v3, p2, v2

    add-int/2addr v2, v0

    goto :goto_3

    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->J:Lcom/google/android/gms/internal/ads/Wr;

    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/ads/Wr;->w([Landroid/net/Uri;Ljava/lang/String;)V

    :goto_4
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ys;->J:Lcom/google/android/gms/internal/ads/Wr;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/ads/Wr;->C(Lcom/google/android/gms/internal/ads/Vr;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ys;->I:Landroid/view/Surface;

    invoke-direct {p0, p1, v1}, Lcom/google/android/gms/internal/ads/ys;->Z(Landroid/view/Surface;Z)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ys;->J:Lcom/google/android/gms/internal/ads/Wr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Wr;->M()Z

    move-result p1

    if-eqz p1, :cond_b

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ys;->J:Lcom/google/android/gms/internal/ads/Wr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Wr;->P()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/ys;->N:I

    const/4 p2, 0x3

    if-ne p1, p2, :cond_b

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ys;->V()V

    :cond_b
    :goto_5
    return-void
.end method

.method private final X()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->J:Lcom/google/android/gms/internal/ads/Wr;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Wr;->H(Z)V

    :cond_0
    return-void
.end method

.method private final Y()V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->J:Lcom/google/android/gms/internal/ads/Wr;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/ads/ys;->Z(Landroid/view/Surface;Z)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ys;->J:Lcom/google/android/gms/internal/ads/Wr;

    if-eqz v2, :cond_0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/Wr;->C(Lcom/google/android/gms/internal/ads/Vr;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ys;->J:Lcom/google/android/gms/internal/ads/Wr;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Wr;->y()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->J:Lcom/google/android/gms/internal/ads/Wr;

    :cond_0
    iput v1, p0, Lcom/google/android/gms/internal/ads/ys;->N:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/ys;->M:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/ys;->Q:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/ys;->R:Z

    :cond_1
    return-void
.end method

.method private final Z(Landroid/view/Surface;Z)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->J:Lcom/google/android/gms/internal/ads/Wr;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/Wr;->J(Landroid/view/Surface;Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string p2, ""

    invoke-static {p2, p1}, Lw3/p;->h(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const-string p1, "Trying to set surface before player is initialized."

    invoke-static {p1}, Lw3/p;->g(Ljava/lang/String;)V

    return-void
.end method

.method private final a0()V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/ys;->S:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/ys;->T:I

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/ads/ys;->b0(II)V

    return-void
.end method

.method private final b0(II)V
    .locals 0

    .prologue
    if-lez p2, :cond_0

    int-to-float p1, p1

    int-to-float p2, p2

    div-float/2addr p1, p2

    goto :goto_0

    :cond_0
    const/high16 p1, 0x3f800000    # 1.0f

    :goto_0
    iget p2, p0, Lcom/google/android/gms/internal/ads/ys;->U:F

    cmpl-float p2, p2, p1

    if-eqz p2, :cond_1

    iput p1, p0, Lcom/google/android/gms/internal/ads/ys;->U:F

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_1
    return-void
.end method

.method private final c0()Z
    .locals 2

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ys;->d0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/ads/ys;->N:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private final d0()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->J:Lcom/google/android/gms/internal/ads/Wr;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Wr;->M()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/ys;->M:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final A(ZJ)V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->E:Lcom/google/android/gms/internal/ads/fs;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/dr;->f:Lcom/google/android/gms/internal/ads/Yk0;

    new-instance v1, Lcom/google/android/gms/internal/ads/rs;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/rs;-><init>(Lcom/google/android/gms/internal/ads/ys;ZJ)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final B(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 2

    .prologue
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/ys;->T(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "ExoPlayerAdapter error: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw3/p;->g(Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/ys;->M:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->G:Lcom/google/android/gms/internal/ads/es;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/es;->a:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ys;->X()V

    :cond_0
    sget-object v0, Lv3/E0;->l:Lcom/google/android/gms/internal/ads/Fe0;

    new-instance v1, Lcom/google/android/gms/internal/ads/vs;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/vs;-><init>(Lcom/google/android/gms/internal/ads/ys;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    const-string p1, "AdExoPlayerView.onError"

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v0

    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/ads/Uq;->w(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method public final C(I)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->J:Lcom/google/android/gms/internal/ads/Wr;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/Wr;->B(I)V

    :cond_0
    return-void
.end method

.method public final D(I)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->J:Lcom/google/android/gms/internal/ads/Wr;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/Wr;->D(I)V

    :cond_0
    return-void
.end method

.method final E(Ljava/lang/Integer;)Lcom/google/android/gms/internal/ads/Wr;
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/ads/wt;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ys;->G:Lcom/google/android/gms/internal/ads/es;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ys;->E:Lcom/google/android/gms/internal/ads/fs;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/fs;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v0, v3, v1, v2, p1}, Lcom/google/android/gms/internal/ads/wt;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/es;Lcom/google/android/gms/internal/ads/fs;Ljava/lang/Integer;)V

    const-string p1, "ExoPlayerAdapter initialized."

    invoke-static {p1}, Lw3/p;->f(Ljava/lang/String;)V

    return-object v0
.end method

.method final F()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->E:Lcom/google/android/gms/internal/ads/fs;

    invoke-static {}, Lr3/v;->t()Lv3/E0;

    move-result-object v1

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/fs;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/fs;->n()Lw3/a;

    move-result-object v0

    iget-object v0, v0, Lw3/a;->C:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lv3/E0;->H(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method final synthetic G(Ljava/lang/String;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->H:Lcom/google/android/gms/internal/ads/Jr;

    if-eqz v0, :cond_0

    const-string v1, "ExoPlayerAdapter error"

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/ads/Jr;->q(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method final synthetic H()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->H:Lcom/google/android/gms/internal/ads/Jr;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Jr;->a()V

    :cond_0
    return-void
.end method

.method final synthetic I()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->H:Lcom/google/android/gms/internal/ads/Jr;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Jr;->e()V

    :cond_0
    return-void
.end method

.method final synthetic J(ZJ)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->E:Lcom/google/android/gms/internal/ads/fs;

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/fs;->F0(ZJ)V

    return-void
.end method

.method final synthetic K(Ljava/lang/String;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->H:Lcom/google/android/gms/internal/ads/Jr;

    if-eqz v0, :cond_0

    const-string v1, "ExoPlayerAdapter exception"

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/ads/Jr;->E0(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method final synthetic L()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->H:Lcom/google/android/gms/internal/ads/Jr;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Jr;->i()V

    :cond_0
    return-void
.end method

.method final synthetic M()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->H:Lcom/google/android/gms/internal/ads/Jr;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Jr;->g()V

    :cond_0
    return-void
.end method

.method final synthetic N()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->H:Lcom/google/android/gms/internal/ads/Jr;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Jr;->h()V

    :cond_0
    return-void
.end method

.method final synthetic O(II)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->H:Lcom/google/android/gms/internal/ads/Jr;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/Jr;->F0(II)V

    :cond_0
    return-void
.end method

.method final synthetic P()V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Kr;->D:Lcom/google/android/gms/internal/ads/js;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/js;->a()F

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ys;->J:Lcom/google/android/gms/internal/ads/Wr;

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/Wr;->K(FZ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, ""

    invoke-static {v1, v0}, Lw3/p;->h(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const-string v0, "Trying to set volume before player is initialized."

    invoke-static {v0}, Lw3/p;->g(Ljava/lang/String;)V

    return-void
.end method

.method final synthetic Q(I)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->H:Lcom/google/android/gms/internal/ads/Jr;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/Jr;->onWindowVisibilityChanged(I)V

    :cond_0
    return-void
.end method

.method final synthetic R()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->H:Lcom/google/android/gms/internal/ads/Jr;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Jr;->f()V

    :cond_0
    return-void
.end method

.method final synthetic S()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->H:Lcom/google/android/gms/internal/ads/Jr;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Jr;->d()V

    :cond_0
    return-void
.end method

.method public final a(I)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->J:Lcom/google/android/gms/internal/ads/Wr;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/Wr;->E(I)V

    :cond_0
    return-void
.end method

.method public final b(I)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->J:Lcom/google/android/gms/internal/ads/Wr;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/Wr;->I(I)V

    :cond_0
    return-void
.end method

.method public final c(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 2

    .prologue
    if-nez p1, :cond_0

    return-void

    :cond_0
    if-nez p2, :cond_1

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ys;->L:[Ljava/lang/String;

    goto :goto_0

    :cond_1
    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ys;->L:[Ljava/lang/String;

    :goto_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/ys;->K:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->G:Lcom/google/android/gms/internal/ads/es;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/es;->k:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    if-eqz p2, :cond_2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    iget p2, p0, Lcom/google/android/gms/internal/ads/ys;->N:I

    const/4 v0, 0x4

    if-ne p2, v0, :cond_2

    const/4 v1, 0x1

    :cond_2
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ys;->K:Ljava/lang/String;

    invoke-direct {p0, v1, p3}, Lcom/google/android/gms/internal/ads/ys;->W(ZLjava/lang/Integer;)V

    return-void
.end method

.method public final d()I
    .locals 2

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ys;->c0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->J:Lcom/google/android/gms/internal/ads/Wr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Wr;->U()J

    move-result-wide v0

    long-to-int v0, v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final e()I
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->J:Lcom/google/android/gms/internal/ads/Wr;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Wr;->N()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public final f()I
    .locals 2

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ys;->c0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->J:Lcom/google/android/gms/internal/ads/Wr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Wr;->V()J

    move-result-wide v0

    long-to-int v0, v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final g()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/ys;->T:I

    return v0
.end method

.method public final h()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/ys;->S:I

    return v0
.end method

.method public final i()J
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->J:Lcom/google/android/gms/internal/ads/Wr;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Wr;->T()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public final j()J
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->J:Lcom/google/android/gms/internal/ads/Wr;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Wr;->r()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public final k()J
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->J:Lcom/google/android/gms/internal/ads/Wr;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Wr;->s()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public final l()Ljava/lang/String;
    .locals 2

    .prologue
    const/4 v0, 0x1

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/ys;->P:Z

    if-eq v0, v1, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    const-string v0, " spherical"

    :goto_0
    const-string v1, "ExoPlayer/2"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final m()V
    .locals 2

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ys;->c0()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->G:Lcom/google/android/gms/internal/ads/es;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/es;->a:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ys;->X()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->J:Lcom/google/android/gms/internal/ads/Wr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Wr;->F(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->F:Lcom/google/android/gms/internal/ads/gs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/gs;->e()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Kr;->D:Lcom/google/android/gms/internal/ads/js;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/js;->c()V

    sget-object v0, Lv3/E0;->l:Lcom/google/android/gms/internal/ads/Fe0;

    new-instance v1, Lcom/google/android/gms/internal/ads/ts;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/ts;-><init>(Lcom/google/android/gms/internal/ads/ys;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method

.method public final n()V
    .locals 2

    sget-object v0, Lv3/E0;->l:Lcom/google/android/gms/internal/ads/Fe0;

    new-instance v1, Lcom/google/android/gms/internal/ads/ms;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/ms;-><init>(Lcom/google/android/gms/internal/ads/ys;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final o()V
    .locals 2

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ys;->c0()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->G:Lcom/google/android/gms/internal/ads/es;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/es;->a:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ys;->U()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->J:Lcom/google/android/gms/internal/ads/Wr;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Wr;->F(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->F:Lcom/google/android/gms/internal/ads/gs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/gs;->c()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Kr;->D:Lcom/google/android/gms/internal/ads/js;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/js;->b()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Kr;->C:Lcom/google/android/gms/internal/ads/Zr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Zr;->b()V

    sget-object v0, Lv3/E0;->l:Lcom/google/android/gms/internal/ads/Fe0;

    new-instance v1, Lcom/google/android/gms/internal/ads/ls;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/ls;-><init>(Lcom/google/android/gms/internal/ads/ys;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_1
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/ys;->R:Z

    return-void
.end method

.method protected final onMeasure(II)V
    .locals 4

    .prologue
    invoke-super {p0, p1, p2}, Landroid/view/TextureView;->onMeasure(II)V

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    iget v0, p0, Lcom/google/android/gms/internal/ads/ys;->U:F

    const/4 v1, 0x0

    cmpl-float v1, v0, v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ys;->O:Lcom/google/android/gms/internal/ads/ds;

    if-nez v1, :cond_1

    int-to-float v1, p1

    int-to-float v2, p2

    div-float v2, v1, v2

    cmpl-float v3, v0, v2

    if-lez v3, :cond_0

    div-float/2addr v1, v0

    float-to-int p2, v1

    :cond_0
    cmpg-float v1, v0, v2

    if-gez v1, :cond_1

    int-to-float p1, p2

    mul-float/2addr p1, v0

    float-to-int p1, p1

    :cond_1
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->O:Lcom/google/android/gms/internal/ads/ds;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/ds;->c(II)V

    :cond_2
    return-void
.end method

.method public final onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 3

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/ys;->P:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/ads/ds;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/ds;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->O:Lcom/google/android/gms/internal/ads/ds;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/ds;->d(Landroid/graphics/SurfaceTexture;II)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->O:Lcom/google/android/gms/internal/ads/ds;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->O:Lcom/google/android/gms/internal/ads/ds;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ds;->b()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object p1, v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->O:Lcom/google/android/gms/internal/ads/ds;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ds;->e()V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/ys;->O:Lcom/google/android/gms/internal/ads/ds;

    :cond_1
    :goto_0
    new-instance v0, Landroid/view/Surface;

    invoke-direct {v0, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->I:Landroid/view/Surface;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ys;->J:Lcom/google/android/gms/internal/ads/Wr;

    if-nez p1, :cond_2

    const/4 p1, 0x0

    invoke-direct {p0, p1, v1}, Lcom/google/android/gms/internal/ads/ys;->W(ZLjava/lang/Integer;)V

    goto :goto_1

    :cond_2
    const/4 p1, 0x1

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/internal/ads/ys;->Z(Landroid/view/Surface;Z)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ys;->G:Lcom/google/android/gms/internal/ads/es;

    iget-boolean p1, p1, Lcom/google/android/gms/internal/ads/es;->a:Z

    if-nez p1, :cond_3

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ys;->U()V

    :cond_3
    :goto_1
    iget p1, p0, Lcom/google/android/gms/internal/ads/ys;->S:I

    if-eqz p1, :cond_5

    iget p1, p0, Lcom/google/android/gms/internal/ads/ys;->T:I

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ys;->a0()V

    goto :goto_3

    :cond_5
    :goto_2
    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/ads/ys;->b0(II)V

    :goto_3
    sget-object p1, Lv3/E0;->l:Lcom/google/android/gms/internal/ads/Fe0;

    new-instance p2, Lcom/google/android/gms/internal/ads/us;

    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/ads/us;-><init>(Lcom/google/android/gms/internal/ads/ys;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 2

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/ys;->m()V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ys;->O:Lcom/google/android/gms/internal/ads/ds;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ds;->e()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->O:Lcom/google/android/gms/internal/ads/ds;

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ys;->J:Lcom/google/android/gms/internal/ads/Wr;

    const/4 v1, 0x1

    if-eqz p1, :cond_2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ys;->X()V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ys;->I:Landroid/view/Surface;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/view/Surface;->release()V

    :cond_1
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->I:Landroid/view/Surface;

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/ads/ys;->Z(Landroid/view/Surface;Z)V

    :cond_2
    sget-object p1, Lv3/E0;->l:Lcom/google/android/gms/internal/ads/Fe0;

    new-instance v0, Lcom/google/android/gms/internal/ads/qs;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/qs;-><init>(Lcom/google/android/gms/internal/ads/ys;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return v1
.end method

.method public final onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 1

    .prologue
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ys;->O:Lcom/google/android/gms/internal/ads/ds;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p2, p3}, Lcom/google/android/gms/internal/ads/ds;->c(II)V

    :cond_0
    sget-object p1, Lv3/E0;->l:Lcom/google/android/gms/internal/ads/Fe0;

    new-instance v0, Lcom/google/android/gms/internal/ads/ps;

    invoke-direct {v0, p0, p2, p3}, Lcom/google/android/gms/internal/ads/ps;-><init>(Lcom/google/android/gms/internal/ads/ys;II)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->F:Lcom/google/android/gms/internal/ads/gs;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/gs;->f(Lcom/google/android/gms/internal/ads/Kr;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->H:Lcom/google/android/gms/internal/ads/Jr;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Kr;->C:Lcom/google/android/gms/internal/ads/Zr;

    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/ads/Zr;->a(Landroid/graphics/SurfaceTexture;Lcom/google/android/gms/internal/ads/Jr;)V

    return-void
.end method

.method protected final onWindowVisibilityChanged(I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AdExoPlayerView3 window visibility changed to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    sget-object v0, Lv3/E0;->l:Lcom/google/android/gms/internal/ads/Fe0;

    new-instance v1, Lcom/google/android/gms/internal/ads/os;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/os;-><init>(Lcom/google/android/gms/internal/ads/ys;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    invoke-super {p0, p1}, Landroid/view/TextureView;->onWindowVisibilityChanged(I)V

    return-void
.end method

.method public final p(I)V
    .locals 3

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ys;->c0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->J:Lcom/google/android/gms/internal/ads/Wr;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Wr;->z(J)V

    :cond_0
    return-void
.end method

.method public final q(Lcom/google/android/gms/internal/ads/Jr;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ys;->H:Lcom/google/android/gms/internal/ads/Jr;

    return-void
.end method

.method public final r(Ljava/lang/String;)V
    .locals 1

    .prologue
    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, v0}, Lcom/google/android/gms/internal/ads/Kr;->c(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/Integer;)V

    :cond_0
    return-void
.end method

.method public final s()V
    .locals 1

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ys;->d0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->J:Lcom/google/android/gms/internal/ads/Wr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Wr;->L()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ys;->Y()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->F:Lcom/google/android/gms/internal/ads/gs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/gs;->e()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Kr;->D:Lcom/google/android/gms/internal/ads/js;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/js;->c()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->F:Lcom/google/android/gms/internal/ads/gs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/gs;->d()V

    return-void
.end method

.method public final t(FF)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->O:Lcom/google/android/gms/internal/ads/ds;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/ds;->f(FF)V

    :cond_0
    return-void
.end method

.method public final u()Ljava/lang/Integer;
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->J:Lcom/google/android/gms/internal/ads/Wr;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Wr;->t()Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final v()V
    .locals 2

    sget-object v0, Lv3/E0;->l:Lcom/google/android/gms/internal/ads/Fe0;

    new-instance v1, Lcom/google/android/gms/internal/ads/ks;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/ks;-><init>(Lcom/google/android/gms/internal/ads/ys;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final w(I)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ys;->J:Lcom/google/android/gms/internal/ads/Wr;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/Wr;->A(I)V

    :cond_0
    return-void
.end method

.method public final x(II)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/ys;->S:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/ys;->T:I

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ys;->a0()V

    return-void
.end method

.method public final y(I)V
    .locals 1

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/ys;->N:I

    if-eq v0, p1, :cond_3

    iput p1, p0, Lcom/google/android/gms/internal/ads/ys;->N:I

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ys;->G:Lcom/google/android/gms/internal/ads/es;

    iget-boolean p1, p1, Lcom/google/android/gms/internal/ads/es;->a:Z

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ys;->X()V

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/ys;->F:Lcom/google/android/gms/internal/ads/gs;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/gs;->e()V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Kr;->D:Lcom/google/android/gms/internal/ads/js;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/js;->c()V

    sget-object p1, Lv3/E0;->l:Lcom/google/android/gms/internal/ads/Fe0;

    new-instance v0, Lcom/google/android/gms/internal/ads/ws;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/ws;-><init>(Lcom/google/android/gms/internal/ads/ys;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_2
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ys;->V()V

    :cond_3
    :goto_0
    return-void
.end method

.method public final z(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 2

    const-string p1, "onLoadException"

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/ys;->T(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "ExoPlayerAdapter exception: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw3/p;->g(Ljava/lang/String;)V

    const-string v0, "AdExoPlayerView.onException"

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v1

    invoke-virtual {v1, p2, v0}, Lcom/google/android/gms/internal/ads/Uq;->w(Ljava/lang/Throwable;Ljava/lang/String;)V

    sget-object p2, Lv3/E0;->l:Lcom/google/android/gms/internal/ads/Fe0;

    new-instance v0, Lcom/google/android/gms/internal/ads/ss;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/ss;-><init>(Lcom/google/android/gms/internal/ads/ys;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
