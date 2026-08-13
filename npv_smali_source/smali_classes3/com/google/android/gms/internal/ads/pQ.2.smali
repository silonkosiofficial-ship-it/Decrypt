.class public final synthetic Lcom/google/android/gms/internal/ads/pQ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/rQ;

.field public final synthetic D:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/rQ;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/pQ;->C:Lcom/google/android/gms/internal/ads/rQ;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/pQ;->D:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pQ;->C:Lcom/google/android/gms/internal/ads/rQ;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/pQ;->D:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/rQ;->b(Landroid/content/Context;)V

    return-void
.end method
