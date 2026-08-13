.class public final synthetic Lcom/google/android/gms/internal/ads/bP;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/pP;

.field public final synthetic D:Ljava/lang/Object;

.field public final synthetic E:Lcom/google/android/gms/internal/ads/mr;

.field public final synthetic F:Ljava/lang/String;

.field public final synthetic G:J

.field public final synthetic H:Lcom/google/android/gms/internal/ads/E90;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/pP;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/mr;Ljava/lang/String;JLcom/google/android/gms/internal/ads/E90;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bP;->C:Lcom/google/android/gms/internal/ads/pP;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/bP;->D:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/bP;->E:Lcom/google/android/gms/internal/ads/mr;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/bP;->F:Ljava/lang/String;

    iput-wide p5, p0, Lcom/google/android/gms/internal/ads/bP;->G:J

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/bP;->H:Lcom/google/android/gms/internal/ads/E90;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bP;->C:Lcom/google/android/gms/internal/ads/pP;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bP;->D:Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/bP;->E:Lcom/google/android/gms/internal/ads/mr;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/bP;->F:Ljava/lang/String;

    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/bP;->G:J

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/bP;->H:Lcom/google/android/gms/internal/ads/E90;

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/pP;->q(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/mr;Ljava/lang/String;JLcom/google/android/gms/internal/ads/E90;)V

    return-void
.end method
