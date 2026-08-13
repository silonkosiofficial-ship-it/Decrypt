.class public final synthetic Lcom/google/android/gms/internal/ads/EY;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/FY;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/FY;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/EY;->a:Lcom/google/android/gms/internal/ads/FY;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/EY;->a:Lcom/google/android/gms/internal/ads/FY;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/FY;->c()Lcom/google/android/gms/internal/ads/GY;

    move-result-object v0

    return-object v0
.end method
