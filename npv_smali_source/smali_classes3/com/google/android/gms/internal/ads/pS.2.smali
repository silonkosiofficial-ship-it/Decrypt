.class public final Lcom/google/android/gms/internal/ads/pS;
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

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/pS;->a:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/oS;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pS;->a:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/xv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/xv;->a()Lcom/google/android/gms/internal/ads/Jo;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/oS;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/oS;-><init>(Lcom/google/android/gms/internal/ads/Jo;)V

    return-object v1
.end method

.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/pS;->a()Lcom/google/android/gms/internal/ads/oS;

    move-result-object v0

    return-object v0
.end method
