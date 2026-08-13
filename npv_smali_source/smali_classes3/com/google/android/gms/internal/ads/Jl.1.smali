.class public final Lcom/google/android/gms/internal/ads/Jl;
.super Lcom/google/android/gms/internal/ads/Nu;
.source "SourceFile"


# instance fields
.field private final C:Lh4/a;


# direct methods
.method constructor <init>(Lh4/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Nu;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Jl;->C:Lh4/a;

    return-void
.end method


# virtual methods
.method public final D0(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Jl;->C:Lh4/a;

    invoke-virtual {v0, p1}, Lh4/a;->s(Landroid/os/Bundle;)V

    return-void
.end method

.method public final M2(Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Jl;->C:Lh4/a;

    invoke-virtual {v0, p1}, Lh4/a;->p(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method

.method public final O5(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Jl;->C:Lh4/a;

    invoke-virtual {v0, p1, p2, p3}, Lh4/a;->b(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final U(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Jl;->C:Lh4/a;

    invoke-virtual {v0, p1}, Lh4/a;->r(Landroid/os/Bundle;)V

    return-void
.end method

.method public final W(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Jl;->C:Lh4/a;

    invoke-virtual {v0, p1}, Lh4/a;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final c()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Jl;->C:Lh4/a;

    invoke-virtual {v0}, Lh4/a;->d()J

    move-result-wide v0

    return-wide v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Jl;->C:Lh4/a;

    invoke-virtual {v0}, Lh4/a;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Jl;->C:Lh4/a;

    invoke-virtual {v0}, Lh4/a;->f()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Jl;->C:Lh4/a;

    invoke-virtual {v0}, Lh4/a;->i()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Jl;->C:Lh4/a;

    invoke-virtual {v0}, Lh4/a;->j()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final h4(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Jl;->C:Lh4/a;

    invoke-virtual {v0, p1, p2}, Lh4/a;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Jl;->C:Lh4/a;

    invoke-virtual {v0}, Lh4/a;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final i0(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Jl;->C:Lh4/a;

    invoke-virtual {v0, p1}, Lh4/a;->o(Landroid/os/Bundle;)V

    return-void
.end method

.method public final p0(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Jl;->C:Lh4/a;

    invoke-virtual {v0, p1}, Lh4/a;->c(Ljava/lang/String;)V

    return-void
.end method

.method public final q5(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Jl;->C:Lh4/a;

    invoke-virtual {v0, p1, p2, p3}, Lh4/a;->m(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public final t5(Ljava/lang/String;Ljava/lang/String;LX3/a;)V
    .locals 1

    .prologue
    if-eqz p3, :cond_0

    invoke-static {p3}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object p3

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Jl;->C:Lh4/a;

    invoke-virtual {v0, p1, p2, p3}, Lh4/a;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final u5(LX3/a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    if-eqz p1, :cond_0

    invoke-static {p1}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Jl;->C:Lh4/a;

    invoke-virtual {v0, p1, p2, p3}, Lh4/a;->t(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final y(Ljava/lang/String;)I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Jl;->C:Lh4/a;

    invoke-virtual {v0, p1}, Lh4/a;->l(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final y4(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Jl;->C:Lh4/a;

    invoke-virtual {v0, p1, p2, p3}, Lh4/a;->n(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
