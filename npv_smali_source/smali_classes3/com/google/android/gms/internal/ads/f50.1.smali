.class public final Lcom/google/android/gms/internal/ads/f50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/F50;


# instance fields
.field private a:Lcom/google/android/gms/internal/ads/jC;

.field private final b:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/ads/fl0;->c()Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/f50;->b:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/google/android/gms/internal/ads/G50;Lcom/google/android/gms/internal/ads/E50;Ljava/lang/Object;)LP4/d;
    .locals 0

    const/4 p3, 0x0

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/f50;->c(Lcom/google/android/gms/internal/ads/G50;Lcom/google/android/gms/internal/ads/E50;Lcom/google/android/gms/internal/ads/jC;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method public final b()Lcom/google/android/gms/internal/ads/jC;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/f50;->a:Lcom/google/android/gms/internal/ads/jC;

    return-object v0
.end method

.method public final c(Lcom/google/android/gms/internal/ads/G50;Lcom/google/android/gms/internal/ads/E50;Lcom/google/android/gms/internal/ads/jC;)LP4/d;
    .locals 1

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/G50;->b:Lcom/google/android/gms/internal/ads/D50;

    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/E50;->a(Lcom/google/android/gms/internal/ads/D50;)Lcom/google/android/gms/internal/ads/iC;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/J50;

    const/4 p3, 0x1

    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/ads/J50;-><init>(Z)V

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/iC;->l(Lcom/google/android/gms/internal/ads/J50;)Lcom/google/android/gms/internal/ads/iC;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/iC;->g()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/jC;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/f50;->a:Lcom/google/android/gms/internal/ads/jC;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/jC;->b()Lcom/google/android/gms/internal/ads/LA;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/l80;

    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/l80;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/LA;->i()LP4/d;

    move-result-object p3

    invoke-static {p3}, Lcom/google/android/gms/internal/ads/Dk0;->D(LP4/d;)Lcom/google/android/gms/internal/ads/Dk0;

    move-result-object p3

    new-instance v0, Lcom/google/android/gms/internal/ads/d50;

    invoke-direct {v0, p0, p2, p1}, Lcom/google/android/gms/internal/ads/d50;-><init>(Lcom/google/android/gms/internal/ads/f50;Lcom/google/android/gms/internal/ads/l80;Lcom/google/android/gms/internal/ads/LA;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/f50;->b:Ljava/util/concurrent/Executor;

    invoke-static {p3, v0, p1}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/Dk0;

    new-instance p3, Lcom/google/android/gms/internal/ads/e50;

    invoke-direct {p3, p2}, Lcom/google/android/gms/internal/ads/e50;-><init>(Lcom/google/android/gms/internal/ads/l80;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/f50;->b:Ljava/util/concurrent/Executor;

    invoke-static {p1, p3, p2}, Lcom/google/android/gms/internal/ads/Nk0;->m(LP4/d;Lcom/google/android/gms/internal/ads/pg0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/Dk0;

    return-object p1
.end method

.method public final synthetic f()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/f50;->a:Lcom/google/android/gms/internal/ads/jC;

    return-object v0
.end method
