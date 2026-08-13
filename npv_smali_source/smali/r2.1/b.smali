.class public final Lr2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq2/b;


# instance fields
.field private final a:Lr2/c;

.field private final b:Li7/n;


# direct methods
.method public constructor <init>(Lr2/c;)V
    .locals 1

    const-string v0, "supportDriver"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr2/b;->a:Lr2/c;

    sget-object p1, Li7/r;->D:Li7/r;

    new-instance v0, Lr2/b$a;

    invoke-direct {v0, p0}, Lr2/b$a;-><init>(Lr2/b;)V

    invoke-static {p1, v0}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, Lr2/b;->b:Li7/n;

    return-void
.end method

.method private final b()Lr2/d;
    .locals 1

    iget-object v0, p0, Lr2/b;->b:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr2/d;

    return-object v0
.end method


# virtual methods
.method public a(ZLx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0}, Lr2/b;->b()Lr2/d;

    move-result-object p1

    invoke-interface {p2, p1, p3}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final c()Lr2/c;
    .locals 1

    iget-object v0, p0, Lr2/b;->a:Lr2/c;

    return-object v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lr2/b;->a:Lr2/c;

    invoke-virtual {v0}, Lr2/c;->b()Lz2/e;

    move-result-object v0

    invoke-interface {v0}, Lz2/e;->close()V

    return-void
.end method
