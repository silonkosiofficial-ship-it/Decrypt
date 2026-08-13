.class public final Lcom/google/android/gms/internal/ads/WT;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/VT;


# instance fields
.field public final a:Lcom/google/android/gms/internal/ads/VT;

.field private final b:Lcom/google/android/gms/internal/ads/pg0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/VT;Lcom/google/android/gms/internal/ads/pg0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/WT;->a:Lcom/google/android/gms/internal/ads/VT;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/WT;->b:Lcom/google/android/gms/internal/ads/pg0;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/WT;->a:Lcom/google/android/gms/internal/ads/VT;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/VT;->a(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;)Z

    move-result p1

    return p1
.end method

.method public final b(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;)LP4/d;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/WT;->a:Lcom/google/android/gms/internal/ads/VT;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/VT;->b(Lcom/google/android/gms/internal/ads/e70;Lcom/google/android/gms/internal/ads/R60;)LP4/d;

    move-result-object p1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/WT;->b:Lcom/google/android/gms/internal/ads/pg0;

    sget-object v0, Lcom/google/android/gms/internal/ads/dr;->a:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {p1, p2, v0}, Lcom/google/android/gms/internal/ads/Nk0;->m(LP4/d;Lcom/google/android/gms/internal/ads/pg0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    return-object p1
.end method
