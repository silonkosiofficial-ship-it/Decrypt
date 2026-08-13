.class public abstract Ly9/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly9/b$a;
    }
.end annotation


# static fields
.field public static final d:Ly9/b$a;


# instance fields
.field private final a:Ly9/g;

.field private final b:LA9/b;

.field private final c:Lz9/z;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly9/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ly9/b$a;-><init>(Ly7/k;)V

    sput-object v0, Ly9/b;->d:Ly9/b$a;

    return-void
.end method

.method private constructor <init>(Ly9/g;LA9/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly9/b;->a:Ly9/g;

    iput-object p2, p0, Ly9/b;->b:LA9/b;

    new-instance p1, Lz9/z;

    invoke-direct {p1}, Lz9/z;-><init>()V

    iput-object p1, p0, Ly9/b;->c:Lz9/z;

    return-void
.end method

.method public synthetic constructor <init>(Ly9/g;LA9/b;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ly9/b;-><init>(Ly9/g;LA9/b;)V

    return-void
.end method


# virtual methods
.method public final a(Lt9/a;Ly9/i;)Ljava/lang/Object;
    .locals 1

    const-string v0, "deserializer"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p2, p1}, Lz9/f0;->a(Ly9/b;Ly9/i;Lt9/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lt9/a;Ljava/lang/String;)Ljava/lang/Object;
    .locals 7

    const-string v0, "deserializer"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "string"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p2}, Lz9/c0;->a(Ly9/b;Ljava/lang/String;)Lz9/b0;

    move-result-object p2

    new-instance v0, Lz9/Y;

    sget-object v3, Lz9/i0;->E:Lz9/i0;

    invoke-interface {p1}, Lt9/a;->a()Lv9/f;

    move-result-object v5

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p0

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, Lz9/Y;-><init>(Ly9/b;Lz9/i0;Lz9/a;Lv9/f;Lz9/Y$a;)V

    invoke-virtual {v0, p1}, Lz9/Y;->x(Lt9/a;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2}, Lz9/a;->w()V

    return-object p1
.end method

.method public final c(Lt9/e;Ljava/lang/Object;)Ly9/i;
    .locals 1

    const-string v0, "serializer"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p2, p1}, Lz9/h0;->d(Ly9/b;Ljava/lang/Object;Lt9/e;)Ly9/i;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lt9/e;Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .prologue
    const-string v0, "serializer"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lz9/O;

    invoke-direct {v0}, Lz9/O;-><init>()V

    :try_start_0
    invoke-static {p0, v0, p1, p2}, Lz9/N;->a(Ly9/b;Lz9/A;Lt9/e;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lz9/O;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lz9/O;->h()V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Lz9/O;->h()V

    throw p1
.end method

.method public final e()Ly9/g;
    .locals 1

    iget-object v0, p0, Ly9/b;->a:Ly9/g;

    return-object v0
.end method

.method public f()LA9/b;
    .locals 1

    iget-object v0, p0, Ly9/b;->b:LA9/b;

    return-object v0
.end method

.method public final g()Lz9/z;
    .locals 1

    iget-object v0, p0, Ly9/b;->c:Lz9/z;

    return-object v0
.end method

.method public final h(Ljava/lang/String;)Ly9/i;
    .locals 1

    const-string v0, "string"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ly9/q;->a:Ly9/q;

    invoke-virtual {p0, v0, p1}, Ly9/b;->b(Lt9/a;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly9/i;

    return-object p1
.end method
