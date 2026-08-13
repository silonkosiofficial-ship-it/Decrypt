.class public final synthetic Lcom/google/android/gms/internal/ads/za0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/Aa0;

.field public final synthetic b:I

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Aa0;IJLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/za0;->a:Lcom/google/android/gms/internal/ads/Aa0;

    iput p2, p0, Lcom/google/android/gms/internal/ads/za0;->b:I

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/za0;->c:J

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/za0;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)LP4/d;
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/za0;->a:Lcom/google/android/gms/internal/ads/Aa0;

    iget v1, p0, Lcom/google/android/gms/internal/ads/za0;->b:I

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/za0;->c:J

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/za0;->d:Ljava/lang/String;

    move-object v5, p1

    check-cast v5, Lw3/u;

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/Aa0;->c(IJLjava/lang/String;Lw3/u;)LP4/d;

    move-result-object p1

    return-object p1
.end method
