.class public final synthetic Lcom/google/android/gms/internal/ads/Mp0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Np0;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/Sl0;Ljava/lang/Integer;)Lcom/google/android/gms/internal/ads/El0;
    .locals 3

    .prologue
    check-cast p1, Lcom/google/android/gms/internal/ads/zp0;

    sget v0, Lcom/google/android/gms/internal/ads/Pp0;->d:I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zp0;->b()Lcom/google/android/gms/internal/ads/yq0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/yq0;->c()Lcom/google/android/gms/internal/ads/jt0;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/ads/mp0;->c()Lcom/google/android/gms/internal/ads/mp0;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/jt0;->h0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/mp0;->b(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Fl0;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/ads/mp0;->c()Lcom/google/android/gms/internal/ads/mp0;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/jt0;->h0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/mp0;->e(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/jt0;->g0()Lcom/google/android/gms/internal/ads/fv0;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/Fl0;->a(Lcom/google/android/gms/internal/ads/fv0;)Lcom/google/android/gms/internal/ads/ft0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ft0;->g0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ft0;->f0()Lcom/google/android/gms/internal/ads/fv0;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ft0;->c0()Lcom/google/android/gms/internal/ads/dt0;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/jt0;->f0()Lcom/google/android/gms/internal/ads/Kt0;

    move-result-object p1

    invoke-static {v1, v2, v0, p1, p2}, Lcom/google/android/gms/internal/ads/xq0;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/fv0;Lcom/google/android/gms/internal/ads/dt0;Lcom/google/android/gms/internal/ads/Kt0;Ljava/lang/Integer;)Lcom/google/android/gms/internal/ads/xq0;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/yp0;

    invoke-static {}, Lcom/google/android/gms/internal/ads/Dl0;->a()Lcom/google/android/gms/internal/ads/Wl0;

    move-result-object v0

    invoke-direct {p2, p1, v0}, Lcom/google/android/gms/internal/ads/yp0;-><init>(Lcom/google/android/gms/internal/ads/xq0;Lcom/google/android/gms/internal/ads/Wl0;)V

    return-object p2

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Creating new keys is not allowed."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
