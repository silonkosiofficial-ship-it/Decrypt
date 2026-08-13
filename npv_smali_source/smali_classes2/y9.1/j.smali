.class public abstract Ly9/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lv9/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Ly7/V;->a:Ly7/V;

    invoke-static {v0}, Lu9/a;->F(Ly7/V;)Lt9/b;

    move-result-object v0

    const-string v1, "kotlinx.serialization.json.JsonUnquotedLiteral"

    invoke-static {v1, v0}, Lx9/G;->a(Ljava/lang/String;Lt9/b;)Lv9/f;

    move-result-object v0

    sput-object v0, Ly9/j;->a:Lv9/f;

    return-void
.end method

.method public static final a(Ljava/lang/Boolean;)Ly9/F;
    .locals 7

    .prologue
    if-nez p0, :cond_0

    sget-object p0, Ly9/A;->INSTANCE:Ly9/A;

    return-object p0

    :cond_0
    new-instance v6, Ly9/w;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Ly9/w;-><init>(Ljava/lang/Object;ZLv9/f;ILy7/k;)V

    return-object v6
.end method

.method public static final b(Ljava/lang/Number;)Ly9/F;
    .locals 7

    .prologue
    if-nez p0, :cond_0

    sget-object p0, Ly9/A;->INSTANCE:Ly9/A;

    return-object p0

    :cond_0
    new-instance v6, Ly9/w;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Ly9/w;-><init>(Ljava/lang/Object;ZLv9/f;ILy7/k;)V

    return-object v6
.end method

.method public static final c(Ljava/lang/String;)Ly9/F;
    .locals 7

    .prologue
    if-nez p0, :cond_0

    sget-object p0, Ly9/A;->INSTANCE:Ly9/A;

    return-object p0

    :cond_0
    new-instance v6, Ly9/w;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Ly9/w;-><init>(Ljava/lang/Object;ZLv9/f;ILy7/k;)V

    return-object v6
.end method

.method public static final d(Ly9/F;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ly9/F;->d()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lz9/e0;->d(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ly9/F;)Ljava/lang/String;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Ly9/A;

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ly9/F;->d()Ljava/lang/String;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final f(Ly9/F;)D
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ly9/F;->d()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    return-wide v0
.end method

.method public static final g(Ly9/F;)F
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ly9/F;->d()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0

    return p0
.end method

.method public static final h()Lv9/f;
    .locals 1

    sget-object v0, Ly9/j;->a:Lv9/f;

    return-object v0
.end method

.method public static final i(Ly9/F;)J
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lz9/b0;

    invoke-virtual {p0}, Ly9/F;->d()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lz9/b0;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lz9/a;->p()J

    move-result-wide v0

    return-wide v0
.end method
