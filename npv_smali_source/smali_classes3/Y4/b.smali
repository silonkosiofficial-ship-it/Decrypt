.class public final LY4/b;
.super LV4/c;
.source "SourceFile"


# static fields
.field private static final d:Ljava/lang/String;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:J

.field private final c:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "Y4.b"

    sput-object v0, LY4/b;->d:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;J)V
    .locals 7

    new-instance v0, LZ4/a$a;

    invoke-direct {v0}, LZ4/a$a;-><init>()V

    invoke-virtual {v0}, LZ4/a$a;->a()J

    move-result-wide v5

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    invoke-direct/range {v1 .. v6}, LY4/b;-><init>(Ljava/lang/String;JJ)V

    return-void
.end method

.method constructor <init>(Ljava/lang/String;JJ)V
    .locals 0

    invoke-direct {p0}, LV4/c;-><init>()V

    invoke-static {p1}, LQ3/p;->f(Ljava/lang/String;)Ljava/lang/String;

    iput-object p1, p0, LY4/b;->a:Ljava/lang/String;

    iput-wide p2, p0, LY4/b;->c:J

    iput-wide p4, p0, LY4/b;->b:J

    return-void
.end method

.method public static c(LY4/a;)LY4/b;
    .locals 5

    .prologue
    invoke-static {p0}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    invoke-virtual {p0}, LY4/a;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "s"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const-wide v2, 0x408f400000000000L    # 1000.0

    mul-double/2addr v0, v2

    double-to-long v0, v0

    goto :goto_0

    :catch_0
    invoke-virtual {p0}, LY4/a;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LZ4/c;->b(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "iat"

    invoke-static {v0, v1}, LY4/b;->g(Ljava/util/Map;Ljava/lang/String;)J

    move-result-wide v1

    const-string v3, "exp"

    invoke-static {v0, v3}, LY4/b;->g(Ljava/util/Map;Ljava/lang/String;)J

    move-result-wide v3

    sub-long/2addr v3, v1

    const-wide/16 v0, 0x3e8

    mul-long/2addr v0, v3

    :goto_0
    new-instance v2, LY4/b;

    invoke-virtual {p0}, LY4/a;->c()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, p0, v0, v1}, LY4/b;-><init>(Ljava/lang/String;J)V

    return-object v2
.end method

.method public static d(Ljava/lang/String;)LY4/b;
    .locals 13

    invoke-static {p0}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, LZ4/c;->b(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "iat"

    invoke-static {v0, v1}, LY4/b;->g(Ljava/util/Map;Ljava/lang/String;)J

    move-result-wide v1

    const-string v3, "exp"

    invoke-static {v0, v3}, LY4/b;->g(Ljava/util/Map;Ljava/lang/String;)J

    move-result-wide v3

    sub-long/2addr v3, v1

    const-wide/16 v5, 0x3e8

    mul-long v9, v3, v5

    new-instance v0, LY4/b;

    mul-long v11, v1, v5

    move-object v7, v0

    move-object v8, p0

    invoke-direct/range {v7 .. v12}, LY4/b;-><init>(Ljava/lang/String;JJ)V

    return-object v0
.end method

.method static e(Ljava/lang/String;)LY4/b;
    .locals 7

    .prologue
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p0, "token"

    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string p0, "receivedAt"

    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v5

    const-string p0, "expiresIn"

    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v3

    new-instance p0, LY4/b;

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, LY4/b;-><init>(Ljava/lang/String;JJ)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    sget-object v0, LY4/b;->d:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not deserialize token: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    nop

    const/4 p0, 0x0

    return-object p0
.end method

.method private static g(Ljava/util/Map;Ljava/lang/String;)J
    .locals 0

    .prologue
    invoke-static {p0}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, LQ3/p;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    if-nez p0, :cond_0

    const-wide/16 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Integer;->longValue()J

    move-result-wide p0

    :goto_0
    return-wide p0
.end method


# virtual methods
.method public a()J
    .locals 4

    iget-wide v0, p0, LY4/b;->b:J

    iget-wide v2, p0, LY4/b;->c:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LY4/b;->a:Ljava/lang/String;

    return-object v0
.end method

.method f()J
    .locals 2

    iget-wide v0, p0, LY4/b;->c:J

    return-wide v0
.end method

.method h()J
    .locals 2

    iget-wide v0, p0, LY4/b;->b:J

    return-wide v0
.end method

.method i()Ljava/lang/String;
    .locals 4

    .prologue
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "token"

    iget-object v2, p0, LY4/b;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "receivedAt"

    iget-wide v2, p0, LY4/b;->b:J

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "expiresIn"

    iget-wide v2, p0, LY4/b;->c:J

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    sget-object v1, LY4/b;->d:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Could not serialize token: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    nop

    const/4 v0, 0x0

    return-object v0
.end method
