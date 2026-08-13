.class public abstract Lcom/google/android/gms/internal/ads/MS;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lv3/s0;

.field protected final b:Lcom/google/android/gms/internal/ads/zS;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zS;Lv3/s0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/MS;->b:Lcom/google/android/gms/internal/ads/zS;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/MS;->a:Lv3/s0;

    return-void
.end method


# virtual methods
.method protected final a()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/MS;->a:Lv3/s0;

    invoke-interface {v0}, Lv3/s0;->M()Z

    move-result v0

    return v0
.end method
