.class public abstract Li9/A;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Li7/n;

.field private static final b:Li7/n;

.field private static final c:Li9/v;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    sget-object v0, Li9/A$a;->D:Li9/A$a;

    invoke-static {v0}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object v0

    sput-object v0, Li9/A;->a:Li7/n;

    sget-object v0, Li9/A$b;->D:Li9/A$b;

    invoke-static {v0}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object v0

    sput-object v0, Li9/A;->b:Li7/n;

    new-instance v0, Li9/v;

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Li9/v;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILy7/k;)V

    sput-object v0, Li9/A;->c:Li9/v;

    return-void
.end method

.method public static final synthetic a()Li9/v;
    .locals 1

    sget-object v0, Li9/A;->c:Li9/v;

    return-object v0
.end method

.method public static final b()Li9/n;
    .locals 1

    sget-object v0, Li9/A;->a:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li9/n;

    return-object v0
.end method

.method public static final c()Li9/n;
    .locals 1

    sget-object v0, Li9/A;->b:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li9/n;

    return-object v0
.end method

.method public static final d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Lh9/c;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Can not create a "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " from the given input: the field "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " is missing"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lh9/c;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final e(Li9/o$a;Li9/K;)V
    .locals 3

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "padding"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Li9/c;

    if-eqz v0, :cond_0

    check-cast p0, Li9/c;

    new-instance v0, Lk9/e;

    new-instance v1, Li9/c0;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Li9/c0;-><init>(Li9/K;Z)V

    invoke-direct {v0, v1}, Lk9/e;-><init>(Lk9/l;)V

    invoke-interface {p0, v0}, Li9/c;->v(Lk9/o;)V

    :cond_0
    return-void
.end method

.method public static final f(Li9/o$a;I)V
    .locals 3

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Li9/c;

    if-eqz v0, :cond_0

    check-cast p0, Li9/c;

    new-instance v0, Lk9/e;

    new-instance v1, Li9/L;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Li9/L;-><init>(IZ)V

    invoke-direct {v0, v1}, Lk9/e;-><init>(Lk9/l;)V

    invoke-interface {p0, v0}, Li9/c;->v(Lk9/o;)V

    :cond_0
    return-void
.end method
