.class public final Lcom/google/android/gms/internal/ads/Pr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Rl0;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/Rl0;Lcom/google/android/gms/internal/ads/Kt0;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/ads/yp0;)Lcom/google/android/gms/internal/ads/Rl0;
    .locals 4

    .prologue
    invoke-static {}, Lcom/google/android/gms/internal/ads/Dl0;->a()Lcom/google/android/gms/internal/ads/Wl0;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/yp0;->a(Lcom/google/android/gms/internal/ads/Wl0;)Lcom/google/android/gms/internal/ads/xq0;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/ads/ft0;->b0()Lcom/google/android/gms/internal/ads/ct0;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/xq0;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/ct0;->A(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/ct0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/xq0;->d()Lcom/google/android/gms/internal/ads/fv0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/ct0;->B(Lcom/google/android/gms/internal/ads/fv0;)Lcom/google/android/gms/internal/ads/ct0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/xq0;->b()Lcom/google/android/gms/internal/ads/dt0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/ct0;->z(Lcom/google/android/gms/internal/ads/dt0;)Lcom/google/android/gms/internal/ads/ct0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/ft0;

    const-class v2, Lcom/google/android/gms/internal/ads/Rl0;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/Vl0;->b(Lcom/google/android/gms/internal/ads/ft0;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/Rl0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/xq0;->c()Lcom/google/android/gms/internal/ads/Kt0;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_3

    const/4 v3, 0x2

    if-eq v2, v3, :cond_2

    const/4 v3, 0x3

    if-eq v2, v3, :cond_1

    const/4 v3, 0x4

    if-ne v2, v3, :cond_0

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "unknown output prefix type"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    sget-object p0, Lcom/google/android/gms/internal/ads/aq0;->a:Lcom/google/android/gms/internal/ads/Lu0;

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Lu0;->c()[B

    move-result-object p0

    goto :goto_2

    :cond_2
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/yp0;->b()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/aq0;->a(I)Lcom/google/android/gms/internal/ads/Lu0;

    move-result-object p0

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/yp0;->b()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/aq0;->b(I)Lcom/google/android/gms/internal/ads/Lu0;

    move-result-object p0

    goto :goto_0

    :goto_2
    new-instance v2, Lcom/google/android/gms/internal/ads/Pr0;

    invoke-direct {v2, v1, v0, p0}, Lcom/google/android/gms/internal/ads/Pr0;-><init>(Lcom/google/android/gms/internal/ads/Rl0;Lcom/google/android/gms/internal/ads/Kt0;[B)V

    return-object v2
.end method
