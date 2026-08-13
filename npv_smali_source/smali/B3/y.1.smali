.class final LB3/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Jk0;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/cH;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/cH;)V
    .locals 0

    iput-object p1, p0, LB3/y;->a:Lcom/google/android/gms/internal/ads/cH;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, LB3/y;->a:Lcom/google/android/gms/internal/ads/cH;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/cH;->r1(Ljava/lang/String;)V

    return-void
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LB3/y;->a:Lcom/google/android/gms/internal/ads/cH;

    check-cast p1, LB3/N;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/cH;->q1(LB3/N;)V

    return-void
.end method
