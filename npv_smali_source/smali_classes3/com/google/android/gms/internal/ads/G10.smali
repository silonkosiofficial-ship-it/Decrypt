.class public final Lcom/google/android/gms/internal/ads/G10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/L20;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Q60;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Q60;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/G10;->a:Lcom/google/android/gms/internal/ads/Q60;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/16 v0, 0x19

    return v0
.end method

.method public final b()LP4/d;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/H10;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/G10;->a:Lcom/google/android/gms/internal/ads/Q60;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/H10;-><init>(Lcom/google/android/gms/internal/ads/Q60;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object v0

    return-object v0
.end method
