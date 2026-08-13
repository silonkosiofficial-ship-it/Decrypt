.class public final Lcom/google/android/gms/internal/ads/wp0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Fl0;


# instance fields
.field final a:Ljava/lang/String;

.field final b:Ljava/lang/Class;

.field final c:Lcom/google/android/gms/internal/ads/dt0;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/dt0;Lcom/google/android/gms/internal/ads/tw0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/wp0;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/wp0;->b:Ljava/lang/Class;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/wp0;->c:Lcom/google/android/gms/internal/ads/dt0;

    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/dt0;Lcom/google/android/gms/internal/ads/tw0;)Lcom/google/android/gms/internal/ads/Fl0;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/wp0;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/wp0;-><init>(Ljava/lang/String;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/dt0;Lcom/google/android/gms/internal/ads/tw0;)V

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/fv0;)Lcom/google/android/gms/internal/ads/ft0;
    .locals 3

    invoke-static {}, Lcom/google/android/gms/internal/ads/jt0;->b0()Lcom/google/android/gms/internal/ads/ht0;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wp0;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ht0;->A(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/ht0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/ht0;->B(Lcom/google/android/gms/internal/ads/fv0;)Lcom/google/android/gms/internal/ads/ht0;

    sget-object p1, Lcom/google/android/gms/internal/ads/Kt0;->G:Lcom/google/android/gms/internal/ads/Kt0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/ht0;->z(Lcom/google/android/gms/internal/ads/Kt0;)Lcom/google/android/gms/internal/ads/ht0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/jt0;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/yq0;->a(Lcom/google/android/gms/internal/ads/jt0;)Lcom/google/android/gms/internal/ads/yq0;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/ads/Zp0;->c()Lcom/google/android/gms/internal/ads/Zp0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/Zp0;->b(Lcom/google/android/gms/internal/ads/Cq0;)Lcom/google/android/gms/internal/ads/Sl0;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/ads/Pp0;->b()Lcom/google/android/gms/internal/ads/Pp0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/Pp0;->a(Lcom/google/android/gms/internal/ads/Sl0;Ljava/lang/Integer;)Lcom/google/android/gms/internal/ads/El0;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/ads/Zp0;->c()Lcom/google/android/gms/internal/ads/Zp0;

    move-result-object v0

    const-class v1, Lcom/google/android/gms/internal/ads/xq0;

    invoke-static {}, Lcom/google/android/gms/internal/ads/Dl0;->a()Lcom/google/android/gms/internal/ads/Wl0;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/google/android/gms/internal/ads/Zp0;->d(Lcom/google/android/gms/internal/ads/El0;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/Wl0;)Lcom/google/android/gms/internal/ads/Cq0;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/xq0;

    invoke-static {}, Lcom/google/android/gms/internal/ads/ft0;->b0()Lcom/google/android/gms/internal/ads/ct0;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/xq0;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ct0;->A(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/ct0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/xq0;->d()Lcom/google/android/gms/internal/ads/fv0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ct0;->B(Lcom/google/android/gms/internal/ads/fv0;)Lcom/google/android/gms/internal/ads/ct0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/xq0;->b()Lcom/google/android/gms/internal/ads/dt0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/ct0;->z(Lcom/google/android/gms/internal/ads/dt0;)Lcom/google/android/gms/internal/ads/ct0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/ft0;

    return-object p1
.end method

.method public final b()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wp0;->b:Ljava/lang/Class;

    return-object v0
.end method

.method public final c(Lcom/google/android/gms/internal/ads/fv0;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wp0;->c:Lcom/google/android/gms/internal/ads/dt0;

    sget-object v1, Lcom/google/android/gms/internal/ads/Kt0;->G:Lcom/google/android/gms/internal/ads/Kt0;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/wp0;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static {v2, p1, v0, v1, v3}, Lcom/google/android/gms/internal/ads/xq0;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/fv0;Lcom/google/android/gms/internal/ads/dt0;Lcom/google/android/gms/internal/ads/Kt0;Ljava/lang/Integer;)Lcom/google/android/gms/internal/ads/xq0;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/ads/Zp0;->c()Lcom/google/android/gms/internal/ads/Zp0;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/ads/Dl0;->a()Lcom/google/android/gms/internal/ads/Wl0;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/Zp0;->a(Lcom/google/android/gms/internal/ads/Cq0;Lcom/google/android/gms/internal/ads/Wl0;)Lcom/google/android/gms/internal/ads/El0;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wp0;->b:Ljava/lang/Class;

    invoke-static {}, Lcom/google/android/gms/internal/ads/Wp0;->a()Lcom/google/android/gms/internal/ads/Wp0;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/ads/Wp0;->c(Lcom/google/android/gms/internal/ads/El0;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
