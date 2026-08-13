.class final Lcom/google/android/gms/internal/ads/gQ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Jk0;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/google/android/gms/internal/ads/iQ;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/iQ;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/gQ;->a:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/gQ;->b:Lcom/google/android/gms/internal/ads/iQ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public final bridge synthetic c(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ads/yP;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/yP;->c()V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/gQ;->b:Lcom/google/android/gms/internal/ads/iQ;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/iQ;->o6(Lcom/google/android/gms/internal/ads/iQ;)Lcom/google/android/gms/internal/ads/WP;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gQ;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/WP;->f(Ljava/lang/String;)V

    return-void
.end method
