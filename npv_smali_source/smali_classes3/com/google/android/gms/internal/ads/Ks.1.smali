.class public final Lcom/google/android/gms/internal/ads/Ks;
.super Lv3/B;
.source "SourceFile"


# instance fields
.field final c:Lcom/google/android/gms/internal/ads/fs;

.field final d:Lcom/google/android/gms/internal/ads/Ts;

.field private final e:Ljava/lang/String;

.field private final f:[Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/fs;Lcom/google/android/gms/internal/ads/Ts;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lv3/B;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Ks;->c:Lcom/google/android/gms/internal/ads/fs;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Ks;->d:Lcom/google/android/gms/internal/ads/Ts;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Ks;->e:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/Ks;->f:[Ljava/lang/String;

    invoke-static {}, Lr3/v;->C()Lcom/google/android/gms/internal/ads/Ls;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/ads/Ls;->e(Lcom/google/android/gms/internal/ads/Ks;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ks;->d:Lcom/google/android/gms/internal/ads/Ts;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Ks;->e:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Ks;->f:[Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Ts;->r(Ljava/lang/String;[Ljava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Lv3/E0;->l:Lcom/google/android/gms/internal/ads/Fe0;

    new-instance v1, Lcom/google/android/gms/internal/ads/Js;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/Js;-><init>(Lcom/google/android/gms/internal/ads/Ks;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :catchall_0
    move-exception v0

    sget-object v1, Lv3/E0;->l:Lcom/google/android/gms/internal/ads/Fe0;

    new-instance v2, Lcom/google/android/gms/internal/ads/Js;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ads/Js;-><init>(Lcom/google/android/gms/internal/ads/Ks;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    throw v0
.end method

.method public final b()LP4/d;
    .locals 2

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->e2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ks;->d:Lcom/google/android/gms/internal/ads/Ts;

    instance-of v0, v0, Lcom/google/android/gms/internal/ads/ct;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/dr;->f:Lcom/google/android/gms/internal/ads/Yk0;

    new-instance v1, Lcom/google/android/gms/internal/ads/Is;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/Is;-><init>(Lcom/google/android/gms/internal/ads/Ks;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/Yk0;->H0(Ljava/util/concurrent/Callable;)LP4/d;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-super {p0}, Lv3/B;->b()LP4/d;

    move-result-object v0

    return-object v0
.end method

.method final synthetic d()Ljava/lang/Boolean;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ks;->d:Lcom/google/android/gms/internal/ads/Ts;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Ks;->e:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Ks;->f:[Ljava/lang/String;

    invoke-virtual {v0, v1, v2, p0}, Lcom/google/android/gms/internal/ads/Ts;->s(Ljava/lang/String;[Ljava/lang/String;Lcom/google/android/gms/internal/ads/Ks;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ks;->e:Ljava/lang/String;

    return-object v0
.end method
