.class public final Lcom/google/android/gms/internal/ads/P1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/w0;


# instance fields
.field private final C:J

.field private final D:Lcom/google/android/gms/internal/ads/w0;


# direct methods
.method public constructor <init>(JLcom/google/android/gms/internal/ads/w0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/P1;->C:J

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/P1;->D:Lcom/google/android/gms/internal/ads/w0;

    return-void
.end method

.method static bridge synthetic a(Lcom/google/android/gms/internal/ads/P1;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/P1;->C:J

    return-wide v0
.end method


# virtual methods
.method public final Q()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/P1;->D:Lcom/google/android/gms/internal/ads/w0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/w0;->Q()V

    return-void
.end method

.method public final R(Lcom/google/android/gms/internal/ads/T0;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/O1;

    invoke-direct {v0, p0, p1, p1}, Lcom/google/android/gms/internal/ads/O1;-><init>(Lcom/google/android/gms/internal/ads/P1;Lcom/google/android/gms/internal/ads/T0;Lcom/google/android/gms/internal/ads/T0;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/P1;->D:Lcom/google/android/gms/internal/ads/w0;

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/w0;->R(Lcom/google/android/gms/internal/ads/T0;)V

    return-void
.end method

.method public final S(II)Lcom/google/android/gms/internal/ads/a1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/P1;->D:Lcom/google/android/gms/internal/ads/w0;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/w0;->S(II)Lcom/google/android/gms/internal/ads/a1;

    move-result-object p1

    return-object p1
.end method
