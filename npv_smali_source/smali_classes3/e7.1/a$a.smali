.class public final Le7/a$a;
.super Ljava/io/InputStream;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le7/a;->a(Lio/ktor/utils/io/d;LW8/z0;)Ljava/io/InputStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic C:Lio/ktor/utils/io/d;


# direct methods
.method constructor <init>(Lio/ktor/utils/io/d;)V
    .locals 0

    iput-object p1, p0, Le7/a$a;->C:Lio/ktor/utils/io/d;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 3

    new-instance v0, Le7/a$a$a;

    iget-object v1, p0, Le7/a$a;->C:Lio/ktor/utils/io/d;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Le7/a$a$a;-><init>(Lio/ktor/utils/io/d;Lm7/e;)V

    const/4 v1, 0x1

    invoke-static {v2, v0, v1, v2}, LW8/g;->f(Lm7/i;Lx7/p;ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    iget-object v0, p0, Le7/a$a;->C:Lio/ktor/utils/io/d;

    invoke-static {v0}, Lio/ktor/utils/io/e;->a(Lio/ktor/utils/io/d;)V

    return-void
.end method

.method public read()I
    .locals 2

    .prologue
    iget-object v0, p0, Le7/a$a;->C:Lio/ktor/utils/io/d;

    invoke-interface {v0}, Lio/ktor/utils/io/d;->h()Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Le7/a$a;->C:Lio/ktor/utils/io/d;

    invoke-interface {v0}, Lio/ktor/utils/io/d;->d()Lo9/q;

    move-result-object v0

    invoke-interface {v0}, Lo9/q;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Le7/a$a;->a()V

    :cond_1
    iget-object v0, p0, Le7/a$a;->C:Lio/ktor/utils/io/d;

    invoke-interface {v0}, Lio/ktor/utils/io/d;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    :cond_2
    iget-object v0, p0, Le7/a$a;->C:Lio/ktor/utils/io/d;

    invoke-interface {v0}, Lio/ktor/utils/io/d;->d()Lo9/q;

    move-result-object v0

    invoke-interface {v0}, Lo9/q;->m()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public read([BII)I
    .locals 2

    .prologue
    const-string v0, "b"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le7/a$a;->C:Lio/ktor/utils/io/d;

    invoke-interface {v0}, Lio/ktor/utils/io/d;->h()Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Le7/a$a;->C:Lio/ktor/utils/io/d;

    invoke-interface {v0}, Lio/ktor/utils/io/d;->d()Lo9/q;

    move-result-object v0

    invoke-interface {v0}, Lo9/q;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Le7/a$a;->a()V

    :cond_1
    iget-object v0, p0, Le7/a$a;->C:Lio/ktor/utils/io/d;

    invoke-static {v0}, Lio/ktor/utils/io/f;->c(Lio/ktor/utils/io/d;)I

    move-result v0

    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    move-result p3

    iget-object v0, p0, Le7/a$a;->C:Lio/ktor/utils/io/d;

    invoke-interface {v0}, Lio/ktor/utils/io/d;->d()Lo9/q;

    move-result-object v0

    add-int/2addr p3, p2

    invoke-interface {v0, p1, p2, p3}, Lo9/q;->V([BII)I

    move-result p1

    if-ltz p1, :cond_2

    return p1

    :cond_2
    iget-object p1, p0, Le7/a$a;->C:Lio/ktor/utils/io/d;

    invoke-interface {p1}, Lio/ktor/utils/io/d;->h()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    return v1
.end method
