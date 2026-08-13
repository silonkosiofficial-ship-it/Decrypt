.class public final synthetic Lcom/google/android/gms/internal/ads/aP;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/pP;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/pP;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/aP;->C:Lcom/google/android/gms/internal/ads/pP;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aP;->C:Lcom/google/android/gms/internal/ads/pP;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/pP;->m()V

    return-void
.end method
