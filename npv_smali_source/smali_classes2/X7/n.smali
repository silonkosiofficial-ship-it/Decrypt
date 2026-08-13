.class public final LX7/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr8/g;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lr8/g$a;
    .locals 1

    sget-object v0, Lr8/g$a;->E:Lr8/g$a;

    return-object v0
.end method

.method public b(LO7/a;LO7/a;LO7/e;)Lr8/g$b;
    .locals 1

    .prologue
    const-string p3, "superDescriptor"

    invoke-static {p1, p3}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "subDescriptor"

    invoke-static {p2, p3}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p3, p2, LO7/U;

    if-eqz p3, :cond_5

    instance-of p3, p1, LO7/U;

    if-nez p3, :cond_0

    goto :goto_1

    :cond_0
    check-cast p2, LO7/U;

    invoke-interface {p2}, LO7/I;->getName()Ln8/f;

    move-result-object p3

    check-cast p1, LO7/U;

    invoke-interface {p1}, LO7/I;->getName()Ln8/f;

    move-result-object v0

    invoke-static {p3, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_1

    sget-object p1, Lr8/g$b;->F:Lr8/g$b;

    return-object p1

    :cond_1
    invoke-static {p2}, Lb8/c;->a(LO7/U;)Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-static {p1}, Lb8/c;->a(LO7/U;)Z

    move-result p3

    if-eqz p3, :cond_2

    sget-object p1, Lr8/g$b;->C:Lr8/g$b;

    return-object p1

    :cond_2
    invoke-static {p2}, Lb8/c;->a(LO7/U;)Z

    move-result p2

    if-nez p2, :cond_4

    invoke-static {p1}, Lb8/c;->a(LO7/U;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    sget-object p1, Lr8/g$b;->F:Lr8/g$b;

    return-object p1

    :cond_4
    :goto_0
    sget-object p1, Lr8/g$b;->E:Lr8/g$b;

    return-object p1

    :cond_5
    :goto_1
    sget-object p1, Lr8/g$b;->F:Lr8/g$b;

    return-object p1
.end method
