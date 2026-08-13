.class public final Lcom/google/android/gms/internal/ads/Dt;
.super Lcom/google/android/gms/internal/ads/Kr;
.source "SourceFile"


# instance fields
.field private final E:Lcom/google/android/gms/internal/ads/gs;

.field private F:Lcom/google/android/gms/internal/ads/Et;

.field private G:Landroid/net/Uri;

.field private H:Lcom/google/android/gms/internal/ads/Jr;

.field private I:Z

.field private J:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/gs;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/Kr;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/Dt;->J:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/Dt;->I:Z

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Dt;->E:Lcom/google/android/gms/internal/ads/gs;

    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/ads/gs;->a(Lcom/google/android/gms/internal/ads/Kr;)V

    return-void
.end method

.method private final H()Z
    .locals 3

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/Dt;->J:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Dt;->F:Lcom/google/android/gms/internal/ads/Et;

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private final I(I)V
    .locals 2

    .prologue
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Dt;->E:Lcom/google/android/gms/internal/ads/gs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/gs;->c()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Kr;->D:Lcom/google/android/gms/internal/ads/js;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/js;->b()V

    goto :goto_0

    :cond_0
    iget v1, p0, Lcom/google/android/gms/internal/ads/Dt;->J:I

    if-ne v1, v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Dt;->E:Lcom/google/android/gms/internal/ads/gs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/gs;->e()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Kr;->D:Lcom/google/android/gms/internal/ads/js;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/js;->c()V

    :cond_1
    :goto_0
    iput p1, p0, Lcom/google/android/gms/internal/ads/Dt;->J:I

    return-void
.end method


# virtual methods
.method final synthetic E()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Dt;->H:Lcom/google/android/gms/internal/ads/Jr;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Jr;->f()V

    :cond_0
    return-void
.end method

.method final synthetic F()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Dt;->H:Lcom/google/android/gms/internal/ads/Jr;

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/Dt;->I:Z

    if-nez v1, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Jr;->i()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/Dt;->I:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Dt;->H:Lcom/google/android/gms/internal/ads/Jr;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Jr;->d()V

    :cond_1
    return-void
.end method

.method final synthetic G()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Dt;->H:Lcom/google/android/gms/internal/ads/Jr;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Jr;->e()V

    :cond_0
    return-void
.end method

.method public final d()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final e()I
    .locals 1

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Dt;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public final f()I
    .locals 1

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Dt;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public final g()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final h()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final i()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final j()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final k()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    const-string v0, "ImmersivePlayer"

    return-object v0
.end method

.method public final m()V
    .locals 2

    .prologue
    const-string v0, "AdImmersivePlayerView pause"

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Dt;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Dt;->F:Lcom/google/android/gms/internal/ads/Et;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Et;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Dt;->F:Lcom/google/android/gms/internal/ads/Et;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Et;->a()V

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/Dt;->I(I)V

    sget-object v0, Lv3/E0;->l:Lcom/google/android/gms/internal/ads/Fe0;

    new-instance v1, Lcom/google/android/gms/internal/ads/Ct;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/Ct;-><init>(Lcom/google/android/gms/internal/ads/Dt;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final n()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Dt;->F:Lcom/google/android/gms/internal/ads/Et;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Kr;->D:Lcom/google/android/gms/internal/ads/js;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/js;->a()F

    :cond_0
    return-void
.end method

.method public final o()V
    .locals 2

    .prologue
    const-string v0, "AdImmersivePlayerView play"

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Dt;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Dt;->F:Lcom/google/android/gms/internal/ads/Et;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Et;->b()V

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/Dt;->I(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Kr;->C:Lcom/google/android/gms/internal/ads/Zr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Zr;->b()V

    sget-object v0, Lv3/E0;->l:Lcom/google/android/gms/internal/ads/Fe0;

    new-instance v1, Lcom/google/android/gms/internal/ads/Bt;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/Bt;-><init>(Lcom/google/android/gms/internal/ads/Dt;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final p(I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AdImmersivePlayerView seek "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lv3/q0;->k(Ljava/lang/String;)V

    return-void
.end method

.method public final q(Lcom/google/android/gms/internal/ads/Jr;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Dt;->H:Lcom/google/android/gms/internal/ads/Jr;

    return-void
.end method

.method public final r(Ljava/lang/String;)V
    .locals 1

    .prologue
    if-eqz p1, :cond_0

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Dt;->G:Landroid/net/Uri;

    new-instance v0, Lcom/google/android/gms/internal/ads/Et;

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/Et;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Dt;->F:Lcom/google/android/gms/internal/ads/Et;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/Dt;->I(I)V

    sget-object p1, Lv3/E0;->l:Lcom/google/android/gms/internal/ads/Fe0;

    new-instance v0, Lcom/google/android/gms/internal/ads/At;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/At;-><init>(Lcom/google/android/gms/internal/ads/Dt;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final s()V
    .locals 1

    .prologue
    const-string v0, "AdImmersivePlayerView stop"

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Dt;->F:Lcom/google/android/gms/internal/ads/Et;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Et;->c()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Dt;->F:Lcom/google/android/gms/internal/ads/Et;

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/Dt;->I(I)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Dt;->E:Lcom/google/android/gms/internal/ads/gs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/gs;->d()V

    return-void
.end method

.method public final t(FF)V
    .locals 0

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    const-class v0, Lcom/google/android/gms/internal/ads/Dt;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "@"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
