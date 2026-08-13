.class public final synthetic Lcom/google/android/gms/internal/ads/rB;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/sB;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/sB;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/rB;->C:Lcom/google/android/gms/internal/ads/sB;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rB;->C:Lcom/google/android/gms/internal/ads/sB;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sB;->b()V

    return-void
.end method
