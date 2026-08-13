.class public final Lcom/google/android/gms/internal/ads/q80;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/q80;->a:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/g80;Landroid/content/Context;Lcom/google/android/gms/internal/ads/X70;Lcom/google/android/gms/internal/ads/w80;)Lcom/google/android/gms/internal/ads/p80;
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/q80;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/p80;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/c80;

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/j80;->e(Lcom/google/android/gms/internal/ads/g80;Landroid/content/Context;)Lcom/google/android/gms/internal/ads/j80;

    move-result-object p2

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/ads/c80;-><init>(Lcom/google/android/gms/internal/ads/j80;)V

    new-instance p2, Lcom/google/android/gms/internal/ads/y80;

    invoke-direct {p2, v0, p3, p4}, Lcom/google/android/gms/internal/ads/y80;-><init>(Lcom/google/android/gms/internal/ads/b80;Lcom/google/android/gms/internal/ads/X70;Lcom/google/android/gms/internal/ads/w80;)V

    new-instance p3, Lcom/google/android/gms/internal/ads/p80;

    invoke-direct {p3, v0, p2}, Lcom/google/android/gms/internal/ads/p80;-><init>(Lcom/google/android/gms/internal/ads/b80;Lcom/google/android/gms/internal/ads/y80;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/q80;->a:Ljava/util/HashMap;

    invoke-virtual {p2, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p3

    :cond_0
    return-object v0
.end method
