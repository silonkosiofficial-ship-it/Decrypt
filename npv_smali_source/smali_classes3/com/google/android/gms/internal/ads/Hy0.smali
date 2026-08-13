.class public abstract Lcom/google/android/gms/internal/ads/Hy0;
.super Lcom/google/android/gms/internal/ads/Ly0;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/P7;


# instance fields
.field protected final J:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Ly0;-><init>()V

    const-string p1, "moov"

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Hy0;->J:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Hy0;->J:Ljava/lang/String;

    return-object v0
.end method

.method public final f(Lcom/google/android/gms/internal/ads/My0;Ljava/nio/ByteBuffer;JLcom/google/android/gms/internal/ads/M7;)V
    .locals 2

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/My0;->b()J

    invoke-virtual {p2}, Ljava/nio/Buffer;->remaining()I

    invoke-virtual {p2}, Ljava/nio/Buffer;->remaining()I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Ly0;->D:Lcom/google/android/gms/internal/ads/My0;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/My0;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/Ly0;->F:J

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/My0;->b()J

    move-result-wide v0

    add-long/2addr v0, p3

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/My0;->h(J)V

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/My0;->b()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/Ly0;->G:J

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/Ly0;->C:Lcom/google/android/gms/internal/ads/M7;

    return-void
.end method
