.class final Lcom/google/android/gms/internal/ads/y70;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Jk0;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/z70;

.field final synthetic b:I


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/z70;I)V
    .locals 0

    iput p2, p0, Lcom/google/android/gms/internal/ads/y70;->b:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/y70;->a:Lcom/google/android/gms/internal/ads/z70;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    const-string v0, "BufferingUrlPinger.attributionReportingManager"

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/ads/Uq;->x(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method public final bridge synthetic c(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Ljava/lang/String;

    iget v0, p0, Lcom/google/android/gms/internal/ads/y70;->b:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/y70;->a:Lcom/google/android/gms/internal/ads/z70;

    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/ads/z70;->b(Ljava/lang/String;I)V

    return-void
.end method
