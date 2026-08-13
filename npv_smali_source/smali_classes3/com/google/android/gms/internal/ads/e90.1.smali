.class public abstract Lcom/google/android/gms/internal/ads/e90;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/util/concurrent/Callable;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/n90;)Lcom/google/android/gms/internal/ads/l90;
    .locals 1

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/n90;->e(Lcom/google/android/gms/internal/ads/n90;)Lcom/google/android/gms/internal/ads/Yk0;

    move-result-object v0

    invoke-static {p0, v0, p1, p2}, Lcom/google/android/gms/internal/ads/e90;->b(Ljava/util/concurrent/Callable;Lcom/google/android/gms/internal/ads/Yk0;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/n90;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/util/concurrent/Callable;Lcom/google/android/gms/internal/ads/Yk0;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/n90;)Lcom/google/android/gms/internal/ads/l90;
    .locals 9

    new-instance v8, Lcom/google/android/gms/internal/ads/l90;

    invoke-static {}, Lcom/google/android/gms/internal/ads/n90;->d()LP4/d;

    move-result-object v4

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v5

    invoke-interface {p1, p0}, Lcom/google/android/gms/internal/ads/Yk0;->H0(Ljava/util/concurrent/Callable;)LP4/d;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v3, 0x0

    move-object v0, v8

    move-object v1, p3

    move-object v2, p2

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/l90;-><init>(Lcom/google/android/gms/internal/ads/n90;Ljava/lang/Object;Ljava/lang/String;LP4/d;Ljava/util/List;LP4/d;Lcom/google/android/gms/internal/ads/m90;)V

    return-object v8
.end method

.method public static final c(LP4/d;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/n90;)Lcom/google/android/gms/internal/ads/l90;
    .locals 9

    new-instance v8, Lcom/google/android/gms/internal/ads/l90;

    invoke-static {}, Lcom/google/android/gms/internal/ads/n90;->d()LP4/d;

    move-result-object v4

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v5

    const/4 v7, 0x0

    const/4 v3, 0x0

    move-object v0, v8

    move-object v1, p2

    move-object v2, p1

    move-object v6, p0

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/l90;-><init>(Lcom/google/android/gms/internal/ads/n90;Ljava/lang/Object;Ljava/lang/String;LP4/d;Ljava/util/List;LP4/d;Lcom/google/android/gms/internal/ads/m90;)V

    return-object v8
.end method

.method public static final d(Lcom/google/android/gms/internal/ads/Z80;Lcom/google/android/gms/internal/ads/Yk0;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/n90;)Lcom/google/android/gms/internal/ads/l90;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/d90;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/d90;-><init>(Lcom/google/android/gms/internal/ads/Z80;)V

    invoke-static {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/e90;->b(Ljava/util/concurrent/Callable;Lcom/google/android/gms/internal/ads/Yk0;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/n90;)Lcom/google/android/gms/internal/ads/l90;

    move-result-object p0

    return-object p0
.end method
