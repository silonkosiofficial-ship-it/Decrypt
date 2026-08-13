.class public final synthetic Lcom/google/android/gms/internal/ads/MC;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/SC;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/SC;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/MC;->C:Lcom/google/android/gms/internal/ads/SC;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/MC;->C:Lcom/google/android/gms/internal/ads/SC;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/SC;->q1()V

    return-void
.end method
