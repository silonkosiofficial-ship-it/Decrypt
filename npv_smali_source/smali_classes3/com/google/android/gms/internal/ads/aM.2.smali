.class public final Lcom/google/android/gms/internal/ads/aM;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/aM;->a:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/ZL;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aM;->a:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/xJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/xJ;->a()Lcom/google/android/gms/internal/ads/eJ;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/ZL;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/ZL;-><init>(Lcom/google/android/gms/internal/ads/eJ;)V

    return-object v1
.end method

.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/aM;->a()Lcom/google/android/gms/internal/ads/ZL;

    move-result-object v0

    return-object v0
.end method
