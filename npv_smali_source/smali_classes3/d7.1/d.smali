.class public abstract Ld7/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lo9/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo9/a;

    invoke-direct {v0}, Lo9/a;-><init>()V

    sput-object v0, Ld7/d;->a:Lo9/q;

    return-void
.end method

.method public static final a([BII)Lo9/q;
    .locals 1

    const-string v0, "array"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lo9/a;

    invoke-direct {v0}, Lo9/a;-><init>()V

    add-int/2addr p2, p1

    invoke-virtual {v0, p0, p1, p2}, Lo9/a;->write([BII)V

    return-object v0
.end method

.method public static synthetic b([BIIILjava/lang/Object;)Lo9/q;
    .locals 0

    .prologue
    and-int/lit8 p4, p3, 0x2

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_1

    array-length p2, p0

    :cond_1
    invoke-static {p0, p1, p2}, Ld7/d;->a([BII)Lo9/q;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lo9/q;)Lo9/q;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lo9/q;->d()Lo9/a;

    move-result-object p0

    invoke-virtual {p0}, Lo9/a;->g()Lo9/a;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lo9/q;)J
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lo9/q;->d()Lo9/a;

    move-result-object p0

    invoke-virtual {p0}, Lo9/a;->r()J

    move-result-wide v0

    return-wide v0
.end method

.method public static final e(Lo9/q;Lx7/l;)V
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-interface {p0}, Lo9/q;->j()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p0}, Lo9/q;->d()Lo9/a;

    move-result-object v0

    invoke-interface {p1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    :cond_1
    return-void
.end method
