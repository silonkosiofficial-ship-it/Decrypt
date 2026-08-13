.class public final Lcom/google/android/gms/internal/ads/q50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/F50;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/b80;

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:Lcom/google/android/gms/internal/ads/Jk0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/b80;Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/o50;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/o50;-><init>(Lcom/google/android/gms/internal/ads/q50;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/q50;->c:Lcom/google/android/gms/internal/ads/Jk0;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/q50;->a:Lcom/google/android/gms/internal/ads/b80;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/q50;->b:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/google/android/gms/internal/ads/G50;Lcom/google/android/gms/internal/ads/E50;Ljava/lang/Object;)LP4/d;
    .locals 0

    const/4 p3, 0x0

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/q50;->c(Lcom/google/android/gms/internal/ads/G50;Lcom/google/android/gms/internal/ads/E50;Lcom/google/android/gms/internal/ads/jC;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method final synthetic b(Lcom/google/android/gms/internal/ads/jC;Lcom/google/android/gms/internal/ads/y50;)LP4/d;
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/q50;->a:Lcom/google/android/gms/internal/ads/b80;

    iget-object v1, p2, Lcom/google/android/gms/internal/ads/y50;->b:Lcom/google/android/gms/internal/ads/m80;

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/y50;->a:Lcom/google/android/gms/internal/ads/Po;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/b80;->c(Lcom/google/android/gms/internal/ads/m80;)Lcom/google/android/gms/internal/ads/l80;

    move-result-object v0

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/jC;->b()Lcom/google/android/gms/internal/ads/LA;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/LA;->g(Lcom/google/android/gms/internal/ads/Po;)LP4/d;

    move-result-object p1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/q50;->c:Lcom/google/android/gms/internal/ads/Jk0;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/q50;->b:Ljava/util/concurrent/Executor;

    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/ads/Nk0;->r(LP4/d;Lcom/google/android/gms/internal/ads/Jk0;Ljava/util/concurrent/Executor;)V

    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/ads/p50;

    invoke-direct {p1, v1, p2, v0}, Lcom/google/android/gms/internal/ads/p50;-><init>(Lcom/google/android/gms/internal/ads/m80;Lcom/google/android/gms/internal/ads/Po;Lcom/google/android/gms/internal/ads/l80;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lcom/google/android/gms/internal/ads/G50;Lcom/google/android/gms/internal/ads/E50;Lcom/google/android/gms/internal/ads/jC;)LP4/d;
    .locals 1

    new-instance p1, Lcom/google/android/gms/internal/ads/B50;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/q50;->a:Lcom/google/android/gms/internal/ads/b80;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/q50;->b:Ljava/util/concurrent/Executor;

    invoke-direct {p1, p2, p3, v0}, Lcom/google/android/gms/internal/ads/B50;-><init>(Lcom/google/android/gms/internal/ads/b80;Lcom/google/android/gms/internal/ads/jC;Ljava/util/concurrent/Executor;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/B50;->c()LP4/d;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Dk0;->D(LP4/d;)Lcom/google/android/gms/internal/ads/Dk0;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/m50;

    invoke-direct {p2, p0, p3}, Lcom/google/android/gms/internal/ads/m50;-><init>(Lcom/google/android/gms/internal/ads/q50;Lcom/google/android/gms/internal/ads/jC;)V

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/q50;->b:Ljava/util/concurrent/Executor;

    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/Dk0;

    new-instance p2, Lcom/google/android/gms/internal/ads/n50;

    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/ads/n50;-><init>(Lcom/google/android/gms/internal/ads/q50;)V

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/q50;->b:Ljava/util/concurrent/Executor;

    const-class v0, Ljava/lang/Exception;

    invoke-static {p1, v0, p2, p3}, Lcom/google/android/gms/internal/ads/Nk0;->e(LP4/d;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/pg0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/Dk0;

    return-object p1
.end method

.method public final bridge synthetic f()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
