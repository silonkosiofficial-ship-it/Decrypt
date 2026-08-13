.class final Lcom/google/android/gms/internal/ads/Mj0;
.super Lcom/google/android/gms/internal/ads/Oj0;
.source "SourceFile"


# direct methods
.method constructor <init>(LP4/d;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/tk0;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/Oj0;-><init>(LP4/d;Ljava/lang/Class;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method final bridge synthetic E(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ads/tk0;

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/tk0;->b(Ljava/lang/Object;)LP4/d;

    move-result-object p2

    const-string v0, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s"

    invoke-static {p2, v0, p1}, Lcom/google/android/gms/internal/ads/Ag0;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method final synthetic F(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LP4/d;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/ak0;->v(LP4/d;)Z

    return-void
.end method
