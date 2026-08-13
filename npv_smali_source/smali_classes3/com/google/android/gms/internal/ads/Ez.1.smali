.class public final synthetic Lcom/google/android/gms/internal/ads/Ez;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/Ot;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Ot;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Ez;->C:Lcom/google/android/gms/internal/ads/Ot;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ez;->C:Lcom/google/android/gms/internal/ads/Ot;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->onResume()V

    return-void
.end method
