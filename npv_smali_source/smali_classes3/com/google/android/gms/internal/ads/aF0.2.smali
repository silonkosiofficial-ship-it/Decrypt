.class public final synthetic Lcom/google/android/gms/internal/ads/aF0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Landroid/media/AudioTrack;

.field public final synthetic D:Lcom/google/android/gms/internal/ads/OE0;

.field public final synthetic E:Landroid/os/Handler;

.field public final synthetic F:Lcom/google/android/gms/internal/ads/LE0;


# direct methods
.method public synthetic constructor <init>(Landroid/media/AudioTrack;Lcom/google/android/gms/internal/ads/OE0;Landroid/os/Handler;Lcom/google/android/gms/internal/ads/LE0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/aF0;->C:Landroid/media/AudioTrack;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/aF0;->D:Lcom/google/android/gms/internal/ads/OE0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/aF0;->E:Landroid/os/Handler;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/aF0;->F:Lcom/google/android/gms/internal/ads/LE0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aF0;->C:Landroid/media/AudioTrack;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aF0;->D:Lcom/google/android/gms/internal/ads/OE0;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/aF0;->E:Landroid/os/Handler;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/aF0;->F:Lcom/google/android/gms/internal/ads/LE0;

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/EF0;->F(Landroid/media/AudioTrack;Lcom/google/android/gms/internal/ads/OE0;Landroid/os/Handler;Lcom/google/android/gms/internal/ads/LE0;)V

    return-void
.end method
