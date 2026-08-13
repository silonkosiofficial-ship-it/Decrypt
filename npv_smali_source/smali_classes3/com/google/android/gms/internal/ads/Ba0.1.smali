.class public final Lcom/google/android/gms/internal/ads/Ba0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/iT;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/iT;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Ba0;->a:Lcom/google/android/gms/internal/ads/iT;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 7

    new-instance v6, Lcom/google/android/gms/internal/ads/kT;

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object v0

    invoke-interface {v0}, LV3/f;->a()J

    move-result-wide v1

    move-object v0, v6

    move-object v3, p2

    move-object v4, p1

    move v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/kT;-><init>(JLjava/lang/String;Ljava/lang/String;I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Ba0;->a:Lcom/google/android/gms/internal/ads/iT;

    invoke-virtual {p1, v6}, Lcom/google/android/gms/internal/ads/iT;->i(Lcom/google/android/gms/internal/ads/kT;)V

    return-void
.end method
