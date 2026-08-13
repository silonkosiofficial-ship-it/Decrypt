.class public final synthetic Lcom/google/android/gms/internal/ads/qA;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/Jk0;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Jk0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/qA;->C:Lcom/google/android/gms/internal/ads/Jk0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/oQ;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/oQ;-><init>(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/qA;->C:Lcom/google/android/gms/internal/ads/Jk0;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/Jk0;->a(Ljava/lang/Throwable;)V

    return-void
.end method
