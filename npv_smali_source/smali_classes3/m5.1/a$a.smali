.class final Lm5/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz5/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field static final a:Lm5/a$a;

.field private static final b:Lz5/c;

.field private static final c:Lz5/c;

.field private static final d:Lz5/c;

.field private static final e:Lz5/c;

.field private static final f:Lz5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm5/a$a;

    invoke-direct {v0}, Lm5/a$a;-><init>()V

    sput-object v0, Lm5/a$a;->a:Lm5/a$a;

    const-string v0, "rolloutId"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Lm5/a$a;->b:Lz5/c;

    const-string v0, "parameterKey"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Lm5/a$a;->c:Lz5/c;

    const-string v0, "parameterValue"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Lm5/a$a;->d:Lz5/c;

    const-string v0, "variantId"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Lm5/a$a;->e:Lz5/c;

    const-string v0, "templateVersion"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Lm5/a$a;->f:Lz5/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lm5/i;

    check-cast p2, Lz5/e;

    invoke-virtual {p0, p1, p2}, Lm5/a$a;->b(Lm5/i;Lz5/e;)V

    return-void
.end method

.method public b(Lm5/i;Lz5/e;)V
    .locals 3

    sget-object v0, Lm5/a$a;->b:Lz5/c;

    invoke-virtual {p1}, Lm5/i;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, Lm5/a$a;->c:Lz5/c;

    invoke-virtual {p1}, Lm5/i;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, Lm5/a$a;->d:Lz5/c;

    invoke-virtual {p1}, Lm5/i;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, Lm5/a$a;->e:Lz5/c;

    invoke-virtual {p1}, Lm5/i;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, Lm5/a$a;->f:Lz5/c;

    invoke-virtual {p1}, Lm5/i;->f()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lz5/e;->a(Lz5/c;J)Lz5/e;

    return-void
.end method
