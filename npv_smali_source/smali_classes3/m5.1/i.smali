.class public abstract Lm5/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lz5/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LB5/d;

    invoke-direct {v0}, LB5/d;-><init>()V

    sget-object v1, Lm5/a;->a:LA5/a;

    invoke-virtual {v0, v1}, LB5/d;->j(LA5/a;)LB5/d;

    move-result-object v0

    invoke-virtual {v0}, LB5/d;->i()Lz5/a;

    move-result-object v0

    sput-object v0, Lm5/i;->a:Lz5/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a(Ljava/lang/String;)Lm5/i;
    .locals 7

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p0, "rolloutId"

    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string p0, "parameterKey"

    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string p0, "parameterValue"

    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string p0, "variantId"

    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string p0, "templateVersion"

    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v5

    invoke-static/range {v1 .. v6}, Lm5/i;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lm5/i;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lm5/i;
    .locals 7

    invoke-static {p2}, Lm5/i;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance p2, Lm5/b;

    move-object v0, p2

    move-object v1, p0

    move-object v2, p1

    move-object v4, p3

    move-wide v5, p4

    invoke-direct/range {v0 .. v6}, Lm5/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    return-object p2
.end method

.method private static i(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x100

    if-le v0, v1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    :cond_0
    return-object p0
.end method


# virtual methods
.method public abstract c()Ljava/lang/String;
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()Ljava/lang/String;
.end method

.method public abstract f()J
.end method

.method public abstract g()Ljava/lang/String;
.end method

.method public h()Ln5/F$e$d$e;
    .locals 3

    invoke-static {}, Ln5/F$e$d$e;->a()Ln5/F$e$d$e$a;

    move-result-object v0

    invoke-static {}, Ln5/F$e$d$e$b;->a()Ln5/F$e$d$e$b$a;

    move-result-object v1

    invoke-virtual {p0}, Lm5/i;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln5/F$e$d$e$b$a;->c(Ljava/lang/String;)Ln5/F$e$d$e$b$a;

    move-result-object v1

    invoke-virtual {p0}, Lm5/i;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln5/F$e$d$e$b$a;->b(Ljava/lang/String;)Ln5/F$e$d$e$b$a;

    move-result-object v1

    invoke-virtual {v1}, Ln5/F$e$d$e$b$a;->a()Ln5/F$e$d$e$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln5/F$e$d$e$a;->d(Ln5/F$e$d$e$b;)Ln5/F$e$d$e$a;

    move-result-object v0

    invoke-virtual {p0}, Lm5/i;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln5/F$e$d$e$a;->b(Ljava/lang/String;)Ln5/F$e$d$e$a;

    move-result-object v0

    invoke-virtual {p0}, Lm5/i;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln5/F$e$d$e$a;->c(Ljava/lang/String;)Ln5/F$e$d$e$a;

    move-result-object v0

    invoke-virtual {p0}, Lm5/i;->f()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ln5/F$e$d$e$a;->e(J)Ln5/F$e$d$e$a;

    move-result-object v0

    invoke-virtual {v0}, Ln5/F$e$d$e$a;->a()Ln5/F$e$d$e;

    move-result-object v0

    return-object v0
.end method
