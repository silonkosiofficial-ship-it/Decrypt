.class final LI3/d;
.super LO3/a$a;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, LO3/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Landroid/content/Context;Landroid/os/Looper;LQ3/d;Ljava/lang/Object;LO3/f$a;LO3/f$b;)LO3/a$f;
    .locals 7

    move-object v4, p4

    check-cast v4, LI3/g;

    new-instance p4, Lc4/f;

    move-object v0, p4

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lc4/f;-><init>(Landroid/content/Context;Landroid/os/Looper;LQ3/d;LI3/g;LO3/f$a;LO3/f$b;)V

    return-object p4
.end method
