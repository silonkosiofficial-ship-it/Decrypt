.class public final Lcom/google/android/gms/internal/ads/s30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/L20;


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/Lq;Ljava/util/concurrent/Executor;Ljava/lang/String;Landroid/content/pm/PackageInfo;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/s30;->a:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/s30;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/16 v0, 0x29

    return v0
.end method

.method public final b()LP4/d;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s30;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/q30;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/q30;-><init>()V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/s30;->a:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Nk0;->m(LP4/d;Lcom/google/android/gms/internal/ads/pg0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/r30;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/r30;-><init>(Lcom/google/android/gms/internal/ads/s30;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/s30;->a:Ljava/util/concurrent/Executor;

    const-class v3, Ljava/lang/Throwable;

    invoke-static {v0, v3, v1, v2}, Lcom/google/android/gms/internal/ads/Nk0;->f(LP4/d;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object v0

    return-object v0
.end method

.method final synthetic c(Ljava/lang/Throwable;)LP4/d;
    .locals 1

    new-instance p1, Lcom/google/android/gms/internal/ads/t30;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/s30;->b:Ljava/lang/String;

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/t30;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1
.end method
