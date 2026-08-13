.class final Lcom/google/android/gms/internal/ads/Yj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ3/c$b;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/mr;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Zj;Lcom/google/android/gms/internal/ads/mr;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Yj;->a:Lcom/google/android/gms/internal/ads/mr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final q0(LN3/b;)V
    .locals 1

    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Connection failed."

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Yj;->a:Lcom/google/android/gms/internal/ads/mr;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/mr;->d(Ljava/lang/Throwable;)Z

    return-void
.end method
