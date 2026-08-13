.class final Ln5/a$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz5/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "k"
.end annotation


# static fields
.field static final a:Ln5/a$k;

.field private static final b:Lz5/c;

.field private static final c:Lz5/c;

.field private static final d:Lz5/c;

.field private static final e:Lz5/c;

.field private static final f:Lz5/c;

.field private static final g:Lz5/c;

.field private static final h:Lz5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln5/a$k;

    invoke-direct {v0}, Ln5/a$k;-><init>()V

    sput-object v0, Ln5/a$k;->a:Ln5/a$k;

    const-string v0, "execution"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$k;->b:Lz5/c;

    const-string v0, "customAttributes"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$k;->c:Lz5/c;

    const-string v0, "internalKeys"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$k;->d:Lz5/c;

    const-string v0, "background"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$k;->e:Lz5/c;

    const-string v0, "currentProcessDetails"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$k;->f:Lz5/c;

    const-string v0, "appProcessDetails"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$k;->g:Lz5/c;

    const-string v0, "uiOrientation"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$k;->h:Lz5/c;

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

    check-cast p1, Ln5/F$e$d$a;

    check-cast p2, Lz5/e;

    invoke-virtual {p0, p1, p2}, Ln5/a$k;->b(Ln5/F$e$d$a;Lz5/e;)V

    return-void
.end method

.method public b(Ln5/F$e$d$a;Lz5/e;)V
    .locals 2

    sget-object v0, Ln5/a$k;->b:Lz5/c;

    invoke-virtual {p1}, Ln5/F$e$d$a;->f()Ln5/F$e$d$a$b;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, Ln5/a$k;->c:Lz5/c;

    invoke-virtual {p1}, Ln5/F$e$d$a;->e()Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, Ln5/a$k;->d:Lz5/c;

    invoke-virtual {p1}, Ln5/F$e$d$a;->g()Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, Ln5/a$k;->e:Lz5/c;

    invoke-virtual {p1}, Ln5/F$e$d$a;->c()Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, Ln5/a$k;->f:Lz5/c;

    invoke-virtual {p1}, Ln5/F$e$d$a;->d()Ln5/F$e$d$a$c;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, Ln5/a$k;->g:Lz5/c;

    invoke-virtual {p1}, Ln5/F$e$d$a;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, Ln5/a$k;->h:Lz5/c;

    invoke-virtual {p1}, Ln5/F$e$d$a;->h()I

    move-result p1

    invoke-interface {p2, v0, p1}, Lz5/e;->b(Lz5/c;I)Lz5/e;

    return-void
.end method
