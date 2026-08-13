.class public final synthetic Lcom/google/android/gms/internal/ads/M20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/O20;

.field public final synthetic D:J

.field public final synthetic E:Lcom/google/android/gms/internal/ads/L20;

.field public final synthetic F:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/O20;JLcom/google/android/gms/internal/ads/L20;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/M20;->C:Lcom/google/android/gms/internal/ads/O20;

    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/M20;->D:J

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/M20;->E:Lcom/google/android/gms/internal/ads/L20;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/M20;->F:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/M20;->C:Lcom/google/android/gms/internal/ads/O20;

    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/M20;->D:J

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/M20;->E:Lcom/google/android/gms/internal/ads/L20;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/M20;->F:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/O20;->b(JLcom/google/android/gms/internal/ads/L20;Landroid/os/Bundle;)V

    return-void
.end method
