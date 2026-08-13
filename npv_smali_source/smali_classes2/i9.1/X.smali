.class public abstract Li9/X;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li9/X$d;
    }
.end annotation


# static fields
.field private static final a:Li7/n;

.field private static final b:Li7/n;

.field private static final c:Li7/n;

.field private static final d:Li9/y;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    sget-object v0, Li9/X$b;->D:Li9/X$b;

    invoke-static {v0}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object v0

    sput-object v0, Li9/X;->a:Li7/n;

    sget-object v0, Li9/X$c;->D:Li9/X$c;

    invoke-static {v0}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object v0

    sput-object v0, Li9/X;->b:Li7/n;

    sget-object v0, Li9/X$a;->D:Li9/X$a;

    invoke-static {v0}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object v0

    sput-object v0, Li9/X;->c:Li7/n;

    new-instance v0, Li9/y;

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Li9/y;-><init>(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILy7/k;)V

    sput-object v0, Li9/X;->d:Li9/y;

    return-void
.end method

.method public static final synthetic a()Li9/y;
    .locals 1

    sget-object v0, Li9/X;->d:Li9/y;

    return-object v0
.end method

.method public static final synthetic b(Li9/o$e;Li9/b0;ZLi9/b0;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Li9/X;->g(Li9/o$e;Li9/b0;ZLi9/b0;)V

    return-void
.end method

.method public static final c()Li9/W;
    .locals 1

    sget-object v0, Li9/X;->c:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li9/W;

    return-object v0
.end method

.method public static final d()Li9/W;
    .locals 1

    sget-object v0, Li9/X;->a:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li9/W;

    return-object v0
.end method

.method public static final e()Li9/W;
    .locals 1

    sget-object v0, Li9/X;->b:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li9/W;

    return-object v0
.end method

.method public static final f(Li9/o$e;ZZLi9/b0;Li9/b0;)V
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "outputMinute"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "outputSecond"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3, p4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-ltz v0, :cond_1

    if-eqz p1, :cond_0

    new-instance p1, Li9/X$e;

    invoke-direct {p1, p3, p2, p4}, Li9/X$e;-><init>(Li9/b0;ZLi9/b0;)V

    const-string p2, "Z"

    invoke-static {p0, p2, p1}, Li9/p;->c(Li9/o;Ljava/lang/String;Lx7/l;)V

    goto :goto_0

    :cond_0
    invoke-static {p0, p3, p2, p4}, Li9/X;->g(Li9/o$e;Li9/b0;ZLi9/b0;)V

    :goto_0
    return-void

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Seconds cannot be included without minutes"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final g(Li9/o$e;Li9/b0;ZLi9/b0;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Li9/o$e$a;->a(Li9/o$e;Li9/K;ILjava/lang/Object;)V

    new-instance v0, Li9/X$f;

    invoke-direct {v0, p2, p3}, Li9/X$f;-><init>(ZLi9/b0;)V

    invoke-static {p0, p1, v0}, Li9/X;->h(Li9/o;Li9/b0;Lx7/l;)V

    return-void
.end method

.method public static final h(Li9/o;Li9/b0;Lx7/l;)V
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whenToOutput"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "format"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li9/X$d;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2, p0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    new-instance p1, Li9/X$g;

    invoke-direct {p1, p2}, Li9/X$g;-><init>(Lx7/l;)V

    const/4 p2, 0x1

    const/4 v0, 0x0

    invoke-static {p0, v0, p1, p2, v0}, Li9/p;->d(Li9/o;Ljava/lang/String;Lx7/l;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method
