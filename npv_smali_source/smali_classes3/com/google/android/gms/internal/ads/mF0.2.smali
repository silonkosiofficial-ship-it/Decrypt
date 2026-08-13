.class public final synthetic Lcom/google/android/gms/internal/ads/mF0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/AudioRouting$OnRoutingChangedListener;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/rF0;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/rF0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/mF0;->a:Lcom/google/android/gms/internal/ads/rF0;

    return-void
.end method


# virtual methods
.method public final onRoutingChanged(Landroid/media/AudioRouting;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/mF0;->a:Lcom/google/android/gms/internal/ads/rF0;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/rF0;->a(Lcom/google/android/gms/internal/ads/rF0;Landroid/media/AudioRouting;)V

    return-void
.end method
