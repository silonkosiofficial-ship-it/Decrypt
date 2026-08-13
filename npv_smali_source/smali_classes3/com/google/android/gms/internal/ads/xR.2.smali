.class public final Lcom/google/android/gms/internal/ads/xR;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zR;


# instance fields
.field private final a:Ljava/util/Map;

.field private final b:Lcom/google/android/gms/internal/ads/Yk0;

.field private final c:Lcom/google/android/gms/internal/ads/cE;


# direct methods
.method public constructor <init>(Ljava/util/Map;Lcom/google/android/gms/internal/ads/Yk0;Lcom/google/android/gms/internal/ads/cE;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/xR;->a:Ljava/util/Map;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/xR;->b:Lcom/google/android/gms/internal/ads/Yk0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/xR;->c:Lcom/google/android/gms/internal/ads/cE;

    return-void
.end method

.method static bridge synthetic b(Lcom/google/android/gms/internal/ads/xR;)Lcom/google/android/gms/internal/ads/cE;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/xR;->c:Lcom/google/android/gms/internal/ads/cE;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/Po;)LP4/d;
    .locals 7

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/xR;->c:Lcom/google/android/gms/internal/ads/cE;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/cE;->B(Lcom/google/android/gms/internal/ads/Po;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/oQ;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/oQ;-><init>(I)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->g(Ljava/lang/Throwable;)LP4/d;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->d8:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/xR;->a:Ljava/util/Map;

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/ads/rz0;

    if-eqz v4, :cond_0

    new-instance v5, Lcom/google/android/gms/internal/ads/vR;

    invoke-direct {v5, v4, p1}, Lcom/google/android/gms/internal/ads/vR;-><init>(Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/Po;)V

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/xR;->b:Lcom/google/android/gms/internal/ads/Yk0;

    const-class v6, Lcom/google/android/gms/internal/ads/oQ;

    invoke-static {v0, v6, v5, v4}, Lcom/google/android/gms/internal/ads/Nk0;->f(LP4/d;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object v0

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/ads/wR;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/ads/wR;-><init>(Lcom/google/android/gms/internal/ads/xR;)V

    sget-object v1, Lcom/google/android/gms/internal/ads/dr;->g:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {v0, p1, v1}, Lcom/google/android/gms/internal/ads/Nk0;->r(LP4/d;Lcom/google/android/gms/internal/ads/Jk0;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method
