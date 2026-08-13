.class public final Lcom/google/android/gms/common/api/internal/h;
.super Lcom/google/android/gms/common/api/internal/C;
.source "SourceFile"


# instance fields
.field private final H:Lr/b;

.field private final I:Lcom/google/android/gms/common/api/internal/c;


# direct methods
.method constructor <init>(LP3/e;Lcom/google/android/gms/common/api/internal/c;LN3/g;)V
    .locals 0

    invoke-direct {p0, p1, p3}, Lcom/google/android/gms/common/api/internal/C;-><init>(LP3/e;LN3/g;)V

    new-instance p1, Lr/b;

    invoke-direct {p1}, Lr/b;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/h;->H:Lr/b;

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/h;->I:Lcom/google/android/gms/common/api/internal/c;

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->C:LP3/e;

    const-string p2, "ConnectionlessLifecycleHelper"

    invoke-interface {p1, p2, p0}, LP3/e;->a(Ljava/lang/String;Lcom/google/android/gms/common/api/internal/LifecycleCallback;)V

    return-void
.end method

.method public static u(Landroid/app/Activity;Lcom/google/android/gms/common/api/internal/c;LP3/b;)V
    .locals 2

    .prologue
    invoke-static {p0}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->d(Landroid/app/Activity;)LP3/e;

    move-result-object p0

    const-string v0, "ConnectionlessLifecycleHelper"

    const-class v1, Lcom/google/android/gms/common/api/internal/h;

    invoke-interface {p0, v0, v1}, LP3/e;->c(Ljava/lang/String;Ljava/lang/Class;)Lcom/google/android/gms/common/api/internal/LifecycleCallback;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/internal/h;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/common/api/internal/h;

    invoke-static {}, LN3/g;->m()LN3/g;

    move-result-object v1

    invoke-direct {v0, p0, p1, v1}, Lcom/google/android/gms/common/api/internal/h;-><init>(LP3/e;Lcom/google/android/gms/common/api/internal/c;LN3/g;)V

    :cond_0
    const-string p0, "ApiKey cannot be null"

    invoke-static {p2, p0}, LQ3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p0, v0, Lcom/google/android/gms/common/api/internal/h;->H:Lr/b;

    invoke-virtual {p0, p2}, Lr/b;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/internal/c;->b(Lcom/google/android/gms/common/api/internal/h;)V

    return-void
.end method

.method private final v()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/h;->H:Lr/b;

    invoke-virtual {v0}, Lr/b;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/h;->I:Lcom/google/android/gms/common/api/internal/c;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/internal/c;->b(Lcom/google/android/gms/common/api/internal/h;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final h()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->h()V

    invoke-direct {p0}, Lcom/google/android/gms/common/api/internal/h;->v()V

    return-void
.end method

.method public final j()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/common/api/internal/C;->j()V

    invoke-direct {p0}, Lcom/google/android/gms/common/api/internal/h;->v()V

    return-void
.end method

.method public final k()V
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/common/api/internal/C;->k()V

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/h;->I:Lcom/google/android/gms/common/api/internal/c;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/internal/c;->c(Lcom/google/android/gms/common/api/internal/h;)V

    return-void
.end method

.method protected final m(LN3/b;I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/h;->I:Lcom/google/android/gms/common/api/internal/c;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/common/api/internal/c;->D(LN3/b;I)V

    return-void
.end method

.method protected final n()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/h;->I:Lcom/google/android/gms/common/api/internal/c;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/c;->E()V

    return-void
.end method

.method final t()Lr/b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/h;->H:Lr/b;

    return-object v0
.end method
