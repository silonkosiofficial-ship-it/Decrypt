.class public abstract Ln5/F;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln5/F$e;,
        Ln5/F$d;,
        Ln5/F$b;,
        Ln5/F$a;,
        Ln5/F$c;
    }
.end annotation


# static fields
.field private static final a:Ljava/nio/charset/Charset;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Ln5/F;->a:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a()Ljava/nio/charset/Charset;
    .locals 1

    sget-object v0, Ln5/F;->a:Ljava/nio/charset/Charset;

    return-object v0
.end method

.method public static b()Ln5/F$b;
    .locals 1

    new-instance v0, Ln5/b$b;

    invoke-direct {v0}, Ln5/b$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract c()Ln5/F$a;
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()Ljava/lang/String;
.end method

.method public abstract f()Ljava/lang/String;
.end method

.method public abstract g()Ljava/lang/String;
.end method

.method public abstract h()Ljava/lang/String;
.end method

.method public abstract i()Ljava/lang/String;
.end method

.method public abstract j()Ljava/lang/String;
.end method

.method public abstract k()Ln5/F$d;
.end method

.method public abstract l()I
.end method

.method public abstract m()Ljava/lang/String;
.end method

.method public abstract n()Ln5/F$e;
.end method

.method protected abstract o()Ln5/F$b;
.end method

.method public p(Ljava/lang/String;)Ln5/F;
    .locals 2

    .prologue
    invoke-virtual {p0}, Ln5/F;->o()Ln5/F$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Ln5/F$b;->c(Ljava/lang/String;)Ln5/F$b;

    move-result-object v0

    invoke-virtual {p0}, Ln5/F;->n()Ln5/F$e;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ln5/F;->n()Ln5/F$e;

    move-result-object v1

    invoke-virtual {v1, p1}, Ln5/F$e;->p(Ljava/lang/String;)Ln5/F$e;

    move-result-object p1

    invoke-virtual {v0, p1}, Ln5/F$b;->m(Ln5/F$e;)Ln5/F$b;

    :cond_0
    invoke-virtual {v0}, Ln5/F$b;->a()Ln5/F;

    move-result-object p1

    return-object p1
.end method

.method public q(Ln5/F$a;)Ln5/F;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    move-object p1, p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ln5/F;->o()Ln5/F$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Ln5/F$b;->b(Ln5/F$a;)Ln5/F$b;

    move-result-object p1

    invoke-virtual {p1}, Ln5/F$b;->a()Ln5/F;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public r(Ljava/util/List;)Ln5/F;
    .locals 2

    .prologue
    invoke-virtual {p0}, Ln5/F;->n()Ln5/F$e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ln5/F;->o()Ln5/F$b;

    move-result-object v0

    invoke-virtual {p0}, Ln5/F;->n()Ln5/F$e;

    move-result-object v1

    invoke-virtual {v1, p1}, Ln5/F$e;->q(Ljava/util/List;)Ln5/F$e;

    move-result-object p1

    invoke-virtual {v0, p1}, Ln5/F$b;->m(Ln5/F$e;)Ln5/F$b;

    move-result-object p1

    invoke-virtual {p1}, Ln5/F$b;->a()Ln5/F;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Reports without sessions cannot have events added to them."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public s(Ljava/lang/String;)Ln5/F;
    .locals 1

    invoke-virtual {p0}, Ln5/F;->o()Ln5/F$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Ln5/F$b;->f(Ljava/lang/String;)Ln5/F$b;

    move-result-object p1

    invoke-virtual {p1}, Ln5/F$b;->a()Ln5/F;

    move-result-object p1

    return-object p1
.end method

.method public t(Ljava/lang/String;)Ln5/F;
    .locals 1

    invoke-virtual {p0}, Ln5/F;->o()Ln5/F$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Ln5/F$b;->g(Ljava/lang/String;)Ln5/F$b;

    move-result-object p1

    invoke-virtual {p1}, Ln5/F$b;->a()Ln5/F;

    move-result-object p1

    return-object p1
.end method

.method public u(Ln5/F$d;)Ln5/F;
    .locals 2

    invoke-virtual {p0}, Ln5/F;->o()Ln5/F$b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ln5/F$b;->m(Ln5/F$e;)Ln5/F$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Ln5/F$b;->j(Ln5/F$d;)Ln5/F$b;

    move-result-object p1

    invoke-virtual {p1}, Ln5/F$b;->a()Ln5/F;

    move-result-object p1

    return-object p1
.end method

.method public v(JZLjava/lang/String;)Ln5/F;
    .locals 2

    .prologue
    invoke-virtual {p0}, Ln5/F;->o()Ln5/F$b;

    move-result-object v0

    invoke-virtual {p0}, Ln5/F;->n()Ln5/F$e;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ln5/F;->n()Ln5/F$e;

    move-result-object v1

    invoke-virtual {v1, p1, p2, p3, p4}, Ln5/F$e;->r(JZLjava/lang/String;)Ln5/F$e;

    move-result-object p1

    invoke-virtual {v0, p1}, Ln5/F$b;->m(Ln5/F$e;)Ln5/F$b;

    :cond_0
    invoke-virtual {v0}, Ln5/F$b;->a()Ln5/F;

    move-result-object p1

    return-object p1
.end method
