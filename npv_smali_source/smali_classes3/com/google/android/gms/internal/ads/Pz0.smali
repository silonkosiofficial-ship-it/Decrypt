.class final Lcom/google/android/gms/internal/ads/Pz0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/aB0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/JB0;

.field private final b:Lcom/google/android/gms/internal/ads/Nz0;

.field private c:Lcom/google/android/gms/internal/ads/AB0;

.field private d:Lcom/google/android/gms/internal/ads/aB0;

.field private e:Z

.field private f:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/Nz0;Lcom/google/android/gms/internal/ads/mD;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Pz0;->b:Lcom/google/android/gms/internal/ads/Nz0;

    new-instance p1, Lcom/google/android/gms/internal/ads/JB0;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/JB0;-><init>(Lcom/google/android/gms/internal/ads/mD;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Pz0;->a:Lcom/google/android/gms/internal/ads/JB0;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/Pz0;->e:Z

    return-void
.end method


# virtual methods
.method public final Q(Lcom/google/android/gms/internal/ads/qg;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Pz0;->d:Lcom/google/android/gms/internal/ads/aB0;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/aB0;->Q(Lcom/google/android/gms/internal/ads/qg;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Pz0;->d:Lcom/google/android/gms/internal/ads/aB0;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/aB0;->c()Lcom/google/android/gms/internal/ads/qg;

    move-result-object p1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Pz0;->a:Lcom/google/android/gms/internal/ads/JB0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/JB0;->Q(Lcom/google/android/gms/internal/ads/qg;)V

    return-void
.end method

.method public final a()J
    .locals 2

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/Pz0;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Pz0;->a:Lcom/google/android/gms/internal/ads/JB0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/JB0;->a()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Pz0;->d:Lcom/google/android/gms/internal/ads/aB0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/aB0;->a()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public final b(Z)J
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Pz0;->c:Lcom/google/android/gms/internal/ads/AB0;

    if-eqz v0, :cond_4

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/AB0;->g()Z

    move-result v0

    if-nez v0, :cond_4

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Pz0;->c:Lcom/google/android/gms/internal/ads/AB0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/AB0;->f()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Pz0;->c:Lcom/google/android/gms/internal/ads/AB0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/AB0;->X()Z

    move-result v0

    if-nez v0, :cond_1

    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Pz0;->c:Lcom/google/android/gms/internal/ads/AB0;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/AB0;->g0()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Pz0;->d:Lcom/google/android/gms/internal/ads/aB0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/aB0;->a()J

    move-result-wide v0

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/Pz0;->e:Z

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Pz0;->a:Lcom/google/android/gms/internal/ads/JB0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/JB0;->a()J

    move-result-wide v2

    cmp-long v2, v0, v2

    if-gez v2, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Pz0;->a:Lcom/google/android/gms/internal/ads/JB0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/JB0;->e()V

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/Pz0;->e:Z

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/Pz0;->f:Z

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Pz0;->a:Lcom/google/android/gms/internal/ads/JB0;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/JB0;->d()V

    :cond_3
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Pz0;->a:Lcom/google/android/gms/internal/ads/JB0;

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/ads/JB0;->b(J)V

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/aB0;->c()Lcom/google/android/gms/internal/ads/qg;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Pz0;->a:Lcom/google/android/gms/internal/ads/JB0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/JB0;->c()Lcom/google/android/gms/internal/ads/qg;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/qg;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Pz0;->a:Lcom/google/android/gms/internal/ads/JB0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/JB0;->Q(Lcom/google/android/gms/internal/ads/qg;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Pz0;->b:Lcom/google/android/gms/internal/ads/Nz0;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/Nz0;->a(Lcom/google/android/gms/internal/ads/qg;)V

    goto :goto_1

    :cond_4
    :goto_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/Pz0;->e:Z

    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/Pz0;->f:Z

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Pz0;->a:Lcom/google/android/gms/internal/ads/JB0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/JB0;->d()V

    :cond_5
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Pz0;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method public final c()Lcom/google/android/gms/internal/ads/qg;
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Pz0;->d:Lcom/google/android/gms/internal/ads/aB0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/aB0;->c()Lcom/google/android/gms/internal/ads/qg;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Pz0;->a:Lcom/google/android/gms/internal/ads/JB0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/JB0;->c()Lcom/google/android/gms/internal/ads/qg;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final d(Lcom/google/android/gms/internal/ads/AB0;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Pz0;->c:Lcom/google/android/gms/internal/ads/AB0;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Pz0;->d:Lcom/google/android/gms/internal/ads/aB0;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Pz0;->c:Lcom/google/android/gms/internal/ads/AB0;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/Pz0;->e:Z

    :cond_0
    return-void
.end method

.method public final e(Lcom/google/android/gms/internal/ads/AB0;)V
    .locals 2

    .prologue
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/AB0;->l()Lcom/google/android/gms/internal/ads/aB0;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Pz0;->d:Lcom/google/android/gms/internal/ads/aB0;

    if-eq v0, v1, :cond_1

    if-nez v1, :cond_0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Pz0;->d:Lcom/google/android/gms/internal/ads/aB0;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Pz0;->c:Lcom/google/android/gms/internal/ads/AB0;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Pz0;->a:Lcom/google/android/gms/internal/ads/JB0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/JB0;->c()Lcom/google/android/gms/internal/ads/qg;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/aB0;->Q(Lcom/google/android/gms/internal/ads/qg;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Multiple renderer media clocks enabled."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    const/16 v0, 0x3e8

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/Qz0;->d(Ljava/lang/RuntimeException;I)Lcom/google/android/gms/internal/ads/Qz0;

    move-result-object p1

    throw p1

    :cond_1
    return-void
.end method

.method public final f(J)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Pz0;->a:Lcom/google/android/gms/internal/ads/JB0;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/JB0;->b(J)V

    return-void
.end method

.method public final g()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/Pz0;->f:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Pz0;->a:Lcom/google/android/gms/internal/ads/JB0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/JB0;->d()V

    return-void
.end method

.method public final h()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/Pz0;->f:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Pz0;->a:Lcom/google/android/gms/internal/ads/JB0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/JB0;->e()V

    return-void
.end method

.method public final j()Z
    .locals 1

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/Pz0;->e:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Pz0;->d:Lcom/google/android/gms/internal/ads/aB0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/aB0;->j()Z

    move-result v0

    return v0
.end method
