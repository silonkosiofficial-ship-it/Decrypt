.class public abstract LI6/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lfa/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "io.ktor.client.plugins.defaultTransformers"

    invoke-static {v0}, LZ6/a;->a(Ljava/lang/String;)Lfa/d;

    move-result-object v0

    sput-object v0, LI6/h;->a:Lfa/d;

    return-void
.end method

.method public static final synthetic a(Ljava/lang/Long;J)V
    .locals 0

    invoke-static {p0, p1, p2}, LI6/h;->c(Ljava/lang/Long;J)V

    return-void
.end method

.method public static final synthetic b()Lfa/d;
    .locals 1

    sget-object v0, LI6/h;->a:Lfa/d;

    return-object v0
.end method

.method private static final c(Ljava/lang/Long;J)V
    .locals 2

    .prologue
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    cmp-long v0, v0, p1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Content-Length mismatch: expected "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " bytes, but received "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " bytes"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public static final d(LC6/c;)V
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LC6/c;->D()LO6/g;

    move-result-object v0

    sget-object v1, LO6/g;->g:LO6/g$a;

    invoke-virtual {v1}, LO6/g$a;->b()La7/i;

    move-result-object v1

    new-instance v2, LI6/h$a;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, LI6/h$a;-><init>(Lm7/e;)V

    invoke-virtual {v0, v1, v2}, La7/d;->l(La7/i;Lx7/q;)V

    invoke-virtual {p0}, LC6/c;->H()LQ6/f;

    move-result-object v0

    sget-object v1, LQ6/f;->g:LQ6/f$a;

    invoke-virtual {v1}, LQ6/f$a;->a()La7/i;

    move-result-object v1

    new-instance v2, LI6/h$b;

    invoke-direct {v2, p0, v3}, LI6/h$b;-><init>(LC6/c;Lm7/e;)V

    invoke-virtual {v0, v1, v2}, La7/d;->l(La7/i;Lx7/q;)V

    invoke-static {p0}, LI6/j;->b(LC6/c;)V

    return-void
.end method
