.class final Lcom/google/android/gms/internal/ads/i50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/w80;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/F50;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/F50;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/i50;->a:Lcom/google/android/gms/internal/ads/F50;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/x80;)LP4/d;
    .locals 3

    check-cast p1, Lcom/google/android/gms/internal/ads/j50;

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/j50;->b:Lcom/google/android/gms/internal/ads/G50;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/j50;->a:Lcom/google/android/gms/internal/ads/E50;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/i50;->a:Lcom/google/android/gms/internal/ads/F50;

    const/4 v2, 0x0

    check-cast v1, Lcom/google/android/gms/internal/ads/f50;

    invoke-virtual {v1, v0, p1, v2}, Lcom/google/android/gms/internal/ads/f50;->c(Lcom/google/android/gms/internal/ads/G50;Lcom/google/android/gms/internal/ads/E50;Lcom/google/android/gms/internal/ads/jC;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/google/android/gms/internal/ads/l80;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/i50;->a:Lcom/google/android/gms/internal/ads/F50;

    check-cast v0, Lcom/google/android/gms/internal/ads/f50;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/f50;->b()Lcom/google/android/gms/internal/ads/jC;

    move-result-object v0

    iput-object v0, p1, Lcom/google/android/gms/internal/ads/l80;->a:Lcom/google/android/gms/internal/ads/jC;

    return-void
.end method
