.class final Lj4/b;
.super LO3/a$a;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, LO3/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Landroid/content/Context;Landroid/os/Looper;LQ3/d;Ljava/lang/Object;LO3/f$a;LO3/f$b;)LO3/a$f;
    .locals 8

    check-cast p4, Lj4/a;

    new-instance p4, Lk4/a;

    const/4 v3, 0x1

    invoke-static {p3}, Lk4/a;->m0(LQ3/d;)Landroid/os/Bundle;

    move-result-object v5

    move-object v0, p4

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lk4/a;-><init>(Landroid/content/Context;Landroid/os/Looper;ZLQ3/d;Landroid/os/Bundle;LO3/f$a;LO3/f$b;)V

    return-object p4
.end method
