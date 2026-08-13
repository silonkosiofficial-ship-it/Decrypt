.class public final synthetic Lcom/google/android/gms/internal/ads/KZ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/MZ;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/MZ;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/KZ;->a:Lcom/google/android/gms/internal/ads/MZ;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KZ;->a:Lcom/google/android/gms/internal/ads/MZ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/MZ;->c()Lcom/google/android/gms/internal/ads/NZ;

    move-result-object v0

    return-object v0
.end method
