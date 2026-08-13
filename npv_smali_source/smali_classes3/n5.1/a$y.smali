.class final Ln5/a$y;
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
    name = "y"
.end annotation


# static fields
.field static final a:Ln5/a$y;

.field private static final b:Lz5/c;

.field private static final c:Lz5/c;

.field private static final d:Lz5/c;

.field private static final e:Lz5/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln5/a$y;

    invoke-direct {v0}, Ln5/a$y;-><init>()V

    sput-object v0, Ln5/a$y;->a:Ln5/a$y;

    const-string v0, "platform"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$y;->b:Lz5/c;

    const-string v0, "version"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$y;->c:Lz5/c;

    const-string v0, "buildVersion"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$y;->d:Lz5/c;

    const-string v0, "jailbroken"

    invoke-static {v0}, Lz5/c;->d(Ljava/lang/String;)Lz5/c;

    move-result-object v0

    sput-object v0, Ln5/a$y;->e:Lz5/c;

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

    check-cast p1, Ln5/F$e$e;

    check-cast p2, Lz5/e;

    invoke-virtual {p0, p1, p2}, Ln5/a$y;->b(Ln5/F$e$e;Lz5/e;)V

    return-void
.end method

.method public b(Ln5/F$e$e;Lz5/e;)V
    .locals 2

    sget-object v0, Ln5/a$y;->b:Lz5/c;

    invoke-virtual {p1}, Ln5/F$e$e;->c()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lz5/e;->b(Lz5/c;I)Lz5/e;

    sget-object v0, Ln5/a$y;->c:Lz5/c;

    invoke-virtual {p1}, Ln5/F$e$e;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, Ln5/a$y;->d:Lz5/c;

    invoke-virtual {p1}, Ln5/F$e$e;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lz5/e;->g(Lz5/c;Ljava/lang/Object;)Lz5/e;

    sget-object v0, Ln5/a$y;->e:Lz5/c;

    invoke-virtual {p1}, Ln5/F$e$e;->e()Z

    move-result p1

    invoke-interface {p2, v0, p1}, Lz5/e;->d(Lz5/c;Z)Lz5/e;

    return-void
.end method
