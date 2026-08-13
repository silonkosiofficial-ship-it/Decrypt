.class public final Lcom/google/android/gms/internal/ads/V9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final a:Z

.field final b:Ljava/lang/String;

.field final c:Lcom/google/android/gms/internal/ads/p8;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/X7;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/X7;->f0()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/V9;->b:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/X7;->i0()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/V9;->a:Z

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/X7;->d0()Lcom/google/android/gms/internal/ads/p8;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/V9;->c:Lcom/google/android/gms/internal/ads/p8;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/X7;->e0()Lcom/google/android/gms/internal/ads/t8;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/V9;->b:Ljava/lang/String;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/V9;->a:Z

    invoke-static {}, Lcom/google/android/gms/internal/ads/p8;->d0()Lcom/google/android/gms/internal/ads/p8;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/V9;->c:Lcom/google/android/gms/internal/ads/p8;

    sget p1, Lcom/google/android/gms/internal/ads/t8;->zza:I

    return-void
.end method
