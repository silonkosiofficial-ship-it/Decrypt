.class public final synthetic Lcom/google/android/gms/internal/ads/p20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/sX;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/sX;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/p20;->C:Lcom/google/android/gms/internal/ads/sX;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/p20;->C:Lcom/google/android/gms/internal/ads/sX;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sX;->c()V

    return-void
.end method
