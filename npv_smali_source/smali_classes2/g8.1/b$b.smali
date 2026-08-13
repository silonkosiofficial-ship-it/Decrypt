.class public final Lg8/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, Lg8/b$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LB8/A;ZZLjava/lang/Boolean;ZLg8/r;Lm8/e;)Lg8/t;
    .locals 6

    .prologue
    const-string v0, "container"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinClassFinder"

    invoke-static {p6, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jvmMetadataVersion"

    invoke-static {p7, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p2, :cond_4

    if-eqz p4, :cond_3

    instance-of p2, p1, LB8/A$a;

    if-eqz p2, :cond_0

    move-object p2, p1

    check-cast p2, LB8/A$a;

    invoke-virtual {p2}, LB8/A$a;->g()Li8/c$c;

    move-result-object v1

    sget-object v2, Li8/c$c;->E:Li8/c$c;

    if-ne v1, v2, :cond_0

    invoke-virtual {p2}, LB8/A$a;->e()Ln8/b;

    move-result-object p1

    const-string p2, "DefaultImpls"

    invoke-static {p2}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object p2

    invoke-virtual {p1, p2}, Ln8/b;->d(Ln8/f;)Ln8/b;

    move-result-object p1

    const-string p2, "createNestedClassId(...)"

    :goto_0
    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p6, p1, p7}, Lg8/s;->b(Lg8/r;Ln8/b;Lm8/e;)Lg8/t;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_4

    instance-of p2, p1, LB8/A$b;

    if-eqz p2, :cond_4

    invoke-virtual {p1}, LB8/A;->c()LO7/a0;

    move-result-object p2

    instance-of p4, p2, Lg8/n;

    if-eqz p4, :cond_1

    check-cast p2, Lg8/n;

    goto :goto_1

    :cond_1
    move-object p2, v0

    :goto_1
    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lg8/n;->f()Lw8/d;

    move-result-object p2

    goto :goto_2

    :cond_2
    move-object p2, v0

    :goto_2
    if-eqz p2, :cond_4

    new-instance p1, Ln8/c;

    invoke-virtual {p2}, Lw8/d;->f()Ljava/lang/String;

    move-result-object v0

    const-string p2, "getInternalName(...)"

    invoke-static {v0, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/16 v1, 0x2f

    const/16 v2, 0x2e

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, LS8/r;->Q(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ln8/c;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object p1

    const-string p2, "topLevel(...)"

    goto :goto_0

    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "isConst should not be null for property (container="

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    if-eqz p3, :cond_8

    instance-of p2, p1, LB8/A$a;

    if-eqz p2, :cond_8

    move-object p2, p1

    check-cast p2, LB8/A$a;

    invoke-virtual {p2}, LB8/A$a;->g()Li8/c$c;

    move-result-object p3

    sget-object p4, Li8/c$c;->J:Li8/c$c;

    if-ne p3, p4, :cond_8

    invoke-virtual {p2}, LB8/A$a;->h()LB8/A$a;

    move-result-object p2

    if-eqz p2, :cond_8

    invoke-virtual {p2}, LB8/A$a;->g()Li8/c$c;

    move-result-object p3

    sget-object p4, Li8/c$c;->D:Li8/c$c;

    if-eq p3, p4, :cond_5

    invoke-virtual {p2}, LB8/A$a;->g()Li8/c$c;

    move-result-object p3

    sget-object p4, Li8/c$c;->F:Li8/c$c;

    if-eq p3, p4, :cond_5

    if-eqz p5, :cond_8

    invoke-virtual {p2}, LB8/A$a;->g()Li8/c$c;

    move-result-object p3

    sget-object p4, Li8/c$c;->E:Li8/c$c;

    if-eq p3, p4, :cond_5

    invoke-virtual {p2}, LB8/A$a;->g()Li8/c$c;

    move-result-object p3

    sget-object p4, Li8/c$c;->H:Li8/c$c;

    if-ne p3, p4, :cond_8

    :cond_5
    invoke-virtual {p2}, LB8/A;->c()LO7/a0;

    move-result-object p1

    instance-of p2, p1, Lg8/v;

    if-eqz p2, :cond_6

    check-cast p1, Lg8/v;

    goto :goto_3

    :cond_6
    move-object p1, v0

    :goto_3
    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lg8/v;->d()Lg8/t;

    move-result-object v0

    :cond_7
    return-object v0

    :cond_8
    instance-of p2, p1, LB8/A$b;

    if-eqz p2, :cond_a

    invoke-virtual {p1}, LB8/A;->c()LO7/a0;

    move-result-object p2

    instance-of p2, p2, Lg8/n;

    if-eqz p2, :cond_a

    invoke-virtual {p1}, LB8/A;->c()LO7/a0;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource"

    invoke-static {p1, p2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lg8/n;

    invoke-virtual {p1}, Lg8/n;->g()Lg8/t;

    move-result-object p2

    if-nez p2, :cond_9

    invoke-virtual {p1}, Lg8/n;->d()Ln8/b;

    move-result-object p1

    invoke-static {p6, p1, p7}, Lg8/s;->b(Lg8/r;Ln8/b;Lm8/e;)Lg8/t;

    move-result-object p2

    :cond_9
    return-object p2

    :cond_a
    return-object v0
.end method
