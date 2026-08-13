.class public final synthetic Lcom/google/android/gms/internal/ads/Is;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/Ks;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Ks;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Is;->a:Lcom/google/android/gms/internal/ads/Ks;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Is;->a:Lcom/google/android/gms/internal/ads/Ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Ks;->d()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
