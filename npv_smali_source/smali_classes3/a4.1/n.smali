.class final La4/n;
.super LO3/a$a;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, LO3/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic b(Landroid/content/Context;Landroid/os/Looper;LQ3/d;Ljava/lang/Object;LP3/c;LP3/h;)LO3/a$f;
    .locals 6

    check-cast p4, LO3/a$d$a;

    new-instance p4, La4/d;

    move-object v0, p4

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, La4/d;-><init>(Landroid/content/Context;Landroid/os/Looper;LQ3/d;LP3/c;LP3/h;)V

    return-object p4
.end method
