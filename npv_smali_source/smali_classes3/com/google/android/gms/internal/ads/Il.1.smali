.class public final Lcom/google/android/gms/internal/ads/Il;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:LP4/d;


# direct methods
.method constructor <init>(LP4/d;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ol;Lcom/google/android/gms/internal/ads/nl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Il;->b:LP4/d;

    const-string p1, "google.afma.activeView.handleUpdate"

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Il;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method final synthetic a(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/il;)LP4/d;
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/ads/mr;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/mr;-><init>()V

    invoke-static {}, Lr3/v;->t()Lv3/E0;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/ads/fj;->o:Lcom/google/android/gms/internal/ads/xj;

    new-instance v3, Lcom/google/android/gms/internal/ads/Hl;

    invoke-direct {v3, p0, v0}, Lcom/google/android/gms/internal/ads/Hl;-><init>(Lcom/google/android/gms/internal/ads/Il;Lcom/google/android/gms/internal/ads/mr;)V

    invoke-virtual {v2, v1, v3}, Lcom/google/android/gms/internal/ads/xj;->c(Ljava/lang/String;Lcom/google/android/gms/internal/ads/wj;)V

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    const-string v3, "id"

    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "args"

    check-cast p1, Lorg/json/JSONObject;

    invoke-virtual {v2, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Il;->a:Ljava/lang/String;

    invoke-interface {p2, p1, v2}, Lcom/google/android/gms/internal/ads/Kk;->G0(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-object v0
.end method

.method public final b(Ljava/lang/Object;)LP4/d;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/Il;->c(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ljava/lang/Object;)LP4/d;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/Gl;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/Gl;-><init>(Lcom/google/android/gms/internal/ads/Il;Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Il;->b:LP4/d;

    sget-object v1, Lcom/google/android/gms/internal/ads/dr;->g:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    return-object p1
.end method
