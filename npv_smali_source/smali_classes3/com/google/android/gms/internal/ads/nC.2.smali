.class public final Lcom/google/android/gms/internal/ads/nC;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/ads/n70;

.field private final c:Landroid/os/Bundle;

.field private final d:Lcom/google/android/gms/internal/ads/f70;

.field private final e:Lcom/google/android/gms/internal/ads/dC;

.field private final f:Lcom/google/android/gms/internal/ads/bU;

.field private final g:I


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/lC;Lcom/google/android/gms/internal/ads/mC;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/lC;->b(Lcom/google/android/gms/internal/ads/lC;)Landroid/content/Context;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/nC;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/lC;->o(Lcom/google/android/gms/internal/ads/lC;)Lcom/google/android/gms/internal/ads/n70;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/nC;->b:Lcom/google/android/gms/internal/ads/n70;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/lC;->c(Lcom/google/android/gms/internal/ads/lC;)Landroid/os/Bundle;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/nC;->c:Landroid/os/Bundle;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/lC;->n(Lcom/google/android/gms/internal/ads/lC;)Lcom/google/android/gms/internal/ads/f70;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/nC;->d:Lcom/google/android/gms/internal/ads/f70;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/lC;->d(Lcom/google/android/gms/internal/ads/lC;)Lcom/google/android/gms/internal/ads/dC;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/nC;->e:Lcom/google/android/gms/internal/ads/dC;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/lC;->m(Lcom/google/android/gms/internal/ads/lC;)Lcom/google/android/gms/internal/ads/bU;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/nC;->f:Lcom/google/android/gms/internal/ads/bU;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/lC;->a(Lcom/google/android/gms/internal/ads/lC;)I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/nC;->g:I

    return-void
.end method


# virtual methods
.method final a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/nC;->g:I

    return v0
.end method

.method final b(Landroid/content/Context;)Landroid/content/Context;
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/nC;->a:Landroid/content/Context;

    return-object p1
.end method

.method final c()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nC;->c:Landroid/os/Bundle;

    return-object v0
.end method

.method final d()Lcom/google/android/gms/internal/ads/dC;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nC;->e:Lcom/google/android/gms/internal/ads/dC;

    return-object v0
.end method

.method final e()Lcom/google/android/gms/internal/ads/lC;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/lC;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/lC;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/nC;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/lC;->f(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/lC;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/nC;->b:Lcom/google/android/gms/internal/ads/n70;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/lC;->k(Lcom/google/android/gms/internal/ads/n70;)Lcom/google/android/gms/internal/ads/lC;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/nC;->c:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/lC;->g(Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/lC;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/nC;->e:Lcom/google/android/gms/internal/ads/dC;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/lC;->h(Lcom/google/android/gms/internal/ads/dC;)Lcom/google/android/gms/internal/ads/lC;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/nC;->f:Lcom/google/android/gms/internal/ads/bU;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/lC;->e(Lcom/google/android/gms/internal/ads/bU;)Lcom/google/android/gms/internal/ads/lC;

    return-object v0
.end method

.method final f(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/bU;
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nC;->f:Lcom/google/android/gms/internal/ads/bU;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/bU;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/bU;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method final g()Lcom/google/android/gms/internal/ads/f70;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nC;->d:Lcom/google/android/gms/internal/ads/f70;

    return-object v0
.end method

.method final h()Lcom/google/android/gms/internal/ads/n70;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nC;->b:Lcom/google/android/gms/internal/ads/n70;

    return-object v0
.end method
