.class public final Lcom/google/android/gms/internal/ads/Op;
.super Lcom/google/android/gms/internal/ads/Bp;
.source "SourceFile"


# instance fields
.field private final C:LF3/b;

.field private final D:Lcom/google/android/gms/internal/ads/Pp;


# direct methods
.method public constructor <init>(LF3/b;Lcom/google/android/gms/internal/ads/Pp;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Bp;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Op;->C:LF3/b;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Op;->D:Lcom/google/android/gms/internal/ads/Pp;

    return-void
.end method


# virtual methods
.method public final F(I)V
    .locals 0

    return-void
.end method

.method public final i()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Op;->C:LF3/b;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Op;->D:Lcom/google/android/gms/internal/ads/Pp;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Lk3/e;->b(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final x(Ls3/W0;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Op;->C:LF3/b;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ls3/W0;->f()Lk3/m;

    move-result-object p1

    invoke-virtual {v0, p1}, Lk3/e;->a(Lk3/m;)V

    :cond_0
    return-void
.end method
