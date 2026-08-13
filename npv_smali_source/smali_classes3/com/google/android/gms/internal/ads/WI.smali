.class final Lcom/google/android/gms/internal/ads/WI;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Jk0;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/google/android/gms/internal/ads/ZI;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/ZI;Ljava/lang/String;Z)V
    .locals 0

    const-string p2, "Google"

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/WI;->a:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/WI;->b:Lcom/google/android/gms/internal/ads/ZI;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->m5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "omid native display exp"

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/ads/Uq;->w(Ljava/lang/Throwable;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final bridge synthetic c(Ljava/lang/Object;)V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/WI;->b:Lcom/google/android/gms/internal/ads/ZI;

    check-cast p1, Lcom/google/android/gms/internal/ads/Ot;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ZI;->R(Lcom/google/android/gms/internal/ads/ZI;)Lcom/google/android/gms/internal/ads/eJ;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/eJ;->t(Lcom/google/android/gms/internal/ads/Ot;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/WI;->b:Lcom/google/android/gms/internal/ads/ZI;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/ZI;->R(Lcom/google/android/gms/internal/ads/ZI;)Lcom/google/android/gms/internal/ads/eJ;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->c0()Lcom/google/android/gms/internal/ads/mr;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/WI;->a:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/ads/ZI;->T(Ljava/lang/String;Z)Lcom/google/android/gms/internal/ads/QT;

    move-result-object p1

    if-eqz p1, :cond_1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/mr;->c(Ljava/lang/Object;)Z

    return-void

    :cond_1
    :goto_0
    if-eqz v0, :cond_2

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/mr;->cancel(Z)Z

    :cond_2
    return-void
.end method
