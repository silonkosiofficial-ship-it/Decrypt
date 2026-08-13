.class public abstract LM8/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM8/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM8/r$a;,
        LM8/r$b;,
        LM8/r$c;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lx7/l;

.field private final c:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lx7/l;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM8/r;->a:Ljava/lang/String;

    iput-object p2, p0, LM8/r;->b:Lx7/l;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "must return "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LM8/r;->c:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lx7/l;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LM8/r;-><init>(Ljava/lang/String;Lx7/l;)V

    return-void
.end method


# virtual methods
.method public a(LO7/y;)Z
    .locals 2

    const-string v0, "functionDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LO7/a;->l()LF8/E;

    move-result-object v0

    iget-object v1, p0, LM8/r;->b:Lx7/l;

    invoke-static {p1}, Lv8/c;->j(LO7/m;)LL7/g;

    move-result-object p1

    invoke-interface {v1, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public b(LO7/y;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, LM8/f$a;->a(LM8/f;LO7/y;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LM8/r;->c:Ljava/lang/String;

    return-object v0
.end method
