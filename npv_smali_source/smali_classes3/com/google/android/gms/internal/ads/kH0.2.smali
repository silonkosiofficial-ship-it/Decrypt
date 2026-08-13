.class public abstract Lcom/google/android/gms/internal/ads/kH0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/NH0;


# instance fields
.field private final a:Ljava/util/ArrayList;

.field private final b:Ljava/util/HashSet;

.field private final c:Lcom/google/android/gms/internal/ads/VH0;

.field private final d:Lcom/google/android/gms/internal/ads/SF0;

.field private e:Landroid/os/Looper;

.field private f:Lcom/google/android/gms/internal/ads/qm;

.field private g:Lcom/google/android/gms/internal/ads/bE0;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/kH0;->a:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/kH0;->b:Ljava/util/HashSet;

    new-instance v0, Lcom/google/android/gms/internal/ads/VH0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/VH0;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/kH0;->c:Lcom/google/android/gms/internal/ads/VH0;

    new-instance v0, Lcom/google/android/gms/internal/ads/SF0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/SF0;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/kH0;->d:Lcom/google/android/gms/internal/ads/SF0;

    return-void
.end method


# virtual methods
.method public synthetic R()Lcom/google/android/gms/internal/ads/qm;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final a(Lcom/google/android/gms/internal/ads/MH0;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kH0;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kH0;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/kH0;->e:Landroid/os/Looper;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/kH0;->f:Lcom/google/android/gms/internal/ads/qm;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/kH0;->g:Lcom/google/android/gms/internal/ads/bE0;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/kH0;->b:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->clear()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/kH0;->w()V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/kH0;->f(Lcom/google/android/gms/internal/ads/MH0;)V

    return-void
.end method

.method public abstract synthetic c(Lcom/google/android/gms/internal/ads/Q7;)V
.end method

.method public final f(Lcom/google/android/gms/internal/ads/MH0;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kH0;->b:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kH0;->b:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/kH0;->b:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/kH0;->r()V

    :cond_0
    return-void
.end method

.method public final g(Lcom/google/android/gms/internal/ads/MH0;Lcom/google/android/gms/internal/ads/Pv0;Lcom/google/android/gms/internal/ads/bE0;)V
    .locals 3

    .prologue
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kH0;->e:Landroid/os/Looper;

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :cond_1
    :goto_0
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/LC;->d(Z)V

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/kH0;->g:Lcom/google/android/gms/internal/ads/bE0;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/kH0;->f:Lcom/google/android/gms/internal/ads/qm;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kH0;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/kH0;->e:Landroid/os/Looper;

    if-nez v1, :cond_2

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/kH0;->e:Landroid/os/Looper;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/kH0;->b:Ljava/util/HashSet;

    invoke-virtual {p3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/ads/kH0;->t(Lcom/google/android/gms/internal/ads/Pv0;)V

    return-void

    :cond_2
    if-eqz p3, :cond_3

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/kH0;->i(Lcom/google/android/gms/internal/ads/MH0;)V

    invoke-interface {p1, p0, p3}, Lcom/google/android/gms/internal/ads/MH0;->a(Lcom/google/android/gms/internal/ads/NH0;Lcom/google/android/gms/internal/ads/qm;)V

    :cond_3
    return-void
.end method

.method public final h(Lcom/google/android/gms/internal/ads/WH0;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kH0;->c:Lcom/google/android/gms/internal/ads/VH0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/VH0;->i(Lcom/google/android/gms/internal/ads/WH0;)V

    return-void
.end method

.method public final i(Lcom/google/android/gms/internal/ads/MH0;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kH0;->e:Landroid/os/Looper;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kH0;->b:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v1

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/kH0;->s()V

    :cond_0
    return-void
.end method

.method public final j(Landroid/os/Handler;Lcom/google/android/gms/internal/ads/TF0;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kH0;->d:Lcom/google/android/gms/internal/ads/SF0;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/SF0;->b(Landroid/os/Handler;Lcom/google/android/gms/internal/ads/TF0;)V

    return-void
.end method

.method public final k(Lcom/google/android/gms/internal/ads/TF0;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kH0;->d:Lcom/google/android/gms/internal/ads/SF0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/SF0;->c(Lcom/google/android/gms/internal/ads/TF0;)V

    return-void
.end method

.method public final l(Landroid/os/Handler;Lcom/google/android/gms/internal/ads/WH0;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kH0;->c:Lcom/google/android/gms/internal/ads/VH0;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/VH0;->b(Landroid/os/Handler;Lcom/google/android/gms/internal/ads/WH0;)V

    return-void
.end method

.method protected final m()Lcom/google/android/gms/internal/ads/bE0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kH0;->g:Lcom/google/android/gms/internal/ads/bE0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LC;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method protected final n(Lcom/google/android/gms/internal/ads/LH0;)Lcom/google/android/gms/internal/ads/SF0;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kH0;->d:Lcom/google/android/gms/internal/ads/SF0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/SF0;->a(ILcom/google/android/gms/internal/ads/LH0;)Lcom/google/android/gms/internal/ads/SF0;

    move-result-object p1

    return-object p1
.end method

.method protected final o(ILcom/google/android/gms/internal/ads/LH0;)Lcom/google/android/gms/internal/ads/SF0;
    .locals 1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/kH0;->d:Lcom/google/android/gms/internal/ads/SF0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p2}, Lcom/google/android/gms/internal/ads/SF0;->a(ILcom/google/android/gms/internal/ads/LH0;)Lcom/google/android/gms/internal/ads/SF0;

    move-result-object p1

    return-object p1
.end method

.method protected final p(Lcom/google/android/gms/internal/ads/LH0;)Lcom/google/android/gms/internal/ads/VH0;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kH0;->c:Lcom/google/android/gms/internal/ads/VH0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/VH0;->a(ILcom/google/android/gms/internal/ads/LH0;)Lcom/google/android/gms/internal/ads/VH0;

    move-result-object p1

    return-object p1
.end method

.method protected final q(ILcom/google/android/gms/internal/ads/LH0;)Lcom/google/android/gms/internal/ads/VH0;
    .locals 1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/kH0;->c:Lcom/google/android/gms/internal/ads/VH0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p2}, Lcom/google/android/gms/internal/ads/VH0;->a(ILcom/google/android/gms/internal/ads/LH0;)Lcom/google/android/gms/internal/ads/VH0;

    move-result-object p1

    return-object p1
.end method

.method protected r()V
    .locals 0

    return-void
.end method

.method protected s()V
    .locals 0

    return-void
.end method

.method protected abstract t(Lcom/google/android/gms/internal/ads/Pv0;)V
.end method

.method protected final u(Lcom/google/android/gms/internal/ads/qm;)V
    .locals 4

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/kH0;->f:Lcom/google/android/gms/internal/ads/qm;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kH0;->a:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/MH0;

    invoke-interface {v3, p0, p1}, Lcom/google/android/gms/internal/ads/MH0;->a(Lcom/google/android/gms/internal/ads/NH0;Lcom/google/android/gms/internal/ads/qm;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public synthetic v()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected abstract w()V
.end method

.method protected final x()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kH0;->b:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
