.class public final synthetic Lcom/google/android/gms/internal/ads/Dl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/or;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/mr;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/mr;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Dl;->a:Lcom/google/android/gms/internal/ads/mr;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/kl;

    const-string v1, "Cannot get Javascript Engine"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/kl;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Dl;->a:Lcom/google/android/gms/internal/ads/mr;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/mr;->d(Ljava/lang/Throwable;)Z

    return-void
.end method
