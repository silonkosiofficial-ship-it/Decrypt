.class final Lcom/google/android/gms/internal/ads/dV;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/ZH;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/R60;

.field private final b:Lcom/google/android/gms/internal/ads/Tm;

.field private final c:Lk3/c;

.field private d:Lcom/google/android/gms/internal/ads/XC;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/Tm;Lk3/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/dV;->d:Lcom/google/android/gms/internal/ads/XC;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/dV;->a:Lcom/google/android/gms/internal/ads/R60;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/dV;->b:Lcom/google/android/gms/internal/ads/Tm;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/dV;->c:Lk3/c;

    return-void
.end method


# virtual methods
.method public final a(ZLandroid/content/Context;Lcom/google/android/gms/internal/ads/SC;)V
    .locals 1

    .prologue
    :try_start_0
    sget-object p1, Lk3/c;->D:Lk3/c;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/dV;->c:Lk3/c;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const/4 p3, 0x1

    const/4 v0, 0x2

    if-eq p1, p3, :cond_1

    if-eq p1, v0, :cond_0

    const/4 p3, 0x5

    if-ne p1, p3, :cond_4

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/dV;->b:Lcom/google/android/gms/internal/ads/Tm;

    invoke-static {p2}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/Tm;->g0(LX3/a;)Z

    move-result p1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/dV;->b:Lcom/google/android/gms/internal/ads/Tm;

    invoke-static {p2}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/Tm;->g4(LX3/a;)Z

    move-result p1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/dV;->b:Lcom/google/android/gms/internal/ads/Tm;

    invoke-static {p2}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/Tm;->C0(LX3/a;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/dV;->d:Lcom/google/android/gms/internal/ads/XC;

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    sget-object p2, Lcom/google/android/gms/internal/ads/Af;->E1:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_3

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/dV;->a:Lcom/google/android/gms/internal/ads/R60;

    iget p2, p2, Lcom/google/android/gms/internal/ads/R60;->Y:I

    if-ne p2, v0, :cond_3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/XC;->a()V

    :cond_3
    :goto_1
    return-void

    :cond_4
    new-instance p1, Lcom/google/android/gms/internal/ads/YH;

    const-string p2, "Adapter failed to show."

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/YH;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_2
    new-instance p2, Lcom/google/android/gms/internal/ads/YH;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/ads/YH;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final b(Lcom/google/android/gms/internal/ads/XC;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/dV;->d:Lcom/google/android/gms/internal/ads/XC;

    return-void
.end method
