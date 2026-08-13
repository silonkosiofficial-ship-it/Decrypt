.class public abstract Lcom/google/android/gms/internal/ads/P90;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(LP4/d;Lcom/google/android/gms/internal/ads/Q90;Lcom/google/android/gms/internal/ads/E90;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lcom/google/android/gms/internal/ads/P90;->g(LP4/d;Lcom/google/android/gms/internal/ads/Q90;Lcom/google/android/gms/internal/ads/E90;Z)V

    return-void
.end method

.method public static b(LP4/d;Lcom/google/android/gms/internal/ads/Q90;Lcom/google/android/gms/internal/ads/E90;)V
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, p1, p2, v0}, Lcom/google/android/gms/internal/ads/P90;->g(LP4/d;Lcom/google/android/gms/internal/ads/Q90;Lcom/google/android/gms/internal/ads/E90;Z)V

    return-void
.end method

.method public static c(LP4/d;Lcom/google/android/gms/internal/ads/Q90;Lcom/google/android/gms/internal/ads/E90;)V
    .locals 1

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/vg;->c:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/Dk0;->D(LP4/d;)Lcom/google/android/gms/internal/ads/Dk0;

    move-result-object p0

    new-instance v0, Lcom/google/android/gms/internal/ads/O90;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/ads/O90;-><init>(Lcom/google/android/gms/internal/ads/Q90;Lcom/google/android/gms/internal/ads/E90;)V

    sget-object p1, Lcom/google/android/gms/internal/ads/dr;->g:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {p0, v0, p1}, Lcom/google/android/gms/internal/ads/Nk0;->r(LP4/d;Lcom/google/android/gms/internal/ads/Jk0;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public static d(LP4/d;Lcom/google/android/gms/internal/ads/E90;)V
    .locals 1

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/vg;->c:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/Dk0;->D(LP4/d;)Lcom/google/android/gms/internal/ads/Dk0;

    move-result-object p0

    new-instance v0, Lcom/google/android/gms/internal/ads/M90;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/M90;-><init>(Lcom/google/android/gms/internal/ads/E90;)V

    sget-object p1, Lcom/google/android/gms/internal/ads/dr;->g:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {p0, v0, p1}, Lcom/google/android/gms/internal/ads/Nk0;->r(LP4/d;Lcom/google/android/gms/internal/ads/Jk0;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public static e(Ljava/lang/String;)Z
    .locals 2

    .prologue
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->I8:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, p0}, Ljava/util/regex/Pattern;->matches(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    move-result p0

    return p0
.end method

.method public static f(Lcom/google/android/gms/internal/ads/n70;)I
    .locals 1

    .prologue
    invoke-static {p0}, LB3/c;->f(Lcom/google/android/gms/internal/ads/n70;)I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    if-eqz p0, :cond_0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    const/16 p0, 0x17

    return p0

    :cond_0
    const/4 p0, 0x7

    return p0
.end method

.method private static g(LP4/d;Lcom/google/android/gms/internal/ads/Q90;Lcom/google/android/gms/internal/ads/E90;Z)V
    .locals 1

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/vg;->c:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/Dk0;->D(LP4/d;)Lcom/google/android/gms/internal/ads/Dk0;

    move-result-object p0

    new-instance v0, Lcom/google/android/gms/internal/ads/N90;

    invoke-direct {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/N90;-><init>(Lcom/google/android/gms/internal/ads/Q90;Lcom/google/android/gms/internal/ads/E90;Z)V

    sget-object p1, Lcom/google/android/gms/internal/ads/dr;->g:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {p0, v0, p1}, Lcom/google/android/gms/internal/ads/Nk0;->r(LP4/d;Lcom/google/android/gms/internal/ads/Jk0;Ljava/util/concurrent/Executor;)V

    return-void
.end method
