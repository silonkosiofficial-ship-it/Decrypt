.class public final LI7/i$c;
.super LI7/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI7/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:LO7/U;

.field private final b:Li8/n;

.field private final c:Ll8/a$d;

.field private final d:Lk8/c;

.field private final e:Lk8/g;

.field private final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(LO7/U;Li8/n;Ll8/a$d;Lk8/c;Lk8/g;)V
    .locals 7

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signature"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {p5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LI7/i;-><init>(Ly7/k;)V

    iput-object p1, p0, LI7/i$c;->a:LO7/U;

    iput-object p2, p0, LI7/i$c;->b:Li8/n;

    iput-object p3, p0, LI7/i$c;->c:Ll8/a$d;

    iput-object p4, p0, LI7/i$c;->d:Lk8/c;

    iput-object p5, p0, LI7/i$c;->e:Lk8/g;

    invoke-virtual {p3}, Ll8/a$d;->G()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3}, Ll8/a$d;->B()Ll8/a$c;

    move-result-object p2

    invoke-virtual {p2}, Ll8/a$c;->x()I

    move-result p2

    invoke-interface {p4, p2}, Lk8/c;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ll8/a$d;->B()Ll8/a$c;

    move-result-object p2

    invoke-virtual {p2}, Ll8/a$c;->w()I

    move-result p2

    invoke-interface {p4, p2}, Lk8/c;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object v0, Lm8/i;->a:Lm8/i;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p2

    move-object v2, p4

    move-object v3, p5

    invoke-static/range {v0 .. v6}, Lm8/i;->d(Lm8/i;Li8/n;Lk8/c;Lk8/g;ZILjava/lang/Object;)Lm8/d$a;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lm8/d$a;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lm8/d$a;->e()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, LX7/A;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, LI7/i$c;->c()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "()"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    iput-object p1, p0, LI7/i$c;->f:Ljava/lang/String;

    return-void

    :cond_1
    new-instance p2, LI7/D;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "No field signature for property: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, LI7/D;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private final c()Ljava/lang/String;
    .locals 4

    .prologue
    iget-object v0, p0, LI7/i$c;->a:LO7/U;

    invoke-interface {v0}, LO7/i0;->b()LO7/m;

    move-result-object v0

    const-string v1, "getContainingDeclaration(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LI7/i$c;->a:LO7/U;

    invoke-interface {v1}, LO7/C;->h()LO7/u;

    move-result-object v1

    sget-object v2, LO7/t;->d:LO7/u;

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/16 v2, 0x24

    if-eqz v1, :cond_2

    instance-of v1, v0, LD8/d;

    if-eqz v1, :cond_2

    check-cast v0, LD8/d;

    invoke-virtual {v0}, LD8/d;->j1()Li8/c;

    move-result-object v0

    sget-object v1, Ll8/a;->i:Lp8/i$f;

    const-string v3, "classModuleName"

    invoke-static {v1, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lk8/e;->a(Lp8/i$d;Lp8/i$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object v1, p0, LI7/i$c;->d:Lk8/c;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-interface {v1, v0}, Lk8/c;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, "main"

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {v0}, Ln8/g;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    iget-object v1, p0, LI7/i$c;->a:LO7/U;

    invoke-interface {v1}, LO7/C;->h()LO7/u;

    move-result-object v1

    sget-object v3, LO7/t;->a:LO7/u;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    instance-of v0, v0, LO7/K;

    if-eqz v0, :cond_3

    iget-object v0, p0, LI7/i$c;->a:LO7/U;

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LD8/j;

    invoke-virtual {v0}, LD8/j;->k0()LD8/f;

    move-result-object v0

    instance-of v1, v0, Lg8/n;

    if-eqz v1, :cond_3

    check-cast v0, Lg8/n;

    invoke-virtual {v0}, Lg8/n;->f()Lw8/d;

    move-result-object v1

    if-eqz v1, :cond_3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lg8/n;->h()Ln8/f;

    move-result-object v0

    invoke-virtual {v0}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    const-string v0, ""

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LI7/i$c;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final b()LO7/U;
    .locals 1

    iget-object v0, p0, LI7/i$c;->a:LO7/U;

    return-object v0
.end method

.method public final d()Lk8/c;
    .locals 1

    iget-object v0, p0, LI7/i$c;->d:Lk8/c;

    return-object v0
.end method

.method public final e()Li8/n;
    .locals 1

    iget-object v0, p0, LI7/i$c;->b:Li8/n;

    return-object v0
.end method

.method public final f()Ll8/a$d;
    .locals 1

    iget-object v0, p0, LI7/i$c;->c:Ll8/a$d;

    return-object v0
.end method

.method public final g()Lk8/g;
    .locals 1

    iget-object v0, p0, LI7/i$c;->e:Lk8/g;

    return-object v0
.end method
