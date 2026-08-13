.class final Lcom/google/android/gms/internal/ads/fQ;
.super Lk3/d;
.source "SourceFile"


# instance fields
.field final synthetic C:Ljava/lang/String;

.field final synthetic D:Lcom/google/android/gms/internal/ads/iQ;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/iQ;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/fQ;->C:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/fQ;->D:Lcom/google/android/gms/internal/ads/iQ;

    invoke-direct {p0}, Lk3/d;-><init>()V

    return-void
.end method


# virtual methods
.method public final g(Lk3/m;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fQ;->D:Lcom/google/android/gms/internal/ads/iQ;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/iQ;->p6(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/fQ;->C:Ljava/lang/String;

    invoke-static {v0, p1, v1}, Lcom/google/android/gms/internal/ads/iQ;->q6(Lcom/google/android/gms/internal/ads/iQ;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
