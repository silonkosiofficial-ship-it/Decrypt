.class final Lcom/google/android/gms/internal/ads/dQ;
.super LE3/d;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/google/android/gms/internal/ads/iQ;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/iQ;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/dQ;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/dQ;->b:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/dQ;->c:Lcom/google/android/gms/internal/ads/iQ;

    invoke-direct {p0}, LE3/d;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lk3/m;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dQ;->c:Lcom/google/android/gms/internal/ads/iQ;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/iQ;->p6(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/dQ;->b:Ljava/lang/String;

    invoke-static {v0, p1, v1}, Lcom/google/android/gms/internal/ads/iQ;->q6(Lcom/google/android/gms/internal/ads/iQ;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final bridge synthetic b(Ljava/lang/Object;)V
    .locals 3

    check-cast p1, LE3/c;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dQ;->b:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/dQ;->c:Lcom/google/android/gms/internal/ads/iQ;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/dQ;->a:Ljava/lang/String;

    invoke-virtual {v1, v2, p1, v0}, Lcom/google/android/gms/internal/ads/iQ;->s6(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
