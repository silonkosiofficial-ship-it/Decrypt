.class public final synthetic Lcom/google/android/gms/internal/ads/GA;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/LA;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/j80;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/LA;Lcom/google/android/gms/internal/ads/j80;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/GA;->a:Lcom/google/android/gms/internal/ads/LA;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/GA;->b:Lcom/google/android/gms/internal/ads/j80;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)LP4/d;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/GA;->a:Lcom/google/android/gms/internal/ads/LA;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/GA;->b:Lcom/google/android/gms/internal/ads/j80;

    check-cast p1, Lcom/google/android/gms/internal/ads/Po;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/LA;->f(Lcom/google/android/gms/internal/ads/j80;Lcom/google/android/gms/internal/ads/Po;)LP4/d;

    move-result-object p1

    return-object p1
.end method
