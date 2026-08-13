.class final Lcom/google/android/gms/internal/ads/NL;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/gj;


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;

.field private final b:Ljava/lang/String;

.field private final c:Lcom/google/android/gms/internal/ads/gj;

.field final synthetic d:Lcom/google/android/gms/internal/ads/PL;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/PL;Ljava/lang/ref/WeakReference;Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;Lcom/google/android/gms/internal/ads/OL;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/NL;->d:Lcom/google/android/gms/internal/ads/PL;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/NL;->a:Ljava/lang/ref/WeakReference;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/NL;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/NL;->c:Lcom/google/android/gms/internal/ads/gj;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 1

    .prologue
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/NL;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/NL;->d:Lcom/google/android/gms/internal/ads/PL;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/NL;->b:Ljava/lang/String;

    invoke-virtual {p1, p2, p0}, Lcom/google/android/gms/internal/ads/PL;->n(Ljava/lang/String;Lcom/google/android/gms/internal/ads/gj;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/NL;->c:Lcom/google/android/gms/internal/ads/gj;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/gj;->a(Ljava/lang/Object;Ljava/util/Map;)V

    return-void
.end method
