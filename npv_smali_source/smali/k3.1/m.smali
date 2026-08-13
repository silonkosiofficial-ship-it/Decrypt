.class public final Lk3/m;
.super Lk3/b;
.source "SourceFile"


# instance fields
.field private final e:Lk3/u;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Lk3/b;Lk3/u;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lk3/b;-><init>(ILjava/lang/String;Ljava/lang/String;Lk3/b;)V

    iput-object p5, p0, Lk3/m;->e:Lk3/u;

    return-void
.end method


# virtual methods
.method public final e()Lorg/json/JSONObject;
    .locals 3

    .prologue
    invoke-super {p0}, Lk3/b;->e()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {p0}, Lk3/m;->f()Lk3/u;

    move-result-object v1

    const-string v2, "Response Info"

    if-nez v1, :cond_0

    const-string v1, "null"

    :goto_0
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Lk3/u;->g()Lorg/json/JSONObject;

    move-result-object v1

    goto :goto_0

    :goto_1
    return-object v0
.end method

.method public f()Lk3/u;
    .locals 1

    iget-object v0, p0, Lk3/m;->e:Lk3/u;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    :try_start_0
    invoke-virtual {p0}, Lk3/b;->e()Lorg/json/JSONObject;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->toString(I)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "Error forming toString output."

    :goto_0
    return-object v0
.end method
