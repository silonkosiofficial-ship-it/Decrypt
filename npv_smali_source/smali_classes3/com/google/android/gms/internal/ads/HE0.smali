.class public final synthetic Lcom/google/android/gms/internal/ads/HE0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/JE0;

.field public final synthetic D:Ljava/lang/String;

.field public final synthetic E:J

.field public final synthetic F:J


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/JE0;Ljava/lang/String;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/HE0;->C:Lcom/google/android/gms/internal/ads/JE0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/HE0;->D:Ljava/lang/String;

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/HE0;->E:J

    iput-wide p5, p0, Lcom/google/android/gms/internal/ads/HE0;->F:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/HE0;->C:Lcom/google/android/gms/internal/ads/JE0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/HE0;->D:Ljava/lang/String;

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/HE0;->E:J

    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/HE0;->F:J

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/JE0;->n(Ljava/lang/String;JJ)V

    return-void
.end method
