.class public final Lcom/google/android/gms/internal/ads/n10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/L20;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Yk0;

.field private final b:Lcom/google/android/gms/internal/ads/n70;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Yk0;Lcom/google/android/gms/internal/ads/n70;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/n10;->a:Lcom/google/android/gms/internal/ads/Yk0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/n10;->b:Lcom/google/android/gms/internal/ads/n70;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/16 v0, 0x15

    return v0
.end method

.method public final b()LP4/d;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/m10;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/m10;-><init>(Lcom/google/android/gms/internal/ads/n10;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/n10;->a:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/Yk0;->H0(Ljava/util/concurrent/Callable;)LP4/d;

    move-result-object v0

    return-object v0
.end method

.method final synthetic c()Lcom/google/android/gms/internal/ads/p10;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/p10;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/n10;->b:Lcom/google/android/gms/internal/ads/n70;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/n70;->d:Ls3/X1;

    const-string v2, "requester_type_2"

    invoke-static {v1}, LB3/c;->c(Ls3/X1;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/p10;-><init>(Z)V

    return-object v0
.end method
