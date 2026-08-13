.class final Lf4/e1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/app/Application;

.field private final b:Lf4/q;


# direct methods
.method constructor <init>(Landroid/app/Application;Lf4/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/e1;->a:Landroid/app/Application;

    iput-object p2, p0, Lf4/e1;->b:Lf4/q;

    return-void
.end method

.method static bridge synthetic a(Lf4/e1;)Landroid/app/Application;
    .locals 0

    iget-object p0, p0, Lf4/e1;->a:Landroid/app/Application;

    return-object p0
.end method

.method static bridge synthetic b(Lf4/e1;)Lf4/q;
    .locals 0

    iget-object p0, p0, Lf4/e1;->b:Lf4/q;

    return-object p0
.end method


# virtual methods
.method final c(Landroid/app/Activity;LL4/d;)Lf4/m0;
    .locals 7

    .prologue
    invoke-virtual {p2}, LL4/d;->a()LL4/a;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lf4/e1;->a:Landroid/app/Application;

    new-instance v1, LL4/a$a;

    invoke-direct {v1, v0}, LL4/a$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, LL4/a$a;->a()LL4/a;

    move-result-object v0

    :cond_0
    move-object v4, v0

    new-instance v0, Lf4/i1;

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v5, p2

    invoke-direct/range {v1 .. v6}, Lf4/i1;-><init>(Lf4/e1;Landroid/app/Activity;LL4/a;LL4/d;Lf4/f1;)V

    invoke-static {v0}, Lf4/i1;->a(Lf4/i1;)Lf4/m0;

    move-result-object p1

    return-object p1
.end method
