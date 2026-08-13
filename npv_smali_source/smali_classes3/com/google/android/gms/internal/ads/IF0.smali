.class final Lcom/google/android/gms/internal/ads/IF0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/OE0;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/KF0;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/KF0;Lcom/google/android/gms/internal/ads/JF0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/IF0;->a:Lcom/google/android/gms/internal/ads/KF0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "MediaCodecAudioRenderer"

    const-string v1, "Audio sink error"

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/ads/eM;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/IF0;->a:Lcom/google/android/gms/internal/ads/KF0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/KF0;->e1(Lcom/google/android/gms/internal/ads/KF0;)Lcom/google/android/gms/internal/ads/JE0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/JE0;->b(Ljava/lang/Exception;)V

    return-void
.end method
