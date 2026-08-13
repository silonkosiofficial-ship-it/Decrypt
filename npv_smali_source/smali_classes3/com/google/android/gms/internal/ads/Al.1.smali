.class public final Lcom/google/android/gms/internal/ads/Al;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/ll;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/nl;

.field private final b:Lcom/google/android/gms/internal/ads/ol;

.field private final c:Lcom/google/android/gms/internal/ads/hl;

.field private final d:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/hl;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ol;Lcom/google/android/gms/internal/ads/nl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Al;->c:Lcom/google/android/gms/internal/ads/hl;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Al;->d:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Al;->b:Lcom/google/android/gms/internal/ads/ol;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/Al;->a:Lcom/google/android/gms/internal/ads/nl;

    return-void
.end method

.method static bridge synthetic a(Lcom/google/android/gms/internal/ads/Al;)Lcom/google/android/gms/internal/ads/nl;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Al;->a:Lcom/google/android/gms/internal/ads/nl;

    return-object p0
.end method

.method static bridge synthetic d(Lcom/google/android/gms/internal/ads/Al;Lcom/google/android/gms/internal/ads/bl;Lcom/google/android/gms/internal/ads/il;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/mr;)V
    .locals 3

    .prologue
    :try_start_0
    invoke-static {}, Lr3/v;->t()Lv3/E0;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/fj;->o:Lcom/google/android/gms/internal/ads/xj;

    new-instance v2, Lcom/google/android/gms/internal/ads/zl;

    invoke-direct {v2, p0, p1, p4}, Lcom/google/android/gms/internal/ads/zl;-><init>(Lcom/google/android/gms/internal/ads/Al;Lcom/google/android/gms/internal/ads/bl;Lcom/google/android/gms/internal/ads/mr;)V

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/xj;->c(Ljava/lang/String;Lcom/google/android/gms/internal/ads/wj;)V

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "id"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "args"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Al;->b:Lcom/google/android/gms/internal/ads/ol;

    invoke-interface {v2, p3}, Lcom/google/android/gms/internal/ads/ol;->c(Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p3

    invoke-virtual {v1, v0, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/Al;->d:Ljava/lang/String;

    invoke-interface {p2, p0, v1}, Lcom/google/android/gms/internal/ads/Kk;->G0(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    :try_start_1
    invoke-virtual {p4, p0}, Lcom/google/android/gms/internal/ads/mr;->d(Ljava/lang/Throwable;)Z

    const-string p2, "Unable to invokeJavascript"

    invoke-static {p2, p0}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/bl;->h()V

    return-void

    :catchall_0
    move-exception p0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/bl;->h()V

    throw p0
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)LP4/d;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/Al;->c(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ljava/lang/Object;)LP4/d;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/mr;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/mr;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Al;->c:Lcom/google/android/gms/internal/ads/hl;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/hl;->b(Lcom/google/android/gms/internal/ads/Z9;)Lcom/google/android/gms/internal/ads/bl;

    move-result-object v1

    const-string v2, "callJs > getEngine: Promise created"

    invoke-static {v2}, Lv3/q0;->k(Ljava/lang/String;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/xl;

    invoke-direct {v2, p0, v1, p1, v0}, Lcom/google/android/gms/internal/ads/xl;-><init>(Lcom/google/android/gms/internal/ads/Al;Lcom/google/android/gms/internal/ads/bl;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/mr;)V

    new-instance p1, Lcom/google/android/gms/internal/ads/yl;

    invoke-direct {p1, p0, v0, v1}, Lcom/google/android/gms/internal/ads/yl;-><init>(Lcom/google/android/gms/internal/ads/Al;Lcom/google/android/gms/internal/ads/mr;Lcom/google/android/gms/internal/ads/bl;)V

    invoke-virtual {v1, v2, p1}, Lcom/google/android/gms/internal/ads/tr;->f(Lcom/google/android/gms/internal/ads/qr;Lcom/google/android/gms/internal/ads/or;)V

    return-object v0
.end method
